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

    @Override
    public Class<EdgarBalanceSheetConsolidatedFields> getEnumType() {
        return EdgarBalanceSheetConsolidatedFields.class;
    }

    @Override
    public String getFieldName(EdgarBalanceSheetConsolidatedFields enumFieldType) {
        return enumFieldType.getKeyName();
    }
}