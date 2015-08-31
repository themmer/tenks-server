package com.tenks.client.rest.dto;

import com.tenks.client.rest.util.EdgarFinancialRequestType;

/**
 * Created by Tim on 7/23/2015.
 */
public class EdgarFinancialRequest {

    private int numberOfPeriods = 1;
    private EdgarFinancialRequestType edgarFinancialRequestType;
    // TODO do we want to support multiple symbols here
    // TODO we will want to do toStrings for all the error handling and on the pojos
    private String symbolTicker;

    public EdgarFinancialRequest(EdgarFinancialRequestType edgarFinancialRequestType, String symbolTicker) {
        // Fail Fast
        // TODO asserts
        assert(edgarFinancialRequestType != null);
        // TODO make this similar to string utils hasText
        assert(symbolTicker != null);

        this.edgarFinancialRequestType = edgarFinancialRequestType;
        this.symbolTicker = symbolTicker;
    }

    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }

    public void setNumberOfPeriods(int numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public EdgarFinancialRequestType getEdgarFinancialRequestType() {
        return edgarFinancialRequestType;
    }

    public String getSymbolTicker() {
        return symbolTicker;
    }
}
