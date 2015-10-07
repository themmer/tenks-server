package com.tenks.dto;


import com.tenks.client.rest.util.EdgarIncomeStatementConsolidatedFields;

import java.util.EnumSet;
import java.util.Map;

/**
 * Created by Tim on 7/27/2015.
 */
public class IncomeStatementConsolidated extends EdgarKeyValueResponse<EdgarIncomeStatementConsolidatedFields> {

    private String accountingChange;
    private String basicEpsNetIncome;
    private String costOfRevenue;
    private String depreciationAmortizationExpense;
    private String dilutedEpsNetIncome;
    private String discontinuedOperations;
    private String earningsBeforeInterestAndTax;
    private String equityEarnings;
    private String extraOrdinaryItems;
    private String grossProfit;
    private String incomeBeforeExtraordinaryItems;
    private String incomeBeforeTaxes;
    private String incomeTaxes;
    private String interestExpense;
    private String interestIncome;
    private String minorityInterestEquityEarnings;
    private String netIncome;
    private String netIncomeApplicableToCommon;
    private String operatingProfit;
    private String otherNonOperatingIncomeExpense;
    private String otherOperatingExpenses;
    private String researchDevelopmentExpense;
    private String restructuringRemediationImpairmentProvisions;
    private String sellingGeneralAdministrativeExpenses;
    private String totalRevenue;

    public IncomeStatementConsolidated(Map<String, String> keyValueResponseHashMap) {
        populateData(keyValueResponseHashMap);
    }

    @Override
    public Class<EdgarIncomeStatementConsolidatedFields> getEnumType() {
        return EdgarIncomeStatementConsolidatedFields.class;
    }

    @Override
    public String getFieldName(EdgarIncomeStatementConsolidatedFields enumFieldType) {
        return enumFieldType.getKeyName();
    }
}