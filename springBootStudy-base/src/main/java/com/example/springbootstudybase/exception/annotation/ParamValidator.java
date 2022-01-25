package com.example.springbootstudybase.exception.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by yhb on 2022/1/26
 * 指定校验器
 */
public class ParamValidator implements ConstraintValidator<MyAnnotation, String> {

    private String value;

    @Override
    public void initialize(MyAnnotation constraintAnnotation) {
        value = constraintAnnotation.value();
    }

    /**
     * o 对应的是检测对象的系统，String 对应的是检测对象的类型
     */
    @Override
    public boolean isValid(String o, ConstraintValidatorContext constraintValidatorContext) {
        return o.equals(value);
    }
}
