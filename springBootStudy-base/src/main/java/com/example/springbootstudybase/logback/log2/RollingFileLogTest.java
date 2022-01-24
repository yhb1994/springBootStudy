package com.example.springbootstudybase.logback.log2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 特定文件格式打印且支持打包
 * Created by yhb on 2021-12-31
 */
@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class RollingFileLogTest {

    @GetMapping("rollingFileLogTest")
    public Object test() {
        log.info("RollingFileLogTest");
        return null;
    }
}
