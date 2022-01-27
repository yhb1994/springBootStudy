package com.example.springbootstudybase.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yhb on 2022-01-27
 */
@RequestMapping("/filter")
@RestController
public class FilterController {

    @GetMapping("/go")
    public String test() {
        return "hello word";
    }
}
