package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.dto.CashFlowStatementConsolidated;
import com.tenks.dto.ResponseWrapper;

/**
 * Created by Tim on 7/24/2015.
 */
public interface EdgarCashFlowStatementClient {
    ResponseWrapper<CashFlowStatementConsolidated> getCashFlowStatement(EdgarFinancialRequest edgarFinancialRequest);
}
