package com.wissen.gateway.ApiGateway.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AuthExceptionHandler {

    @ExceptionHandler(UnAuthenticatedAccessException.class)
    public ResponseEntity<ErrorResponse> handleUnAuthenticatedAccessException(
            UnAuthenticatedAccessException exception
    ) {
        ErrorResponse response = ErrorResponse.builder()
                .errorMessage(exception.getMessage())
                .status(HttpStatus.BAD_REQUEST)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(UnAuthorizedAccessException.class)
    public ResponseEntity<ErrorResponse> handleUnAuthorizedAccessException(
            UnAuthorizedAccessException exception
    ) {
        ErrorResponse response = ErrorResponse.builder()
                .errorMessage(exception.getMessage())
                .status(HttpStatus.UNAUTHORIZED)
                .build();
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }
}
