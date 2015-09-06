package com.tenks.dto;

import javax.ws.rs.core.Response;

/**
 * Created by Tim on 9/5/2015.
 */
class Error {
    private String status;
    private String message;

    public Error(int statusCode, String message) {
        this.status = String.valueOf(statusCode);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
