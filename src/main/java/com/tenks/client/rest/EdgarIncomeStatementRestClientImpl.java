package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarIncomeStatementConsolidatedFields;
import com.tenks.dto.EdgarKeyValueResponse;
import com.tenks.dto.IncomeStatementConsolidated;

/**
 * Created by Tim on 8/3/2015.
 */
public class EdgarIncomeStatementRestClientImpl extends EdgarRestClient<IncomeStatementConsolidated, EdgarIncomeStatementConsolidatedFields> implements EdgarIncomeStatementClient {
    public IncomeStatementConsolidated getIncomeStatement(EdgarFinancialRequest edgarFinancialRequest) {
        IncomeStatementConsolidated incomeStatementConsolidated = executeCall(edgarFinancialRequest);
        return incomeStatementConsolidated;
    }
}
