package com.example.springbootstudybase;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootStudyBaseApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SpringBootStudyBaseApplicationTests.class);

    /**
     * 日志级别 trace < debug < info < warn < error
     * 输出更高级别的日志 - 默认日志级别为info
     */
    @Test
    void contextLoads() {
     logger.info("info日志");
     logger.error("error日志");
     logger.debug("debug日志");
     logger.trace("trace日志");
     logger.warn("warn日志");
    }

}
