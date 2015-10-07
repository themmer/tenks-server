package com.tenks.client.rest.util;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class TenksEnumAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, final TypeToken<T> type) {
        Class<? super T> rawType = type.getRawType();
        if (rawType == EdgarIncomeStatementConsolidatedFields.class) {
            return new IncomeStatementEnumTypeAdapter<T>();
        } else if (rawType == EdgarBalanceSheetConsolidatedFields.class) {
            return new BalanceSheetEnumTypeAdapter<T>();
        } else if (rawType == EdgarCashFlowStatementConsolidatedFields.class) {
            return new CashFlowStatementEnumTypeAdapter<T>();
        }
        return null;
    }

    public class BalanceSheetEnumTypeAdapter<T> extends TypeAdapter<T> {
        public void write(JsonWriter out, T value) throws IOException {
            nullSafe();
            EdgarBalanceSheetConsolidatedFields field = (EdgarBalanceSheetConsolidatedFields) value;
            writeDisplayType(field, out);
        }

        public T read(JsonReader in) throws IOException {
            // No need to deserialize
            return null;
        }
    }

    public class IncomeStatementEnumTypeAdapter<T> extends TypeAdapter<T> {
        public void write(JsonWriter out, T value) throws IOException {
            nullSafe();
            EdgarIncomeStatementConsolidatedFields field = (EdgarIncomeStatementConsolidatedFields) value;
            writeDisplayType(field, out);
        }

        public T read(JsonReader in) throws IOException {
            // No need to deserialize
            return null;
        }
    }

    private void writeDisplayType(EdgarDisplayType field, JsonWriter out) throws IOException {
        // key: {display, help}
        out.beginObject();
        out.name("display").value(field.getDisplayName());
        out.name("help").value(field.getHelpText());
        out.endObject();
    }

    public class CashFlowStatementEnumTypeAdapter<T> extends TypeAdapter<T> {
        public void write(JsonWriter out, T value) throws IOException {
            nullSafe();
            EdgarCashFlowStatementConsolidatedFields field = (EdgarCashFlowStatementConsolidatedFields) value;
            writeDisplayType(field, out);
        }

        public T read(JsonReader in) throws IOException {
            // No need to deserialize
            return null;
        }
    }
}