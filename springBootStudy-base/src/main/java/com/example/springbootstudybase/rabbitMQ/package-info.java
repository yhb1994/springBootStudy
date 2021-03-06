/**
 * Created by yhb on 2022-03-02
 */
package com.example.springbootstudybase.rabbitMQ;

/*
 * 消息传递  AMQP(高级消息队列协议)应用层
 * rabbitMq的简单使用
 * AMQP的主要特征是面向消息、队列、路由（包括点对点和发布/订阅）、可靠性、安全
 *
 * 1、跨系统的异步通信，所有需要异步交互的地方都可以使用消息队列。就像我们除了打电话（同步）以外，还需要发短信，发电子邮件（异步）的通讯方式。
  2、多个应用之间的耦合，由于消息是平台无关和语言无关的，而且语义上也不再是函数调用，因此更适合作为多个应用之间的松耦合的接口。基于消息队列的耦合，不需要发送方和接收方同时在线。在企业应用集成（EAI）中，文件传输，共享数据库，消息队列，远程过程调用都可以作为集成的方法。
  3、应用内的同步变异步，比如订单处理，就可以由前端应用将订单信息放到队列，后端应用从队列里依次获得消息处理，高峰时的大量订单可以积压在队列里慢慢处理掉。由于同步通常意味着阻塞，而大量线程的阻塞会降低计算机的性能。
  4、消息驱动的架构（EDA），系统分解为消息队列，和消息制造者和消息消费者，一个处理流程可以根据需要拆成多个阶段（Stage），阶段之间用队列连接起来，前一个阶段处理的结果放入队列，后一个阶段从队列中获取消息继续处理。
  5、应用需要更灵活的耦合方式，如发布订阅，比如可以指定路由规则。
  6、跨局域网，甚至跨城市的通讯（CDN行业），比如北京机房与广州机房的应用程序的通信。
 */