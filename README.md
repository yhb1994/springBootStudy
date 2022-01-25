**项目结构**
```
investment
├─db  项目SQL语句
│
├─common 公共模块
│  ├─annotation 日志注解
│  ├─aspect 系统日志/redis
│  ├─bank 银行基本信息
│  ├─constant 基础类型
│  ├─converter 数据转换
│  ├─excel excel基础配置
│  ├─exception 异常处理
│  ├─file 附件
│  ├─utils 基础处理类
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─datasource 多数据源配置
│ 
├─modules 功能模块
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─InvestmentApplication 项目启动类
│  
├──resources 
│  ├─excel 季报、年报、半年报等模板
│  ├─file 上传文件模板
│  ├─flowable 工作流对应的XML文件
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源


```
<br> 

**技术选型：**
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 工作流框架：Flowable 6.5.0
- 定时器：Quartz 2.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
- 页面交互：Vue2.x
- 接口交互记录：Swagger 2.7.0
<br>


**后端部署**
- 通过git下载源码
- idea、eclipse需安装lombok插件，不然会提示找不到entity的get set方法
- 创建数据库investment，数据库编码为UTF-8
- 执行db/mysql.sql文件，初始化数据
- 修改application-dev.yml，更新MySQL账号和密码
- Eclipse、IDEA运行InvestmentApplication.java，则可启动项目
- 文档路径：http://localhost:8080/doc.html
- Swagger文档路径：http://localhost:8080/swagger/index.html
- Swagger注解路径：http://localhost:8080/swagger-ui.html

**学习计划**
1、springboot 快速入门，功能了解、配置、框架结构
    项目结构
    spring mvc
2、springboot web开发
    整合swagger
    使用模板引擎渲染web视图
    统一异常处理
3、springboot 数据访问
    简单api
    多数据源配置
    事务管理
4、springboot 缓存支持
    redis
5、springboot 安全管理
    springSecurity
6、springboot 日志管理
    日志配置
    整合实现日志管理
    使用aop实现统一日志请求
7、springboot 监控管理
    actuator 模块解析
    actuator 模块与spring应用整合
8、springboot 运行管理、邮件
    定时任务、异步调用
    邮件发送
    后台运行配置


首先 - spring framework->spring 原理、配置 ->spring boot autoconfigration 

springboot 需要添加配置的话，需要pom文件配置启动类