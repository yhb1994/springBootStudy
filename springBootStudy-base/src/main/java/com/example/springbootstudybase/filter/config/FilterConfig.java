package com.example.springbootstudybase.filter.config;

import com.example.springbootstudybase.filter.bean.AllUrlFilter;
import com.example.springbootstudybase.filter.bean.GivenFilter;
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
    @Bean
    public FilterRegistrationBean<Filter> setFilterRegistrationBean1() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.setFilter(new AllUrlFilter());
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
