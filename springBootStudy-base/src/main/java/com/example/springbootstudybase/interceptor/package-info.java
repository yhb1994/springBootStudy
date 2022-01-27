/**
 * Created by yhb on 2022-01-26
 */
package com.example.springbootstudybase.interceptor;
/*
 * 请求 - 先执行拦截器 -在执行过滤器
 * 配置
 * 拦截器：实现一个HandlerInterceptor类，或者是继承HandlerInterceptorAdapter(抽象类)
 * 注册器：实现WebMvcConfigurer 重写addInterceptors方法
 * preHandle - controller - postHandle - afterCompletion
 */

/*
 *  preHandle方法：此方法会在进入controller之前执行，返回Boolean值决定是否执行后续操作。
 *  postHandle方法：此方法将在controller执行之后执行，但是视图还没有解析，可向ModelAndView中添加数据(前后端不分离的)。
 *  afterCompletion方法：该方法会在整个请求结束（请求结束，但是并未返回结果给客户端）之后执行， 可获取响应数据及异常信息。
 */