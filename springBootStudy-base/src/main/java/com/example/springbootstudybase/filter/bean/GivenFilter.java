package com.example.springbootstudybase.filter.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 特定拦截器
 * Created by yhb on 2022-01-27
 */
@Slf4j
@Order(1)
@WebFilter(filterName = "GivenFilter",urlPatterns = {"/*"})
public class GivenFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("GivenFilter.......start");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("GivenFilter.......end");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
