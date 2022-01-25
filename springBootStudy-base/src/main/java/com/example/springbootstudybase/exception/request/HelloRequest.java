package com.example.springbootstudybase.exception.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by yhb on 2022-01-25
 */
@Data
public class HelloRequest {

    @NotBlank(message = "名称不能为空")
    private String name;
}
