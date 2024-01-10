package com.plan.dream.common;


import java.io.Serializable;

/**
 * @author 97336
 */
public class ReturnResult<T> implements Serializable {

    private static final long serialVersionUID = -8379100651362895882L;

    /**
     * 返回状态
     */
    private int status;

    /**
     *返回消息
     */
    private String message;

    /**
     *返回数据
     */
    private T data;

    public ReturnResult() {
    }

    public ReturnResult(int status) {
        this(status, null);
    }

    public ReturnResult(int status, String message) {
        this(status, message, null);
    }

    public ReturnResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ReturnResult<T> Success(T data) {
        return new ReturnResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getDesc(), data);
    }

    public static <T> ReturnResult<T> Error(ResultEnum re) {
        return new ReturnResult<>(re.getCode(), re.getDesc());
    }
}
