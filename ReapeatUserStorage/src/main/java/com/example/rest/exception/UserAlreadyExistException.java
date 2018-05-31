package com.example.rest.exception;

import static com.example.rest.config.Constants.USER_ALREDY_EXIST_DESCRIPTION;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException() {
        super(USER_ALREDY_EXIST_DESCRIPTION);
    }
}
