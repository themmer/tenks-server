package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.dto.CashFlowStatementConsolidated;

/**
 * Created by Tim on 7/24/2015.
 */
public interface EdgarCashFlowStatementClient {
    public CashFlowStatementConsolidated getCashFlowStatement(EdgarFinancialRequest edgarFinancialRequest);
}
