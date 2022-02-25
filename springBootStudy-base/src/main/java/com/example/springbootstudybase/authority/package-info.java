/**
 * Created by yhb on 2022-02-14
 */
package com.example.springbootstudybase.authority;
/*
 * 此部分介绍权限管理
 * Apache Shiro与Spring Security的各自实现、区别
 * Apache Shiro:功能(认证，授权，加减密，会话管理)，核心组件（subject(用户)，securityManager(安全管理器)，realms(获取数据)）
 *      实现方式
 *          1、 在程序中通过Subject编程方式进行权限控制
 *          2、 配置Filter实现URL级别粗粒度权限控制
 *          3、 配置代理，基于注解实现细粒度权限控制
 *          4、 在页面中使用shiro自定义标签实现 页面显示权限控制
 * Spring Security:Spring Security拦截器(IOC AOP)声明式的安全访问控制功能
 */