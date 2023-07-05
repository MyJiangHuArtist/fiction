package com.thejianghuartist.exception;

import com.thejianghuartist.util.R;
import com.thejianghuartist.util.REnum;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ParameterIsInvalidException{
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public R error(){
        return R.base(REnum.PARAMETER_IS_INVALID);
    }
}
