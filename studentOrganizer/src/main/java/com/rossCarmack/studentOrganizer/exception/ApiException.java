package com.rossCarmack.studentOrganizer.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {

    @Getter
    private final String message;
    @Getter
    private final HttpStatus httpStatus;
    @Getter
    private final ZonedDateTime timestamp;

    public ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}
