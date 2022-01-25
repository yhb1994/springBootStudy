package com.example.springbootstudybase.exception.handler;

import com.example.springbootstudybase.BusinessResult;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 优先执行@ExceptionHandler再执行HandlerExceptionResolver
 * 全局异常捕获
 * Created by yhb on 2022/1/25
 */
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    @SneakyThrows
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception exception) {
        System.err.println("访问" + httpServletRequest.getRequestURI() + " 发生错误, 错误信息:" + exception.getMessage());
        httpServletResponse.getWriter().println(BusinessResult.fail(String.valueOf(exception.getMessage()), exception.getMessage()));
        throw exception;
        //return new ModelAndView();
    }
}
