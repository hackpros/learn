package org.learn.exception.modelview;

import java.io.Serializable;

public class ExceptionResponse implements Serializable
{

    private static final long serialVersionUID = 7045248837223946628L;

    private String code;

    private String message;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public static ExceptionResponse create(String code, String message)
    {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setCode(code);
        exceptionResponse.setMessage(message);
        return exceptionResponse;
    }
}