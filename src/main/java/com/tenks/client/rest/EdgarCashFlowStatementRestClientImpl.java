package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarCashFlowStatementConsolidatedFields;
import com.tenks.dto.BalanceSheetConsolidated;
import com.tenks.dto.CashFlowStatementConsolidated;
import com.tenks.dto.EdgarKeyValueResponse;
import com.tenks.dto.ResponseWrapper;

/**
 * Created by Tim on 8/3/2015.
 */
public class EdgarCashFlowStatementRestClientImpl extends EdgarRestClient<CashFlowStatementConsolidated, EdgarCashFlowStatementConsolidatedFields> implements EdgarCashFlowStatementClient {
    public ResponseWrapper<CashFlowStatementConsolidated> getCashFlowStatement(EdgarFinancialRequest edgarFinancialRequest) {
       ResponseWrapper<CashFlowStatementConsolidated> response = executeCall(edgarFinancialRequest);
        return response;
    }
}
