package com.example.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static com.example.rest.config.Constants.USER_ALREDY_EXIST_CODE;
import static com.example.rest.config.Constants.USER_ALREDY_EXIST_DESCRIPTION;

@ControllerAdvice
public class UserAlreadyExistExceptionHandler {


    @ExceptionHandler(UserAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody

    public ExceptionResponse handleException(Exception ex) {
return ExceptionResponse.of()
        .httpStatus(HttpStatus.CONFLICT)
        .error(USER_ALREDY_EXIST_CODE)
        .errorDescription(USER_ALREDY_EXIST_DESCRIPTION)
        .create();
    }
}
