package com.tenks;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import com.tenks.client.rest.*;

/**
 * Created by Tim on 9/1/2015.
 */
public class TenksApplicationModule implements Module {

    @Override
    public void configure(Binder binder) {
        // TODO implement
        binder.bind(EdgarBalanceSheetClient.class).to(EdgarBalanceSheetRestClientImpl.class).in(Singleton.class);
        binder.bind(EdgarIncomeStatementClient.class).to(EdgarIncomeStatementRestClientImpl.class).in(Singleton.class);
        binder.bind(EdgarCashFlowStatementClient.class).to(EdgarCashFlowStatementRestClientImpl.class).in(Singleton.class);

        // TODO implement
        binder.bind(JsonParser.class).in(Singleton.class);
        binder.bind(Gson.class).in(Singleton.class);
    }
}
