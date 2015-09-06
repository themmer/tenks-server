package com.tenks.dto;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 9/5/2015.
 */
public class ResponseWrapper<T extends EdgarKeyValueResponse> {
    private boolean isError = false;
    private List<Error> errors;
    private List<T> data;
    private String meta;

    public boolean isError() {
        return isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void addErrorMessage(int statusCode, String errorString) {
        if(errors == null) {
            errors = new ArrayList<Error>();
            Error error = new Error(statusCode, errorString);
            errors.add(error);
        }
    }
}
