package com.tenks.client.rest.util;

/**
 * Created by Tim on 7/23/2015.
 */
public enum EdgarCashFlowStatementConsolidatedFields implements EdgarDisplayType {

    // verbatim fields from edgar online service
    acquisitionsaleofbusinessnet("acquisitionSaleOfBusinessNet", "Acquisition On Sale of Businses Net", ""),
    adjustmentforequityearnings("adjustmentForEquityEarnings", "Adjustment For Equity Earnings", ""),
    adjustmentforminorityinterest("adjustmentForMinorityInterest", "Adjustment For Minority Interest", ""),
    adjustmentforspecialcharges("adjustmentForSpecialCharges", "Adjustment For Special Charges", ""),
    capitalexpenditures("capitalExpenditures", "Capital Expenditures", ""),
    cashfromdiscontinuedoperations("cashFromDiscontinuedOperations", "Cash From Discontinued Operations", ""),
    cashfromfinancingactivities("cashFromFinancingActivities", "Cash From Financing Activities", ""),
    cashfrominvestingactivities("cashFromInvestingActivities", "Cash From Investing Activities", ""),
    cashfromoperatingactivities("cashFromOperatingActivities", "Cash From Operating Activities", ""),
    cfdepreciationamortization("cashFromDepreciationAmortization", "Cash Flow Depreciation Amortization", ""),
    changeinaccountspayableaccruedexpenses("changeInAccountsPayableAccruedExpenses", "Change In Accounts Payable Accrued Expenses", ""),
    changeinaccountsreceivable("changeInAccountsReceivable", "Change In Accounts Receivable", ""),
    changeincurrentassets("changeInCurrentAssets", "Change In Current Assets", ""),
    changeincurrentliabilities("changeInCurrentLiabilities", "Change in Current Liabilities", ""),
    changeindebtnet("changeInDebtNet", "Change in Debt Net", ""),
    changeindeferredrevenue("changeInDeferredRevenue", "Change in Deferred Revenue", ""),
    changeinequitynet("changeInEquityNet", "Change In Equity Net", ""),
    changeinincometaxespayable("changeInIncomeTaxesPayable", "Change In Income Taxes Payable", ""),
    changeininventories("changeInInventories", "Change In Inventories", ""),
    changeinoperatingassetsliabilities("changeInOperatingAssetsLiabilities", "Change In Operating Assets Liabilities", ""),
    changeinotherassets("changeInOtherAssets", "Change In Other Assets", ""),
    changeinothercurrentassets("changeInOtherCurrentAssets", "Change In Other Current Assets", ""),
    changeinothercurrentliabilities("changeInOtherCurrentLiabilities", "Change In Other Current Liabilities", ""),
    changeinotherliabilities("changeInOtherLiabilities", "Change In Other Liabilities", ""),
    changeinprepaidexpenses("changeInPrepaidExpenses", "Change In Prepaid Expenses", ""),
    deferredincometaxes("deferredIncomeTaxes", "Deferred Income Taxes", ""),
    dividendspaid("dividendsPaid", "Dividends Paid", ""),
    effectofexchangerateoncash("effectOfExChangeRateOnCash", "Effect Of Exchange Rate On Cash", ""),
    employeecompensation("employeeCompensation", "Employee Compensation", ""),
    investmentchangesnet("investmentChangesNet", "Investment Changes Net", ""),
    netchangeincash("netChangeInCash", "Net Change In Cash", ""),
    otheradjustments("otherAdjustments", "Other Adjustments", ""),
    otherassetliabilitychangesnet("otherAssetLiabilityChangesNet", "Other Asset Liabilities Changes Net", ""),
    otherfinancingactivitiesnet("otherFinancingActivitiesNet", "Other Financing Activities", ""),
    otherinvestingactivities("otherInvestingActivities", "Other Investing Activities", ""),
    realizedgainslosses("realizedGainsLosses", "Realized Gains Losses", ""),
    saleofpropertyplantequipment("saleOfPropertyPlantEquipment", "Sale Of Property Plant Equipment", ""),
    stockoptiontaxbenefits("stockOptionTaxBenefits", "Stock Option Tax Benefits", ""),
    totaladjustments("totalAdjustments", "Total Adjustments", "");

    private final String keyName;
    private final String displayName;
    private final String helpText;

    EdgarCashFlowStatementConsolidatedFields(String keyName, String displayName, String helpText) {
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
