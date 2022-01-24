package com.example.springbootstudybase.logback.log6;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mysql数据库
 * Created by yhb on 2021-12-31
 */
@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class JdbcLogTest {

    @GetMapping("jdbcLogTest")
    public Object test() {
        log.info("JdbcLogTest");
        return null;
    }
}
