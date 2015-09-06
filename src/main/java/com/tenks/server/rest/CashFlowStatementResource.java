
package com.tenks.server.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tenks.client.rest.EdgarCashFlowStatementClient;
import com.tenks.client.rest.EdgarCashFlowStatementRestClientImpl;
import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarFinancialRequestType;
import com.tenks.client.rest.util.TenKsConstants;
import com.tenks.dto.CashFlowStatementConsolidated;
import com.tenks.dto.ResponseWrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/** Example resource class hosted at the URI path "/cashFlow"
 */
@Path("/cashFlow")
public class CashFlowStatementResource {

    private EdgarCashFlowStatementClient edgarCashFlowStatementClient = new EdgarCashFlowStatementRestClientImpl();

    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(@QueryParam(TenKsConstants.SymbolTicker) String symbolTicker) {
        assert (symbolTicker != null);

        EdgarFinancialRequest request = new EdgarFinancialRequest(EdgarFinancialRequestType.CashFlowStatementConsolidated, symbolTicker);
        ResponseWrapper<CashFlowStatementConsolidated> responseWrapper = edgarCashFlowStatementClient.getCashFlowStatement(request);

        // TODO inject Gson - should be thread safe
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder. //
                serializeNulls(). //
                create();
        String jsonString = gson.toJson(responseWrapper);
        System.out.println("gson result: " + jsonString);

        return Response.status(Response.Status.OK).entity(jsonString).build();
    }
}
