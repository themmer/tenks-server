package com.tenks.client.rest.util;

import java.util.EnumMap;

/**
 * Created by Tim on 7/23/2015.
 */
public enum EdgarBalanceSheetConsolidatedFields implements EdgarDisplayType {

    // verbatim fields from edgar online service
    accountspayableandaccruedexpenses("accountsPayableAndAccruedExpenses", "Accounts Payable And Accrued Expenses", ""),
    accruedinterest("accruedInterest", "Accrued Interest", ""),
    additionalpaidincapital("additionalPaidInCapital", "Additional Paid In Capital", ""),
    additionalpaidincapitalpreferredstock("additionalPaidInCapitalPreferredStock", "Additional Paid In Capital Preferred Stock", ""),
    cashandcashequivalents("cashAndCashEquivalents", "Cash and Cash Equivalents", ""),
    cashcashequivalentsandshortterminvestments("cashCashEquivalentsAndShortTermInvestments", "Cash and Cash Equivalents And Short Term Investments", ""),
    commitmentscontingencies("commitmentsContingencies", "Commitments Contingencies", ""),
    commonstock("commonStock", "Common Stock", ""),
    deferredcharges("deferredCharges", "Deferred Charges", ""),
    deferredincometaxescurrent("deferredIncomeTaxesCurrent", "Deferred Income Taxes Current", ""),
    deferredincometaxeslongterm("deferredIncomeTaxesLongTerm", "Deferred Income Taxes Long Term", ""),
    goodwill("goodwill", "Goodwill", ""),
    intangibleassets("intangibleAssets", "Intangible Assets", ""),
    inventoriesnet("inventoriesNet", "Inventories Net", ""),
    longtermdeferredincometaxliabilities("longTermDeferredIncomeTaxLiabilities", "Long Term Deferred Income Tax Liabilities", ""),
    longtermdeferredliabilitycharges("longTermDeferredLiabilityCharges", "Long Term Deferred Liabilities Charges", ""),
    longterminvestments("longTermInvestments", "Long Term Investments", ""),
    minorityinterest("minorityInterest", "Minority Interest", ""),
    otheraccumulatedcomprehensiveincome("otherAccumulatedComprehensiveIncome", "Other Accumulated Comprehensive Income", ""),
    otherassets("otherAssets", "Other Assets", ""),
    othercurrentassets("otherCurrentAssets", "Other Current Assets", ""),
    othercurrentliabilities("otherCurrentLiabilities", "Other Current Liabilities", ""),
    otherequity("otherEquity", "Other Equity", ""),
    otherinvestments("otherInvestments", "Other Investments", ""),
    otherliabilities("otherLiabilities", "Other Liabilities", ""),
    partnerscapital("partnersCapital", "Partners Capital", ""),
    pensionpostretirementobligation("pensionPostRetirementObligation", "Pension Post Retirement Obligation", ""),
    preferredstock("preferredStock", "Preferred Stock", ""),
    prepaidexpenses("prepaidExpenses", "Prepaid Expenses", ""),
    propertyplantequipmentnet("propertyPlantEquipmentNet", "Property Plant Equipment", ""),
    restrictedcash("restrictedCash", "Restrict Cash", ""),
    retainedearnings("retainedEarnings", "Retained Earnings", ""),
    temporaryequity("temporaryEquity", "Temporary Equity", ""),
    totalassets("totalAssets", "Total Assets", ""),
    totalcurrentassets("totalCurrentAssets", "Total Current Assets", ""),
    totalcurrentliabilities("totalCurrentLiabilities", "Total Current Liabilities", ""),
    totalliabilities("totalLiabilities", "Total Liabilities", ""),
    totallongtermdebt("totalLongTermDebt", "Total Long Term Debt", ""),
    totalreceivablesnet("totalReceivablesNet", "Total Receivables Net", ""),
    totalshorttermdebt("totalShortTermDebt", "Total Short Term Debt", ""),
    totalstockholdersequity("totalStockholdersEquity", "Total Stock Holders Equity", ""),
    treasurystock("treasuryStock", "Treasury Stock", "");

    private final String keyName;
    private final String displayName;
    private final String helpText;

    EdgarBalanceSheetConsolidatedFields(String keyName, String displayName, String helpText) {
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
