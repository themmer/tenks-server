package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.dto.BalanceSheetConsolidated;
import com.tenks.dto.ResponseWrapper;

/**
 * Created by Tim on 7/24/2015.
 */
public interface EdgarBalanceSheetClient {
    ResponseWrapper<BalanceSheetConsolidated> getBalanceSheet(EdgarFinancialRequest edgarFinancialRequest);
}
