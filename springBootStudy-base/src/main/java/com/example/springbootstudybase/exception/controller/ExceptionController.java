package com.example.springbootstudybase.exception.controller;

import com.example.springbootstudybase.BusinessResult;
import com.example.springbootstudybase.exception.annotation.MyAnnotation;
import com.example.springbootstudybase.exception.exe.AppException;
import com.example.springbootstudybase.exception.inter.CreateOperation;
import com.example.springbootstudybase.exception.inter.UpdateOperation;
import com.example.springbootstudybase.exception.request.HelloRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * Created by yhb on 2022-01-25
 */
@RestController
@Slf4j
@RequestMapping("/exception")
@Validated
public class ExceptionController {

    /**
     * 全局异常处理实验
     */
    @RequestMapping("/testAppException")
    public void testException(HttpServletRequest request, HttpServletResponse response) {
        log.error("你出错了哟！");
        throw new AppException();
    }

    /**
     * get请求验证 @Validated|@Valid + @NotBlank
     */
    @GetMapping("/testBindException")
    public BusinessResult<String> testBindException(@Validated HelloRequest helloRequest) {
        return BusinessResult.success(helloRequest.getName() + "hello");
    }

    /**
     * post请求验证 @Valid + @NotBlank
     */
    @PostMapping("/testMethodArgumentNotValidException")
    public BusinessResult<String> testMethodArgumentNotValidException(@RequestBody @Valid HelloRequest helloRequest) {
        return BusinessResult.success(helloRequest.getName() + "hello");
    }

    /**
     * get请求验证 @RequestParam + @Validated(类上面) + @NotBlank
     */
    @GetMapping("/testConstraintViolationException")
    public BusinessResult<String> testConstraintViolationException(@RequestParam @NotBlank(message = "名称不可为空") String name) {
        return BusinessResult.success(name + "hello");
    }

    /**
     * get请求验证 @RequestParam + @Validated(类上面) + @NotBlank
     */
    @GetMapping("/testMyAnnotation")
    public BusinessResult<String> testMyAnnotation(@RequestParam @MyAnnotation(message = "名称不可为空") String name) {
        return BusinessResult.success(name + "hello");
    }

    /**
     * 验证分组
     */
    @GetMapping(value = "/testGroups")
    public BusinessResult<String> testGroups(@Validated({CreateOperation.class}) HelloRequest helloRequest) {
        return BusinessResult.success(helloRequest.getHello() + "小明");
    }

    /**
     * 验证分组
     */
    @GetMapping(value = "/testGroups1")
    public BusinessResult<String> testGroups1(@Validated({UpdateOperation.class}) HelloRequest helloRequest) {
        return BusinessResult.success(helloRequest.getHello() + "小明");
    }

}
