package com.example.springbootstudybase.interceptor.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 一号拦截器
 * 实现一个HandlerInterceptor类，或者是继承HandlerInterceptorAdapter(抽象类)
 * Created by yhb on 2022-01-27
 */
@Slf4j
public class FirstInterceptorHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("一号拦截器_preHandle");
        /*
         *throw new AppException();
         *  当验证不通过的时候-直接抛出异常 -有异常处理器处理
         */
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("一号拦截器_postHandle");
        log.info("controller执行结束" + response);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("一号拦截器_afterCompletion");
        log.info("我获取到了一个返回的结果：" + response);
        log.info("请求结束了");
    }
}
