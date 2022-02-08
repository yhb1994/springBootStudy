package com.example.springbootstudybase.annotation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试注解
 * Created by yhb on 2022-02-08
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class ProfilesController {

    private final ProfilesBean profilesBean;

    @GetMapping("/profiles")
    public void profilesTest() {
        log.info("test: " + profilesBean.getMap());
    }
}
