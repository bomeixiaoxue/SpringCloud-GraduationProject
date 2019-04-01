package com.hao.base.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseVO<T> implements Serializable {

    public String code = ResponseCodeVO.SUCCESS.getCode();
    public String message = ResponseCodeVO.SUCCESS.getName();
    public T data;

    public ResponseVO(T data) {
        this.data = data;
    }

    public ResponseVO(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseVO(String code, String error, T data) {
        this.code = code;
        this.message = error;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
