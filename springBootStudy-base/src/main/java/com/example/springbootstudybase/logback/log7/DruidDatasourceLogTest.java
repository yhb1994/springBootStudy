package com.example.springbootstudybase.logback.log7;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * druid数据库
 * Created by yhb on 2021-12-31
 */
@RestController
@RequestMapping("log/")
@RequiredArgsConstructor
@Slf4j
public class DruidDatasourceLogTest {

    @GetMapping("druidDatasourceLogTest")
    public Object test() {
        log.info("DruidDatasourceLogTest");
        return null;
    }
}
