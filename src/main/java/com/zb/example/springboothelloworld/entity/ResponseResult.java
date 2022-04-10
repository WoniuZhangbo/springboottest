package com.zb.example.springboothelloworld.entity;


import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 1925941624890792441L;
    private static final int OK = 1;
    private static final int FAIL = 0;
    private static final int UNAUTHORIZED = -1;

    public T data;//服务端数据
    public int status = OK;//状态码
    public String message;//描述信息

    public ResponseResult<T> status(int status) {
        this.setStatus(status);
        return this;
    }

    public static ResponseResult<Object> isOk() {
        return new ResponseResult<>();
    }

    public static ResponseResult<Object> isFail() {
        return new ResponseResult<>().status(FAIL);
    }

    public static ResponseResult<?> isFail(Throwable e) {
        return isFail().msg(e);
    }

    public ResponseResult<T> msg(Throwable e) {
        this.setMessage(e.toString());
        return this;
    }

    public ResponseResult<T> data(T data) {
        this.setData(data);
        return this;
    }

    ResponseResult() {
    }

    ;

    //gettes and setters
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

    @Override
    public String toString() {
        return "ResposeResult [status=" + status + ", message=" + message + ", data=" + data + "]";
    }

}