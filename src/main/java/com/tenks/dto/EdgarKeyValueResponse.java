package com.tenks.dto;

import com.tenks.client.rest.util.EdgarBalanceSheetConsolidatedFields;

import java.util.EnumSet;
import java.util.Map;

/**
 * Created by Tim on 7/28/2015.
 */
public abstract class EdgarKeyValueResponse<E extends Enum<E>> {

    public EdgarKeyValueResponse populateData(Map<String, String> keyValueResponseHashMap) {
        System.out.println("map before object conversion: " + keyValueResponseHashMap);
        // TODO lets do generics here and the other ones

        EnumSet<E> fields = EnumSet.allOf(getEnumType());
        for (E field : fields) {
            String fieldString = field.name();
            if (keyValueResponseHashMap.containsKey(fieldString)) {
                String value = keyValueResponseHashMap.get(fieldString);
                transformKeyValueIntoObject(field, value);
            } else {
                // TODO let's just log a warning here in log4j
                throw new RuntimeException("Cannot find expected field key - " + field + " - in the response from Edgar service for Balance Sheet Consolidated");
            }
        }

        // TODO remove when we have a good acceptance of the available keys - no schema definition
        for (String fieldName : keyValueResponseHashMap.keySet()) {
            try {
                E fieldEnum = Enum.valueOf(getEnumType(), fieldName);
            } catch(IllegalArgumentException e) {
                // TODO this will have to be logged with what call and what field
                System.out.println("We don't have this field set up in the enum list: " + fieldName);
            }
        }
        return this;
    }

    abstract protected void transformKeyValueIntoObject(E field, String value);

    abstract public Class<E> getEnumType();
}
