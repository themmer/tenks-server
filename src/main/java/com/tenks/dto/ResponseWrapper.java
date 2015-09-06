package com.tenks.dto;

import java.util.List;

/**
 * Created by Tim on 9/5/2015.
 */
public class ResponseWrapper<T extends EdgarKeyValueResponse> {
    private boolean isError = false;
    private String errorMessage;
    private List<T> resultsList;

    public List<T> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<T> resultsList) {
        this.resultsList = resultsList;
    }

    public boolean isError() {
        return isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
