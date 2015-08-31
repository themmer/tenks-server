package com.tenks.client.rest.util;

/**
 * Created by Tim on 7/23/2015.
 */
public enum EdgarFinancialRequestType {
    BalanceSheetConsolidated("BalanceSheetConsolidated"),
    IncomeStatementConsolidated("IncomeStatementConsolidated"),
    CashFlowStatementConsolidated("CashFlowStatementConsolidated");

    private final String value;

    EdgarFinancialRequestType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
