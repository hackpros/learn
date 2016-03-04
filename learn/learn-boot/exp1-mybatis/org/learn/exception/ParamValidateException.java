package org.learn.exception;


public class ParamValidateException extends RuntimeException
{
    private static final long serialVersionUID = -3915120210536628110L;

    private String code;

    private String message;

    public ParamValidateException(String message)
    {
        this.code = "1000";//参数不合法
        this.message = message;
    }

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

}