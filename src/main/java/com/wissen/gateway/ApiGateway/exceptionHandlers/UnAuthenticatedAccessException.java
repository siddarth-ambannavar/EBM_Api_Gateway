package com.wissen.gateway.ApiGateway.exceptionHandlers;

public class UnAuthenticatedAccessException extends RuntimeException {

    public UnAuthenticatedAccessException() {
        super("You cannot access this content");
    }

    public UnAuthenticatedAccessException(String errorMessage) {
        super(errorMessage);
    }
}
