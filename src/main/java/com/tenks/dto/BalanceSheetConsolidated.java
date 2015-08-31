package com.tenks.dto;

import com.tenks.client.rest.util.EdgarBalanceSheetConsolidatedFields;

import java.util.Map;

/**
 * Created by Tim on 7/27/2015.
 */
public class BalanceSheetConsolidated extends EdgarKeyValueResponse<EdgarBalanceSheetConsolidatedFields> {

    private String accountsPayableAndAccruedExpenses;
    private String accruedInterest;
    private String additionalPaidInCapital;
    private String additionalPaidInCapitalPreferredStock;
    private String cashAndCashEquivalents;
    private String cashCashEquivalentsAndShortTermInvestments;
    private String commitmentsContingencies;
    private String commonStock;
    private String deferredCharges;
    private String deferredIncomeTaxesCurrent;
    private String deferredIncomeTaxesLongTerm;
    private String goodwill;
    private String intangibleAssets;
    private String inventoriesNet;
    private String longTermDeferredIncomeTaxLiabilities;
    private String longTermDeferredLiabilityCharges;
    private String longTermInvestments;
    private String minorityInterest;
    private String otherAccumulatedComprehensiveIncome;
    private String otherAssets;
    private String otherCurrentAssets;
    private String otherCurrentLiabilities;
    private String otherEquity;
    private String otherInvestments;
    private String otherLiabilities;
    private String partnersCapital;
    private String pensionPostRetirementObligation;
    private String preferredStock;
    private String prepaidExpenses;
    private String propertyPlantEquipmentNet;
    private String restrictedCash;
    private String retainedEarnings;
    private String temporaryEquity;
    private String totalAssets;
    private String totalCurrentAssets;
    private String totalCurrentLiabilities;
    private String totalLiabilities;
    private String totalLongTermDebt;
    private String totalReceivablesNet;
    private String totalShortTermDebt;
    private String totalStockholdersEquity;
    private String treasuryStock;

    // Hashmap required to create data - this is how it is being sent from edgar service
    public BalanceSheetConsolidated(Map<String, String> keyValueResponseHashMap) {
        populateData(keyValueResponseHashMap);
    }

    protected final void transformKeyValueIntoObject(EdgarBalanceSheetConsolidatedFields field, String value) {
        switch(field) {
            case accountspayableandaccruedexpenses:
                this.accountsPayableAndAccruedExpenses = value;
                break;
            case accruedinterest:
                this.accruedInterest = value;
                break;
            case additionalpaidincapital:
                this.additionalPaidInCapital = value;
                break;
            case additionalpaidincapitalpreferredstock:
                this.additionalPaidInCapitalPreferredStock = value;
                break;
            case cashandcashequivalents:
                this.cashAndCashEquivalents = value;
                break;
            case cashcashequivalentsandshortterminvestments:
                this.cashCashEquivalentsAndShortTermInvestments = value;
                break;
            case commitmentscontingencies:
                this.commitmentsContingencies = value;
                break;
            case commonstock:
                this.commonStock = value;
                break;
            case deferredcharges:
                this.deferredCharges = value;
                break;
            case deferredincometaxescurrent:
                this.deferredIncomeTaxesCurrent = value;
                break;
            case deferredincometaxeslongterm:
                this.deferredIncomeTaxesLongTerm = value;
                break;
            case goodwill:
                this.goodwill = value;
                break;
            case intangibleassets:
                this.intangibleAssets = value;
                break;
            case inventoriesnet:
                this.inventoriesNet = value;
                break;
            case longtermdeferredincometaxliabilities:
                this.longTermDeferredIncomeTaxLiabilities = value;
                break;
            case longtermdeferredliabilitycharges:
                this.longTermDeferredLiabilityCharges = value;
                break;
            case longterminvestments:
                this.longTermInvestments = value;
                break;
            case minorityinterest:
                this.minorityInterest = value;
                break;
            case otheraccumulatedcomprehensiveincome:
                this.otherAccumulatedComprehensiveIncome = value;
                break;
            case otherassets:
                this.otherAssets = value;
                break;
            case othercurrentassets:
                this.otherCurrentAssets = value;
                break;
            case othercurrentliabilities:
                this.otherCurrentLiabilities = value;
                break;
            case otherequity:
                this.otherEquity = value;
                break;
            case otherinvestments:
                this.otherInvestments = value;
                break;
            case otherliabilities:
                this.otherLiabilities = value;
                break;
            case partnerscapital:
                this.partnersCapital = value;
                break;
            case pensionpostretirementobligation:
                this.pensionPostRetirementObligation = value;
                break;
            case preferredstock:
                this.preferredStock = value;
                break;
            case prepaidexpenses:
                this.prepaidExpenses = value;
                break;
            case propertyplantequipmentnet:
                this.propertyPlantEquipmentNet = value;
                break;
            case restrictedcash:
                this.restrictedCash = value;
                break;
            case retainedearnings:
                this.retainedEarnings = value;
                break;
            case temporaryequity:
                this.temporaryEquity = value;
                break;
            case totalassets:
                this.totalAssets = value;
                break;
            case totalcurrentassets:
                this.totalCurrentAssets = value;
                break;
            case totalcurrentliabilities:
                this.totalCurrentLiabilities = value;
                break;
            case totalliabilities:
                this.totalLiabilities = value;
                break;
            case totallongtermdebt:
                this.totalLongTermDebt = value;
                break;
            case totalreceivablesnet:
                this.totalReceivablesNet = value;
                break;
            case totalshorttermdebt:
                this.totalShortTermDebt = value;
                break;
            case totalstockholdersequity:
                this.totalStockholdersEquity = value;
                break;
            case treasurystock:
                this.treasuryStock = value;
                break;
        }
    }

    @Override
    public Class<EdgarBalanceSheetConsolidatedFields> getEnumType() {
        return EdgarBalanceSheetConsolidatedFields.class;
    }
}