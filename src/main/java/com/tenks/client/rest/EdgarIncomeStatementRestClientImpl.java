package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarIncomeStatementConsolidatedFields;
import com.tenks.dto.EdgarKeyValueResponse;
import com.tenks.dto.IncomeStatementConsolidated;
import com.tenks.dto.ResponseWrapper;

/**
 * Created by Tim on 8/3/2015.
 */
public class EdgarIncomeStatementRestClientImpl extends EdgarRestClient<IncomeStatementConsolidated, EdgarIncomeStatementConsolidatedFields> implements EdgarIncomeStatementClient {
    public ResponseWrapper<IncomeStatementConsolidated> getIncomeStatement(EdgarFinancialRequest edgarFinancialRequest) {
        ResponseWrapper<IncomeStatementConsolidated> response = executeCall(edgarFinancialRequest);
        return response;
    }
}
