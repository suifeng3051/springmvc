package com.heaven.spring.springmvc.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by whd@zizizizizi.com on 2016/6/14.
 */
@ControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(UserExistException.class)
    public String handleUserExist() {
        return "error";
    }
}
