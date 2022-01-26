/**
 * Created by yhb on 2022-01-26
 */
package com.example.springbootstudybase.exception.inter;

/* Default.class
 * 标记接口#
 * 什么是Java Marker Interface标记接口呢？类似于Serializable，它就是JDK中的一个标记接口。
 * 对于标记接口来说，需要明确这不是Java语言所特有的，而是计算机科学中一种通用的设计理念。
 * 程序往往可以通过判断对象是否实现了某些标记接口，而判定该对象是否具有某些特征，使程序编写更为灵活。
 * 标记接口不具有任何的字段或方法，是一个空接口
 */

/*
 * groups属性用于多组校验 例如对于某一个字段,不同的类型需要做不用的校验处理
 */

/*
 * groups 的使用方式 - @Validated({UpdateOperation.class}
 */