
package com.tenks.server.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tenks.client.rest.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Example resource class hosted at the URI path "/metadata"
 */
@Path("/metadata")
public class MetadataResource {

    private String metaResponse = null;

    /**
     * Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     *
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response Response() {
        // Singleton approach of string
        if (metaResponse == null) {
            Map metaMap = new HashMap<String, Object>();
            EdgarBalanceSheetConsolidatedFields[] balanceSheetEnums = EdgarBalanceSheetConsolidatedFields.values();
            EdgarCashFlowStatementConsolidatedFields[] cashFlowStatementEnums = EdgarCashFlowStatementConsolidatedFields.values();
            EdgarIncomeStatementConsolidatedFields[] incomeStatementEnums = EdgarIncomeStatementConsolidatedFields.values();

            Map balanceSheetConsolidatedMap = new HashMap();
            for (EdgarBalanceSheetConsolidatedFields balanceSheetEnum : balanceSheetEnums) {
                balanceSheetConsolidatedMap.put(balanceSheetEnum.getKeyName(), balanceSheetEnum);
            }
            Map cashFlowStatementConsolidatedMap = new HashMap();
            for (EdgarCashFlowStatementConsolidatedFields cashFlowStatementEnum : cashFlowStatementEnums) {
                cashFlowStatementConsolidatedMap.put(cashFlowStatementEnum.getKeyName(), cashFlowStatementEnum);
            }
            Map incomeStatementConsolidatedMap = new HashMap();
            for (EdgarIncomeStatementConsolidatedFields incomeStatementEnum : incomeStatementEnums) {
                incomeStatementConsolidatedMap.put(incomeStatementEnum.getKeyName(), incomeStatementEnum);
            }

            metaMap.put("balanceSheet", balanceSheetConsolidatedMap);
            metaMap.put("cashFlowStatement", cashFlowStatementConsolidatedMap);
            metaMap.put("incomeStatement", incomeStatementConsolidatedMap);

            // TODO inject Gson if we are okay with registering this factory with all of themS - should be thread safe
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapterFactory(new TenksEnumAdapterFactory());
            Gson gson = gsonBuilder. //
                    serializeNulls(). //
                    create();
            metaResponse = gson.toJson(metaMap);
        }
        return Response.status(200).entity(metaResponse).build();
    }
}