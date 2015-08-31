package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.dto.IncomeStatementConsolidated;

/**
 * Created by Tim on 7/24/2015.
 */
public interface EdgarIncomeStatementClient {
    public IncomeStatementConsolidated getIncomeStatement(EdgarFinancialRequest edgarFinancialRequest);
}
