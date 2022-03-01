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

/*
 * Shiro 架构包含三个主要的理念：Subject,SecurityManager和 Realm
 * anon:未认证可以访问-org.apache.shiro.web.filter.authc.AnonymousFilter
 * authc:认证后可以访问-org.apache.shiro.web.filter.authc.FormAuthenticationFilter
 * perms:需要特定权限才能访问
 * roles:需要特定角色才能访问
 * user:需要特定用户才能访问
 * port:需要特定端口才能访问
 * reset:需要指定http请求才能访问
 */