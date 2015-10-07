package com.tenks.client.rest.util;

/**
 * Created by Tim on 9/15/2015.
 */
public interface EdgarDisplayType {

    // Field name used for setting values from Edgar to Java
    String getKeyName();

    // Displayable to User
    String getDisplayName();

    // Help Text for User
    String getHelpText();
}
