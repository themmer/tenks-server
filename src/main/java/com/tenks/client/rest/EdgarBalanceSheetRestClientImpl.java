package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarBalanceSheetConsolidatedFields;
import com.tenks.dto.BalanceSheetConsolidated;
import com.tenks.dto.ResponseWrapper;

/**
 * Created by Tim on 8/3/2015.
 */
public class EdgarBalanceSheetRestClientImpl extends EdgarRestClient<BalanceSheetConsolidated, EdgarBalanceSheetConsolidatedFields> implements EdgarBalanceSheetClient {
    public ResponseWrapper<BalanceSheetConsolidated> getBalanceSheet(EdgarFinancialRequest edgarFinancialRequest) {
        ResponseWrapper<BalanceSheetConsolidated> response = executeCall(edgarFinancialRequest);
        return response;
    }
}
