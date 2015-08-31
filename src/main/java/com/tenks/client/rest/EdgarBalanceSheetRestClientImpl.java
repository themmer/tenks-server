package com.tenks.client.rest;

import com.tenks.client.rest.dto.EdgarFinancialRequest;
import com.tenks.client.rest.util.EdgarBalanceSheetConsolidatedFields;
import com.tenks.dto.BalanceSheetConsolidated;

/**
 * Created by Tim on 8/3/2015.
 */
public class EdgarBalanceSheetRestClientImpl extends EdgarRestClient<BalanceSheetConsolidated, EdgarBalanceSheetConsolidatedFields> implements EdgarBalanceSheetClient {
    public BalanceSheetConsolidated getBalanceSheet(EdgarFinancialRequest edgarFinancialRequest) {
        BalanceSheetConsolidated balanceSheetConsolidated = executeCall(edgarFinancialRequest);
        return balanceSheetConsolidated;
    }
}
