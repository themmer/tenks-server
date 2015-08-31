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
    protected void transformKeyValueIntoObject(EdgarIncomeStatementConsolidatedFields field, String value) {
        switch (field) {
            case accountingchange:
                this.accountingChange = value;
                break;
            case basicepsnetincome:
                this.basicEpsNetIncome = value;
                break;
            case costofrevenue:
                this.costOfRevenue = value;
                break;
            case depreciationamortizationexpense:
                this.depreciationAmortizationExpense = value;
                break;
            case dilutedepsnetincome:
                this.dilutedEpsNetIncome = value;
                break;
            case discontinuedoperations:
                this.discontinuedOperations = value;
                break;
            case ebit:
                this.earningsBeforeInterestAndTax = value;
                break;
            case equityearnings:
                this.equityEarnings = value;
                break;
            case extraordinaryitems:
                this.extraOrdinaryItems = value;
                break;
            case grossprofit:
                this.grossProfit = value;
                break;
            case incomebeforeextraordinaryitems:
                this.incomeBeforeExtraordinaryItems = value;
                break;
            case incomebeforetaxes:
                this.incomeBeforeTaxes = value;
                break;
            case incometaxes:
                this.incomeTaxes = value;
                break;
            case interestexpense:
                this.interestExpense = value;
                break;
            case interestincome:
                this.interestIncome = value;
                break;
            case minorityinterestequityearnings:
                this.minorityInterestEquityEarnings = value;
                break;
            case netincome:
                this.netIncome = value;
                break;
            case netincomeapplicabletocommon:
                this.netIncomeApplicableToCommon = value;
                break;
            case operatingprofit:
                this.operatingProfit = value;
                break;
            case othernonoperatingincomeexpense:
                this.otherNonOperatingIncomeExpense = value;
                break;
            case otheroperatingexpenses:
                this.otherOperatingExpenses = value;
                break;
            case researchdevelopmentexpense:
                this.researchDevelopmentExpense = value;
                break;
            case restructuringremediationimpairmentprovisions:
                this.restructuringRemediationImpairmentProvisions = value;
                break;
            case sellinggeneraladministrativeexpenses:
                this.sellingGeneralAdministrativeExpenses = value;
                break;
            case totalrevenue:
                this.totalRevenue = value;
                break;
        }
    }

    @Override
    public Class<EdgarIncomeStatementConsolidatedFields> getEnumType() {
        return EdgarIncomeStatementConsolidatedFields.class;
    }
}