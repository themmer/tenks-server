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

    private static final String AppKey1 = "en652xxe8m83emkarff4rzn9"; // requested extension on this one - pending
    private static final String AppKey2 = "7zp6pxxzasj9jd6jqavnst8t"; // one year only

    static {
        AppKeyList.add(AppKey2);
        AppKeyList.add(AppKey1);
    }

    // TODO I would like round robin instead of a random
    // Workaround for limit of api calls - 2 per second / 5000 day
    public static String getRandomAppKey() {
        ThreadLocalRandom currentThreadForRandom = ThreadLocalRandom.current();
        int randomInt = currentThreadForRandom.nextInt(AppKeyList.size());
        String key = AppKeyList.get(randomInt);
        System.out.println("we are using this key for calling the service: " + key);
        return key;
    }
}
