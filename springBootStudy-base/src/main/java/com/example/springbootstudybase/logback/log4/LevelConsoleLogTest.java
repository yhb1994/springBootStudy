package com.example.springbootstudybase.logback.log4;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 常规级别过滤器的使用
 * Created by yhb on 2021-12-31
 */
@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class LevelConsoleLogTest {

    @GetMapping("levelConsoleLogTest")
    public Object test() {
        log.info("LevelConsoleLogTest");
        log.debug("LevelConsoleLogTest1111111");
        return null;
    }
}
