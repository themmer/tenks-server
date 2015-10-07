package com.tenks.dto;

import com.tenks.client.rest.util.EdgarCashFlowStatementConsolidatedFields;

import java.util.EnumSet;
import java.util.Map;

/**
 * Created by Tim on 7/27/2015.
 */
public class CashFlowStatementConsolidated extends EdgarKeyValueResponse<EdgarCashFlowStatementConsolidatedFields> {

    private String acquisitionSaleOfBusinessNet;
    private String adjustmentForEquityEarnings;
    private String adjustmentForMinorityInterest;
    private String adjustmentForSpecialCharges;
    private String capitalExpenditures;
    private String cashFromDiscontinuedOperations;
    private String cashFromFinancingActivities;
    private String cashFromInvestingActivities;
    private String cashFromOperatingActivities;
    private String cashFromDepreciationAmortization;
    private String changeInAccountsPayableAccruedExpenses;
    private String changeInAccountsReceivable;
    private String changeInCurrentAssets;
    private String changeInCurrentLiabilities;
    private String changeInDebtNet;
    private String changeInDeferredRevenue;
    private String changeInEquityNet;
    private String changeInIncomeTaxesPayable;
    private String changeInInventories;
    private String changeInOperatingAssetsLiabilities;
    private String changeInOtherAssets;
    private String changeInOtherCurrentAssets;
    private String changeInOtherCurrentLiabilities;
    private String changeInOtherLiabilities;
    private String changeInPrepaidExpenses;
    private String deferredIncomeTaxes;
    private String dividendsPaid;
    private String effectOfExChangeRateOnCash;
    private String employeeCompensation;
    private String investmentChangesNet;
    private String netChangeInCash;
    private String otherAdjustments;
    private String otherAssetLiabilityChangesNet;
    private String otherFinancingActivitiesNet;
    private String otherInvestingActivities;
    private String realizedGainsLosses;
    private String saleOfPropertyPlantEquipment;
    private String stockOptionTaxBenefits;
    private String totalAdjustments;

    public CashFlowStatementConsolidated(Map<String, String> keyValueResponseHashMap) {
        populateData(keyValueResponseHashMap);
    }

    @Override
    public Class<EdgarCashFlowStatementConsolidatedFields> getEnumType() {
        return EdgarCashFlowStatementConsolidatedFields.class;
    }

    @Override
    public String getFieldName(EdgarCashFlowStatementConsolidatedFields enumFieldType) {
        return enumFieldType.getKeyName();
    }
}