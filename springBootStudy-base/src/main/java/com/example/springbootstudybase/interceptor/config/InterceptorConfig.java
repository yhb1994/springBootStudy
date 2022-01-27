package com.example.springbootstudybase.interceptor.config;

import com.example.springbootstudybase.interceptor.handler.FirstInterceptorHandler;
import com.example.springbootstudybase.interceptor.handler.SecondInterceptorHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by yhb on 2022-01-27
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptorHandler())
                .addPathPatterns("/**")//拦截所有的路径
                .excludePathPatterns("/LoginController/login");
        registry.addInterceptor(new SecondInterceptorHandler())
                .addPathPatterns("/**")//拦截所有的路径
                .excludePathPatterns("/LoginController/login");
    }

}
