package com.tenks.client.rest.util;

/**
 * Created by Tim on 7/23/2015.
 */
public enum EdgarIncomeStatementConsolidatedFields implements EdgarDisplayType {
    // verbatim fields from edgar online service
    accountingchange("accountingChange", "Accounting Change", "HELP!"),
    basicepsnetincome("basicEpsNetIncome", "Basic EPS Net Income", ""),
    costofrevenue("costOfRevenue", "Cost of Revenue", ""),
    depreciationamortizationexpense("depreciationAmortizationExpense", "Depreciation Amortization Expense", ""),
    dilutedepsnetincome("dilutedEpsNetIncome", "Diluted EPS Net Income", ""),
    discontinuedoperations("discontinuedOperations", "Discontinued Operations", ""),
    ebit("earningsBeforeInterestAndTax", "Earnings Before Income Tax", ""),
    equityearnings("equityEarnings", "Equity Earnings", ""),
    extraordinaryitems("extraOrdinaryItems", "Extraordinary Items", ""),
    grossprofit("grossProfit", "Gross Profit", ""),
    incomebeforeextraordinaryitems("incomeBeforeExtraordinaryItems", "Income Before Extraordinary Items", ""),
    incomebeforetaxes("incomeBeforeTaxes", "Income Before Taxes", ""),
    incometaxes("incomeTaxes", "Income Taxes", ""),
    interestexpense("interestExpense", "Interest Expense", ""),
    interestincome("interestIncome", "Interest Income", ""),
    minorityinterestequityearnings("minorityInterestEquityEarnings", "Minority Interest Equity Earnings", ""),
    netincome("netIncome", "Net Income", ""),
    netincomeapplicabletocommon("netIncomeApplicableToCommon", "Net Income Applicable To Common", ""),
    operatingprofit("operatingProfit", "Operating Profit", ""),
    othernonoperatingincomeexpense("otherNonOperatingIncomeExpense", "Other Non-operating Income Expenses", ""),
    otheroperatingexpenses("otherOperatingExpenses", "Other Operating Expenses", ""),
    researchdevelopmentexpense("researchDevelopmentExpense", "Research Development Expense", ""),
    restructuringremediationimpairmentprovisions("restructuringRemediationImpairmentProvisions", "Restructuring Remediation Imparment Provisions", ""),
    sellinggeneraladministrativeexpenses("sellingGeneralAdministrativeExpenses", "Selling Gernal Adminstrative Expenses", ""),
    totalrevenue("totalRevenue", "Total Revenue", "");

    private final String keyName;
    private String displayName;
    private String helpText;

    EdgarIncomeStatementConsolidatedFields(String keyName, String displayName, String helpText) {
        this.keyName = keyName;
        this.displayName = displayName;
        this.helpText = helpText;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getHelpText() {
        return helpText;
    }

    @Override
    public String getKeyName() {
        return keyName;
    }
}