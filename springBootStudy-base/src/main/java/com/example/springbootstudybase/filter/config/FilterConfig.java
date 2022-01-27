package com.example.springbootstudybase.filter.config;

import com.example.springbootstudybase.exception.service.AccountServiceImpl;
import com.example.springbootstudybase.filter.bean.AllUrlFilter;
import com.example.springbootstudybase.filter.bean.GivenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * 过滤器
 * Created by yhb on 2022-01-26
 */
@Configuration
public class FilterConfig {

    @Autowired
    private AccountServiceImpl accountService;

    @Bean
    public FilterRegistrationBean<Filter> setFilterRegistrationBean1() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.setFilter(new AllUrlFilter(accountService));
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> setFilterRegistrationBean2() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.setFilter(new GivenFilter());
        filterRegistrationBean.addUrlPatterns("/filter/*");
        return filterRegistrationBean;
    }

}
