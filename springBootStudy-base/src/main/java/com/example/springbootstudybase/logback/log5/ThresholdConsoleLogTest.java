package com.example.springbootstudybase.logback.log5;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yhb on 2021-12-31
 */

@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class ThresholdConsoleLogTest {

    @GetMapping("thresholdConsoleLogTest")
    public Object test() {
        log.warn("www");
        log.info("ThresholdConsoleLogTest");
        log.debug("ThresholdConsoleLogTest1");
        return "h";
    }
}
