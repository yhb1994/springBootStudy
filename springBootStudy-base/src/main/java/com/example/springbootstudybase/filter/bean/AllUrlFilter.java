package com.example.springbootstudybase.filter.bean;

import com.example.springbootstudybase.exception.service.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 全局过滤器
 * Created by yhb on 2022-01-26
 */
@Slf4j
@Order(2)
@WebFilter(filterName = "AllUrlFilter", urlPatterns = {"/filter/*"})
@Component
@RequiredArgsConstructor
public class AllUrlFilter implements Filter {

    private final AccountServiceImpl accountService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        log.info("验证调用信息" + request.getRequestURL());
        accountService.test();
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("处理返回信息");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
