package com.example.springbootstudybase;

import lombok.Data;

import java.util.List;

/**
 * 最终返回结果类
 * Created by yhb on 2022-01-25
 */
@Data
public class BusinessResult<T> {

    private String code;

    private String message;

    private List<T> data;

    public static <T> BusinessResult<T> fail(String code, String message) {
        BusinessResult<T> businessResult = new BusinessResult<T>();
        businessResult.setCode(code);
        businessResult.setMessage(message);
        return businessResult;
    }

    public static <T> BusinessResult<T> success(String message) {
        BusinessResult<T> businessResult = new BusinessResult<T>();
        businessResult.setCode("200");
        businessResult.setMessage(message);
        return businessResult;
    }
}
