package com.example.springboot_proto.app.exceptions;

public class CustomException extends RuntimeException {
    private final String errorCode;

    public CustomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}