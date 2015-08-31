package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.dto.BalanceSheetConsolidated;

/**
 * Created by Tim on 7/24/2015.
 */
public interface EdgarBalanceSheetClient {
    public BalanceSheetConsolidated getBalanceSheet(EdgarFinancialRequest edgarFinancialRequest);
}
