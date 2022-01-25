package com.example.springbootstudybase.exception.request;

import com.example.springbootstudybase.exception.annotation.MyAnnotation;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by yhb on 2022-01-25
 */
@Data
public class HelloRequest {

    @NotBlank(message = "名称不能为空")
    private String name;

    @MyAnnotation(message = "招呼不可为空")
    private String hello;
}
