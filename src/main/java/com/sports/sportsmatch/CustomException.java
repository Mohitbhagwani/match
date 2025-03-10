package com.sports.sportsmatch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
