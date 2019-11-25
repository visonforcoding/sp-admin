package com.hll_ibd.wlnav.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// @ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({ Exception.class })
    @ResponseBody
    public String handleException(Exception e) {
        e.printStackTrace();
        return "testArrayIndexOutOfBoundsException";
    }

}
