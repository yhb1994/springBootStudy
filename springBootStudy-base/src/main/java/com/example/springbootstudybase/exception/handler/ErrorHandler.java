package com.example.springbootstudybase.exception.handler;

import com.example.springbootstudybase.BusinessResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 优先执行HandlerExceptionResolver再执行ErrorController
 * Created by yhb on 2022/1/25
 */
@Slf4j
@RestController
public class ErrorHandler implements ErrorController {

    private final static String ERROR_PATH = "/error";

    @ResponseBody
    @RequestMapping(path = ERROR_PATH)
    public BusinessResult<String> error(HttpServletRequest request, HttpServletResponse response) {
        log.info("访问/error" + "  错误代码：" + response.getStatus());
        return BusinessResult.fail(String.valueOf(response.getStatus()), "ss");
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}

