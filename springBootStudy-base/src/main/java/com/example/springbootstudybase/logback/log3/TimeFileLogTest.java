package com.example.springbootstudybase.logback.log3;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 时间滚动
 * Created by yhb on 2021-12-31
 */
@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class TimeFileLogTest {

    @GetMapping("timeFileLogTest")
    public Object test() {
        log.info("TimeFileLogTest");
        return null;
    }
}
