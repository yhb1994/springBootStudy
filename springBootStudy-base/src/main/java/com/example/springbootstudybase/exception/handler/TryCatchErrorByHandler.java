package com.example.springbootstudybase.exception.handler;

import com.example.springbootstudybase.BusinessResult;
import com.example.springbootstudybase.exception.exe.AppException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * 特定异常类捕获
 * Created by yhb on 2022/1/25
 */
@Slf4j
@ControllerAdvice
public class TryCatchErrorByHandler {

    //全局异常处理
    @ResponseBody
    @ExceptionHandler(AppException.class)
    public BusinessResult<String> globalException(HttpServletResponse response, AppException ex) {
        log.info("错误代码：" + response.getStatus());
        return BusinessResult.fail(String.valueOf(ex.getCode()), ex.getMessage());
    }

    //处理get请求中 使用@Valid | @Validated验证路径中请求实体校验失败后抛出的异常
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public BusinessResult<String> BindExceptionHandler(BindException e) {
        String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return BusinessResult.fail("600", message);
    }

    //处理请求参数格式错误 @RequestParam上validate失败后抛出的异常是javax.validation.ConstraintViolationException
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public BusinessResult<String> ConstraintViolationExceptionHandler(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining());
        return BusinessResult.fail("400", message);
    }

    //处理请求参数格式错误 @RequestBody上@Vaild失败后抛出的异常是MethodArgumentNotValidException异常。
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BusinessResult<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return BusinessResult.fail("300", message);
    }
}
