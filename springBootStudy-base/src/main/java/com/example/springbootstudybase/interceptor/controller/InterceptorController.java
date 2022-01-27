package com.example.springbootstudybase.interceptor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yhb on 2022-01-27
 */
@Slf4j
@RestController
@RequestMapping("/interceptor")
public class InterceptorController {

    @GetMapping("/test")
    public String test() {
        log.info("进入InterceptorController");
        return "yhb";
    }
}
