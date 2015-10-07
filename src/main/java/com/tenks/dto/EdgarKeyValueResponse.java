package com.tenks.dto;

import com.tenks.client.rest.util.EdgarBalanceSheetConsolidatedFields;

import java.lang.reflect.Field;
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
                set(this, getFieldName(field), value);
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

    abstract public Class<E> getEnumType();
    abstract public String getFieldName(E enumFieldType);

    public static boolean set(EdgarKeyValueResponse object, String fieldName, Object fieldValue) {
        Class<?> clazz = object.getClass();
        if (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(object, fieldValue);
                return true;
            } catch (NoSuchFieldException e) {
                // TODO log exception
                e.printStackTrace();
                clazz = clazz.getSuperclass();
            } catch (Exception e) {
                // TODO log exception
                e.printStackTrace();
                throw new IllegalStateException(e);
            }
        }
        return false;
    }
}
