package com.tenks.client.rest.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Tim on 7/23/2015.
 */
public class EdgarConstants {
    // Basic Call setup

    public static final List<String> AppKeyList = new ArrayList<String>();
    public static final String BaseUri = "http://edgaronline.api.mashery.com/";

    // Param names for call
    public static final String NumberOfPeriodsParam = "numPeriods";
    public static final String FieldsParam = "fields";
    public static final String TicketSymbolsParam = "primarysymbols";
    public static final String AppKeyParam = "appkey";

    private static final String AppKey1 = "en652xxe8m83emkarff4rzn9";
    private static final String AppKey2 = "";
    private static final String AppKey3 = "";
    private static final String AppKey4 = "";
    private static final String AppKey5 = "";

    static {
        AppKeyList.add(AppKey1);
    }

    // TODO I would like round robin instead of a random
    // Workaround for limit of api calls - 2 per second
    public static String getRandomAppKey() {
        ThreadLocalRandom currentThreadForRandom = ThreadLocalRandom.current();
        int randomInt = currentThreadForRandom.nextInt(AppKeyList.size());
        return AppKeyList.get(randomInt);
    }
}
