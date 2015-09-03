package com.tenks.client.rest;

import com.google.gson.*;
import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.*;
import com.tenks.dto.BalanceSheetConsolidated;
import com.tenks.dto.CashFlowStatementConsolidated;
import com.tenks.dto.EdgarKeyValueResponse;
import com.tenks.dto.IncomeStatementConsolidated;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Client service to call Edgar Online Rest Service
 */
public abstract class EdgarRestClient<T extends EdgarKeyValueResponse, E> {

    private WebTarget webTarget;

    public EdgarRestClient() {
        webTarget = ClientBuilder.newClient().target(EdgarConstants.BaseUri);
    }

    protected <T extends EdgarKeyValueResponse> T executeCall(EdgarFinancialRequest edgarFinancialRequest) {
        String jsonResponse = getJsonResponse(edgarFinancialRequest);
        return transformStringToObject(jsonResponse, edgarFinancialRequest.getEdgarFinancialRequestType());
    }

    private String getJsonResponse(EdgarFinancialRequest edgarFinancialRequest) {
        assert (edgarFinancialRequest.getNumberOfPeriods() > 0);
        assert (edgarFinancialRequest.getEdgarFinancialRequestType() != null);

        // TODO check cache otherwise do the following below

        Invocation.Builder request = webTarget. //
                path("v2/corefinancials/ann"). //
                queryParam(EdgarConstants.NumberOfPeriodsParam, String.valueOf(edgarFinancialRequest.getNumberOfPeriods())). //
                queryParam(EdgarConstants.FieldsParam, edgarFinancialRequest.getEdgarFinancialRequestType().getValue()). //
                queryParam(EdgarConstants.TicketSymbolsParam, edgarFinancialRequest.getSymbolTicker()). //
                queryParam(EdgarConstants.AppKeyParam, EdgarConstants.getRandomAppKey()). //
                request(MediaType.APPLICATION_JSON);

        Response clientResponse = request.get();
        if (clientResponse.getStatus() != Response.Status.OK.getStatusCode()) {
            String errorString = clientResponse.readEntity(String.class);
            // TODO handle errors and also log here
            System.out.println(errorString);
            System.out.println(clientResponse.getStatus());
            throw new RuntimeException("An error has occurred while retrieving Edgar Online Data: " + edgarFinancialRequest.toString());
        } else {
            return clientResponse.readEntity(String.class);
        }
    }

    private <T extends EdgarKeyValueResponse> T transformStringToObject(String jsonString, EdgarFinancialRequestType edgarFinancialRequestType) {
        // TODO cache
        System.out.println(jsonString);
        JsonParser jsonParser = new JsonParser();
        JsonElement resultJsonElement = jsonParser.parse(jsonString).getAsJsonObject().get("result");

        if (resultJsonElement == null) {
            // TODO handle errors, for example - too many requests per second
            System.out.println("We have an error!");
            return null;
        } else {
            JsonArray rowsJsonArrayElement = resultJsonElement.getAsJsonObject().getAsJsonArray("rows");
            for (final JsonElement rowJsonElement : rowsJsonArrayElement) {
                JsonArray valuesJsonArray = rowJsonElement.getAsJsonObject().getAsJsonArray("values");

                Map fieldMap = new HashMap();
                for (int i = 0; i < valuesJsonArray.size(); i++) {
                    JsonElement jsonElement = valuesJsonArray.get(i);
                    JsonElement fieldElement = jsonElement.getAsJsonObject().get("field");
                    if (!fieldElement.isJsonNull()) {
                        String field = fieldElement.getAsString();
                        JsonElement valueElement = jsonElement.getAsJsonObject().get("value");
                        String value = null;
                        if (!valueElement.isJsonNull()) {
                            value = valueElement.getAsString();
                        }
                        fieldMap.put(field, value);
                    }
                }

                if (edgarFinancialRequestType == EdgarFinancialRequestType.BalanceSheetConsolidated) {
                    BalanceSheetConsolidated balanceSheetConsolidated = new BalanceSheetConsolidated(fieldMap);
                    return (T)balanceSheetConsolidated;
                } else if (edgarFinancialRequestType == EdgarFinancialRequestType.IncomeStatementConsolidated) {
                    IncomeStatementConsolidated incomeStatementConsolidated = new IncomeStatementConsolidated(fieldMap);
                    return (T)incomeStatementConsolidated;
                } else if (edgarFinancialRequestType == EdgarFinancialRequestType.CashFlowStatementConsolidated) {
                    CashFlowStatementConsolidated cashFlowStatementConsolidated = new CashFlowStatementConsolidated(fieldMap);
                    return (T)cashFlowStatementConsolidated;
                }
            }
        }
        return null;
    }
}