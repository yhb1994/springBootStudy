/**
 * Created by yhb on 2022-01-26
 */
package com.example.springbootstudybase.filter;
/*
 * 过滤器 - 权限的验证、url、敏感词汇的过滤等
 * 返回数据的处理
 */

/*
 * 配置方式
 * 1、注解配置  @WebFilter @Order @ServletComponentScan("com.example.filter")   注解配置貌似order没用
 * 2、java配置 FilterConfig   需要自定义顺序执行必须采用java配置
 */