package org.learn.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.learn.exception.modelview.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler
{

    private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class.getName());

    @ExceptionHandler(value = {Throwable.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionResponse handleCommonException(Throwable e, HttpServletResponse response)
    {
        e.printStackTrace();
        logger.error(e);
        if(e.getMessage() != null && e.getMessage().contains("*.BusinessException"))
        {
            response.setStatus(HttpStatus.CONFLICT.value());
            return ExceptionResponse.create(String.valueOf(HttpStatus.CONFLICT.value()), "业务处理异常");
        }
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ExceptionResponse.create(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()), "系统错误");
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    @ResponseBody
    public ExceptionResponse handleBusinessException(HttpServletResponse response, BusinessException ex)
            throws IOException
    {	
        logger.error(ex);
        return ExceptionResponse.create(ex.getCode(), ex.getMessage());
    }
    
    @ExceptionHandler(value = ParamValidateException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    @ResponseBody
    public ExceptionResponse handleParamValidateException(HttpServletResponse response, ParamValidateException ex)
            throws IOException
    {
        logger.error(ex);
        return ExceptionResponse.create(ex.getCode(), ex.getMessage());
    }

    /*
     * @ExceptionHandler(RedirectBusinessException.class)
     * public String handleRedirectException(RedirectBusinessException ex){
     * return "error-business";
     * }
     */

}