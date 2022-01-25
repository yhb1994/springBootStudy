package com.example.springbootstudybase.exception.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yhb on 2022-01-25
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    public void testException(HttpServletRequest request, HttpServletResponse response) {

    }
}
