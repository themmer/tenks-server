
package com.tenks.server.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tenks.client.rest.EdgarBalanceSheetClient;
import com.tenks.client.rest.EdgarBalanceSheetRestClientImpl;
import com.tenks.client.rest.EdgarIncomeStatementClient;
import com.tenks.client.rest.EdgarIncomeStatementRestClientImpl;
import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarFinancialRequestType;
import com.tenks.client.rest.util.TenKsConstants;
import com.tenks.dto.IncomeStatementConsolidated;

import javax.validation.constraints.AssertTrue;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/income")
public class IncomeStatementResource {

    private EdgarIncomeStatementClient edgarIncomeStatementClient = new EdgarIncomeStatementRestClientImpl();

    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt(@QueryParam(TenKsConstants.SymbolTicker) String symbolTicker) {
        assert (symbolTicker != null);

        EdgarFinancialRequest request = new EdgarFinancialRequest(EdgarFinancialRequestType.IncomeStatementConsolidated, symbolTicker);
        IncomeStatementConsolidated incomeStatement = edgarIncomeStatementClient.getIncomeStatement(request);

        // TODO inject Gson - should be thread safe
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder. //
                serializeNulls(). //
                create();
        String jsonString = gson.toJson(incomeStatement);
        System.out.println("gson result: "+jsonString);

        return jsonString;
//        return Response.status(200).entity(output).build();
    }
}