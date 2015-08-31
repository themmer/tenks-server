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
    protected void transformKeyValueIntoObject(EdgarCashFlowStatementConsolidatedFields field, String value) {
        switch (field) {
            case acquisitionsaleofbusinessnet:
                this.acquisitionSaleOfBusinessNet = value;
                break;
            case adjustmentforequityearnings:
                this.adjustmentForEquityEarnings = value;
                break;
            case adjustmentforminorityinterest:
                this.adjustmentForMinorityInterest = value;
                break;
            case adjustmentforspecialcharges:
                this.adjustmentForSpecialCharges = value;
                break;
            case capitalexpenditures:
                this.capitalExpenditures = value;
                break;
            case cashfromdiscontinuedoperations:
                this.cashFromDiscontinuedOperations = value;
                break;
            case cashfromfinancingactivities:
                this.cashFromFinancingActivities = value;
                break;
            case cashfrominvestingactivities:
                this.cashFromInvestingActivities = value;
                break;
            case cashfromoperatingactivities:
                this.cashFromOperatingActivities = value;
                break;
            case cfdepreciationamortization:
                this.cashFromDepreciationAmortization = value;
                break;
            case changeinaccountspayableaccruedexpenses:
                this.changeInAccountsPayableAccruedExpenses = value;
                break;
            case changeinaccountsreceivable:
                this.changeInAccountsReceivable = value;
                break;
            case changeincurrentassets:
                this.changeInCurrentAssets = value;
                break;
            case changeincurrentliabilities:
                this.changeInCurrentLiabilities = value;
                break;
            case changeindebtnet:
                this.changeInDebtNet = value;
                break;
            case changeindeferredrevenue:
                this.changeInDeferredRevenue = value;
                break;
            case changeinequitynet:
                this.changeInEquityNet = value;
                break;
            case changeinincometaxespayable:
                this.changeInIncomeTaxesPayable = value;
                break;
            case changeininventories:
                this.changeInInventories = value;
                break;
            case changeinoperatingassetsliabilities:
                this.changeInOperatingAssetsLiabilities = value;
                break;
            case changeinotherassets:
                this.changeInOtherAssets = value;
                break;
            case changeinothercurrentassets:
                this.changeInOtherCurrentAssets = value;
                break;
            case changeinothercurrentliabilities:
                this.changeInOtherCurrentLiabilities = value;
                break;
            case changeinotherliabilities:
                this.changeInOtherLiabilities = value;
                break;
            case changeinprepaidexpenses:
                this.changeInPrepaidExpenses = value;
                break;
            case deferredincometaxes:
                this.deferredIncomeTaxes = value;
                break;
            case dividendspaid:
                this.dividendsPaid = value;
                break;
            case effectofexchangerateoncash:
                this.effectOfExChangeRateOnCash = value;
                break;
            case employeecompensation:
                this.employeeCompensation = value;
                break;
            case investmentchangesnet:
                this.investmentChangesNet = value;
                break;
            case netchangeincash:
                this.netChangeInCash = value;
                break;
            case otheradjustments:
                this.otherAdjustments = value;
                break;
            case otherassetliabilitychangesnet:
                this.otherAssetLiabilityChangesNet = value;
                break;
            case otherfinancingactivitiesnet:
                this.otherFinancingActivitiesNet = value;
                break;
            case otherinvestingactivities:
                this.otherInvestingActivities = value;
                break;
            case realizedgainslosses:
                this.realizedGainsLosses = value;
                break;
            case saleofpropertyplantequipment:
                this.saleOfPropertyPlantEquipment = value;
                break;
            case stockoptiontaxbenefits:
                this.stockOptionTaxBenefits = value;
                break;
            case totaladjustments:
                this.totalAdjustments = value;
                break;
        }
    }

    @Override
    public Class<EdgarCashFlowStatementConsolidatedFields> getEnumType() {
        return EdgarCashFlowStatementConsolidatedFields.class;
    }
}