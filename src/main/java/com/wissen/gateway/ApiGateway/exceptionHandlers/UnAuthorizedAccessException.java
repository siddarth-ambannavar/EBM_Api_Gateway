package com.wissen.gateway.ApiGateway.exceptionHandlers;

public class UnAuthorizedAccessException extends RuntimeException{

    public UnAuthorizedAccessException() {
        super("Please Login");
    }

    public UnAuthorizedAccessException(String errorMessage) {
        super(errorMessage);
    }
}
