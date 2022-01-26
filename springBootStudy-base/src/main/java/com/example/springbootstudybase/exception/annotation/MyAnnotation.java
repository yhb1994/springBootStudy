package com.example.springbootstudybase.exception.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解，用于校验入参
 * <p>
 * --@Documented – 注解是否将包含在JavaDoc中
 * --@Retention – 什么时候使用该注解
 * --@Target – 注解用于什么地方
 * --@Inherited – 是否允许子类继承该注解
 * Created by yhb on 2022-01-25
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {ParamValidator.class}
)
public @interface MyAnnotation {
    String value() default "yhb";

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Documented
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        MyAnnotation[] value();
    }
}
