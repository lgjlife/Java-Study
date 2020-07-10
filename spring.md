

<span id="menu"></span>

<!-- TOC -->

- [1. Spring](#1-spring)
  - [1.1. Spring模块](#11-spring模块)
  - [1.2. Spring体系其他模块](#12-spring体系其他模块)
  - [1.3. 版本特性变化](#13-版本特性变化)
  - [1.4. 常用注解](#14-常用注解)
    - [1.4.1. Spring部分](#141-spring部分)
    - [1.4.2. SpringMVC部分](#142-springmvc部分)
  - [1.5. 资源访问](#15-资源访问)
    - [1.5.1. 接口以及实现类说明](#151-接口以及实现类说明)
    - [1.5.2. 资源地址的表示](#152-资源地址的表示)
  - [1.6. IOC容器](#16-ioc容器)
    - [1.6.1. 控制反转和依赖注入](#161-控制反转和依赖注入)
    - [1.6.2. 依赖注入方式](#162-依赖注入方式)
      - [1.6.2.1. setter注入与构造方法注入](#1621-setter注入与构造方法注入)
      - [1.6.2.2. 自动注入方式](#1622-自动注入方式)
  - [1.7. IOC容器](#17-ioc容器)
    - [1.7.1. IOC 容器的设计](#171-ioc-容器的设计)
    - [1.7.2. BeanFactory接口以及实现类说明](#172-beanfactory接口以及实现类说明)
      - [1.7.2.1. BeanDefinition](#1721-beandefinition)
        - [1.7.2.1.1. AbstractBeanDefinition](#17211-abstractbeandefinition)
        - [1.7.2.1.2. RootBeanDefinition](#17212-rootbeandefinition)
      - [1.7.2.2. BeanFactory](#1722-beanfactory)
      - [1.7.2.3. ApplicationContext](#1723-applicationcontext)
        - [1.7.2.3.1. 基本介绍](#17231-基本介绍)
        - [1.7.2.3.2. 启动介绍](#17232-启动介绍)
      - [1.7.2.4. WebApplicationContext](#1724-webapplicationcontext)
      - [1.7.2.5. 父子容器](#1725-父子容器)
      - [1.7.2.6. DefaultListableBeanFactory](#1726-defaultlistablebeanfactory)
      - [1.7.2.7. HierarchicalBeanFactory](#1727-hierarchicalbeanfactory)
      - [1.7.2.8. SimpleJndiBeanFactory](#1728-simplejndibeanfactory)
      - [1.7.2.9. AutowireCapableBeanFactory](#1729-autowirecapablebeanfactory)
      - [1.7.2.10. ListableBeanFactory](#17210-listablebeanfactory)
      - [1.7.2.11. ConfigurableBeanFactory](#17211-configurablebeanfactory)
      - [1.7.2.12. ConfigurableListableBeanFactory](#17212-configurablelistablebeanfactory)
      - [1.7.2.13. BeanDefinitionRegistry](#17213-beandefinitionregistry)
      - [1.7.2.14. 单例管理接口SingletonBeanRegistry](#17214-单例管理接口singletonbeanregistry)
        - [1.7.2.14.1. AliasRegistry](#172141-aliasregistry)
        - [1.7.2.14.2. SingletonBeanRegistry](#172142-singletonbeanregistry)
        - [1.7.2.14.3. DefaultSingletonBeanRegistry](#172143-defaultsingletonbeanregistry)
    - [1.7.3. Bean创建过程](#173-bean创建过程)
    - [1.7.4. Bean的作用域](#174-bean的作用域)
    - [1.7.5. Bean的生命周期](#175-bean的生命周期)
  - [1.8. 切面编程AOP](#18-切面编程aop)
    - [1.8.1. AOP概述](#181-aop概述)
    - [1.8.2. 切点函数](#182-切点函数)
      - [1.8.2.1. 常用切点函数](#1821-常用切点函数)
      - [1.8.2.2. 通配符](#1822-通配符)
      - [1.8.2.3. 逻辑运算符](#1823-逻辑运算符)
    - [1.8.3. 切点函数详解](#183-切点函数详解)
      - [1.8.3.1. @annotation()](#1831-annotation)
      - [1.8.3.2. execution()](#1832-execution)
      - [1.8.3.3. args和@args()](#1833-args和args)
      - [1.8.3.4. within()](#1834-within)
      - [1.8.3.5. @within()和@target()](#1835-within和target)
      - [1.8.3.6. target()和this()](#1836-target和this)
    - [1.8.4. 切点函数高级用法](#184-切点函数高级用法)
      - [1.8.4.1. 切点复合运算](#1841-切点复合运算)
      - [1.8.4.2. 命名切点](#1842-命名切点)
      - [1.8.4.3. 增强织入的顺序](#1843-增强织入的顺序)
      - [1.8.4.4. 访问连接点信息](#1844-访问连接点信息)
      - [1.8.4.5. 绑定连接点方法入参](#1845-绑定连接点方法入参)
      - [1.8.4.6. 绑定代理对象](#1846-绑定代理对象)
      - [1.8.4.7. 绑定类注解对象](#1847-绑定类注解对象)
      - [1.8.4.8. 绑定返回值](#1848-绑定返回值)
      - [1.8.4.9. 绑定抛出的异常](#1849-绑定抛出的异常)
    - [1.8.5. Spring AOP案例](#185-spring-aop案例)
    - [1.8.6. 实现原理](#186-实现原理)
      - [1.8.6.1. 五种通知的执行顺序](#1861-五种通知的执行顺序)
      - [1.8.6.2. 代理实现](#1862-代理实现)
  - [1.9. Spring对DAO的支持](#19-spring对dao的支持)
    - [1.9.1. Spring DAO理念](#191-spring-dao理念)
    - [1.9.2. 统一的异常体系](#192-统一的异常体系)
    - [1.9.3. 统一的数据访问模板](#193-统一的数据访问模板)
    - [1.9.4. 数据源](#194-数据源)
  - [1.10. Spring事务管理](#110-spring事务管理)
    - [1.10.1. 数据库事务基础知识](#1101-数据库事务基础知识)
    - [1.10.2. Jdbc对事务的支持](#1102-jdbc对事务的支持)
    - [1.10.3. Spring对事务的支持](#1103-spring对事务的支持)
      - [1.10.3.1. 编程式事务管理](#11031-编程式事务管理)
      - [1.10.3.2. 使用XML配置声明式事务](#11032-使用xml配置声明式事务)
      - [1.10.3.3. 使用注解配置事务](#11033-使用注解配置事务)
    - [1.10.4. Spring事务实现原理](#1104-spring事务实现原理)
      - [1.10.4.1. 事务管理关键抽象](#11041-事务管理关键抽象)
        - [1.10.4.1.1. TransactionDefinition](#110411-transactiondefinition)
        - [1.10.4.1.2. TransactionStatus](#110412-transactionstatus)
        - [1.10.4.1.3. PlatformTransactionManager](#110413-platformtransactionmanager)
    - [1.10.5. 事务管理器实现类](#1105-事务管理器实现类)
      - [1.10.5.1. Spring事务执行流程](#11051-spring事务执行流程)
        - [1.10.5.1.1. 基本原理](#110511-基本原理)
        - [1.10.5.1.2. 代理类](#110512-代理类)
        - [1.10.5.1.3. TransactionAspectSupport中的处理](#110513-transactionaspectsupport中的处理)
        - [1.10.5.1.4. 事务管理类DataSourceTransactionManager](#110514-事务管理类datasourcetransactionmanager)
    - [1.10.6. 事务同步管理器](#1106-事务同步管理器)
    - [1.10.7. 事务传播行为](#1107-事务传播行为)
      - [1.10.7.1. 事务传播行为说明](#11071-事务传播行为说明)
      - [1.10.7.2. 具体说明](#11072-具体说明)
        - [1.10.7.2.1. PROPAGATION_REQUIRED](#110721-propagation_required)
        - [1.10.7.2.2. PROPAGATION_REQUIRES_NEW](#110722-propagation_requires_new)
        - [1.10.7.2.3. PROPAGATION_SUPPORTS](#110723-propagation_supports)
        - [1.10.7.2.4. PROPAGATION_MANDATORY](#110724-propagation_mandatory)
        - [1.10.7.2.5. PROPAGATION_NOT_SUPPORTED](#110725-propagation_not_supported)
        - [1.10.7.2.6. PROPAGATION_NEVER](#110726-propagation_never)
        - [1.10.7.2.7. PROPAGATION_NESTED](#110727-propagation_nested)
    - [1.10.8. 使用场景](#1108-使用场景)
  - [1.11. Spring常用工具类](#111-spring常用工具类)
    - [1.11.1. web](#1111-web)
    - [1.11.2. 内置的resouce类型](#1112-内置的resouce类型)
    - [1.11.3. 工具类](#1113-工具类)
    - [1.11.4. xml工具](#1114-xml工具)
    - [1.11.5. 其它工具集](#1115-其它工具集)
- [2. Spring 表达式语言](#2-spring-表达式语言)
- [3. Spring Cache](#3-spring-cache)
  - [3.1. Cache 的组件和概念](#31-cache-的组件和概念)
  - [3.2. 几个重要概念&缓存注解](#32-几个重要概念缓存注解)
  - [3.3. 集成 Spring Cache](#33-集成-spring-cache)
  - [3.4. 缓存管理器](#34-缓存管理器)
    - [3.4.1. SimpleCacheManager](#341-simplecachemanager)
    - [3.4.2. NoOpCacheManager](#342-noopcachemanager)
    - [3.4.3. ConcurrentMapCacheManager](#343-concurrentmapcachemanager)
    - [3.4.4. CompositeCacheManager](#344-compositecachemanager)
  - [3.5. SpEL上下文数据](#35-spel上下文数据)
  - [3.6. 基本使用](#36-基本使用)
  - [3.7. 使用Redis Cache](#37-使用redis-cache)
  - [3.8. 实现Redis二级缓存](#38-实现redis二级缓存)
    - [3.8.1. 实现 TwolevelCacheManager](#381-实现-twolevelcachemanager)
- [4. Spring Boot Admin](#4-spring-boot-admin)
  - [4.1. 基础认识](#41-基础认识)
  - [4.2. 使用实例](#42-使用实例)
    - [4.2.1. Server应用](#421-server应用)
    - [4.2.2. Client应用](#422-client应用)
    - [4.2.3. Client配置说明](#423-client配置说明)
    - [4.2.4. 集群](#424-集群)
    - [4.2.5. 集成spring security](#425-集成spring-security)
    - [4.2.6. 集成邮箱报警功能](#426-集成邮箱报警功能)
- [5. Spring Security](#5-spring-security)
  - [5.1. 简介](#51-简介)
  - [5.2. 提供的功能](#52-提供的功能)
  - [5.3. 核心类](#53-核心类)
  - [5.4. CSRF防护](#54-csrf防护)
    - [5.4.1. 跨域攻击说明](#541-跨域攻击说明)
    - [5.4.2. SpringBoot配置](#542-springboot配置)
    - [5.4.3. 源码分析](#543-源码分析)
- [6. Sppring MVC](#6-sppring-mvc)
  - [6.1. MVC体系概述](#61-mvc体系概述)
    - [6.1.1. MVC 架构](#611-mvc-架构)
  - [6.2. Restful](#62-restful)
    - [6.2.1. URL 设计](#621-url-设计)
    - [6.2.2. 状态码](#622-状态码)
    - [6.2.3. 服务器回应](#623-服务器回应)
  - [6.3. 注解说明](#63-注解说明)
  - [6.4. 拦截器](#64-拦截器)
  - [6.5. 过滤器](#65-过滤器)
    - [6.5.1. 过滤器和拦截器的区别：](#651-过滤器和拦截器的区别)
    - [6.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途](#652-拦截器interceptor和过滤器filter的一些用途)
  - [* Mime-type chain Filter](#ullimime-type-chain-filterliul)
  - [6.6. WebDataBinder](#66-webdatabinder)
- [7. Webflux](#7-webflux)
  - [7.1. 概述](#71-概述)
    - [7.1.1. SpringMVC与SpringWebFlux](#711-springmvc与springwebflux)
    - [7.1.2. Reactive Spring Web](#712-reactive-spring-web)
  - [7.2. 基本例子](#72-基本例子)
  - [7.3. Mono常用方法说明](#73-mono常用方法说明)
- [8. SpringBoot](#8-springboot)
  - [8.1. 基本概念](#81-基本概念)
  - [8.2. 基本使用](#82-基本使用)
  - [8.3. SpringBoot DevTools 的用途是什么？](#83-springboot-devtools-的用途是什么)
  - [8.4. Spring Boot 环境下创建Bean](#84-spring-boot-环境下创建bean)
    - [8.4.1. 方式1:使用@Component等注解：](#841-方式1使用component等注解)
    - [8.4.2. 方式2:使用@Bean注解](#842-方式2使用bean注解)
    - [8.4.3. 方式3:使用@Import注解](#843-方式3使用import注解)
    - [8.4.4. 方式4:使用ImportSelector接口](#844-方式4使用importselector接口)
    - [8.4.5. 方式5:手动注册到容器](#845-方式5手动注册到容器)
  - [8.5. 使用不同的WEB容器](#85-使用不同的web容器)
  - [8.6. 配置文件](#86-配置文件)
    - [8.6.1. bootstrap.yml与application.yml区别](#861-bootstrapyml与applicationyml区别)
    - [8.6.2. 多环境配置](#862-多环境配置)
      - [8.6.2.1. 配置文件](#8621-配置文件)
      - [8.6.2.2. 多环境配置](#8622-多环境配置)
    - [8.6.3. 注解ConfigurationProperties注入yml配置文件中的数据](#863-注解configurationproperties注入yml配置文件中的数据)
      - [8.6.3.1. Spring 宽松绑定规则 (relaxed binding)](#8631-spring-宽松绑定规则-relaxed-binding)
      - [8.6.3.2. 基本使用](#8632-基本使用)
      - [8.6.3.3. 带验证的配置](#8633-带验证的配置)
      - [8.6.3.4. @ConfigurationProperties vs. @Value](#8634-configurationproperties-vs-value)
    - [8.6.4. 使用随机数](#864-使用随机数)
    - [8.6.5. 从命令行指定参数](#865-从命令行指定参数)
    - [8.6.6. 配置日志](#866-配置日志)
  - [8.7. 启动类 @SpringBootApplication 注解](#87-启动类-springbootapplication-注解)
    - [8.7.1. @Inherited 注解](#871-inherited-注解)
    - [8.7.2. @SpringBootConfiguration](#872-springbootconfiguration)
    - [8.7.3. @EnableAutoConfiguration](#873-enableautoconfiguration)
    - [8.7.4. @ComponentScan](#874-componentscan)
  - [8.8. 条件化注解](#88-条件化注解)
  - [8.9. Spring Boot Starter](#89-spring-boot-starter)
    - [8.9.1. 常用的Starter](#891-常用的starter)
    - [8.9.2. 创建自己的Starter](#892-创建自己的starter)
    - [8.9.3. Starter原理](#893-starter原理)
  - [8.10. Actuator 的端点](#810-actuator-的端点)
    - [8.10.1. 揭秘 Actuator 的端点](#8101-揭秘-actuator-的端点)
    - [8.10.2. 自定义监控](#8102-自定义监控)
  - [8.11. Spring Boot 项目发布](#811-spring-boot-项目发布)
  - [8.12. Maven打包](#812-maven打包)
  - [8.13. Spring Boot原理分析](#813-spring-boot原理分析)
    - [8.13.1. 启动流程分析](#8131-启动流程分析)
      - [8.13.1.1. 创建SpringApplication对象](#81311-创建springapplication对象)
      - [8.13.1.2. 执行Run方法](#81312-执行run方法)
  - [8.14. 种保护 Spring Boot 应用的绝佳方法](#814-种保护-spring-boot-应用的绝佳方法)
    - [8.14.1. 在生产中使用HTTPS](#8141-在生产中使用https)
    - [8.14.2. 使用Snyk检查你的依赖关系](#8142-使用snyk检查你的依赖关系)
    - [8.14.3. 升级到最新版本](#8143-升级到最新版本)
    - [8.14.4. 启用CSRF保护](#8144-启用csrf保护)
    - [8.14.5. 使用内容安全策略防止XSS攻击](#8145-使用内容安全策略防止xss攻击)
    - [8.14.6. 使用OpenID Connect进行身份验证](#8146-使用openid-connect进行身份验证)
    - [8.14.7. 管理密码？使用密码哈希！](#8147-管理密码使用密码哈希)
    - [8.14.8. 安全地存储秘密](#8148-安全地存储秘密)
    - [8.14.9. 使用OWASP的ZAP测试您的应用程序](#8149-使用owasp的zap测试您的应用程序)
    - [8.14.10. 让你的安全团队进行代码审查](#81410-让你的安全团队进行代码审查)
  - [8.15. 项目实践](#815-项目实践)
    - [8.15.1. 访问数据库](#8151-访问数据库)
    - [8.15.2. 跨域配置](#8152-跨域配置)
    - [8.15.3. 全局异常处理](#8153-全局异常处理)
  - [8.16. 其他一些问题](#816-其他一些问题)
    - [8.16.1. 如何在 Spring Boot 启动的时候运行一些特定的代码？](#8161-如何在-spring-boot-启动的时候运行一些特定的代码)
    - [8.16.2. 如何重新加载Spring Boot上的更改，而无需重新启动服务器？](#8162-如何重新加载spring-boot上的更改而无需重新启动服务器)
    - [8.16.3. Spring Boot 有哪几种读取配置的方式？](#8163-spring-boot-有哪几种读取配置的方式)
- [9. 安全](#9-安全)
  - [9.1. Spring Security](#91-spring-security)
    - [9.1.1. 基本使用](#911-基本使用)
    - [9.1.2. 核心组件](#912-核心组件)
      - [9.1.2.1. Ａuthentication](#9121-ａuthentication)
      - [9.1.2.2. Userdetails](#9122-userdetails)
      - [9.1.2.3. UserDetailsService](#9123-userdetailsservice)
      - [9.1.2.4. AuthenticationProvider](#9124-authenticationprovider)
      - [9.1.2.5. AuthenticationManager](#9125-authenticationmanager)
  - [9.2. Oauth2](#92-oauth2)
    - [9.2.1. JSON Web Token(JWT)知识](#921-json-web-tokenjwt知识)
      - [9.2.1.1. 使用场景](#9211-使用场景)
      - [9.2.1.2. 组成部分](#9212-组成部分)
      - [9.2.1.3. 工作流程](#9213-工作流程)
    - [9.2.2. Oauth2](#922-oauth2)
      - [9.2.2.1. 协议流Protocol Flow](#9221-协议流protocol-flow)
      - [9.2.2.2. Authorization Grant](#9222-authorization-grant)
      - [9.2.2.3. Client Registration](#9223-client-registration)
      - [9.2.2.4. Protocol Endpoints](#9224-protocol-endpoints)
      - [9.2.2.5. 客户端授权类型: Obtaining Authorization](#9225-客户端授权类型-obtaining-authorization)
        - [9.2.2.5.1. 授权码方式:Authorization Code Grant](#92251-授权码方式authorization-code-grant)
        - [9.2.2.5.2. Implicit Grant](#92252-implicit-grant)
        - [9.2.2.5.3. Resource Owner Password Credentials Grant](#92253-resource-owner-password-credentials-grant)
        - [9.2.2.5.4. Client Credentials Grant](#92254-client-credentials-grant)
        - [9.2.2.5.5. 令牌的使用](#92255-令牌的使用)
        - [9.2.2.5.6. 更新令牌](#92256-更新令牌)
      - [9.2.2.6. Issuing an Access Token](#9226-issuing-an-access-token)
      - [9.2.2.7. Refreshing an Access Token](#9227-refreshing-an-access-token)
  - [9.3. Spring security + Spring gateway + Oauth2 整合](#93-spring-security--spring-gateway--oauth2-整合)
    - [9.3.1. 网关层　Spring gateway](#931-网关层spring-gateway)
      - [9.3.1.1. 依赖引入](#9311-依赖引入)
      - [9.3.1.2. 配置](#9312-配置)
    - [9.3.2. 授权服务器](#932-授权服务器)
- [10. SpringCloud](#10-springcloud)
  - [10.1. 基础知识](#101-基础知识)
    - [10.1.1. 微服务概念](#1011-微服务概念)
    - [10.1.2. SpringCloud子项目](#1012-springcloud子项目)
    - [10.1.3. 版本说明](#1013-版本说明)
  - [10.2. 服务治理Eureka](#102-服务治理eureka)
    - [10.2.1. 基本使用](#1021-基本使用)
    - [10.2.2. 高可用注册中心](#1022-高可用注册中心)
    - [9.2.3. 原理说明](#923-原理说明)
      - [9.2.3.1. 基础模块说明](#9231-基础模块说明)
      - [9.2.3.2. Region,Zone](#9232-regionzone)
      - [9.2.3.3. 源码分析](#9233-源码分析)
        - [9.2.3.3.1. EnableDiscoveryClient注解说明](#92331-enablediscoveryclient注解说明)
        - [9.2.3.3.2. 服务注册](#92332-服务注册)
        - [9.2.3.3.3. 服务续约](#92333-服务续约)
    - [9.2.4. 更多配置说明](#924-更多配置说明)
      - [9.2.4.1. 服务注册类配置](#9241-服务注册类配置)
      - [9.2.4.2. 服务实例类配置](#9242-服务实例类配置)
  - [9.3. 负载均衡Ribbon](#93-负载均衡ribbon)
    - [9.3.1. 基本使用](#931-基本使用)
    - [9.3.2. 原理说明](#932-原理说明)
      - [9.3.2.1. 源码分析](#9321-源码分析)
      - [9.3.2.2. 负载均衡器](#9322-负载均衡器)
      - [9.3.2.3. 负载均衡策略](#9323-负载均衡策略)
      - [9.3.2.4. 配置详解](#9324-配置详解)
    - [9.3.3. ribbon配置](#933-ribbon配置)
      - [9.3.3.1. 配置参数说明](#9331-配置参数说明)
      - [9.3.3.2. 重试机制](#9332-重试机制)
  - [9.4. 声明式服务调用feign](#94-声明式服务调用feign)
    - [9.4.1. 使用案例](#941-使用案例)
    - [9.4.2. 实现原理](#942-实现原理)
      - [9.4.2.1. 配置类](#9421-配置类)
      - [9.4.2.2. 启动注解说明](#9422-启动注解说明)
      - [9.4.2.3. 调用实现原理](#9423-调用实现原理)
      - [9.4.2.4. 总结](#9424-总结)
  - [9.5. 服务容错保护 Hystrix](#95-服务容错保护-hystrix)
    - [9.5.1. Ribbon中使用Hystrix](#951-ribbon中使用hystrix)
    - [9.5.2. Feign中使用Hystrix](#952-feign中使用hystrix)
    - [9.5.3. Hystrix详解](#953-hystrix详解)
      - [9.5.3.1. 背景](#9531-背景)
      - [9.5.3.2. 基本认识](#9532-基本认识)
      - [9.5.3.3. hystrix适用场景](#9533-hystrix适用场景)
      - [9.5.3.4. 注解说明](#9534-注解说明)
      - [9.5.3.5. 如何使用](#9535-如何使用)
        - [9.5.3.5.1. 基本的实例](#95351-基本的实例)
        - [9.5.3.5.2. 同步执行](#95352-同步执行)
        - [9.5.3.5.3. 异步执行](#95353-异步执行)
        - [9.5.3.5.4. Reactive Execution](#95354-reactive-execution)
        - [9.5.3.5.5. Reactive Commands](#95355-reactive-commands)
        - [9.5.3.5.6. Fallback](#95356-fallback)
        - [9.5.3.5.7. Error Propagation](#95357-error-propagation)
        - [9.5.3.5.8. Command Name](#95358-command-name)
        - [9.5.3.5.9. Command Group](#95359-command-group)
        - [9.5.3.5.10. Command Thread-Pool](#953510-command-thread-pool)
        - [9.5.3.5.11. Request Cache](#953511-request-cache)
        - [9.5.3.5.12. Request Collapsing](#953512-request-collapsing)
        - [9.5.3.5.13. Request Context Setup](#953513-request-context-setup)
        - [9.5.3.5.14. Common Patterns](#953514-common-patterns)
        - [9.5.3.5.15. Fail Silent](#953515-fail-silent)
        - [9.5.3.5.16. Fallback: Static](#953516-fallback-static)
        - [9.5.3.5.17. Fallback: Stubbed](#953517-fallback-stubbed)
        - [9.5.3.5.18. Fallback: Cache via Network](#953518-fallback-cache-via-network)
        - [9.5.3.5.19. Primary + Secondary with Fallback](#953519-primary--secondary-with-fallback)
        - [9.5.3.5.20. Client Doesn't Perform Network Access](#953520-client-doesnt-perform-network-access)
        - [9.5.3.5.21. Get-Set-Get with Request Cache Invalidation](#953521-get-set-get-with-request-cache-invalidation)
        - [9.5.3.5.22. Get-Set-Get with Request Cache Invalidation](#953522-get-set-get-with-request-cache-invalidation)
      - [9.5.3.6. 工作原理](#9536-工作原理)
    - [9.5.4. Spring Cloud 中使用Hystrix原理](#954-spring-cloud-中使用hystrix原理)
    - [9.5.5. Hystrix监控](#955-hystrix监控)
  - [9.6. API网关服务](#96-api网关服务)
    - [9.6.1. zuul](#961-zuul)
    - [9.6.2. GateWay](#962-gateway)
  - [9.7. 分布式配置中心Config](#97-分布式配置中心config)
    - [9.7.1. 基本使用](#971-基本使用)
      - [9.7.1.1. 配置中心](#9711-配置中心)
      - [9.7.1.2. bootstrap.yml与application.yml区别](#9712-bootstrapyml与applicationyml区别)
      - [9.7.1.3. 客户端配置](#9713-客户端配置)
      - [9.7.1.4. 刷新配置](#9714-刷新配置)
    - [9.7.2. 原理说明](#972-原理说明)
    - [9.7.3. 更多使用方式](#973-更多使用方式)
  - [9.8. 消息总线bus](#98-消息总线bus)
    - [9.8.1. 消息代理](#981-消息代理)
  - [9.9. 消息驱动的微服务Stream](#99-消息驱动的微服务stream)
  - [9.10. 分布式服务跟踪Sleuth](#910-分布式服务跟踪sleuth)
    - [9.10.1. 基本使用](#9101-基本使用)
    - [9.10.2. 跟踪原理](#9102-跟踪原理)
      - [9.10.2.1. 基本实现原理](#91021-基本实现原理)
      - [9.10.2.2. 支持的组件](#91022-支持的组件)
      - [9.10.2.3. 一些基本概念](#91023-一些基本概念)
      - [9.10.2.4. zipkin](#91024-zipkin)
      - [9.10.2.5. 调用过程](#91025-调用过程)
- [10. 单元测试](#10-单元测试)
  - [10.1. Junit](#101-junit)
    - [10.1.1. 概述](#1011-概述)
    - [10.1.2. JUnit 中的重要的 API](#1012-junit-中的重要的-api)
    - [10.1.3. 常用注解](#1013-常用注解)
    - [10.1.4. 套件测试](#1014-套件测试)
  - [10.2. TestNG测试](#102-testng测试)
    - [10.2.1. 概述](#1021-概述)
    - [10.2.2. JUnit 4 Vs TestNG比较](#1022-junit-4-vs-testng比较)
    - [10.2.3. 注解说明](#1023-注解说明)
    - [10.2.4. 测试案例](#1024-测试案例)
      - [10.2.4.1. 基本例子](#10241-基本例子)
      - [10.2.4.2. 预期异常测试](#10242-预期异常测试)
      - [10.2.4.3. 忽略测试](#10243-忽略测试)
      - [10.2.4.4. 超时测试](#10244-超时测试)
      - [10.2.4.5. 分组测试](#10245-分组测试)
  - [10.3. Mockito](#103-mockito)
    - [10.3.1. 介绍](#1031-介绍)
    - [10.3.2. Mockito说明](#1032-mockito说明)
    - [10.3.3. 例子](#1033-例子)
      - [10.3.3.1. 基本的例子](#10331-基本的例子)
      - [10.3.3.2. 验证行为](#10332-验证行为)
      - [10.3.3.3. 模拟我们所期望的结果](#10333-模拟我们所期望的结果)
      - [10.3.3.4. RETURNS_SMART_NULLS和RETURNS_DEEP_STUBS](#10334-returns_smart_nulls和returns_deep_stubs)
      - [10.3.3.5. 模拟方法体抛出异常](#10335-模拟方法体抛出异常)
      - [10.3.3.6. 使用注解来快速模拟](#10336-使用注解来快速模拟)
      - [10.3.3.7. 参数匹配](#10337-参数匹配)
      - [10.3.3.8. 自定义参数匹配](#10338-自定义参数匹配)
      - [10.3.3.9. 捕获参数来进一步断言](#10339-捕获参数来进一步断言)
      - [10.3.3.10. 使用方法预期回调接口生成期望值（Answer结构）](#103310-使用方法预期回调接口生成期望值answer结构)
      - [10.3.3.11. 修改对未预设的调用返回默认期望](#103311-修改对未预设的调用返回默认期望)
      - [10.3.3.12. 用spy监控真实对象](#103312-用spy监控真实对象)
      - [10.3.3.13. 真实的部分mock](#103313-真实的部分mock)
      - [10.3.3.14. 重置mock](#103314-重置mock)
      - [10.3.3.15. 验证确切的调用次数](#103315-验证确切的调用次数)
      - [10.3.3.16. 连续调用](#103316-连续调用)
      - [10.3.3.17. 验证执行顺序](#103317-验证执行顺序)
      - [10.3.3.18. 确保模拟对象上无互动发生](#103318-确保模拟对象上无互动发生)
      - [10.3.3.19. 找出冗余的互动(即未被验证到的)](#103319-找出冗余的互动即未被验证到的)
    - [10.3.4. Mockito如何实现Mock[3]](#1034-mockito如何实现mock3)
  - [10.4. 控制层测试](#104-控制层测试)
    - [10.4.1. 基本使用](#1041-基本使用)
      - [10.4.1.1. 依赖](#10411-依赖)
      - [10.4.1.2. 基本使用](#10412-基本使用)
      - [10.4.1.3. 比较 MVC 的返回结果](#10413-比较-mvc-的返回结果)
      - [10.4.1.4. 完整例子](#10414-完整例子)
    - [10.4.2. 相关类说明](#1042-相关类说明)
      - [10.4.2.1. MockMvcBuilder/MockMvcBuilders](#10421-mockmvcbuildermockmvcbuilders)
      - [10.4.2.2. MockMvc](#10422-mockmvc)
      - [10.4.2.3. RequestBuilder/MockMvcRequestBuilders](#10423-requestbuildermockmvcrequestbuilders)
      - [10.4.2.4. ResultActions](#10424-resultactions)
      - [10.4.2.5. ResultMatcher/MockMvcResultMatchers](#10425-resultmatchermockmvcresultmatchers)
      - [10.4.2.6. ResultHandler/MockMvcResultHandlers](#10426-resulthandlermockmvcresulthandlers)
      - [10.4.2.7. MvcResult](#10427-mvcresult)
    - [10.4.3. 测试运行中的应用程序](#1043-测试运行中的应用程序)
  - [10.5. 服务层测试](#105-服务层测试)
  - [10.6. DAO层测试](#106-dao层测试)
  - [10.7. SpringBoot实现单元测试时回滚事务](#107-springboot实现单元测试时回滚事务)

<!-- /TOC -->

# 1. Spring
<a href="#menu" >目录</a>

## 1.1. Spring模块

* 数据访问与集成
    * JDBC
    * Transaction
    * ORM
    * OXM
    * Messaging
    * JMS
* Web与远程调用
    * Web
    * Web servlet
    * Web portlet
    * Web Socket
* 面向切面编程
    * AOP
    * Aspects
* Instrumentation
    * Instrument
    * Instrument Tomcat
* Spring核心容器
    * Beans
    * Core
    * Context
    * Expression
    * Context support
* 测试
    * Test

**Spring核心容器**
容器是Spring框架最核心的部分，它管理着Spring应用中bean的创建、配置和管理。在该模块中，包括了Spring bean工厂，它为Spring提供了DI的功能。基于bean工厂，我们还会发现有多种
Spring应用上下文的实现，每一种都提供了配置Spring的不同方式。除了bean工厂和应用上下文，该模块也提供了许多企业服务，例如E-mail、JNDI访问、EJB集成和调度。所有的Spring模块都构建于核心容器之上。当你配置应用时，其实你隐式地使用了这些类。

**Spring的AOP模块**
在AOP模块中，Spring对面向切面编程提供了丰富的支持。这个模块是Spring应用系统中开发切面的基础。与DI一样，AOP可以帮助应用对象解耦。借助于AOP，可以将遍布系统的关注点（例如事务和安全）从它们所应用的对象中解耦出来问题。该模块在多种数据库服务的错误信息之上构建了一个语义丰富的异常层，以后我们再
也不需要解释那些隐晦专有的SQL错误信息了！

对于那些更喜欢ORM（Object-Relational Mapping）工具而不愿意直接使用JDBC的开发者，Spring提供了ORM模块。Spring的ORM模块建立在对DAO的支持之上，并为多个ORM框架提供了一种构建DAO的简便方式。Spring没有尝试去创建自己的ORM解决方案，而是对许多流行的ORM框架进行了集成，包括Hibernate、Java Persisternce API、Java Data Object和iBATIS
SQL Maps。Spring的事务管理支持所有的ORM框架以及JDBC。


**数据访问与集成**
使用JDBC编写代码通常会导致大量的样板式代码，例如获得数据库连接、创建语句、处理结果集到最后关闭数据库连接。Spring的JDBC和DAO（Data Access Object）模块抽象了这些样板式代码，使我们的数据库代码变得简单明了，还可以避免因为关闭数据库资源失败而引发的

除此之外，本模块会使用Spring AOP模块为Spring应用中的对象提供事务管理服务

**Web与远程调用**
MVC（Model-View-Controller）模式是一种普遍被接受的构建Web应用的方法，它可以帮助用户将界面逻辑与应用逻辑分离。Java从来不缺少MVC框架，Apache的Struts、JSF、WebWork和
Tapestry都是可选的最流行的MVC框架。虽然Spring能够与多种流行的MVC框架进行集成，但它的Web和远程调用模块自带了一个强大的MVC框架，有助于在Web层提升应用的松耦合水平。

除了面向用户的Web应用，该模块还提供了多种构建与其他应用交互的远程调用方案。Spring远程调用功能集成了RMI（Remote Method Invocation）、Hessian、Burlap、JAX-WS，同时Spring还自带了一个远程调用框架：HTTP invoker。Spring还提供了暴露和使用REST API的良好支持。我们将会在第15章讨论Spring的远程调用功能。在第16章学习如何创建和使用REST API。

**Instrumentation**
Spring的Instrumentation模块提供了为JVM添加代理（agent）的功能。具体来讲，它为Tomcat提供了一个织入代理，能够为Tomcat传递类文件，就像这些文件是被类加载器加载的一样。
如果这听起来有点难以理解，不必对此过于担心。这个模块所提供的Instrumentation使用场景非常有限，在本书中，我们不会介绍该模块。

**测试**
鉴于开发者自测的重要性，Spring提供了测试模块以致力于Spring应用的测试。
通过该模块，你会发现Spring为使用JNDI、Servlet和Portlet编写单元测试提供了一系列的mock对象实现。对于集成测试，该模块为加载Spring应用上下文中的bean集合以及与Spring上下文
中的bean进行交互提供了支持。

## 1.2. Spring体系其他模块

**Spring Web Flow**
Spring Web Flow建立于Spring MVC框架之上，它为基于流程的会话式Web应用提供了支持

**Spring Web Service**
虽然核心的Spring框架提供了将Spring bean以声明的方式发布为Web Service的功能，但是这些服务是基于一个具有争议性的架构（拙劣的契约后置模型）之上而构建的。这些服务的契约由
bean的接口来决定。 Spring Web Service提供了契约优先的Web Service模型，服务的实现都是为了满足服务的契约而编写的

**Spring Security**
利用Spring AOP，Spring Security为Spring应用提供了声明式的安全机制


**Spring Integration**
Spring Integration提供了多种通用应用集成模式的Spring声明式风格实现。

**Spring Batch**
当我们需要对数据进行大量操作时，没有任何技术可以比批处理更胜任这种场景。如果需要开发一个批处理应用，你可以通过Spring Batch，使用Spring强大的面向POJO的编程模型。

**Spring Data**
Spring Data使得在Spring中使用任何数据库都变得非常容易

**Spring Social**

**Spring Boot**

## 1.3. 版本特性变化
<a href="#menu" >目录</a>


## 1.4. 常用注解

### 1.4.1. Spring部分
<a href="#menu" >目录</a>

**声明bean的注解**

@Component 组件，没有明确的角色
@Service 在业务逻辑层使用（service层）
@Repository 在数据访问层使用（dao层）
@Controller 在展现层使用，控制器的声明（C）

**注入bean的注解**

@Autowired：由Spring提供
@Inject：由JSR-330提供
@Resource：由JSR-250提供
都可以注解在set方法和属性上，推荐注解在属性上（一目了然，少写代码）。

**java配置类相关注解**

@Configuration 声明当前类为配置类，相当于xml形式的Spring配置（类上）
@Bean 注解在方法上，声明当前方法的返回值为一个bean，替代xml中的方式（方法上）
@Configuration 声明当前类为配置类，其中内部组合了@Component注解，表明这个类是一个bean（类上）
@ComponentScan 用于对Component进行扫描，相当于xml中的（类上）
@WishlyConfiguration 为@Configuration与@ComponentScan的组合注解，可以替代这两个注解

**切面（AOP）相关注解**

Spring支持AspectJ的注解式切面编程。
@Aspect 声明一个切面（类上） 使用@After、@Before、@Around定义建言（advice），可直接将拦截规则（切点）作为参数。
@After 在方法执行之后执行（方法上） @Before 在方法执行之前执行（方法上） @Around 在方法执行之前与之后执行（方法上）
@PointCut 声明切点 在java配置类中使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持（类上）


**@Bean的属性支持**

@Scope 设置Spring容器如何新建Bean实例（方法上，得有@Bean） 其设置类型包括：
Singleton （单例,一个Spring容器中只有一个bean实例，默认模式）, Protetype （每次调用新建一个bean）, Request （web项目中，给每个http request新建一个bean）, Session （web项目中，给每个http session新建一个bean）, GlobalSession（给每一个 global http session新建一个Bean实例）

@StepScope 在Spring Batch中还有涉及
@PostConstruct 由JSR-250提供，在构造函数执行完之后执行，等价于xml配置文件中bean的initMethod,也可以通过@Bean指定
@PreDestory 由JSR-250提供，在Bean销毁之前执行，等价于xml配置文件中bean的destroyMethod,也可以通过@Bean指定

**@Value注解**

@Value 为属性注入值（属性上） 支持如下方式的注入： 

》注入普通字符  @Value("Michael Jackson")String name;
》注入操作系统属性  @Value("#{systemProperties['os.name']}")String osName;
》注入表达式结果   @Value("#{ T(java.lang.Math).random() * 100 }") String randomNumber;
》注入其它bean属性 @Value("#{domeClass.name}")String name;
》注入文件资源 @Value("classpath:com/hgs/hello/test.txt")String Resource file;
》注入网站资源 @Value("http://www.cznovel.com")Resource url;
》注入配置文件 Value("${book.name}")String bookName;
注入配置使用方法：
 ① 编写配置文件（test.properties）book.name=《三体》
② @PropertySource 加载配置文件(类上)
@PropertySource("classpath:com/hgs/hello/test/test.propertie")
③ 还需配置一个PropertySourcesPlaceholderConfigurer的bean。

**环境切换**

@Profile 通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。（类或方法上）
@Conditional Spring4中可以使用此注解定义条件话的bean，通过实现Condition接口，并重写matches方法，从而决定该bean是否被实例化。（方法上）

**异步相关**

@EnableAsync 配置类中，通过此注解开启对异步任务的支持，叙事性AsyncConfigurer接口（类上）
@Async 在实际执行的bean方法使用该注解来申明其是一个异步任务（方法上或类上所有的方法都将异步，需要@EnableAsync开启异步任务）

**定时任务相关**

@EnableScheduling 在配置类上使用，开启计划任务的支持（类上）
@Scheduled 来申明这是一个任务，包括cron,fixDelay,fixRate等类型（方法上，需先开启计划任务的支持）

**@Enable*注解说明**

这些注解主要用来开启对xxx的支持。 @EnableAspectJAutoProxy 开启对AspectJ自动代理的支持

@EnableAsync 开启异步方法的支持
@EnableScheduling 开启计划任务的支持
@EnableWebMvc 开启Web MVC的配置支持
@EnableConfigurationProperties 开启对@ConfigurationProperties注解配置Bean的支持
@EnableJpaRepositories 开启对SpringData JPA Repository的支持
@EnableTransactionManagement 开启注解式事务的支持
@EnableTransactionManagement 开启注解式事务的支持
@EnableCaching 开启注解式的缓存支持

**测试相关注解**

@RunWith 运行器，Spring中通常用于对JUnit的支持
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ContextConfiguration(classes={TestConfig.class})

### 1.4.2. SpringMVC部分
<a href="#menu" >目录</a>

@EnableWebMvc 在配置类中开启Web MVC的配置支持，如一些ViewResolver或者MessageConverter等，若无此句，重写WebMvcConfigurerAdapter方法（用于对SpringMVC的配置）。

@Controller 声明该类为SpringMVC中的Controller

@RequestMapping 用于映射Web请求，包括访问路径和参数（类或方法上）

@ResponseBody 支持将返回值放在response内，而不是一个页面，通常用户返回json数据（返回值旁或方法上）

@RequestBody 允许request的参数在request体中，而不是在直接连接在地址后面。（放在参数前）

@PathVariable 用于接收路径参数，比如@RequestMapping(“/hello/{name}")申明的路径，将注解放在参数中前，即可获取该值，通常作为Restful的接口实现方法。

@RestController 该注解为一个组合注解，相当于@Controller和@ResponseBody的组合，注解在类上，意味着，该Controller的所有方法都默认加上了@ResponseBody。

@ControllerAdvice 通过该注解，我们可以将对于控制器的全局配置放置在同一个位置，注解了@Controller的类的方法可使用@ExceptionHandler、@InitBinder、@ModelAttribute注解到方法上， 这对所有注解了 @RequestMapping的控制器内的方法有效。

@ExceptionHandler 用于全局处理控制器里的异常

@InitBinder 用来设置WebDataBinder，WebDataBinder用来自动绑定前台请求参数到Model中。

@ModelAttribute 本来的作用是绑定键值对到Model里，在@ControllerAdvice中是让全局的@RequestMapping都能获得在此处设置的键值对。

## 1.5. 资源访问
<a href="#menu" >目录</a>

### 1.5.1. 接口以及实现类说明


![admin首页](pic/spring/spring/resource.png)

* WritableResource:可写资源接口，是Spring3.1版本新增的接口，有两个实现类FileSystemResource和PathResource，其中PathResource是Spring4.0提供的实现类。
* ByteArrayResource:二进制数组表示的资源，二进制数组资源可以在内存中通过程序构造。
* ClassPathResource:类路径下的资源，资源以相对路径的方式表示。
* FileSystemResource:文件系统资源，资源一文件系统的路径表示，如D:/aaa/vvv.java
* InputStreamResource：以输入流表示返回的资源。
* ServletContextResource:问访问Web容器上下文中的资源而设计的类，负责对于Web应用根目录的路径加载资源。它支持以流和URL的方式访问，在WAR解包的情况下，也可以通过File方式访问。该类还可以直接从JAR包中访问资源。
* UrlResource:URL封装了java.net.URL，它使用户能够访问任任何可以通过URL表示的资源，如文件系统的资源、HTTP资源、FTP资源等。
* PathResource:Spring4.0提供的读取资源文件的新类。Path封装了java.net.URL、java.nio.Path、文件系统资源，它使用户能够访问任何可以通过URL、Path、系统文件路径表示的资源，如文件系统的资源，HTTP资源、FTP资源等。

和JDK提供的File类访问资源比起来，Spring的Resource实现类提供了更加便捷的访问方式，用户可以根据实际的情况选择合适的Resource访问资源

假如有一个文件位于WEB应用的类路径下,用户可以通过以下方式对这个文件资源进行访问
* 通过FileSystemResource以文件绝对路径的方式对这个文件进行访问
* ClassPathResource:以类路径方式
* ServletContextResource以相对于WEB应用根目录的方式进行访问


在工程目录下放置文件config.text,内容如下:key1=value1

分别以文件方式和类路径方式读取
```java
@Slf4j
public class ResourceService {

    public static void filePathResoucrce(){

        String filePath = "/home/lgj/aProject/JavaCode/SpringBoot/resource/target/classes/config.text";

        try{
            WritableResource resource = new FileSystemResource(filePath);
            InputStream inputStream = resource.getInputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while ((data = inputStream.read()) != -1){
                baos.write(data);
            }
            System.out.println("filePathResoucrce读取的数据:"+baos.toString());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void classPathResoucrce(){

        String filePath = "config.text";
        try{
            Resource resource = new ClassPathResource(filePath);
            InputStream inputStream = resource.getInputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while ((data = inputStream.read()) != -1){
                baos.write(data);
            }
            System.out.println("classPathResoucrce读取的数据:"+baos.toString());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

}

```
### 1.5.2. 资源地址的表示


为了加载不同类型的资源,必须使用相应的Resource实现类,Spring提供了一个强大的加载资源的机制,通过地址前缀来识别不同的资源.

|地址前缀	|示例	|对应的资源类型|
|---|---|---|
|classpath:	|classpath:top/mcwebsite/resource/bean.xml|	从类路径中加载资源，classpath:和classpath:/是等价的，都是相对于类的路径。资源文件可以在标准的文件系统中，也可以在JAR和ZIP的类包中
|file:|	file:/config/bean,xml	|使用UrlResource从文件系统目录中装载资源，可采用绝对或相对路径
|http://|	http://www.mcwebsite.top/bean.xml	|使用UrlResource从Web服务器中装载资源
|ftp://|	ftp://www.mcwebsite.top/bean.xml	|使用UrlResource从ftp服务器中装载资源
|没有前缀|	com/mcwebsite/resource/bean.xml|	根据ApplicationContext的具体实现曹勇对应类型的Resource

classpath:com/demo/xx.xml : 只扫描com/demo下第一个被扫描到的xx.xml
classpath*:com/demo/xx.xml: 扫描com/demo包路径下所有的xx.xml

**Ant风格的资源地址支持三种通配符：**
?:匹配文件名中的一个字符
*：匹配文件名中的多个字符
**:匹配多层路径。

```java
public static void patternResource(){

    String filePath = "/home/lgj/aProject/JavaCode/SpringBoot/resource/target/classes/config.text";
    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    try{
        Resource resource = resolver.getResource("file:"+filePath);
        InputStream inputStream = resource.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int data;
        while ((data = inputStream.read()) != -1){
            baos.write(data);
        }
        System.out.println("patternResource读取的数据:"+baos.toString());
    }
    catch(Exception ex){
        ex.printStackTrace();
    }

}
```


## 1.6. IOC容器
<a href="#menu" >目录</a>

IOC容器将类与类之间的依赖从代码中脱离出来,用配置的方式进行依赖关系描述,由IOC容器负责依赖类之间的创建,拼接,管理,获取等工作.BeanFactory接口是Spring框架的核心接口,实现了许多核心的功能

Context模块构建于核心模块之上,扩展了BeanFactory的功能,添加了i18n国际化,Bean生命周期控制,框架事件体系,资源加载透明化等多项功能.此外,该模块还提供了许多企业级服务的支持,如邮件服务等.ApplicationContext是Context模块的核心接口.




### 1.6.1. 控制反转和依赖注入
<a href="#menu" >目录</a>



* 从概念上讲：Spring 容器是 Spring 框架的核心，是用来管理对象的。容器将创建对象，把它们连接在一起，配置它们，并管理他们的整个生命周期从创建到销毁。
* 从具象化讲：通过概念的描述有些同学还是一脸懵逼，在我们的项目中哪个东西是Spring容器？在java项目中，我们使用实现了org.springframework.context.ApplicationContext接口的实现类。在web项目中，我们使用spring.xml——Spring的配置文件。
* 从代码上讲：一个Spring容器就是某个实现了ApplicationContext接口的类的实例。也就是说，从代码层面，Spring容器其实就是一个ApplicationContext（一个实例化对象）


**IoC是什么**
　　Ioc—Inversion of Control，即“控制反转"，不是什么技术，而是一种设计思想。在Java开发中，Ioc意味着将你设计好的对象交给容器控制，而不是传统的在你的对象内部直接控制。如何理解好Ioc呢？理解好Ioc的关键是要明确“谁控制谁，控制什么，为何是反转（有反转就应该有正转了），哪些方面反转了"，那我们来深入分析一下：
* 谁控制谁，控制什么：传统Java SE程序设计，我们直接在对象内部通过new进行创建对象，是程序主动去创建依赖对象；而IoC是有专门一个容器来创建这些对象，即由Ioc容器来控制对 象的创建；谁控制谁？当然是IoC 容器控制了对象；控制什么？那就是主要控制了外部资源获取（不只是对象包括比如文件等）。
* 为何是反转，哪些方面反转了：有反转就有正转，传统应用程序是由我们自己在对象中主动控制去直接获取依赖对象，也就是正转；而反转则是由容器来帮忙创建及注入依赖对象；为何是反转？因为由容器帮我们查找及注入依赖对象，对象只是被动的接受依赖对象，所以是反转；哪些方面反转了？依赖对象的获取被反转了。

依赖控制反转的实现有很多种方式,在Spring中嗯,IOC容器是shaitan这个模式的载体,它可以在对象生成或者初始化时直接将数据注入到对象中,也可以通过将对象引用注入到对象数据域中的方式来注入对方法调用的依赖,这种依赖注入是可以递归的,对象被逐层注入.这种方案把对象依赖关系有序地建立起来,简化了对象依赖关系的管理,在很大程度上简化了面向对象系统的复杂性.

如何反转对依赖的控制,将控制权从具体业务对象手中转交到平台或者框架中,是降低面向对象系统设计复杂性和提高面向对象系统可测试性的一个有效的解决方案.

**IoC能做什么**
　　IoC 不是一种技术，只是一种思想，一个重要的面向对象编程的法则，它能指导我们如何设计出松耦合、更优良的程序。传统应用程序都是由我们在类内部主动创建依赖对象，从而导致类与类之间高耦合，难于测试；有了IoC容器后，把创建和查找依赖对象的控制权交给了容器，由容器进行注入组合对象，所以对象与对象之间是 松散耦合，这样也方便测试，利于功能复用，更重要的是使得程序的整个体系结构变得非常灵活。
其实IoC对编程带来的最大改变不是从代码上，而是从思想上，发生了“主从换位"的变化。应用程序原本是老大，要获取什么资源都是主动出击，但是在IoC/DI思想中，应用程序就变成被动的了，被动的等待IoC容器来创建并注入它所需要的资源了。

IoC很好的体现了面向对象设计法则之一—— 好莱坞法则：“别找我们，我们找你"；即由IoC容器帮对象找相应的依赖对象并注入，而不是由对象主动去找。


**IoC和DI**
　　DI—Dependency Injection，即“依赖注入"：组件之间依赖关系由容器在运行期决定，形象的说，即由容器动态的将某个依赖关系注入到组件之中。依赖注入的目的并非为软件系统带来更多功能，而是为了提升组件重用的频率，并为系统搭建一个灵活、可扩展的平台。通过依赖注入机制，我们只需要通过简单的配置，而无需任何代码就可指定目标需要的资源，完成自身的业务逻辑，而不需要关心具体的资源来自何处，由谁实现。

理解DI的关键是：“谁依赖谁，为什么需要依赖，谁注入谁，注入了什么"，那我们来深入分析一下：
* 谁依赖于谁：当然是应用程序依赖于IoC容器；
* 为什么需要依赖：应用程序需要IoC容器来提供对象需要的外部资源；
* 谁注入谁：很明显是IoC容器注入应用程序某个对象，应用程序依赖的对象；
* 注入了什么：就是注入某个对象所需要的外部资源（包括对象、资源、常量数据）。

IoC和DI由什么关系呢？其实它们是同一个概念的不同角度描述，由于控制反转概念比较含糊（可能只是理解为容器控制对象这一个层面，很难让人想到谁来维护对象关系），所以2004年大师级人物Martin Fowler又给出了一个新的名字：“依赖注入"，相对IoC 而言，“依赖注入"明确描述了“被注入对象依赖IoC容器配置依赖对象"。


**IoC(控制反转)**
　　首先想说说IoC（Inversion of Control，控制反转）。这是spring的核心，贯穿始终。所谓IoC，对于spring框架来说，就是由spring来负责控制对象的生命周期和对象间的关系。这是什么意思呢，举个简单的例子，我们是如何找女朋友的？常见的情况是，我们到处去看哪里有长得漂亮身材又好的mm，然后打听她们的兴趣爱好、qq号、电话号、ip号、iq号………，想办法认识她们，投其所好送其所要，然后嘿嘿……这个过程是复杂深奥的，我们必须自己设计和面对每个环节。传统的程序开发也是如此，在一个对象中，如果要使用另外的对象，就必须得到它（自己new一个，或者从JNDI中查询一个），使用完之后还要将对象销毁（比如Connection等），对象始终会和其他的接口或类藕合起来。

　　那么IoC是如何做的呢？有点像通过婚介找女朋友，在我和女朋友之间引入了一个第三者：婚姻介绍所。婚介管理了很多男男女女的资料，我可以向婚介提出一个列表，告诉它我想找个什么样的女朋友，比如长得像李嘉欣，身材像林熙雷，唱歌像周杰伦，速度像卡洛斯，技术像齐达内之类的，然后婚介就会按照我们的要求，提供一个mm，我们只需要去和她谈恋爱、结婚就行了。简单明了，如果婚介给我们的人选不符合要求，我们就会抛出异常。整个过程不再由我自己控制，而是有婚介这样一个类似容器的机构来控制。Spring所倡导的开发方式就是如此，所有的类都会在spring容器中登记，告诉spring你是个什么东西，你需要什么东西，然后spring会在系统运行到适当的时候，把你要的东西主动给你，同时也把你交给其他需要你的东西。所有的类的创建、销毁都由 spring来控制，也就是说控制对象生存周期的不再是引用它的对象，而是spring。对于某个具体的对象而言，以前是它控制其他对象，现在是所有对象都被spring控制，所以这叫控制反转。

**DI(依赖注入)**
　　IoC的一个重点是在系统运行中，动态的向某个对象提供它所需要的其他对象。这一点是通过DI（Dependency Injection，依赖注入）来实现的。比如对象A需要操作数据库，以前我们总是要在A中自己编写代码来获得一个Connection对象，有了 spring我们就只需要告诉spring，A中需要一个Connection，至于这个Connection怎么构造，何时构造，A不需要知道。在系统运行时，spring会在适当的时候制造一个Connection，然后像打针一样，注射到A当中，这样就完成了对各个对象之间关系的控制。A需要依赖 Connection才能正常运行，而这个Connection是由spring注入到A中的，依赖注入的名字就这么来的。那么DI是如何实现的呢？ Java 1.3之后一个重要特征是反射（reflection），它允许程序在运行的时候动态的生成对象、执行对象的方法、改变对象的属性，spring就是通过反射来实现注入的。

依赖注入的基本原则是应用程序对象不应该负责查找它们所依赖的资源,而是应该由IOC容器处理对象和依赖注入,从而导致资源查找的外部化,从应用程序转移到容器.
* 好处:
    * 可从应用程序代码中完全删除查找逻辑代码,依赖项可以以一种可插拔的方式注入目标组件.这样组件就不需要知道依赖项的位置或者类.
    * 对容器的API没有任何依赖.可以将代码从一个容器转移到另一个容器中,不需要进行任何修改就能运行
    * 完全不需要实现任何特殊的接口



### 1.6.2. 依赖注入方式

#### 1.6.2.1. setter注入与构造方法注入
spring的两种依赖注入方式：setter注入与构造方法注入，这两种方法的不同主要就是在xml文件下对应使用property和constructor-arg属性。

```java
public class Id {  
    private int id;  
    private String name;  
    public Id(int id,String name){  
        this.id = id;  
        this.name = name;  
    }  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}  

```

注入例子
```xml
<bean id="id" class="com.loster.li.Id">  
    <property name="id" value="123"></property>  
    <property name="name" value="xiaoli"></property>  
</bean>  
<bean id="id" class="com.loster.li.Id">  
    <constructor-arg index="0" value="456"></constructor-arg>  
    <constructor-arg index="1" value="dawang"></constructor-arg>  
</bean>
```

**区别**
* setter方式
    * 设值注入需要该Bean包含这些属性的setter方法
    * 与传统的JavaBean的写法更相似，程序开发人员更容易理解、接收。通过setter方法设定依赖关系显得更加只管。
    * 对于复杂的依赖关系，如果采用构造注入，会导致构造器国语臃肿，难以阅读。Spring在创建Bean实例时，需要同时实例化器依赖的全部实例，因而导致性能下降。而使用设值注入，则能避免这些问题
    * 尤其是在某些属性可选的情况况下，多参数的构造器显得更加笨重
* 构造函数注入
    * 构造注入需要该Bean包含带有这些属性的构造器
    * 构造注入可以在构造器中决定依赖关系的注入顺序，优先依赖的优先注入。例如，组件中其他依赖关系的注入，常常要依赖于DataSrouce的注入。采用构造注入，可以在代码中清晰的决定注入顺序。
    * 对于依赖关系无需变化的Bean，构造注入更有用处。因为没有Setter方法，所有的依赖关系全部在构造器内设定。因此，无需担心后续的代码对依赖关系产生破坏。
    * 依赖关系只能在构造器中设定，则只有组件的创建者才能改变组件的依赖关系。对组件的调用者而言，组件内部的依赖关系完全透明，更符合高内聚的原则。

* 建议：采用以设值注入为主，构造注入为辅的注入策略。对于依赖关系无需变化的注入，尽量采用构造注入；而其他的依赖关系的注入，则考虑采用设值注入

**循环依赖问题**
所谓的循环依赖是指，A 依赖 B，B 又依赖 A，它们之间形成了循环依赖。或者是 A 依赖 B，B 依赖 C，C 又依赖 A

* 构造器参数循环依赖
    * 表示通过构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyIn CreationException异常表示循环依赖 
    * 因为循环依赖的问题，构造器注入的对象没有创建，构造器就无法执行，自己本身也就无法创建，那么另一个对象也无法创建。
* setter方式单例，默认方
    * 也是使用该方式解决循环依赖问题
    * 使用setter注入时，两个对象已经创建完成，就不会出现构造器循环依赖的问题

* setter方式原型，prototype
    * 对于"prototype"作用域bean，Spring容器无法完成依赖注入，因为Spring容器不进行缓存"prototype"作用域的bean，因此无法提前暴露一个创建中的bean

#### 1.6.2.2. 自动注入方式

上面是传统的XML配置方式,目前很少使用，一般使用自动注入

* spring自动注入的三种方式
所谓spring自动注入，是指容器中的一个组件中需要用到另一个组件（例如聚合关系）时，依靠spring容器创建对象，而不是手动创建，主要有三种方式：
1. @Autowired注解——由spring提供
2. @Resource注解——由JSR-250提供
3. @Inject注解——由JSR-330提供

**@Autowired注解的使用方法**

```java
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {

   /**
    * Declares whether the annotated dependency is required.
    * <p>Defaults to {@code true}.
    */
   boolean required() default true;
}
```

从源码可以看出：该注解可以用在构造器、方法、参数、属性上，最常见的是用在属性上。
该注解只有一个属性： required，默认为true，如果找不到匹配的bean则报错；设置为false，如果找不到匹配的bean则注入null，并不会报错。
可以配合@Qualifier使用，用于精准指定要注入的bean的名称。
可以配合@Primary使用，当容器中存在多个相同类型的组件时，用于指定优先加载哪一个，这个注解不能用在2个或更多同类型的组件上。
 1. 当容器中只有一个该类型的组件时
|-不使用@Qualifier，会按bean类型查找，即applicationContext.getBean(bean.class)，然后注入这个唯一的bean。
|-使用@Qualifier，会按Qualifier的value值跟bean名称匹配查找，即applicationContext.getBean("Qualifier的value值")。
2. 当容器中没有该类型的组件时
|-required=true——报错expected at least 1 bean which qualifies as autowire candidate。
|-required=false——注入null。
3. 当容器中存在多个该类型的组件时
|-不使用@Qualifier和@Primary时，会按属性名跟bean名称匹配查找，即applicationContext.getBean("属性名")。
|-使用@Primary、但不使用@Qualifier时，会优先加载带有@Primary注解的组件。
|-使用@Qualifier时，不管有没有使用@Primary，都会直接按Qualifier的value值跟bean名称匹配查找。
综上，当容器中存在多个同类型的组件时，加载优先级：@Qulifier>@Primary>属性名，例如下面这个容器中包含3个BookDao组件

```java
@Configuration
@ComponentScan(basePackages = {"cn.monolog.service"})
public class AutowiredBeanConfig {

    @Bean(value = "bookDao1")
    public BookDao bookDao1() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao1");
        return bookDao;
    }

    @Bean(value = "bookDao2")
    @Primary
    public BookDao bookDao2() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao2");
        return bookDao;
    }

    @Bean(value = "bookDao3")
    public BookDao bookDao3() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao3");
        return bookDao;
    }
}
```

自动注入方式是这样的：
@Autowired
@Qualifier(value = "bookDao1")
private BookDao bookDao3;
按照优先级顺序，@Qulifier(bookDao1) > @Primary(bookDao2) > 属性名(bookDao3)，最终加载的是名称为bookDao1的组件。
 
**@Resource注解的使用方法**
@Resource注解的使用跟@Autowired注解类似，但是需要注意：
1. 不支持@Primary注解，也不支持reuqired=false，即不允许注入null；
2. 该注解有一个属性name，类似于@Qualified精准匹配，优先级最高；
3. 默认按照属性名跟bean的名称匹配查找，如果不存在，再按类型匹配查找。
例如，下面这个容器中有两个CarDao组件
```java
@Configuration
@ComponentScan(basePackages = {"cn.monolog.service"})
public class ResourceBeanConfig {

    @Bean(value = "carDao1")
    public CarDao carDao1() {
        CarDao carDao = new CarDao();
        carDao.setLabel("1");
        return  carDao;
    }

    @Bean(value = "carDao2")
    public CarDao carDao() {
        CarDao carDao = new CarDao();
        carDao.setLabel("2");
        return  carDao;
    }
}
```

自动注入方式如下，会按属性名注入carDao2组件。
//自动注入
@Resource
private CarDao carDao2;
但是改为下面这种注入方式：
//自动注入
@Resource(name = "carDao1")
private CarDao carDao2;
由于使用了name精准匹配，会忽略属性名，注入carDao1组件。
 
**@Inject注解的使用方法**
@Inject注解的使用方法跟@Autowired也基本相似，但是需要注意
1. 使用前需要导入jar包——javax.inject；
2. 支持@Primary注解，而且因为没有精确匹配，@Primary的优先级最高；
2. 不支持required=false，即不能注入null，如果找不到组件肯定报错；
3. 默认按照属性名跟bean的名称匹配查找，如果不存在，再按类型匹配查找。
 
例如，下面这容器中有一个EmployeeDao组件
```java
@Configuration
public class InjectBeanConfig {
    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }
}
```

自动注入的方式如下
```java
@Inject
private EmployeeDao employeeDao3;
```
spring会先按属性名查找名称为employeDao3的组件，即applicationContext.getBean("employeeDao3")，结果不存在；
然后按照类型查找，即applicationContext.getBean(EmployeDao.class)，找到employeDao1组件，成功注入。
 
如果容器中有多个同类型组件，例如
```java
@Configuration
public class InjectBeanConfig {
    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }
    @Bean(value = "employeeDao2")
    public EmployeeDao employeeDao2() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("2");
        return employeeDao;
    }
    @Bean(value = "employeeDao3")
    public EmployeeDao employeeDao3() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("3");
        return employeeDao;
    }
}
```
注入方式还是这样

```java
@Inject
private EmployeeDao employeeDao3;
```
仍然会按属性名和bean的名称匹配，即applicationContext.getBean("employeeDao3")，找到employee3，成功注入。
 
但是如果其中某个组件加了@Primary注解，会忽略属性名，优先注入，例如

```java
@Configuration
public class InjectBeanConfig {

    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }

    @Bean(value = "employeeDao2")
    @Primary
    public EmployeeDao employeeDao2() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("2");
        return employeeDao;
    }

    @Bean(value = "employeeDao3")
    public EmployeeDao employeeDao3() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("3");
        return employeeDao;
    }
}
```

无论注入时使用什么样的属性名，都会注入employeeDao2。

## 1.7. IOC容器
<a href="#menu" >目录</a>


* 构造一个IOC容器需要如下几个步骤：
    * 第一步：资源的定位。所谓资源就是指Spring里众多的XML配置文件或者@Component,@Configuration等方式(SpringBoot)定义的Bean类，要获取到配置文件里面的信息，首先是要找到它。
    * 第二步：加载和解析资源文件。XML文件里面定义的一些节点，和Spring里面定义的数据结构不匹配，那么就需要按照Spring的解析规则将XML解析成Spring需要的。
    * 第三步：将解析完的数据结构注册到IOC容器中。Spring中内部的数据结构叫BeanDefinition。
    * 经过以上三个步骤之后，IOC容器已经构造好，但是还是不能被直接使用。BeanDefinition只是配置文件里的配置在IOC中建立的一个映射，对于IOC容器来说最重要的依赖关系都还没有注入呢，相当于光有一个壳，内容还没有填充。
    * 接下来这个过程是容器的实例化。容器的实例化只有一步，就是依赖注入。
    * 完成IOC容器的构造和实例化之后，完整的IOC就建立好了

### 1.7.1. IOC 容器的设计
<a href="#menu" >目录</a>

在Spring IOC容器的设计中,有两个主要的容器系列,一个是实现BeanFactory接口的简单容器系列,这系列容器只实现了容器最基本功能
另一个是ApplicationContext应用上下文,作为容器的高级形态存在,这个也是BeanFactory的子类.其增加了许多面向框架的特性,同时对应用环境做了许多的适配.


* 从接口BeanFactory到HierarchicalBeanFactory再到ConfigurableBeanFactory是一条主要的BeanFactory设计路径.
    * BeanFactory接口定义了基本的IOC容器的规范.包括getBean()这样的基本方法
    * HierarchicalBeanFactory在继承BeanFactory之后,增加了getParentBeanFactory()接口功能,使其具备了双亲IOC容器的管理功能.
    * ConfigurableBeanFactory定义了BeanFactory的配置功能,比如添加了set/add等方法
* 以ApplicationContext应用上下文接口为核心的的接口设计
    * ApplicationContext extends EnvironmentCapable, ListableBeanFactory, HierarchicalBeanFactory, MessageSource, ApplicationEventPublisher, ResourcePatternResolver
    * 常用的应用上下文是ConfigurableApplicationContext和WebApplicationContext的实现类
    * ListableBeanFactory中,细化了许多BeanFactory的接口功能
    * ApplicationContext通过继承以上的接口,在BeanFactory基础上添加了许多对高级容器的特性的支持
    * 在WEB环境中还设计了WebApplicationContext接口,这个接口通过继承ThemeSource接口来扩充功能
* DefaultListableBeanFactory
    * 基本的IOC容器的实现
    * 其他的Ioc容器都是在这个类上做扩展,比如XmlBeanFactory



### 1.7.2. BeanFactory接口以及实现类说明
<a href="#menu" >目录</a>

#### 1.7.2.1. BeanDefinition
<a href="#menu" >目录</a>




在Spring容器启动的过程中，会将Bean解析成Spring内部的BeanDefinition结构.


```java

public interface BeanDefinition extends AttributeAccessor, BeanMetadataElement {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";
    int ROLE_APPLICATION = 0;
    int ROLE_SUPPORT = 1;
    int ROLE_INFRASTRUCTURE = 2;

    void setParentName(@Nullable String var1);
    @Nullable
    String getParentName();
    void setBeanClassName(@Nullable String var1);
    @Nullable
    String getBeanClassName();
    void setScope(@Nullable String var1);
    @Nullable
    String getScope();
    void setLazyInit(boolean var1);
    boolean isLazyInit();
    void setDependsOn(@Nullable String... var1);
    @Nullable
    String[] getDependsOn();
    void setAutowireCandidate(boolean var1);
    boolean isAutowireCandidate();
    void setPrimary(boolean var1);
    boolean isPrimary();
    void setFactoryBeanName(@Nullable String var1);
    @Nullable
    String getFactoryBeanName();
    void setFactoryMethodName(@Nullable String var1);
    @Nullable
    String getFactoryMethodName();
    ConstructorArgumentValues getConstructorArgumentValues();
    default boolean hasConstructorArgumentValues() {
        return !this.getConstructorArgumentValues().isEmpty();
    }
    MutablePropertyValues getPropertyValues();
    default boolean hasPropertyValues() {
        return !this.getPropertyValues().isEmpty();
    }
    boolean isSingleton();
    boolean isPrototype();
    boolean isAbstract();
    int getRole();
    @Nullable
    String getDescription();
    @Nullable
    String getResourceDescription();
    @Nullable
    BeanDefinition getOriginatingBeanDefinition();
}

```

可以看到上面的很多属性和方法都很熟悉，例如类名、scope、属性、构造函数参数列表、依赖的bean、是否是单例类、是否是懒加载等，其实就是将Bean的定义信息存储到这个BeanDefinition相应的属性中，后面对Bean的操作就直接对BeanDefinition进行，例如拿到这个BeanDefinition后，可以根据里面的类名、构造函数、构造函数参数，使用反射进行对象创建。

BeanDefinition是一个接口，是一个抽象的定义，实际使用的是其实现类，如 ChildBeanDefinition、RootBeanDefinition、GenericBeanDefinition等。

![BeanDefinition](pic/spring/spring/beanfactory/BeanDefinition.png)


##### 1.7.2.1.1. AbstractBeanDefinition

AbstractBeanDefinition直接继承BeanDefiniton，实现了BeanDefinition定义的一系列操作，定义了描述Bean画像的一系列属性，在AbstractBeanDefinition的基础上，Spring衍生出了一系列具有特殊用途的BeanDefinition

**定义的常量**

这一些常量会直接影响到spring实例化Bean时的策略
```java
	/**
	 * Constant for the default scope name: {@code ""}, equivalent to singleton
	 * status unless overridden from a parent bean definition (if applicable).
	 */
	//默认的SCOPE，默认是单例
	public static final String SCOPE_DEFAULT = "";
 
	/**
	 * Constant that indicates no autowiring at all.
	 * @see #setAutowireMode
	 */
	//不进行自动装配
	public static final int AUTOWIRE_NO = AutowireCapableBeanFactory.AUTOWIRE_NO;
 
	/**
	 * Constant that indicates autowiring bean properties by name.
	 * @see #setAutowireMode
	 */
	//根据Bean的名字进行自动装配，即autowired属性的值为byname
	public static final int AUTOWIRE_BY_NAME = AutowireCapableBeanFactory.AUTOWIRE_BY_NAME;
 
	/**
	 * Constant that indicates autowiring bean properties by type.
	 * @see #setAutowireMode
	 */
	//根据Bean的类型进行自动装配，调用setter函数装配属性，即autowired属性的值为byType
	public static final int AUTOWIRE_BY_TYPE = AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE;
 
	/**
	 * Constant that indicates autowiring a constructor.
	 * @see #setAutowireMode
	 */
	//自动装配构造函数的形参，完成对应属性的自动装配，即autowired属性的值为byConstructor
	public static final int AUTOWIRE_CONSTRUCTOR = AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR;
 
	/**
	 * Constant that indicates determining an appropriate autowire strategy
	 * through introspection of the bean class.
	 * @see #setAutowireMode
	 * @deprecated as of Spring 3.0: If you are using mixed autowiring strategies,
	 * use annotation-based autowiring for clearer demarcation of autowiring needs.
	 */
	/*通过Bean的class推断适当的自动装配策略（autowired=autodetect），如果Bean定义有有参构造函数，则通过自动装配构造函数形参，完成对应属性的自动装配（AUTOWIRE_CONSTRUCTOR），否则，使用setter函数（AUTOWIRE_BY_TYPE）*/
	@Deprecated
	public static final int AUTOWIRE_AUTODETECT = AutowireCapableBeanFactory.AUTOWIRE_AUTODETECT;
 
	//大概是检查依赖是否合法，在本类中，默认不进行依赖检查
	/**
	 * Constant that indicates no dependency check at all.
	 * @see #setDependencyCheck
	 */ 
	//不进行依赖检查
	public static final int DEPENDENCY_CHECK_NONE = 0;
 
	/**
	 * Constant that indicates dependency checking for object references.
	 * @see #setDependencyCheck
	 */
	//如果依赖类型为对象引用，则需要检查
	public static final int DEPENDENCY_CHECK_OBJECTS = 1;
 
	/**
	 * Constant that indicates dependency checking for "simple" properties.
	 * @see #setDependencyCheck
	 * @see org.springframework.beans.BeanUtils#isSimpleProperty
	 */
	//对简单属性的依赖进行检查
	public static final int DEPENDENCY_CHECK_SIMPLE = 2;
 
	/**
	 * Constant that indicates dependency checking for all properties
	 * (object references as well as "simple" properties).
	 * @see #setDependencyCheck
	 */
	//对所有属性的依赖进行检查
	public static final int DEPENDENCY_CHECK_ALL = 3;
 
	/**
	 * Constant that indicates the container should attempt to infer the
	 * {@link #setDestroyMethodName destroy method name} for a bean as opposed to
	 * explicit specification of a method name. The value {@value} is specifically
	 * designed to include characters otherwise illegal in a method name, ensuring
	 * no possibility of collisions with legitimately named methods having the same
	 * name.
	 * <p>Currently, the method names detected during destroy method inference
	 * are "close" and "shutdown", if present on the specific bean class.
	 */
	/*若Bean未指定销毁方法，容器应该尝试推断Bean的销毁方法的名字，目前来说，推断的销毁方法的名字一般为close或是shutdown
    （即未指定Bean的销毁方法，但是内部定义了名为close或是shutdown的方法，则容器推断其为销毁方法）*/
	public static final String INFER_METHOD = "(inferred)";
```
**属性**
AbstractBeanDefinition定义的属性基本囊括了Bean实例化需要的所有信息

```java
	//Bean的class对象或是类的全限定名
	@Nullable
	private volatile Object beanClass;
 
	//默认的scope是单例
	@Nullable
	private String scope = SCOPE_DEFAULT;
 
	//默认不为抽象类
	private boolean abstractFlag = false;
 
	//默认不是懒加载
	private boolean lazyInit = false;
 
	//默认不进行自动装配
	private int autowireMode = AUTOWIRE_NO;
 
	//默认不进行依赖检查
	private int dependencyCheck = DEPENDENCY_CHECK_NONE;
 
	//这里只会存放<bean/>标签的depends-on属性或是@DependsOn注解的值
	@Nullable
	private String[] dependsOn;
 
	//是自动装配的候选者，意味着可以自动装配到其他Bean的某个属性中
	private boolean autowireCandidate = true;
 
	//当某个Bean的某个属性自动装配有多个候选者（包括自己）时，是否优先注入，即@Primary注解
	private boolean primary = false;
 
	//这个不是很清楚，查看了这个类的定义，AutowireCandidateQualifier用于解析自动装配的候选者
	private final Map<String, AutowireCandidateQualifier> qualifiers = new LinkedHashMap<>();
 
	//用于初始化Bean的回调函数，一旦指定，这个方法会覆盖工厂方法以及构造函数中的元数据
    //我理解为通过这个函数的逻辑初始化Bean，而不是构造函数或是工厂方法
	@Nullable
	private Supplier<?> instanceSupplier;
 
	//是否允许访问非public方法和属性，应用于构造函数、工厂方法、init、destroy方法的解析，具体作用是什么我也不是很清楚
	private boolean nonPublicAccessAllowed = true;
 
	//指定解析构造函数的模式，是宽松还是严格（什么是宽松、什么是严格，我没有找到解释）
	private boolean lenientConstructorResolution = true;
 
	//工厂类名（注意是String类型，不是Class类型）
	@Nullable
	private String factoryBeanName;
 
	//工厂方法名（注意是String类型，不是Method类型）
	@Nullable
	private String factoryMethodName;
 
	//存储构造函数形参的值
	@Nullable
	private ConstructorArgumentValues constructorArgumentValues;
 
	//Bean属性的名称以及对应的值，这里不会存放构造函数相关的参数值，只会存放通过setter注入的依赖
	@Nullable
	private MutablePropertyValues propertyValues;
 
	//存储被IOC容器覆盖的方法的相关信息（例如replace-method属性指定的函数）
	@Nullable
	private MethodOverrides methodOverrides;
 
	//init函数的名字
	@Nullable
	private String initMethodName;
 
	//destory函数的名字
	@Nullable
	private String destroyMethodName;
 
	//文档解释，不知道啥意思，Specify whether or not the configured init method is the default
	private boolean enforceInitMethod = true;
 
	//文档解释，不知道啥意思，Specify whether or not the configured destroy method is the default
	private boolean enforceDestroyMethod = true;
 
	//是否是合成类（是不是应用自定义的，例如生成AOP代理时，会用到某些辅助类，这些辅助类不是应用自定义的，这个就是合成类）
	private boolean synthetic = false;
 
	//Bean的角色，为用户自定义Bean
	private int role = BeanDefinition.ROLE_APPLICATION;
 
	//Bean的描述
	@Nullable
	private String description;
 
	
	@Nullable
	private Resource resource;
```
总的来说，AbstractBeanDefinition保存的属性包括：
* Bean的描述信息（例如是否是抽象类、是否单例）
* depends-on属性（String类型，不是Class类型）
* 自动装配的相关信息
* init函数、destroy函数的名字（String类型）
* 工厂方法名、工厂类名（String类型，不是Class类型）
* 构造函数形参的值
* 被IOC容器覆盖的方法
* Bean的属性以及对应的值（在初始化后会进行填充）
 

**总结**
AbstractBeanDefinition定义了一系列描述Bean画像的属性，同时实现了BeanDefinition定义的方法，通过这个类，可以窥见Bean的某些默认设置（例如默认为单例），这个类的属性基本可以在xml配置文件中找到相应的属性或是标签（例如该类的scope属性对应xml配置文件中的scope属性）


##### 1.7.2.1.2. RootBeanDefinition
注：从spring2.5开始，spring一开始都是使用GenericBeanDefinition类保存Bean的相关信息，在需要时，在将其转换为其他的BeanDefinition类型

* 是运行时使用的Bean视图，即spring会使用RootBeanDefinition初始化Bean
* 在源码注释中，有这么一句：It might have been created from multiple original bean definitions that inherit from each other，spring会依据多个具有继承关系的BeanDefinition（实际上是GenericBeanDefinition类型）来创建RootBeanDefinition，换句话说，在多继承体系中，RootBeanDefinition代表的是当前初始化类的父类的BeanDefinition
* RootBeanDefinition可用于没有继承关系的Bean的创建

**变量声明**
```java
	BeanDefinitionHolder存储有Bean的名称、别名、BeanDefinition
	@Nullable
	private BeanDefinitionHolder decoratedDefinition;
 
    //是java反射包的接口，通过它可以查看Bean的注解信息，具体方法请查看：https://blog.csdn.net/u010142437/article/details/51589939
	@Nullable
	private AnnotatedElement qualifiedElement;
 
	//允许缓存
	boolean allowCaching = true;
 
	//从字面上理解：工厂方法是否唯一
	boolean isFactoryMethodUnique = false;
 
	//封装了java.lang.reflect.Type,提供了泛型相关的操作，具体请查看：
	https://blog.wangqi.love/articles/Spring/Spring%E5%90%AF%E5%8A%A8%E8%BF%87%E7%A8%8B%E5%88%86%E6%9E%90.%E7%95%AA%E5%A4%96(ResolvableType).html
	@Nullable
	volatile ResolvableType targetType;
 
	//缓存class，表明RootBeanDefinition存储哪个类的信息
	/** Package-visible field for caching the determined Class of a given bean definition. */
	@Nullable
	volatile Class<?> resolvedTargetType;
 
	//缓存工厂方法的返回类型
	/** Package-visible field for caching the return type of a generically typed factory method. */
	@Nullable
	volatile ResolvableType factoryMethodReturnType;
 
	//缓存工厂方法
	/** Package-visible field for caching a unique factory method candidate for introspection. */
	@Nullable
	volatile Method factoryMethodToIntrospect;
 
	//以下四个变量的锁
	/** Common lock for the four constructor fields below. */
	final Object constructorArgumentLock = new Object();
 
	//缓存已经解析的构造函数或是工厂方法，Executable是Method、Constructor类型的父类，关于java反射的更多信息请查看：
	https://www.cnblogs.com/guangshan/p/4888656.html
	/** Package-visible field for caching the resolved constructor or factory method. */
	@Nullable
	Executable resolvedConstructorOrFactoryMethod;
 
	//表明构造函数参数是否解析完毕
	/** Package-visible field that marks the constructor arguments as resolved. */
	boolean constructorArgumentsResolved = false;
 
	//缓存完全解析的构造函数参数
	/** Package-visible field for caching fully resolved constructor arguments. */
	@Nullable
	Object[] resolvedConstructorArguments;
 
	//缓存待解析的构造函数参数，即还没有找到对应的实例，可以理解为还没有注入依赖的形参（我的理解）
	/** Package-visible field for caching partly prepared constructor arguments. */
	@Nullable
	Object[] preparedConstructorArguments;
 
	//以下两个变量的锁
	/** Common lock for the two post-processing fields below. */
	final Object postProcessingLock = new Object();
 
	//表明是否被MergedBeanDefinitionPostProcessor处理过
	/** Package-visible field that indicates MergedBeanDefinitionPostProcessor having been applied. */
	boolean postProcessed = false;
 
	//在生成代理的时候会使用，表明���否已经生成代理
	/** Package-visible field that indicates a before-instantiation post-processor having kicked in. */
	@Nullable
	volatile Boolean beforeInstantiationResolved;
 
    //以下三个属性是外部管理的方法集合（配置、初始化、銷毀），似乎可以缓存自动装配对象的值
 
	//实际缓存的类型是Constructor、Field、Method类型，更多信息请查看：http://shouce.jb51.net/java/jdk1.5/java/lang/reflect/class-use/Member.html
	@Nullable
	private Set<Member> externallyManagedConfigMembers;
 
	@Nullable
    // InitializingBean中的init回调函数名——afterPropertiesSet会在这里记录，以便进行生命周期回调
	private Set<String> externallyManagedInitMethods;
 
	@Nullable
    // DisposableBean的destroy回调函数名——destroy会在这里记录，以便进行生命周期回调
	private Set<String> externallyManagedDestroyMethods;
```
总结一下，RootBeanDefiniiton保存了以下信息
* 定义了id、别名与Bean的对应关系（BeanDefinitionHolder）
* Bean的注解（AnnotatedElement）
* 具体的工厂方法（Class类型），包括工厂方法的返回类型，工厂方法的Method对象
* 构造函数、构造函数形参类型
* Bean的class对象

可以看到，RootBeanDefinition与AbstractBeanDefinition是互补关系，RootBeanDefinition在AbstractBeanDefinition的基础上定义了更多属性，初始化Bean需要的信息基本完善

#### 1.7.2.2. BeanFactory
<a href="#menu" >目录</a>


```java
public interface BeanFactory {
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String var1) throws BeansException;
    <T> T getBean(String var1, @Nullable Class<T> var2) throws BeansException;
    Object getBean(String var1, Object... var2) throws BeansException;
    <T> T getBean(Class<T> var1) throws BeansException;
    <T> T getBean(Class<T> var1, Object... var2) throws BeansException;
    boolean containsBean(String var1);

    boolean isSingleton(String var1) throws NoSuchBeanDefinitionException;
    boolean isPrototype(String var1) throws NoSuchBeanDefinitionException;
    boolean isTypeMatch(String var1, ResolvableType var2) throws NoSuchBeanDefinitionException;
    boolean isTypeMatch(String var1, @Nullable Class<?> var2) throws NoSuchBeanDefinitionException;
    @Nullable
    
    Class<?> getType(String var1) throws NoSuchBeanDefinitionException;
    String[] getAliases(String var1);
}
```
* 具体：
    * 4个获取实例的方法。getBean的重载方法。
    * 4个判断的方法。判断是否存在，是否为单例、原型，名称类型是否匹配。
    * 1个获取类型的方法、一个获取别名的方法。根据名称获取类型、根据名称获取别名

BeanFactory提供最基本的IOC容器的功能.其继承者通过增加接口方法或者继承实现其他类或者接口来扩展功能.

#### 1.7.2.3. ApplicationContext
<a href="#menu" >目录</a>

![ApplicationContext](pic/spring/spring/beanfactory/AbstractApplicationContext.png)

##### 1.7.2.3.1. 基本介绍
<a href="#menu" >目录</a>

ApplicationContext继承了HierarchicalBeanFactory和ListableBeanFactory接口,在此基础上,还通过继承其他接口扩展了BeanFactory的功能,这些接口如下:
* ApplicationEventPublisher
    * 让容器拥有发布应用上下文事件的功能,包括容器启动事件,关闭事件等
    * 实现了ApplicationListen事件监听接口的Bean可以接收到容器事件,并对事件进行响应处理
    * 在ApplicationContext抽象实现类AbstractApplicationContext中存在一个ApplicationEventMulticaster,负责保存所有的监听器,以便在容器产生上下文事件时通知这些事件监听者
* MessageSource
    * 为应用提供i18n国际化消息访问的功能,为开发多语言版本的应用提供服务
* ResourcePatternResolver 
    * 所有的ApplicationContext实现类都实现了类似于PathMatchingResourcePatternResolver的功能,可以通过带前缀的Ant风格的资源文件路径装载Spring的配置文件
* Lifecycle
    * 提供了start, stop, isRunning方法
    * 主要用于控制异步处理过程

ConfigurableApplicationContext扩展于ApplicationContext,新增了两个主要的方法:refresh()和close(),让ApplicationContext具有启动,刷新和关闭应用上下文的能力.在应用上下文关闭的情况下调用refresh()即可启动应用上下文,在已经启动的状态下调用refresh()则可清除缓存并重新装载配置信息,而调用cloase()则可以关闭应用上下文.


ApplicationContext的初始化和BeanFactory的初始化有一个重大区别,BeanFactory在初始化容器时,并未实例化Bean,直到第一次访问某个bean时才实例化目标bena.而ApplicationContext则在初始化应用上下文时就实例化所有单实例的bean.

##### 1.7.2.3.2. 启动介绍
<a href="#menu" >目录</a>

**refresh()方法**
该方法是触发容器加载BeanDefinition以及创建对象等等一切操作的始发点，定义了作为应用上下文对象的一个抽象层面的标准流程。
所有spring应用上下文的初始化都是基于这个标准流程的。

```java
@Override
public void refresh() throws BeansException, IllegalStateException {
    synchronized (this.startupShutdownMonitor) {
        //设置容器启动开始时间，容器启动状态、初始化环境配置等等
        prepareRefresh();
        //获取beanFactory并触发loadBeanDefinitions，默认是创建DefaultListableBeanFactory
        ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();
        //准备工作，对beanFactory作基本的配置工作
        prepareBeanFactory(beanFactory);
        try {
            //给子类预留的beanFacotry已准备完毕执行BeanFactoryPostProcessors之前的一个hook
            postProcessBeanFactory(beanFactory);
            //上面AnnotationConfigUtils注册的PostProcessors实际都会注册到这里的beanFactory中
            //这里通过PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(beanFactory, getBeanFactoryPostProcessors());
            //来执行所有关于Factory的Processors
            invokeBeanFactoryPostProcessors(beanFactory);
            //这里虽然还没有正式开始实例化对象工厂中的实例，但是BeanDefinition都已准备完毕，因此已经可以通过类型获取
            //所有对应的实现了BeanPostProcessor的 BeanDefinition，然后将对应的类注册到beanFactory中
            registerBeanPostProcessors(beanFactory);
            //这个是spring容器对国际化的实现，可以处理有本地化需求的信息
            initMessageSource();
            //这里是对容器事件广播的实现类初始化默认是使用SimpleApplicationEventMulticaster
            initApplicationEventMulticaster();
            //给子类提供的hook
            onRefresh();
            //这里实现注册监听容器事件的监听者
            registerListeners();
            //这里是实现对容器内所有单例对象的实例化
            finishBeanFactoryInitialization(beanFactory);
            //到这refresh的整个过程就基本完成了，这里主要做容器refresh完毕的事件发布，以及实现容器内对Lifecycle的支持（start）
            finishRefresh();
        }
        catch (BeansException ex) {
            if (logger.isWarnEnabled()) {
                logger.warn("Exception encountered during context initialization - " +
                        "cancelling refresh attempt: " + ex);
            }

            // Destroy already created singletons to avoid dangling resources.
            destroyBeans();
            // Reset 'active' flag.
            cancelRefresh(ex);
            // Propagate exception to caller.
            throw ex;
        }

        finally {
            // Reset common introspection caches in Spring's core, since we
            // might not ever need metadata for singleton beans anymore...
            resetCommonCaches();
        }
    }
}
```
**查看prepareRefresh();执行的细节**

```java
protected void prepareRefresh() {
    //设置容器状态
    this.startupDate = System.currentTimeMillis();
    this.closed.set(false);
    this.active.set(true);

    if (logger.isInfoEnabled()) {
        logger.info("Refreshing " + this);
    }

    //对propertySources作进一步初始化处理的一个hook，例如spring boot拓展的web容器对servletContext servletConfig转换为propertySource放到environment中
    initPropertySources();

    //校验environment中的必须的存在的配置信息是否存在，这里在查看Environment源码时，再看spring对配置propertySource怎么划分哪些是必要配置，哪些是可选配置的
    getEnvironment().validateRequiredProperties();

    //这里容器事件的publisher还未初始化，如果publisher初始化前注册的ApplicationEvents会注册到这里，待后面一起发布。
    this.earlyApplicationEvents = new LinkedHashSet<>();
}
```
**查看 ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();的执行细节**

看是如何获取的BeanFacotry，
虽然ApplicationContext实现了ListableBeanFactory与HierarchicalBeanFactory跟BeanFactory有关的接口，不过具体的接口实现是通过委托给了
这里获取的ConfigurableListableBeanFactory来处理的。
从下面的obtainFreshBeanFactory()方法中可以看到，AbstractApplicationContext并没有作具体实现，而是通过两个抽象方法定义了refresh的过程
只是定义了 refreshBeanFactory(); 加上 getBeanFactory();这两个抽象操作，对obtainFreshBeanFactory()这一步作了个细分（刷新、获取）。
其中refreshBeanFactory()与getBeanFactory()在AbstractRefreshableApplicationContext中进行实现的。

```java
protected ConfigurableListableBeanFactory obtainFreshBeanFactory() {
    //对于可能已存在的BeanFacotry进行refresh
    refreshBeanFactory();
    //获取并返回具体的BeanFacotry
    ConfigurableListableBeanFactory beanFactory = getBeanFactory();
    if (logger.isDebugEnabled()) {
        logger.debug("Bean factory for " + getDisplayName() + ": " + beanFactory);
    }
    return beanFactory;
}
```
下面查看在AbstractRefreshableApplicationContext中的refreshBeanFactory();方法
这里定义了BeanFactory创建以及初始配置、loadBeanDefinition的操作

```java
@Override
protected final void refreshBeanFactory() throws BeansException {
    //检查是否存在beanFacotry，如果是初次refresh操作是不存在的
    if (hasBeanFactory()) { 
        destroyBeans();     //对实现了destory生命周期的对象做 destory回调
        closeBeanFactory(); //实现AbstractApplicationContext中定义的关闭BeanFactory方法，这里就是将this.beanFactory引用置为null
    }
    try {
        //通过new DefaultListableBeanFactory(getInternalParentBeanFactory())创建DefaultListableBeanFactory，getInternalParentBeanFactory()获取的是
        //当前应用上下文中设置的父上下文（ConfigurableApplicationContext）对象中的BeanFactory获取父上下文（ApplicationContext）作为BeanFacotry的父级
        //因此，如果是一个有子父关系的容器，那么它内部的BeanFactory也会建立子父关系，子容器refresh并不会丢失BeanFactory的中的子父关系。
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        beanFactory.setSerializationId(getId());
        //配置对象工厂
        customizeBeanFactory(beanFactory);
        //这里基于应用上下文给beanFactory进行一次BeanDefinition的加载，
        //如：ClassPathXmlApplicationContext中构造时指定了xml资源路径会在此触发解析xml中的BeanDefinition
        loadBeanDefinitions(beanFactory);
        synchronized (this.beanFactoryMonitor) {
            //保持一个引用，供容器做BeanFactory相关操作的委托调用
            this.beanFactory = beanFactory;
        }
    }
    catch (IOException ex) {
        throw new ApplicationContextException("I/O error parsing bean definition source for " + getDisplayName(), ex);
    }
}
```

**查看prepareBeanFactory(beanFactory);的执行细节**
这里是对beanFactory作的一个应用层面上的配置。
应用上下文相关的接口注入是在这里处理的.

```java
protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory) {
    //统一BeanFactory与应用上下文对象的ClassLoader
    beanFactory.setBeanClassLoader(getClassLoader());
    //实现SPEL表达式的解析器
    beanFactory.setBeanExpressionResolver(new StandardBeanExpressionResolver(beanFactory.getBeanClassLoader()));

    //这个添加的是一些基于ResourceLoader的PropertyEditorRegistrar用来注册相关的属性编辑器PropertyEditor，PropertyEditor是java内省中定义的接口
    //功能就是支持通过string类型来编辑属性值，例如：通过字符串给long类型设置值，可以是输入longEditor.setAsText("1000");
    //其实实现很简单，就是将string转换为Long进行修改值即可，这里是spring拓展一些的PropertyEditor的拓展
    beanFactory.addPropertyEditorRegistrar(new ResourceEditorRegistrar(this, getEnvironment()));

    //这个是关于ApplicationContext的一些对象的接口注入实现，该processor实现的是BeanPostProcessor，因此是在bean创建的相关回调阶段，然后判断接口类型，
    //执行对应的注入方法
    beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
    //下面六种对象都是通过ApplicationContextAwareProcessor来执行接口注入的
    beanFactory.ignoreDependencyInterface(EnvironmentAware.class);
    beanFactory.ignoreDependencyInterface(EmbeddedValueResolverAware.class);
    beanFactory.ignoreDependencyInterface(ResourceLoaderAware.class);
    beanFactory.ignoreDependencyInterface(ApplicationEventPublisherAware.class);
    beanFactory.ignoreDependencyInterface(MessageSourceAware.class);
    beanFactory.ignoreDependencyInterface(ApplicationContextAware.class);

    //通过下面的接口可以将这四个对象由依赖注入，注到实例中使用（因为这些对象都是直接创建的，不是通过BeanDefinition，所以需要这里显式的注册到依赖列表中）。
    beanFactory.registerResolvableDependency(BeanFactory.class, beanFactory);
    beanFactory.registerResolvableDependency(ResourceLoader.class, this);
    beanFactory.registerResolvableDependency(ApplicationEventPublisher.class, this);
    beanFactory.registerResolvableDependency(ApplicationContext.class, this);

    //该对象用来处理实现了ApplicationListener接口的实例，处理在Bean创建完毕的回调中进行注册实例到应用监听列表中，以及在destroy时执行移除操作
    beanFactory.addBeanPostProcessor(new ApplicationListenerDetector(this));

    //这个是实现对LoadTimeWeaverAware接口实现接口注入的处理器
    if (beanFactory.containsBean(LOAD_TIME_WEAVER_BEAN_NAME)) {
        beanFactory.addBeanPostProcessor(new LoadTimeWeaverAwareProcessor(beanFactory));
        // Set a temporary ClassLoader for type matching.
        beanFactory.setTempClassLoader(new ContextTypeMatchClassLoader(beanFactory.getBeanClassLoader()));
    }

    //将environment相关的对象注册到对beanFacotry中
    if (!beanFactory.containsLocalBean(ENVIRONMENT_BEAN_NAME)) {
        beanFactory.registerSingleton(ENVIRONMENT_BEAN_NAME, getEnvironment());
    }
    if (!beanFactory.containsLocalBean(SYSTEM_PROPERTIES_BEAN_NAME)) {
        beanFactory.registerSingleton(SYSTEM_PROPERTIES_BEAN_NAME, getEnvironment().getSystemProperties());
    }
    if (!beanFactory.containsLocalBean(SYSTEM_ENVIRONMENT_BEAN_NAME)) {
        beanFactory.registerSingleton(SYSTEM_ENVIRONMENT_BEAN_NAME, getEnvironment().getSystemEnvironment());
    }
}
```

**查看postProcessBeanFactory(beanFactory);的处理细节**
这个是给子类预留的一个阶段回调，方便子类在BeanFacotry准备完毕下一个阶段开始之前做一些拓展。
因此在AbstractApplicationContext中未作任何操作

**查看invokeBeanFactoryPostProcessors(beanFactory);的处理细节**

这里主要是去调用BeanFactoryPostProcessor中的postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)

```java
protected void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
    //执行所有的BeanFactoryPostProcessor
    PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(beanFactory, getBeanFactoryPostProcessors());

    // Detect a LoadTimeWeaver and prepare for weaving, if found in the meantime
    // (e.g. through an @Bean method registered by ConfigurationClassPostProcessor)
    if (beanFactory.getTempClassLoader() == null && beanFactory.containsBean(LOAD_TIME_WEAVER_BEAN_NAME)) {
        beanFactory.addBeanPostProcessor(new LoadTimeWeaverAwareProcessor(beanFactory));
        beanFactory.setTempClassLoader(new ContextTypeMatchClassLoader(beanFactory.getBeanClassLoader()));
    }
}
```
查看PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(beanFactory, getBeanFactoryPostProcessors())
中的具体执行逻辑
可以看到BeanDefinitionRegistryPostProcessor中的回调是优先于BeanPostProcessor的。
BeanDefinitionRegistryPostProcessor的作用是针对registry注册、修改BeanDefinition用的。

```java
public static void invokeBeanFactoryPostProcessors(
            ConfigurableListableBeanFactory beanFactory, List<BeanFactoryPostProcessor> beanFactoryPostProcessors) {

    // Invoke BeanDefinitionRegistryPostProcessors first, if any.
    Set<String> processedBeans = new HashSet<>();

    if (beanFactory instanceof BeanDefinitionRegistry) { //BeanFacotry实现了BeanDefinitionRegistry的情况

        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        List<BeanFactoryPostProcessor> regularPostProcessors = new LinkedList<>();
        List<BeanDefinitionRegistryPostProcessor> registryProcessors = new LinkedList<>();
        //这里将通过应用上下文注册的BeanFacotryPostProcessor根据是否是它的子类型BeanDefinitionRegistryPostProcessor划分为两个部分
        for (BeanFactoryPostProcessor postProcessor : beanFactoryPostProcessors) {
            if (postProcessor instanceof BeanDefinitionRegistryPostProcessor) {
                //这里先执行BeanDefinitionRegistryPostProcessor拓展的postProcessBeanDefinitionRegistry回调。
                //由于它是先与postProcessBeanFactory回调进行调用的，因此通过postProcessBeanDefinitionRegistry中注册BeanFactoryPostProcessor的
                //话，是没问题的。
                BeanDefinitionRegistryPostProcessor registryProcessor =
                        (BeanDefinitionRegistryPostProcessor) postProcessor;
                registryProcessor.postProcessBeanDefinitionRegistry(registry);
                registryProcessors.add(registryProcessor);
            }
            else {
                regularPostProcessors.add(postProcessor);
            }
        }

        // Do not initialize FactoryBeans here: We need to leave all regular beans
        // uninitialized to let the bean factory post-processors apply to them!
        // Separate between BeanDefinitionRegistryPostProcessors that implement
        // PriorityOrdered, Ordered, and the rest.
        List<BeanDefinitionRegistryPostProcessor> currentRegistryProcessors = new ArrayList<>();

        // First, invoke the BeanDefinitionRegistryPostProcessors that implement PriorityOrdered.
        //由于上面在创建BeanFactory时进行过一次BeanDefinition的加载，因此在BeanFactory中会存在BeanDefinitionRegistryPostProcessor类型的BeanDefinition
        //这里仅仅是获取名称，并未进行实例化
        String[] postProcessorNames =
                beanFactory.getBeanNamesForType(BeanDefinitionRegistryPostProcessor.class, true, false);
        //这里把实现了PriorityOrdered的Processor进行优先处理并进行排序
        for (String ppName : postProcessorNames) {
            //这里beanFactory中，由于实例尚未初始化，因此是通过BeanDefinition来判断类型是否匹配的
            if (beanFactory.isTypeMatch(ppName, PriorityOrdered.class)) {
            currentRegistryProcessors.add(beanFactory.getBean(ppName, BeanDefinitionRegistryPostProcessor.class));
                processedBeans.add(ppName);
            }
        }
        //根据PriorityOrdered进行排序
        sortPostProcessors(currentRegistryProcessors, beanFactory);
        //未实现排序的追到到后面去
        registryProcessors.addAll(currentRegistryProcessors);
        //这里先执行BeanDefinitionRegistryPostProcessor拓展的postProcessBeanDefinitionRegistry回调。
        invokeBeanDefinitionRegistryPostProcessors(currentRegistryProcessors, registry);
        currentRegistryProcessors.clear();

        // Next, invoke the BeanDefinitionRegistryPostProcessors that implement Ordered.
        //这里处理实现Ordered的BeanDefinitionRegistryPostProcessors，由于PriorityOrdered先于
        postProcessorNames = beanFactory.getBeanNamesForType(BeanDefinitionRegistryPostProcessor.class, true, false);
        for (String ppName : postProcessorNames) {
            if (!processedBeans.contains(ppName) && beanFactory.isTypeMatch(ppName, Ordered.class)) {
                currentRegistryProcessors.add(beanFactory.getBean(ppName, BeanDefinitionRegistryPostProcessor.class));
                processedBeans.add(ppName);
            }
        }
        sortPostProcessors(currentRegistryProcessors, beanFactory);
        registryProcessors.addAll(currentRegistryProcessors);
        invokeBeanDefinitionRegistryPostProcessors(currentRegistryProcessors, registry);
        currentRegistryProcessors.clear();

        // Finally, invoke all other BeanDefinitionRegistryPostProcessors until no further ones appear
        //循环处理BeanDefinitionRegistryPostProcessors直到没有类型为BeanDefinitionRegistryPostProcessor的为止
        boolean reiterate = true;
        while (reiterate) {
            reiterate = false;
            postProcessorNames = beanFactory.getBeanNamesForType(BeanDefinitionRegistryPostProcessor.class, true, false);
            for (String ppName : postProcessorNames) {
                if (!processedBeans.contains(ppName)) {
                    currentRegistryProcessors.add(beanFactory.getBean(ppName, BeanDefinitionRegistryPostProcessor.class));
                    processedBeans.add(ppName);
                    reiterate = true;
                }
            }
            sortPostProcessors(currentRegistryProcessors, beanFactory);
            registryProcessors.addAll(currentRegistryProcessors);
            invokeBeanDefinitionRegistryPostProcessors(currentRegistryProcessors, registry);
            currentRegistryProcessors.clear();
        }

        // Now, invoke the postProcessBeanFactory callback of all processors handled so far.
        //调用BeanPostProcessor中的回调
        invokeBeanFactoryPostProcessors(registryProcessors, beanFactory);
        invokeBeanFactoryPostProcessors(regularPostProcessors, beanFactory);
    }

    else {
        // Invoke factory processors registered with the context instance.
        invokeBeanFactoryPostProcessors(beanFactoryPostProcessors, beanFactory);
    }

    // Do not initialize FactoryBeans here: We need to leave all regular beans
    // uninitialized to let the bean factory post-processors apply to them!
    //处理所有通过BeanDefinitionRegistryPostProcessor注册BeanPostProcessor
    String[] postProcessorNames =
            beanFactory.getBeanNamesForType(BeanFactoryPostProcessor.class, true, false);

    // Separate between BeanFactoryPostProcessors that implement PriorityOrdered,
    // Ordered, and the rest.
    //分组
    List<BeanFactoryPostProcessor> priorityOrderedPostProcessors = new ArrayList<>();
    List<String> orderedPostProcessorNames = new ArrayList<>();
    List<String> nonOrderedPostProcessorNames = new ArrayList<>();
    for (String ppName : postProcessorNames) {
        if (processedBeans.contains(ppName)) {
            // skip - already processed in first phase above
        }
        else if (beanFactory.isTypeMatch(ppName, PriorityOrdered.class)) {
            priorityOrderedPostProcessors.add(beanFactory.getBean(ppName, BeanFactoryPostProcessor.class));
        }
        else if (beanFactory.isTypeMatch(ppName, Ordered.class)) {
            orderedPostProcessorNames.add(ppName);
        }
        else {
            nonOrderedPostProcessorNames.add(ppName);
        }
    }

    // First, invoke the BeanFactoryPostProcessors that implement PriorityOrdered.
    //排序调用
    sortPostProcessors(priorityOrderedPostProcessors, beanFactory);
    invokeBeanFactoryPostProcessors(priorityOrderedPostProcessors, beanFactory);

    // Next, invoke the BeanFactoryPostProcessors that implement Ordered.
    List<BeanFactoryPostProcessor> orderedPostProcessors = new ArrayList<>();
    for (String postProcessorName : orderedPostProcessorNames) {
        orderedPostProcessors.add(beanFactory.getBean(postProcessorName, BeanFactoryPostProcessor.class));
    }
    sortPostProcessors(orderedPostProcessors, beanFactory);
    invokeBeanFactoryPostProcessors(orderedPostProcessors, beanFactory);

    // Finally, invoke all other BeanFactoryPostProcessors.
    List<BeanFactoryPostProcessor> nonOrderedPostProcessors = new ArrayList<>();
    for (String postProcessorName : nonOrderedPostProcessorNames) {
        nonOrderedPostProcessors.add(beanFactory.getBean(postProcessorName, BeanFactoryPostProcessor.class));
    }
    invokeBeanFactoryPostProcessors(nonOrderedPostProcessors, beanFactory);

    // Clear cached merged bean definitions since the post-processors might have
    // modified the original metadata, e.g. replacing placeholders in values...
    beanFactory.clearMetadataCache();
}
```
可以看到这里BeanFactoryPostProcessors的顺序细节
1.直接注册到AbstractApplicationContext中的beanFactoryPostProcessors且类型为BeanDefinitionRegistryPostProcessor
    执行BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
2.被BeanFactory通过AbstractRefreshableApplicationContext创建BeanFactory时的loadBeanDefinition加载的（或者第一步修改registry注册进去的）类型为
    BeanDefinitionRegistryPostProcessor的而且实现了PriorityOrdered接口的BeanDefinition。然后根据getOrder()的值通过排序器
    ((DefaultListableBeanFactory) beanFactory).getDependencyComparator()如果不存在则用OrderComparator.INSTANCE。
    调用postProcessor.postProcessBeanDefinitionRegistry(registry);
3.被BeanFactory通过AbstractRefreshableApplicationContext创建BeanFactory时的loadBeanDefinition加载的（或者第一步、第二步修改registry注册进去的）类型为
    BeanDefinitionRegistryPostProcessor的而且实现了Ordered接口的BeanDefinition,然后根据getOrder()的值通过排序器
    ((DefaultListableBeanFactory) beanFactory).getDependencyComparator()如果不存在则用OrderComparator.INSTANCE。
    调用postProcessor.postProcessBeanDefinitionRegistry(registry);
    注意：PriorityOrdered是Ordered的子接口，因此这里就算第二部注册了一些实现了PriorityOrdered的BeanDefinitionRegistryPostProcessor，
    仅仅会根据getOrder()值进行排序执行的。
4.到这可能会由3步骤产生新的BeanDefinitionRegistryPostProcessor类型的BeanDefinition，而且每一次调用都可能会产生新的该类型BeanDefinition
    这里直接循环（+ 排序）调用postProcessor.postProcessBeanDefinitionRegistry(registry);，
    直至没有需要处理的BeanDefinitionRegistryPostProcessor类型的为止。
5.执行上面获取的所有BeanPostProcessor中的postProcessor.postProcessBeanFactory(beanFactory);
    虽然BeanDefinitionRegistryPostProcessor为BeanPostProcessor的子类，但是上面处理并没有开始执行postProcessor.postProcessBeanFactory(beanFactory);
    方法，这一步直接全部挨个先调用BeanDefinitionRegistryPostProcessor的postProcessBeanFactory(beanFactory)后调用
    上面从AbstractApplicationContext中获取的类型不为BeanDefinitionRegistryPostProcessor以及1、2、3、4获取的类型为BeanPostProcessor的
    postProcessBeanFactory(beanFactory)回调。
6.在第四步循环处理的是为子类型BeanDefinitionRegistryPostProcessor，因此会产生很多新的BeanPostProcessor这里统一处理有类型为BeanFactoryPostProcessor的
   将所有类型为BeanPostProcessor的根据实现了1、ProrityOrdered接口的与实现2、Ordered接口的以及3、未实现排序接口的分为三组
   然后排序依次执行

**查看registerBeanPostProcessors(beanFactory);处理细**

```java
protected void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
    PostProcessorRegistrationDelegate.registerBeanPostProcessors(beanFactory, this);
}
```
查看PostProcessorRegistrationDelegate.registerBeanPostProcessors(beanFactory, this);代码
```java
public static void registerBeanPostProcessors(
        ConfigurableListableBeanFactory beanFactory, AbstractApplicationContext applicationContext) {

    String[] postProcessorNames = beanFactory.getBeanNamesForType(BeanPostProcessor.class, true, false);

    // Register BeanPostProcessorChecker that logs an info message when
    // a bean is created during BeanPostProcessor instantiation, i.e. when
    // a bean is not eligible for getting processed by all BeanPostProcessors.
    //需要执行是BeanPostProcessor的个数 = 注册到BeanFactory中的个数 + BeanDefinition类型为BeanPostProcessor的个数 + 下面 1 个
    int beanProcessorTargetCount = beanFactory.getBeanPostProcessorCount() + 1 + postProcessorNames.length;
    beanFactory.addBeanPostProcessor(new BeanPostProcessorChecker(beanFactory, beanProcessorTargetCount));

    // Separate between BeanPostProcessors that implement PriorityOrdered,
    // Ordered, and the rest.
    //根据PriorityOrdered、Ordered、其他进行分组
    List<BeanPostProcessor> priorityOrderedPostProcessors = new ArrayList<>();
    List<BeanPostProcessor> internalPostProcessors = new ArrayList<>();
    List<String> orderedPostProcessorNames = new ArrayList<>();
    List<String> nonOrderedPostProcessorNames = new ArrayList<>();
    for (String ppName : postProcessorNames) {
        if (beanFactory.isTypeMatch(ppName, PriorityOrdered.class)) {
            BeanPostProcessor pp = beanFactory.getBean(ppName, BeanPostProcessor.class);
            priorityOrderedPostProcessors.add(pp);
            if (pp instanceof MergedBeanDefinitionPostProcessor) {
                internalPostProcessors.add(pp);
            }
        }
        else if (beanFactory.isTypeMatch(ppName, Ordered.class)) {
            orderedPostProcessorNames.add(ppName);
        }
        else {
            nonOrderedPostProcessorNames.add(ppName);
        }
    }

    // First, register the BeanPostProcessors that implement PriorityOrdered.
    //priorityOrdered组排序注册到BeanFactory
    sortPostProcessors(priorityOrderedPostProcessors, beanFactory);
    registerBeanPostProcessors(beanFactory, priorityOrderedPostProcessors);

    // Next, register the BeanPostProcessors that implement Ordered.
    //ordered组排序注册到BeanFactory
    List<BeanPostProcessor> orderedPostProcessors = new ArrayList<>();
    for (String ppName : orderedPostProcessorNames) {
        BeanPostProcessor pp = beanFactory.getBean(ppName, BeanPostProcessor.class);
        orderedPostProcessors.add(pp);
        if (pp instanceof MergedBeanDefinitionPostProcessor) {
            internalPostProcessors.add(pp);
        }
    }
    sortPostProcessors(orderedPostProcessors, beanFactory);
    registerBeanPostProcessors(beanFactory, orderedPostProcessors);

    // Now, register all regular BeanPostProcessors.
    //普通的BeanPostProcessor注册到BeanFactory
    List<BeanPostProcessor> nonOrderedPostProcessors = new ArrayList<>();
    for (String ppName : nonOrderedPostProcessorNames) {
        BeanPostProcessor pp = beanFactory.getBean(ppName, BeanPostProcessor.class);
        nonOrderedPostProcessors.add(pp);
        if (pp instanceof MergedBeanDefinitionPostProcessor) {
            internalPostProcessors.add(pp);
        }
    }
    registerBeanPostProcessors(beanFactory, nonOrderedPostProcessors);

    // Finally, re-register all internal BeanPostProcessors.
    //将MergedBeanDefinitionPostProcessor类型的重新注册到靠后的位置
    sortPostProcessors(internalPostProcessors, beanFactory);
    registerBeanPostProcessors(beanFactory, internalPostProcessors);

    // Re-register post-processor for detecting inner beans as ApplicationListeners,
    // moving it to the end of the processor chain (for picking up proxies etc).
    //将ApplicationListenerDetector这个processor放到最后面
    //在前面prepareBeanFactory(ConfigurableListableBeanFactory beanFactory)方法中注册过一次，是为了处理BeanFactoryPostProcessor处理过程中可能存在的注册
    //这里重新注册下是为了将这个BeanPostProcessor放到最最后面处理，因为如果可能存在一些通过代理实现监听的对象，包保证它一定能处理到。
    beanFactory.addBeanPostProcessor(new ApplicationListenerDetector(applicationContext));
}
```
BeanPostProcessor注册在BeanFacotry中的顺序关系
1.此前直接注册到BeanFactory中的顺序不变
2.BeanPostProcessorChecker紧随此前直接注册到BeanFacotry中BeanPostProcessor
3.实现了PriorityOrdered接口的BeanPostProcessor (根据getOrder()排序)
4.实现了Ordered接口的BeanPostProcessor（根据getOrder()排序）
5.未实现关于Order接口的普通BeanPostProcessor
6.所有类型为BeanPostProcessor的子类型的MergedBeanDefinitionPostProcessor重新注册，使它们的执行顺序在BeanPostProcessor直接类型的后面
7.ApplicationListenerDetector这个BeanPostProcessor放到最最后面执行

**查看initMessageSource();执行细节**
MessageSource是spring中对本地化消息的支持
可以通过自定义BeanID为messageSource的方式来自定义 MessageSource 在SpringBoot中是通过autoconfigure中的
org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration来定制容器中使用
org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration.ResourceBundleCondition作为自动配置下的MessageSource

```java
protected void initMessageSource() {
    ConfigurableListableBeanFactory beanFactory = getBeanFactory();
    //这里判断是否定义过BeanID为messageSource的对象
    if (beanFactory.containsLocalBean(MESSAGE_SOURCE_BEAN_NAME)) {
        this.messageSource = beanFactory.getBean(MESSAGE_SOURCE_BEAN_NAME, MessageSource.class);
        如果ApplicationContext有父应用上下文对象，那么给messageSource也维护下父级关系
        if (this.parent != null && this.messageSource instanceof HierarchicalMessageSource) {
            HierarchicalMessageSource hms = (HierarchicalMessageSource) this.messageSource;
            if (hms.getParentMessageSource() == null) {
                // Only set parent context as parent MessageSource if no parent MessageSource
                // registered already.
                hms.setParentMessageSource(getInternalParentMessageSource());
            }
        }
        if (logger.isDebugEnabled()) {
            logger.debug("Using MessageSource [" + this.messageSource + "]");
        }
    }
    else {
        // 没有自定义MessageSource的情况下，使用默认委托父级处理的MessageSource（如果没有父级，都进行空处理）
        DelegatingMessageSource dms = new DelegatingMessageSource();
        dms.setParentMessageSource(getInternalParentMessageSource());
        this.messageSource = dms;
        // 注册到Bean容器中 以便在应用上下文环境中 使用依赖注入、接口注入等方式获取当前MessageSource
        beanFactory.registerSingleton(MESSAGE_SOURCE_BEAN_NAME, this.messageSource);
        if (logger.isDebugEnabled()) {
            logger.debug("Unable to locate MessageSource with name '" + MESSAGE_SOURCE_BEAN_NAME +
                    "': using default [" + this.messageSource + "]");
        }
    }
}
```
**查看initApplicationEventMulticaster();执行细节**
这里主要配置应用上下文中的ApplicationEvent的事件广播实现类对象，来处理容器中的事件分发工作。
实现方式与上面MessageSource类似，如果没有自定义的bean选用默认的

```java
protected void initApplicationEventMulticaster() {
    ConfigurableListableBeanFactory beanFactory = getBeanFactory();
    if (beanFactory.containsLocalBean(APPLICATION_EVENT_MULTICASTER_BEAN_NAME)) {
        this.applicationEventMulticaster =
                beanFactory.getBean(APPLICATION_EVENT_MULTICASTER_BEAN_NAME, ApplicationEventMulticaster.class);
        if (logger.isDebugEnabled()) {
            logger.debug("Using ApplicationEventMulticaster [" + this.applicationEventMulticaster + "]");
        }
    }
    else {
        this.applicationEventMulticaster = new SimpleApplicationEventMulticaster(beanFactory);
        beanFactory.registerSingleton(APPLICATION_EVENT_MULTICASTER_BEAN_NAME, this.applicationEventMulticaster);
        if (logger.isDebugEnabled()) {
            logger.debug("Unable to locate ApplicationEventMulticaster with name '" +
                    APPLICATION_EVENT_MULTICASTER_BEAN_NAME +
                    "': using default [" + this.applicationEventMulticaster + "]");
        }
    }
}
```
**查看onRefresh()**

这里主要是实现将，应用上下文事件监听对象的注册。

```java
protected void registerListeners() {
    // 注册直接设置到容器中的监听实现类对象（在容器事件发布器未初始化时执行addApplicationListener的对象会设置到这里）
    for (ApplicationListener<?> listener : getApplicationListeners()) {
        getApplicationEventMulticaster().addApplicationListener(listener);
    }

    // 对于其他对象 由于还没有开始初始化执行对应的BeanPostProcessor 这里只是注册进去一个BeanName
    String[] listenerBeanNames = getBeanNamesForType(ApplicationListener.class, true, false);
    for (String listenerBeanName : listenerBeanNames) {
        getApplicationEventMulticaster().addApplicationListenerBean(listenerBeanName);
    }

    // 对于ApplicationEventMulticaster尚未初始化前发布的一些事件 会缓存到earlyApplicationEvents中，在这里执行事件分发
    Set<ApplicationEvent> earlyEventsToProcess = this.earlyApplicationEvents;
    this.earlyApplicationEvents = null;
    if (earlyEventsToProcess != null) {
        for (ApplicationEvent earlyEvent : earlyEventsToProcess) {
            getApplicationEventMulticaster().multicastEvent(earlyEvent);
        }
    }
}
```

**查看finishBeanFactoryInitialization(beanFactory);实现**

这一步是将无需懒加载的单例对象都进行初始化
```java
protected void finishBeanFactoryInitialization(ConfigurableListableBeanFactory beanFactory) {
    // 初始化一个ConversionService，它的作用类似于JavaBean中的PropertyEditor用来转换配置值
    if (beanFactory.containsBean(CONVERSION_SERVICE_BEAN_NAME) &&
            beanFactory.isTypeMatch(CONVERSION_SERVICE_BEAN_NAME, ConversionService.class)) {
        beanFactory.setConversionService(
                beanFactory.getBean(CONVERSION_SERVICE_BEAN_NAME, ConversionService.class));
    }

    // Register a default embedded value resolver if no bean post-processor
    // (such as a PropertyPlaceholderConfigurer bean) registered any before:
    // at this point, primarily for resolution in annotation attribute values.
    // 如果不存在value解析器，添加一个基于environment的占位符解析器
    if (!beanFactory.hasEmbeddedValueResolver()) {
        beanFactory.addEmbeddedValueResolver(strVal -> getEnvironment().resolvePlaceholders(strVal));
    }

    // Initialize LoadTimeWeaverAware beans early to allow for registering their transformers early.
    String[] weaverAwareNames = beanFactory.getBeanNamesForType(LoadTimeWeaverAware.class, false, false);
    for (String weaverAwareName : weaverAwareNames) {
        getBean(weaverAwareName);
    }

    // Stop using the temporary ClassLoader for type matching.
    beanFactory.setTempClassLoader(null);

    // Allow for caching all bean definition metadata, not expecting further changes.
    beanFactory.freezeConfiguration();

    // Instantiate all remaining (non-lazy-init) singletons.
    // 这里开始进行单例对象实例化工作。 后面详细查看创建单例对象的实现细节。
    beanFactory.preInstantiateSingletons();
}

```

**finishRefresh();**
这里应用上下文 已经准备完毕，主要负责事件发布，以及与处理应用上下文Lifecycle的实现

```java
protected void finishRefresh() {
    // Clear context-level resource caches (such as ASM metadata from scanning).
    clearResourceCaches();

    // Initialize lifecycle processor for this context.
    //这里初始化一个Lifecycle的处理器，与MessageSource类似，如果不指定Bean ID 为lifecycleProcessor的对象，那么会选用一个默认的处理器
    initLifecycleProcessor();

    // Propagate refresh to lifecycle processor first.
    //这里是启动是实现SmartLifecycle且isAutoStartup()返回true的对象，如果其他的对象想执行start()必须进行手动调用applicationContext.start()
    getLifecycleProcessor().onRefresh();

    // Publish the final event.
    //发布容器初始化完成的事件
    publishEvent(new ContextRefreshedEvent(this));

    // Participate in LiveBeansView MBean, if active.
    // 这里是对于容器实现的一个json视图
    LiveBeansView.registerApplicationContext(this);
}
```

#### 1.7.2.4. WebApplicationContext
<a href="#menu" >目录</a>

![WebApplicationContext](pic/spring/spring/beanfactory/WebApplicationContext.png)

WebApplicationContext是专门为web应用准备的,他允许从相对于web根目录的路劲中装载配置文件完成初始化工作，从WebApplicationContext中可以获得ServletContext的引用，整个Web应用上下文对象将作为属性放置在ServletContext中，以便web应用可以访问spring上下文,spring中提供WebApplicationContextUtils的getWebApplicationContext(ServletContext src)方法来获得WebApplicationContext对象

在非web环境下,Bean只有singleton和prototype两种作用域.
WebApplicationContext为Bean添加了三个新的作用域request,session,global session.

WebApplicationContext扩展了ApplicationContext.在 WebApplicationContext中定义了一个常量 ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE，在上下文启动时,WebApplicationContext以此为键放置在ServletContext属性列表中

#### 1.7.2.5. 父子容器
<a href="#menu" >目录</a>

通过HierarchicalBeanFactory接口,Spring的IOC容器可以建立父子层级关联的容器体系,子容器可以访问父容器中的Bean,但是父容器不能访问子容器中的Bean.在容器内,Bean的id必须是唯一的,但子容器可以拥有一个和父容器id相同的Bean.父子容器层级体系增强了Spring容器架构的扩展性和灵活性,因为第三方可以通过编程的方式为一个已经存在的容器添加一个或多个特殊的子容器,以提供一些额外的功能.

Spring使用父子容器实现了很多功能,比如在Spring MVC中,展现层Bean位于一个子容器中,而业务层和持久层Bean位于父容器中.这样,展现层的Bean可以访问业务层和持久层的bean,反之则不行.


#### 1.7.2.6. DefaultListableBeanFactory
<a href="#menu" >目录</a>

spring Ioc容器的实现，从根源上是beanfactory，但真正可以作为一个可以独立使用的ioc容器还是DefaultListableBeanFactory，因此可以这么说，
DefaultListableBeanFactory 是整个spring ioc的始祖，研究透它的前生今世对我们理解spring ioc的概念有着重要的作用

![DefaultListableBeanFactory](pic/spring/spring/beanfactory/DefaultListableBeanFactory.png)

```java
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements ConfigurableListableBeanFactory, BeanDefinitionRegistry, Serializable {
    @Nullable
    private static Class<?> javaxInjectProviderClass;
    private static final Map<String, Reference<DefaultListableBeanFactory>> serializableFactories;
    @Nullable
    private String serializationId;
    private boolean allowBeanDefinitionOverriding = true;
    private boolean allowEagerClassLoading = true;
    @Nullable
    private Comparator<Object> dependencyComparator;
    private AutowireCandidateResolver autowireCandidateResolver = new SimpleAutowireCandidateResolver();
    private final Map<Class<?>, Object> resolvableDependencies = new ConcurrentHashMap(16);
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap(256);
    private final Map<Class<?>, String[]> allBeanNamesByType = new ConcurrentHashMap(64);
    private final Map<Class<?>, String[]> singletonBeanNamesByType = new ConcurrentHashMap(64);
    private volatile List<String> beanDefinitionNames = new ArrayList(256);
    private volatile Set<String> manualSingletonNames = new LinkedHashSet(16);
    @Nullable
    private volatile String[] frozenBeanDefinitionNames;
    private volatile boolean configurationFrozen = false;

```
**DefaultListableBeanFactory的作用：**
* 默认实现了ListableBeanFactory和BeanDefinitionRegistry接口，基于bean definition对象，是一个成熟的bean factroy。
* 最典型的应用是：在访问bean前，先注册所有的definition（可能从bean definition配置文件中）。使用预先建立的bean定义元数据对象，从本地的bean definition表中查询bean definition因而将不会花费太多成本。
* DefaultListableBeanFactory既可以作为一个单独的beanFactory，也可以作为自定义beanFactory的父类。

注意：特定格式bean definition的解析器可以自己实现，也可以使用原有的解析器，如：PropertiesBeanDefinitionReader和XmLBeanDefinitionReader。

**DefaultListableBeanFactory其实要实现的功能就是以list集合的方式操作bean，为什么要拆成这么多的类和接口呢。这里面可能基于几点考虑。**
* 功能的不同维度，分不同的接口，方便以后的维护和其他人的阅读。如：AutowireCapableBeanFactory、ListableBeanFactory、HierarchicalBeanFactory等
* 不同接口的实现，分布在不同的之类里，方便以后不同接口多种实现的扩展
* 从整个类图的分布，可以看出spring在这块是面向接口编程，后面类的实现，他们认为只是接口功能实现的一种，随时可以拓展成多种实现

**相关类说明**
* AliasRegistry
    * 定义对alias的简单增删改等操作
* SimpleAliasRegistry
    * 主要使用map作为alias的缓存,并对接口AliasRegister进行实现
* SingletonBeanRegistry
    * 定义对单例的注册即获取
* BeanFactory
    * 容器的顶层接口
* DefaultSingletonBeanRegistry
    * 对接口SingletonBeanRegistry的实现
* HierarchicalBeanFactory
    * 在BeanFactory的基础上增加parentFactory的支持
* BeanDefinitionRegister
    * 定义对BeanDefinition的各种增删改
* FactoryBeanRegisterSupport
    * 在DefaultSingletonBeanRegistry的基础上增加对FactoryBean的特殊处理功能
* ConfigurableBeanFactory
    * 提供配置Factory的各种方法
* ListableBeanFactory
    * 根据各种条件获取bean的配置清单
* AbstractBeanFactory
    * 综合FactoryBeanRegisterSupport和ConfigurableBeanFactory的功能
* AutowireCapableBeanFactory
    * 提供创建Bean,自动注入,初始化以及应用bean的后处理器
* AbstractAutowireCapableBeanFactory
    * 综合AbstractBeanFactory并对AutowireCapableBeanFactory接口进行实现
* ConfigurableListableBeanFactory
    * BeanFactory配置清单,指定忽略类型和接口
* DefaultListableBeanFactory
    * 综合上面所有的功能
* XmlBeanFactory
    * 从xml文件中加载资源
    
#### 1.7.2.7. HierarchicalBeanFactory
<a href="#menu" >目录</a>


```java
public interface HierarchicalBeanFactory extends BeanFactory {
    @Nullable
    BeanFactory getParentBeanFactory();

    boolean containsLocalBean(String var1);
}
```
1. 第一个方法返回本Bean工厂的父工厂。这个方法实现了工厂的分层。
2. 第二个方法判断本地工厂是否包含这个Bean（忽略其他所有父工厂）。这也是分层思想的体现。
总结：这个工厂接口非常简单，实现了Bean工厂的分层。这个工厂接口也是继承自BeanFacotory，也是一个二级接口，相对于父接口，它只扩展了一个重要的功能——工厂分层。

#### 1.7.2.8. SimpleJndiBeanFactory
<a href="#menu" >目录</a>

SimpleJndiBeanFactory 是一个实现类,并且没有继承者.

```java
public class SimpleJndiBeanFactory extends JndiLocatorSupport implements BeanFactory {
    private final Set<String> shareableResources = new HashSet();
    private final Map<String, Object> singletonObjects = new HashMap();
    private final Map<String, Class<?>> resourceTypes = new HashMap();
    .................
}
```

可以看到,这里只是实现了一个简单的容器,使用集合来存储对象


#### 1.7.2.9. AutowireCapableBeanFactory
<a href="#menu" >目录</a>

```java
public interface AutowireCapableBeanFactory extends BeanFactory {
    int AUTOWIRE_NO = 0;
    int AUTOWIRE_BY_NAME = 1;
    int AUTOWIRE_BY_TYPE = 2;
    int AUTOWIRE_CONSTRUCTOR = 3;
    /** @deprecated */
    @Deprecated
    int AUTOWIRE_AUTODETECT = 4;

    <T> T createBean(Class<T> var1) throws BeansException;
    void autowireBean(Object var1) throws BeansException;
    Object configureBean(Object var1, String var2) throws BeansException;
    Object createBean(Class<?> var1, int var2, boolean var3) throws BeansException;
    Object autowire(Class<?> var1, int var2, boolean var3) throws BeansException;
    void autowireBeanProperties(Object var1, int var2, boolean var3) throws BeansException;
    void applyBeanPropertyValues(Object var1, String var2) throws BeansException;
    Object initializeBean(Object var1, String var2) throws BeansException;
    Object applyBeanPostProcessorsBeforeInitialization(Object var1, String var2) throws BeansException;
    Object applyBeanPostProcessorsAfterInitialization(Object var1, String var2) throws BeansException;
    void destroyBean(Object var1);
    <T> NamedBeanHolder<T> resolveNamedBean(Class<T> var1) throws BeansException;
    @Nullable
    Object resolveDependency(DependencyDescriptor var1, @Nullable String var2) throws BeansException;
    @Nullable
    Object resolveDependency(DependencyDescriptor var1, @Nullable String var2, @Nullable Set<String> var3, @Nullable TypeConverter var4) throws BeansException;
}

```

* 具体：
    * 总共5个静态不可变常量来指明装配策略，其中一个常量被Spring3.0废弃、一个常量表示没有自动装配，另外3个常量指明不同的装配策略——根据名称、根据类型、根据构造方法。
    * 8个跟自动装配有关的方法，实在是繁杂，具体的意义我们研究类的时候再分辨吧。
    * 2个执行BeanPostProcessors的方法。
    * 2个分解指定依赖的方法
* 总结：这个工厂接口继承自BeanFacotory，它扩展了自动装配的功能，根据类定义BeanDefinition装配Bean、执行前、后处理器等。

#### 1.7.2.10. ListableBeanFactory
<a href="#menu" >目录</a>

```java
public interface ListableBeanFactory extends BeanFactory {

    boolean containsBeanDefinition(String var1);
    int getBeanDefinitionCount();
    String[] getBeanDefinitionNames();

    String[] getBeanNamesForType(ResolvableType var1);
    String[] getBeanNamesForType(@Nullable Class<?> var1);
    String[] getBeanNamesForType(@Nullable Class<?> var1, boolean var2, boolean var3);

    <T> Map<String, T> getBeansOfType(@Nullable Class<T> var1) throws BeansException;
    <T> Map<String, T> getBeansOfType(@Nullable Class<T> var1, boolean var2, boolean var3) throws BeansException;

    String[] getBeanNamesForAnnotation(Class<? extends Annotation> var1);
    Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> var1) throws BeansException;

    @Nullable
    <A extends Annotation> A findAnnotationOnBean(String var1, Class<A> var2) throws NoSuchBeanDefinitionException;
}
```
* 具体：
    * 3个跟BeanDefinition有关的总体操作。包括BeanDefinition的总数、名字的集合、指定类型的名字的集合。（这里指出，BeanDefinition是Spring中非常重要的一个类，每个BeanDefinition实例都包含一个类在Spring工厂中所有属性。）
    * 3个getBeanNamesForType重载方法。根据指定类型（包括子类）获取其对应的所有Bean名字。
    * 3个getBeansOfType重载方法。根据类型（包括子类）返回指定Bean名和Bean的Map。
    * 2个跟注解查找有关的方法。根据注解类型，查找Bean名和Bean的Map。以及根据指定Bean名和注解类型查找指定的Bean。
* 总结：
    * 正如这个工厂接口的名字所示，这个工厂接口最大的特点就是可以列出工厂可以生产的所有实例。当然，工厂并没有直接提供返回所有实例的方法，也没这个必要。它可以返回指定类型的所有的实例。而且你可以通过getBeanDefinitionNames()得到工厂所有bean的名字，然后根据这些名字得到所有的Bean。这个工厂接口扩展了BeanFactory的功能，作为上文指出的BeanFactory二级接口，有9个独有的方法，扩展了跟BeanDefinition的功能，提供了BeanDefinition、BeanName、注解有关的各种操作。它可以根据条件返回Bean的集合，这就是它名字的由来——ListableBeanFactory。

#### 1.7.2.11. ConfigurableBeanFactory
<a href="#menu" >目录</a>


```java

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    void setParentBeanFactory(BeanFactory var1) throws IllegalStateException;
    void setBeanClassLoader(@Nullable ClassLoader var1);
    @Nullable
    ClassLoader getBeanClassLoader();
    void setTempClassLoader(@Nullable ClassLoader var1);
    @Nullable
    ClassLoader getTempClassLoader();
    void setCacheBeanMetadata(boolean var1);
    boolean isCacheBeanMetadata();
    void setBeanExpressionResolver(@Nullable BeanExpressionResolver var1);
    @Nullable
    BeanExpressionResolver getBeanExpressionResolver();
    void setConversionService(@Nullable ConversionService var1);
    @Nullable
    ConversionService getConversionService();
    void addPropertyEditorRegistrar(PropertyEditorRegistrar var1);
    void registerCustomEditor(Class<?> var1, Class<? extends PropertyEditor> var2);
    void copyRegisteredEditorsTo(PropertyEditorRegistry var1);
    void setTypeConverter(TypeConverter var1);
    TypeConverter getTypeConverter();
    void addEmbeddedValueResolver(StringValueResolver var1);
    boolean hasEmbeddedValueResolver();
    @Nullable
    String resolveEmbeddedValue(String var1);
    void addBeanPostProcessor(BeanPostProcessor var1);
    int getBeanPostProcessorCount();
    void registerScope(String var1, Scope var2);
    String[] getRegisteredScopeNames();
    @Nullable
    Scope getRegisteredScope(String var1);
    AccessControlContext getAccessControlContext();
    void copyConfigurationFrom(ConfigurableBeanFactory var1);
    void registerAlias(String var1, String var2) throws BeanDefinitionStoreException;
    void resolveAliases(StringValueResolver var1);
    BeanDefinition getMergedBeanDefinition(String var1) throws NoSuchBeanDefinitionException;
    boolean isFactoryBean(String var1) throws NoSuchBeanDefinitionException;
    void setCurrentlyInCreation(String var1, boolean var2);
    boolean isCurrentlyInCreation(String var1);
    void registerDependentBean(String var1, String var2);
    String[] getDependentBeans(String var1);
    String[] getDependenciesForBean(String var1);
    void destroyBean(String var1, Object var2);
    void destroyScopedBean(String var1);
    void destroySingletons();
}

public interface SingletonBeanRegistry {
    void registerSingleton(String var1, Object var2);
    @Nullable
    Object getSingleton(String var1);
    boolean containsSingleton(String var1);
    String[] getSingletonNames();
    int getSingletonCount();
    Object getSingletonMutex();
}

```
可以看到，SingletonBeanRegistry这个接口非常简单，5个方法，实现了单例类注册的功能。

ConfigurableBeanFactory同时继承了HierarchicalBeanFactory 和 SingletonBeanRegistry 这两个接口，即同时继承了分层和单例类注册的功能。

* 具体：
    * 2个静态不可变常量分别代表单例类和原型类。
    * 1个设置父工厂的方法，跟HierarchicalBeanFactory接口的getParentBeanFactory方法互补。
    * 4个跟类加载器有关的方法：get/set工厂类加载器和get/set临时类加载器。
    * 2个设置、是否缓存元数据的方法（热加载开关）。
    * 11个处理Bean注册、加载等细节的方法，包括：Bean表达式分解器、转换服务、属性编辑登记员、属性编辑器、属性编辑注册器、类型转换器、嵌入式的字符串分解器
    * 2个处理Bean后处理器的方法。
    * 3个跟注册范围相关的方法。
    * 1个返回安全访问上下文的方法、1个从其他的工厂复制相关的所有配置的方法。
    * 2个跟Bean别名相关的方法、1个返回合并后的Bean定义的方法。
    * 1个判断是否为工厂Bean的方法、2个跟当前Bean创建时机相关的方法。
    * 3个跟Bean依赖相关的方法、3个销毁Bean相关的方法。
* 总结：这个巨大的工厂接口，继承自HierarchicalBeanFactory 和 SingletonBeanRegistry 这两个接口，并额外独有37个方法！！！（看的我都快疯了...）这37个方法包含了工厂创建、注册一个Bean的众多细节。这个工厂名为ConfigurableBeanFactory，真是名不虚传！统计一下此时的ConfigurableBeanFactory的方法数吧。自有的37个方法、HierarchicalBeanFactory的2个方法、SingletonBeanRegistry的5个方法、爷爷接口BeanFactory的10个方法，共有54个方法！虽然方法繁多，还算井井有条

#### 1.7.2.12. ConfigurableListableBeanFactory
<a href="#menu" >目录</a>

```java
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    void ignoreDependencyType(Class<?> var1);
    void ignoreDependencyInterface(Class<?> var1);
    void registerResolvableDependency(Class<?> var1, @Nullable Object var2);
    boolean isAutowireCandidate(String var1, DependencyDescriptor var2) throws NoSuchBeanDefinitionException;
    BeanDefinition getBeanDefinition(String var1) throws NoSuchBeanDefinitionException;
    Iterator<String> getBeanNamesIterator();
    void clearMetadataCache();
    void freezeConfiguration();
    boolean isConfigurationFrozen();
    void preInstantiateSingletons() throws BeansException;
}

```
* 具体：
    * 2个忽略自动装配的的方法。
    * 1个注册一个可分解依赖的方法。
    * 1个判断指定的Bean是否有资格作为自动装配的候选者的方法。
    * 1个根据指定bean名，返回注册的Bean定义的方法。
    * 2个冻结所有的Bean配置相关的方法。
    * 1个使所有的非延迟加载的单例类都实例化的方法。
* 总结：工厂接口ConfigurableListableBeanFactory同时继承了3个接口，ListableBeanFactory、AutowireCapableBeanFactory 和 ConfigurableBeanFactory，扩展之后，加上自有的这8个方法，这个工厂接口总共有83个方法，实在是巨大到不行了。这个工厂接口的自有方法总体上只是对父类接口功能的补充，包含了BeanFactory体系目前的所有方法，可以说是接口的集大成者。



#### 1.7.2.13. BeanDefinitionRegistry
<a href="#menu" >目录</a>

这个接口基本用来操作定义在工厂内部的BeanDefinition的

#### 1.7.2.14. 单例管理接口SingletonBeanRegistry
<a href="#menu" >目录</a>


![DefaultSingletonBeanRegistry](pic/spring/spring/beanfactory/DefaultSingletonBeanRegistry.png)

##### 1.7.2.14.1. AliasRegistry 
<a href="#menu" >目录</a>

AliasRegistry 用于管理别名的公共接口,定义对别名的简单增删等操作。用作超级接口
```java
public interface AliasRegistry {
    //注册表中给name注册一个别名alias
	void registerAlias(String name, String alias);
    // 移除注册表中的别名alias
	void removeAlias(String alias); 
    //校验注册表中是否存在别名name
	boolean isAlias(String name);

	// 在注册表中获取给定那么的所有别名信息
	String[] getAliases(String name);

}
```
SimpleAliasRegistry： AliasRegistry的简单实现类

##### 1.7.2.14.2. SingletonBeanRegistry
<a href="#menu" >目录</a>

此接口是针对Spring中的单例Bean设计的。提供了统一访问单例Bean的功能，BeanFactory可实现此接口以提供访问内部单例Bean的能力

```java
public interface SingletonBeanRegistry {

    /**
     * 以指定的名字将给定Object注册到BeanFactory中。
     * 给定的Object必须是被完全初始化了的，此注册接口不会提供任何用以初始化的回调函数，需要特意提及的
     * 一点是InitializingBean的afterPropertiesSet方法也不会被此注册接口调用，并且，指定实例
     * 也不会收到destroy的信息.
     * 如果此接口的实现类是一个BeanFactory，最好将你的类注册成Bean Definition而不是直接使用对象
     * 注册，前一种注册方式的好处在于，它可以使你定义的Bean收到initialization和destruction回调。
     * 此方法通常在配置和注册Bean期间调用，但是也不排斥在运行时动态的向其中注册单例对象。因此实现类
     * 应该同步代码对单例Bean的访问方法
     */
    void registerSingleton(String beanName, Object singletonObject);

    /**
     * 以Object的形式返回指定名字的Bean。仅仅返回已经初始化完成的Bean，对于还没有初始化的
     * Bean Definition不予以考虑
     * 此方法的主要目的是提供一种手动获取已注册单例Bean的方式，同样的对于通过Bean Definition注册的
     * Bean也可以通过此方式获得
     * 但是要注意，此方法并不支持使用别名对Bean进行查找，如果只有别名的话，要先通过BeanFactory的接口
     * 获取到Bean对应的全限定名称
     */
    Object getSingleton(String beanName);

    /**
     * Check if this registry contains a singleton instance with the given name.
     * 检查此实例是否包含指定名字的并且！！！已经初始化完成的单例Bean。
     * 此方法的主要目标是提供一种手动检测Bean是否初始化完成的手段。也可用于检测通过BeanDefinition
     * 定义的Bean是否创建完成。
     * 如果要检测BeanFactory中是否包含指定name的BeanDefinition（不管是否初始化完毕），可使用BeanFactory
     * 的containsBeanDefinition。同时判断containsBeanDefinition和本方法，可以判断BeanFactory是否包含
     * 已经初始化完毕的Bean
     * 而BeanFactory的containsBean方法是用于通用检测一个BeanFactory或者其父上下文是否有
     * 一个指定名字的Bean的手段。
     * 不支持别名查找
     */
    boolean containsSingleton(String beanName);

    //获取所有单例的bean名称
    String[] getSingletonNames();

    //获取单例的数量
    int getSingletonCount();

    //Return the singleton mutex used by this registry (for external collaborators).
    //不太明白
    Object getSingletonMutex();

}
```

##### 1.7.2.14.3. DefaultSingletonBeanRegistry
<a href="#menu" >目录</a>

DefaultSingletonBeanRegistry是SingletonBeanRegistry的实现类,也就是实现单例的增删改功能.


```java
public class DefaultSingletonBeanRegistry extends SimpleAliasRegistry implements SingletonBeanRegistry {

	//是存放singleton对象的缓存  
	private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);

	//ObjectFactory工厂对象的缓存
	private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<>(16);

	//是存放singletonFactory 制造出来的 singleton 的缓存早期单例对象缓存,什么是早期对象
	private final Map<String, Object> earlySingletonObjects = new HashMap<>(16);

	/** Set of registered singletons, containing the bean names in registration order. */
    //就是单例注册表
	private final Set<String> registeredSingletons = new LinkedHashSet<>(256);

	/** Names of beans that are currently in creation. */
    //目前正在创建中的单例bean的名称的集合
	private final Set<String> singletonsCurrentlyInCreation =
			Collections.newSetFromMap(new ConcurrentHashMap<>(16));

	/** Names of beans currently excluded from in creation checks. */
	private final Set<String> inCreationCheckExclusions =
			Collections.newSetFromMap(new ConcurrentHashMap<>(16));

	/** List of suppressed Exceptions, available for associating related causes. */
    //存放异常出现的相关的原因的集合
	@Nullable
	private Set<Exception> suppressedExceptions;

	/** Flag that indicates whether we're currently within destroySingletons. */
    // 标志，指示我们目前是否在销毁单例中
	private boolean singletonsCurrentlyInDestruction = false;

	/** Disposable bean instances: bean name to disposable instance. */
	private final Map<String, Object> disposableBeans = new LinkedHashMap<>();

	/** Map between containing bean names: bean name to Set of bean names that the bean contains. */
	private final Map<String, Set<String>> containedBeanMap = new ConcurrentHashMap<>(16);

	/** Map between dependent bean names: bean name to Set of dependent bean names. */
	private final Map<String, Set<String>> dependentBeanMap = new ConcurrentHashMap<>(64);

	/** Map between depending bean names: bean name to Set of bean names for the bean's dependencies. */
	private final Map<String, Set<String>> dependenciesForBeanMap = new ConcurrentHashMap<>(64);

```

### 1.7.3. Bean创建过程
<a href="#menu" >目录</a>

这里以DemoService类为例
在构造函数里面设置断点

```java
@Service
public class DemoService {

    public DemoService() {

        System.out.println("ss");
    }
}
```
![create-bean](pic/spring/spring/beanfactory/create-bean.png)

这里来看下AbstractBeanFactory的doGetBean

```java

    public <T> T getBean(String name, @Nullable Class<T> requiredType, @Nullable Object... args) throws BeansException {
        return this.doGetBean(name, requiredType, args, false);
    }

    protected <T> T doGetBean(String name, @Nullable Class<T> requiredType, @Nullable Object[] args, boolean typeCheckOnly) throws BeansException {
        //获取对应的bean name 
        String beanName = this.transformedBeanName(name);

        /*
        * 检查缓存中或者实例工厂是否有对应的实例
        * 为什么会首先使用这段代码
        * 因为在创建单例bean的时候会存在依赖注入的情况,而在创建依赖的情况下为了避免循环依赖Spring创建bean的原则是不等bean创建完成酒水将创建bean的ObjectFactory提早曝光
        ,也就是将ObjectFactory加入到缓存中,一旦一个bean创建时需要依赖上个bean则直接使用ObjectFactory

        */
        //直接从缓存中获取或者singletonFactoties中的ObjectFactory中获取
        Object sharedInstance = this.getSingleton(beanName);
        Object bean;
        if (sharedInstance != null && args == null) {
            if (this.logger.isTraceEnabled()) {
                if (this.isSingletonCurrentlyInCreation(beanName)) {
                    this.logger.trace("Returning eagerly cached instance of singleton bean '" + beanName + "' that is not fully initialized yet - a consequence of a circular reference");
                } else {
                    this.logger.trace("Returning cached instance of singleton bean '" + beanName + "'");
                }
            }

            bean = this.getObjectForBeanInstance(sharedInstance, name, beanName, (RootBeanDefinition)null);
        } else {
            if (this.isPrototypeCurrentlyInCreation(beanName)) {
                throw new BeanCurrentlyInCreationException(beanName);
            }

            BeanFactory parentBeanFactory = this.getParentBeanFactory();
            if (parentBeanFactory != null && !this.containsBeanDefinition(beanName)) {
                String nameToLookup = this.originalBeanName(name);
                if (parentBeanFactory instanceof AbstractBeanFactory) {
                    return ((AbstractBeanFactory)parentBeanFactory).doGetBean(nameToLookup, requiredType, args, typeCheckOnly);
                }

                if (args != null) {
                    return parentBeanFactory.getBean(nameToLookup, args);
                }

                if (requiredType != null) {
                    return parentBeanFactory.getBean(nameToLookup, requiredType);
                }

                return parentBeanFactory.getBean(nameToLookup);
            }

            if (!typeCheckOnly) {
                this.markBeanAsCreated(beanName);
            }

            try {
                RootBeanDefinition mbd = this.getMergedLocalBeanDefinition(beanName);
                this.checkMergedBeanDefinition(mbd, beanName, args);
                String[] dependsOn = mbd.getDependsOn();
                String[] var11;
                if (dependsOn != null) {
                    var11 = dependsOn;
                    int var12 = dependsOn.length;

                    for(int var13 = 0; var13 < var12; ++var13) {
                        String dep = var11[var13];
                        if (this.isDependent(beanName, dep)) {
                            throw new BeanCreationException(mbd.getResourceDescription(), beanName, "Circular depends-on relationship between '" + beanName + "' and '" + dep + "'");
                        }

                        this.registerDependentBean(dep, beanName);

                        try {
                            this.getBean(dep);
                        } catch (NoSuchBeanDefinitionException var24) {
                            throw new BeanCreationException(mbd.getResourceDescription(), beanName, "'" + beanName + "' depends on missing bean '" + dep + "'", var24);
                        }
                    }
                }

                if (mbd.isSingleton()) {
                    //如果是单例
                    sharedInstance = this.getSingleton(beanName, () -> {
                        try {
                            return this.createBean(beanName, mbd, args);
                        } catch (BeansException var5) {
                            this.destroySingleton(beanName);
                            throw var5;
                        }
                    });
                    //返回对应的实例,有时候存在诸如BeanFactory的情况并不是直接返回实例本身而是返回指定方法返回的实例
                    bean = this.getObjectForBeanInstance(sharedInstance, name, beanName, mbd);
                } else if (mbd.isPrototype()) {
                    //如果是多例
                    var11 = null;

                    Object prototypeInstance;
                    try {
                        this.beforePrototypeCreation(beanName);
                        prototypeInstance = this.createBean(beanName, mbd, args);
                    } finally {
                        this.afterPrototypeCreation(beanName);
                    }

                    bean = this.getObjectForBeanInstance(prototypeInstance, name, beanName, mbd);
                } else {
                    String scopeName = mbd.getScope();
                    Scope scope = (Scope)this.scopes.get(scopeName);
                    if (scope == null) {
                        throw new IllegalStateException("No Scope registered for scope name '" + scopeName + "'");
                    }

                    try {
                        Object scopedInstance = scope.get(beanName, () -> {
                            this.beforePrototypeCreation(beanName);

                            Object var4;
                            try {
                                var4 = this.createBean(beanName, mbd, args);
                            } finally {
                                this.afterPrototypeCreation(beanName);
                            }

                            return var4;
                        });
                        bean = this.getObjectForBeanInstance(scopedInstance, name, beanName, mbd);
                    } catch (IllegalStateException var23) {
                        throw new BeanCreationException(beanName, "Scope '" + scopeName + "' is not active for the current thread; consider defining a scoped proxy for this bean if you intend to refer to it from a singleton", var23);
                    }
                }
            } catch (BeansException var26) {
                this.cleanupAfterBeanCreationFailure(beanName);
                throw var26;
            }
        }

        if (requiredType != null && !requiredType.isInstance(bean)) {
            try {
                T convertedBean = this.getTypeConverter().convertIfNecessary(bean, requiredType);
                if (convertedBean == null) {
                    throw new BeanNotOfRequiredTypeException(name, requiredType, bean.getClass());
                } else {
                    return convertedBean;
                }
            } catch (TypeMismatchException var25) {
                if (this.logger.isTraceEnabled()) {
                    this.logger.trace("Failed to convert bean '" + name + "' to required type '" + ClassUtils.getQualifiedName(requiredType) + "'", var25);
                }

                throw new BeanNotOfRequiredTypeException(name, requiredType, bean.getClass());
            }
        } else {
            return bean;
        }
    }
```



![singleton](pic/spring/spring/singleton.png)

可以看到Spring的单例实现类是DefaultSingletonBeanRegistry的getSingleton方法
```java
  public Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
        Assert.notNull(beanName, "Bean name must not be null");

        //需要进行同步
        synchronized(this.singletonObjects) {

            //在已经注册了的单例map集合（singletonObjects）中获取特定beanName的bean
            Object singletonObject = this.singletonObjects.get(beanName);

            //如果为null,说明这个bean还没有创建
            if (singletonObject == null) {
                if (this.singletonsCurrentlyInDestruction) {
                    throw new BeanCreationNotAllowedException(beanName, "Singleton bean creation not allowed while singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)");
                }

                if (this.logger.isDebugEnabled()) {
                    this.logger.debug("Creating shared instance of singleton bean '" + beanName + "'");
                }
                //把当前正在创建的bean记录在缓存中，对循环依赖进行检测
                this.beforeSingletonCreation(beanName);
                boolean newSingleton = false;
                boolean recordSuppressedExceptions = this.suppressedExceptions == null;
                if (recordSuppressedExceptions) {
                    this.suppressedExceptions = new LinkedHashSet();
                }

                try {
                    //使用回调方法 创建单例bean
                    singletonObject = singletonFactory.getObject();
                    newSingleton = true;
                } catch (IllegalStateException var16) {
                    singletonObject = this.singletonObjects.get(beanName);
                    if (singletonObject == null) {
                        throw var16;
                    }
                } catch (BeanCreationException var17) {
                    BeanCreationException ex = var17;
                    if (recordSuppressedExceptions) {
                        Iterator var8 = this.suppressedExceptions.iterator();

                        while(var8.hasNext()) {
                            Exception suppressedException = (Exception)var8.next();
                            ex.addRelatedCause(suppressedException);
                        }
                    }

                    throw ex;
                } finally {
                    if (recordSuppressedExceptions) {
                        this.suppressedExceptions = null;
                    }
                    //移除缓存中对该bean正在加载的状态
                    this.afterSingletonCreation(beanName);
                }

                if (newSingleton) {
                    //将新创建的bean加入缓存，并且删除加载bean过程中所记录的各种辅助状态
                    //这些辅助状态主要是在回调方法创建bean时候引入的
                    this.addSingleton(beanName, singletonObject);
                }
            }

            return singletonObject;
        }
    }
```




### 1.7.4. Bean的作用域
<a href="#menu" >目录</a>


Bean的生命周期由Scope定义
```java
package org.springframework.context.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {
    @AliasFor("scopeName")
    String value() default "";

    @AliasFor("value")
    String scopeName() default "";

    ScopedProxyMode proxyMode() default ScopedProxyMode.DEFAULT;
}
```
一共有五个值类型
* singleton（单例模式)默认模式
    * 使用该属性定义Bean时，IOC容器仅创建一个Bean实例，IOC容器每次返回的是同一个Bean实例。
* prototype（原型模式）
    * 使用该属性定义Bean时，IOC容器可以创建多个Bean实例，每次返回的都是一个新的实例。
* request(HTTP请求）
    * 该属性仅对HTTP请求产生作用，使用该属性定义Bean时，每次HTTP请求都会创建一个新的Bean，适用于WebApplicationContext环境。
* session（会话）
    * 该属性仅用于HTTP Session，同一个Session共享一个Bean实例。不同Session使用不同的实例。
* global-session(全局会话）
    * 该属性仅用于HTTP Session，同session作用域不同的是，所有的Session共享一个Bean实例。

应用场合：
1.需要回收重要资源(数据库连接等)的事宜配置为singleton，如果配置为prototype需要应用确保资源正常回收。
2.有状态的Bean配置成singleton会引发未知问题，可以考虑配置为prototype。

prototype作用域的Bean会导致在每次对该Bean请求（将其注入到另一个Bean中，或者以程序的方式调用容器的getBean()方法）时都会创建一个新的Bean实例。根据经验，对有状态的Bean应使用prototype作用域，而对无状态的Bean则应该使用singleton作用域。对于具有prototype作用域的Bean，有一点很重要，即Spring不能对该Bean的整个生命周期负责。具有prototype作用域的Bean创建后交由调用者负责销毁对象回收资源。


### 1.7.5. Bean的生命周期

1. Spring对bean进行实例化；
2. Spring将值和bean的引用注入到bean对应的属性中；
3. 如果bean实现了BeanNameAware接口，Spring将bean的ID传递给setBean-Name()方法；
4. 如果bean实现了BeanFactoryAware接口，Spring将调用setBeanFactory()方法，将BeanFactory容器实例传入；
5. 如果bean实现了ApplicationContextAware接口，Spring将调用setApplicationContext()方法，将bean所在的应用上下文的引用传入进来；
6. 如果bean实现了BeanPostProcessor接口，Spring将调用它们的postProcessBeforeInitialization()方法；
7. 如果bean实现了InitializingBean接口，Spring将调用它们的afterPropertiesSet()方法。类似地，如果bean使用init-method声明了初始化方法，该方法也会被调用；
8. 如果bean实现了BeanPostProcessor接口，Spring将调用它们的postProcessAfterInitialization()方法；
9. 此时，bean已经准备就绪，可以被应用程序使用了，它们将一直驻留在应用上下文中，直到该应用上下文被销毁；
10. 如果bean实现了DisposableBean接口，Spring将调用它的destroy()接口方法。同样，如果bean使用destroy-method声明了销毁方法，该方法也会被调用。

![](https://images0.cnblogs.com/i/580631/201405/181453414212066.png)

Bean的完整生命周期经历了各种方法调用，这些方法可以划分为以下几类：
* Bean自身的方法
    * 这个包括了Bean本身调用的方法和通过配置文件中< bean>的init-method和destroy-method指定的方法
* Bean级生命周期接口方法
    * 这个包括了BeanNameAware、BeanFactoryAware、InitializingBean和DiposableBean这些接口的方法,这些方法由Bean类直接实现
* 容器级生命周期接口方法
    * 这个包括了InstantiationAwareBeanPostProcessor 和 BeanPostProcessor 这两个接口实现，一般称它们的实现类为“后处理器"。
    * 当Spring容器创建任何Bean的时候,这些后处理器都会发生作用,这些后处理器的影响是全局性的
    * 用户可以通过合理地编写后处理器,让其仅对感兴趣的Bean进行加工处理
* 工厂后处理器接口方法
    * 这个包括了AspectJWeavingEnabler, ConfigurationClassPostProcessor, CustomAutowireConfigurer等等非常有用的工厂后处理器接口的方法。工厂后处理器也是容器级的。在应用上下文装配配置文件之后立即调用。

```java

package com.bean.life1.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.PropertyDescriptor;


@Component
public class UserService implements
        //BeanFactoryPostProcessor,
        InstantiationAwareBeanPostProcessor,
        BeanNameAware ,
        BeanFactoryAware,
        ApplicationContextAware,
        BeanPostProcessor,
        InitializingBean
{

    public UserService() {

        System.out.println("Bean 的构造器");
    }

    /*
        接口BeanFactoryPostProcessor
        */

   // @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor postProcessBeanFactory");
    }

    //InstantiationAwareBeanPostProcessor
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        String str = "InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation "
                + "  beanClass = " + beanClass
                + "  beanName = " + beanName ;

        if("userService".equals(beanName)){
            System.out.println(str);
        }
       // System.out.println(str);
        return null;
    }



    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        String str = "InstantiationAwareBeanPostProcessor postProcessPropertyValues "
                + "  bean = " + bean
                + "  beanName = " + beanName ;
        if("userService".equals(beanName)){
            System.out.println(str);
        }
        //  System.out.println(str);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        String str = "InstantiationAwareBeanPostProcessor postProcessAfterInstantiation "
                + "  bean = " + bean
                + "  beanName = " + beanName ;
        if("userService".equals(beanName)){
            System.out.println(str);
        }
       //

        return false;
    }

    @Override
    public void setBeanName(String s) {
        String str = "BeanNameAware setBeanName "
                + "  beanName = " + s ;
        System.out.println(str);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        String str = "BeanFactoryAware setBeanFactory ";
        System.out.println(str);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String str = "ApplicationContextAware setApplicationContext ";
        System.out.println(str);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        String str = "BeanPostProcessor postProcessBeforeInitialization "
                + "  bean = " + bean
                + "  beanName = " + beanName ;
        if("userService".equals(beanName)){
            System.out.println(str);
        }
       // System.out.println(str);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        String str = "BeanPostProcessor postProcessAfterInitialization "
                + "  bean = " + bean
                + "  beanName = " + beanName ;
        if("userService".equals(beanName)){
            System.out.println(str);
        }
     //   System.out.println(str);
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet ");
    }

    @PostConstruct
    public  void init(){
        System.out.println("初始化方法: PostConstruct init");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁方法: PreDestroy destory");
    }

}
```
输出

```
Bean 的构造器
BeanNameAware setBeanName   beanName = userService
BeanFactoryAware setBeanFactory 
ApplicationContextAware setApplicationContext 
初始化方法: PostConstruct init
InitializingBean afterPropertiesSet 
销毁方法: PreDestroy destory
```
　
注意,上面实现了BeanFactoryPostProcessor接口,将不会调用@PostConstruct和@PreDestroy的方法.



一般是实现BeanFactoryPostProcessor或者BeanFactoryAware获取BeanFactory ;
实现ApplicationContextAware获取ApplicationContext 

ApplicationContextAware是上下文ApplicationContex提供的,也是和BeanFactory的区别.

**总结**
ApplicationContex的Bean生命周期

1. 启动容器
2. 调用BeanFactoryPostProcessor的postProcessBeanFactory方法对工厂定义信息进行后处理
3. 通过getBean调用一个Bean
4. 调用InstantiationAwareBeanPostProcessor的postProcessBeforeInstantiation方法
5. 实例化
6. 调用InstantiationAwareBeanPostProcessor的postProcessAfterInstantiation方法
7. 调用InstantiationAwareBeanPostProcessor的postProcessPropertyValues方法
8. 设置属性值
9. 调用BeanNameAware的setBeanName
10. 调用BeanFactoryAware的setBeanFactory
11. 调用ApplicationContextAware的setApplicationContext
12. 调用BeanPostProcessor的postProcessBeforeInitialization方法
13. 调用init-method配置的方法
14. 调用InitializingBean的afterPropertiesSet
15. 调用BeanPostProcessor的postProcessAfterInitialization方法
16. 如果是单例,则放入单例缓存池中,创建阶段完成.如果容器销毁,则调用DisposableBean的destroy().最后调用定义的destory-method销毁方法
17. 如果是prototype,则将准备就绪的Bean交给调用者
 
```java
//org.springframework.beans.factory.config.BeanPostProcessor
void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

//org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor
Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName)
boolean postProcessAfterInstantiation(Object bean, String beanName) 
PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)

//org.springframework.beans.factory.BeanNameAware
void setBeanName(String name);
//org.springframework.beans.factory.BeanFactoryAware
void setBeanFactory(BeanFactory beanFactory) throws BeansException;

//org.springframework.context.ApplicationContextAware
void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

//org.springframework.beans.factory.config.BeanPostProcessor
Object postProcessBeforeInitialization(Object bean, String beanName) 
Object postProcessAfterInitialization(Object bean, String beanName) 

//org.springframework.beans.factory.InitializingBean
void afterPropertiesSet()

//org.springframework.beans.factory.DisposableBean
void destroy()

```

## 1.8. 切面编程AOP
<a href="#menu" >目录</a>

### 1.8.1. AOP概述
<a href="#menu" >目录</a>

在软件业，AOP为Aspect Oriented Programming的缩写，意为：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。AOP是OOP的延续，是软件开发中的一个
热点，也是Spring框架中的一个重要内容，是函数式编程的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高
了开发的效率。

面向对象编程解决了业务模块的封装复用的问题，但是对于某些模块，其本身并不独属于摸个业务模块，而是根据不同的情况，贯穿于某几个或全部的模块之间的。例如登录验证，其只开放几个可以不用登录的接口给用户使用（一般登录使用拦截器实现，但是其切面思想是一致的）；再比如性能统计，其需要记录每个业务模块的调用，并且监控器调用时间。可以看到，这些横贯于每个业务模块的模块，如果使用面向对象的方式，那么就需要在已封装的每个模块中添加相应的重复代码，对于这种情况，面向切面编程就可以派上用场了。

面向切面编程，也称为AOP（即Aspect Oriented Programming），指的是将一定的切面逻辑按照一定的方式编织到指定的业务模块中，从而将这些业务模块的调用包裹起来


**AOP中的相关概念**
* Aspect（切面）
    * Aspect 声明类似于 Java 中的类声明，在 Aspect 中会包含着一些 Pointcut 以及相应的 Advice。
    * 切面由切点和增强组成,包括横切逻辑的定义,也包括连接点的定义.
* Joint point（连接点）
    * 表示在程序中明确定义的点，典型的包括方法调用，对类成员的访问以及异常处理程序块的执行等等，它自身还可以嵌套其它 joint point。
    * 程序执行的某个位置,如类开始初始化前,类初始化后,调用方法前/后.Spring仅支持方法的连接点,即仅在方法调用前/后,抛出异常这些程序执行点织入增强
* Pointcut（切点）
    * 连接点相当于数据库中的数据,切点相当于查询条件,也就是通过切点去定位哪些连接点需要织入增强
    * 表示一组 joint point，这些 joint point 或是通过逻辑关系组合起来，或是通过通配、正则表达式等方式集中起来，它定义了相应的 Advice 将要发生的地方。
* Advice（增强）
    * Advice 定义了在 Pointcut 里面定义的程序点具体要做的操作，它通过 before、after 和 around 来区别是在每个 joint point 之前、之后还是代替执行的代码。
* Target（目标对象）
    * 织入 Advice 的目标对象.。
* Weaving（织入）
    * 将 Aspect 和其他对象连接起来, 并创建 Adviced object 的过程
    * 织入方式
        * 编译期织入,要求使用特殊的Java编译器
        * 类装载织入,要求使用特殊的类装载器
        * 动态代理织入,在运行期为目标类添加增强生成子类的方式
    * Spring使用动态代理织入,而Aspecj采用编译期织入和类装载期织入

AOP的工作
* 如何通过切点和增强定位到连接点
* 如何将增强织入到连接点


**Advice 的类型**
* before advice, 在 join point 前被执行的 advice. 虽然 before advice 是在 join point 前被执行, 但是它并不能够阻止 join point 的执行, 除非发生了异常(即我们在 before advice 代码中, 不能人为地决定是否继续执行 join point 中的代码)
* after return advice, 在一个 join point 正常返回后执行的 advice
* after throwing advice, 当一个 join point 抛出异常后执行的 advice
* after(final) advice, 无论一个 join point 是正常退出还是发生了异常, 都会被执行的 advice.
* around advice, 在 join point 前和 joint point 退出后都执行的 advice. 这个是最常用的 advice.
* introduction，introduction可以为原有的对象增加新的属性和方法。

Spring中，通过动态代理和动态字节码技术实现了AOP.

**AOP的实现方案**

* AspectJ
    * 扩展了Java语言,定义了AOP语法,能够在编译期提供横切代码的织入
    * 有一个专门的编译器来生成Class文件
* AspectWerkz
* Jboss AOP
* Spring AOP
    * 通过代理的方式向目标类织入增强代码


* AOP的实现方式
    * 对Ｊava字节码进行重新编译，将切面插入字节码的某些点和面上，可以使用cglib
    * 定制类加载器，在类加载时对字节码进行补充，在字节码插入切面，增加了除业务逻辑外的功能，jvm自身提供的Java Agent机制就是在加载类的字节码时，通过增加切面来实现ＡＯＰ
    * jvm本身提供了动态代理组件，可以通过它实现任意对象的代理模式，在代理的过程中可以插入切面的逻辑，可以使用Java的API Proxy.newInstance()和Ｉnvocation来实现
    

### 1.8.2. 切点函数
<a href="#menu" >目录</a>


#### 1.8.2.1. 常用切点函数

**方法切点函数**

* execution()
语法格式： execution(返回类型 包名.类名.方法名(参数表))
exection(* com.xxx.AService.*(..))
com.xxx.AService 类型中的任意方法，任意类型返回结果，参数表不限定，都增加切面
"*"标识任意

（<修饰符模式>?<返回类型模式><方法名模式>(<参数模式>)<异常模式>）
1. 通过方法	签名定义切点： （public * *(..)）;匹配所有目标类的public 方法
2. 通过类定义切点 ： （* com.lanmei.user+.*(..)）:匹配user接口的所有方法，有+表示也匹配其 实现类
3. 通过类包定义切点： （* com.lanmei.user.*(..)）匹配com.lanmei.user包下的所有类的所有方法
4. （* com.lanmei.user..*(..)）匹配com.lanmei.user包/子孙包下的所有类的所有方法
5. 通过方法入参定义切点 * admin(String. *)）匹配方法admin的地一个参数为String ,第二个参数为任意类型的方法
	 


* @annotation()
使用注解,需要实现AOP的方法上添加该注解即可
语法格式: @Pointcut(value = "@annotation(com.springboot.aop.demo.MyAnno)")


**方法入参切点函数**
* args() &  @args()
以参数标准作为目标，定义切点
语法： args(类型，类型.....) 代表方法的参数表符合要求的时候，作为切点，参数表是有顺序的
应用：主要应用在参数校验中。如：登录的时候必须传递两个字符串参数（登录名和密码）。可以使用args来限定。配合这execution实现。
如：execution(.*.xxx.*.login(..)) args(String,String)。是使用频率最低的表达式

**目标类切点函数**
* within() & @within()
以包作为目标，定义切点
语法： within（包名.*） 代表在包中的任意接口或类型都作为切点
应用：针对某一个包提供的切点，粒度比target粗糙。如：某包中的所有接口都需要执行某附属逻辑。如 电商平台中的下订单。下订单服务中可能需要特定的逻辑（时间戳校验，库存检查等），这些逻辑，是其他业务线中不需要提供切面的

* target() & @target()
以目标对象作为切点的表达式定义方式 (用于某一个接口or某一类接口)
语法：target(包名.接口名）
如：target(com.xx.IA)  所有实现了IA接口的实现类，作为代理的目标对象，会自动增加通知的织入，是实现切面
应用：为某一个具体的接口实现提供的配置。如 登录的时候需要执行的附属逻辑是比较多的。在不同的业务流程中，附属逻辑也不同。如，电商中，可能在登录的时候需要去执行购物车合并

**代理类切点函数**
* this()
实现某接口的任意代理对象都作为切点
语法：this（包名.接口名）
如：this(com.xxx.IA)  代理对象 Proxy如果实现了IA接口，则作为连接点
应用：针对某个具体的代理提供的配置。比target切点粒度细致。因为目标对象可以多实现。代理对象可以针对目标对象实现的多个接口的某一个接口，提供特定的切点。如，银行中的登录，银行中的账户种类非常多，且有交叉。如借记卡，贷记卡，借记还贷卡。。。。可以针对还贷接口提供一个切点，做还贷信息 的记录等。

#### 1.8.2.2. 通配符

"*":匹配任意字符,但只能匹配上下文中的一个元素
"..":匹配任意字符,可以匹配上下文中的多个元素,但在表示类时,必须和*联合使用,而在表示入参时则单独使用
"+":匹配类以及其子类.必须跟在类名改后面,com.Car+

* execution(),within()支持所有的通配符
* args(),this(),target()仅支持"+"通配符
* @xxx不支持通配符


#### 1.8.2.3. 逻辑运算符

包括&&,||,!或者and ,or ,not

例子: 
1. exection(* com.xxx.AService.*(..)) && exection(* com.xxx.AService.*(..))
2. exection(* com.xxx.AService.*(..))|| exection(* com.xxx.AService.*(..))
3. !exection(* com.xxx.AService.*(..))

### 1.8.3. 切点函数详解

#### 1.8.3.1. @annotation()
<a href="#menu" >目录</a>

#### 1.8.3.2. execution()
<a href="#menu" >目录</a>

#### 1.8.3.3. args和@args()
<a href="#menu" >目录</a>

#### 1.8.3.4. within()
<a href="#menu" >目录</a>

#### 1.8.3.5. @within()和@target()
<a href="#menu" >目录</a>

#### 1.8.3.6. target()和this()
<a href="#menu" >目录</a>

### 1.8.4. 切点函数高级用法

#### 1.8.4.1. 切点复合运算
<a href="#menu" >目录</a>

#### 1.8.4.2. 命名切点 
<a href="#menu" >目录</a>

#### 1.8.4.3. 增强织入的顺序
<a href="#menu" >目录</a>

#### 1.8.4.4. 访问连接点信息
<a href="#menu" >目录</a>

#### 1.8.4.5. 绑定连接点方法入参
<a href="#menu" >目录</a>


#### 1.8.4.6. 绑定代理对象
<a href="#menu" >目录</a>

#### 1.8.4.7. 绑定类注解对象
<a href="#menu" >目录</a>

#### 1.8.4.8. 绑定返回值
<a href="#menu" >目录</a>

#### 1.8.4.9. 绑定抛出的异常
<a href="#menu" >目录</a>


### 1.8.5. Spring AOP案例
<a href="#menu" >目录</a>

引入依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```
配置文件
```yml
 AOP
 Add @EnableAspectJAutoProxy.
 使能aop,默认使能 或者在启动类上加 @EnableAspectJAutoProxy.
spring.aop.auto=true 
 true强制使用cglib false:默认使用Jdk基于接口的代理,没有接口则使用cglib
spring.aop.proxy-target-class=true  Whether subclass-based (CGLIB) proxies are to be created (true), as opposed to standard Java interface-based proxies (false).
```
创建一个注解
```java
@Target({ElementType.PARAMETER, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno {
}
```
创建切面类
```java
package com.springboot.aop.demo;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {

    //定义切点,这里的切点通过注解实现
    @Pointcut(value = "@annotation(com.springboot.aop.demo.MyAnno)")
    public void myAspectPointcut() {

    }

    //以下就是各个增强代码
    //通过joinPoint获得代理对象和方法参数
    @Before(value="myAspectPointcut()")
    public void doBefore(JoinPoint joinPoint){
        log.info("doBefore");
    }

    @After(value="myAspectPointcut()")
    public void doAfter(JoinPoint joinPoint){
        log.info("doAfter");
    }

    //returning定义返回值名称,通过returnValue获取到返回值
    @AfterReturning(value="myAspectPointcut()",returning="returnValue")
    public void doAfterReturning(JoinPoint joinPoint,Object returnValue){
        log.info("doAfterReturning");
    }

    //throwing定义异常名称,可以从ex中获取到发生的异常
    @AfterThrowing(value="myAspectPointcut()",throwing="ex")
    public void doAfterThrowing(JoinPoint joinPoint ,Throwable ex){

        log.info("doAfterThrowing");
    }
    @Around(value="myAspectPointcut()")
    public Object doAround(ProceedingJoinPoint invocation)  throws Throwable{

        log.info("doAround start ");
        //通过proceed执行代理对象的方法
        Object result = invocation.proceed();
        log.info("doAround end ");

        return  result;
    }
}

```
应用代码添加注解@MyAnno
注意必须是Spring Bean上使用,这样扫描时才会创建代理.
```java
@Slf4j
@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    DemoService demoService;

    @RequestMapping
    @MyAnno
    public String aop(){
        log.info("/aop/aop");
       // demoService.func();
        return "aop";
    }
}
```
测试
```
2019-09-20 00:46:30.079  INFO 1285 --- [nio-8080-exec-1] com.springboot.aop.demo.MyAspect         : doAround start 
2019-09-20 00:46:30.080  INFO 1285 --- [nio-8080-exec-1] com.springboot.aop.demo.MyAspect         : doBefore
2019-09-20 00:46:30.085  INFO 1285 --- [nio-8080-exec-1] c.s.aop.controller.AopController         : /aop/aop
2019-09-20 00:46:30.085  INFO 1285 --- [nio-8080-exec-1] c.s.a.usetime.aspect.PrintUseTimeAspect  : 方法：aop 消耗时间 =4 ms
2019-09-20 00:46:30.103  INFO 1285 --- [nio-8080-exec-1] com.springboot.aop.demo.MyAspect         : doAround end 
2019-09-20 00:46:30.104  INFO 1285 --- [nio-8080-exec-1] com.springboot.aop.demo.MyAspect         : doAfter
2019-09-20 00:46:30.104  INFO 1285 --- [nio-8080-exec-1] com.springboot.aop.demo.MyAspect         : doAfterReturning
```

**JoinPoint**
可以看到通过JoinPoint可以获取到代理的类和方法执行的参数
```java

public interface JoinPoint {
    String METHOD_EXECUTION = "method-execution";
    String METHOD_CALL = "method-call";
    String CONSTRUCTOR_EXECUTION = "constructor-execution";
    String CONSTRUCTOR_CALL = "constructor-call";
    String FIELD_GET = "field-get";
    String FIELD_SET = "field-set";
    String STATICINITIALIZATION = "staticinitialization";
    String PREINITIALIZATION = "preinitialization";
    String INITIALIZATION = "initialization";
    String EXCEPTION_HANDLER = "exception-handler";
    String SYNCHRONIZATION_LOCK = "lock";
    String SYNCHRONIZATION_UNLOCK = "unlock";
    String ADVICE_EXECUTION = "adviceexecution";

    String toString();
    String toShortString();
    String toLongString();
    Object getThis();
    Object getTarget();
    Object[] getArgs();
    Signature getSignature();
    SourceLocation getSourceLocation();
    String getKind();
    JoinPoint.StaticPart getStaticPart();
    public interface EnclosingStaticPart extends JoinPoint.StaticPart {
    }

    public interface StaticPart {
        Signature getSignature();
        SourceLocation getSourceLocation();
        String getKind();
        int getId();
        String toString();
        String toShortString();
        String toLongString();
    }
}

```
**ProceedingJoinPoint**
环绕增强使用的是ProceedingJoinPoint,其是JoinPoint的实现类.可以看到多了proceed的方法,这个方法是用来执行代理对象的方法.

```java
public interface ProceedingJoinPoint extends JoinPoint {
    void set$AroundClosure(AroundClosure var1);

    default void stack$AroundClosure(AroundClosure arc) {
        throw new UnsupportedOperationException();
    }

    Object proceed() throws Throwable;

    Object proceed(Object[] var1) throws Throwable;
}

```

### 1.8.6. 实现原理
<a href="#menu" >目录</a>


#### 1.8.6.1. 五种通知的执行顺序

**正常情况**

![](https://upload-images.jianshu.io/upload_images/12170632-2931198a9b094f45.jpeg?imageMogr2/auto-orient/strip|imageView2/2/w/1200/format/webp)
![](https://upload-images.jianshu.io/upload_images/12170632-67b89b71dc0cb8ac.jpeg?imageMogr2/auto-orient/strip|imageView2/2/w/1200/format/webp)

**多个切面的情况下**
多个切面的情况下，可以通过@Order或者 int getOrder()方法指定先后顺序，数字越小，优先级越高。
![](https://upload-images.jianshu.io/upload_images/12170632-46a72d800cf64036.jpeg?imageMogr2/auto-orient/strip|imageView2/2/w/1200/format/webp)


#### 1.8.6.2. 代理实现
Spring AOP通过动态代理和责任链模式来实现.
在启动创建Bean时如果判断该方法有使用AOP功能,将会为该类创建代理对象并注入容器,当调用该类的方法时,将会被拦截,进而通过责任链模式一步步执行相关的切面代码.

![aop-create-proxy](pic/spring/spring/aop-create-proxy.png)

代理实现分别由CglibAopProxy和JdkDynamicAopProxy类来实现

```java

package org.springframework.aop.framework;

class CglibAopProxy implements AopProxy, Serializable {
   
    //创建代理对象
    public Object getProxy(@Nullable ClassLoader classLoader) {
        if (logger.isTraceEnabled()) {
            logger.trace("Creating CGLIB proxy: " + this.advised.getTargetSource());
        }

        try {
            Class<?> rootClass = this.advised.getTargetClass();
            Assert.state(rootClass != null, "Target class must be available for creating a CGLIB proxy");
            Class<?> proxySuperClass = rootClass;
            int x;
            if (ClassUtils.isCglibProxyClass(rootClass)) {
                proxySuperClass = rootClass.getSuperclass();
                Class<?>[] additionalInterfaces = rootClass.getInterfaces();
                Class[] var5 = additionalInterfaces;
                int var6 = additionalInterfaces.length;

                for(x = 0; x < var6; ++x) {
                    Class<?> additionalInterface = var5[x];
                    this.advised.addInterface(additionalInterface);
                }
            }

            this.validateClassIfNecessary(proxySuperClass, classLoader);
            Enhancer enhancer = this.createEnhancer();
            if (classLoader != null) {
                enhancer.setClassLoader(classLoader);
                if (classLoader instanceof SmartClassLoader && ((SmartClassLoader)classLoader).isClassReloadable(proxySuperClass)) {
                    enhancer.setUseCache(false);
                }
            }

            enhancer.setSuperclass(proxySuperClass);
            enhancer.setInterfaces(AopProxyUtils.completeProxiedInterfaces(this.advised));
            enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
            enhancer.setStrategy(new CglibAopProxy.ClassLoaderAwareUndeclaredThrowableStrategy(classLoader));
            Callback[] callbacks = this.getCallbacks(rootClass);
            Class<?>[] types = new Class[callbacks.length];

            for(x = 0; x < types.length; ++x) {
                types[x] = callbacks[x].getClass();
            }

            enhancer.setCallbackFilter(new CglibAopProxy.ProxyCallbackFilter(this.advised.getConfigurationOnlyCopy(), this.fixedInterceptorMap, this.fixedInterceptorOffset));
            enhancer.setCallbackTypes(types);
            return this.createProxyClassAndInstance(enhancer, callbacks);
        } catch (IllegalArgumentException | CodeGenerationException var9) {
            throw new AopConfigException("Could not generate CGLIB subclass of " + this.advised.getTargetClass() + ": Common causes of this problem include using a final class or a non-visible class", var9);
        } catch (Throwable var10) {
            throw new AopConfigException("Unexpected AOP exception", var10);
        }
    }

     private static class DynamicAdvisedInterceptor implements MethodInterceptor, Serializable {
        private final AdvisedSupport advised;

        public DynamicAdvisedInterceptor(AdvisedSupport advised) {
            this.advised = advised;
        }
        //代理拦截方法
        @Nullable
        public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            Object oldProxy = null;
            boolean setProxyContext = false;
            Object target = null;
            TargetSource targetSource = this.advised.getTargetSource();

            Object var16;
            try {
                if (this.advised.exposeProxy) {
                    oldProxy = AopContext.setCurrentProxy(proxy);
                    setProxyContext = true;
                }

                target = targetSource.getTarget();
                Class<?> targetClass = target != null ? target.getClass() : null;
                //获取增强的list对象
                List<Object> chain = this.advised.getInterceptorsAndDynamicInterceptionAdvice(method, targetClass);
                Object retVal;
                if (chain.isEmpty() && Modifier.isPublic(method.getModifiers())) {
                    Object[] argsToUse = AopProxyUtils.adaptArgumentsIfNecessary(method, args);
                    retVal = methodProxy.invoke(target, argsToUse);
                } else {
                    //责任链模式执行各个增强
                    retVal = (new CglibAopProxy.CglibMethodInvocation(proxy, target, method, args, targetClass, chain, methodProxy)).proceed();
                }

                retVal = CglibAopProxy.processReturnType(proxy, target, method, retVal);
                var16 = retVal;
            } finally {
                if (target != null && !targetSource.isStatic()) {
                    targetSource.releaseTarget(target);
                }

                if (setProxyContext) {
                    AopContext.setCurrentProxy(oldProxy);
                }

            }

            return var16;
        }

        public boolean equals(Object other) {
            return this == other || other instanceof CglibAopProxy.DynamicAdvisedInterceptor && this.advised.equals(((CglibAopProxy.DynamicAdvisedInterceptor)other).advised);
        }

        public int hashCode() {
            return this.advised.hashCode();
        }
    }

    
```
Jdk方式实现
```java


package org.springframework.aop.framework;

final class JdkDynamicAopProxy implements AopProxy, InvocationHandler, Serializable {

    //获取代理对象
    public Object getProxy(@Nullable ClassLoader classLoader) {
        if (logger.isTraceEnabled()) {
            logger.trace("Creating JDK dynamic proxy: " + this.advised.getTargetSource());
        }

        Class<?>[] proxiedInterfaces = AopProxyUtils.completeProxiedInterfaces(this.advised, true);
        this.findDefinedEqualsAndHashCodeMethods(proxiedInterfaces);
        return Proxy.newProxyInstance(classLoader, proxiedInterfaces, this);
    }
    @Nullable
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object oldProxy = null;
        boolean setProxyContext = false;
        TargetSource targetSource = this.advised.targetSource;
        Object target = null;

        Class var8;
        try {
            if (!this.equalsDefined && AopUtils.isEqualsMethod(method)) {
                Boolean var18 = this.equals(args[0]);
                return var18;
            }

            if (!this.hashCodeDefined && AopUtils.isHashCodeMethod(method)) {
                Integer var17 = this.hashCode();
                return var17;
            }

            if (method.getDeclaringClass() != DecoratingProxy.class) {
                Object retVal;
                if (!this.advised.opaque && method.getDeclaringClass().isInterface() && method.getDeclaringClass().isAssignableFrom(Advised.class)) {
                    retVal = AopUtils.invokeJoinpointUsingReflection(this.advised, method, args);
                    return retVal;
                }

                if (this.advised.exposeProxy) {
                    oldProxy = AopContext.setCurrentProxy(proxy);
                    setProxyContext = true;
                }

                target = targetSource.getTarget();
                Class<?> targetClass = target != null ? target.getClass() : null;
                //获取增强的list对象
                List<Object> chain = this.advised.getInterceptorsAndDynamicInterceptionAdvice(method, targetClass);
                if (chain.isEmpty()) {
                    Object[] argsToUse = AopProxyUtils.adaptArgumentsIfNecessary(method, args);
                    retVal = AopUtils.invokeJoinpointUsingReflection(target, method, argsToUse);
                } else {
                    //以责任链模式执行各个增请代码
                    MethodInvocation invocation = new ReflectiveMethodInvocation(proxy, target, method, args, targetClass, chain);
                    retVal = invocation.proceed();
                }

                Class<?> returnType = method.getReturnType();
                if (retVal != null && retVal == target && returnType != Object.class && returnType.isInstance(proxy) && !RawTargetAccess.class.isAssignableFrom(method.getDeclaringClass())) {
                    retVal = proxy;
                } else if (retVal == null && returnType != Void.TYPE && returnType.isPrimitive()) {
                    throw new AopInvocationException("Null return value from advice does not match primitive return type for: " + method);
                }

                Object var12 = retVal;
                return var12;
            }

            var8 = AopProxyUtils.ultimateTargetClass(this.advised);
        } finally {
            if (target != null && !targetSource.isStatic()) {
                targetSource.releaseTarget(target);
            }

            if (setProxyContext) {
                AopContext.setCurrentProxy(oldProxy);
            }

        }

        return var8;
    }

}

```
## 1.9. Spring对DAO的支持
<a href="#menu" >目录</a>


### 1.9.1. Spring DAO理念
<a href="#menu" >目录</a>


### 1.9.2. 统一的异常体系
<a href="#menu" >目录</a>


### 1.9.3. 统一的数据访问模板
<a href="#menu" >目录</a>


### 1.9.4. 数据源 
<a href="#menu" >目录</a>


## 1.10. Spring事务管理
<a href="#menu" >目录</a>

### 1.10.1. 数据库事务基础知识
<a href="#menu" >目录</a>

**事务的四大特性（ACID）**
如果一个数据库声称支持事务的操作，那么该数据库必须要具备以下四个特性：
* 原子性（Atomicity）
    * 原子性是指事务包含的所有操作要么全部成功，要么全部失败回滚，因此事务的操作如果成功就必须要完全应用到数据库，如果操作失败则不能对数据库有任何影响。
* 一致性（Consistency）
    * 一致性是指事务必须使数据库从一个一致性状态变换到另一个一致性状态，也就是说一个事务执行之前和执行之后都必须处于一致性状态。
    * 拿转账来说，假设用户A和用户B两者的钱加起来一共是5000，那么不管A和B之间如何转账，转几次账，事务结束后两个用户的钱相加起来应该还得是5000，这就是事务的一致性。
* 隔离性（Isolation）
    * 隔离性是当多个用户并发访问数据库时，比如操作同一张表时，数据库为每一个用户开启的事务，不能被其他事务的操作所干扰，多个并发事务之间要相互隔离。
    * 即要达到这么一种效果：对于任意两个并发的事务T1和T2，在事务T1看来，T2要么在T1开始之前就已经结束，要么在T1结束之后才开始，这样每个事务都感觉不到有其他事务在并发地执行。
* 持久性（Durability）
    * 持久性是指一个事务一旦被提交了，那么对数据库中的数据的改变就是永久性的，即便是在数据库系统遇到故障的情况下也不会丢失提交事务的操作。
    * 例如我们在使用JDBC操作数据库时，在提交事务方法后，提示用户事务操作完成，当我们程序执行完成直到看到提示后，就可以认定事务以及正确提交，即使这时候数据库出现了问题，也必须要将我们的事务完全执行完成，否则就会造成我们看到提示事务处理完毕，但是数据库因为故障而没有执行事务的重大错误。

**事务的隔离级别（默认事务级别为可重复读）**
总的说，数据库事务无非就两种：读取事务（select）、修改事务（update,insert）。在没有事务隔离控制的时候，多个事务在同一时刻对同一数据的操作可能就会影响到最终期望的结果，通常有四种情况：
* 两个更新事务同时修改一条数据时，很显然这种情况是最严重的了，程序中无论如何也不能出现这种情况，因为它会造成更新的丢失！
* 一个更新事务更新一条数据时，另一个读取事务读取了还没提交的更新，这种情况下会出现读取到脏数据。
* 一个读取事务读取一条数据时，另一个更新事务修改了这条数据，这时就会出现不可重现的读取。
* 一个读取事务读取时，另一个插入事务（注意此处时插入）插入了一条新数据，这样就可能多读出一条数据，出现幻读。

以上四种情况描述完毕，相信大家也发现规律了，前三种是对同一条数据的并发操作，对程序的结果可能产生致命影响，尤其是金融等实时性，准确性要求极高的系统，绝不容许这三中情况的出现，
相比第四种情况不会影响数据的真实性，在很多情况下是允许的，如社交论坛等实时性要求不高的系统！
综上四个情况，我们可以大致这样简单的理解（最初说的两种事务的自由组合2*2=4）：
* 修改时允许修改（丢失更新）
* 修改时允许读取（脏读）
* 读取时允许修改（不可重复读）
* 读取时允许插入（幻读）
从上到下问题越来越不严重，但所需的性能开销却越大。因为不同的系统允许不同级别的情况，所以就出现了事务隔离这么一个东东，来允许我们设定数据库的并发行为。

总结下如果不考虑事务的隔离性，会发生的几种问题：

* 脏读
    * 脏读是指在一个事务处理过程里读取了另一个未提交的事务中的数据。
    * 当一个事务正在多次修改某个数据，而在这个事务中这多次的修改都还未提交，这时一个并发的事务来访问该数据，就会造成两个事务得到的数据不一致。例如：用户A向用户B转账100元，对应SQL命令如下
        * update account set money=money+100 where name=’B’;  (此时A通知B)
        * update account set money=money - 100 where name=’A’;
    * 当只执行第一条SQL时，A通知B查看账户，B发现确实钱已到账（此时即发生了脏读），而之后无论第二条SQL是否执行，只要该事务不提交，则所有操作都将回滚，那么当B以后再次查看账户时就会发现钱其实并没有转。
* 不可重复读
    * 不可重复读是指在对于数据库中的某个数据，一个事务范围内多次查询却返回了不同的数据值，这是由于在查询间隔，被另一个事务修改并提交了。
    * 例如事务T1在读取某一数据，而事务T2立马修改了这个数据并且提交事务给数据库，事务T1再次读取该数据就得到了不同的结果，发送了不可重复读。
    * 不可重复读和脏读的区别是，脏读是某一事务读取了另一个事务未提交的脏数据，而不可重复读则是读取了前一事务提交的数据。
    * 在某些情况下，不可重复读并不是问题，比如我们多次查询某个数据当然以最后查询得到的结果为主。但在另一些情况下就有可能发生问题，例如对于同一个数据A和B依次查询就可能不同，A和B就可能打起来了……
* 虚读(幻读)
    * 幻读是事务非独立执行时发生的一种现象。例如事务T1对一个表中所有的行的某个数据项做了从“1"修改为“2"的操作，这时事务T2又对这个表中插入了一行数据项，而这个数据项的数值还是为“1"并且提交给数据库。而操作事务T1的用户如果再查看刚刚修改的数据，会发现还有一行没有修改，其实这行是从事务T2中添加的，就好像产生幻觉一样，这就是发生了幻读。
    * 幻读和不可重复读都是读取了另一条已经提交的事务（这点就脏读不同），所不同的是不可重复读查询的都是同一个数据项，而幻读针对的是一批数据整体（比如数据的个数）。

SQL标准定义了4类隔离级别，包括了一些具体规则，用来限定事务内外的哪些改变是可见的，哪些是不可见的。低级别的隔离级一般支持更高的并发处理，并拥有更低的系统开销。
MySQL数据库的四种事务隔离级别
* Read Uncommitted（读取未提交内容）
    * 在该隔离级别，所有事务都可以看到其他未提交事务的执行结果。本隔离级别很少用于实际应用，因为它的性能也不比其他级别好多少。读取未提交的数据，也被称之为脏读（Dirty Read）；
* Read Committed（读取提交内容）
    * 这是大多数数据库系统的默认隔离级别（但不是MySQL默认的）。它满足了隔离的简单定义：一个事务只能看见已经提交事务所做的改变。这种隔离级别 也支持所谓的不可重复读（Nonrepeatable Read），因为同一事务的其他实例在该实例处理其间可能会有新的commit，所以同一select可能返回不同结果；
* Repeatable Read（可重读）
    * 这是MySQL的默认事务隔离级别，它确保同一事务的多个实例在并发读取数据时，会看到同样的数据行。不过理论上，这会导致另一个棘手的问题：幻读 （Phantom Read）。
    * 简单的说，幻读指当用户读取某一范围的数据行时，另一个事务又在该范围内插入了新行，当用户再读取该范围的数据行时，会发现有新的“幻影" 行。
    * InnoDB和Falcon存储引擎通过多版本并发控制（MVCC，Multiversion Concurrency Control）机制解决了该问题
* Serializable（可串行化） 
    * 这是最高的隔离级别，它通过强制事务排序，使之不可能相互冲突，从而解决幻读问题。简言之，它是在每个读的数据行上加上共享锁。在这个级别，可能导致大量的超时现象和锁竞争。
    * 这四种隔离级别采取不同的锁类型来实现，若读取的是同一个数据的话，就容易发生问题。例如：
        * 脏读(Drity Read)：某个事务已更新一份数据，另一个事务在此时读取了同一份数据，由于某些原因，前一个RollBack了操作，则后一个事务所读取的数据就会是不正确的。
        * 不可重复读(Non-repeatable read):在一个事务的两次查询之中数据不一致，这可能是两次查询过程中间插入了一个事务更新的原有的数据。
        * 幻读(Phantom Read):在一个事务的两次查询中数据笔数不一致，例如有一个事务查询了几列(Row)数据，而另一个事务却在此时插入了新的几列数据，先前的事务在接下来的查询中，就会发现有几列数据是它先前所没有的。
         
在MySQL中，实现了这四种隔离级别，分别有可能产生问题如下所示：
* Serializable (串行化)：可避免脏读、不可重复读、幻读的发生。
* Repeatable read (可重复读)：可避免脏读、不可重复读的发生。
* Read committed (读已提交)：可避免脏读的发生。
* Read uncommitted (读未提交)：最低级别，任何情况都无法保证。

　　以上四种隔离级别最高的是Serializable级别，最低的是Read uncommitted级别，当然级别越高，执行效率就越低。像Serializable这样的级别，就是以锁表的方式(类似于Java多线程中的锁)使得其他的线程只能在锁外等待，所以平时选用何种隔离级别应该根据实际情况。在MySQL数据库中默认的隔离级别为Repeatable read (可重复读)。

　　在MySQL数据库中，支持上面四种隔离级别，默认的为Repeatable read (可重复读)；而在Oracle数据库中，只支持Serializable (串行化)级别和Read committed (读已提交)这两种级别，其中默认的为Read committed级别。


总结：

隔离级别越高，越能保证数据的完整性和一致性，但是对并发性能的影响也越大。
大多数的数据库默认隔离级别为 Read Commited，比如 SqlServer、Oracle
少数数据库默认隔离级别为：Repeatable Read 比如： MySQL InnoDB

补充：
　　1、SQL规范所规定的标准，不同的数据库具体的实现可能会有些差异
　　2、mysql中默认事务隔离级别是可重复读时并不会锁住读取到的行
　　3、事务隔离级别为读提交时，写数据只会锁住相应的行
　　4、事务隔离级别为可重复读时，如果有索引（包括主键索引）的时候，以索引列为条件更新数据，会存在间隙锁间隙锁、行锁、下一键锁的问题，从而锁住一些行；如果没有索引，更新数据时会锁住整张表。
    5、事务隔离级别为串行化时，读写数据都会锁住整张表
    6、隔离级别越高，越能保证数据的完整性和一致性，但是对并发性能的影响也越大，鱼和熊掌不可兼得啊。对于多数应用程序，可以优先考虑把数据库系统的隔离级别设为Read Committed，它能够避免脏读取，而且具有较好的并发性能。尽管它会导致不可重复读、幻读这些并发问题，在可能出现这类问题的个别场合，可以由应用程序采用悲观锁或乐观锁来控制。

**事务的分类**
* 数据库分为本地事务跟全局事务
    * 本地事务：普通事务，独立一个数据库，能保证在该数据库上操作的ACID。
    * 分布式事务：涉及两个或多个数据库源的事务，即跨越多台同类或异类数据库的事务（由每台数据库的本地事务组成的），分布式事务旨在保证这些本地事务的所有操作的ACID，使事务可以跨越多台数据库；
* Java事务类型分为JDBC事务跟JTA事务
    * JDBC事务：即为上面说的数据库事务中的本地事务，通过connection对象控制管理。
    * JTA事务：JTA指Java事务API(Java Transaction API)，是Java EE数据库事务规范， JTA只提供了事务管理接口，由应用程序服务器厂商（如WebSphere Application Server）提供实现，JTA事务比JDBC更强大，支持分布式事务。
* 按是否通过编程分为声明式事务和编程式事务，参考http://blog.csdn.net/liaohaojian/article/details/70139151
    * 声明式事务：通过XML配置或者注解实现。
    * 编程式事务：通过编程代码在业务逻辑时需要时自行实现，粒度更小。

**事务的基本原理**
Spring事务的本质其实就是数据库对事务的支��，没有数据库的事务支持，spring是无法提供事务功能的。对于纯JDBC操作数据库，想要用到事务，可以按照以下步骤进行：

* 获取连接 Connection con = DriverManager.getConnection()
* 开启事务con.setAutoCommit(true/false);
* 执行CRUD
* 提交事务/回滚事务 con.commit() / con.rollback();
* 关闭连接 conn.close()；

使用Spring的事务管理功能后，我们可以不再写步骤 2 和 4 的代码，而是由Spirng 自动完成。那么Spring是如何在我们书写的 CRUD 之前和之后开启事务和关闭事务的呢？解决这个问题，也就可以从整体上理解Spring的事务管理实现原理了。下面简单地介绍下，注解方式为例子

* 配置文件开启注解驱动，在相关的类和方法上通过注解@Transactional标识。
* spring 在启动的时候会去解析生成相关的bean，这时候会查看拥有相关注解的类和方法，并且为这些类和方法生成代理，并根据@Transaction的相关参数进行相关配置注入，这样就在代理中为我们把相关的事务处理掉了（开启正常提交事务，异常回滚事务）。
* 真正的数据库层的事务提交和回滚是通过binlog或者redo log实现的


### 1.10.2. Jdbc对事务的支持

```java
public interface Connection  extends Wrapper, AutoCloseable {

    void setAutoCommit(boolean autoCommit) throws SQLException;
    void commit() throws SQLException;
    void rollback() throws SQLException;
    void rollback(Savepoint savepoint) throws SQLException;
    void setTransactionIsolation(int level) throws SQLException;
    Savepoint setSavepoint() throws SQLException;
    Savepoint setSavepoint(String name) throws SQLException;

}
```
Savepoint 接口允许用户将事务分割成多个阶段.用户可以指定回滚到事务特定的保存点.
Savepoint 是数据库支持的功能,并不是所有数据库都具备该功能,MySQL支持.

```java
Statement stmt = conn.createStatement();

int rows =stmt.executeUpdate("xxx");
Savepoint  point1 = conn.setSavepoint("point1")；

int rows1 =stmt.executeUpdate("xxx");
int rows2 =stmt.executeUpdate("xxx");

//回滚到point1处,point1处之前的仍然会被提交,point1之后的不会被提交.
conn.rollback(point1); 

conn.commit();
```

### 1.10.3. Spring对事务的支持
<a href="#menu" >目录</a>

Spring 将事务管理委托给底层具体的持久化实现框架来完成。因此，Spring为不同的持久化框架提供了PlatformTransactionManager 接口的实现类。

事务在遇到异常的时候会回滚，默认只有在发生运行时异常即：RunTimeException时才会发生事务，如果一个方法抛出Exception或者Checked异常Spring的事务并不会回滚。

**spring 什么情况下进行事务回滚**

Spring、EJB的声明式事务默认情况下都是在抛出unchecked exception后才会触发事务的回滚

unchecked异常,即运行时异常runntimeException 回滚事务;

checked异常,即Exception可try{}捕获的不会回滚.当然也可配置spring参数让其回滚.

spring的事务边界是在调用业务方法之前开始的，业务方法执行完毕之后来执行commit or rollback(Spring默认取决于是否抛出runtime异常).
如果抛出runtime exception 并在你的业务方法中没有catch到的话，事务会回滚。
一般不需要在业务方法中catch异常，如果非要catch，在做完你想做的工作后（比如关闭文件等）一定要抛出runtime exception，否则spring会将你的操作commit,这样就会产生脏数据.所以你的catch代码是画蛇添足。

|事务|	说明|
|---|---|
|org.springframework.transaction.jta.JtaTransactionManager|	使用JPA进行持久化时，使用该事务管理器
|org.springframework.orm.hibernate3.HibernateTransactionManager	|使用Hibernate X.0(X 可以为3 4 5)版本进行持久化时，使用该事务管理器
|org.springframework.jdbc.datasource.DataSourceTransactionManager|	使用Spring JDBC  或 Mybatis 等基于DataSource数据源的持久化技术时，使用 该事务管理器
|org.springframework.orm.jdo.JdoTransactionManager|	使用JDO进行持久化时 ，使用该事务管理器
|org.springframework.transaction.jta.JtaTransactionManager|	具有多个数据源的全局事务使用该事务管理器(不管采用何种持久化技术)



#### 1.10.3.1. 编程式事务管理
<a href="#menu" >目录</a>

实际中很少使用

#### 1.10.3.2. 使用XML配置声明式事务
<a href="#menu" >目录</a>

**使用原始的TransactionProxyFactoryBean**
Spring 2.0 之后， 由于可以通过aop/tx命名空间声明事务，因此该方式也不常用

```xml
<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:aop="http://www.springframework.org/schema/aop" xmlns:p="http://www.springframework.org/schema/p"  
    xsi:schemaLocation="    
           http://www.springframework.org/schema/beans    
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd    
           http://www.springframework.org/schema/aop    
           http://www.springframework.org/schema/aop/spring-aop-3.0.xsd  
           http://www.springframework.org/schema/context    
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">  
    <!-- 配置数据源 -->  
    <bean id="dataSource"  
        class="org.springframework.jdbc.datasource.DriverManagerDataSource">  
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />  
        <property name="url" value="jdbc:mysql://localhost:3306/test" />  
        <property name="username" value="root" />  
        <property name="password" value="christmas258@" />  
    </>  
    <!--配置一个JdbcTemplate实例，并将这个“共享的"，“安全的"实例注入到不同的DAO类中去 -->  
    <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 声明事务管理器 -->  
    <bean id="txManager"  
        class="org.springframework.jdbc.datasource.DataSourceTransactionManager">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 需要实施事务增强的目标业务Bean -->  
    <bean id="libraryTarget" class="com.mucfc.dao.LibraryDaoImpl"  
        p:jdbcTemplate-ref="jdbcTemplate" />  
  
    <!-- 使用事务代理工厂类为目标业务Bean提供事务增强 -->  
    <bean id="libraryFactory"  
        class="org.springframework.transaction.interceptor.TransactionProxyFactoryBean"  
        p:transactionManager-ref="txManager" p:target-ref="libraryTarget">  
        <!-- 事务属性配置 -->  
        <property name="transactionAttributes">  
            <props>  
                <!-- 以get开头的方法采用只读型事务控制类型 -->  
                <prop key="get*">PROPAGATION_REQUIRED,readOnly</prop>  
                <!-- 所有方法均进行事务控制，如果当前没有事务，则新建一个事务 -->  
            <prop key="addBook">PROPAGATION_REQUIRED</prop>  
            </props>  
        </property>  
  
    </bean>  
</beans>  


```

缺点：
* 需要对每个需要事务支持的业务类进行单独的配置；
* 在指定事务方法时，只能通过方法名进行定义，无法利用方法签名的其他信息进行定位（如方法入参、访问与修饰符等）；
* 食物属性的配置串的规则比较麻烦，规则串虽然包括多项信息，但统一由逗号分隔的字符串来描述，不能利用IDE中的诱导输入功能，容易出错；
* 为业务类Bean添加事务支持时，在容器中既需要定义业务类Bean（通常命名为xxxTarget），又需要通过TransactionProxyFactoryBean对其进行代理以生成支持事务的代理Bean。实际上，我们只会从容器中返回代理的Bean，而业务类Bean仅是为了能代理才定义的，这样就造成相似的东西有两份配置，增强了配置信息量



**使用aop/tx命名空间的方式**
```xml
<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:aop="http://www.springframework.org/schema/aop" xmlns:p="http://www.springframework.org/schema/p"  
    xmlns:tx="http://www.springframework.org/schema/tx"  
    xsi:schemaLocation="    
           http://www.springframework.org/schema/beans    
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd    
           http://www.springframework.org/schema/tx    
           http://www.springframework.org/schema/tx/spring-tx-3.0.xsd  
           http://www.springframework.org/schema/aop    
           http://www.springframework.org/schema/aop/spring-aop-3.0.xsd  
           http://www.springframework.org/schema/context    
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">  
    <!-- 配置数据源 -->  
    <bean id="dataSource"  
        class="org.springframework.jdbc.datasource.DriverManagerDataSource">  
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />  
        <property name="url" value="jdbc:mysql://localhost:3306/test" />  
        <property name="username" value="root" />  
        <property name="password" value="christmas258@" />  
    </bean>  
    <!--配置一个JdbcTemplate实例，并将这个“共享的"，“安全的"实例注入到不同的DAO类中去 -->  
    <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 声明事务管理器 -->  
    <bean id="txManager"  
        class="org.springframework.jdbc.datasource.DataSourceTransactionManager">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 需要实施事务增强的目标业务Bean -->  
    <bean id="libraryTarget" class="com.mucfc.dao.LibraryDaoImpl"  
        p:jdbcTemplate-ref="jdbcTemplate" />  
  
    <!-- 使用tx/aop来配置 -->  
    <aop:config>  
        <!-- 通过aop定义事务增强切面 -->  
        <aop:pointcut id="serviceMethod"  
            expression="execution(* com.mucfc.dao.LibraryDaoImpl.*(..))" />  
        <!-- 引用事务增强 -->  
        <aop:advisor pointcut-ref="serviceMethod" advice-ref="txAdvice" />  
    </aop:config>  
  
    <!--事务增强 -->  
    <tx:advice id="txAdvice" transaction-manager="txManager">  
        <!-- 事务属性定义 -->  
        <tx:attributes>  
            <tx:method name="get*" read-only="false" />  
            <tx:method name="add*" rollback-for="Exception" />  
            <tx:method name="del*" />  
        </tx:attributes>  
    </tx:advice>  
</beans>  
```

#### 1.10.3.3. 使用注解配置事务
<a href="#menu" >目录</a>

```java

package org.springframework.transaction.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.TransactionDefinition;

//注解在类上或者方法上
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Transactional {

	@AliasFor("transactionManager")
	String value() default "";
	@AliasFor("value")
	String transactionManager() default "";

	Propagation propagation() default Propagation.REQUIRED;
	Isolation isolation() default Isolation.DEFAULT;
	int timeout() default TransactionDefinition.TIMEOUT_DEFAULT;
	boolean readOnly() default false;
	Class<? extends Throwable>[] rollbackFor() default {};
	String[] rollbackForClassName() default {};
	Class<? extends Throwable>[] noRollbackFor() default {};
	String[] noRollbackForClassName() default {};
}
```
**transactionManager**
表示应用那个应用那个TransactionManager.值是事务管理器的bea名称，相关的事务管理器查看上述内容几种事务管理器的说明。

**propagation**
事务传播特性

**isolation**
事务隔离特性

**timeout**
事务超时时间

**readOnly**
是否只读事务

**rollbackFor/rollbackForClassName**
导致事务回滚的异常类数组

**noRollbackFor/noRollbackForClassName**
不会导致事务回滚的异常类名字数组

**@Transactional 使用应该注意的地方**

* 默认情况下，如果在事务中抛出了未检查异常（继承自 RuntimeException 的异常）或者 Error，则 Spring 将回滚事务；除此之外，Spring 不会回滚事务。你如果想要在特定的异常回滚可以考虑rollbackFor()等属性
* @Transactional 只能应用到 public 方法才有效。这是因为在使用 Spring AOP 代理时，Spring 会调用 TransactionInterceptor在目标方法执行前后进行拦截之前，DynamicAdvisedInterceptor（CglibAopProxy的内部类）的的 intercept方法或 JdkDynamicAopProxy 的 invoke 方法会间接调用 AbstractFallbackTransactionAttributeSource（Spring 通过这个类获取@Transactional 注解的事务属性配置属性信息）的 computeTransactionAttribute 方法。
```java
protected TransactionAttribute computeTransactionAttribute(Method method, @Nullable Class<?> targetClass) {
		// Don't allow no-public methods as required.
		if (allowPublicMethodsOnly() && !Modifier.isPublic(method.getModifiers())) {
			return null;
		}
}
```
若不是 public，就不会获取@Transactional 的属性配置信息，最终会造成不会用 TransactionInterceptor 来拦截该目标方法进行事务管理。整个事务执行的时序图如下
![](https://upload-images.jianshu.io/upload_images/5281821-fecd22fffdc8d181.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

* Spring 的 AOP 的自调用问题
在 Spring 的 AOP 代理下，只有目标方法由外部调用，目标方法才由 Spring 生成的代理对象来管理，这会造成自调用问题。若同一类中的其他没有@Transactional注解的方法内部调用有@Transactional注解的方法，有@Transactional注解的方法的事务被忽略，不会发生回滚。这个问题是由于Spring AOP 代理造成的(如下面代码所示）。之所以没有应用事务，是因为在内部调用，而代理后的类(把目标类作为成员变量静态代理)只是调用成员变量中的对应方法，自然也就没有aop中的advice，造成只能调用父类的方法。另外一个问题是只能应用在public方法上。为解决这两个问题，使用 AspectJ 取代 Spring AOP 代理。
```java
@Transactional
public void saveUser(){
        User user = new User();
        user.setAge(22);
        user.setName("mask");
        logger.info("save the user{}",user);
        userRepository.save(user);
       // throw new RuntimeException("exception");
    }
public void saveUserBack(){
    saveUser();   //自调用发生
}
```
另外也可以把注解加到方法上来解决。


### 1.10.4. Spring事务实现原理
<a href="#menu" >目录</a>

#### 1.10.4.1. 事务管理关键抽象
<a href="#menu" >目录</a>

在Spring事务管理SPI(Service Provider Interface)的抽象层主要包括3个接口,分别是PlatformTransactionManager,TransactionDefinition,TransactionStatus

```java

package org.springframework.transaction;

import org.springframework.lang.Nullable;

public interface PlatformTransactionManager {
    TransactionStatus getTransaction(@Nullable TransactionDefinition var1) throws TransactionException;

    void commit(TransactionStatus var1) throws TransactionException;

    void rollback(TransactionStatus var1) throws TransactionException;
}

-------------
package org.springframework.transaction;

import org.springframework.lang.Nullable;

public interface TransactionDefinition {
    int PROPAGATION_REQUIRED = 0;
    int PROPAGATION_SUPPORTS = 1;
    int PROPAGATION_MANDATORY = 2;
    int PROPAGATION_REQUIRES_NEW = 3;
    int PROPAGATION_NOT_SUPPORTED = 4;
    int PROPAGATION_NEVER = 5;
    int PROPAGATION_NESTED = 6;

    int ISOLATION_DEFAULT = -1;
    int ISOLATION_READ_UNCOMMITTED = 1;
    int ISOLATION_READ_COMMITTED = 2;
    int ISOLATION_REPEATABLE_READ = 4;
    int ISOLATION_SERIALIZABLE = 8;

    int TIMEOUT_DEFAULT = -1;

    int getPropagationBehavior();

    int getIsolationLevel();

    int getTimeout();

    boolean isReadOnly();

    @Nullable
    String getName();
}


-----------
package org.springframework.transaction;

import java.io.Flushable;

public interface TransactionStatus extends SavepointManager, Flushable {
    //判断当前事务是否在内部创建了一个保存点
    boolean isNewTransaction();
    //判断当前事务是否是一个新的保存点
    boolean hasSavepoint();
    //设置为RollbackOnly,事务管理器只能将该事务回滚,事务管理器将显示调用回滚命令回滚或者抛出异常方式回滚
    void setRollbackOnly();
    //
    boolean isRollbackOnly();
    void flush();
    boolean isCompleted();
}

```

TransactionDefinition 用于描述事务的隔离级别,超时时间,是否为只读事务和事务传播规则等控制事务具体行为的事务属性,这些事务属性可以通过XML配置或者注解提供,也可以通过手工编程确定.

PlatformTransactionManager根据TransactionDefinition提供的配置信息创建事务,并用TransactionStatus描述这个激活事务的状态

##### 1.10.4.1.1. TransactionDefinition
<a href="#menu" >目录</a>

**事务隔离级别**

ISOLATION_DEFAULT:默认,根据数据库不同而不同,MySQL是ISOLATION_REPEATABLE_READ
ISOLATION_READ_UNCOMMITTED:读未提交
ISOLATION_READ_COMMITTED : 读以提交
ISOLATION_REPEATABLE_READ :可重复读
ISOLATION_SERIALIZABLE : 可序列化

**事务传播特性**
PROPAGATION_REQUIRED = 0;
PROPAGATION_SUPPORTS = 1;
PROPAGATION_MANDATORY = 2;
PROPAGATION_REQUIRES_NEW = 3;
PROPAGATION_NOT_SUPPORTED = 4;
PROPAGATION_NEVER = 5;
PROPAGATION_NESTED = 6;

**事务传播行为**
* PROPAGATION_REQUIRED
    * 如果存在一个事务，则支持当前事务。如果没有事务则开启一个新的事务。
    * 默认的spring事务传播级别，使用该级别的特点是，如果上下文中已经存在事务，那么就加入到事务中执行，如果当前上下文中不存在事务，则新建事务执行。所以这个级别通常能满足处理大多数的业务场景。
* PROPAGATION_SUPPORTS 
    * 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行。但是对于事务同步的事务管理器，PROPAGATION_SUPPORTS与不使用事务有少许不同。
    * 从字面意思就知道，supports，支持，该传播级别的特点是，如果上下文存在事务，则支持事务加入事务，如果没有事务，则使用非事务的方式执行。所以说，并非所有的包在transactionTemplate.execute中的代码都会有事务支持。这个通常是用来处理那些并非原子性的非核心业务逻辑操作。应用场景较少。
* PROPAGATION_MANDATORY 
    * 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常。
    * 该级别的事务要求上下文中必须要存在事务，否则就会抛出异常！配置该方式的传播级别是有效的控制上下文调用代码遗漏添加事务控制的保证手段。比如一段代码不能单独被调用执行，但是一旦被调用，就必须有事务包含的情况，就可以使用这个传播级别。
* PROPAGATION_REQUIRES_NEW
    * 总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起。
    * 从字面即可知道，new，每次都要一个新事务，该传播级别的特点是，每次都会新建一个事务，并且同时将上下文中的事务挂起，执行当前新建事务完成以后，上下文事务恢复再执行。
    * 这是一个很有用的传播级别，举一个应用场景：现在有一个发送100个红包的操作，在发送之前，要做一些系统的初始化、验证、数据记录操作，然后发送100封红包，然后再记录发送日志，发送日志要求100%的准确，如果日志不准确，那么整个父事务逻辑需要回滚。怎么处理整个业务需求呢？就是通过这个PROPAGATION_REQUIRES_NEW 级别的事务传播控制就可以完成。发送红包的子事务不会直接影响到父事务的提交和回滚。
* PROPAGATION_NOT_SUPPORTED 
    * 总是非事务地执行，并挂起任何存在的事务。
    * 这个也可以从字面得知，not supported ，不支持，当前级别的特点就是上下文中存在事务，则挂起事务，执行当前逻辑，结束后恢复上下文的事务。
    * 这个级别有什么好处？可以帮助你将事务极可能的缩小。我们知道一个事务越大，它存在的风险也就越多。所以在处理事务的过程中，要保证尽可能的缩小范围。比如一段代码，是每次逻辑操作都必须调用的，比如循环1000次的某个非核心业务逻辑操作。这样的代码如果包在事务中，势必造成事务太大，导致出现一些难以考虑周全的异常情况。所以这个事务这个级别的传播级别就派上用场了。用当前级别的事务模板抱起来就可以了。
* PROPAGATION_NEVER
    * 总是非事务地执行，如果存在一个活动事务，则抛出异常
    * 该事务更严格，上面一个事务传播级别只是不支持而已，有事务就挂起，而PROPAGATION_NEVER传播级别要求上下文中不能存在事务，一旦有事务，就抛出runtime异常，强制停止执行！
* PROPAGATION_NESTED
    * 如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务, 则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行
    * 字面也可知道，nested，嵌套级别事务。该传播级别特征是，如果上下文中存在事务，则嵌套事务执行，如果不存在事务，则新建事务



**事务超时**
超时时间到,则事务回滚.
有些事务管理器不支持事务过期功能,如果设置为TIMEOUT_DEFAULT之外的值,将会抛出异常.

**只读状态**
只读事务(比如查询)不修改数据,资源事务管理器可以对只读事务做一些优化,提高性能.
尝试在只读事务中修改数据将会抛出异常.

##### 1.10.4.1.2. TransactionStatus
<a href="#menu" >目录</a>

TransactionStatus 代表一个事务的运行状态.事务管理器可以通过该接口获取事务运行期的状态信息 .也可以通过该接口间接地回滚事务 ,它相比于在抛出异常时回滚事务的方式更具可控性.该接口继承于SavepointManager接口,该接口基于 JDBC3.0保存点的分段事务控制能力提供了嵌套事务的机制.

```java
public interface SavepointManager {
    //如果数据库不支持保存点,调用将会抛出异常
    //创建一个保存点对象
    Object createSavepoint() throws TransactionException;
    //将事务回滚到特定的保存点,被回滚的保存点将会自动释放
    void rollbackToSavepoint(Object var1) throws TransactionException;
    //释放一个保存点,如果事务提交,保存点将会自动释放
    void releaseSavepoint(Object var1) throws TransactionException;
}
```

##### 1.10.4.1.3. PlatformTransactionManager
<a href="#menu" >目录</a>


```java
/*
根据事务信息从事务环境中返回一个已存在的事务,或者创建一个新的事务,并用TransactionStatus描述事务状态
*/
TransactionStatus getTransaction(@Nullable TransactionDefinition var1) throws TransactionException;
//根据事务状态提交事务
void commit(TransactionStatus var1) throws TransactionException;
//根据事务状态回滚事务
void rollback(TransactionStatus var1) throws TransactionException;
```


### 1.10.5. 事务管理器实现类
<a href="#menu" >目录</a>

Spring 将事务管理委托给底层具体的持久化实现框架来完成。因此，Spring为不同的持久化框架提供了PlatformTransactionManager 接口的实现类

|事务|	说明|
|---|---|
|org.springframework.transaction.jta.JtaTransactionManager|	使用JPA进行持久化时，使用该事务管理器
|org.springframework.orm.hibernate3.HibernateTransactionManager|	使用Hibernate X.0(X 可以为3 4 5)版本进行持久化时，使用该事务管理器
|org.springframework.jdbc.datasource.DataSourceTransactionManager|	使用Spring JDBC  或 **Mybatis** 等基于DataSource数据源的持久化技术时，使用 该事务管理器
|org.springframework.orm.jdo.JdoTransactionManager|	使用JDO进行持久化时 ，使用该事务管理器
|org.springframework.transaction.jta.JtaTransactionManager|	具有多个数据源的全局事务使用该事务管理器(不管采用何种持久化技术)

#### 1.10.5.1. Spring事务执行流程
<a href="#menu" >目录</a>


##### 1.10.5.1.1. 基本原理
<a href="#menu" >目录</a>

这里以一个事务方法为例
```java
@Transactional
public int insert(){

    UserDelete userDelete = new UserDelete();
    userDelete.setUserId(100L);
    int id =  userDeleteMapper.insert(userDelete);

    return id;
}
```
如果使用mapper进行调用,Spring实际上使用cglib创建了mapper的代理类,通过代理拦截来实现相关的调用.
因此会被代理的intercept方法拦截,在拦截的责任链中进行事务处理


##### 1.10.5.1.2. 代理类
<a href="#menu" >目录</a>

当方法存在事务时,会以责任链的方式进行调用处理
```java
class CglibAopProxy implements AopProxy, Serializable {

    //代理类
    private static class DynamicAdvisedInterceptor implements MethodInterceptor, Serializable {
        private final AdvisedSupport advised;

        public DynamicAdvisedInterceptor(AdvisedSupport advised) {
            this.advised = advised;
        }

        //mapper调用时,将会被该方法进行拦截
        @Nullable
        public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            Object oldProxy = null;
            boolean setProxyContext = false;
            Object target = null;
            TargetSource targetSource = this.advised.getTargetSource();

            Object var16;
            try {
                if (this.advised.exposeProxy) {
                    oldProxy = AopContext.setCurrentProxy(proxy);
                    setProxyContext = true;
                }

                target = targetSource.getTarget();
                Class<?> targetClass = target != null ? target.getClass() : null;
                //获取责任链的
                List<Object> chain = this.advised.getInterceptorsAndDynamicInterceptionAdvice(method, targetClass);
                Object retVal;
                if (chain.isEmpty() && Modifier.isPublic(method.getModifiers())) {
                    Object[] argsToUse = AopProxyUtils.adaptArgumentsIfNecessary(method, args);
                    retVal = methodProxy.invoke(target, argsToUse);
                } else {
                    //处理责任链中的
                    retVal = (new CglibAopProxy.CglibMethodInvocation(proxy, target, method, args, targetClass, chain, methodProxy)).proceed();
                }

                retVal = CglibAopProxy.processReturnType(proxy, target, method, retVal);
                var16 = retVal;
            } finally {
                if (target != null && !targetSource.isStatic()) {
                    targetSource.releaseTarget(target);
                }

                if (setProxyContext) {
                    AopContext.setCurrentProxy(oldProxy);
                }

            }

            return var16;
        }

        public boolean equals(Object other) {
            return this == other || other instanceof CglibAopProxy.DynamicAdvisedInterceptor && this.advised.equals(((CglibAopProxy.DynamicAdvisedInterceptor)other).advised);
        }

        public int hashCode() {
            return this.advised.hashCode();
        }
    }
}
```
##### 1.10.5.1.3. TransactionAspectSupport中的处理

后续会调用TransactionAspectSupport的invokeWithinTransaction的方法,进行相关的启动事务,执行业务,事务回滚,事务提交操作

```java
public abstract class TransactionAspectSupport implements BeanFactoryAware, InitializingBean {
    @Nullable
    protected Object invokeWithinTransaction(Method method, @Nullable Class<?> targetClass, TransactionAspectSupport.InvocationCallback invocation) throws Throwable {
        TransactionAttributeSource tas = this.getTransactionAttributeSource();
        TransactionAttribute txAttr = tas != null ? tas.getTransactionAttribute(method, targetClass) : null;
        PlatformTransactionManager tm = this.determineTransactionManager(txAttr);
        String joinpointIdentification = this.methodIdentification(method, targetClass, txAttr);
        Object result;
        if (txAttr != null && tm instanceof CallbackPreferringPlatformTransactionManager) {
            TransactionAspectSupport.ThrowableHolder throwableHolder = new TransactionAspectSupport.ThrowableHolder();

            try {
                result = ((CallbackPreferringPlatformTransactionManager)tm).execute(txAttr, (status) -> {
                    TransactionAspectSupport.TransactionInfo txInfo = this.prepareTransactionInfo(tm, txAttr, joinpointIdentification, status);

                    Object var9;
                    try {
                        Object var8 = invocation.proceedWithInvocation();
                        return var8;.'
                    } catch (Throwable var13) {
                        if (txAttr.rollbackOn(var13)) {
                            if (var13 instanceof RuntimeException) {
                                throw (RuntimeException)var13;
                            }

                            throw new TransactionAspectSupport.ThrowableHolderException(var13);
                        }

                        throwableHolder.throwable = var13;
                        var9 = null;
                    } finally {
                        this.cleanupTransactionInfo(txInfo);
                    }

                    return var9;
                });
                if (throwableHolder.throwable != null) {
                    throw throwableHolder.throwable;
                } else {
                    return result;
                }
            } catch (TransactionAspectSupport.ThrowableHolderException var19) {
                throw var19.getCause();
            } catch (TransactionSystemException var20) {
                if (throwableHolder.throwable != null) {
                    this.logger.error("Application exception overridden by commit exception", throwableHolder.throwable);
                    var20.initApplicationException(throwableHolder.throwable);
                }

                throw var20;
            } catch (Throwable var21) {
                if (throwableHolder.throwable != null) {
                    this.logger.error("Application exception overridden by commit exception", throwableHolder.throwable);
                }

                throw var21;
            }
        } else {

            //启动事务
            TransactionAspectSupport.TransactionInfo txInfo = this.createTransactionIfNecessary(tm, txAttr, joinpointIdentification);

            try {
                //SQL业务处理
                result = invocation.proceedWithInvocation();
            } catch (Throwable var17) {
                //异常处理
                this.completeTransactionAfterThrowing(txInfo, var17);
                throw var17;
            } finally {
                //清除事务信息
                this.cleanupTransactionInfo(txInfo);
            }
            //事务完成处理
            this.commitTransactionAfterReturning(txInfo);
            return result;
        }
    }
}
```

可以看到,上面有几个任务
1. 启动事务
2. SQL业务处理
3. 异常处理
4. 清除事务信息
5. 事务完成处理

##### 1.10.5.1.4. 事务管理类DataSourceTransactionManager

以上的操作最终都是交由事务操作的核心管理类PlatformTransactionManager来实现,由于本例使用MyBatis,所以其实现类是DataSourceTransactionManager

主要包括以下几个关键方法:
* doBegin
* doSuspend
* doCommit
* doRollback
* doSetRollbackOnly
* doCleanupAfterCompletion

**doBegin**

最终会交由DataSourceTransactionManager的doBegin()进行处理
a. 从DataSourceTransactionObject拿出ConnectionHolder
b. 从ConnectionHolder拿Connection，设置事务的隔离级别，并开启事务
c. 将ConnectionHolder绑定到当前Connection上，以被嵌套的事务获取(因为JDBC连接池是根据线程绑定Connection的，所有一次嵌套事务中，使用的是同一个Connection)

```java
 protected void doBegin(Object transaction, TransactionDefinition definition) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)transaction;
        Connection con = null;

        try {
            if (!txObject.hasConnectionHolder() || txObject.getConnectionHolder().isSynchronizedWithTransaction()) {
                Connection newCon = this.obtainDataSource().getConnection();
                if (this.logger.isDebugEnabled()) {
                    this.logger.debug("Acquired Connection [" + newCon + "] for JDBC transaction");
                }

                txObject.setConnectionHolder(new ConnectionHolder(newCon), true);
            }

            txObject.getConnectionHolder().setSynchronizedWithTransaction(true);
            con = txObject.getConnectionHolder().getConnection();
            Integer previousIsolationLevel = DataSourceUtils.prepareConnectionForTransaction(con, definition);
            txObject.setPreviousIsolationLevel(previousIsolationLevel);
            if (con.getAutoCommit()) {
                txObject.setMustRestoreAutoCommit(true);
                if (this.logger.isDebugEnabled()) {
                    this.logger.debug("Switching JDBC Connection [" + con + "] to manual commit");
                }

                con.setAutoCommit(false);
            }

            this.prepareTransactionalConnection(con, definition);
            txObject.getConnectionHolder().setTransactionActive(true);
            int timeout = this.determineTimeout(definition);
            if (timeout != -1) {
                txObject.getConnectionHolder().setTimeoutInSeconds(timeout);
            }

            if (txObject.isNewConnectionHolder()) {
                TransactionSynchronizationManager.bindResource(this.obtainDataSource(), txObject.getConnectionHolder());
            }

        } catch (Throwable var7) {
            if (txObject.isNewConnectionHolder()) {
                DataSourceUtils.releaseConnection(con, this.obtainDataSource());
                txObject.setConnectionHolder((ConnectionHolder)null, false);
            }

            throw new CannotCreateTransactionException("Could not open JDBC Connection for transaction", var7);
        }
    }

```

**doSuspend**

```java
protected Object doSuspend(Object transaction) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)transaction;
        txObject.setConnectionHolder((ConnectionHolder)null);
        return TransactionSynchronizationManager.unbindResource(this.obtainDataSource());
    }
```
**doResume**

```java
    protected void doResume(@Nullable Object transaction, Object suspendedResources) {
        TransactionSynchronizationManager.bindResource(this.obtainDataSource(), suspendedResources);
    }
```

**doCommit**

```java
    protected void doCommit(DefaultTransactionStatus status) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)status.getTransaction();
        Connection con = txObject.getConnectionHolder().getConnection();
        if (status.isDebug()) {
            this.logger.debug("Committing JDBC transaction on Connection [" + con + "]");
        }

        try {
            con.commit();
        } catch (SQLException var5) {
            throw new TransactionSystemException("Could not commit JDBC transaction", var5);
        }
    }
```
**doRollback**
```java
    protected void doRollback(DefaultTransactionStatus status) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)status.getTransaction();
        Connection con = txObject.getConnectionHolder().getConnection();
        if (status.isDebug()) {
            this.logger.debug("Rolling back JDBC transaction on Connection [" + con + "]");
        }

        try {
            con.rollback();
        } catch (SQLException var5) {
            throw new TransactionSystemException("Could not roll back JDBC transaction", var5);
        }
    }
```
**doSetRollbackOnly**
```java
    protected void doSetRollbackOnly(DefaultTransactionStatus status) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)status.getTransaction();
        if (status.isDebug()) {
            this.logger.debug("Setting JDBC transaction [" + txObject.getConnectionHolder().getConnection() + "] rollback-only");
        }

        txObject.setRollbackOnly();
    }
```


**doCleanupAfterCompletion**
a. 从ThreadLocal中将ConnectionHolder清除
b. 回复Connecton之前的AutoCommit和IsolationLevel属性
c. 释放connection
d. 清除ConnectHolder相应的对象属性

```java
    protected void doCleanupAfterCompletion(Object transaction) {
        DataSourceTransactionManager.DataSourceTransactionObject txObject = (DataSourceTransactionManager.DataSourceTransactionObject)transaction;
        if (txObject.isNewConnectionHolder()) {
            TransactionSynchronizationManager.unbindResource(this.obtainDataSource());
        }

        Connection con = txObject.getConnectionHolder().getConnection();

        try {
            if (txObject.isMustRestoreAutoCommit()) {
                con.setAutoCommit(true);
            }

            DataSourceUtils.resetConnectionAfterTransaction(con, txObject.getPreviousIsolationLevel());
        } catch (Throwable var5) {
            this.logger.debug("Could not reset JDBC Connection after transaction", var5);
        }

        if (txObject.isNewConnectionHolder()) {
            if (this.logger.isDebugEnabled()) {
                this.logger.debug("Releasing JDBC Connection [" + con + "] after transaction");
            }

            DataSourceUtils.releaseConnection(con, this.dataSource);
        }

        txObject.getConnectionHolder().clear();
    }
```







### 1.10.6. 事务同步管理器
<a href="#menu" >目录</a>

Spring 将 JDBC 的 Connection、Hibernate 的 Session 等访问数据库的连接或者会话对象统称为资源，这些资源在同一时刻是不能多线程共享的 。 为了让 DAO 或 Service 类可以实现单例模式， Spring 的事务同步管理类 org.springframework.transaction.support.TransactionSynchronizationManager 利用 ThreadLocal 为不同的事务线程提供了独立的资源副本，并同时维护这些事务的配置属性和运行状态信息 。

Spring 框架为不同的持久化技术提供了一套从 TransactionSynchronizationManager 中获取对应线程绑定资源的工具类，这些工具类都提供了可以获取绑定当前线程资源的静态方法：

|持久化技术	|线程绑定资源获取工具	|静态方法
|---|---|---|
|Spring JDBC 或 MyBatis|	org.springframework.jdbc.datasource.DataSourceUtils|	public static Connection getConnection(DataSource dataSource)
|HibernateX.0	|org.springframework.orm.hibernateC.SessionFactoryUtils	public static Session getSession(SessionFactory sessionFactory, boolean allowCreate)
|JPA	|org.springframework.orm.jpa.EntityManagerFactoryUtils	|public static EntityManager getTransactionalEntityManager(EntityManagerFactory emf)
|JDO	|org.springframework.orm.jdo.PersistenceManagerFactoryUtils	|public static PersistenceManager getPersistenceManager(PersistenceManagerFactory pmf, boolean allowCreate)

某些场景下，可能无法使用 Spring 提供的模板类。这时，就必须通过操作底层持久化技术所提供的原生 API ，而这就需要通过这些工具类来获取线程绑定的资源。如果直接从 DataSource 或 SessionFactory 中获取资源，那么就无法让数据操作参与到与本线程相关的事务环境，因为这些对象不能获取和当前线程相关的资源。

TransactionSynchronizationManager 源码如下：
```java
public abstract class TransactionSynchronizationManager {

	private static final Log logger = LogFactory.getLog(TransactionSynchronizationManager.class);

    //事务线程对应的Connection或Session等类型的资源
	private static final ThreadLocal<Map<Object, Object>> resources =
			new NamedThreadLocal<Map<Object, Object>>("Transactional resources");
    //事务线程对应的
	private static final ThreadLocal<Set<TransactionSynchronization>> synchronizations =
			new NamedThreadLocal<Set<TransactionSynchronization>>("Transaction synchronizations");
    //事务线程对应的事务名称
	private static final ThreadLocal<String> currentTransactionName =
			new NamedThreadLocal<String>("Current transaction name");
    //事务线程对应的 read-only状态
	private static final ThreadLocal<Boolean> currentTransactionReadOnly =
			new NamedThreadLocal<Boolean>("Current transaction read-only status");
    //事务线程对应的事务隔离级别
	private static final ThreadLocal<Integer> currentTransactionIsolationLevel =
			new NamedThreadLocal<Integer>("Current transaction isolation level");
    //事务线程对应的事务激活状态
	private static final ThreadLocal<Boolean> actualTransactionActive =
			new NamedThreadLocal<Boolean>("Actual transaction active");
}
```

|事务线程成员变量	|说明|
|---|---|
|resources|	Connection 或 Session 等资源
|currentTransactionName	|事务名称
|currentTransactionReadOnly	|事务只读状态
|currentTransactionIsolationLevel	|事务隔离级别
|actualTransactionActive|	事务激活状态

TransactionSynchronizationManager 将 Dao、Service 类中影响线程安全的所有 “ 状态 " 都统一抽取到该类中，并用 ThreadLocal 进行封装，这样一来， Dao （基于模板类或资源获取工具类创建的 Dao ）和 Service （采用 Spring 事务管理机制）就变成线程安全的对象


### 1.10.7. 事务传播行为
<a href="#menu" >目录</a>


**嵌套事务**
嵌套是子事务套在父事务中执行，子事务是父事务的一部分，在进入子事务之前，父事务建立一个回滚点，叫save point，然后执行子事务，这个子事务的执行也算是父事务的一部分，然后子事务执行结束，父事务继续执行。重点就在于那个save point。看几个问题就明了了：

* 如果子事务回滚，会发生什么？
父事务会回滚到进入子事务前建立的save point，然后尝试其他的事务或者其他的业务逻辑，父事务之前的操作不会受到影响，更不会自动回滚。

* 如果父事务回滚，会发生什么？
父事务回滚，子事务也会跟着回滚！为什么呢，因为父事务结束之前，子事务是不会提交的，我们说子事务是父事务的一部分，正是这个道理。

* 事务的提交，是什么情况？
是父事务先提交，然后子事务提交，还是子事务先提交，父事务再提交？答案是第二种情况，还是那句话，子事务是父事务的一部分，由父事务统一提交。



#### 1.10.7.1. 事务传播行为说明

|常量名称	|常量解释
|---|---|
|PROPAGATION_REQUIRED	|支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择，也是 Spring 默认的事务的传播。
|PROPAGATION_REQUIRES_NEW	|新建事务，如果当前存在事务，把当前事务挂起。新建的事务将和被挂起的事务没有任何关系，是两个独立的事务，外层事务失败回滚之后，不能回滚内层事务执行的结果，内层事务失败抛出异常，外层事务捕获，也可以不处理回滚操作
|PROPAGATION_SUPPORTS	|支持当前事务，如果当前没有事务，就以非事务方式执行。
|PROPAGATION_MANDATORY	|支持当前事务，如果当前没有事务，就抛出异常。
|PROPAGATION_NOT_SUPPORTED|	以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
|PROPAGATION_NEVER|	以非事务方式执行，如果当前存在事务，则抛出异常。
|PROPAGATION_NESTED	|如果一个活动的事务存在，则运行在一个嵌套的事务中。如果没有活动事务，则按REQUIRED属性执行。它使用了一个单独的事务，这个事务拥有多个可以回滚的保存点。内部事务的回滚不会对外部事务造成影响。它只对DataSourceTransactionManager事务管理器起效。

#### 1.10.7.2. 具体说明

假设有类A的方法methodA(),有类B的方法methodB().

```java

public class A{

    B b;
    @Transactional
    public void methodA(){

        b.methodB();
    }

}

public class B{

    @Transactional(propagation=TransactionDefinition.XXX)
    public void methodB(){

    }

}

```
事务传播特性指 methodA中调用 methodB时, methodA有无事务的情况下,methodB定义不同的传播特性,最后呈现的是怎样的事务形态.


##### 1.10.7.2.1. PROPAGATION_REQUIRED
定义:支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择，也是 Spring 默认的事务的传播

如果方法methodA有事务,则方法methodB不创建事务,使用和方法methodA同一个事务.
如果没有methodA没有事务,相当于一个普通方法调用,不存在事务传播,methodB就创建一个事务.

由于是同一事务,发生任何运行期异常,所有的操作都会回滚.

##### 1.10.7.2.2. PROPAGATION_REQUIRES_NEW
定义:新建事务，如果当前存在事务，把当前事务挂起。新建的事务将和被挂起的事务没有任何关系，是两个独立的事务，外层事务失败回滚之后，不能回滚内层事务执行的结果，内层事务失败抛出异常，外层事务捕获，也可以不处理回滚操作

methodA和methodB是独立的事务,发生异常不会互相影响 ,但是methodB抛出异常被A捕获,A不会发生回滚.


##### 1.10.7.2.3. PROPAGATION_SUPPORTS
定义:支持当前事务，如果当前没有事务，就以非事务方式执行。

如果methodA没有事务,则两个方法都以无事务方式运行,发生异常都不会回滚
如果methodA有事务,则两个都处于同一个事务中.

##### 1.10.7.2.4. PROPAGATION_MANDATORY	
定义:支持当前事务，如果当前没有事务，就抛出异常。

如果methodA没有事务,将会抛出异常
如果methodA有事务,则两个都处于同一个事务中.

##### 1.10.7.2.5. PROPAGATION_NOT_SUPPORTED
定义:以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。

如果A.methodA()存在事务，如果B.methodB()抛出异常，A.methodA()不捕获的话，A.methodA()的事务被回滚，而B.methodB()出现异常前数据库操作不受影响。如果A.methodA()捕获的话，则A.methodA()的事务不受影响，B.methodB()异常抛出前的数据操作不受影响。


##### 1.10.7.2.6. PROPAGATION_NEVER
定义:以非事务方式执行，如果当前存在事务，则抛出异常。

如果method存在事务,则抛出异常.

##### 1.10.7.2.7. PROPAGATION_NESTED
定义:如果一个活动的事务存在，则运行在一个嵌套的事务中。如果没有活动事务，则按REQUIRED属性执行。它使用了一个单独的事务，这个事务拥有多个可以回滚的保存点。内部事务的回滚不会对外部事务造成影响。它只对DataSourceTransactionManager事务管理器起效。

* 如果A的MethodA()不存在事务，则B的methodB()运行在一个新的事务中，B.method()抛出的异常，B.methodB()回滚,但A.methodA()不回滚；如果A.methoda()抛出异常，则A.methodA()和B.methodB()操作不回滚。
* 如果A的methodA()存在事务，则A的methodA()抛出异常，则A的methodA()和B的MethodB()都会被回滚；
* 如果A的MethodA()存在事务，则B的methodB()抛出异常，B.methodB()回滚，如果A不捕获异常，则A.methodA()和B.methodB()都会回滚，如果A捕获异常，则B.methodB()回滚,A不回滚；



### 1.10.8. 使用场景

**在一个话费充值业务处理逻辑中**

```java
//充值处理
chargeHandle(){
    //扣款操作
    charger();
    //创建订单操作
    order();
}
```
业务需要扣款操作和创建订单操作同成功或者失败，因此，charger()和order()的事务不能相互独立，需要包含在chargeHandle()的事务中；

通过以上需求，可以给charge()和order()的事务传播行为定义成：PROPAGATION_MANDATORY

只要charge()或者order()抛出异常整个chargeHandle()都一起回滚，即使chargeHandle()捕获异常也没用，不允许提交事务。


**如果业务需求没接受到一次请求到要记录日志到数据库**

```java
//充值处理
chargeHandle(){
    //记录请求日志
    log();
    //扣款操作
    charger();
    //创建订单操作
    order();
}
```
因为log()的操作不管扣款和创建订单成功与否都要生成日志，并且日志的操作成功与否不影响充值处理，所以log()方法的事务传播行为可以定义为:PROPAGATION_REQUIRES_NEW.

**在订单的售后处理中，更新完订单金额后，需要自动统计销售报表**

```java

//售后处理
postHandle(){
    //修改订单金额
    update();
    //报表统计
    report();
}
```
根据业务可知，售后是已经处理完订单的充值请求后的功能，是对订单的后续管理，统计报表report()方法耗时较长，因此，我们需要设置report()的事务传播行为为:PROPAGATION_NEVER,表示不适合在有事务的操作中调用，因为report()太耗时。

**在银行新增银行卡业务中，需要执行两个操作，一个是保存银行卡信息，一个是登记新创建的银行卡信息，其中登记银行卡信息成功与否不影响银行卡的创建。**

```java
//新增银行卡
action(){

    //保存银行卡信息
    insert();
    //登记
    regster()
}
```
由以上需求，我们可知对于regster()方法的事务传播行为，可以设置为PROPAGATION_NESTED，action()事务的回滚，regster()保存的信息就没意义，也就需要跟着回滚，而regster()的回滚不影响action()事务；insert()的事务传播行为可以设置为PROPAGATION_REQUIRED, PROPAGATION_MANDATORY，即insert()回滚事务，action()的事务必须跟着回滚。



## 1.11. Spring常用工具类
<a href="#menu" >目录</a>


### 1.11.1. web
* [org.springframework.web.util.CookieGenerator](https://github.com/lgjlife/spring-utils/blob/master/src%2Fmain%2Fjava%2Fcom%2Fspring%2Futils%2Fweb%2FCookieGeneratorUtil.java)
    * 给HttpServletResponse添加cookies
* org.springframework.web.util.HtmlCharacterEntityDecoder
* org.springframework.web.util.HtmlCharacterEntityReferences
* org.springframework.web.util.HtmlUtils
* org.springframework.web.util.HttpUrlTemplate
    * 这个类用于用字符串模板构建url, 它会自动处理url里的汉字及其它相关的编码. 在读取别人提供的url资源时, 应该经常用String url = "http://localhost/myapp/{name}/{id}";
* org.springframework.web.util.JavaScriptUtils
* org.springframework.web.util.Log4jConfigListener
    * 用listener的方式来配制log4j在web环境下的初始化
* org.springframework.web.util.UriTemplate
* org.springframework.web.util.UriUtils
    * 处理uri里特殊字符的编码
* org.springframework.web.util.WebUtils

### 1.11.2. 内置的resouce类型
* UrlResource
* ClassPathResource
* FileSystemResource
* ServletContextResource
* InputStreamResource
* ByteArrayResource
* EncodedResource 也就是Resource加上encoding, 可以认为是有编码的资源
    * VfsResource(在jboss里经常用到, 相应还有 工具类 VfsUtils)
* org.springframework.util.xml.ResourceUtils 用于处理表达资源字符串前缀描述资源的工具. 如: "classpath:".
    * 有 getURL, getFile, isFileURL, isJarURL, extractJarFileURL

### 1.11.3. 工具类
* org.springframework.core.annotation.AnnotationUtils
    * 处理注解
* org.springframework.core.io.support.PathMatchingResourcePatternResolver
    * 用 于处理 ant 匹配风格(com/*.jsp, com/*/.jsp),找出所有的资源, 结合上面的resource的概念一起使用
* org.springframework.core.io.support.PropertiesLoaderUtils
    * 加载Properties资源工具类,和Resource结合
* org.springframework.core.BridgeMethodResolver
    * 桥接方法分析器.
* org.springframework.core.GenericTypeResolver
    * 范型分析器, 在用于对范型方法, 参数分析.
* org.springframework.core.NestedExceptionUtils

### 1.11.4. xml工具
* org.springframework.util.xml.AbstractStaxContentHandler
* org.springframework.util.xml.AbstractStaxXMLReader
* org.springframework.util.xml.AbstractXMLReader
* org.springframework.util.xml.AbstractXMLStreamReader
* org.springframework.util.xml.DomUtils
* org.springframework.util.xml.SimpleNamespaceContext
* org.springframework.util.xml.SimpleSaxErrorHandler
* org.springframework.util.xml.SimpleTransformErrorListener
* org.springframework.util.xml.StaxUtils
* org.springframework.util.xml.TransformerUtils

### 1.11.5. 其它工具集
* [org.springframework.util.xml.AntPathMatcher](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/AntPathMatcherUtil.java)
    * ant风格的处理,路径匹配校验
* [org.springframework.util.xml.Assert](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/AssertUtil.java)
    * 断言,在我们的参数判断时应该经常用
* org.springframework.util.xml.CachingMapDecorator
* org.springframework.util.xml.ClassUtils
    * 用于Class的处理
* org.springframework.util.xml.CollectionUtils
    * 用于处理集合的工具
* org.springframework.util.xml.CommonsLogWriter
* org.springframework.util.xml.CompositeIterator
* org.springframework.util.xml.ConcurrencyThrottleSupport
* org.springframework.util.xml.CustomizableThreadCreator
* org.springframework.util.xml.DefaultPropertiesPersister
* [org.springframework.util.xml.DigestUtils](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/DigestUtilsDemo.java)
    * 摘要处理, 这里有用于md5处理信息的
* [org.springframework.util.xml.FileCopyUtils](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/FileCopyUtilsDemo.java)
    * 文件的拷贝处理, 结合Resource的概念一起来处理, 真的是很方便
* org.springframework.util.xml.FileSystemUtils
* org.springframework.util.xml.LinkedCaseInsensitiveMap
    * key值不区分大小写的LinkedMap
* org.springframework.util.xml.LinkedMultiValueMap
    * 一个key可以存放多个值的LinkedMap
* org.springframework.util.xml.Log4jConfigurer
    * 一个log4j的启动加载指定配制文件的工具类
* org.springframework.util.xml.NumberUtils
    * 处理数字的工具类, 有parseNumber 可以把字符串处理成我们指定的数字格式, 还支持format格式, 　　　　convertNumberToTargetClass 可以实现Number类型的转化.
* org.springframework.util.xml.ObjectUtils
    * 有很多处理null object的方法. 如nullSafeHashCode, nullSafeEquals, isArray, containsElement, addObjectToArray, 等有用的方法
* org.springframework.util.xml.PatternMatchUtils
    * spring里用于处理简单的匹配. 如 Spring's typical "xxx", "xxx" and "xxx" pattern styles
* org.springframework.util.xml.PropertyPlaceholderHelper
    * 用于处理占位符的替换
* org.springframework.util.xml.ReflectionUtils
    * 反映常用工具方法. 有 findField, setField, getField, findMethod, invokeMethod等有用的方法
* [org.springframework.util.xml.SerializationUtils](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/SerializationUtilsUtil.java)
    * 用于java的序列化与反序列化. serialize与deserialize方法 
* [org.springframework.util.xml.StopWatch](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/StopWatchUtil.java)
    * 一个很好的用于记录执行时间的工具类, 且可以用于任务分阶段的测试时间. 最后支持一个很好看的打印格式. 这个类应该经常用
* [org.springframework.util.xml.StringUtils](https://github.com/lgjlife/spring-utils/blob/master/src/main/java/com/spring/utils/util/StringUtilsUtil.java)
    * String 工具类，判断空，去除空格等操作
* org.springframework.util.xml.SystemPropertyUtils
* org.springframework.util.xml.TypeUtils
    * 用于类型相容的判断. isAssignable
* org.springframework.util.xml.WeakReferenceMonitor
    * 弱引用的监控


# 2. Spring 表达式语言
<a href="#menu" >目录</a>


Spring 3引入了Spring表达式语言（Spring Expression Language，SpEL），它能够以一种强大和简洁的方式将值装配到bean属性和构造器参数中，在这个过程中所使用的表达式会在运行时计算得到值

SpEL拥有很多特性，包括：
* 使用bean的ID来引用bean；
* 调用方法和访问对象的属性；
* 对值进行算术、关系和逻辑运算；
* 正则表达式匹配；
* 集合操作。


# 3. Spring Cache
<a href="#menu" >目录</a>


## 3.1. Cache 的组件和概念

* CacheManager ，用来创建、 管理、管理多个命名唯一的 Cache ，如组织机构缓存、菜单项的缓存、菜单树的缓存等 。
* Cache 类似 Map 那样的 Key-Value 存储结构， Value 部分通常包含了 缓存的对象，通过Key 来取得缓存对象 。缓存工页，存放在缓存里的对象，常常需要实现序列化接口，以支持分布式缓存。
* Cache 存储方式，缓存组件可以将对象放到内存或其他缓存服务器上 ， Spring Boot提供了一个基于 ConcurrentMap 的缓存，同时也集成了 Red is 、 EhCache 2.x 、 JCache 缓存服务器等。
* 缓存策略，通常 Cache 还可以有不同的缓存策略，如设置缓存最大的容量，缓存项的过期时间等。
* 分布式缓存，缓存通常按照缓存数据类型存放在不同缓存服务器上，或者同一类型的缓存按照某种算法、不同 Key 的数据存放在不同的缓存服务器上 。
* Cache Hit，从 Cache 中取得期望的缓存项，我们通常称之为缓存命中。如果没有命中则称之为 Cache Miss，意味着需要从数据来源处重新取出井放回 Cache 中 。
* Cache Miss，缓存丢失，根据 Key 没有从缓存中找到对应的缓存项。
* Cache Evication，缓存清除操作 。
* Hot Data，热点数据，缓存系统能调整算法或者内部存储方式，使得最有可能频繁访问的数据能被尽快访问到 。
* On-Heap, Java 分配对象都是在堆内存中，有最快的获取速度。由于虚拟机的垃圾回收管理机制，缓存放入过多的对象会导致垃圾回收时间过长，从而有可能影响性能。
* 0ff-Heap ，堆外内存，对象存放在虚拟机分配的堆外内存中，因此不受垃圾回 收管理机制的管理，不影响系统性能，但堆外内存的对象要被使用，还要序列化成堆内对象 。很多缓存工具会把不常用的对象放到堆外，把热点数据放到堆内 。



## 3.2. 几个重要概念&缓存注解
<a href="#menu" >目录</a>

|名称|	解释|
|---|---|
|Cache|	缓存接口，定义缓存操作。实现有：RedisCache、EhCacheCache、ConcurrentMapCache等
|CacheManager|	缓存管理器，管理各种缓存（cache）组件
|@Cacheable	|主要针对方法配置，能够根据方法的请求参数对其进行缓存
|@CacheEvict	|清空缓存
|@CachePut|	保证方法被调用，又希望结果被缓存。与@Cacheable区别在于是否每次都调用方法，常用于更新
|@EnableCaching	|开启基于注解的缓存
|keyGenerator|	缓存数据时key生成策略
|serialize|	缓存数据时value序列化策略
|@CacheConfig|	统一配置本类的缓存注解的属性

**@Cacheable/@CachePut/@CacheEvict 主要的参数**
|名称|	解释|
|---|---|
|value|	缓存的名称，在 spring 配置文件中定义，必须指定至少一个.例如：@Cacheable(value="mycache") 或者@Cacheable(value={"cache1","cache2"}
|key	|缓存的 key，可以为空，如果指定要按照 SpEL 表达式编写，如果不指定，则缺省按照方法的所有参数进行组合.例如：@Cacheable(value="testcache",key="#id")
|condition|	缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存/清除缓存.例如：@Cacheable(value="testcache",condition="#userName.length()>2")
|unless	|否定缓存。当条件结果为TRUE时，就不会缓存。@Cacheable(value="testcache",unless="#userName.length()>2")
|allEntries(@CacheEvict )|	是否清空所有缓存内容，缺省为 false，如果指定为 true,则方法调用后将立即清空所有缓存.例如：@CachEvict(value="testcache",allEntries=true)
|beforeInvocation(@CacheEvict)	|是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存,例如：@CachEvict(value="testcache"，beforeInvocation=true)

## 3.3. 集成 Spring Cache

```xml
<dependency>
    <groupid>org .springframework.boot</groupid>
    <artifactid>spring-boot-starter-cache</artifactid>
</dependency>
```
如果使用 Spring 自带的内存的缓存管理器，需要在 appliaction.properties 中配置属性 ：spring.cache.type=Simple
* Simple ，基于 ConcurrentHashMap 实现的缓存，适合单体应用或者开发环境使用 。
* none，关闭缓存，比如开发阶段为了确保功能正确 ，可以先禁止使用缓存 。
* redis，使用 Redis 作为缓存，还需要在 porn 中增加 Redis 依赖 。 本章将重点介绍 Redis缓存以及扩展 Redis 实现一二级缓存。
* Generic ，用户自定义缓存实现，用户需要实现一个 org叩ringframework.cache.CacheManager的实现 。
* 其他还有 JCache 、 EhCache 2.x, Hazelcast 等

最后，需要使用注解＠EnableCaching 打开缓存功能 。
```java
@SpringBootApplication
@EnableCaching
public class Chl4Application {
    public static void main(String[) args) {
        SpringApplication . run(Chl4Application.class , args) ;
    }
}
```
## 3.4. 缓存管理器
<a href="#menu" >目录</a>

CacheManager是SPI,提供了访问缓存名称和缓存对象的方法.同时也实现了幕后的管理,处理缓存和逐出的发生.

```java
public interface CacheManager {
    @Nullable
    Cache getCache(String var1);

    Collection<String> getCacheNames();
}

```
### 3.4.1. SimpleCacheManager
<a href="#menu" >目录</a>

```java
public class SimpleCacheManager extends AbstractCacheManager {
    private Collection<? extends Cache> caches = Collections.emptySet();

    public SimpleCacheManager() {
    }

    public void setCaches(Collection<? extends Cache> caches) {
        this.caches = caches;
    }

    protected Collection<? extends Cache> loadCaches() {
        return this.caches;
    }
}
```
### 3.4.2. NoOpCacheManager
<a href="#menu" >目录</a>


```java
public class NoOpCacheManager implements CacheManager {
    private final ConcurrentMap<String, Cache> caches = new ConcurrentHashMap(16);
    private final Set<String> cacheNames = new LinkedHashSet(16);

    public NoOpCacheManager() {
    }

    @Nullable
    public Cache getCache(String name) {
        Cache cache = (Cache)this.caches.get(name);
        if (cache == null) {
            this.caches.putIfAbsent(name, new NoOpCache(name));
            synchronized(this.cacheNames) {
                this.cacheNames.add(name);
            }
        }

        return (Cache)this.caches.get(name);
    }

    public Collection<String> getCacheNames() {
        synchronized(this.cacheNames) {
            return Collections.unmodifiableSet(this.cacheNames);
        }
    }
}
```

### 3.4.3. ConcurrentMapCacheManager
<a href="#menu" >目录</a>


```java

package org.springframework.cache.concurrent;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.core.serializer.support.SerializationDelegate;
import org.springframework.lang.Nullable;

public class ConcurrentMapCacheManager implements CacheManager, BeanClassLoaderAware {
    private final ConcurrentMap<String, Cache> cacheMap = new ConcurrentHashMap(16);
    private boolean dynamic = true;
    private boolean allowNullValues = true;
    private boolean storeByValue = false;
    @Nullable
    private SerializationDelegate serialization;

    public ConcurrentMapCacheManager() {
    }

    public ConcurrentMapCacheManager(String... cacheNames) {
        this.setCacheNames(Arrays.asList(cacheNames));
    }

    public void setCacheNames(@Nullable Collection<String> cacheNames) {
        if (cacheNames != null) {
            Iterator var2 = cacheNames.iterator();

            while(var2.hasNext()) {
                String name = (String)var2.next();
                this.cacheMap.put(name, this.createConcurrentMapCache(name));
            }

            this.dynamic = false;
        } else {
            this.dynamic = true;
        }

    }

    public void setAllowNullValues(boolean allowNullValues) {
        if (allowNullValues != this.allowNullValues) {
            this.allowNullValues = allowNullValues;
            this.recreateCaches();
        }

    }

    public boolean isAllowNullValues() {
        return this.allowNullValues;
    }

    public void setStoreByValue(boolean storeByValue) {
        if (storeByValue != this.storeByValue) {
            this.storeByValue = storeByValue;
            this.recreateCaches();
        }

    }

    public boolean isStoreByValue() {
        return this.storeByValue;
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        this.serialization = new SerializationDelegate(classLoader);
        if (this.isStoreByValue()) {
            this.recreateCaches();
        }

    }

    public Collection<String> getCacheNames() {
        return Collections.unmodifiableSet(this.cacheMap.keySet());
    }

    @Nullable
    public Cache getCache(String name) {
        Cache cache = (Cache)this.cacheMap.get(name);
        if (cache == null && this.dynamic) {
            synchronized(this.cacheMap) {
                cache = (Cache)this.cacheMap.get(name);
                if (cache == null) {
                    cache = this.createConcurrentMapCache(name);
                    this.cacheMap.put(name, cache);
                }
            }
        }

        return cache;
    }

    private void recreateCaches() {
        Iterator var1 = this.cacheMap.entrySet().iterator();

        while(var1.hasNext()) {
            Entry<String, Cache> entry = (Entry)var1.next();
            entry.setValue(this.createConcurrentMapCache((String)entry.getKey()));
        }

    }

    protected Cache createConcurrentMapCache(String name) {
        SerializationDelegate actualSerialization = this.isStoreByValue() ? this.serialization : null;
        return new ConcurrentMapCache(name, new ConcurrentHashMap(256), this.isAllowNullValues(), actualSerialization);
    }
}

```
### 3.4.4. CompositeCacheManager
<a href="#menu" >目录</a>

```java

package org.springframework.cache.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.lang.Nullable;

public class CompositeCacheManager implements CacheManager, InitializingBean {
    private final List<CacheManager> cacheManagers = new ArrayList();
    private boolean fallbackToNoOpCache = false;

    public CompositeCacheManager() {
    }

    public CompositeCacheManager(CacheManager... cacheManagers) {
        this.setCacheManagers(Arrays.asList(cacheManagers));
    }

    public void setCacheManagers(Collection<CacheManager> cacheManagers) {
        this.cacheManagers.addAll(cacheManagers);
    }

    public void setFallbackToNoOpCache(boolean fallbackToNoOpCache) {
        this.fallbackToNoOpCache = fallbackToNoOpCache;
    }

    public void afterPropertiesSet() {
        if (this.fallbackToNoOpCache) {
            this.cacheManagers.add(new NoOpCacheManager());
        }

    }

    @Nullable
    public Cache getCache(String name) {
        Iterator var2 = this.cacheManagers.iterator();

        Cache cache;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            CacheManager cacheManager = (CacheManager)var2.next();
            cache = cacheManager.getCache(name);
        } while(cache == null);

        return cache;
    }

    public Collection<String> getCacheNames() {
        Set<String> names = new LinkedHashSet();
        Iterator var2 = this.cacheManagers.iterator();

        while(var2.hasNext()) {
            CacheManager manager = (CacheManager)var2.next();
            names.addAll(manager.getCacheNames());
        }

        return Collections.unmodifiableSet(names);
    }
}

```
## 3.5. SpEL上下文数据
<a href="#menu" >目录</a>


Spring Cache提供了一些供我们使用的SpEL上下文数据，下表直接摘自Spring官方文档：

|名称|	位置|	描述	|示例|
|---|---|---|---|
|methodName|	root对象|	当前被调用的方法名|	#root.methodname
|method|	root对象|	当前被调用的方法|	#root.method.name
|target	|root对象	|当前被调用的目标对象实例	|#root.target
|targetClass|	root对象|	当前被调用的目标对象的类	|#root.targetClass
|args	|root对象|	当前被调用的方法的参数列表|	#root.args[0]
|caches|	root对象	|当前方法调用使用的缓存列表	|#root.caches[0].name
|Argument Name|	执行上下文	|当前被调用的方法的参数，如findArtisan(Artisan artisan),可以通过#artsian.id获得参数|	#artsian.id
|result|	执行上下文|	方法执行后的返回值（仅当方法执行后的判断有效，如 unless cacheEvict的beforeInvocation=false）|	#result


注意：
1. 当我们要使用root对象的属性作为key时我们也可以将“#root"省略，因为Spring默认使用的就是root对象的属性。 如
@Cacheable(key = "targetClass + methodName +#p0")

2. 使用方法参数时我们可以直接使用“#参数名"或者“#p参数index"。 如：
@Cacheable(value="users", key="#id")
@Cacheable(value="users", key="#p0")

SpEL提供了多种运算符

|类型|	运算符|
|---|---|
|关系	|<，>，<=，>=，==，!=，lt，gt，le，ge，eq，ne
|算术	|+，- ，* ，/，%，^
|逻辑	|&&，||，!，and，or，not，between，instanceof
|条件	|?: (ternary)，?: (elvis)
|正则表达式	|matches
|其他类型	|?.，?[…]，![…]，^[…]，$[…]

## 3.6. 基本使用

**引入依赖**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```
* 启动类添加@EnableCaching 注解

**缓存@Cacheable**
@Cacheable注解会先查询是否已经有缓存，有会使用缓存，没有则会执行方法并缓存。

* 注解说明
```java
String[] value() default {}; 
String key() default ""; //缓存键
String[] cacheNames() default {}; //缓存名称和value注解差不多，二选一
String keyGenerator() default ""; //key的生成器。key/keyGenerator二选一使用
String cacheManager() default ""; //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则缓存
String unless() default ""; //条件符合则不缓存
boolean sync() default false; //是否使用异步模式
```
* 例子
```java
@Cacheable(value = "emp" ,key = "targetClass + methodName +#p0")
public List<NewJob> queryAll(User uid) {
    return newJobDao.findAllByUid(uid);
}
```
此处的value是必需的，它指定了你的缓存存放在哪块命名空间。
此处的key是使用的spEL表达式，参考上章。这里有一个小坑，如果你把methodName换成method运行会报错，观察它们的返回类型，原因在于methodName是String而methoh是Method。
此处的User实体类一定要实现序列化public class User implements Serializable，否则会报java.io.NotSerializableException异常。
到这里，你已经可以运行程序检验缓存功能是否实现。



**配置@CacheConfig**
当我们需要缓存的地方越来越多，你可以使用@CacheConfig(cacheNames = {"myCache"})注解来统一指定value的值，这时可省略value，如果你在你的方法依旧写上了value，那么依然以方法的value值为准。

使用方法如下：
```java
@CacheConfig(cacheNames = {"myCache"})
public class BotRelationServiceImpl implements BotRelationService {
    @Override
    @Cacheable(key = "targetClass + methodName +#p0")//此处没写value
    //@Cacheable(key = "targetClass + methodName +#num")//
    //@Cacheable(key = "targetClass + methodName +#user.id")/
    public List<BotRelation> findAllLimit(int num) {
        return botRelationRepository.findAllLimit(num);
    }
    
}
```
查看它的其它属性
```java
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
```

**更新@CachePut**
@CachePut注解的作用 主要针对方法配置，能够根据方法的请求参数对其结果进行缓存，和 @Cacheable 不同的是，它每次都会触发真实方法的调用 。简单来说就是用户更新缓存数据。但需要注意的是该注解的value 和 key 必须与要更新的缓存相同，也就是与@Cacheable 相同。示例：

```java
//每次都會調用方法,並將結果進行緩存
@CachePut(value = "emp", key = "targetClass + #p0")
public NewJob updata(NewJob job) {
    NewJob newJob = newJobDao.findAllById(job.getId());
    newJob.updata(job);
    return job;
}

@Cacheable(value = "emp", key = "targetClass +#p0")//清空缓存
public NewJob save(NewJob job) {
    newJobDao.save(job);
    return job;
}
```
查看它的其它属性
```java
String[] cacheNames() default {}; //与value二选一
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则缓存
String unless() default ""; //条件符合则不缓存
```

**清除@CacheEvict**
@CachEvict 的作用 主要针对方法配置，能够根据一定的条件对缓存进行清空 。

* allEntries	
    * 是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存	
    * @CachEvict(value="testcache",allEntries=true)
* beforeInvocation	
    * 是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存	
    * @CachEvict(value="testcache"，beforeInvocation=true)
示例：
```java
@Cacheable(value = "emp",key = "#p0.id")
public NewJob save(NewJob job) {
    newJobDao.save(job);
    return job;
}

//清除一条缓存，key为要清空的数据
@CacheEvict(value="emp",key="#id")
public void delect(int id) {
    newJobDao.deleteAllById(id);
}

//方法调用后清空所有缓存
@CacheEvict(value="accountCache",allEntries=true)
public void delectAll() {
    newJobDao.deleteAll();
}

//方法调用前清空所有缓存
@CacheEvict(value="accountCache",beforeInvocation=true)
public void delectAll() {
    newJobDao.deleteAll();
}
```
其他属性
```java
String[] cacheNames() default {}; //与value二选一
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则清空
```

**组合@Caching**
有时候我们可能组合多个Cache注解使用，此时就需要@Caching组合多个注解标签了。

```java
@Caching(cacheable = {
        @Cacheable(value = "emp",key = "#p0"),
        ...
},
put = {
        @CachePut(value = "emp",key = "#p0"),
        ...
},evict = {
        @CacheEvict(value = "emp",key = "#p0"),
        ....
})
public User save(User user) {
    ....
}
```

## 3.7. 使用Redis Cache
<a href="#menu" >目录</a>


## 3.8. 实现Redis二级缓存
<a href="#menu" >目录</a>

### 3.8.1. 实现 TwolevelCacheManager




# 4. Spring Boot Admin
<a href="#menu" >目录</a>

## 4.1. 基础认识
<a href="#menu" >目录</a>


Spring Boot Admin是一个开源社区项目，用于管理和监控SpringBoot应用程序。 应用程序作为Spring Boot Admin Client向为Spring Boot Admin Server注册（通过HTTP）或使用SpringCloud注册中心（例如Eureka，Consul）发现。 UI是的AngularJs应用程序，展示Spring Boot Admin Client的Actuator端点上的一些监控。常见的功能或者监控如下：

* 显示健康状况
* 显示详细信息，例如
    * JVM和内存指标
    * micrometer.io指标
    * 数据源指标
    * 缓存指标
* 显示构建信息编号
* 关注并下载日志文件
* 查看jvm系统和环境属性
* 查看Spring Boot配置属性
* 支持Spring Cloud的postable / env-和/ refresh-endpoint
* 轻松的日志级管理
* 与JMX-beans交互
* 查看线程转储
* 查看http跟踪
* 查看auditevents
* 查看http-endpoints
* 查看计划任务
* 查看和删除活动会话（使用spring-session）
* 查看Flyway / Liquibase数据库迁移
* 下载heapdump
* 状态变更通知（通过电子邮件，Slack，Hipchat，......）
* 状态更改的事件日志（非持久性）

## 4.2. 使用实例

### 4.2.1. Server应用
<a href="#menu" >目录</a>

引入依赖
```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-server</artifactId>
    <version>2.0.2</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
启动类添加注解@EnableAdminServer
```java
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
```
application.yml配置
```yml
server:
  port: 8122
spring:
  application:
    name: admin-server


```
### 4.2.2. Client应用
<a href="#menu" >目录</a>

引入依赖
```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-client</artifactId>
    <version>2.0.2</version>
</dependency>
```
application.yml配置
```yml
server:
  port: 8123
spring:
  application:
    name: admin-client
  boot:
    admin:
      client:
      #admin-server的地址
        url: http://localhost:8122
management:
  endpoints:
    web:
      exposure:
        include: "*" 
```
启动两个应用
访问地址: http://localhost:8122

首页可以查看应用列表和状态
![admin首页](pic/spring/springadmin/admin-mainpage.png)

可以点击应用查看监控数据
![admin应用监控页面](pic/spring/springadmin/admin-app.png)

### 4.2.3. Client配置说明


**ClientProperties**

```java
package de.codecentric.boot.admin.client.config;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;

@ConfigurationProperties(
    prefix = "spring.boot.admin.client"
)
public class ClientProperties {
    /**
    要注册的server端的url地址。如果要同时在多个server端口注册，则用逗号分隔各个server端的url地址；
    */
    private String[] url = new String[0];
    /**
    默认值是instances。server端获取client信息的路径，默认情况下server通过访问/instances请求来获取到client端的信息。（client端向server端注册，注册成功后server端会给该client创建一个唯一的clientID值。当server端需要获取client的信息，比如health信息时，server端会发送http://111.11.11.1:8080/instances/clientID/actuator/health即可，这里的http://111.11.11.1:8080是client所在服务器的IP地址，instances就是该属性的值）
    */
    private String apiPath = "instances";
    /**
    注册时间间隔，单位是毫秒；默认值是10秒钟注册一次。（client通过持续不断地向server端进行注册来保持client端与server端的连接）
    */
    @DurationUnit(ChronoUnit.MILLIS)
    private Duration period = Duration.ofMillis(10000L);
    /**
    注册连接超时时间，单位是毫秒，默认值是5秒。当client向server进行注册时，如果5秒钟没有注册完成则认为本次注册失败；
    */
    @DurationUnit(ChronoUnit.MILLIS)
    private Duration connectTimeout = Duration.ofMillis(5000L);
    /**
    注册读取超时，单位是毫秒，默认值是5秒；
    */
    @DurationUnit(ChronoUnit.MILLIS)
    private Duration readTimeout = Duration.ofMillis(5000L);
    /**
    如果server端需要进行认证时，该属性用于配置用户名。
    */
    @Nullable
    private String username;
    /**
    如果server端需要进行认证时，该属性用于配置密码。
    */
    @Nullable
    private String password;
   /**
    是否开启自动注销，默认值是null。如果服务端运行在云平台，默认值是true；
    */
    @Nullable
    private Boolean autoDeregistration = null;
    /**
    是否开启自动注册，默认值是true。
    */
    private boolean autoRegistration = true;
    /**
    默认值为true。如果值为true的话，client只会在一个server端进行注册（按照spring.boot.admin.client.url中设置的server的顺序）。如果该server端宕机，会自动在下一个server端进行注册。如果该属性值为false，则会在所有的server端进行注册；
    */
    private boolean registerOnce = true;
    //使能admin client
    private boolean enabled = true;
    private final Environment environment;
}
```
**InstanceProperties**

```java
package de.codecentric.boot.admin.client.config;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
    prefix = "spring.boot.admin.client.instance"
)
public class InstanceProperties {
    /**
    注册的management-url，如果可用的url不同的话可以重写该值。如果不配置该属性的话，默认该属性值与management-base-url 和 management.context-path两个属性值有关。比如工程中该值为：managementUrl=http://192.168.200.165:8080/actuator，其中http://192.168.200.165:8080为management-base-url，/actuator是management.context-path（该属性值是spring actuator的属性值）；

    */
    @Nullable
    private String managementUrl;
    /**
    用于计算management-url 的基本URL。该路径值在运行时进行获取并赋值给 base url。如果不配置该属性值的话，默认该属性值与management.port, service-url 以及server.servlet-path有关。比如工程中该值为http://192.168.200.165:8080，其中8080端口是配置的获取actuator信息的端口。192.168.200.165是设置的service-url值，如果没有设置service-url的话，则为配置的server.servlet-path值（项目的启动路径）。
    */
    @Nullable
    private String managementBaseUrl;
    /**
    注册的service-url值。如果不配置该属性值的话，基于 service-base-url 和 server.context-path进行赋值。比如工程中为http://p-v-9:8080/,其中p-v-9是base-url，/是工程配置的 server.context-path值。（这里要注意的是，当server端与client端不在同一台服务器上的时候，要配置该属性的值。如果不配置的话，server端就会根据默认的命名规则来配置该值，比如http://p-v-9:8080/，如果server使用这个值来获取client的各种性能信息的话是获取不到的）；
    */
    @Nullable
    private String serviceUrl;
    /**
    用于计算service-url 的基本URL。该路径值在运行时进行获取并赋值给 base url。如果不配置该属性值的话，默认该属性值与hostname, server.port有关。比如工程中该值为http://p-v-9:8080，其中8080端口是配置的server.port。p-v-9是client所在服务器的hostname。
    */
    @Nullable
    private String serviceBaseUrl;
    /**
    注册的health-url地址，如果可用的url不同可以重写该值。如果不配置该属性的话，默认该属性值与management-url 以及endpoints.health.id有关。比如工程中该值为：healthUrl=http://192.168.200.165:8080/actuator/health，其中http://192.168.200.165:8080/actuator是management-url，health是endpoints.health.id。
    */
    @Nullable
    private String healthUrl;
    /**
    客户端工程的名字。默认值是配置的spring.application.name的值，如果没有配置该属性的话，默认值是spring-boot-application；
    */
    @Value("${spring.application.name:spring-boot-application}")
    private String name = "spring-boot-application";
    /**
    是否使用注册的ip地址来取代上述各个url中hostname的值，默认值是false（也就是说默认情况下上述各个url中会使用hostname的值，比如我的电脑的hostname为p-v-9）。如果设置了server.address或者management.address的话ip地址就是该值，如果没有设置这两个属性的话ip地址值是InetAddress.getLocalHost()的值。

    */
    private boolean preferIp = false;
    /**
    与该应用有关的元数据，以键值对的形式赋值。
    */
    private Map<String, String> metadata = new LinkedHashMap();
}
```

**AdminServerProperties**

```java
package de.codecentric.boot.admin.server.config;

import de.codecentric.boot.admin.server.web.PathUtils;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;

@ConfigurationProperties("spring.boot.admin")
public class AdminServerProperties {

    server端的访问路径，默认是/。默认情况下server的访问地址是http://**.**.**.**:**/,这里**.**.**.**:**是server所在服务器的ip地址。我们的工程设置该值是springbootAdmin，那么工程的server端访问地址是http://111.11.11.1:8000/springbootAdmin;
    private String contextPath = "";

    /**
    spring.boot.admin.monitor.period:更新client端状态的时间间隔，单位是毫秒，默认值是10秒钟；
    spring.boot.admin.monitor.status-lifetime：client端状态的生命周期，该生命周期内不会更新client状态。单位是毫秒，默认值是10秒钟；spring.boot.admin.monitor.connect-timeout：查询client状态信息时的连接超时时间，单位是毫秒，默认是2秒（如果2秒内没有获取到client的状态信息，则认为连接已经断开）
    spring.boot.admin.monitor.read-timeout：查询client状态信息时的读取超时时间，单位是毫秒，默认是2秒（如果2秒内没有获取到client的状态信息，则认为读取失败）。
    */
    private AdminServerProperties.MonitorProperties monitor = new AdminServerProperties.MonitorProperties();
    /*
    向client发起请求时不会被转发的headers信息，默认值是"Cookie", "Set-Cookie", "Authorization"；
    */
    private AdminServerProperties.InstanceProxyProperties instanceProxy = new AdminServerProperties.InstanceProxyProperties();
    /*
    要被过滤掉的元数据（当与正则表达式相匹配时，这些数据会在输出的json数据中过滤掉），默认值是".password$", ".*secret$", ".*key$", ".$token$", ".credentials.", ".*vcap_services$"；
    */
    private String[] metadataKeysToSanitize = new String[]{".*password$", ".*secret$", ".*key$", ".*$token$", ".*credentials.*", ".*vcap_services$"};
    /*
    要获取的client的端点信息
    */
    private String[] probedEndpoints = new String[]{"health", "env", "metrics", "httptrace:trace", "httptrace", "threaddump:dump", "threaddump", "jolokia", "info", "logfile", "refresh", "flyway", "liquibase", "heapdump", "loggers", "auditevents", "mappings", "scheduledtasks", "configprops", "caches", "beans"};

}
```

### 4.2.4. 集群
<a href="#menu" >目录</a>

Spring Boot Admin支持集群
```xml
<dependency>
    <groupId>com.hazelcast</groupId>
    <artifactId>hazelcast</artifactId>
</dependency>

```
创建配置类
```java
@Bean
public Config hazelcastConfig() {
    MapConfig mapConfig = new MapConfig("spring-boot-admin-event-store").setInMemoryFormat(InMemoryFormat.OBJECT)
                                                                        .setBackupCount(1)
                                                                        .setEvictionPolicy(EvictionPolicy.NONE);
    return new Config().setProperty("hazelcast.jmx", "true").addMapConfig(mapConfig);
}
```

### 4.2.5. 集成spring security
<a href="#menu" >目录</a>


admin-server 引入依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```
配置类
```java
@Configuration
public static class SecuritySecureConfig extends WebSecurityConfigurerAdapter {
    private final String adminContextPath;

    public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
        this.adminContextPath = adminServerProperties.getContextPath();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        successHandler.setDefaultTargetUrl(adminContextPath + "/");

        http.authorizeRequests()
        //Grants public access to all static assets and the login page.
            .antMatchers(adminContextPath + "/assets/**").permitAll() 
            .antMatchers(adminContextPath + "/login").permitAll()
            //Every other request must be authenticated.
            .anyRequest().authenticated() 
            .and()
        .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and() 
        //Configures login and logout.
        .logout().logoutUrl(adminContextPath + "/logout").and()
        //Enables HTTP-Basic support. This is needed for the Spring Boot Admin Client to register.
        .httpBasic().and() 
        .csrf()
        //Enables CSRF-Protection using Cookies
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())  
            .ignoringAntMatchers(
                //Disables CRSF-Protection the endpoint the Spring Boot Admin Client uses to register.
                "/instances", 
                //Disables CRSF-Protection for the actuator endpoints.  
                "/actuator/**"  
            );
        // @formatter:on
    }
}
```
### 4.2.6. 集成邮箱报警功能
<a href="#menu" >目录</a>


在spring boot admin中，也可以集成邮箱报警功能，比如服务不健康了、下线了，都可以给指定邮箱发送邮件。集成非常简单，只需要改造下admin-server即可：

在admin-server工程Pom文件，加上mail的起步依赖，代码如下：
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
```

在配置文件application.yml文件中，需要配置邮件相关的配置，如下：
```yml
spring.mail.host: smtp.163.com
spring.mail.username: xxx
spring.mail.password:
spring.boot.admin.notify.mail.to: xxx@qq.com
```
做完以上配置后，当我们已注册的客户端的状态从 UP 变为 OFFLINE 或其他状态，服务端就会自动将电子邮件发送到上面配置的地址。





# 5. Spring Security
<a href="#menu" >目录</a>

## 5.1. 简介
<a href="#menu" >目录</a>

一个能够为基于Spring的企业应用系统提供声明式的安全訪问控制解决方式的安全框架（简单说是对访问权限进行控制嘛），应用的安全性包括用户认证（Authentication）和用户授权（Authorization）两个部分。用户认证指的是验证某个用户是否为系统中的合法主体，也就是说用户能否访问该系统。用户认证一般要求用户提供用户名和密码。系统通过校验用户名和密码来完成认证过程。用户授权指的是验证某个用户是否有权限执行某个操作。在一个系统中，不同用户所具有的权限是不同的。比如对一个文件来说，有的用户只能进行读取，而有的用户可以进行修改。一般来说，系统会为不同的用户分配不同的角色，而每个角色则对应一系列的权限。   spring security的主要核心功能为 认证和授权，所有的架构也是基于这两个核心功能去实现的。

## 5.2. 提供的功能
<a href="#menu" >目录</a>

* 支持不同的身份验证方法,比如经典的基于登录表单的身份认证,使用X509用户证书的身份验证,LDAP身份验证.可以在同一个应用中应用多种不同的身份验证方法.
* 身份验证方法以及对用户信息库的访问彼此之间完全独立.
* 与多种不同的SSO单点登录解决方案完美集成,比如CAS,OpenID,Siteminder和Oauth.可以将身份认证完全委托给这些SSO系统来完成,而SpringSecurity只处理授权部分
* 提供了匿名身份认证或来宾身份登录.也就是说,一个有效的身份验证令牌可以在安全性上下文中使用,并且安全方法的配置看起来也更加一致
* 提供类内置记住我功能
* 支持用户信息库中保存经过加密的密码
* 通过更改登录过程中锁使用的HTTP会话,提供了对会话固定攻击的内置保护,此外,还跟踪登录用户的会话,并提供了并发用户会话管理 ,以便限制来自不同位置的用户的最大并发访问数量
* 可以分别对URL资源,服务方法调用和于对象进行控制访问,还可以在运行时临时向已登录用户添加角色,以便用户可以访问那些需要额外角色才可以访问的受限制区域.


## 5.3. 核心类
<a href="#menu" >目录</a>

想要对对Web资源进行保护，最好的办法莫过于Filter，要想对方法调用进行保护，最好的办法莫过于AOP。所以springSecurity在我们进行用户认证以及授予权限的时候，通过各种各样的拦截器来控制权限的访问，从而实现安全。

* 如下为其主要过滤器  
    * WebAsyncManagerIntegrationFilter 
    * SecurityContextPersistenceFilter 
    * HeaderWriterFilter 
    * CorsFilter 
    * LogoutFilter
    * RequestCacheAwareFilter
    * SecurityContextHolderAwareRequestFilter
    * AnonymousAuthenticationFilter
    * SessionManagementFilter
    * ExceptionTranslationFilter
    * FilterSecurityInterceptor
    * UsernamePasswordAuthenticationFilter
    * BasicAuthenticationFilter
* 框架的核心组件
    * SecurityContextHolder：提供对SecurityContext的访问
    * SecurityContext,：持有Authentication对象和其他可能需要的信息
    * AuthenticationManager 其中可以包含多个AuthenticationProvider
    * ProviderManager对象为AuthenticationManager接口的实现类
    * AuthenticationProvider 主要用来进行认证操作的类 调用其中的authenticate()方法去进行认证操作
    * Authentication：Spring Security方式的认证主体
    * GrantedAuthority：对认证主题的应用层面的授权，含当前用户的权限信息，通常使用角色表示
    * UserDetails：构建Authentication对象必须的信息，可以自定义，可能需要访问DB得到
    * UserDetailsService：通过username构建UserDetails对象，通过loadUserByUsername根据userName获取UserDetail对象 （可以在这里基于自身业务进行自定义的实现  如通过数据库，xml,缓存获取等）           

## 5.4. CSRF防护
<a href="#menu" >目录</a>

### 5.4.1. 跨域攻击说明
<a href="#menu" >目录</a>

CSRF全称为跨站请求伪造（Cross-site request forgery），是一种网络攻击方式，也被称为 one-click attack 或者 session riding。


CSRF攻击利用网站对于用户网页浏览器的信任，挟持用户当前已登陆的Web应用程序，去执行并非用户本意的操作。

**CSRF攻击实例**
角色：
* 正常浏览网页的用户：User
* 正规的但是具有漏洞的网站：WebA
* 利用CSRF进行攻击的网站：WebB

* 步骤一:用户登录、浏览并信任正规网站WebA，同时，WebA通过用户的验证并在用户的浏览器中产生Cookie。
* 步骤二：攻击者WebB通过在WebA中添加图片链接等方式诱导用户User访问网站WebB。
* 步骤三:在用户User被诱导访问WebB后，WebB会利用用户User的浏览器访问第三方网站WebA，并发出操作请求。
* 步骤四:用户User的浏览器根据WebB的要求，带着步骤一中产生的Cookie访问WebA。
* 步骤五: 网站WebA接收到用户浏览器的请求，WebA无法分辨请求由何处发出，由于浏览器访问时带上用户的Cookie，因此WebA会响应浏览器的请求，如此一来，攻击网站WebB就达到了模拟用户操作的目的。

**CSRF攻击防护**

上文简单的叙述了CSRF攻击的原理，接下来将要介绍几种CSRF攻击的防护方法。

1. 只使用JSON API

使用JavaScript发起AJAX请求是限制跨域的，并不能通过简单的 表单来发送JSON，所以，通过只接收JSON可以很大可能避免CSRF攻击。

2. 验证HTTP Referer字段

根据 HTTP 协议，在 HTTP 头中有一个字段叫 Referer，它记录了该 HTTP 请求的来源地址。在通常情况下，访问一个安全受限页面的请求来自于同一个网站，比如上文中用户User想要在网站WebA中进行转账操作，那么用户User

必须先登录WebA,然后再通过点击页面上的按钮出发转账事件

这时该转帐请求的 Referer 值就会是转账按钮所在的页面的URL，而如果黑客要对银行网站实施 CSRF攻击，他只能在他自己的网站构造请求，当用户User通过黑客的网站发送请求到WebA时，该请求的 Referer 是指向黑客自己的网站。
因此，要防御 CSRF 攻击，网站WebA只需要对于每一个转账请求验证其 Referer 值，如果是以网站WebA的网址开头的域名，则说明该请求是来自WebA自己的请求，是合法的。如果 Referer 是其他网站的话，则有可能是黑客的 CSRF 攻击，拒绝该请求。

3. 在请求地址中添加token验证

CSRF 攻击之所以能够成功，是因为黑客可以完全伪造用户的请求，该请求中所有的用户验证信息都是存在于 cookie 中，因此黑客可以在不知道这些验证信息的情况下直接利用用户自己的 cookie 来通过安全验证。要抵御 CSRF，关键在于在请求中放入黑客所不能伪造的信息，并且该信息不存在于 cookie 之中。可以在 HTTP 请求中以参数的形式加入一个随机产生的 token，并在服务器端建立一个拦截器来验证这个 token，如果请求中没有 token 或者 token 内容不正确，则认为可能是 CSRF 攻击而拒绝该请求。
这种方法要比检查 Referer 要安全一些，token 可以在用户登陆后产生并放于 session 之中，然后在每次请求时把 token 从 session 中拿出，与请求中的 token 进行比对。



### 5.4.2. SpringBoot配置
<a href="#menu" >目录</a>

```java

@EnableWebSecurity
@Component
public class MyWebSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置管理cookie的管理器仓库,用于生成　cookie
        /*如果cookie中设置了HttpOnly属性，那么通过js脚本将无法读取到cookie信息，这样能有效的防止XSS攻击，窃取cookie内容，这样就增加了cookie的安全性，即便是这样，也不要将重要信息存入cookieXSS全称Cross SiteScript，跨站脚本攻击，是Web程序中常见的漏洞，XSS属于被动式且用于客户端的攻击方式，所以容易被忽略其危害性。其原理是攻击者向有XSS漏洞的网站中输入(传入)恶意的HTML代码，当其它用户浏览该网站时，这段HTML代码会自动执行，从而达到攻击的目的。如，盗取用户Cookie、破坏页面结构、重定向到其它网站等。
        */

        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        .and()
        .authorizeRequests()
        .anyRequest().permitAll();


    }


}
```

### 5.4.3. 源码分析

```java


public final class CookieCsrfTokenRepository implements CsrfTokenRepository {
    static final String DEFAULT_CSRF_COOKIE_NAME = "XSRF-TOKEN";
    static final String DEFAULT_CSRF_PARAMETER_NAME = "_csrf";
    static final String DEFAULT_CSRF_HEADER_NAME = "X-XSRF-TOKEN";
    private String parameterName = "_csrf";
    private String headerName = "X-XSRF-TOKEN";
    private String cookieName = "XSRF-TOKEN";
    private boolean cookieHttpOnly = true;
    private String cookiePath;
    private String cookieDomain;

    public CookieCsrfTokenRepository() {
    }

    public CsrfToken generateToken(HttpServletRequest request) {
        //使用uuid创建CsrfToken
        return new DefaultCsrfToken(this.headerName, this.parameterName, this.createNewToken());
    }

    public void saveToken(CsrfToken token, HttpServletRequest request, HttpServletResponse response) {
        String tokenValue = token == null ? "" : token.getToken();
        Cookie cookie = new Cookie(this.cookieName, tokenValue);
        cookie.setSecure(request.isSecure());
        if (this.cookiePath != null && !this.cookiePath.isEmpty()) {
            cookie.setPath(this.cookiePath);
        } else {
            cookie.setPath(this.getRequestContext(request));
        }

        if (token == null) {
            cookie.setMaxAge(0);
        } else {
            cookie.setMaxAge(-1);
        }

        cookie.setHttpOnly(this.cookieHttpOnly);
        if (this.cookieDomain != null && !this.cookieDomain.isEmpty()) {
            cookie.setDomain(this.cookieDomain);
        }

        response.addCookie(cookie);
    }

    public CsrfToken loadToken(HttpServletRequest request) {
        Cookie cookie = WebUtils.getCookie(request, this.cookieName);
        if (cookie == null) {
            return null;
        } else {
            String token = cookie.getValue();
            return !StringUtils.hasLength(token) ? null : new DefaultCsrfToken(this.headerName, this.parameterName, token);
        }
    }
｝

public final class CsrfFilter extends OncePerRequestFilter {
     protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        request.setAttribute(HttpServletResponse.class.getName(), response);
        //从request  cookie中获取key为　XSRF-TOKEN　的cookie
        CsrfToken csrfToken = this.tokenRepository.loadToken(request);
        boolean missingToken = csrfToken == null;
        if (missingToken) {
            //不存在则创建一个
            csrfToken = this.tokenRepository.generateToken(request);
            //向response中添加上面创建的cookie
            this.tokenRepository.saveToken(csrfToken, request, response);
        }

        request.setAttribute(CsrfToken.class.getName(), csrfToken);
        request.setAttribute(csrfToken.getParameterName(), csrfToken);
        //可以看下面的DefaultRequiresCsrfMatcher，主要是判断当前请求的方法需不需要验证
        //"GET", "HEAD", "TRACE", "OPTIONS"都不要校验
        if (!this.requireCsrfProtectionMatcher.matches(request)) {
            filterChain.doFilter(request, response);
        } else {
            //从header里获取token
            String actualToken = request.getHeader(csrfToken.getHeaderName());
            if (actualToken == null) {
                actualToken = request.getParameter(csrfToken.getParameterName());
            }
            //header里获取token的和cookie的token比较
            if (!csrfToken.getToken().equals(actualToken)) {
                 //如果不相等
                if (this.logger.isDebugEnabled()) {
                    this.logger.debug("Invalid CSRF token found for " + UrlUtils.buildFullRequestUrl(request));
                }
               //cookie中不存在XSRF-TOKEN 的cookie说明第一次请求
               //设置403错误
                if (missingToken) {
                    this.accessDeniedHandler.handle(request, response, new MissingCsrfTokenException(actualToken));
                } else {
                    //cookie中存在XSRF-TOKEN 但是不相等
                    //1.说明header中不存在X-XSRF-TOKEN　的token 或者真的不一样                
                    this.accessDeniedHandler.handle(request, response, new InvalidCsrfTokenException(csrfToken, actualToken));
                }

            } else {
                //如果相等，按正常流程执行
                filterChain.doFilter(request, response);
            }
        }
    }

     private static final class DefaultRequiresCsrfMatcher implements RequestMatcher {
        private final HashSet<String> allowedMethods;

        private DefaultRequiresCsrfMatcher() {
            this.allowedMethods = new HashSet(Arrays.asList("GET", "HEAD", "TRACE", "OPTIONS"));
        }
        //判断当前请求的方法需不需要验证
        public boolean matches(HttpServletRequest request) {
            return !this.allowedMethods.contains(request.getMethod());
        }
    }

}

public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    protected static final Log logger = LogFactory.getLog(AccessDeniedHandlerImpl.class);
    private String errorPage;

    public AccessDeniedHandlerImpl() {
    }

    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        if (!response.isCommitted()) {
            if (this.errorPage != null) {
                //设置403错误
                request.setAttribute("SPRING_SECURITY_403_EXCEPTION", accessDeniedException);
                response.setStatus(HttpStatus.FORBIDDEN.value());
                RequestDispatcher dispatcher = request.getRequestDispatcher(this.errorPage);
                //
                dispatcher.forward(request, response);
            } else {
                response.sendError(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase());
            }
        }

    }
}



```

从上面可看，其实现csrf原理为:

* 当客户端第一次请求的时候，web过滤器CsrfFilter中会创建一个uuid并放在cookie中，键为XSRF-TOKEN，以后每次请求都会带上这个cookie。之后返回403(FORBIDDEN(403, "Forbidden"))错误。客户端需要读取这个cookie并设置到下一个请求的header，键为X-XSRF-TOKEN。
* 当客户端发起后续请求时，会比较cookie(XSRF-TOKEN)和header(X-XSRF-TOKEN)是否相等，相等则正常执行，不想等则返回403.

对于"GET", "HEAD", "TRACE", "OPTIONS"不需要校验.　如果前端是VUE,会自动设置X-XSRF-TOKEN。其他可能需要手动设置。

当浏览器禁用cookie之后，上面将会校验错误返回403.


# 6. Sppring MVC
<a href="#menu" >目录</a>

## 6.1. MVC体系概述
<a href="#menu" >目录</a>

Spring MVC是一个基于Java的实现了MVC设计模式的请求驱动类型的轻量级Web框架，通过把Model，View，Controller分离，将web层进行职责解耦，把复杂的web应用分成逻辑清晰的几部分，简化开发，减少出错，方便组内开发人员之间的配合。

### 6.1.1. MVC 架构
* 模型：包含了应用中所需的各种展现数据
* 视图：由数据的多种表述所组成，它将会展现给用户。
* 控制器：将会处理用户的操作，它是连接模型和视图的桥梁

![](http://dl.iteye.com/upload/attachment/0068/8752/620f63e1-ee68-30c9-a53d-13107e634364.png)


![Spring mvc 框架模型]()


* 客户端发出Http请求，Web应用服务器接收请求，如果匹配DispatcherServlet的请求路径(web.xml指定)，则web容器将该请求转交给DispatcherServlet处理
* DispatcherServlet接收请求后，将根据请求的信息(URL,HTTP方法，请求报文头，请求参数，Cookie)及HandlerMapping的配置找到处理请求的处理器(Handler).可将HandlerMapping看作路由控制器，将Handler看作目标主机。
* DispatcherServlet得到对应的Handler后，通过 HandlerAdapter对Handler进行封装，再以统一的适配器接口调用Handler. HandlerAdapter是Spring MVC的框架级接口， HandlerAdapter是一个适配器，它用统一的接口对各种Handler方法进行调用。
* 处理器完成业务逻辑后将返回一个ModelAndView给DispatcherServlet,ModelAndView包含了视图逻辑名和模型数据信息。
* ModelAndView中包含的是"逻辑视图名"而非真正的视图对象 ，DispatcherServlet借由ViewResolver完成逻辑视图名得到真实视图对象的解析工作
* 当得到真实的视图对象View后，DispatcherServlet就使用这个View对象对DispatcherServlet中的模型数据进行视图渲染
* 最终客户端得到的响应消息可能是一个普通的HTML页面，也可能是一个XML或JSON串，甚至一张图片或一个PDF文档等不同的媒体形式

![DispatcherServlet]()
DispatcherServlet.class
```java
protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
    this.logRequest(request);
    Map<String, Object> attributesSnapshot = null;
    if (WebUtils.isIncludeRequest(request)) {
        attributesSnapshot = new HashMap();
        Enumeration attrNames = request.getAttributeNames();

        label95:
        while(true) {
            String attrName;
            do {
                if (!attrNames.hasMoreElements()) {
                    break label95;
                }

                attrName = (String)attrNames.nextElement();
            } while(!this.cleanupAfterInclude && !attrName.startsWith("org.springframework.web.servlet"));

            attributesSnapshot.put(attrName, request.getAttribute(attrName));
        }
    }

    request.setAttribute(WEB_APPLICATION_CONTEXT_ATTRIBUTE, this.getWebApplicationContext());
    request.setAttribute(LOCALE_RESOLVER_ATTRIBUTE, this.localeResolver);
    request.setAttribute(THEME_RESOLVER_ATTRIBUTE, this.themeResolver);
    request.setAttribute(THEME_SOURCE_ATTRIBUTE, this.getThemeSource());
    if (this.flashMapManager != null) {
        FlashMap inputFlashMap = this.flashMapManager.retrieveAndUpdate(request, response);
        if (inputFlashMap != null) {
            request.setAttribute(INPUT_FLASH_MAP_ATTRIBUTE, Collections.unmodifiableMap(inputFlashMap));
        }

        request.setAttribute(OUTPUT_FLASH_MAP_ATTRIBUTE, new FlashMap());
        request.setAttribute(FLASH_MAP_MANAGER_ATTRIBUTE, this.flashMapManager);
    }

    try {
        //处理请求
        this.doDispatch(request, response);
    } finally {
        if (!WebAsyncUtils.getAsyncManager(request).isConcurrentHandlingStarted() && attributesSnapshot != null) {
            this.restoreAttributesAfterInclude(request, attributesSnapshot);
        }

    }

}
```
DispatcherServlet.class
```java
protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
    //processedRequest是经过checkMultipart方法处理过的request请求
　　 HttpServletRequest processedRequest = request;　　
    HandlerExecutionChain mappedHandler = null;
    boolean multipartRequestParsed = false;

    WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);

    try {
        ModelAndView mv = null;
        Exception dispatchException = null;

        try {
　　　　　　　　　　//1、文件上传解析，如果请求类型是multipart将通过MultipartResolver进行文件上传解析；  
            processedRequest = checkMultipart(request);
            multipartRequestParsed = (processedRequest != request);

　　　　　　　//2.通过HandlerMapping，将请求映射到处理器（返回一个HandlerExecutionChain，它包括一个处理器、多个HandlerInterceptor拦截器）；
            // Determine handler for the current request.　　　确定当前请求的处理程序。
            mappedHandler = getHandler(processedRequest);　　　　　　//解析第一个方法
            if (mappedHandler == null || mappedHandler.getHandler() == null) {
                noHandlerFound(processedRequest, response);
                return;
            }
　　　　　　　//3、通过HandlerAdapter支持多种类型的处理器(HandlerExecutionChain中的处理器)；  
            // Determine handler adapter for the current request.　　确定当前请求的处理程序适配器。
            HandlerAdapter ha = getHandlerAdapter(mappedHandler.getHandler());　　　　//解析第二个方法

            // Process last-modified header, if supported by the handler.　　如果处理程序支持，则处理最后修改的头文件。
            String method = request.getMethod();　　　　//得到当前的http方法。  
            boolean isGet = "GET".equals(method);
            if (isGet || "HEAD".equals(method)) {　　　　//处理http的head方法。这种方法应该很少用  
                long lastModified = ha.getLastModified(request, mappedHandler.getHandler());
                if (logger.isDebugEnabled()) {
                    logger.debug("Last-Modified value for [" + getRequestUri(request) + "] is: " + lastModified);
                }
                if (new ServletWebRequest(request, response).checkNotModified(lastModified) && isGet) {
                    return;
                }
            }
　　　　　　　　　　//4.1调用HandlerExecutionChain的interceptor  
            if (!mappedHandler.applyPreHandle(processedRequest, response)) {
                return;
            }
　　　　　　　//4.2执行解析handler中的args，调用（invoke） controller的方法。得到视图  
            // Actually invoke the handler.　　实际上调用处理程序。
            //解析第三个方法
            mv = ha.handle(processedRequest, response, mappedHandler.getHandler());　　　　

            if (asyncManager.isConcurrentHandlingStarted()) {
                return;
            }
　　　　　　　//4.3调用HandlerExecutionChain的interceptor  
            applyDefaultViewName(processedRequest, mv);
            mappedHandler.applyPostHandle(processedRequest, response, mv);
        }
        catch (Exception ex) {
            dispatchException = ex;
        }
　　　　　//5.解析视图、处理异常  
        processDispatchResult(processedRequest, response, mappedHandler, mv, dispatchException);
    }
    catch (Exception ex) {
        triggerAfterCompletion(processedRequest, response, mappedHandler, ex);
    }
    catch (Error err) {
        triggerAfterCompletionWithError(processedRequest, response, mappedHandler, err);
    }
    finally {
        if (asyncManager.isConcurrentHandlingStarted()) {
            // Instead of postHandle and afterCompletion　　而不是后处理和完成后
            if (mappedHandler != null) {
                mappedHandler.applyAfterConcurrentHandlingStarted(processedRequest, response);
            }
        }
        else {
            // Clean up any resources used by a multipart request.　　清理多部分请求使用的资源。
            if (multipartRequestParsed) {
                cleanupMultipart(processedRequest);
            }
        }
    }
}
```
DispatcherServlet.class
```java
@Nullable
protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
    if (this.handlerMappings != null) {
        Iterator var2 = this.handlerMappings.iterator();

        while(var2.hasNext()) {
            HandlerMapping mapping = (HandlerMapping)var2.next();
            HandlerExecutionChain handler = mapping.getHandler(request);
            if (handler != null) {
                return handler;
            }
        }
    }

    return null;
}
```
AbstractHandlerMapping.class
```java
public final HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
    Object handler = this.getHandlerInternal(request);
    if (handler == null) {
        handler = this.getDefaultHandler();
    }

    if (handler == null) {
        return null;
    } else {
        if (handler instanceof String) {
            String handlerName = (String)handler;
            handler = this.obtainApplicationContext().getBean(handlerName);
        }
        //获得处理程序执行链
        HandlerExecutionChain executionChain = this.getHandlerExecutionChain(handler, request);
        if (this.logger.isTraceEnabled()) {
            this.logger.trace("Mapped to " + handler);
        } else if (this.logger.isDebugEnabled() && !request.getDispatcherType().equals(DispatcherType.ASYNC)) {
            this.logger.debug("Mapped to " + executionChain.getHandler());
        }

        if (CorsUtils.isCorsRequest(request)) {
            CorsConfiguration globalConfig = this.corsConfigurationSource.getCorsConfiguration(request);
            CorsConfiguration handlerConfig = this.getCorsConfiguration(handler, request);
            CorsConfiguration config = globalConfig != null ? globalConfig.combine(handlerConfig) : handlerConfig;
            executionChain = this.getCorsHandlerExecutionChain(request, executionChain, config);
        }

        return executionChain;
    }
}
```
AbstractHandlerMapping.class
```JAVA
protected HandlerExecutionChain getHandlerExecutionChain(Object handler, HttpServletRequest request) {
     //如果没有获得则创建一个
　　　HandlerExecutionChain chain = (handler instanceof HandlerExecutionChain ?
            (HandlerExecutionChain) handler : new HandlerExecutionChain(handler));
　　　　　//获得IP地址及端口后的URL地址
    String lookupPath = this.urlPathHelper.getLookupPathForRequest(request);
    
　　　　　//在HandlerExecutionChain中添加拦截器
　　　　　// 遍历 SpringMVC 容器的所有拦截器
　　　　　for (HandlerInterceptor interceptor : this.adaptedInterceptors) {
　　　　　　　// 判断拦截器类型，属于 MappedInterceptor，则先匹配路径，否则直接添加
        if (interceptor instanceof MappedInterceptor) {
            MappedInterceptor mappedInterceptor = (MappedInterceptor) interceptor;
            
　　　　　　　　　　//根据lookupPath来获取Interceptor
　　　　　　　　　　if (mappedInterceptor.matches(lookupPath, this.pathMatcher)) {
                chain.addInterceptor(mappedInterceptor.getInterceptor());
            }
        }
        else {
            chain.addInterceptor(interceptor);
        }
    }
    return chain;
}
```
**结论：**处理器执行链=1个hanlder+N个Interceptor
![](https://img-my.csdn.net/uploads/201304/13/1365825551_8302.png)
![](https://img-blog.csdn.net/20170504161709191?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSjA4MDYyNA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
Spring工作流程描述
1. 用户向服务器发送请求，请求被Spring 前端控制Servelt DispatcherServlet捕获；
2. DispatcherServlet对请求URL进行解析，得到请求资源标识符（URI）。然后根据该URI，调用HandlerMapping获得该Handler配置的所有相关的对象（包括Handler对象以及Handler对象对应的拦截器），最后以HandlerExecutionChain对象的形式返回；
3. DispatcherServlet 根据获得的Handler，选择一个合适的HandlerAdapter。（附注：如果成功获得HandlerAdapter后，此时将开始执行拦截器的preHandler(...)方法）
4.  提取Request中的模型数据，填充Handler入参，开始执行Handler（Controller)。 在填充Handler的入参过程中，根据你的配置，Spring将帮你做一些额外的工作：
HttpMessageConveter： 将请求消息（如Json、xml等数据）转换成一个对象，将对象转换为指定的响应信息
数据转换：对请求消息进行数据转换。如String转换成Integer、Double等
数据根式化：对请求消息进行数据格式化。 如将字符串转换成格式化数字或格式化日期等
数据验证： 验证数据的有效性（长度、格式等），验证结果存储到BindingResult或Error中
5.  Handler执行完成后，向DispatcherServlet 返回一个ModelAndView对象；
6.  根据返回的ModelAndView，选择一个适合的ViewResolver（必须是已经注册到Spring容器中的ViewResolver)返回给DispatcherServlet ；
7. ViewResolver 结合Model和View，来渲染视图
8. 将渲染结果返回给客户端。

## 6.2. Restful
<a href="#menu" >目录</a>

### 6.2.1. URL 设计

**动词 + 宾语**
RESTful 的核心思想就是，客户端发出的数据操作指令都是"动词 + 宾语"的结构。比如，GET /articles这个命令，GET是动词，/articles是宾语。

* 动词通常就是五种 HTTP 方法，对应 CRUD 操作。
    * GET：读取（Read）
    * POST：新建（Create）
    * PUT：更新（Update）
    * PATCH：更新（Update），通常是部分更新
    * DELETE：删除（Delete）
    * **根据 HTTP 规范，动词一律大写**

**动词的覆盖**
有些客户端只能使用GET和POST这两种方法。服务器必须接受POST模拟其他三个方法（PUT、PATCH、DELETE）。

这时，客户端发出的 HTTP 请求，要加上X-HTTP-Method-Override属性，告诉服务器应该使用哪一个动词，覆盖POST方法。
```
POST /api/Person/4 HTTP/1.1  
X-HTTP-Method-Override: PUT
```
上面代码中，X-HTTP-Method-Override指定本次请求的方法是PUT，而不是POST。

**宾语必须是名词**
宾语就是 API 的 URL，是 HTTP 动词作用的对象。它应该是名词，不能是动词。比如，/articles这个 URL 就是正确的，而下面的 URL 不是名词，所以都是错误的。

```
/getAllCars
/createNewCar
/deleteAllRedCars
```

**复数 URL**
既然 URL 是名词，那么应该使用复数，还是单数？

这没有统一的规定，但是常见的操作是读取一个集合，比如GET /articles（读取所有文章），这里明显应该是复数。

为了统一起见，建议都使用复数 URL，比如GET /articles/2要好于GET /article/2。

**避免多级 URL**
常见的情况是，资源需要多级分类，因此很容易写出多级的 URL，比如获取某个作者的某一类文章。


GET /authors/12/categories/2
这种 URL 不利于扩展，语义也不明确，往往要想一会，才能明白含义。

更好的做法是，除了第一级，其他级别都用查询字符串表达。


GET /authors/12?categories=2
下面是另一个例子，查询已发布的文章。你可能会设计成下面的 URL。


GET /articles/published
查询字符串的写法明显更好。


GET /articles?published=true
### 6.2.2. 状态码
**状态码必须精确**
客户端的每一次请求，服务器都必须给出回应。回应包括 HTTP 状态码和数据两部分。

HTTP 状态码就是一个三位数，分成五个类别。
* 1xx：相关信息
* 2xx：操作成功
* 3xx：重定向
* 4xx：客户端错误
* 5xx：服务器错误

这五大类总共包含100多种状态码，覆盖了绝大部分可能遇到的情况。每一种状态码都有标准的（或者约定的）解释，客户端只需查看状态码，就可以判断出发生了什么情况，所以服务器应该返回尽可能精确的状态码。

API 不需要1xx状态码，下面介绍其他四类状态码的精确含义。

**2xx 状态码**
200状态码表示操作成功，但是不同的方法可以返回更精确的状态码。
```
GET: 200 OK
POST: 201 Created
PUT: 200 OK
PATCH: 200 OK
DELETE: 204 No Content
```
上面代码中，POST返回201状态码，表示生成了新的资源；DELETE返回204状态码，表示资源已经不存在。

此外，202 Accepted状态码表示服务器已经收到请求，但还未进行处理，会在未来再处理，通常用于异步操作。下面是一个例子。

```JSON
HTTP/1.1 202 Accepted

{
  "task": {
    "href": "/api/company/job-management/jobs/2130040",
    "id": "2130040"
  }
}
```

**3xx 状态码**
API 用不到301状态码（永久重定向）和302状态码（暂时重定向，307也是这个含义），因为它们可以由应用级别返回，浏览器会直接跳转，API 级别可以不考虑这两种情况。

API 用到的3xx状态码，主要是303 See Other，表示参考另一个 URL。它与302和307的含义一样，也是"暂时重定向"，区别在于302和307用于GET请求，而303用于POST、PUT和DELETE请求。收到303以后，浏览器不会自动跳转，而会让用户自己决定下一步怎么办。下面是一个例子。

```
HTTP/1.1 303 See Other
Location: /api/orders/12345
```

**4xx 状态码**
4xx状态码表示客户端错误，主要有下面几种。
* 400 Bad Request：服务器不理解客户端的请求，未做任何处理。
* 401 Unauthorized：用户未提供身份验证凭据，或者没有通过身份验证。
* 403 Forbidden：用户通过了身份验证，但是不具有访问资源所需的权限。
* 404 Not Found：所请求的资源不存在，或不可用。
* 405 Method Not Allowed：用户已经通过身份验证，但是所用的 HTTP 方法不在他的权限之内。
* 410 Gone：所请求的资源已从这个地址转移，不再可用。
* 415 Unsupported Media Type：客户端要求的返回格式不支持。比如，API 只能返回 JSON 格式，但是客户端要求返回 XML 格式。
* 422 Unprocessable Entity ：客户端上传的附件无法处理，导致请求失败。
* 429 Too Many Requests：客户端的请求次数超过限额。

**5xx 状态码**
5xx状态码表示服务端错误。一般来说，API 不会向用户透露服务器的详细信息，所以只要两个状态码就够了。
* 500 Internal Server Error：客户端请求有效，服务器处理时发生了意外。
* 503 Service Unavailable：服务器无法处理请求，一般用于网站维护状态。

### 6.2.3. 服务器回应
**不要返回纯本文**
API 返回的数据格式，不应该是纯文本，而应该是一个 JSON 对象，因为这样才能返回标准的结构化数据。所以，服务器回应的 HTTP 头的Content-Type属性要设为application/json。

客户端请求时，也要明确告诉服务器，可以接受 JSON 格式，即请求的 HTTP 头的ACCEPT属性也要设成application/json。下面是一个例子。

```
GET /orders/2 HTTP/1.1 
Accept: application/json
```

**发生错误时，不要返回 200 状态码**
有一种不恰当的做法是，即使发生错误，也返回200状态码，把错误信息放在数据体里面，就像下面这样。

```JSON
HTTP/1.1 200 OK
Content-Type: application/json

{
  "status": "failure",
  "data": {
    "error": "Expected at least two items in list."
  }
}
```
上面代码中，解析数据体以后，才能得知操作失败。

这张做法实际上取消了状态码，这是完全不可取的。正确的做法是，状态码反映发生的错误，具体的错误信息放在数据体里面返回。下面是一个例子。

```JSON
HTTP/1.1 400 Bad Request
Content-Type: application/json

{
  "error": "Invalid payoad.",
  "detail": {
     "surname": "This field is required."
  }
}
```

**提供链接**
API 的使用者未必知道，URL 是怎么设计的。一个解决方法就是，在回应中，给出相关链接，便于下一步操作。这样的话，用户只要记住一个 URL，就可以发现其他的 URL。这种方法叫做 HATEOAS。

举例来说，GitHub 的 API 都在 api.github.com 这个域名。访问它，就可以得到其他 URL。

```JSON
{
  ...
  "feeds_url": "https://api.github.com/feeds",
  "followers_url": "https://api.github.com/user/followers",
  "following_url": "https://api.github.com/user/following{/target}",
  "gists_url": "https://api.github.com/gists{/gist_id}",
  "hub_url": "https://api.github.com/hub",
  ...
}
```
上面的回应中，挑一个 URL 访问，又可以得到别的 URL。对于用户来说，不需要记住 URL 设计，只要从 api.github.com 一步步查找就可以了。

HATEOAS 的格式没有统一规定，上面例子中，GitHub 将它们与其他属性放在一起。更好的做法应该是，将相关链接与其他属性分开。

```JSON
HTTP/1.1 200 OK
Content-Type: application/json

{
  "status": "In progress",
   "links": {[
    { "rel":"cancel", "method": "delete", "href":"/api/status/12345" } ,
    { "rel":"edit", "method": "put", "href":"/api/status/12345" }
  ]}
}
```

## 6.3. 注解说明
<a href="#menu" >目录</a>

**@ControllerAdvice**
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ControllerAdvice {
    @AliasFor("basePackages")
    String[] value() default {};
    @AliasFor("value")
    String[] basePackages() default {};
    Class<?>[] basePackageClasses() default {};
    Class<?>[] assignableTypes() default {};
    Class<? extends Annotation>[] annotations() default {};
}
```
@ExceptionHandler的作用主要在于声明一个或多个类型的异常，当符合条件的Controller抛出这些异常之后将会对这些异常进行捕获，然后按照其标注的方法的逻辑进行处理，从而改变返回的视图信息。如下是@ExceptionHandler的属性结构

```java
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public BaseResult globalException(HttpServletResponse response,NullPointerException ex){


        log.info("GlobalExceptionHandler...");
        log.info("错误代码："  + response.getStatus());
        BaseResult result = new WebResult(WebResult.RESULT_FAIL,"request error:"+response.getStatus(),"GlobalExceptionHandler:"+ex.getMessage());
        return result;
    }
}

```

**@CookieValue**
用来获取Cookie中的值

```java
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CookieValue {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    boolean required() default true;

    String defaultValue() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";
}
```
例子
```java
@RequestMapping("/testCookie")
public String testCookie(@CookieValue(value="name",required=false) String name,
         @CookieValue(value="age",required=false) Integer age){
     System.out.println(name+","+age);
     return "hello";
 }
```
**@CrossOrigin**

用于跨域配置
```java
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ORIGINS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ALLOWED_HEADERS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    boolean DEFAULT_ALLOW_CREDENTIALS = false;
    /** @deprecated */
    @Deprecated
    long DEFAULT_MAX_AGE = 1800L;

    @AliasFor("origins")
    String[] value() default {};

    @AliasFor("value")
    String[] origins() default {};

    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};

    RequestMethod[] methods() default {};

    String allowCredentials() default "";

    long maxAge() default -1L;
}
```
细粒度跨域配置
使用@CrossOrigin,需要和@RequestMapping等映射注解相关配置放一起
```java
@CrossOrigin
@GetMapping("/{id}")
public Account retrieve(@PathVariable Long id) {
    // ...
}

```

全局跨域配置
```java
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hello");
    }
}
```

**@RequestMapping相关**

```java
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface RequestMapping {
    String name() default "";

    @AliasFor("path")
    String[] value() default {};

    @AliasFor("value")
    String[] path() default {};

    RequestMethod[] method() default {};

    String[] params() default {};

    String[] headers() default {};

    String[] consumes() default {};

    String[] produces() default {};
}
```

RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
RequestMapping注解有六个属性，下面我们把她分成三类进行说明（下面有相应示例）。

* value：指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
* method：  指定请求的method类型， GET、POST、PUT、DELETE等；
* consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
* produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
* params： 指定request中必须包含某些参数值是，才让该方法处理。
* headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。

类似的注解还有以下几种，分别对应不同的请求方法
* GetMapping
* PostMapping
* PutMapping
* DeleteMapping


**@InitBinder**
【作用】WebDataBinder实现将请求request绑定到复杂属性时的请求字符string到属性的转换 
【原因】一般的string, int, long会自动绑定到参数，但是自定义的格式spring就不知道如何绑定了 
【实现】所以要继承PropertyEditorSupport，实现自己的属性编辑器PropertyEditor,绑定到WebDataBinder ( binder.registerCustomEditor)，覆盖方法setAsText，需要注解@InitBinder 

【样例】表单发送数据mydate，格式201801–10，自定义数据绑定


```java
@Controller
public class UserController {
    //【控制器内】初始化绑定器
    //绑定一个属性编辑器
    //参数列表是解析后的类型class，要解析的属性field,自定义的PropertyEditor
    //表示当前控制器的所有类型是Date的mydate使用MyDateEditor属性编辑器
    //如果没有"mydate",表示所有Date都使用同一个MyDateEditor属性编辑器
    @InitBinder
    public void bind (WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,"mydate",new MyDateEditor());
    }

    //user的mydate属性接收【表单】提交的参数，格式201801--10
    @RequestMapping("/date")
    public void find( User user, HttpServletResponse response) throws Exception{
        response.getWriter().write("my date:"+user.getMydate());
    }
}

```
```java
public class MyDateEditor extends PropertyEditorSupport{
    @Override
    public String getAsText() {
        //获取属性值
        Date date = (Date) getValue();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMM--dd");
        String str = dateFormat.format(date);
        String mydate =  str.substring(0,4)+str.substring(4,6)+"--"+str.substring(8,10);
        System.out.println(mydate);
        return mydate;
    }

    //text: 201801--10
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMM--dd");
        try {
            System.out.println(dateFormat.parse(text));
            //设置属性值
            setValue(dateFormat.parse(text));
        }catch (ParseException e){
            System.out.println("ParseException....................");
        }
    }
}
```

**@MatrixVariable**
```java
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MatrixVariable {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    String pathVar() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";

    boolean required() default true;

    String defaultValue() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";
}

```
注解@MatrixVariable可以将键值对写到路径中映射作为controller中的方法参数，使用前需要配置

Springboot 默认是无法使用矩阵变量绑定参数的。需要覆盖WebMvcConfigurer中的configurePathMatch方法。

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper=new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
```

如果是传统的XML配置
```xml
<mvc:annotation-driven enable-matrix-variables="true"/>
```

* 在 Matrix Variable 中，多个变量可以使用 “;"（分号）分隔，例如：
    * /books;author=Tom;year=2016
* 如果一个变量对应多个值，那么可以使用 “,"（逗号）分隔，例如：
    * author=smart1,smart2,smart3
* 或者使用重复的变量名，例如：
    * author=smart1;author=smart2;author=smart3

下面举一个例子来说明，代码如下：
```java
//GET /books/22;a=12;b=22
@RequestMapping(value="/books/{bookId)",method=RequestMethod.GET)
public void findBookId (@PathVariable String bookId,@MatrixVariable int a){
    ...
}
```
相应的 bookId 和 a 都会被映射到这个方法中，如果匹配不到，则会报 "bad request"。如果 URI 只是 "/books/11"，则也可以映射到这个方法中，但需要指定空值不报错：@MatrixVariable(required=false）。

再来看一个更复杂的例子，以深入理解，代码如下：

```java
//GET /books/42;a=11/author/21;a=22
@RequestMapping(value="／books/{bookId}/authors/{authorId}", method=RequestMethod.GET)
public void findBook(
    @MatrixVariabIe(value="a", pathVar="bookId") int q1,
    @MatrixVariabIe(value="a", pathVar="authorId) int q2){
        //q1 == 11
        //q2 == 22
}
```

**ModelAttribute**
```java
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelAttribute {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    boolean binding() default true;
}
```
* 用在方法上    
    * 一个控制器可以拥有多个@ModelAttribute方法。同个控制器内的所有这些方法，都会在@RequestMapping方法之前被调用
    * 方法通过返回值的方式默认地将添加一个属性；
    * 方法接收一个Model对象，然后可以向其中添加任意数量的属性
* 用在方法参数上    
    * 标注在方法参数上的@ModelAttribute说明了该方法参数的值将由model中取得。如果model中找不到，那么该参数会先被实例化，然后被添加到model中。在model中存在以后，请求中所有名称匹配的参数都会填充到该参数中。        
    * 它可能因为@SessionAttributes标注的使用已经存在于model中。       
    * 它可能因为在同个控制器中使用了@ModelAttribute方法已经存在于model中。        
    * 它可能是由URI模板变量和类型转换中取得的。        
    * 它可能是调用了自身的默认构造器被实例化出来的

作者：eagle_king
链接：https://www.jianshu.com/p/56c70a69f349
来源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

**@Controller**
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Controller {
    @AliasFor(
        annotation = Component.class
    )
    String value() default "";
}
```
在SpringMVC 中，控制器Controller 负责处理由DispatcherServlet 分发的请求，它把用户请求的数据经过业务处理层处理之后封装成一个Model ，然后再把该Model 返回给对应的View 进行展示。在SpringMVC 中提供了一个非常简便的定义Controller 的方法，你无需继承特定的类或实现特定的接口，只需使用@Controller 标记一个类是Controller ，然后使用@RequestMapping 和@RequestParam 等一些注解用以定义URL 请求和Controller 方法之间的映射，这样的Controller 就能被外界访问到。此外Controller 不会直接依赖于HttpServletRequest 和HttpServletResponse 等HttpServlet 对象，它们可以通过Controller 的方法参数灵活的获取到。

@Controller 用于标记在一个类上，使用它标记的类就是一个SpringMVC Controller 对象。分发处理器将会扫描使用了该注解的类的方法，并检测该方法是否使用了@RequestMapping 注解。@Controller 只是定义了一个控制器类，而使用@RequestMapping 注解的方法才是真正处理请求的处理器。单单使用@Controller 标记在一个类上还不能真正意义上的说它就是SpringMVC 的一个控制器类，因为这个时候Spring 还不认识它。那么要如何做Spring 才能认识它呢？这个时候就需要我们把这个控制器类交给Spring 来管理。有两种方式：
* 在SpringMVC 的配置文件中定义MyController 的bean 对象。
* 在SpringMVC 的配置文件中告诉Spring 该到哪里去找标记为@Controller 的Controller 控制器。

```xml
<!--方式一-->
<bean class="com.host.app.web.controller.MyController"/>
<!--方式二-->
< context:component-scan base-package = "com.host.app.web" />//路径写到controller的上一层(扫描包详解见下面浅析)
```

**@Resource和@Autowired**
@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。

1、共同点
两者都可以写在字段和setter方法上。两者如果都写在字段上，那么就不需要再写setter方法���
2、不同
（1）@Autowired
@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType注入。
```java
public class TestServiceImpl {
    // 下面两种@Autowired只要使用一种即可
    @Autowired
    private UserDao userDao; // 用于字段上
    
    @Autowired
    public void setUserDao(UserDao userDao) { // 用于属性的方法上
        this.userDao = userDao;
    }
}
```
@Autowired注解是按照类型（byType）装配依赖对象，默认情况下它要求依赖对象必须存在，如果允许null值，可以设置它的required属性为false。如果我们想使用按照名称（byName）来装配，可以结合@Qualifier注解一起使用。如下：
```java
public class TestServiceImpl {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao; 
}
```
（2）@Resource

@Resource默认按照ByName自动注入，由J2EE提供，需要导入包javax.annotation.Resource。@Resource有两个重要的属性：name和type，而Spring将@Resource注解的name属性解析为bean的名字，而type属性则解析为bean的类型。所以，如果使用name属性，则使用byName的自动注入策略，而使用type属性时则使用byType自动注入策略。如果既不制定name也不制定type属性，这时将通过反射机制使用byName自动注入策略。

```java
public class TestServiceImpl {
    // 下面两种@Resource只要使用一种即可
    @Resource(name="userDao")
    private UserDao userDao; // 用于字段上
    
    @Resource(name="userDao")
    public void setUserDao(UserDao userDao) { // 用于属性的setter方法上
        this.userDao = userDao;
    }
}
```
注：最好是将@Resource放在setter方法上，因为这样更符合面向对象的思想，通过set、get去操作属性，而不是直接去操作属性。

@Resource装配顺序：

①如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常。

②如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常。

③如果指定了type，则从上下文中找到类似匹配的唯一bean进行装配，找不到或是找到多个，都会抛出异常。

④如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配。

@Resource的作用相当于@Autowired，只不过@Autowired按照byType自动注入。

**@ModelAttribute和 @SessionAttributes**
代表的是：该Controller的所有方法在调用前，先执行此@ModelAttribute方法，可用于注解和方法参数中，可以把这个@ModelAttribute特性，应用在BaseController当中，所有的Controller继承BaseController，即可实现在调用Controller时，先执行@ModelAttribute方法。

 @SessionAttributes即将值放到session作用域中，写在class上面。

具体示例参见下面：使用 @ModelAttribute 和 @SessionAttributes 传递和保存数据

**@PathVariable**
用于将请求URL中的模板变量映射到功能处理方法的参数上，即取出uri模板中的变量作为参数。如：
```java
@Controller  
public class TestController {  
     @RequestMapping(value="/user/{userId}/roles/{roleId}",method = RequestMethod.GET)  
     public String getLogin(@PathVariable("userId") String userId,  
         @PathVariable("roleId") String roleId){  
         System.out.println("User Id : " + userId);  
         System.out.println("Role Id : " + roleId);  
         return "hello";  
     }  
     @RequestMapping(value="/product/{productId}",method = RequestMethod.GET)  
     public String getProduct(@PathVariable("productId") String productId){  
           System.out.println("Product Id : " + productId);  
           return "hello";  
     }  
     @RequestMapping(value="/javabeat/{regexp1:[a-z-]+}",  
           method = RequestMethod.GET)  
     public String getRegExp(@PathVariable("regexp1") String regexp1){  
           System.out.println("URI Part 1 : " + regexp1);  
           return "hello";  
     }  
}
```
**@requestParam**
@requestParam主要用于在SpringMVC后台控制层获取参数，类似一种是request.getParameter("name")，它有三个常用参数：defaultValue = "0", required = false, value = "isApp"；defaultValue 表示设置默认值，required 铜过boolean设置是否是必须要传入的参数，value 值表示接受的传入的参数类型。

**@ResponseBody**
作用： 该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。

使用时机：返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；

**@Component**
相当于通用的注解，当不知道一些类归到哪个层时使用，但是不建议。

**@Repository**
用于注解dao层，在daoImpl类上面注解。
注：
1、使用 @RequestMapping 来映射 Request 请求与处理器
方式一、通过常见的类路径和方法路径结合访问controller方法

方式二、使用uri模板

```java
@Controller
@RequestMapping ( "/test/{variable1}" )
public class MyController {

    @RequestMapping ( "/showView/{variable2}" )
    public ModelAndView showView( @PathVariable String variable1, @PathVariable ( "variable2" ) int variable2) {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName( "viewName" );
       modelAndView.addObject( " 需要放到 model 中的属性名称 " , " 对应的属性值，它是一个对象 " );
       return modelAndView;
    }
} 
```
URI 模板就是在URI 中给定一个变量，然后在映射的时候动态的给该变量赋值。如URI 模板http://localhost/app/{variable1}/index.html ，这个模板里面包含一个变量variable1 ，那么当我们请求http://localhost/app/hello/index.html 的时候，该URL 就跟模板相匹配，只是把模板中的variable1 用hello 来取代。这个变量在SpringMVC 中是使用@PathVariable 来标记的。在SpringMVC 中，我们可以使用@PathVariable 来标记一个Controller 的处理方法参数，表示该参数的值将使用URI 模板中对应的变量的值来赋值。

代码中我们定义了两个URI 变量，一个是控制器类上的variable1 ，一个是showView 方法上的variable2 ，然后在showView 方法的参数里面使用@PathVariable 标记使用了这两个变量。所以当我们使用/test/hello/showView/2.do 来请求的时候就可以访问到MyController 的showView 方法，这个时候variable1 就被赋予值hello ，variable2 就被赋予值2 ，然后我们在showView 方法参数里面标注了参数variable1 和variable2 是来自访问路径的path 变量，这样方法参数variable1 和variable2 就被分别赋予hello 和2 。方法参数variable1 是定义为String 类型，variable2 是定义为int 类型，像这种简单类型在进行赋值的时候Spring 是会帮我们自动转换的。

   在上面的代码中我们可以看到在标记variable1 为path 变量的时候我们使用的是@PathVariable ，而在标记variable2 的时候使用的是@PathVariable(“variable2") 。这两者有什么区别呢？第一种情况就默认去URI 模板中找跟参数名相同的变量，但是这种情况只有在使用debug 模式进行编译的时候才可以，而第二种情况是明确规定使用的就是URI 模板中的variable2 变量。当不是使用debug 模式进行编译，或者是所需要使用的变量名跟参数名不相同的时候，就要使用第二种方式明确指出使用的是URI 模板中的哪个变量。

 除了在请求路径中使用URI 模板，定义变量之外，@RequestMapping 中还支持通配符“* "。如下面的代码我就可以使用/myTest/whatever/wildcard.do 访问到Controller 的testWildcard 方法。如：

```
@Controller
@RequestMapping ( "/myTest" )
public class MyController {
    @RequestMapping ( "*/wildcard" )
    public String testWildcard() {
       System. out .println( "wildcard------------" );
       return "wildcard" ;
    }  
}
```
当@RequestParam中没有指定参数名称时，Spring 在代码是debug 编译的情况下会默认取更方法参数同名的参数，如果不是debug 编译的就会报错。

2、使用 @RequestMapping 的一些高级用法
（1）params属性
```java
@RequestMapping (value= "testParams" , params={ "param1=value1" , "param2" , "!param3" })
    public String testParams() {
       System. out .println( "test Params..........." );
       return "testParams" ;
    }
```
用@RequestMapping 的params 属性指定了三个参数，这些参数都是针对请求参数而言的，它们分别表示参数param1 的值必须等于value1 ，参数param2 必须存在，值无所谓，参数param3 必须不存在，只有当请求/testParams.do 并且满足指定的三个参数条件的时候才能访问到该方法。所以当请求/testParams.do?param1=value1&param2=value2 的时候能够正确访问到该testParams 方法，当请求/testParams.do?param1=value1&param2=value2&param3=value3 的时候就不能够正常的访问到该方法，因为在@RequestMapping 的params 参数里面指定了参数param3 是不能存在的。

（2）method属性
```java
@RequestMapping (value= "testMethod" , method={RequestMethod. GET , RequestMethod. DELETE })
    public String testMethod() {
       return "method" ;
    }
```
在上面的代码中就使用method 参数限制了以GET 或DELETE 方法请求/testMethod 的时候才能访问到该Controller 的testMethod 方法。

（3）headers属性
```java
@RequestMapping (value= "testHeaders" , headers={ "host=localhost" , "Accept" })
    public String testHeaders() {
       return "headers" ;
    }
```
headers 属性的用法和功能与params 属性相似。在上面的代码中当请求/testHeaders.do 的时候只有当请求头包含Accept 信息，且请求的host 为localhost 的时候才能正确的访问到testHeaders 方法。

3、 @RequestMapping 标记的处理器方法支持的方法参数和返回类型
1. 支持的方法参数类型
（1 ）HttpServlet 对象，主要包括HttpServletRequest 、HttpServletResponse 和HttpSession 对象。 这些参数Spring 在调用处理器方法的时候���自动给它们赋值，所以当在处理器方法中需要使用到这些对象的时候，可以直接在方法上给定一个方法参数的申明，然后在方法体里面直接用就可以了。但是有一点需要注意的是在使用HttpSession 对象的时候，如果此时HttpSession 对象还没有建立起来的话就会有问题。
（2 ）Spring 自己的WebRequest 对象。 使用该对象可以访问到存放在HttpServletRequest 和HttpSession 中的属性值。
（3 ）InputStream 、OutputStream 、Reader 和Writer 。 InputStream 和Reader 是针对HttpServletRequest 而言的，可以从里面取数据；OutputStream 和Writer 是针对HttpServletResponse 而言的，可以往里面写数据。
（4 ）使用@PathVariable 、@RequestParam 、@CookieValue 和@RequestHeader 标记的参数。
（5 ）使用@ModelAttribute 标记的参数。
（6 ）java.util.Map 、Spring 封装的Model 和ModelMap 。 这些都可以用来封装模型数据，用来给视图做展示。
（7 ）实体类。 可以用来接收上传的参数。
（8 ）Spring 封装的MultipartFile 。 用来接收上传文件的。
（9 ）Spring 封装的Errors 和BindingResult 对象。 这两个对象参数必须紧接在需要验证的实体对象参数之后，它里面包含了实体对象的验证结果。

2. 支持的返回类型
（1 ）一个包含模型和视图的ModelAndView 对象。
（2 ）一个模型对象，这主要包括Spring 封装好的Model 和ModelMap ，以及java.util.Map ，当没有视图返回的时候视图名称将由RequestToViewNameTranslator 来决定。
（3 ）一个View 对象。这个时候如果在渲染视图的过程中模型的话就可以给处理器方法定义一个模型参数，然后在方法体里面往模型中添加值。
（4 ）一个String 字符串。这往往代表的是一个视图名称。这个时候如果需要在渲染视图的过程中需要模型的话就可以给处理器方法一个模型参数，然后在方法体里面往模型中添加值就可以了。
（5 ）返回值是void 。这种情况一般是我们直接把返回结果写到HttpServletResponse 中了，如果没有写的话，那么Spring 将会利用RequestToViewNameTranslator 来返回一个对应的视图名称。如果视图中需要模型的话，处理方法与返回字符串的情况相同。
（6 ）如果处理器方法被注解@ResponseBody 标记的话，那么处理器方法的任何返回类型都会通过HttpMessageConverters 转换之后写到HttpServletResponse 中，而不会像上面的那些情况一样当做视图或者模型来处理。
（7 ）除以上几种情况之外的其他任何返回类型都会被当做模型中的一个属性来处理，而返回的视图还是由RequestToViewNameTranslator 来决定，添加到模型中的属性名称可以在该方法上用@ModelAttribute(“attributeName") 来定义，否则将使用返回类型的类名称的首字母小写形式来表示。使用@ModelAttribute 标记的方法会在@RequestMapping 标记的方法执行之前执行。

4. 使用 @ModelAttribute 和 @SessionAttributes 传递和保存数据
SpringMVC 支持使用 @ModelAttribute 和 @SessionAttributes 在不同的模型（model）和控制器之间共享数据。 @ModelAttribute 主要有两种使用方式，一种是标注在方法上，一种是标注在 Controller 方法参数上。

当 @ModelAttribute 标记在方法上的时候，该方法将在处理器方法执行之前执行，然后把返回的对象存放在 session 或模型属性中，属性名称可以使用 @ModelAttribute(“attributeName") 在标记方法的时候指定，若未指定，则使用返回类型的类名称（首字母小写）作为属性名称。关于 @ModelAttribute 标记在方法上时对应的属性是存放在 session 中还是存放在模型中，我们来做一个实验，看下面一段代码。

```java
@Controller
@RequestMapping ( "/myTest" )
public class MyController {

    @ModelAttribute ( "hello" )
    public String getModel() {
       System. out .println( "-------------Hello---------" );
       return "world" ;
    }

    @ModelAttribute ( "intValue" )
    public int getInteger() {
       System. out .println( "-------------intValue---------------" );
       return 10;
    }

    @RequestMapping ( "sayHello" )
    public void sayHello( @ModelAttribute ( "hello" ) String hello, @ModelAttribute ( "intValue" ) int num, @ModelAttribute ( "user2" ) User user, Writer writer, HttpSession session) throws IOException {
       writer.write( "Hello " + hello + " , Hello " + user.getUsername() + num);
       writer.write( "\r" );
       Enumeration enume = session.getAttributeNames();
       while (enume.hasMoreElements())
           writer.write(enume.nextElement() + "\r" );
    }

    @ModelAttribute ( "user2" )
    public User getUser(){
       System. out .println( "---------getUser-------------" );
       return new User(3, "user2" );
    }
}
```
当我们请求 /myTest/sayHello.do 的时候使用 @ModelAttribute 标记的方法会先执行，然后把它们返回的对象存放到模型中。最终访问到 sayHello 方法的时候，使用 @ModelAttribute 标记的方法参数都能被正确的注入值。执行结果如下所示：

 Hello world,Hello user210

由执行结果我们可以看出来，此时 session 中没有包含任何属性，也就是说上面的那些对象都是存放在模型属性中，而不是存放在 session 属性中。那要如何才能存放在 session 属性中呢？这个时候我们先引入一个新的概念 @SessionAttributes ，它的用法会在讲完 @ModelAttribute 之后介绍，这里我们就先拿来用一下。我们在 MyController 类上加上 @SessionAttributes 属性标记哪些是需要存放到 session 中的。看下面的代码：

```java
@Controller
@RequestMapping ( "/myTest" )
@SessionAttributes (value={ "intValue" , "stringValue" }, types={User. class })
public class MyController {

    @ModelAttribute ( "hello" )
    public String getModel() {
       System. out .println( "-------------Hello---------" );
       return "world" ;
    }

    @ModelAttribute ( "intValue" )
    public int getInteger() {
       System. out .println( "-------------intValue---------------" );
       return 10;
    }
   
    @RequestMapping ( "sayHello" )
    public void sayHello(Map<String, Object> map, @ModelAttribute ( "hello" ) String hello, @ModelAttribute ( "intValue" ) int num, @ModelAttribute ( "user2" ) User user, Writer writer, HttpServletRequest request) throws IOException {
       map.put( "stringValue" , "String" );
       writer.write( "Hello " + hello + " , Hello " + user.getUsername() + num);
       writer.write( "\r" );
       HttpSession session = request.getSession();
       Enumeration enume = session.getAttributeNames();
       while (enume.hasMoreElements())
           writer.write(enume.nextElement() + "\r" );
       System. out .println(session);
    }

    @ModelAttribute ( "user2" )
    public User getUser() {
       System. out .println( "---------getUser-------------" );
       return new User(3, "user2" );
    }
}
```
在上面代码中我们指定了属性为 intValue 或 stringValue 或者类型为 User 的都会放到 Session中，利用上面的代码当我们访问 /myTest/sayHello.do 的时候，结果如下：

 Hello world,Hello user210

仍然没有打印出任何 session 属性，这是怎么回事呢？怎么定义了把模型中属性名为 intValue 的对象和类型为 User 的对象存到 session 中，而实际上没有加进去呢？难道我们错啦？我们当然没有错，只是在第一次访问 /myTest/sayHello.do 的时候 @SessionAttributes 定义了需要存放到 session 中的属性，而且这个模型中也有对应的属性，但是这个时候还没有加到 session 中，所以 session 中不会有任何属性，等处理器方法执行完成后 Spring 才会把模型中对应的属性添加到 session 中。所以当请求第二次的时候就会出现如下结果：

Hello world,Hello user210
user2
intValue
stringValue

当 @ModelAttribute 标记在处理器方法参数上的时候，表示该参数的值将从模型或者 Session 中取对应名称的属性值，该名称可以通过 @ModelAttribute(“attributeName") 来指定，若未指定，则使用参数类型的类名称（首字母小写）作为属性名称。

5、@PathVariable和@RequestParam的区别 
请求路径上有个id的变量值，可以通过@PathVariable来获取  @RequestMapping(value = "/page/{id}", method = RequestMethod.GET)  
@RequestParam用来获得静态的URL请求入参     spring注解时action里用到。

简介：
handler method 参数绑定常用的注解,我们根据他们处理的Request的不同内容部分分为四类：（主要讲解常用类型）

A、处理requet uri 部分（这里指uri template中variable，不含queryString部分）的注解：   @PathVariable;

B、处理request header部分的注解：   @RequestHeader, @CookieValue;

C、处理request body部分的注解：@RequestParam,  @RequestBody;

D、处理attribute类型是注解： @SessionAttributes, @ModelAttribute;

（1）、@PathVariable
当使用@RequestMapping URI template 样式映射时， 即 someUrl/{paramId}, 这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。

示例代码：

```java
@Controller  
@RequestMapping("/owners/{ownerId}")  
public class RelativePathUriTemplateController {  
  
  @RequestMapping("/pets/{petId}")  
  public void findPet(@PathVariable String ownerId, @PathVariable String petId, Model model) {      
    // implementation omitted   
  }  
} 
```
上面代码把URI template 中变量 ownerId的值和petId的值，绑定到方法的参数上。若方法参数名称和需要绑定的uri template中变量名称不一致，需要在@PathVariable("name")指定uri template中的名称。

（2）、 @RequestHeader、@CookieValue
@RequestHeader 注解，可以把Request请求header部分的值绑定到方法的参数上。

示例代码：

这是一个Request 的header部分：
```
Host                    localhost:8080  
Accept                  text/html,application/xhtml+xml,application/xml;q=0.9  
Accept-Language         fr,en-gb;q=0.7,en;q=0.3  
Accept-Encoding         gzip,deflate  
Accept-Charset          ISO-8859-1,utf-8;q=0.7,*;q=0.7  
Keep-Alive              300  
```
```java
@RequestMapping("/displayHeaderInfo.do")  
public void displayHeaderInfo(@RequestHeader("Accept-Encoding") String encoding,  
                              @RequestHeader("Keep-Alive") long keepAlive)  {  
}  
```
上面的代码，把request header部分的 Accept-Encoding的值，绑定到参数encoding上了， Keep-Alive header的值绑定到参数keepAlive上。

@CookieValue 可以把Request header中关于cookie的值绑定到方法的参数上。

例如有如下Cookie值：

JSESSIONID=415A4AC178C59DACE0B2C9CA727CDD84

```java
@RequestMapping("/displayHeaderInfo.do")  
public void displayHeaderInfo(@CookieValue("JSESSIONID") String cookie)  {  
} 
```
即把JSESSIONID的值绑定到参数cookie上。

（3）、@RequestParam, @RequestBody
@RequestParam 

A） 常用来处理简单类型的绑定，通过Request.getParameter() 获取的String可直接转换为简单类型的情况（ String--> 简单类型的转换操作由ConversionService配置的转换器来完成）；因为使用request.getParameter()方式获取参数，所以可以处理get 方式中queryString的值，也可以处理post方式中 body data的值；

B）用来处理Content-Type: 为 application/x-www-form-urlencoded编码的内容，提交方式GET、POST；

C) 该注解有两个属性： value、required； value用来指定要传入值的id名称，required用来指示参数是否必须绑定；

示例代码：

```java
@Controller  
@RequestMapping("/pets")  
@SessionAttributes("pet")  
public class EditPetForm {  
    @RequestMapping(method = RequestMethod.GET)  
 public String setupForm(@RequestParam("petId") int petId, ModelMap model) {  
       Pet pet = this.clinic.loadPet(petId);  
   model.addAttribute("pet", pet);  
   return "petForm";  
   }
} 
```

@RequestBody

该注解常用来处理Content-Type: 不是application/x-www-form-urlencoded编码的内容，例如application/json, application/xml等；

它是通过使用HandlerAdapter 配置的HttpMessageConverters来解析post data body，然后绑定到相应的bean上的。

因为配置有FormHttpMessageConverter，所以也可以用来处理 application/x-www-form-urlencoded的内容，处理完的结果放在一个MultiValueMap<String, String>里，这种情况在某些特殊需求下使用，详情查看FormHttpMessageConverter api;

示例代码：
```java
@RequestMapping(value = "/something", method = RequestMethod.PUT)  
public void handle(@RequestBody String body, Writer writer) throws IOException {  
  writer.write(body);  
} 
```
（4）、@SessionAttributes, @ModelAttribute@SessionAttributes:

该注解用来绑定HttpSession中的attribute对象的值，便于在方法中的参数里使用。

该注解有value、types两个属性，可以通过名字和类型指定要使用的attribute 对象；

```java
@Controller  
@RequestMapping("/editPet.do")  
@SessionAttributes("pet")  
public class EditPetForm {  
    // ...   
} 
```
@ModelAttribute

该注解有两个用法，一个是用于方法上，一个是用于参数上；

用于方法上时：  通常用来在处理@RequestMapping之前，为请求绑定需要从后台查询的model；

用于参数上时： 用来通过名称对应，把相应名称的值绑定到注解的参数bean上；要绑定的值来源于：

A） @SessionAttributes 启用的attribute 对象上；

B） @ModelAttribute 用于方法上时指定的model对象；

C） 上述两种情况都没有时，new一个需要绑定的bean对象，然后把request中按名称对应的方式把值绑定到bean中。

 

用到方法上@ModelAttribute的示例代码：
```java
@ModelAttribute  
public Account addAccount(@RequestParam String number) {  
    return accountManager.findAccount(number);  
} 
```
这种方式实际的效果就是在调用@RequestMapping的方法之前，为request对象的model里put（“account"， Account）。

用在参数上的@ModelAttribute示例代码：
```java
@RequestMapping(value="/owners/{ownerId}/pets/{petId}/edit", method = RequestMethod.POST)  
public String processSubmit(@ModelAttribute Pet pet) {  
     
} 
```
首先查询 @SessionAttributes有无绑定的Pet对象，若没有则查询@ModelAttribute方法层面上是否绑定了Pet对象，若没有则将URI template中的值按对应的名称绑定到Pet对象的各属性上。

 

6、< context:component-scan base-package = "" />浅析
component-scan 默认扫描的注解类型是 @Component，不过，在 @Component 语义基础上细化后的 @Repository, @Service 和 @Controller 也同样可以获得 component-scan 的青睐

有了< context:component-scan >，另一个< context:annotation-config />标签根本可以移除掉，因为已经被包含进去了

另外< context:annotation-config />还提供了两个子标签

1. < context:include-filter> //指定扫描的路径

2. < context:exclude-filter> //排除扫描的路径

< context:component-scan>有一个use-default-filters属性，属性默认为true,表示会扫描指定包下的全部的标有@Component的类，并注册成bean.也就是@Component的子注解@Service,@Reposity等。

这种扫描的粒度有点太大，如果你只想扫描指定包下面的Controller或其他内容则设置use-default-filters属性为false，表示不再按照scan指定的包扫描，而是按照< context:include-filter>指定的包扫描，示例：

```xml
<context:component-scan base-package="com.tan" use-default-filters="false">
        <context:include-filter type="regex" expression="com.tan.*"/>//注意后面要写.*
</context:component-scan>
当没有设置use-default-filters属性或者属性为true时，表示基于base-packge包下指定扫描的具体路径
<context:component-scan base-package="com.tan" >
        <context:include-filter type="regex" expression=".controller.*"/>
        <context:include-filter type="regex" expression=".service.*"/>
        <context:include-filter type="regex" expression=".dao.*"/>
</>
```

效果相当于：
```xml
<context:component-scan base-package="com.tan" >
        <context:exclude-filter type="regex" expression=".model.*"/>
</>
```

## 6.4. 拦截器 
<a href="#menu" >目录</a>

拦截器的本质是责任链
HandlerInterceptor有三个方法，分别用于Controller调用前执行,如果返回false,则Controller不会被调用;Controller调用后执行(Controller异常不会调用);最终执行(异常或者正常都会被调用)
```java

public interface HandlerInterceptor {
    default boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    default void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    default void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}

```
```java
protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpServletRequest processedRequest = request;
        HandlerExecutionChain mappedHandler = null;
        boolean multipartRequestParsed = false;
        WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);

        try {
            try {
                ModelAndView mv = null;
                Object dispatchException = null;

                try {
                    processedRequest = this.checkMultipart(request);
                    multipartRequestParsed = processedRequest != request;
                    mappedHandler = this.getHandler(processedRequest);
                    if (mappedHandler == null) {
                        this.noHandlerFound(processedRequest, response);
                        return;
                    }

                    HandlerAdapter ha = this.getHandlerAdapter(mappedHandler.getHandler());
                    String method = request.getMethod();
                    boolean isGet = "GET".equals(method);
                    if (isGet || "HEAD".equals(method)) {
                        long lastModified = ha.getLastModified(request, mappedHandler.getHandler());
                        if ((new ServletWebRequest(request, response)).checkNotModified(lastModified) && isGet) {
                            return;
                        }
                    }
                    //pre调用
                    if (!mappedHandler.applyPreHandle(processedRequest, response)) {
                        return;
                    }
                    //controler调用
                    mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
                    if (asyncManager.isConcurrentHandlingStarted()) {
                        return;
                    }

                    this.applyDefaultViewName(processedRequest, mv);
                    //controler调用后调用
                    mappedHandler.applyPostHandle(processedRequest, response, mv);
                } catch (Exception var20) {
                    dispatchException = var20;
                } catch (Throwable var21) {
                    dispatchException = new NestedServletException("Handler dispatch failed", var21);
                }
                //完成时调用,在processDispatchResult进行调用
                this.processDispatchResult(processedRequest, response, mappedHandler, mv, (Exception)dispatchException);
            } catch (Exception var22) {
                this.triggerAfterCompletion(processedRequest, response, mappedHandler, var22);
            } catch (Throwable var23) {
                this.triggerAfterCompletion(processedRequest, response, mappedHandler, new NestedServletException("Handler processing failed", var23));
            }

        } finally {
            if (asyncManager.isConcurrentHandlingStarted()) {
                if (mappedHandler != null) {
                    
                    mappedHandler.applyAfterConcurrentHandlingStarted(processedRequest, response);
                }
            } else if (multipartRequestParsed) {
                this.cleanupMultipart(processedRequest);
            }

        }
    }


```
HandlerExecutionChain里面进行统一处理
```java
boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = 0; i < interceptors.length; this.interceptorIndex = i++) {
            HandlerInterceptor interceptor = interceptors[i];
            if (!interceptor.preHandle(request, response, this.handler)) {
                this.triggerAfterCompletion(request, response, (Exception)null);
                return false;
            }
        }
    }

    return true;
}

void applyPostHandle(HttpServletRequest request, HttpServletResponse response, @Nullable ModelAndView mv) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = interceptors.length - 1; i >= 0; --i) {
            HandlerInterceptor interceptor = interceptors[i];
            interceptor.postHandle(request, response, this.handler, mv);
        }
    }

}

void triggerAfterCompletion(HttpServletRequest request, HttpServletResponse response, @Nullable Exception ex) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = this.interceptorIndex; i >= 0; --i) {
            HandlerInterceptor interceptor = interceptors[i];

            try {
                interceptor.afterCompletion(request, response, this.handler, ex);
            } catch (Throwable var8) {
                logger.error("HandlerInterceptor.afterCompletion threw exception", var8);
            }
        }
    }

}
```

**Spring拦截器实现**

需要先行定义拦截器，addPathPatterns用于配置拦截器对应的URL
```java
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");

        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**")
                                                     .addPathPatterns("/two/**");

        super.addInterceptors(registry);
    }
}
```
拦截器的执行是会根据 registry 注入的先后顺序执行，比如：/one/**   同时被  OneInterceptor、TwoInterceptor 拦截，但会先执行 OneInterceptor拦截的业务请求，因为它先注入进来的

## 6.5. 过滤器
<a href="#menu" >目录</a>


**SpringBoot实现过滤器**

方式1：实现Filter
Servlet 的 Filter 接口需要实现如下方法：
* void init(FilterConfig paramFilterConfig) – 当容器初始化 Filter 时调用，该方法在 Filter 的生命周期只会被调用一次，一般在该方法中初始化一些资源，FilterConfig 是容器提供给 Filter 的初始化参数，在该方法中可以抛出 ServletException 。init 方法必须执行成功，否则 Filter 可能不起作用，出现以下两种情况时，web 容器中 Filter 可能无效： 1）抛出 ServletException 2）超过 web 容器定义的执行时间。
* doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse, FilterChain paramFilterChain) – Web 容器每一次请求都会调用该方法。该方法将容器的请求和响应作为参数传递进来， FilterChain 用来调用下一个 Filter。
* void destroy() – 当容器销毁 Filter 实例时调用该方法，可以在方法中销毁资源，该方法在 Filter 的生命周期只会被调用一次

```java
@Component
public class TimerFilter implements Filter{

    @Override
    public void destroy() {
        System.out.println("timer Filter is destoried");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("timer Filter begin");
        long start=new Date().getTime();
        chain.doFilter(request, response);
        long end=new Date().getTime();
        System.out.println("timer Filter end,cost time:"+(end-start));
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("timer Filter is inited");
    }

}
```

方式2：
这种方式可以实现更细化的配置，针对某个路径
```java
@Configuration
public class ProjectConfig {

    @Bean
    public FilterRegistrationBean timerFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        
        filterRegistrationBean.setFilter(new TimerFilter());
        List<String>urls=Lists.newArrayList();
        urls.add("/*");
        filterRegistrationBean.setUrlPatterns(urls);
        
        return filterRegistrationBean;
    }
}
```

### 6.5.1. 过滤器和拦截器的区别：

![](https://images2017.cnblogs.com/blog/330611/201710/330611-20171023144517066-24770749.png)

|Filter|	Interceptor|	Summary|
|---|---|---|
|Filter| 接口定义在 javax.servlet 包中|	接口 HandlerInterceptor 定义在org.springframework.web.servlet 包中	 
|Filter 定义在 web.xml 中|-| 	- 
|Filter在只在 Servlet 前后起作用。Filters 通常将 请求和响应（request/response） 当做黑盒子，Filter 通常不考虑servlet 的实现。	|拦截器能够深入到方法前后、异常抛出前后等，因此拦截器的使用具有更大的弹性。允许用户介入（hook into）请求的生命周期，在请求过程中获取信息，Interceptor 通常和请求更加耦合。|	在Spring构架的程序中，要优先使用拦截器。几乎所有 Filter 能够做的事情， interceptor 都能够轻松的实现
|Filter 是 Servlet 规范规定的。	|而拦截器既可以用于Web程序，也可以用于Application、Swing程序中。|	使用范围不同
|Filter 是在 Servlet 规范中定义的，是 Servlet 容器支持的。	|而拦截器是在 Spring容器内的，是Spring框架支持的。	|规范不同
|Filter 不能够使用 Spring 容器资源|	拦截器是一个Spring的组件，归Spring管理，配置在Spring文件中，因此能使用Spring里的任何资源、对象，例如 Service对象、数据源、事务管理等，通过IoC注入到拦截器即可	|Spring 中使用 interceptor 更容易
|Filter 是被 Server(like Tomcat) 调用|	Interceptor 是被 Spring 调用|因此Filter总是优先于拦截器执行


### 6.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途
* Authentication Filters
* Logging and Auditing Filters
* Image conversion Filters
* Data compression Filters
* Encryption Filters
* Tokenizing Filters
* Filters that trigger resource access events
* XSL/T filters
* Mime-type chain Filter
---
* Request Filters 可以:
    * 执行安全检查 perform security checks
    * 格式化请求头和主体 reformat request headers or bodies
    * 审查或者记录日志 audit or log requests
    * 根据请求内容授权或者限制用户访问 Authentication-Blocking requests based on user identity.
    * 根据请求频率限制用户访问

* Response Filters 可以:
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    追加或者修改响应 append or alter the response stream
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    创建或者整体修改响应 create a different response altogether
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    根据地方不同修改响应内容 Localization-Targeting the request and response to a particular locale.

## 6.6. WebDataBinder
<a href="#menu" >目录</a>

# 7. Webflux
<a href="#menu" >目录</a>

SpringWebflux是SpringFramework5.0添加的新功能

## 7.1. 概述
<a href="#menu" >目录</a>

传统的web mvc 和struct都是基于Servlet API与Servlet容器基础之上运行的.servlet就版本都是同步阻塞型,也就是一个线程处理一个请求.直到servlet 3.1开始才支持异步非阻塞.而WebFlux是一个典型非阻塞异步的框架，它的核心是基于Reactor的相关API实现的。相对于传统的web框架来说，它可以运行在诸如Netty，Undertow及支持Servlet3.1的容器上，因此它的运行环境的可选择行要比传统web框架多的多。

webflux主要在如下两方面体现出独有的优势：
* 非阻塞式
    * 其实在servlet3.1提供了非阻塞的API，WebFlux提供了一种比其更完美的解决方案。使用非阻塞的方式可以利用较小的线程或硬件资源来处理并发进而提高其可伸缩性
* 函数式编程端点
    * 老生常谈的编程方式了，Spring5必须让你使用java8，那么函数式编程就是java8重要的特点之一，而WebFlux支持函数式编程来定义路由端点处理请求。
                            
### 7.1.1. SpringMVC与SpringWebFlux

它们都可以用注解式编程模型，都可以运行在tomcat，jetty，undertow等servlet容器当中。但是SpringMVC采用命令式编程方式，代码一句一句的执行，这样更有利于理解与调试，而WebFlux则是基于异步响应式编程，对于初次接触的码农们来说会不习惯。对于这两种框架官方给出的建议是：
* 如果原先使用用SpringMVC好好的话，则没必要迁移。因为命令式编程是编写、理解和调试代码的最简单方法。因为老项目的类库与代码都是基于阻塞式的。
* 如果你的团队打算使用非阻塞式web框架，WebFlux确实是一个可考虑的技术路线，而且它支持类似于SpringMvc的Annotation的方式实现编程模式，也可以在微服务架构中让WebMvc与WebFlux共用Controller，切换使用的成本相当小
* 在SpringMVC项目里如果需要调用远程服务的话，你不妨考虑一下使用WebClient，而且方法的返回值可以考虑使用Reactive Type类型的，当每个调用的延迟时间越长，或者调用之间的相互依赖程度越高，其好处就越大
* SpringWebFlux并不是让你的程序运行的更快(相对于SpringMVC来说)，而是在有限的资源下提高系统的伸缩性，因此当你对响应式编程非常熟练的情况下并将其应用于新的系统中，还是值得考虑的，否则还是老老实实的使用WebMVC吧

### 7.1.2. Reactive Spring Web

在这里定义了最基本的服务端接口：HttpHandler和WebHandler

**HttpHandler**
HttpHandler定义了最基本的处理Http请求行为，这个接口主要作用是处理Http请求并将结果做出响应，下面这个表格是说明了Server API的使用方式及何种方式进行响应式流支持的：

|Server name	|Server API used	|Reactive Streams support|
|---|---|---|
|Netty|Netty API|Reactor Netty
|Undertow|Undertow API|spring-web: Undertow to Reactive Streams bridge
|Tomcat|Servlet 3.1 non-blocking I/O; Tomcat API to read and write ByteBuffers vs byte[]|spring-web: Servlet 3.1 non-blocking I/O to Reactive Streams bridge
|Jetty|Servlet 3.1 non-blocking I/O; Jetty API to write ByteBuffers vs byte[]|spring-web: Servlet 3.1 non-blocking I/O to Reactive Streams bridge
|Servlet 3.1 container|Servlet 3.1 non-blocking I/O|spring-web: Servlet 3.1 non-blocking I/O to Reactive Streams bridge

**WebHandler**
　WebHandler定义了Web请求必要一些处理行为，大家不妨想想看：WebFlux已经脱离了Servlet API，那么使用WebFlux时遇到会话机制怎么办，想要对请求过滤处理怎么办或者想要处理静态资源怎么办等等，那么WebHandler就是做这个事情的。其实在HttpHandler的基本实现类通过适配器模式及装饰模式也间接的实现了WebHandler接口：
![WebHandler](pic/spring/webflux/WebHandler.png)

* WebHandler常见的实现类：
    * WebHandlerDecorator：WebHandler的装饰器，利用装饰模式实现相关功能的扩展
    * HttpWebHandlerAdapter: 进行Http请求处理，同时也是HttpHandler的实现类
    * FilteringWebHandler：通过WebFilter进行过滤处理的类，类似于Servlet中的Filter
    * ExceptionHandlingWebHandler: 针对于异常的处理类
    * ResourceWebHandler：用于静态资源请求的处理类
    * DispatcherHandler：请求的总控制器，类似于WebMVC中的DispatcherServlet

    
## 7.2. 基本例子
<a href="#menu" >目录</a>

## 7.3. Mono常用方法说明
<a href="#menu" >目录</a>



**依赖引入**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```


# 8. SpringBoot
<a href="#menu" >目录</a>

## 8.1. 基本概念

Spring Boot 是 Spring 开源组织下的子项目，是 Spring 组件一站式解决方案，主要是简化了使用 Spring 的难度，简省了繁重的配置，提供了各种启动器，开发者能快速上手.其设计理念是


SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* 命令行界面：这是Spring Boot的可选特性，借此你只需写代码就能完成完整的应用程序，无需传统项目构建
* Actuator

Spring Boot 优点非常多，如：
* 为spring应用提供更加简单的使用和快速开发的技巧
* 各个依赖模块都有默认配置,达到开箱即用的效果
* 具有功能强大的服务体系,包括嵌入式服务,安全,性能指标,健康检查等
* 不再需要xml配置文件


## 8.2. 基本使用
<a href="#menu" >目录</a>

maven配置文件

方式1
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.0.BUILD-SNAPSHOT</version>
</parent>
```
方式2
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
        <!-- Import dependency management from Spring Boot -->
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>2.1.0.BUILD-SNAPSHOT</version>
        <type>pom</type>
        <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

```

使用以上任何一种方式配置时,引入官方的starter包无需指定版本

**插件**

要创建可执行的jar文件,需要添加maven插件
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
**启动类**
```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

```

```bash
# 打包,生成的jar文件在target文件夹下.
mvn package
# 运行
java -jar xxx.jar

#或者
mvn spring-boot:run
```
## 8.3. SpringBoot DevTools 的用途是什么？
SpringBoot 开发者工具，或者说 DevTools，是一系列可以让开发过程变得简便的工具。为了引入这些工具，我们只需要在 POM.xml 中添加如下依赖：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```
spring-boot-devtools 模块在生产环境中是默认禁用的，archives 的 repackage 在这个模块中默认也被排除。因此，它不会给我们的生产环境带来任何开销。

通常来说，DevTools 应用属性适合于开发环境。这些属性禁用模板缓存，启用 web 组的调试日志记录等等。最后，我们可以在不设置任何属性的情况下进行合理的开发环境配置。

每当 classpath 上的文件发生更改时，使用 DevTools 的应用程序都会重新启动。这在开发中非常有用，因为它可以为修改提供快速的反馈。因为 Spring Boot再次重启 ，避免了重启 Tomcat Server，也避免了重启己经加载的 Spring 相关类，只重新加载变化的类。所以速度很快，基本上改完代码或者配置，就能立即进行调试 。

重新编译工程: ctrl+shift+f9


## 8.4. Spring Boot 环境下创建Bean
<a href="#menu" >目录</a>

### 8.4.1. 方式1:使用@Component等注解：

使用@Component,@Service,@Controler,@Repository注解

这几个注解都是同样的功能，被注解的类将会被Spring 容器创建单例对象。

@Component : 侧重于通用的Bean类

@Service：标识该类用于业务逻辑

@Controler：标识该类为Spring MVC的控制器类

@Repository: 标识该类是一个实体类，只有属性和Setter,Getter

```java
@Component
public class User{
}
```
当用于Spring Boot应用时，被注解的类必须在启动类的根路径或者子路径下，否则不会生效。

如果不在，可以使用@ComponentScan标注扫描的路径。

spring xml 也有相关的标签<component-scan />

```java
@ComponentScan(value={"com.microblog.blog","com.microblog.common"})
public class MicroblogBlogApplication {
    public static void main(String args[]){
        SpringApplication.run(MicroblogBlogApplication.class,args);
    }
}
```
 

### 8.4.2. 方式2:使用@Bean注解


@Configuration 标识这是一个Spring Boot 配置类，其将会扫描该类中是否存在@Bean 注解的方法，比如如下代码，将会创建User对象并放入容器中。

@ConditionalOnBean 用于判断存在某个Bean时才会创建User Bean.

这里创建的Bean名称默认为方法的名称user。也可以@Bean("xxxx")定义。

```java
@Configuration
public class UserConfiguration{
     
      @Bean
　　　 @ConditionalOnBean(Location.class)
      public User user(){
           return new User();
      }
      
}  
```
 

Spring boot 还为我们提供了更多类似的注解。
```java
//某个Bean存在时才创建
ConditionalOnBean
//某个类存在时才创建
ConditionalOnClass
ConditionalOnCloudPlatform
ConditionalOnExpression
ConditionalOnJava
ConditionalOnJndi
//某个Bean不存在时才创建
ConditionalOnMissingBean
//某个类不存在时才创建
ConditionalOnMissingClass
//不是web环境时才创建
ConditionalOnNotWebApplication
//某个属性存在时才创建
ConditionalOnProperty
//某个资源存在时才创建
ConditionalOnResource
ConditionalOnSingleCandidate
//web环境下才创建
ConditionalOnWebApplication
ConditionEvaluationReport
ConditionEvaluationReportAutoConfigurationImportListener
ConditionMessage
ConditionOutcome
```
也和方式1一样，也会存在扫描路径的问题，除了以上的解决方式，还有使用Spring boot starter 的解决方式

在resources下创建如下文件。META-INF/spring.factories.

Spring Boot 在启动的时候将会扫描该文件，从何获取到配置类UserConfiguration。



spring.factories
```xml
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.log.config.UserConfiguration
```
 

如果不成功，请引入该依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>   
``` 
 

这个方式也是创建SpringBoot-starter的方式。

 

### 8.4.3. 方式3:使用@Import注解
使用注解@Import,也会创建对象并注入容器中

```java
@Import(User.class)
public class MicroblogUserWebApplication {
    public static void main(String args[]) {
        SpringApplication.run(MicroblogUserWebApplication.class, args);
    }
}
```
### 8.4.4. 方式4:使用ImportSelector接口

使用ImportSelector或者ImportBeanDefinitionRegistrar接口，配合@Import实现。

在使用一些Spring Boot第三方组件时，经常会看到@EnableXXX来使能相关的服务，这里以一个例子来实现。

创建测试类
```java

@Slf4j
public class House {

    public void run(){

        log.info("House  run ....");
    }
}

@Slf4j
public class User {


    public void run(){

        log.info("User  run ....");

    }

}

@Slf4j
public class Student {

    public void run(){

        log.info("Student  run ....");

    }

} 
```

实现ImportSelector接口
selectImports方法的返回值为需要创建Bean的类名称。这里创建User类。

```java
@Slf4j
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {


        log.info("MyImportSelector selectImports ...");
        return new String[]{
            User.class.getName()};
    }
}
```



 

实现ImportBeanDefinitionRegistrar接口
beanDefinitionRegistry.registerBeanDefinition用于设置需要创建Bean的类名称。这里创建House类。

```java
@Slf4j
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        log.info("MyImportBeanDefinitionRegistrar  registerBeanDefinitions .....");
        BeanDefinition beanDefinition =  new RootBeanDefinition(House.class.getName());
        beanDefinitionRegistry.registerBeanDefinition(House.class.getName(),beanDefinition);
    }
}
```
 

创建一个配置类
这里创建Student类。

```java
@Configuration
public class ImportAutoconfiguration {

    @Bean
    public Student student(){
        return new Student();
    }
}
```
 
**有两种方式实现类似Spring Cloud 中EnableXXX的注解功能**
```java
//方式1:直接通过@Import导入配置类

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({ConfigServerConfiguration.class})
public @interface EnableConfigServer {
}

//方式1:通过ImportSelector中定义配置类

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyImportSelector.class})
public @interface EnableConfigServer {
}

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        log.info("MyImportSelector selectImports ...");
        return new String[]{
            ConfigServerConfiguration.class.getName()};
    }
}



```



创建EnableImportSelector注解
EnableImportSelector注解上使用@Import，引入以上的三个类。

```java
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({MyImportSelector.class,ImportAutoconfiguration.class,MyImportBeanDefinitionRegistrar.class})
public @interface EnableImportSelector {

    String value();

}
```
 测试
```java
@EnableImportSelector(value = "xxx")
@SpringBootApplication
public class ImportDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(ImportDemoApplication.class, args);

        User user =  context.getBean(User.class);
        user.run();

        Student student =  context.getBean(Student.class);
        student.run();

        House house =  context.getBean(House.class);
        house.run();

    }

}
```
 

输出，可以看到，三个类User Student House都创建成功，都可从Spring 容器中获取到。
```
2019-06-20 17:53:39.528  INFO 27255 --- [           main] com.springboot.importselector.pojo.User  : User  run ....
2019-06-20 17:53:39.530  INFO 27255 --- [           main] c.s.importselector.pojo.Student          : Student  run ....
2019-06-20 17:53:39.531  INFO 27255 --- [           main] c.springboot.importselector.pojo.House   : House  run ....
```

 

### 8.4.5. 方式5:手动注册到容器

手动注入Bean容器，有些场景下需要代码动态注入，以上方式都不适用。这时就需要创建 对象手动注入。

通过DefaultListableBeanFactory注入。

registerSingleton(String beanName,Object object);

这里手动使用new创建了一个Location对象。并注入容器中。

 
```java
@Component
public class LocationRegister implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory listableBeanFactory = (DefaultListableBeanFactory)beanFactory;
　　　　//方式1
　　　//　Location location = new Location();
　　　//　listableBeanFactory.registerSingleton(Location.class.getName(),location);

　　　　//方式2
　　　　BeanDefinition locationBeanDefinition = new RootBeanDefinition(Location.class);
　　　　listableBeanFactory.registerBeanDefinition(Location.class.getName(),locationBeanDefinition);

    }
}
```
这种方式的应用场景是为接口创建动态代理对象，并向SPRING容器注册。

比如MyBatis中的Mapper接口，Mapper没有实现类，启动时创建动态代理对象，将该对象注册到容器中，使用时只要@Autowired注入即可使用，调用接口方法将会被代理拦截，进而调用相关的SqlSession执行相关的SQL业务逻辑。

 

可以看以下它的继承体系

DefaultListableBeanFactory 是ConfigurableListableBeanFactory的实现类。是对BeanFactory功能的扩展。



测试代码和以上一样
```java
Location location =  context.getBean(Location.class);
location.run();
```

## 8.5. 使用不同的WEB容器

undertow,jetty和tomcat可以说是javaweb项目当下最火的三款服务器，tomcat是apache下的一款重量级的服务器，不用多说历史悠久，经得起实践的考验。然而：当下微服务兴起，spring boot ，spring cloud 越来越热的情况下，选择一款轻量级而性能优越的服务器是必要的选择。spring boot 完美集成了tomcat，jetty和undertow.

**Spring Boot引入spring-boot-starter-web后,默认的容器是Tomcat.**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

```
Tomcat配置
```yml
server.tomcat.accept-count=0  Maximum queue length for incoming connection requests when all possible request processing threads are in use.
server.tomcat.accesslog.buffered=true  Whether to buffer output such that it is flushed only periodically.
server.tomcat.accesslog.directory=logs  Directory in which log files are created. Can be absolute orrelative to the Tomcat base dir.
server.tomcat.accesslog.enabled=false  Enable access log.
server.tomcat.accesslog.file-date-format=.yyyy-MM-dd  Date format to place in the log file name.
server.tomcat.accesslog.pattern=common  Format pattern for access logs.
server.tomcat.accesslog.prefix=access_log  Log file name prefix.
server.tomcat.accesslog.rename-on-rotate=false  Whether to defer inclusion of the date stamp in the  file name until rotate time.
server.tomcat.accesslog.request-attributes-enabled=false  Set request attributes for the IP address,Hostname, protocol, and port used for the request.
server.tomcat.accesslog.rotate=true  Whether to enable access log rotation.
server.tomcat.accesslog.suffix=.log  Log file name suffix.
server.tomcat.additional-tld-skip-patterns=  Comma-separated list of additional patterns that match jars to ignore for TLD scanning.
server.tomcat.background-processor-delay=30s  Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used.
server.tomcat.basedir=  Tomcat base directory. If not specified, a temporary directory is used.
server.tomcat.internal-proxies=10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
192\\.168\\.\\d{1,3}\\.\\d{1,3}|\\
169\\.254\\.\\d{1,3}\\.\\d{1,3}|\\
127\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
172\\.1[6-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
172\\.2[0-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
172\\.3[0-1]{1}\\.\\d{1,3}\\.\\d{1,3}  Regular expression matching trusted IP addresses.
server.tomcat.max-connections=0  Maximum number of connections that the server accepts and processes at any given time.
server.tomcat.max-http-header-size=0  Maximum size, in bytes, of the HTTP message header.
server.tomcat.max-http-post-size=0  Maximum size, in bytes, of the HTTP post content.
server.tomcat.max-threads=0  Maximum number of worker threads.
server.tomcat.min-spare-threads=0  Minimum number of worker threads.
server.tomcat.port-header=X-Forwarded-Port  Name of the HTTP header used to override the original port value.
server.tomcat.protocol-header=  Header that holds the incoming protocol, usually named "X-ForwardedProto".
server.tomcat.protocol-header-https-value=https  Value of the protocol header indicating whether the incoming request uses SSL.
server.tomcat.redirect-context-root=  Whether requests to the context root should be redirected by appending a / to the path.
server.tomcat.remote-ip-header=  Name of the HTTP header from which the remote IP is extracted. For instance, `X-FORWARDED-FOR`.
server.tomcat.resource.cache-ttl=  Time-to-live of the static resource cache.
server.tomcat.uri-encoding=UTF-8  Character encoding to use to decode the URI.
server.tomcat.use-relative-redirects=  Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects.
```

**更换为undertow**
```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
    <!-- Exclude the Tomcat dependency -->
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<!-- Use Jetty instead -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-undertow</artifactId>
</dependency

```
undertow配置
```yml
server.undertow.accesslog.dir=  Undertow access log directory.
server.undertow.accesslog.enabled=false  Whether to enable the access log.
server.undertow.accesslog.pattern=common  Format pattern for access logs.
server.undertow.accesslog.prefix=access_log.  Log file name prefix.
server.undertow.accesslog.rotate=true  Whether to enable access log rotation.
server.undertow.accesslog.suffix=log  Log file name suffix.
server.undertow.buffer-size=  Size of each buffer, in bytes.
server.undertow.direct-buffers=  Whether to allocate buffers outside the Java heap.
server.undertow.io-threads=  Number of I/O threads to create for the worker.
server.undertow.eager-filter-init=true  Whether servlet filters should be initialized on startup.
server.undertow.max-http-post-size=0  Maximum size, in bytes, of the HTTP post content.
server.undertow.worker-threads=  Number of worker threads
```

**更换为jetty**
```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
    <!-- Exclude the Tomcat dependency -->
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<!-- Use Jetty instead -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency

```

```yml
server.jetty.acceptors=  Number of acceptor threads to use.
server.jetty.accesslog.append=false  Append to log.
server.jetty.accesslog.date-format=dd/MMM/yyyy:HH:mm:ss Z  Timestamp format of the request log.
server.jetty.accesslog.enabled=false  Enable access log.
server.jetty.accesslog.extended-format=false  Enable extended NCSA format.
server.jetty.accesslog.file-date-format=  Date format to place in log file name.
server.jetty.accesslog.filename=  Log filename. If not specified, logs redirect to "System.err".
server.jetty.accesslog.locale=  Locale of the request log.
server.jetty.accesslog.log-cookies=false  Enable logging of the request cookies.
server.jetty.accesslog.log-latency=false  Enable logging of request processing time.
server.jetty.accesslog.log-server=false  Enable logging of the request hostname.
server.jetty.accesslog.retention-period=31  Number of days before rotated log files are deleted.
server.jetty.accesslog.time-zone=GMT  Timezone of the request log.
server.jetty.max-http-post-size=0  Maximum size, in bytes, of the HTTP post or put content.
server.jetty.selectors=  Number of selector threads to use

```

## 8.6. 配置文件
<a href="#menu" >目录</a>

Spring支持两种类型的配置文件,后缀名分别为properties和yml.

```yml

 2. properties
server.port=8001

 3. yml
server:
    port: 8001
```
可以看到yml类型的格式结构更加清晰

### 8.6.1. bootstrap.yml与application.yml区别
<a href="#menu" >目录</a>

说明：其实yml和properties文件是一样的原理，主要是说明application和bootstrap的加载顺序。且一个项目上要么yml或者properties，二选一的存在


bootstrap 配置文件有以下几个应用场景。
* 使用 Spring Cloud Config 配置中心时，这时需要在 bootstrap 配置文件中添加连接到配置中心的配置属性来加载外部配置中心的配置信息；
* 一些固定的不能被覆盖的属性；
* 一些加密/解密的场景



**执行顺序**
* bootstrap.yml（bootstrap.properties）用来程序引导时执行，应用于更加早期配置信息读取，如可以使用来配置application.yml中使用到参数等
* application.yml（application.properties) 应用程序特有配置信息，可以用来配置后续各个模块中需使用的公共参数等。
* bootstrap.yml 先于 application.yml 加载
* 如果两个配置文件都有相同的配置,application.yml将会覆盖bootstrap.yml的值

**典型的应用场景如下**
* 当使用 Spring Cloud Config Server 的时候，你应该在 bootstrap.yml 里面指定 spring.application.name 和 spring.cloud.config.server.git.uri和一些加密/解密的信息
技术上，bootstrap.yml 是被一个父级的 Spring ApplicationContext 加载的。这个父级的 Spring ApplicationContext是先加载的，在加载application.yml 的 ApplicationContext之前。

为何需要把 config server 的信息放在 bootstrap.yml 里？
当使用Spring Cloud的时候，配置信息一般是从config server加载的，为了取得配置信息（比如密码等），你需要一些提早的或引导配置。因此，把 config server 信息放在 bootstrap.yml，用来加载真正需要的配置信息。


Spring Boot应用程序有多种设置途径。 Spring Boot能从多种属性源获得属性，包括如下几处。
* 命令行参数:java -jar xxx.jar --spring.main.show-banner=false
* java:comp/env里的JNDI属性
* JVM系统属性
* 操作系统环境变量: export spring_main_show_banner=false
* 随机生成的带random.*前缀的属性（在设置其他属性时，可以引用它们，比如${random.long}）
* 应用程序以外的application.properties或者appliaction.yml文件
* 打包在应用程序内的application.properties或者appliaction.yml文件
* 通过@PropertySource标注的属性源
* 默认属性
这个列表按照优先级排序，也就是说，任何在高优先级属性源里设置的属性都会覆盖低优先级的相同属性。


application.properties和application.yml文件能放在以下四个位置。
* 外置，在相对于应用程序运行目录的/config子目录里。(file:./config/)
* 外置，在应用程序运行的目录里。(file:./)
* 内置，在config包内。(classpath:/config/)
* 内置，在Classpath根目录。(classpath:/)
同样，这个列表按照优先级排序。也就是说， /config子目录里的application.properties会覆盖应用程序Classpath里的application.properties中的相同属性。
此外，如果你在同一优先级位置同时有application.properties和application.yml，那么application.yml里的属性会覆盖application.properties里的属性。

如果配置文件不再上述目录,还可以通过spring.config.name或者spring.config.location指定
```
java -jar myproject.jar --spring.config.name=myproject
java -jar myproject.jar --spring.config.location=classpath:/default.properties,classpath:/override.properties
```

### 8.6.2. 多环境配置
<a href="#menu" >目录</a>

软件开发中经常有开发环境、测试环境、预发布环境、生产环境，而且一般这些环境配置会各不相同，手动改配置麻烦且容易出错，如何管理不同环境的配置参数呢？spring-boot + maven可以解决不同环境独立配置不同参数的问题。


#### 8.6.2.1. 配置文件
<a href="#menu" >目录</a>

**方式1:使用多个配置文件**

命名为application-xxx.yml或者application-xxx.properties

不同环境的配置yml文件名不一样：
* application-dev.yml（开发环境）
* application-test.yml（测试环境）
* application-uat.yml（预发布）
* application-pro.yml（生产环境）

**方式2:只使用一个配置文件**

中间使用"---"进行分隔,使用spring.profiles指定当前环境的配置

```yml


spring:
    #激活哪一个环境的配置文件
    profiles:
        active: dev
    #公共配置
    jackson:
        date-format: yyyy-MM-dd HH:mm:ss
---
spring:
    profiles: dev
server:
    port: 8081
---
spring:
    profiles: test
server:
    port: 8082
---
spring:
    profiles: pro
server:
    port: 8083

```

#### 8.6.2.2. 多环境配置
<a href="#menu" >目录</a>

**方式1:application.yml配置**
application.yml
```yml
spring:
  profiles:
    active: dev
```
如果要切换不同环境，只需要修改spring.profiles.active即可。

**方式2:启动jar包时设置spring.profiles.active**

```
java -jar muti-env-config.jar --spring.profiles.active=test
```
**方式3:maven打包时候设置环境**
-P参数指定
```
mvn package -P test 
```

@Profile可以指定Bean在何种环境下才会创建
可以放在类上或者方法上,比如和@Configuration或者@Component或者@Bean一起使用
```java
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional({ProfileCondition.class})
public @interface Profile {
    String[] value();
}
```
以下只有环境变量为product时才会创建(spring.profiles.active="product")
```java
@Log
@Configuration
@Profile("product")
public class DemoConfig {
    @Bean
    public User user(){
        log.info("创建User对象");
        return new User();

    }
}
```


### 8.6.3. 注解ConfigurationProperties注入yml配置文件中的数据
<a href="#menu" >目录</a>

在使用SpringBoot开发中需要将一些配置参数放在yml文件中定义，再通过Java类来引入这些配置参数

SpringBoot提供了一些注解来实现这个功能
* ConfigurationProperties
* Value
* EnableConfigurationProperties


@ConfigurationProperties 的基本用法非常简单:我们为每个要捕获的外部属性提供一个带有字段的类。请注意以下几点:
* 前缀定义了哪些外部属性将绑定到类的字段上
* 根据 Spring Boot 宽松的绑定规则，类的属性名称必须与外部属性的名称匹配
* 我们可以简单地用一个值初始化一个字段来定义一个默认值
* 类本身可以是包私有的
* 类的字段必须有公共 setter 方法

#### 8.6.3.1. Spring 宽松绑定规则 (relaxed binding)

Spring使用一些宽松的绑定属性规则。因此，以下变体都将绑定到 hostName 属性上:
```yml
mail.hostName=127.0.0.1
mail.hostname=127.0.0.1
mail.host_name=127.0.0.1
mail.host-name=127.0.0.1
mail.HOST_NAME=127.0.0.1
```

#### 8.6.3.2. 基本使用
下面提供例子来说明如何引入常规变量，数组，List，Ｍap,引用对象。

**引入pom**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>

<dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-configuration-processor</artifactId>
      <optional>true</optional>
</dependency>

<!--lombok 插件，非必须 -->
 <dependency> 
　　　<groupId>org.projectlombok</groupId> 
　　　<artifactId>lombok</artifactId> 
　　　<optional>true</optional> 
</dependency>
```
**注解类**
这里定义了一个全局的注解类，

```java
@Data
@ToString
@ConfigurationProperties(prefix = "all")
public class AllConfigurationProperties {

    //普通变量
    private  String name;
　　 //引用对象
    private  OtherProperties other = new OtherProperties();
    //数组
    private  String[] server;
   //list
    private List list;
    //map
    private Map map;
   //复杂map
    private Map<String, ModuleConfig> modules = new LinkedHashMap();
   //复杂list
    private List<ModuleConfig> modulesList;

    //
    public static class Security{

        //对应属性: all.security.name
         private  String name;
    }

}
```
ConfigurationProperties:标明者是一个配置类，需要prefix配置yml中的配置前缀。

需要注意几点
1. 配置类中的名称应当符合JavaＢean的命名方式
2. 配置类中的名称应当与yml中的相同，否则应使用@Value指定
比如
```yml
yml文件：

all:
　　name: libai
------------------------------------

＠Ｖalue("${all.name}")
private String myName;
```
3. 如果已经使用@Value方式，可不用写Setter方法。否则必须为该变量写Setter方法，这里使用lombok的注解@Data来配置，会自动生成Ｓetter,Getter,ToString方法

4. 默认值设置：
　　（１）当使用@Value时，可以通过如下方式实现
        @Value("${nzrpc.netty.port:8321}")
     　　private int nport;
　　　　　当yml没有配置nzrpc.netty.port　时，默认值便是8321
　　(2) 或者是直接对变量赋值
　　　　private int nport　＝　8321　;
　　　　private  OtherProperties other = new OtherProperties();

上述配置类的引用对象
```java
@Data
public class ModuleConfig {
    private static final long serialVersionUID = 5508512956753757169L;
    private String name;
    private String version;
    private String owner;
}

@Data
public class OtherProperties {

    private  Long id;
    private String version;
}
```
**使能配置类**
```java
@Slf4j
//通过这个注解使能配置类
@EnableConfigurationProperties(AllConfigurationProperties.class)
@Configuration
public class AutoConfiguration {

    @Autowired
    AllConfigurationProperties properties;

    @PostConstruct
    public void  init(){

        System.out.println("properties = " + properties);

    }

}
```
这里使用@EnableConfigurationProperties使能配置类。它会为AllConfigurationProperties注入yml中的配置参数，并创建一个bean，后续可使用@Autowired注入使用@Configuration注明这是一个SpringＢoot的配置类使用方法init()输出配置.

**yml中配置**

```yml
all:
  name: libai
  other:
    id: 100
    version: 1.0.1

  server:
    - 127.0.0.1
    - 127.0.0.2
    - 127.0.0.3

  list:
    - 111
    - 222
    - 333

  map:
    key1: value1
    key2: value2
    key3: value3

  modules:
    key1:
      name: modules-name-1
      version: modules-version-1
      owner: modules-owner-1
    key2:
      name: modules-name-2
      version: modules-version-2
      owner: modules-owner-2

  modulesList:
    - name: modules-name-3
      version: modules-version-3
      owner: modules-owner-3
    - name: modules-name-4
      version: modules-version-4
      owner: modules-owner-4
```
**输出**
```yml
properties =
 AllConfigurationProperties(
 name=libai, 
 other=OtherProperties(id=100, version=1.0.1),
 server=[127.0.0.1, 127.0.0.2, 127.0.0.3], 
 list=[111, 222, 333],
 map={
　　　key1=value1,
　　　 key2=value2, 
　　　key3=value3
　　　}, 
 modules={
　　　key1=ModuleConfig(name=modules-name-1, version=modules-version-1, owner=modules-owner-1),
　　 key2=ModuleConfig(name=modules-name-2, version=modules-version-2, owner=modules-owner-2)
　　　}, 
 modulesList=[
　　　ModuleConfig(name=modules-name-3, version=modules-version-3, owner=modules-owner-3), 
　　　ModuleConfig(name=modules-name-4, version=modules-version-4, owner=modules-owner-4)
　　　])
```
#### 8.6.3.3. 带验证的配置

```java
@ConfigurationProperties(prefix="acme")
@Validated
public class AcmeProperties {
    @NotNull
    private InetAddress remoteAddress;
    @Valid
    private final Security security = new Security();
    // ... getters and setters
    public static class Security {
        @NotEmpty
        public String username;
        // ... getters and setters
    }
}
```

#### 8.6.3.4. @ConfigurationProperties vs. @Value


### 8.6.4. 使用随机数

<a href="#menu" >目录</a>

在yaml配置文件中使用${random.int}即可获得一个随机的int型数据。

|名称|描述|
|---|---|
|${random.value}|取得随机字符串
|${random.int}	|取得随机int型数据
|${random.long}	|取得随机long型数据
|${random.int(10)}	|取得10以内的随机数
|${random.int[10,20]}	|取得10~20的随机数

### 8.6.5. 从命令行指定参数

```
java -jar xx.jar --server.port=8001
```

### 8.6.6. 配置日志

默认情况下， Spring Boot会用Logback（ http://logback.qos.ch）来记录日志，并用INFO级别输出到控制台

如果需要切换LogBack日志,则需要引入对应该日志实现的起步依赖，同时排除掉Logback。
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-log4j</artifactId>
</dependency>
    
```

日志相关配置
```yml
 4. LOGGING
logging.config=  Location of the logging configuration file. For instance, `classpath:logback.xml` for Logback.
logging.exception-conversion-word=%wEx  Conversion word used when logging exceptions.
logging.file=  Log file name (for instance, `myapp.log`). Names can be an exact location or relative to the current directory.
logging.file.max-history=0  Maximum of archive log files to keep. Only supported with the default logback setup.
logging.file.max-size=10MB  Maximum log file size. Only supported with the default logback setup.
logging.level.*=  Log levels severity mapping. For instance, `logging.level.org.springframework=DEBUG`.
logging.path=  Location of the log file. For instance, `/var/log`.
logging.pattern.console=  Appender pattern for output to the console. Supported only with the default Logback setup.
logging.pattern.dateformat=yyyy-MM-dd HH:mm:ss.SSS  Appender pattern for log date format. Supported only with the default Logback setup.
logging.pattern.file=  Appender pattern for output to a file. Supported only with the default Logback setup.
logging.pattern.level=%5p  Appender pattern for log level. Supported only with the default Logbacksetup.
logging.register-shutdown-hook=false  Register a shutdown hook for the logging system when it is initialized.
```

```yml
logging:
    level:
        root: WARN
        org:
            springframework:
                security: DEBUG

logging:
    level:
        root: WARN
        org.springframework.security: DEBUG

#如果你还是想要完全掌控日志配置，但是又不想用logback.xml作为Logback配置的名字，可以通过logging.config属性指定自定义的名字：
logging:
    config: classpath:logging-config.xml
```
## 8.7. 启动类 @SpringBootApplication 注解 
<a href="#menu" >目录</a>

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.boot.autoconfigure;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
public @interface SpringBootApplication {
    @AliasFor(
        annotation = EnableAutoConfiguration.class
    )
    Class<?>[] exclude() default {};

    @AliasFor(
        annotation = EnableAutoConfiguration.class
    )
    String[] excludeName() default {};

    @AliasFor(
        annotation = ComponentScan.class,
        attribute = "basePackages"
    )
    String[] scanBasePackages() default {};

    @AliasFor(
        annotation = ComponentScan.class,
        attribute = "basePackageClasses"
    )
    Class<?>[] scanBasePackageClasses() default {};
}

```

从上面可以看到@SpringBootApplication是一个组合注解，用于快捷配置启动类。由@SpringBootConfiguration和@EnableAutoConfiguration以及@ComponentScan组合而成.
@SpringBootApplication开启了Spring的组件扫描和Spring Boot的自动配置功能.实际上， @SpringBootApplication将三个有用的注解组合在了一起。

### 8.7.1. @Inherited 注解
关于java中元注解Inherited 的使用说明

首先解释下元注解，就是用来中声明注解类型时需要使用到的注解。

Inherited作用是，使用此注解声明出来的自定义注解，在使用此自定义注解时，如果注解在类上面时，子类会自动继承此注解，否则的话，子类不会继承此注解。这里一定要记住，使用Inherited声明出来的注解，只有在类上使用时才会有效，对方法，属性等其他无效。

### 8.7.2. @SpringBootConfiguration
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface SpringBootConfiguration {
}


```


@SpringBootConfiguration继承自@Configuration，二者功能也一致，标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到spring容器中，并且实例名就是方法名。



### 8.7.3. @EnableAutoConfiguration
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import({AutoConfigurationImportSelector.class})
public @interface EnableAutoConfiguration {
    String ENABLED_OVERRIDE_PROPERTY = "spring.boot.enableautoconfiguration";

    Class<?>[] exclude() default {};

    String[] excludeName() default {};
}
```
@EnableAutoConfiguration 简单概括一下就是，借助@Import的支持，收集和注册特定场景相关的bean定义。
* @EnableScheduling是通过@Import将Spring调度框架相关的bean定义都加载到IoC容器。
* @EnableMBeanExport是通过@Import将JMX相关的bean定义加载到IoC容器。
而@EnableAutoConfiguration也是借助@Import的帮助，将所有符合自动配置条件的bean定义加载到IoC容器，仅此而已！

其中，最关键的要属@Import(AutoConfigurationImportSelector.class)，借助AutoConfigurationImportSelector，@EnableAutoConfiguration可以帮助SpringBoot应用将所有符合条件的@Configuration配置都加载到当前SpringBoot创建并使用的IoC容器。

![](https://img-blog.csdn.net/20180731144007172?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI4Mjg5NDA1/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

自动配置幕后英雄：SpringFactoriesLoader详解
SpringFactoriesLoader属于Spring框架私有的一种扩展方案，其主要功能就是从指定的配置文件META-INF/spring.factories加载配置。

配合@EnableAutoConfiguration使用的话，它更多是提供一种配置查找的功能支持，即根据@EnableAutoConfiguration的完整类名org.springframework.boot.autoconfigure.EnableAutoConfiguration作为查找的Key,获取对应的一组@Configuration类

所以，@EnableAutoConfiguration自动配置的魔法骑士就变成了：从classpath中搜寻所有的META-INF/spring.factories配置文件，并将其中org.springframework.boot.autoconfigure.EnableutoConfiguration对应的配置项通过反射（Java Refletion）实例化为对应的标注了@Configuration的JavaConfig形式的IoC容器配置类，然后汇总为一个并加载到IoC容器。

### 8.7.4. @ComponentScan
```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Repeatable(ComponentScans.class)
public @interface ComponentScan {
    @AliasFor("basePackages")
    String[] value() default {};

    @AliasFor("value")
    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Class<? extends BeanNameGenerator> nameGenerator() default BeanNameGenerator.class;

    Class<? extends ScopeMetadataResolver> scopeResolver() default AnnotationScopeMetadataResolver.class;

    ScopedProxyMode scopedProxy() default ScopedProxyMode.DEFAULT;

    String resourcePattern() default "**/*.class";

    boolean useDefaultFilters() default true;

    ComponentScan.Filter[] includeFilters() default {};

    ComponentScan.Filter[] excludeFilters() default {};

    boolean lazyInit() default false;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({})
    public @interface Filter {
        FilterType type() default FilterType.ANNOTATION;

        @AliasFor("classes")
        Class<?>[] value() default {};

        @AliasFor("value")
        Class<?>[] classes() default {};

        String[] pattern() default {};
    }
}

```
1. @ComponentScan这个注解在Spring中很重要，它对应XML配置中的元素，@ComponentScan的功能其实就是自动扫描并加载符合条件的组件（比如@Component和@Repository等）或者bean定义，最终将这些bean定义加载到IoC容器中。

我们可以通过basePackages等属性来细粒度的定制@ComponentScan自动扫描的范围，如果不指定，则默认Spring框架实现会从声明@ComponentScan所在类的package进行扫描。

注：所以SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages。

2. @ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。

例如，如果你有个类用@Controller注解标识了，那么，如果不加上@ComponentScan，自动扫描该controller，那么该Controller就不会被spring扫描到，更不会装入spring容器中，因此你配置的这个Controller也没有意义。
3. 参数的作用
* basePackageClasses：对basepackages()指定扫描注释组件包类型安全的替代。
* excludeFilters：指定不适合组件扫描的类型。
* includeFilters：指定哪些类型有资格用于组件扫描。
* lazyInit：指定是否应注册扫描的beans为lazy初始化。
* nameGenerator：用于在Spring容器中的检测到的组件命名。
* resourcePattern：控制可用于组件检测的类文件。
* scopedProxy：指出代理是否应该对检测元件产生，在使用过程中会在代理风格时尚的范围是必要的。
* scopeResolver：用于解决检测到的组件的范围。
* useDefaultFilters：指示是否自动检测类的注释 

## 8.8. 条件化注解
<a href="#menu" >目录</a>

* @ConditionalOnBean 配置了某个特定Bean
* @ConditionalOnMissingBean 没有配置特定的Bean
* @ConditionalOnClass Classpath里有指定的类
* @ConditionalOnMissingClass Classpath里缺少指定的类
* @ConditionalOnExpression 给定的Spring Expression Language（ SpEL）表达式计算结果为true
* @ConditionalOnJava Java的版本匹配特定值或者一个范围值
* @ConditionalOnJndi 参数中给定的JNDI位置必须存在一个，如果没有给参数，则要有JNDI InitialContext
* @ConditionalOnProperty 指定的配置属性要有一个明确的值
* @ConditionalOnResource Classpath里有指定的资源
* @ConditionalOnWebApplication 这是一个Web应用程序
* @ConditionalOnNotWebApplication 这不是一个Web应用程序

```java

@Configuration
@@ConditionalOnClass({xxxx.class,yyyy.class})
public XxxConfig(){
    
}
```

## 8.9. Spring Boot Starter
<a href="#menu" >目录</a>

Starter是Spring Boot中的一个非常重要的概念，Starter相当于模块，它能将模块所需的依赖整合起来并对模块内的Bean根据环境（ 条件）进行自动配��。使用者只需要依赖相应功能的Starter，无需做过多的配置和依赖，Spring Boot就能自动扫描并加载相应的模块

* 总结：
    * 1.它整合了这个模块需要的依赖库；
    * 2.提供对模块的配置项给使用者；
    * 3.提供自动配置类对模块内的Bean进行自动装配；

例如，在Maven的依赖中加入spring-boot-starter-web就能使项目支持Spring MVC，并且Spring Boot还为我们做了很多默认配置，无需再依赖spring-web、spring-webmvc等相关包及做相关配置就能够立即使用起来


### 8.9.1. 常用的Starter
<a href="#menu" >目录</a>

```
spring-boot-starter-activemq
spring-boot-starter-actuator
spring-boot-starter-aop
spring-boot-starter-cache
spring-boot-starter-data-jpa
spring-boot-starter-web
spring-boot-starter-redis
```
### 8.9.2. 创建自己的Starter
<a href="#menu" >目录</a>

* 步骤
    * 1.新建Maven项目，在项目的POM文件中定义使用的依赖；
    * 2.新建配置类，写好配置项和默认的配置值，指明配置项前缀；
    * 3.新建自动装配类，使用@Configuration和@Bean来进行自动装配；
    * 4.新建spring.factories文件，指定Starter的自动装配类；

**引入依赖**

创建Maven项目,引入依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

**创建配置类**
```java

@Configuration
public class XxxConfiguration{

    @Bean
    xxxx
}
```

如果需要使用配置类
```java
@Data
@ConfigurationProperties(prefix = "test.test")
public class Properties {

    private String  data;
}
```
同时在XxxConfiguration添加注解EnableConfigurationProperties指定属性配置类
```java
@EnableConfigurationProperties(Properties.class)
@Configuration
public class XxxConfiguration{

    @Autowired
    Properties properties;
    
    @Bean
    xxxx
}
```
**指定配置类**

方式１: 
在resource中创建文件 META-INF/spring.factories
文件内容为
```yml
org.springframework.boot.autoconfigure.EnableAutoConfiguration=xx.xx.xx.XxxConfiguration
```
使用mave打包,其他项目使用时引入该包的依赖即可.

因为其他的SpringBoot项目中如果不指定这个配置类的扫描路径.这个配置类是不会加载的.因此使用上面的方式,SpringBoot启动时会扫描META-INF/spring.factories文件,从而确定依赖包中需要加载的配置类.

方式１直接引入依赖，则会自动加载XxxConfiguration并创建符合条件的bean

方式２：

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(XxxConfiguration.class)
public @interface EnableXxxConfig {
}
```
在启动类上加上上面的注解即可。


### 8.9.3. Starter原理
<a href="#menu" >目录</a>

在Spring Boot中有一种非常解耦的扩展机制：Spring Factories。这种扩展机制实际上是仿照Java中的SPI扩展机制来实现的。

Java SPI机制SPI的全名为Service Provider Interface.大多数开发人员可能不熟悉，因为这个是针对厂商或者插件的。在java.util.ServiceLoader的文档里有比较详细的介绍。简单的总结下java spi机制的思想。我们系统里抽象的各个模块，往往有很多不同的实现方案，比如日志模块的方案，xml解析模块、jdbc模块的方案等。面向的对象的设计里，我们一般推荐模块之间基于接口编程，模块之间不对实现类进行硬编码。一旦代码里涉及具体的实现类，就违反了可拔插的原则，如果需要替换一种实现，就需要修改代码。为了实现在模块装配的时候能不在程序里动态指明，这就需要一种服务发现机制。 java spi就是提供这样的一个机制：为某个接口寻找服务实现的机制。有点类似IOC的思想，就是将装配的控制权移到程序之外，在模块化设计中这个机制尤其重要。

**Java SPI约定**

java spi的具体约定为:当服务的提供者，提供了服务接口的一种实现之后，在jar包的META-INF/services/目录里同时创建一个以服务接口命名的文件。该文件里就是实现该服务接口的具体实现类。而当外部程序装配这个模块的时候，就能通过该jar包META-INF/services/里的配置文件找到具体的实现类名，并装载实例化，完成模块的注入。 基于这样一个约定就能很好的找到服务接口的实现类，而不需要再代码里制定。jdk提供服务实现查找的一个工具类：java.util.ServiceLoader

**Spring Boot中的SPI机制**

在Spring中也有一种类似与Java SPI的加载机制。它在META-INF/spring.factories文件中配置接口的实现类名称，然后在程序中读取这些配置文件并实例化。这种自定义的SPI机制是Spring Boot Starter实现的基础。


**Spring Factories实现原理**

spring-core包里定义了SpringFactoriesLoader类，这个类实现了检索META-INF/spring.factories文件，并获取指定接口的配置的功能。在这个类中定义了两个对外的方法：

loadFactories。根据接口类获取其实现类的实例，这个方法返回的是对象列表。

loadFactoryNames。根据接口获取其接口类的名称，这个方法返回的是类名的列表。

上面的两个方法的关键都是从指定的ClassLoader中获取spring.factories文件，并解析得到类名列表，具体代码如下图。

org.springframework.core.io.support.SpringFactoriesLoader
```java
public static List<String> loadFactoryNames(Class<?> factoryClass, @Nullable ClassLoader classLoader) {
    String factoryClassName = factoryClass.getName();
    return (List)loadSpringFactories(classLoader).getOrDefault(factoryClassName, Collections.emptyList());
}

private static Map<String, List<String>> loadSpringFactories(@Nullable ClassLoader classLoader) {
    MultiValueMap<String, String> result = (MultiValueMap)cache.get(classLoader);
    if (result != null) {
        return result;
    } else {
        try {
            Enumeration<URL> urls = classLoader != null ? classLoader.getResources("META-INF/spring.factories") : ClassLoader.getSystemResources("META-INF/spring.factories");
            LinkedMultiValueMap result = new LinkedMultiValueMap();

            while(urls.hasMoreElements()) {
                URL url = (URL)urls.nextElement();
                UrlResource resource = new UrlResource(url);
                Properties properties = PropertiesLoaderUtils.loadProperties(resource);
                Iterator var6 = properties.entrySet().iterator();

                while(var6.hasNext()) {
                    Entry<?, ?> entry = (Entry)var6.next();
                    String factoryClassName = ((String)entry.getKey()).trim();
                    String[] var9 = StringUtils.commaDelimitedListToStringArray((String)entry.getValue());
                    int var10 = var9.length;

                    for(int var11 = 0; var11 < var10; ++var11) {
                        String factoryName = var9[var11];
                        result.add(factoryClassName, factoryName.trim());
                    }
                }
            }

            cache.put(classLoader, result);
            return result;
        } catch (IOException var13) {
            throw new IllegalArgumentException("Unable to load factories from location [META-INF/spring.factories]", var13);
        }
    }
}
```

**加载factories文件**

从代码中我们可以知道，在这个方法中会遍历整个ClassLoader中所有jar包下的spring.factories文件。也就是说我们可以在自己的jar中配置spring.factories文件，不会影响到其它地方的配置，也不会被别人的配置覆盖。

spring.factories的是通过Properties解析得到的，所以我们在写文件中的内容都是安装下面这种方式配置的：

com.xxx.interface=com.xxx.classname

如果一个接口希望配置多个实现类，可以使用','进行分割。

对于loadFactories方法而言，在获取类列表的基础上，还有进行实例化的过程。





## 8.10. Actuator 的端点

### 8.10.1. 揭秘 Actuator 的端点
<a href="#menu" >目录</a>

Spring Boot Actuator的关键特性是在应用程序里提供众多Web端点，通过它们了解应用程序运行时的内部状况。有了Actuator，你可以知道Bean在Spring应用程序上下文里是如何组装在一起的，掌握应用程序可以获取的环境属性信息，获取运行时度量信息的快照

**Actuator提供了13个端点**

|HTTP方法 |路 径 |描 述
|---|---|---|
|GET |/autoconfig |提供了一份自动配置报告，记录哪些自动配置条件通过了，哪些没通过
|GET |/configprops |描述配置属性（包含默认值）如何注入Bean
|GET |/beans |描述应用程序上下文里全部的Bean，以及它们的关系
|GET |/dump |获取线程活动的快照
|GET |/env |获取全部环境属性
|GET |/env/{name} |根据名称获取特定的环境属性值
|GET |/health |报告应用程序的健康指标，这些值由HealthIndicator的实现类提供
|GET |/info |获取应用程序的定制信息，这些信息由info打头的属性提供
|GET |/mappings |描述全部的URI路径，以及它们和控制器（包含Actuator端点）的映射关系
|GET |/metrics |报告各种应用程序度量信息，比如内存用量和HTTP请求计数
|GET |/metrics/{name} |报告指定名称的应用程序度量值
|POST |/shutdown |关闭应用程序，要求endpoints.shutdown.enabled设置为true
|GET |/trace |提供基本的HTTP请求跟踪信息（时间戳、 HTTP头等）

要启用Actuator的端点，只需在项目中引入Actuator的起步依赖即可
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

**ACTUATOR 配置**
```yml
 5. ----------------------------------------
 6. ACTUATOR PROPERTIES
 7. ----------------------------------------
 8. MANAGEMENT HTTP SERVER (ManagementServerProperties)
management.server.add-application-context-header=false  Add the "X-Application-Context" HTTP header in each response.
management.server.address=  Network address to which the management endpoints should bind. Requires a custom management.server.port.
management.server.port=  Management endpoint HTTP port (uses the same port as the application by default). Configure a different port to use management-specific SSL.
management.server.servlet.context-path=  Management endpoint context-path (for instance, `/management`). Requires a custom management.server.port.
management.server.ssl.ciphers=  Supported SSL ciphers. Requires a custom management.port.
management.server.ssl.client-auth=  Whether client authentication is wanted ("want") or needed ("need"). Requires a trust store. Requires a custom management.server.port.
management.server.ssl.enabled=  Whether to enable SSL support. Requires a custom management.server.port.
management.server.ssl.enabled-protocols=  Enabled SSL protocols. Requires a custom management.server.port.
management.server.ssl.key-alias=  Alias that identifies the key in the key store. Requires a custom management.server.port.
management.server.ssl.key-password=  Password used to access the key in the key store. Requires a custom management.server.port.
management.server.ssl.key-store=  Path to the key store that holds the SSL certificate (typically a jks file). Requires a custom management.server.port.
management.server.ssl.key-store-password=  Password used to access the key store. Requires a custom management.server.port.
management.server.ssl.key-store-provider=  Provider for the key store. Requires a custom management.server.port.
management.server.ssl.key-store-type=  Type of the key store. Requires a custom management.server.port.
management.server.ssl.protocol=TLS  SSL protocol to use. Requires a custom management.server.port.
management.server.ssl.trust-store=  Trust store that holds SSL certificates. Requires a custom management.server.port.
management.server.ssl.trust-store-password=  Password used to access the trust store. Requires a custom management.server.port.
management.server.ssl.trust-store-provider=  Provider for the trust store. Requires a custom management.server.port.
management.server.ssl.trust-store-type=  Type of the trust store. Requires a custom management.server.port.
 9. CLOUDFOUNDRY
management.cloudfoundry.enabled=true  Whether to enable extended Cloud Foundry actuator endpoints.
management.cloudfoundry.skip-ssl-validation=false  Whether to skip SSL verification for Cloud Foundry actuator endpoint security calls.
 10. ENDPOINTS GENERAL CONFIGURATION
management.endpoints.enabled-by-default=  Whether to enable or disable all endpoints by default.
 11. ENDPOINTS JMX CONFIGURATION (JmxEndpointProperties)
management.endpoints.jmx.domain=org.springframework.boot  Endpoints JMX domain name. Fallback to 'spring.jmx.default-domain' if set.
management.endpoints.jmx.exposure.include=*  Endpoint IDs that should be included or '*' for all.
management.endpoints.jmx.exposure.exclude=  Endpoint IDs that should be excluded.
management.endpoints.jmx.static-names=  Additional static properties to append to all ObjectNames of MBeans representing Endpoints.
management.endpoints.jmx.unique-names=false  Whether to ensure that ObjectNames are modified in case of conflict.
 12. ENDPOINTS WEB CONFIGURATION (WebEndpointProperties)
 13. 配置开放的端点
management.endpoints.web.exposure.include=health,info  Endpoint IDs that should be included or '*' for all.
 14. 配置不包括的端点
management.endpoints.web.exposure.exclude=  Endpoint IDs that should be excluded
```

运行之后访问 http://localhost:8080/actuator

显示的开放的端点
```yml
{"_links":
    {"self":{"href":"http://localhost:8080/actuator","templated":false},
    "health-component":{"href":"http://localhost:8080/actuator/health/{component}","templated":true},
    "health-component-instance":{"href":"http://localhost:8080/actuator/health/{component}/{instance}","templated":true},
    "health":{"href":"http://localhost:8080/actuator/health","templated":false},
    "info":{"href":"http://localhost:8080/actuator/info","templated":false}
    }
}
```
如果要看到所有支持的状态查询，需要配置
```yml
management.endpoints.web.exposure.include=*
```

### 8.10.2. 自定义监控
<a href="#menu" >目录</a>

* @Endpoint(id="test") 指定端点的名称,id开头必须是小写,此注解必须
* @ReadOperation 访问端点时返回的数据
```java
@Component
@Endpoint(id="test")
public class MyActuator {


    @ReadOperation
    public Map display(){
        Map<String,String> data = new HashMap<>();

        data.put("key1","value1");
        data.put("key2","value2");

        return data;
    }
}
```
访问地址:http://localhost:8080/actuator/test
将会显示
```json
{"key1":"value1","key2":"value2"}
```


## 8.11. Spring Boot 项目发布
<a href="#menu" >目录</a>


* maven中的三种工程：
    * pom工程：用在父级工程或聚合工程中。用来做jar包的版本控制。
    * war工程：将会打包成war，发布在服务器上的工程。如网站或服务。
    * jar工程：将会打包成jar用作jar包使用。

* Spring boot项目通常情况下有如下几种启动方式：
    * 通过主类启动。
    * 通过spring-boot的maven插件spring-boot-maven-plugin方式启动。  
    * 通过可执行jar/war包方式启动。
    * 通过Servlet容器启动，如Tomcat、Jetty等(打包成war)。


## 8.12. Maven打包

**打包方式配置**

POM 文件中添加打包方式,默认的打包方式是jar
```xml
<packaging>jar|pom|war</packaging> 
```
POM 文件中添加了“org.springframework.boot:spring-boot-maven-plugin"插件。在添加了该插件之后，当运行“mvn package"进行打包时，会打包成一个可以直接运行的 JAR 文件，使用“Java -jar"命令就可以直接运行。这在很大程度上简化了应用的部署，只需要安装了 JRE 就可以运行。

**添加插件**
在添加了该插件之后，当运行“mvn package"进行打包时，会打包成一个可以直接运行的 JAR 文件，使用“Java -jar"命令就可以直接运行。这在很大程度上简化了应用的部署，只需要安装了 JRE 就可以运行。
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.1.8.RELEASE</version>
            <configuration>
                <!-- 指定启动类-->
                <mainClass>com.xx.webapps.api.main.WebappsApiBidMain</mainClass>
                <layout>ZIP</layout>
            </configuration>
            <executions>
                <execution>
                <goals>
                    <goal>repackage</goal>
                </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
* Spring Boot Maven plugin的5个Goals
    * spring-boot:repackage，默认goal。在mvn package之后，再次打包可执行的jar/war，同时保留mvn package生成的jar/war为.origin
    * spring-boot:run，运行Spring Boot应用
    * spring-boot:start，在mvn integration-test阶段，进行Spring Boot应用生命周期的管理
    * spring-boot:stop，在mvn integration-test阶段，进行Spring Boot应用生命周期的管理
    * spring-boot:build-info，生成Actuator使用的构建信息文件build-info.properties


**启动项目**

* 使用maven打包成jar可执行文件
```
mvn package 
```
打包的文件位于target目录中
```yml
 15. war文件也可以使用该方式运行
java -jar  xxx.jar 
```
* 直接使用插件运行

同时配置运行环境spring-boot.run.profiles.
```
mvn  spring-boot:run -Dspring-boot.run.profiles=xxx
```
更多参数参考[官方文档:https://docs.spring.io/spring-boot/docs/current/maven-plugin/run-mojo.html](https://docs.spring.io/spring-boot/docs/current/maven-plugin/run-mojo.html)


* 不推荐用war，因为springboot适合前后端分离，打成jar进行部署更合适。


## 8.13. Spring Boot原理分析
<a href="#menu" >目录</a>


### 8.13.1. 启动流程分析
<a href="#menu" >目录</a>

1.  如果我们使用的是SpringApplication的静态run方法，那么，这个方法里面首先要创建一个SpringApplication对象实例，然后调用这个创建好的SpringApplication的实例方法。在SpringApplication实例初始化的时候，它会提前做几件事情：

* 根据classpath里面是否存在某个特征类（org.springframework.web.context.ConfigurableWebApplicationContext）来决定是否应该创建一个为Web应用使用的ApplicationContext类型。
* 使用SpringFactoriesLoader在应用的classpath中查找并加载所有可用的ApplicationContextInitializer。
* 使用SpringFactoriesLoader在应用的classpath中查找并加载所有可用的ApplicationListener。
* 推断并设置main方法的定义类。


#### 8.13.1.1. 创建SpringApplication对象
<a href="#menu" >目录</a>

**main方法启动**
```java
@SpringBootApplication
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
public static ConfigurableApplicationContext run(Class<?> primarySource, String... args) {
    return run(new Class[]{primarySource}, args);
}

```
**创建SpringApplication对象**
```java
public static ConfigurableApplicationContext run(Class<?>[] primarySources, String[] args) {
    return (new SpringApplication(primarySources)).run(args);
}
public SpringApplication(ResourceLoader resourceLoader, Class... primarySources) {
        this.sources = new LinkedHashSet();
        this.bannerMode = Mode.CONSOLE;
        this.logStartupInfo = true;
        this.addCommandLineProperties = true;
        this.addConversionService = true;
        this.headless = true;
        this.registerShutdownHook = true;
        this.additionalProfiles = new HashSet();
        this.isCustomEnvironment = false;
        this.resourceLoader = resourceLoader;
        Assert.notNull(primarySources, "PrimarySources must not be null");
        this.primarySources = new LinkedHashSet(Arrays.asList(primarySources));
        
        this.webApplicationType = WebApplicationType.deduceFromClasspath();
        /**
        
        */
        this.setInitializers(this.getSpringFactoriesInstances(ApplicationContextInitializer.class));
        this.setListeners(this.getSpringFactoriesInstances(ApplicationListener.class));
        this.mainApplicationClass = this.deduceMainApplicationClass();
    }
    
```

* **deduceFromClasspath**
获取应用类型:NONE(非web项目), SERVLET(web mvc 项目),REACTIVE(WebFlux 项目);
1.如果类路径中含有org.springframework.web.reactive.DispatcherHandler,则为REACTIVE应用(引入包:org.springframework.boot:spring-boot-starter-webflux)
2.如果含有类javax.servlet.Servlet和org.springframework.web.context.ConfigurableWebApplicationContext,则为SERVLET应用(引入包:org.springframework.boot:spring-boot-starter-web)
3.否则为NONE        
```java
private static final String[] SERVLET_INDICATOR_CLASSES = new String[]{"javax.servlet.Servlet", "org.springframework.web.context.ConfigurableWebApplicationContext"};
    
static WebApplicationType deduceFromClasspath() {
        if (ClassUtils.isPresent("org.springframework.web.reactive.DispatcherHandler", (ClassLoader)null) && !ClassUtils.isPresent("org.springframework.web.servlet.DispatcherServlet", (ClassLoader)null) && !ClassUtils.isPresent("org.glassfish.jersey.servlet.ServletContainer", (ClassLoader)null)) {
            return REACTIVE;
        } else {
            String[] var0 = SERVLET_INDICATOR_CLASSES;
            int var1 = var0.length;

            for(int var2 = 0; var2 < var1; ++var2) {
                String className = var0[var2];
                if (!ClassUtils.isPresent(className, (ClassLoader)null)) {
                    return NONE;
                }
            }

            return SERVLET;
        }
    }
```

* **setInitializers**
初始化 classpath 下的所有的可用的 ApplicationContextInitializer。

```java
private <T> Collection<T> getSpringFactoriesInstances(Class<T> type) {
    return this.getSpringFactoriesInstances(type, new Class[0]);
}
//获取所有的 Spring 工厂实例
private <T> Collection<T> getSpringFactoriesInstances(Class<T> type, Class<?>[] parameterTypes, Object... args) {
    ClassLoader classLoader = this.getClassLoader();
    //获取所有 Spring Factories 的名字
    Set<String> names = new LinkedHashSet(SpringFactoriesLoader.loadFactoryNames(type, classLoader));
    List<T> instances = this.createSpringFactoriesInstances(type, parameterTypes, classLoader, args, names);
    //Spring 工厂实例排序
    AnnotationAwareOrderComparator.sort(instances);
    return instances;
}

public static List<String> loadFactoryNames(Class<?> factoryClass, @Nullable ClassLoader classLoader) {
    String factoryClassName = factoryClass.getName();
    return (List)loadSpringFactories(classLoader).getOrDefault(factoryClassName, Collections.emptyList());
}
// SpringFactoriesLoader.loadFactoryNames() ，是从 META-INF/spring.factories 的资源文件中，读取相关的配置类名称
private static Map<String, List<String>> loadSpringFactories(@Nullable ClassLoader classLoader) {
    MultiValueMap<String, String> result = (MultiValueMap)cache.get(classLoader);
    if (result != null) {
        return result;
    } else {
        try {
            Enumeration<URL> urls = classLoader != null ? classLoader.getResources("META-INF/spring.factories") : ClassLoader.getSystemResources("META-INF/spring.factories");
            LinkedMultiValueMap result = new LinkedMultiValueMap();

            while(urls.hasMoreElements()) {
                URL url = (URL)urls.nextElement();
                UrlResource resource = new UrlResource(url);
                Properties properties = PropertiesLoaderUtils.loadProperties(resource);
                Iterator var6 = properties.entrySet().iterator();

                while(var6.hasNext()) {
                    Entry<?, ?> entry = (Entry)var6.next();
                    String factoryClassName = ((String)entry.getKey()).trim();
                    String[] var9 = StringUtils.commaDelimitedListToStringArray((String)entry.getValue());
                    int var10 = var9.length;

                    for(int var11 = 0; var11 < var10; ++var11) {
                        String factoryName = var9[var11];
                        result.add(factoryClassName, factoryName.trim());
                    }
                }
            }

            cache.put(classLoader, result);
            return result;
        } catch (IOException var13) {
            throw new IllegalArgumentException("Unable to load factories from location [META-INF/spring.factories]", var13);
        }
    }
 }

    
//根据读取到的名字创建对象（Spring 工厂实例）
private <T> List<T> createSpringFactoriesInstances(Class<T> type, Class<?>[] parameterTypes, ClassLoader classLoader, Object[] args, Set<String> names) {
    List<T> instances = new ArrayList(names.size());
    Iterator var7 = names.iterator();

    while(var7.hasNext()) {
        String name = (String)var7.next();

        try {
            Class<?> instanceClass = ClassUtils.forName(name, classLoader);
            Assert.isAssignable(type, instanceClass);
            Constructor<?> constructor = instanceClass.getDeclaredConstructor(parameterTypes);
            T instance = BeanUtils.instantiateClass(constructor, args);
            instances.add(instance);
        } catch (Throwable var12) {
            throw new IllegalArgumentException("Cannot instantiate " + type + " : " + name, var12);
        }
    }

    return instances;
}

    
```

* setInitializers()：
```java
public void setInitializers(
            Collection<? extends ApplicationContextInitializer<?>> initializers) {
  this.initializers = new ArrayList<>();
  this.initializers.addAll(initializers);
}
```

**setListeners((Collection) getSpringFactoriesInstances(ApplicationListener.class))：初始化 classpath 下的所有的可用的 ApplicationListener**
getSpringFactoriesInstances() 和上面的类似，但是它是从 META-INF/spring.factories 的资源文件中，获取到 key 为 org.springframework.context.ApplicationListener 的 value


**deduceMainApplicationClass() ：根据调用栈，推断出 main 方法的类名**
```java
private Class<?> deduceMainApplicationClass() {
    try {
        StackTraceElement[] stackTrace = (new RuntimeException()).getStackTrace();
        StackTraceElement[] var2 = stackTrace;
        int var3 = stackTrace.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            StackTraceElement stackTraceElement = var2[var4];
            if ("main".equals(stackTraceElement.getMethodName())) {
                return Class.forName(stackTraceElement.getClassName());
            }
        }
    } catch (ClassNotFoundException var6) {
    }

    return null;
}
```
上面看完了构造方法后，已经初始化了一个 SpringApplication 对象，接下来调用其 run 方法

#### 8.13.1.2. 执行Run方法
<a href="#menu" >目录</a>

```java
public static ConfigurableApplicationContext run(Class<?>[] primarySources, String[] args) {
    return (new SpringApplication(primarySources)).run(args);
}
//通过 SpringApplication 对象执行run方法   
//可变个数参数 args 即是我们整个应用程序的入口 main 方法的参数
public ConfigurableApplicationContext run(String... args) {
    
        //StopWatch 是来自 org.springframework.util 的工具类，可以用来方便的记录程序的运行时间。
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ConfigurableApplicationContext context = null;
        Collection<SpringBootExceptionReporter> exceptionReporters = new ArrayList();
        this.configureHeadlessProperty();
        //加载 SpringApplicationRunListener 对象
        SpringApplicationRunListeners listeners = this.getRunListeners(args);
        listeners.starting();

        Collection exceptionReporters;
        try {
            //获取启动时传入参数 args（main 方法传进来的参数） 并初始化为 ApplicationArguments 对象。
            ApplicationArguments applicationArguments = new DefaultApplicationArguments(args);
            //根据 listeners 和 applicationArguments 配置SpringBoot 应用的环境。
            ConfigurableEnvironment environment = this.prepareEnvironment(listeners, applicationArguments);
            //根据环境信息配置要忽略的 bean 信息
            this.configureIgnoreBeanInfo(environment);
            //打印Banner
            Banner printedBanner = this.printBanner(environment);
            //根据应用类型来确定该 Spring Boot 项目应该创建什么类型的 ApplicationContext ，默认情况下，如果没有明确设置的应用程序上下文或应用程序上下文类，该方法会在返回合适的默认值。
            //servlet  - org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
            //REACTIVE - org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext
            //默认 - org.springframework.context.annotation.AnnotationConfigApplicationContext
            context = this.createApplicationContext();
            //这里也是通过 SpringFactoriesLoader 加载 META-INF/spring.factories 中 key 为 SpringBootExceptionReporter 的。
            exceptionReporters = this.getSpringFactoriesInstances(SpringBootExceptionReporter.class, new Class[]{ConfigurableApplicationContext.class}, context);
            //完成整个容器的创建与启动以及 bean 的注入功能。
            this.prepareContext(context, environment, listeners, applicationArguments, printedBanner);
            //根据扫描到的类名,通过容器创建bean
            this.refreshContext(context);
            //在上下文刷新后调用该方法，其内部没有做任何操作。
            this.afterRefresh(context, applicationArguments);
            stopWatch.stop();
            if (this.logStartupInfo) {
                (new StartupInfoLogger(this.mainApplicationClass)).logStarted(this.getApplicationLog(), stopWatch);
            }
            //启动监听器
            listeners.started(context);
            this.callRunners(context, applicationArguments);
        } catch (Throwable var10) {
            this.handleRunFailure(context, var10, exceptionReporters, listeners);
            throw new IllegalStateException(var10);
        }

        try {
            listeners.running(context);
            return context;
        } catch (Throwable var9) {
            this.handleRunFailure(context, var9, exceptionReporters, (SpringApplicationRunListeners)null);
            throw new IllegalStateException(var9);
        }
    }
```
AbstractApplicationContext类
```java
public void refresh() throws BeansException, IllegalStateException {
        synchronized(this.startupShutdownMonitor) {
            /**
            * 1.这个方法设置context的启动日期。
            2.设置context当前的状态，是活动状态还是关闭状态。
            3.初始化context environment（上下文环境）中的占位符属性来源。
            4.验证所有必需的属性。
            */
            this.prepareRefresh();
            //让这个类（AbstractApplicationContext）的子类刷新内部bean工厂。实际上就是重新创建一个bean工厂。
            ConfigurableListableBeanFactory beanFactory = this.obtainFreshBeanFactory();
            //上一步已经把工厂建好了，但是还不能投入使用，因为工厂里什么都没有，还需要配置一些东西
            //配置这个工厂的标准环境，比如context的类加载器和后处理器
            this.prepareBeanFactory(beanFactory);

            try {
                /**
                上面对bean工厂进行了许多配置，现在需要对bean工厂进行一些处理。
                ①、添加一个ServletContextAwareProcessor到bean工厂中。
                ②、在bean工厂自动装配的时候忽略一些接口。如：ServletContextAware、ServletConfigAware
                ③、注册WEB应用特定的域（scope）到bean工厂中，以便WebApplicationContext可以使用它们。比如"request", "session", "globalSession", "application"，
                ④、注册WEB应用特定的Environment bean到bean工厂中，以便WebApplicationContext可以使用它们。如："contextParameters", "contextAttributes"
                */
                this.postProcessBeanFactory(beanFactory);
                //这一步也是对bean工厂进行一些处理。这一步主要是调用所有的bean工厂处理器（BeanFactoryPostProcessor）对bean工厂进行一些处理。这个方法必须在所有的singleton初始化之前调用。
                this.invokeBeanFactoryPostProcessors(beanFactory);
                /**
                注册用来拦截bean创建的BeanPostProcessor bean.这个方法需要在所有的application bean初始化之前调用。把这个注册的任务委托给了PostProcessorRegistrationDelegate来完成。
                */
                this.registerBeanPostProcessors(beanFactory);
                /*
                初始化MessageSource接口的一个实现类。这个接口提供了消息处理功能。主要用于国际化/i18n。
                */
                this.initMessageSource();
                /*
                为这个context初始化一个事件广播器（ApplicationEventMulticaster）。
                */
                this.initApplicationEventMulticaster();
                /*
                在AbstractApplicationContext的子类中初始化其他特殊的bean。其实就是初始化ThemeSource接口的实例。这个方法需要在所有单例bean初始化之前调用。
                */
                this.onRefresh();
                /*
                注册应用的监听器。就是注册实现了ApplicationListener接口的监听器bean，这些监听器是注册到ApplicationEventMulticaster中的。这不会影响到其它监听器bean。在注册完以后，还会将其前期的事件发布给相匹配的监听器
                */
                this.registerListeners();
                /*
                完成bean工厂的初始化工作。这一步非常复杂，也非常重要，涉及到了bean的创建。第二步中只是完成了BeanDefinition的定义、解析、处理、注册。但是还没有初始化bean实例。这一步将初始化所有非懒加载的单例bean。
                */
                this.finishBeanFactoryInitialization(beanFactory);
                /*
                完成context的刷新。主要是调用LifecycleProcessor的onRefresh()方法，并且发布事件（ContextRefreshedEvent）。
                */
                this.finishRefresh();
            } catch (BeansException var9) {
                if (this.logger.isWarnEnabled()) {
                    this.logger.warn("Exception encountered during context initialization - cancelling refresh attempt: " + var9);
                }

                this.destroyBeans();
                this.cancelRefresh(var9);
                throw var9;
            } finally {
                this.resetCommonCaches();
            }

        }
    }
```
## 8.14. 种保护 Spring Boot 应用的绝佳方法

### 8.14.1. 在生产中使用HTTPS

传输层安全性（TLS）是HTTPS的官方名称，你可能听说过它称为SSL（安全套接字层），SSL是已弃用的名称，TLS是一种加密协议，可通过计算机网络提供安全通信。其主要目标是确保计算机应用程序之间的隐私和数据完整性。

过去，TLS / SSL证书很昂贵，而且HTTPS被认为很慢，现在机器变得更快，已经解决了性能问题，Let's Encrypt提供免费的TLS证书,这两项发展改变了游戏，并使TLS成为主流。

截至2018年7月24日，Google Chrome 将HTTP网站标记为“不安全"。虽然这在网络社区引起了相当多的争议。知名安全研究员特洛伊亨特创建了一个为什么不适用HTTPS？跟踪不使用HTTPS的大型网站的网站。

Let’s Encrypt TLS证书可以自动化生成和更新，由于他们是免费的，所以没有理由不去做！Spring Boot Secured By Let’s Encrypt的加密是如何做到这一点的有用指南。

要在Spring Boot应用程序中强制使用HTTPS，您可以扩展WebSecurityConfigurerAdapter并要求安全连接。
```java
@Configuration
public  class  WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter
 {
   
    @Override
    protected void configure(HttpSecurity  http) throws Exception{
        http.requiresChannel().requiresSecure();
    }
}
```
另一个重要的事情是使用HTTP严格传输安全性（HSTS）。HSTS是一种Web安全策略机制，可以保护网站免受协议降级攻击和cookie劫持。服务器使用名为Strict-Transport-Security的响应头字段将HSTS策略传送到浏览器。Spring Security默认发送此标头，以避免在开始时出现不必要的HTTP跃点，点击这里一分钟开启Tomcat https支持。

### 8.14.2. 使用Snyk检查你的依赖关系
你很可能不知道应用程序使用了多少直接依赖项，这通常是正确的，尽管依赖性构成了整个应用程序的大部分。攻击者越来越多地针对开源依赖项，因为它们的重用为恶意黑客提供了许多受害者，确保应用程序的整个依赖关系树中没有已知的漏洞非常重要。

Snyk测试你的应用程序构建包，标记那些已知漏洞的依赖项。它在仪表板在应用程序中使用的软件包中存在的漏洞列表。

此外，它还将建议升级的版本或提供补丁，并提供针对源代码存储库的拉取请求来修复您的安全问题。Snyk还确保在你的存储库上提交的任何拉取请求（通过webhooks）时都是通过自动测试的，以确保它们不会引入新的已知漏洞。

每天都会在现有项目和库中发现新的漏洞，因此监控和保护生产部署也很重要。Snyk拍摄快照并监控你的部署，以便在发现新漏洞时，你可以通过JIRA，slack或电子邮件自动收到通知，并创建拉取请求以提供新漏洞的升级和补丁。

Snyk可通过Web UI和CLI获得，因此您可以轻松地将其与CI环境集成，并将其配置为在存在严重性超出设定阈值的漏洞时中断构建。

你可以免费使用Snyk进行开源项目或使用有限数量的私有项目。

### 8.14.3. 升级到最新版本
定期升级应用程序中的依赖项有多种原因。安全性是让您有升级动力的最重要原因之一。该start.spring.io起始页面采用了最新的春季版本的软件包，以及依赖关系，在可能的情况。

基础架构升级通常不如依赖项升级具有破坏性，因为库作者对向后兼容性和版本之间的行为更改的敏感性各不相同。话虽如此，当你在配置中发现安全漏洞时，您有三种选择：升级，修补程序或忽略。

在对应用程序进行必要的更改以使用较新版本之后，就应用程序的整体运行状况而言，升级是最安全的。

### 8.14.4. 启用CSRF保护
跨站点请求伪造(Cross-Site Request Forgery )是一种攻击，强制用户在他们当前登录的应用程序中执行不需要的操作。如果用户是普通用户，一个成功攻击可能涉及请求的状态更改，如转移资金或更改其电子邮件地址，如果用户具有提升管理员的权限，则CSRF攻击可能会危及整个应用程序。

Spring Security具有出色的CSRF支持，如果您正在使用Spring MVC的< form:form>标签或Thymeleaf @EnableWebSecurity，默认情况下处于启用状态，CSRF令牌将自动添加为隐藏输入字段。

如果你使用的是像Angular或React这样的JavaScript框架，则需要配置CookieCsrfTokenRepository以便JavaScript可以读取cookie。
```java
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override   
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }
}
```
如果你正在使用Angular，这就是你需要做的。如果您使用的是React，则需要读取XSRF-TOKENcookie并将其作为X-XSRF-TOKEN标题发回。

当请求通过HTTPS发生时，Spring Security会自动加入一个secure标识到XSRF-TOKENcookie 。Spring Security对于CSRF cookie不使用SameSite=strict 的标志，但它在使用Spring Session或WebFlux会话处理时会使用，这对会话cookie有意义，因为它有助于识别用户，但是没有为CSRF cookie提供太多价值，因为CSRF令牌也需要在请求中。点击这里了解CSRF更多详情。
### 8.14.5. 使用内容安全策略防止XSS攻击
内容安全策略（CSP）是一个增加的安全层，可帮助缓解XSS（跨站点脚本）和数据注入攻击。要启用它，你需要配置应用程序以返回Content-Security-Policy标题。你还可以在HTML页面中<meta http-equiv="Content-Security-Policy">使用标记。

Spring安全性默认提供了许多安全标头：
```
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Content-Type-Options: nosniff
Strict-Transport-Security: max-age=31536000 ; includeSubDomains
X-Frame-Options: DENY
X-XSS-Protection: 1; mode=block
```

Spring Security * 默认情况下不添加 CSP。你可以使用以下配置在Spring Boot应用程序中启用CSP标头。
```java
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void  configure( HttpSecurity  http) throws Exception {
        http.headers()
            .contentSecurityPolicy("script-src 'self' https://trustedscripts.example.com; object-src https://trustedplugins.example.com; report-uri /csp-report-endpoint/"
        );

    }
}
```

CSP是防止XSS攻击的良好防御，请记住，打开CSP能让CDN访问许多非常古老且易受攻击的JavaScript库，这意味着使用CDN不会为安全性增加太多价值。点击这里了解XSS更多详情。

你可以在securityheaders.com测试你的CSP标头是否有用。

### 8.14.6. 使用OpenID Connect进行身份验证
OAuth 2.0是行业标准的授权协议。它使用scope来定义授权用户可以执行的操作的权限。但是，OAuth 2.0不是身份验证协议，并且不提供有关经过身份验证的用户的信息。

OpenID Connect（OIDC）是一个OAuth 2.0扩展，提供用户信息，除了访问令牌之外，它还添加了ID令牌，以及/userinfo可以从中获取其他信息的端点，它还添加了发现功能和动态客户端注册的端点。

如果使用OIDC进行身份验证，则无需担心如何存储用户、密码或对用户进行身份验证。相反，你可以使用身份提供商（IdP）为你执行此操作，你的IdP甚至可能提供多因素身份验证（MFA）等安全附加组件。

要了解如何在Spring Boot应用程序中使用OIDC，请参阅Spring Security 5.0和OIDC入门。要总结如何使用它，你需要向项目添加一些依赖项，然后在application.yml文件中配置一些属性。

```yml
spring:
  security:
    oauth2:
      client:
        registration:
          okta:
            client-id: {clientId}
            client-secret: {clientSecret}
            scope: openid email profile
        provider:
          okta:
            issuer-uri: https:
//{yourOktaDomain}/oauth2/default
```
注意：issuer-uri仅在Spring Security 5.1中支持使用，Spring Security 5.1正在积极开发中并计划于2018年9月发布。

你可以使用像Keycloak这样的开源系统来设置自己的OIDC服务器。如果你不想在生产中维护自己的服务器，可以使用Okta的Developer API。

### 8.14.7. 管理密码？使用密码哈希！
以纯文本格式存储密码是最糟糕的事情之一。幸运的是，Spring Security默认情况下不允许使用纯文本密码。它还附带了一个加密模块，可用于对称加密，生成密钥和密码散列（也就是密码编码）。

PasswordEncoder 是Spring Security中密码哈希的主要接口，如下所示：
```java
public  interface  PasswordEncoder
 {
    String encode(String rawPassword);

    boolean matches(String rawPassword, String encodedPassword);

}
```

Spring Security提供了几种实现，最受欢迎的是BCryptPasswordEncoder和Pbkdf2PasswordEncoder。

对于一般的密码管理，我们建议使用SCrypt或Argon2, SCrypt现在已经过时了（已经有一段时间了），并且有一个额外的复杂因素，BCrypt没有这个因素，这使得暴力破解变得加倍地困难。它由着名的密码学家/安全人员（Colin Percival）编写，并且在几乎所有编程语言中都有很好的库，SCrypt也得到Latacora的认可。

Spring Security 5.1（即2018年9月下旬）将附带UserDetailsPasswordService API，允许您升级密码存储。

### 8.14.8. 安全地存储秘密
应谨慎处理敏感信息，如密码，访问令牌等，你不能以纯文本形式传递，或者如果将它们保存在本地存储中。由于（GitHub）的历史已经一次又一次证明，开发人员并没有仔细考虑如何存储他们的秘密。

一个好的做法是将保密信息存储在保管库中，该保管库可用于存储，提供对应用程序可能使用的服务的访问权限，甚至生成凭据。HashiCorp的Vault使得存储机密变得很轻松，并提供了许多额外的服务。

如果您对此感兴趣，请务必花一些时间查看Spring Vault，它为HashiCorp Vault添加抽象，为客户提供基于Spring注释的访问，允许他们访问、存储和撤销机密而不会迷失在基础架构中。以下代码段显示了使用注释从Spring Vault中提取密码的方便程度。
```java
@Value("${password}")
String password;
```

### 8.14.9. 使用OWASP的ZAP测试您的应用程序
OWASP ZAP安全工具是针对在运行活动的应用程序进行渗透测试的代理。它是一个受欢迎的（超过4k星）免费的开源项目，托管在GitHub上。

OWASP ZAP用于查找漏洞的两种方法是Spider和Active Scan。

Spider工具以URL种子开头，它将访问并解析每个响应，识别超链接并将它们添加到列表中。然后，它将访问这些新找到的URL并以递归方式继续，为您的Web应用程序创建URL映射。

Active Scan工具将根据潜在漏洞列表自动测试你选择的目标。它提供了一个报告，显示Web应用程序可被利用的位置以及有关漏洞的详细信息。

### 8.14.10. 让你的安全团队进行代码审查
代码评审对任何高性能软件开发团队都至关重要。在Okta，我们所有的生产代码和官方开源项目都需要通过我们的专家安全团队进行分析，你的公司可能没有安全专家，但如果你正在处理敏感数据，也许你应该这样做！

## 8.15. 项目实践
<a href="#menu" >目录</a>

### 8.15.1. 访问数据库

<a href="#menu" >目录</a>


### 8.15.2. 跨域配置
<a href="#menu" >目录</a>

用于跨域配置
```java
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ORIGINS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ALLOWED_HEADERS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    boolean DEFAULT_ALLOW_CREDENTIALS = false;
    /** @deprecated */
    @Deprecated
    long DEFAULT_MAX_AGE = 1800L;

    @AliasFor("origins")
    String[] value() default {};

    @AliasFor("value")
    String[] origins() default {};

    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};

    RequestMethod[] methods() default {};

    String allowCredentials() default "";

    long maxAge() default -1L;
}
```
细粒度跨域配置
使用@CrossOrigin,需要和@RequestMapping等映射注解相关配置放一起
```java
@CrossOrigin
@GetMapping("/{id}")
public Account retrieve(@PathVariable Long id) {
    // ...
}

```

全局跨域配置
```java
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hello");
    }
}
```

### 8.15.3. 全局异常处理
<a href="#menu" >目录</a>

第一种：使用@ControllerAdvice和@ExceptionHandler注解
第二种: 使用ErrorController类来实现。

**第一种：使用@ControllerAdvice和@ExceptionHandler注解**

```java
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public BaseResult globalException(HttpServletResponse response,NullPointerException ex){


        log.info("GlobalExceptionHandler...");
        log.info("错误代码："  + response.getStatus());
        BaseResult result = new WebResult(WebResult.RESULT_FAIL,"request error:"+response.getStatus()
                                        ,"GlobalExceptionHandler:"+ex.getMessage());
        return result;
    }

}

```
注解@ControllerAdvice表示这是一个控制器增强类，当控制器发生异常且符合类中定义的拦截异常类，将会被拦截。

可以定义拦截的控制器所在的包路径
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ControllerAdvice {
    @AliasFor("basePackages")
    String[] value() default {};

    @AliasFor("value")
    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] assignableTypes() default {};

    Class<? extends Annotation>[] annotations() default {};
}
```
注解ExceptionHandler定义拦截的异常类
```java
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExceptionHandler {
    Class<? extends Throwable>[] value() default {};
}
```

**第二种: 使用ErrorController类来实现**

系统默认的错误处理类为BasicErrorController，将会显示如上的错误页面。

这里编写一个自己的错误处理类，上面默认的处理类将不会起作用。

getErrorPath()返回的路径服务器将会重定向到该路径对应的处理类，本例中为error方法。

```java
@Slf4j
@RestController
public class HttpErrorController implements ErrorController {

    private final static String ERROR_PATH = "/error";

    @ResponseBody
    @RequestMapping(path  = ERROR_PATH )
    public BaseResult error(HttpServletRequest request, HttpServletResponse response){
        log.info("访问/error" + "  错误代码："  + response.getStatus());
        BaseResult result = new WebResult(WebResult.RESULT_FAIL,"HttpErrorController error:"+response.getStatus());
return result;
    }
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
```
**测试**
以上定义了一个统一的返回类BaseResult，方便前端进行处理。

```java
package com.microblog.common.result;

import java.io.Serializable;


public class BaseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int RESULT_FAIL = 0;
    public static final int RESULT_SUCCESS = 1;

    //返回代码
    private Integer  code;
    //返回消息
    private String message;
    //返回对象
    private  Object data;

    //getter setter    
}
```
编写一个测试控制器
```java
@Slf4j
@RestController
@RequestMapping("/user")
public class TestController {

    @RequestMapping("/info1")
    public String test(){
      log.info("/user/info1");

      throw new NullPointerException("TestController have exception");

    }
}
```

1.发出一个错误的请求,也就是没有对应的处理类。

从返回可以看到是由HttpErrorController类处理
```json
{"code":0,"message":"HttpErrorController error:404","data":null}
```

2.发出一个正常的请求(TestController的test()处理)，处理类中抛出空异样

从返回中可以看出是由GlobalExceptionHandler类处理
```json
{"code":0,"message":"request error:200","data":"GlobalExceptionHandler:TestController have exception"}
```

**区别**
1.注解@ControllerAdvice方式只能处理控制器抛出的异常。此时请求已经进入控制器中。
2.类ErrorController方式可以处理所有的异常，包括未进入控制器的错误，比如404,401等错误
3.如果应用中两者共同存在，则@ControllerAdvice方式处理控制器抛出的异常，类ErrorController方式未进入控制器的异常。
4.@ControllerAdvice方式可以定义多个拦截方法，拦截不同的异常类，并且可以获取抛出的异常信息，自由度更大。




## 8.16. 其他一些问题

### 8.16.1. 如何在 Spring Boot 启动的时候运行一些特定的代码？
可以实现接口 ApplicationRunner 或者 CommandLineRunner，这两个接口实现方式一样，它们都只提供了一个 run 方法

### 8.16.2. 如何重新加载Spring Boot上的更改，而无需重新启动服务器？
这可以使用DEV工具来实现。通过这种依赖关系，您可以节省任何更改，嵌入式tomcat将重新启动。

Spring Boot有一个开发工具（DevTools）模块，它有助于提高开发人员的生产力。Java开发人员面临的一个主要挑战是将文件更改自动部署到服务器并自动重启服务器。

开发人员可以重新加载Spring Boot上的更改，而无需重新启动服务器。这将消除每次手动部署更改的需要。Spring Boot在发布它的第一个版本时没有这个功能。

这是开发人员最需要的功能。DevTools模块完全��足开发人员的需求。该模块将在生产环境中被禁用。它还提供H2数据库控制台以更好地测试应用程序。
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>

```

### 8.16.3. Spring Boot 有哪几种读取配置的方式？
Spring Boot 可以通过 @PropertySource,@Value,@Environment, @ConfigurationProperties 来绑定变量，具体请看这篇文章《Spring Boot读取配置的几种方式》。

# 9. 安全
<a href="#menu" >目录</a>

## 9.1. Spring Security
<a href="#menu" >目录</a>


### 9.1.1. 基本使用
<a href="#menu" >目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

```yml
spring:
  security:
    user:
      name: user
      password: password
    filter:
      order: 100
      dispatcher-types: FORWARD|INCLUDE|REQUEST|ASYNC|ERROR
```

启动之后，当首次访问时会需要进行登录。

### 9.1.2. 核心组件
<a href="#menu" >目录</a>

spring security核心组件有：Userdetails 、Authentication，UserDetailsService、AuthenticationProvider、AuthenticationManager 

#### 9.1.2.1. Ａuthentication
<a href="#menu" >目录</a>

```java
public interface Authentication extends Principal, Serializable {

    //获取用户权限，一般情况下获取到的是用户的角色信息。
    Collection<? extends GrantedAuthority> getAuthorities();
    //获取证明用户认证的信息，通常情况下获取到的是密码等信息。
    Object getCredentials();
    //获取用户的额外信息，（这部分信息可以是我们的用户表中的信息）
    Object getDetails();
    //获取用户身份信息，在未认证的情况下获取到的是用户名，在已认证的情况下获取到的是 UserDetails (UserDetails也是一个接口，里边的方法有getUsername,getPassword等)。
    Object getPrincipal();
    //获取当前 Authentication 是否已认证。
    boolean isAuthenticated();
    //设置当前 Authentication 是否已认证（true or false）。
    void setAuthenticated(boolean var1) throws IllegalArgumentException;
}
```
* 接口有4个get方法，分别获取
    * Authorities, 填充的是用户角色信息。
    * Credentials，直译，证书。填充的是密码。
    * Details ，用户信息。
    * Principal 直译，形容词是“主要的，最重要的”，名词是“负责人，资本，本金”。感觉很别扭，所以，还是不翻译了，直接用原词principal来表示这个概念，其填充的是用户名。

#### 9.1.2.2. Userdetails
<a href="#menu" >目录</a>

用户信息


```java
public interface UserDetails extends Serializable {
    //权限
    Collection<? extends GrantedAuthority> getAuthorities();
    String getPassword();
    String getUsername();
    //是否过期
    boolean isAccountNonExpired();
    //是否锁定
    boolean isAccountNonLocked();
    //密码是否过期
    boolean isCredentialsNonExpired();
    //是否可用
    boolean isEnabled();
}
```
#### 9.1.2.3. UserDetailsService
<a href="#menu" >目录</a>

当登录的时候，会调用loadUserByUsername获取用户信息UserDetails，
```java
public interface UserDetailsService {
    UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException;
}

public interface UserDetailsManager extends UserDetailsService {
    void createUser(UserDetails var1);

    void updateUser(UserDetails var1);

    void deleteUser(String var1);

    void changePassword(String var1, String var2);

    boolean userExists(String var1);
}

```

使用
```java
@Override
public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

    //1.从数据库获取用户相关信息，比如密码，是否可用等
    //2.获取用户的角色和权限信息，角色和权限都是字符串

    UserDetails userDetails = new UserDetails() {
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            //放置权限和角色
            List<GrantedAuthority> role = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_READ");
            return role;
        }

        @Override
        public String getPassword() {
            //需要加密
            return passwordEncoder.encode("my-password1");
        }
        //其他信息
        @Override
        public String getUsername() {
            return "my-username";
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    };
    return userDetails1;
}

```

#### 9.1.2.4. AuthenticationProvider
<a href="#menu" >目录</a>

负责真正的验证。

如果没有指定对应关联的 AuthenticationProvider 对象，Spring Security 默认会使用 DaoAuthenticationProvider。DaoAuthenticationProvider 在进行认证的时候需要一个 UserDetailsService 来获取用户的信息 UserDetails，其中包括用户名、密码和所拥有的权限等。所以如果我们需要改变认证的方式，我们可以实现自己的 AuthenticationProvider；如果需要改变认证的用户信息来源，我们可以实现 UserDetailsService。

```java
public interface AuthenticationProvider {
    //表示认证的动作。
    Authentication authenticate(Authentication var1) throws AuthenticationException;
    //supports 表示所支持的 Authentication类型。Authentication 包含很多子类，
    boolean supports(Class<?> var1);
}

```


#### 9.1.2.5. AuthenticationManager 
<a href="#menu" >目录</a>

认证是由 AuthenticationManager 来管理的，但是真正进行认证的是 AuthenticationManager 中定义的 AuthenticationProvider。AuthenticationManager 中可以定义有多个 AuthenticationProvider。

AuthenticationManager 是一个接口，它只有一个方法，接收参数为Authentication，其定义如下：

```JAVA
public interface AuthenticationManager {
    Authentication authenticate(Authentication authentication)
            throws AuthenticationException;
}
```

AuthenticationManager 的作用就是校验Authentication,如果验证失败会抛出AuthenticationException异常。AuthenticationException是一个抽象类，因此代码逻辑并不能实例化一个AuthenticationException异常并抛出，实际上抛出的异常通常是其实现类，如DisabledException,LockedException,BadCredentialsException等。BadCredentialsException可能会比较常见，即密码错误的时候。


## 9.2. Oauth2
<a href="#menu" >目录</a>

### 9.2.1. JSON Web Token(JWT)知识
<a href="#menu" >目录</a>

#### 9.2.1.1. 使用场景

* Authorization (授权) : 这是使用JWT的最常见场景。一旦用户登录，后续每个请求都将包含JWT，允许用户访问该令牌允许的路由、服务和资源。单点登录是现在广泛使用的JWT的一个特性，因为它的开销很小，并且可以轻松地跨域使用。
* Information Exchange (信息交换) : 对于安全的在各方之间传输信息而言，JSON Web Tokens无疑是一种很好的方式。因为JWTs可以被签名，例如，用公钥/私钥对，你可以确定发送人就是它们所说的那个人。另外，由于签名是使用头和有效负载计算的，您还可以验证内容没有被篡改。


#### 9.2.1.2. 组成部分

* Header
* Payload
* Signature
  
```
eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTQzNjEyODYsInVzZXJfbmFtZSI6Im15LXVzZXJuYW1lIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiIsIlVTRVIxIiwiUk9MRV9VU0VSIiwiQURNSU4xIl0sImp0aSI6IjlhMjFjM2Y4LTFlMzEtNDJkOC04ZTVmLWEwODYzOWFhNDU2OCIsImNsaWVudF9pZCI6InRlc3QtY2xpZW50Iiwic2NvcGUiOlsiZGVmYXVsdC1zY29wZSJdfQ.N5dCJjQw9zuG394cFUsMe3CTcnTZyYaDdnF5kVhVClGIZUtS2fFDm_fZ3Uu1gfy9nR128jEqnaypYqNfrOvPDX2HTMlrM9nypne_87_a3dC3u9vs6kBUWRfQsppBa1IZmaMpHu1s-_J5hUjWjTWFggPJBjSbDQlICGVA4KbTpzXs6apEOSBTwxXT9tmTk6_H9FUhdJ6WDd8Iqx2PrWG_y5IMwjgNXEVNUc0bd5pAVM0jB7ng1otRmfGtbYVyYqSzBx9q5Ax9TemsYSKm4TIBpx0NX04wq4vwy5vjGVSM8f1Vsfiq28wFddPW_ZbM6kiEuuacxWtRcLTpRJCcQlHOmw
```
[https://jwt.io/#debugger-io](https://jwt.io/#debugger-io)

```json
{
  "alg": "RS256",
  "typ": "JWT"
}
{
  "exp": 1594361286,
  "user_name": "my-username",
  "authorities": [
    "ROLE_ADMIN",
    "USER1",
    "ROLE_USER",
    "ADMIN1"
  ],
  "jti": "9a21c3f8-1e31-42d8-8e5f-a08639aa4568",
  "client_id": "test-client",
  "scope": [
    "default-scope"
  ]
}
RSASHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
)
```
**header**

一般包含两部分，签名的算法和token类型，算法比如HMAC SHA256 or RSA.以下的json数据将会被base64编码变成jwt的第一部分
```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```
**Payload**

键值类型的负载数据，可以自定义，对payload进行Base64编码就得到JWT的第二部分.不要在JWT的payload或header中放置敏感信息，除非它们是加密的。
```json
{
  "sub": "1234567890",
  "name": "John Doe",
  "admin": true
}
```

**Signature**

为了得到签名部分，你必须有编码过的header、编码过的payload、一个秘钥，签名算法是header中指定的那个，然后对它们签名即可。

例如：HMACSHA256(base64UrlEncode(header) + "." + base64UrlEncode(payload), secret)

签名是用于验证消息在传递过程中有没有被更改，并且，对于使用私钥签名的token，它还可以验证JWT的发送方是否为它所称的发送方。

#### 9.2.1.3. 工作流程

当用户输入用户名密码并验证成功之后，服务器生成jwt，并返回给客户端，客户端将会保存，并在每次请求的时候带上jwt，服务器将会验证jwt是否过期，如果过期则会认为请求失败，返回401(未认证),同时jwt的payload也可以携带权限数据，服务器就可以验证jwt有效之后再验证是否有权限访问资源，进行更细粒度的安全控制。因此常规来讲，jwt应当携带这几个基本信息：用户名称或者id，jwt失效时间，权限数据。前两个是必须，后一个可以选择。

jwt的传输可以一般有三种方式
* 通过查询参数，存在安全问题
* 通过cookie，存在跨域问题
* 通过header的字段，一般是Authorization

第三种通常来讲是:Authorization: Bearer <token>。后端解析时需要去掉前置字符串"Bearer "，这个字符串只是一种标识声明，并没有什么作用。

用Token的好处
* 无状态和可扩展性：Tokens存储在客户端。完全无状态，可扩展。我们的负载均衡器可以将用户传递到任意服务器，因为在任何地方都没有状态或会话信息。
* 安全：Token不是Cookie。（The token, not a cookie.）每次请求的时候Token都会被发送。而且，由于没有Cookie被发送，还有助于防止CSRF攻击。即使在你的实现中将token存储到客户端的Cookie中，这个Cookie也只是一种存储机制，而非身份认证机制。没有基于会话的信息可以操作，因为我们没有会话!

**JWT与Session的差异**

相同点是，它们都是存储用户信息；然而，Session是在服务器端的，而JWT是在客户端的。

Session方式存储用户信息的最大问题在于要占用大量服务器内存，增加服务器的开销。

而JWT方式将用户状态分散到了客户端中，可以明显减轻服务端的内存压力。

Session的状态是存储在服务器端，客户端只有session id；而Token的状态是存储在客户端。

**基于Token的身份认证是如何工作的**

基于Token的身份认证是无状态的，服务器或者Session中不会存储任何用户信息。

主要流程如下：
* 用户携带用户名和密码请求访问
* 服务器校验用户凭据
* 应用提供一个token给客户端
* 客户端存储token，并且在随后的每一次请求中都带着它
* 服务器校验token并返回数据

注意：
* 每一次请求都需要token
* Token应该放在请求header中
* 我们还需要将服务器设置为接受来自所有域的请求，用Access-Control-Allow-Origin: *

**JWT与OAuth的区别**

* JWT是一种认证协议, OAuth2是一种授权框架 
* 无论使用哪种方式切记用HTTPS来保证数据的安全性
* OAuth2用在使用第三方账号登录的情况(比如使用weibo, qq, github登录某个app)，当然也可以用在本系统内的用户登录，而JWT是用在前后端分离, 需要简单的对后台API进行保护时使用。


**JW过期解决机制**

由于jwt携带过期时间，如果解析之后验证过期，服务器就会抛出错误。给用户体验不是很好。解决方案：返回前端的时候，返回的是两个jwt,access_token和refresh_token，通常访问的时候使用access_token，当access_token过期之后，使用refresh_token获取新的access_token。通常来讲access_token的过期时间远小于refresh_token，这样如果access_token被盗，也会很快失效。

### 9.2.2. Oauth2
<a href="#menu" >目录</a>

[Oauth2协议　https://tools.ietf.org/html/rfc6749](https://tools.ietf.org/html/rfc6749)

OAuth定义了四种角色：
* resource owner（资源所有者，用户）
* resource server（资源服务器，可以理解为受访问控制的资源接口集合）
* client（客户端）：代表资源所有者并且经过所有者授权去访问受保护的资源的应用程序
* authorization server（授权服务器）：在成功验证资源所有者并获得授权后向客户端发出访问令牌

#### 9.2.2.1. 协议流Protocol Flow

```yml
  +--------+                               +---------------+
     |        |--(A)- Authorization Request ->|   Resource    |
     |        |                               |     Owner     |
     |        |<-(B)-- Authorization Grant ---|               |
     |        |                               +---------------+
     |        |
     |        |                               +---------------+
     |        |--(C)-- Authorization Grant -->| Authorization |
     | Client |                               |     Server    |
     |        |<-(D)----- Access Token -------|               |
     |        |                               +---------------+
     |        |
     |        |                               +---------------+
     |        |--(E)----- Access Token ------>|    Resource   |
     |        |                               |     Server    |
     |        |<-(F)--- Protected Resource ---|               |
     +--------+                               +---------------+
```

* 客户端向资源所有者请求其授权
* 客户端收到资源所有者的授权许可，这个授权许可是一个代表资源所有者授权的凭据
* 客户端向授权服务器请求访问令牌，并出示授权许可
* 授权服务器对客户端身份进行认证，并校验授权许可，如果都是有效的，则发放访问令牌
* 客户端向资源服务器请求受保护的资源，并出示访问令牌
* 资源服务器校验访问令牌，如果令牌有效，则提供服务

#### 9.2.2.2. Authorization Grant

一个授权许可是一个凭据，它代表资源所有者对访问受保护资源的一个授权，是客户端用来获取访问令牌的。

授权类型有四种：authorization code, implicit, resource owner password credentials, and client credentials

**Authorization Code**

授权码是授权服务器用来获取并作为客户端和资源所有者之间的中介。代替直接向资源所有者请求授权，客户端定向资源所有者到一个授权服务器，授权服务器反过来指导资源所有者将授权码返回给客户端。在将授权码返回给客户端之前，授权服务器对资源所有者进行身份验证并获得授权。因为资源所有者只对授权服务器进行身份验证，所以资源所有者的凭据永远不会与客户机共享。

**Implicit**

隐式授权是为了兼顾到在浏览器中用诸如JavaScript的脚本语言实现的客户端而优化的简化授权代码流程。在隐式授权流程中，不是发给客户端一个授权码，而是直接发给客户端一个访问令牌，而且不会对客户端进行认证。隐式授权提高了一些客户端（比如基于浏览器实现的客户端）的响应能力和效率，因为它减少了获得访问令牌所需的往返次数。

**Resource Owner Password Credentials**

资源所有者的密码凭据（比如，用户名和密码）可以直接作为授权许可来获取访问令牌。这个凭据只应该用在高度信任的资源所有者和客户端之间（比如，客户端是系统的一部分，或者特许的应用），并且其它授权模式不可用的时候。

**Client Credentials**

客户端凭据通常用作授权许可

**Access Token**

访问令牌是用来访问受保护的资源的凭据。一个访问令牌是一个字符串，它代表发给客户端的授权。令牌代表资源所有者授予的对特定范围和访问的时间（PS：令牌是有范围和有效期的），并由资源服务器和授权服务器强制执行。访问令牌可以有不同的格式、结构和使用方法。

**Refresh Token**

Refresh Token是用于获取Access Token的凭据。刷新令牌是授权服务器发给客户端的，用于在当前访问令牌已经失效或者过期的时候获取新的访问令牌。刷新令牌只用于授权服务器，并且从来不会发给资源所有者。

```yml
+--------+                                           +---------------+
|        |--(A)------- Authorization Grant --------->|               |
|        |                                           |               |
|        |<-(B)----------- Access Token -------------|               |
|        |               & Refresh Token             |               |
|        |                                           |               |
|        |                            +----------+   |               |
|        |--(C)---- Access Token ---->|          |   |               |
|        |                            |          |   |               |
|        |<-(D)- Protected Resource --| Resource |   | Authorization |
| Client |                            |  Server  |   |     Server    |
|        |--(E)---- Access Token ---->|          |   |               |
|        |                            |          |   |               |
|        |<-(F)- Invalid Token Error -|          |   |               |
|        |                            +----------+   |               |
|        |                                           |               |
|        |--(G)----------- Refresh Token ----------->|               |
|        |                                           |               |
|        |<-(H)----------- Access Token -------------|               |
+--------+           & Optional Refresh Token        +---------------+
```

刷新的流程如图所示：
* (A)客户端请求获取访问令牌，并向授权服务器提供授权许可
* (B)授权服务器对客户端身份进行认证，并校验授权许可，如果校验通过，则发放访问令牌和刷新令牌
* (C)客户端访问受保护的资源，并向资源服务器提供访问令牌
* (D)资源服务器校验访问令牌，如果校验通过，则提供服
* (E)重复(C)和(D)直到访问令牌过期。如果客户端直到访问令牌已经过期，则跳至(G)，否则不能继续访问受保护的资源
* (F)自从访问令牌失效以后，资源服务器返回一个无效的令牌错误
* (G)客户端请求获取一个新的访问令牌，并提供刷新令牌
* (H)授权服务器对客户端进行身份认证并校验刷新令牌，如果校验通过，则发放新的访问令牌（并且，可选的发放新的刷新令牌）

#### 9.2.2.3. Client Registration
<a href="#menu" >目录</a>

在使用该协议之前，客户端向授权服务器注册。

**Client Types**

OAuth定义了两种客户端类型：
* confidential：能够维护其凭证的机密性的客户端
* public：不能维护其凭证的机密性的客户端

**Client Password**

拥有客户端密码的客户端可以使用HTTP Basic向服务器进行认证，当然前提是授权服务器支持HTTP Basic认证。

例如：Authorization: Basic czZCaGRSa3F0Mzo3RmpmcDBaQnIxS3REUmJuZlZkbUl3

二者选其一的，授权服务器可能支持在请求体中用下列参数包含客户端凭据：
* client_id：必须的，在授权服务器中注册过的客户端标识符。
* client_secret：必须的，客户端秘钥。如果秘钥是空字符串的话可以省略该参数。
用这两个参数将客户端凭据包含在请求体中这种方式不推荐，并且应该限制客户端不能直接用HTTP Basic认证方案。


#### 9.2.2.4. Protocol Endpoints

授权处理用两个授权服务器端点：
* Authorization endpoint：用于客户端从资源所有者那里获取授权
* Token endpoint：用于客户端用授权许可交互访问令牌

还有一个端点
* Redirection endpoint：用于资源服务器通过资源所有者用户代理将包含授权凭据的响应返回给客户端

**Authorization Endpoint**

授权端点用于和资源所有者交互并获取一个授权许可的。授权服务器必须首先校验资源所有者的身份。

* Response Type
  
客户端用以下参数通知授权服务器自己渴望的授权类型：

response_type：必须的。为了请求一个授权码这个值必须是"code"，为了请求一个访问令牌这个值必须是"token"

* Redirection Endpoint
在完成和资源所有者的交互以后，授权服务器直接将资源所有者的user-agent返回给客户端。授权服务器重定向到这个user-agent

**Access Token Scope**

授权和令牌端点允许客户端使用“scope”请求参数指定访问请求的范围。反过来，授权服务器使用“scope”响应参数通知客户机它所发放的访问令牌的范围。


#### 9.2.2.5. 客户端授权类型: Obtaining Authorization
<a href="#menu" >目录</a>

为了获得一个访问令牌，客户端需要先从资源所有者那里获得授权。授权是以授权许可的形式来表示的。

OAuth定义了四种授权类型：
* 授权码 authorization code
* 隐藏式 implicit
* 密码式 resource owner password credentials
* 客户端凭证 client credentials

OAuth 2.0 规定了四种获得令牌的流程。你可以选择最适合自己的那一种，向第三方应用颁发令牌。不管哪一种授权方式，第三方应用申请令牌之前，都必须先到系统备案，说明自己的身份，然后会拿到两个身份识别码：客户端 ID（client ID）和客户端密钥（client secret）。这是为了防止令牌被滥用，没有备案过的第三方应用，是不会拿到令牌的。

##### 9.2.2.5.1. 授权码方式:Authorization Code Grant

授权码（authorization code）方式，指的是第三方应用先申请一个授权码，然后再用该码获取令牌。

这种方式是最常用的流程，安全性也最高，它适用于那些有后端的 Web 应用。授权码通过前端传送，令牌则是储存在后端，而且所有与资源服务器的通信都在后端完成。这样的前后端分离，可以避免令牌泄漏。

```yml
 +----------+
     | Resource |
     |   Owner  |
     |          |
     +----------+
          ^
          |
         (B)
     +----|-----+          Client Identifier      +---------------+
     |         -+----(A)-- & Redirection URI ---->|               |
     |  User-   |                                 | Authorization |
     |  Agent  -+----(B)-- User authenticates --->|     Server    |
     |          |                                 |               |
     |         -+----(C)-- Authorization Code ---<|               |
     +-|----|---+                                 +---------------+
       |    |                                         ^      v
      (A)  (C)                                        |      |
       |    |                                         |      |
       ^    v                                         |      |
     +---------+                                      |      |
     |         |>---(D)-- Authorization Code ---------'      |
     |  Client |          & Redirection URI                  |
     |         |                                             |
     |         |<---(E)----- Access Token -------------------'
     +---------+       (w/ Optional Refresh Token)
```


授权码流程如图所示：
* (A)  客户端通过将资源所有者的用户代理指向授权端点来启动这个流程。客户端包含它的客户端标识符，请求范围，本地状态，和重定向URI，在访问被允许（或者拒绝）后授权服务器立即将用户代理返回给重定向URI。
* (B)  授权服务器验证资源所有者（通过用户代理），并确定资源所有者是否授予或拒绝客户端的访问请求。
* (C)  假设资源所有者授权访问，那么授权服务器用之前提供的重定向URI（在请求中或在客户端时提供的）将用户代理重定向回客户端。重定向URI包括授权码和前面客户端提供的任意本地状态。
* (D)  客户端用上一步接收到的授权码从授权服务器的令牌端点那里请求获取一个访问令牌。
* (E)  授权服务器对客户端进行认证，校验授权码，并确保这个重定向URI和第三步(C)中那个URI匹配。如果校验通过，则发放访问令牌，以及可选的刷新令牌。

**Authorization Request**

客户端通过使用“application/x-www-form- urlencoding”格式向授权端点URI的查询组件添加以下参数来构造请求URI
* response_type：必须的。参数表示要求返回授权码 ,值必须是"code"。参数表示要求返回授权码
* client_id：必须的。知道是谁在请求,客户端标识符。
* redirect_uri：可选的。参数是接受或拒绝请求后的跳转网址
* scope：可选的。请求访问的范围。
* state：推荐的。一个不透明的值用于维护请求和回调之间的状态。授权服务器在将用户代理重定向会客户端的时候会带上该参数。
例如：
　　
```yml
　　GET https://b.com/oauth/authorize?
  response_type=code&
  client_id=CLIENT_ID&
  redirect_uri=CALLBACK_URL&
  scope=read
```

**Authorization Response**

如果资源所有者授权访问请求，授权服务器发出授权代码并通过使用“application/x-www-form- urlencoding”格式向重定向URI的查询组件添加以下参数，将其给客户端。

* code：必须的。授权服务器生成的授权码。授权代码必须在发布后不久过期，以减少泄漏的风险。建议最大授权代码生命期为10分钟。客户端不得多次使用授权代码。如果授权代码不止一次使用，授权服务器必须拒绝请求，并在可能的情况下撤销先前基于该授权代码发布的所有令牌。授权代码是绑定到客户端标识符和重定向URI上的。
* state：如果之前客户端授权请求中带的有"state"参数，则响应的时候也会带上该参数。
例如：
```
　　HTTP/1.1 302 Found
　　Location: https://client.example.com/cb?code=SplxlOBeZQQYbYS6WxSbIA&state=xyz
```
**Error Response**

error：取值如下error_description：可选的
* invalid_request　　
* unauthorized_client
* access_denied
* unsupported_response_type
* invalid_scope
* server_error
* temporarily_unavailable
* error_description
* error_uri：可选的

**Access Token Request**

客户端通过使用“application/ www-form-urlencoding”格式发送以下参数向令牌端点发出请求

* grant_type：必须的。值必须是"authorization_code"。
* code：必须的。值是从授权服务器那里接收的授权码。
* redirect_uri：如果在授权请求的时候包含"redirect_uri"参数，那么这里也需要包含"redirect_uri"参数。而且，这两处"redirect_uri"必须完全相同。
* client_id：如果客户端不需要认证，那么必须带的该参数。
例如：
```
　　POST /token HTTP/1.1
　　Host: server.example.com
　　Authorization: Basic czZCaGRSa3F0MzpnWDFmQmF0M2JW
　　Content-Type: application/x-www-form-urlencoded

　　grant_type=authorization_code&code=SplxlOBeZQQYbYS6WxSbIA&redirect_uri=https%3A%2F%2Fclient%2Eexample%2Ecom%2Fcb
```

**Access Token Response**

例如：
```
　　HTTP/1.1 200 OK
　　Content-Type: application/json;charset=UTF-8
　　Cache-Control: no-store
　　Pragma: no-cache

　　{
　　　　"access_token":"2YotnFZFEjr1zCsicMWpAA",
　　　　"token_type":"example",
　　　　"expires_in":3600,
　　　　"refresh_token":"tGzv3JOkF0XG5Qx2TlKWIA",
　　　　"example_parameter":"example_value"
　　}
```

**流程分析**

第一步，A 网站提供一个链接，用户点击后就会跳转到 B 网站，授权用户数据给 A 网站使用。下面就是 A 网站跳转 B 网站的一个示意链接。

```
https://b.com/oauth/authorize?
  response_type=code&
  client_id=CLIENT_ID&
  redirect_uri=CALLBACK_URL&
  scope=read
```

第二步，用户跳转后，B 网站会要求用户登录，然后询问是否同意给予 A 网站授权。用户表示同意，这时 B 网站就会跳回redirect_uri参数指定的网址。跳转时，会传回一个授权码，就像下面这样。

```
https://a.com/callback?code=AUTHORIZATION_CODE
```

第三步，A 网站拿到授权码以后，就可以在后端，向 B 网站请求令牌。
```
https://b.com/oauth/token?
 client_id=CLIENT_ID&
 client_secret=CLIENT_SECRET&
 grant_type=authorization_code&
 code=AUTHORIZATION_CODE&
 redirect_uri=CALLBACK_URL
```
第四步，B 网站收到请求以后，就会颁发令牌。具体做法是向redirect_uri指定的网址，发送一段 JSON 数据。

```
{    
  "access_token":"ACCESS_TOKEN",
  "token_type":"bearer",
  "expires_in":2592000,
  "refresh_token":"REFRESH_TOKEN",
  "scope":"read",
  "uid":100101,
  "info":{...}
}
```


##### 9.2.2.5.2. Implicit Grant

隐式授权用于获取访问令牌（它不支持刷新令牌），它针对已知的操作特定重定向URI的公共客户端进行了优化。这些客户端通常在浏览器中使用脚本语言(如JavaScript)实现。

因为它是基于重定向的流程，所以客户端必须有能力和资源所有者的用户代理（典型地，是一个Web浏览器）进行交互，同时必须有能力接收来自授权服务器的重定向请求。

隐士授权类型不包含客户端身份验证，它依赖于资源所有者的存在和重定向URI的注册。由于访问令牌被编码到重定向URI中，所以它可能暴露给资源所有者以及同一台设备上的其它应用。

```yml
+----------+
| Resource |
|  Owner   |
|          |
+----------+
    ^
    |
    (B)
+----|-----+          Client Identifier     +---------------+
|         -+----(A)-- & Redirection URI --->|               |
|  User-   |                                | Authorization |
|  Agent  -|----(B)-- User authenticates -->|     Server    |
|          |                                |               |
|          |<---(C)--- Redirection URI ----<|               |
|          |          with Access Token     +---------------+
|          |            in Fragment
|          |                                +---------------+
|          |----(D)--- Redirection URI ---->|   Web-Hosted  |
|          |          without Fragment      |     Client    |
|          |                                |    Resource   |
|     (F)  |<---(E)------- Script ---------<|               |
|          |                                +---------------+
+-|--------+
|    |
(A)  (G) Access Token
|    |
^    v
+---------+
|         |
|  Client |
|         |
+---------+
```


隐式授权流程如图所示：
* (A)  客户端引导资源所有者的user-agent到授权端点。客户端携带它的客户端标识，请求scope，本地state和一个重定向URI。
* (B)  授权服务器对资源所有者（通过user-agent）进行身份认证，并建立连接是否资源所有者允许或拒绝客户端的访问请求。
* (C)  假设资源所有者允许访问，那么授权服务器通过重定向URI将user-agent返回客户端。
* (D)  user-agent遵从重定向指令
* (E)  web-hosted客户端资源返回一个web页面（典型的，内嵌脚本的HTML文档），并从片段中提取访问令牌。
* (F)  user-agent执行web-hosted客户端提供的脚本，提取访问令牌
* (G)  user-agent将访问令牌传给客户端

**Authorization Request**

response_type：必须的。值必须是"token"。
* client_id：必须的。
* redirect_uri：可选的。
* scope：可选的。


**执行流程**

第一步，A 网站提供一个链接，要求用户跳转到 B 网站，授权用户数据给 A 网站使用。

```
https://b.com/oauth/authorize?
  response_type=token&
  client_id=CLIENT_ID&
  redirect_uri=CALLBACK_URL&
  scope=read
```

第二步，用户跳转到 B 网站，登录后同意给予 A 网站授权。这时，B 网站就会跳回redirect_uri参数指定的跳转网址，并且把令牌作为 URL 参数，传给 A 网站。
```
https://a.com/callback#token=ACCESS_TOKEN
```
上面 URL 中，token参数就是令牌，A 网站因此直接在前端拿到令牌。

注意，令牌的位置是 URL 锚点（fragment），而不是查询字符串（querystring），这是因为 OAuth 2.0 允许跳转网址是 HTTP 协议，因此存在"中间人攻击"的风险，而浏览器跳转时，锚点不会发到服务器，就减少了泄漏令牌的风险。

这种方式把令牌直接传给前端，是很不安全的。因此，只能用于一些安全要求不高的场景，并且令牌的有效期必须非常短，通常就是会话期间（session）有效，浏览器关掉，令牌就失效了。

##### 9.2.2.5.3. Resource Owner Password Credentials Grant


资源所有者密码凭证授予类型适用于资源所有者与客户端(如设备操作系统或高度特权应用程序)存在信任关系的情况。授权服务器在启用这种授予类型时应该特别小心，并且只在其他授权流程不可行的时候才允许使用。

这种授权类型适合于有能力维护资源所有者凭证（用户名和密码，典型地，用一个交互式的表单）的客户端。

```yml
+----------+
     | Resource |
     |  Owner   |
     |          |
     +----------+
          v
          |    Resource Owner
         (A) Password Credentials
          |
          v
     +---------+                                  +---------------+
     |         |>--(B)---- Resource Owner ------->|               |
     |         |         Password Credentials     | Authorization |
     | Client  |                                  |     Server    |
     |         |<--(C)---- Access Token ---------<|               |
     |         |    (w/ Optional Refresh Token)   |               |
     +---------+                                  +---------------+
```

资源所有者密码凭证流程如图：

* (A)  资源所有者提供他的用户名和密码给客户端
* (B)  客户端携带从资源所有者那里收到的凭证去授权服务器的令牌端点那里请求获取访问令牌
* (C)  授权服务器对客户端进行身份认证，并校验资源所有者的凭证，如果都校验通过，则发放访问令牌

**Access Token Request**

客户端通过在HTTP请求体中添加"application/x-www-form-urlencoded"格式的参数来向令牌端点请求。

* grant_type ：必须的。而且值必须是"password"。
* username ：必须的。资源所有者的用户名。
* password ：必须的。资源所有者的密码。
* scope：可选的。
例如：

```yml
POST /token HTTP/1.1
　　Host: server.example.com
　　Authorization: Basic czZCaGRSa3F0MzpnWDFmQmF0M2JW
　　Content-Type: application/x-www-form-urlencoded

　　grant_type=password&username=johndoe&password=A3ddj3w
```

**Access Token Response**

```
　　HTTP/1.1 200 OK
　　Content-Type: application/json;charset=UTF-8
　　Cache-Control: no-store
　　Pragma: no-cache

　　{
　　　　"access_token":"2YotnFZFEjr1zCsicMWpAA",
　　　　"token_type":"example",
　　　　"expires_in":3600,
　　　　"refresh_token":"tGzv3JOkF0XG5Qx2TlKWIA",
　　　　"example_parameter":"example_value"
　　}
```

**请求流程**

如果你高度信任某个应用，RFC 6749 也允许用户把用户名和密码，直接告诉该应用。该应用就使用你的密码，申请令牌，这种方式称为"密码式"（password）。这种方式可以作为应用内部的登录方式。

第一步，A 网站要求用户提供 B 网站的用户名和密码。拿到以后，A 就直接向 B 请求令牌。
```
https://oauth.b.com/token?
  grant_type=password&
  username=USERNAME&
  password=PASSWORD&
  client_id=CLIENT_ID
```

上面 URL 中，grant_type参数是授权方式，这里的password表示"密码式"，username和password是 B 的用户名和密码。

第二步，B 网站验证身份通过后，直接给出令牌。注意，这时不需要跳转，而是把令牌放在 JSON 数据里面，作为 HTTP 回应，A 因此拿到令牌。

这种方式需要用户给出自己的用户名/密码，显然风险很大，因此只适用于其他授权方式都无法采用的情况，而且必须是用户高度信任的应用。




##### 9.2.2.5.4. Client Credentials Grant

客户端用它自己的客户单凭证去请求获取访问令牌

```yml
 +---------+                                  +---------------+
     |         |                                  |               |
     |         |>--(A)- Client Authentication --->| Authorization |
     | Client  |                                  |     Server    |
     |         |<--(B)---- Access Token ---------<|               |
     |         |                                  |               |
     +---------+                                  +---------------+
```
客户端凭证授权流程如图所示：

* (A)  客户端用授权服务器的认证，并请求获取访问令牌
* (B)  授权服务器验证客户端身份，如果严重通过，则发放令牌

**Access Token Request**

grant_type：必须的。值必须是"client_credentials"。
scope：可选的。
例如：
```
　　POST /token HTTP/1.1
　　Host: server.example.com
　　Authorization: Basic czZCaGRSa3F0MzpnWDFmQmF0M2JW
　　Content-Type: application/x-www-form-urlencoded

　　grant_type=client_credentials
```

**Access Token Response**
例如：
```
　　HTTP/1.1 200 OK
　　Content-Type: application/json;charset=UTF-8
　　Cache-Control: no-store
　　Pragma: no-cache

　　{
　　　　"access_token":"2YotnFZFEjr1zCsicMWpAA",
　　　　"token_type":"example",
　　　　"expires_in":3600,
　　　　"example_parameter":"example_value"
　　}
```
**请求过程**

适用于没有前端的命令行应用，即在命令行下请求令牌。

第一步，A 应用在命令行向 B 发出请求。

```
https://oauth.b.com/token?
  grant_type=client_credentials&
  client_id=CLIENT_ID&
  client_secret=CLIENT_SECRET
```

上面 URL 中，grant_type参数等于client_credentials表示采用凭证式，client_id和client_secret用来让 B 确认 A 的身份。

第二步，B 网站验证通过以后，直接返回令牌。

这种方式给出的令牌，是针对第三方应用的，而不是针对用户的，即有可能多个用户共享同一个令牌。

##### 9.2.2.5.5. 令牌的使用

A 网站拿到令牌以后，就可以向 B 网站的 API 请求数据了。

此时，每个发到 API 的请求，都必须带有令牌。具体做法是在请求的头信息，加上一个Authorization字段，令牌就放在这个字段里面。

```
curl -H "Authorization: Bearer ACCESS_TOKEN" \
"https://api.b.com"
```

上面命令中，ACCESS_TOKEN就是拿到的令牌。

A 网站拿到令牌以后，就可以向 B 网站的 API 请求数据了。

此时，每个发到 API 的请求，都必须带有令牌。具体做法是在请求的头信息，加上一个Authorization字段，令牌就放在这个字段里面。


curl -H "Authorization: Bearer ACCESS_TOKEN" \
"https://api.b.com"
上面命令中，ACCESS_TOKEN就是拿到的令牌。

##### 9.2.2.5.6. 更新令牌

令牌的有效期到了，如果让用户重新走一遍上面的流程，再申请一个新的令牌，很可能体验不好，而且也没有必要。OAuth 2.0 允许用户自动更新令牌。

具体方法是，B 网站颁发令牌的时候，一次性颁发两个令牌，一个用于获取数据，另一个用于获取新的令牌（refresh token 字段）。令牌到期前，用户使用 refresh token 发一个请求，去更新令牌。

```
https://b.com/oauth/token?
  grant_type=refresh_token&
  client_id=CLIENT_ID&
  client_secret=CLIENT_SECRET&
  refresh_token=REFRESH_TOKEN
```

上面 URL 中，grant_type参数为refresh_token表示要求更新令牌，client_id参数和client_secret参数用于确认身份，refresh_token参数就是用于更新令牌的令牌。

B 网站验证通过以后，就会颁发新的令牌。



#### 9.2.2.6. Issuing an Access Token

<a href="#menu" >目录</a>

**Successful Response**

授权服务器发放令牌
* access_token：必须的。
* token_type：必须的。比如："bearer"，"mac"等等
* expires_in：推荐的。
* refresh_token：可选的。
* scope：可选的。
* media type是application/json，参数被序列化成JSON对象。

授权服务器必须包含"Cache-Control"HTTP头，并且值必须是"no-store"。

例如：
```
　　HTTP/1.1 200 OK
　　Content-Type: application/json;charset=UTF-8
　　Cache-Control: no-store
　　Pragma: no-cache

　　{
　　　　"access_token":"2YotnFZFEjr1zCsicMWpAA",
　　　　"token_type":"example",
　　　　"expires_in":3600,
　　　　"refresh_token":"tGzv3JOkF0XG5Qx2TlKWIA",
　　　　"example_parameter":"example_value"
　　}
```

#### 9.2.2.7. Refreshing an Access Token
<a href="#menu" >目录</a>

请求参数
* grant_type：必须的。值必须是"refresh_token"。
* refresh_token：必须的。
* scope：可选的。
例如：
```
　　POST /token HTTP/1.1
　　Host: server.example.com
　　Authorization: Basic czZCaGRSa3F0MzpnWDFmQmF0M2JW
　　Content-Type: application/x-www-form-urlencoded

　　grant_type=refresh_token&refresh_token=tGzv3JOkF0XG5Qx2TlKWIA
```

## 9.3. Spring security + Spring gateway + Oauth2 整合
<a href="#menu" >目录</a>


整个项目包括四个部分：客户端，资源服务器(常规的服务应用)，网关层，授权服务器

### 9.3.1. 网关层　Spring gateway　
<a href="#menu" >目录</a>

#### 9.3.1.1. 依赖引入
<a href="#menu" >目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-config</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-oauth2-resource-server</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-oauth2-client</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-oauth2-jose</artifactId>
</dependency>

```
#### 9.3.1.2. 配置
<a href="#menu" >目录</a>


```yml
spring:
    #路由配置
  cloud.gateway.routes:
    #授权认证服务
    - id: microblog-auth
      uri: http://localhost:8000
      predicates:
        - Path=/api/auth/**
      filters:
        - StripPrefix=2
    #普通的服务
    - id: api-service-route
      uri: http://localhost:8080
      predicates:
        - Path=/api/service/**
      filters:
        - StripPrefix=1
    #　授权服务获取jwt的地址
  security.oauth2.resourceserver.jwt.jwk-set-uri: 'http://localhost:8000/.well-known/jwks.json'

```
访问控制
```java
package com.microblog.gateway.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.ReactiveAuthenticationManagerAdapter;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.AuthenticationWebFilter;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import reactor.core.publisher.Mono;

import java.util.Iterator;

@Configuration
@Slf4j
@EnableWebFluxSecurity
public class ResourceServerConfigurer {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {

        
        http.oauth2ResourceServer().jwt();

        //关闭打开的csrf保护
        //CSRF（Cross-site request forgery跨站请求伪造，也被称为“One Click Attack”或者Session Riding，通常缩写为CSRF或者XSRF，是一种对网站的恶意利用。为了防止跨站提交攻击，通常会配置csrf。
        http.csrf().disable()
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .pathMatchers("/api/auth/oauth/**").permitAll()
                .pathMatchers("/login.html", "/login").permitAll()
                .pathMatchers("/actuator/**").permitAll()
                .pathMatchers("/needauth").authenticated()
                .pathMatchers("/notauth")
                .access(AccessReactiveAuthorizationManager.hasAnyAuthority("USER1","ADMIN1"))//hasAnyRole("USER"," ADMIN")
                //.pathMatchers("/api/notauth").hasAnyRole("USER"," ADMIN")
                .anyExchange().authenticated()
                .and().exceptionHandling().accessDeniedHandler(new ServerAccessDeniedHandler() {
            @Override
            public Mono<Void> handle(ServerWebExchange serverWebExchange, AccessDeniedException e) {

                e.printStackTrace();
                return Mono.empty();
            }
        })
        ;

        SecurityWebFilterChain chain = http.build();
        Iterator<WebFilter> weIterable = chain.getWebFilters().toIterable().iterator();
        while(weIterable.hasNext()) {
            WebFilter f = weIterable.next();
            if(f instanceof AuthenticationWebFilter) {
                AuthenticationWebFilter webFilter = (AuthenticationWebFilter) f;
                //将自定义的AuthenticationConverter添加到过滤器中
                log.info("将自定义的AuthenticationConverter添加到过滤器中");
               // webFilter.setServerAuthenticationConverter(new AuthenticationConverter());
            }
        }

        return chain;


    }

    @Bean
    public ReactiveAuthenticationManager reactiveAuthenticationManager() {
        return new ReactiveAuthenticationManagerAdapter((authentication)->{


            log.info("ReactiveAuthenticationManager...");
            if(authentication instanceof AccountAuthentication) {
                AccountAuthentication gmAccountAuthentication = (AccountAuthentication) authentication;
                if(gmAccountAuthentication.getPrincipal() != null) {
                    authentication.setAuthenticated(true);
                    return authentication;
                } else {
                    return authentication;
                }
            } else {
                return authentication;
            }
        });
    }


}


```

### 9.3.2. 授权服务器
<a href="#menu" >目录</a>







# 10. SpringCloud
<a href="#menu" >目录</a>

## 10.1. 基础知识
<a href="#menu" >目录</a>

### 10.1.1. 微服务概念

微服务是系统架构上的一种设计风格， 它的主旨是将一个原本独立的系统拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP的RESTful API进行通信协作。 被拆分成的每一个小型服务都围绕着系统中的某一项或一些耦合度较高的业务功能进行构建， 并且每个服务都维护着自身的数据存储、 业务开发、自动化测试案例以及独立部署机制。 由千有了轻量级的通信协作基础， 所以这些微服务可以使用不同的语言来编写


**单体应用存在的问题**
* 复杂性高，单体应用模块多，难以维护
* 可靠性差，如果某一个模块出现问题，整个应用将变得不可用
* 扩展能力差，单体应用只适合作为一个整体进行扩展，无法根据业务模块进行伸缩
* 阻碍技术创新，整个应用都使用同一种技术(语言，框架)，无法根据业务情况选择合适的技术

**微服务主要的优势如下：**
* 降低复杂度，易于开发和维护
    * 将原来偶合在一起的复杂业务拆分为单个服务，规避了原本复杂度无止境的积累。每一个微服务专注于单一功能，并通过定义良好的接口清晰表述服务边界。每个服务开发者只专注服务本身，通过使用缓存、DAL等各种技术手段来提升系统的性能，而对于消费方来说完全透明。
* 单个微服务启动较快
    * 代码量少，因此启动较快
* 可独立部署
    * 由于微服务具备独立的运行进程，所以每个微服务可以独立部署。当业务迭代时只需要发布相关服务的迭代即可，降低了测试的工作量同时也降低了服务发布的风险。
* 技术栈不受限制
    * 只要服务间定义好接口和访问方式，可以自行利用不同的语言框架实现
* 容错
    * 在微服务架构下，当某一组件发生故障时，故障会被隔离在单个服务中。 通过限流、熔断等方式降低错误导致的危害，保障核心业务正常运行。
* 扩展
    * 单块架构应用也可以实现横向扩展，就是将整个应用完整的复制到不同的节点。当应用的不同组件在扩展需求上存在差异时，微服务架构便体现出其灵活性，因为每个服务可以根据实际需求独立进行扩展。

**微服务常用组件概念**

* 服务注册与发现
  * 服务提供方将己方调用地址注册到服务注册中心，让服务调用方能够方便地查找，服务调用方从服务注册中心找到自己需要调用的服务地址
* 负载均衡
  * 将请求分发到不同的集群节点，避免单个应用负载增大
* 服务网关
  * 可以在这个组件中实现用户鉴权，动态路由，灰度发布，A/B测试，负载限流
* 配置中心
  * 将本地化的配置信息注册到配置中心进行统一配置
* 调用链监控
  * 记录完成一次请求的先后衔接和调用关系，并将这种串行化或并行的调用关系展示出来，在系统出错的时候，可以方便地找出出错点
* 支撑平台
  * 持续集成，健康检查，性能监控等的统一平台建设　


**微服务带来的问题**
* 运维要求较高
    * 服务数量变大，会增加运维的难度
* 分布式固有的复杂性
    * 包括服务容错，网络延迟，分布式事务等问题都需要解决
* 接口调整成本高
    * 服务之间通过接口进行通信，如果接口发生修改，影响就比较大
* 重复劳动 
    * 有的服务可能会出现同样的功能需求，导致重复编码

**微服务设计原则**
* 单一职责原则
* 服务自治原则
* 轻量级通信原则
* 微服务粒度，确定好服务边界

### 10.1.2. SpringCloud子项目
* SpringCloudConfig: 配置管理工具， 支持使用Git存储 配置内容， 可以使用它实现应用配置的外部化存储， 并支持客户端配置信息刷新、 加密／解密配置内容 等。
* SpringCloudNetflix: 核心 组件， 对多个Netflix OSS开源套件进行整合。
* Eureka: 服务治理组件， 包含服务注册中心、 服务注册与发现机制的实现。
* Hystrix: 容错管理组件，实现断路器模式， 帮助服务依赖中出现的延迟和为故障提供强大的容错能力。
* ribbon: 客户端负载均衡的服务调用组件
* Feign: 基于ribbon 和 Hystrix 的声明式服务调用组件。
* Zuul: 网关组件， 提供智能路由、 访问过滤等功能。
* gateway: 网关组件，用于替换zuul
* Archaius: 外部化配置组件。
* Spring Cloud Bus: 事件、 消息总线， 用于传播集群中的状态变化或事件， 以触发后续的处理， 比如用来动态刷新配置等。
* Spring Cloud Cluster: 针对 ZooKeeper、 Redis、 Hazelcast、 Consul 的选举算法和通用状态模式的实现。
* Spring Cloud Cloudfoundry: 与 Pivotal Cloudfoundry 的整合支持。
* Spring Cloud Consul: 服务发现与配置管理工具。
* Spring Cloud Stream: 通过 Redis、 Rabbit 或者 Kafka 实现的消费微服务， 可以通过简单的声明式模型来发送和接收消息。
* Spring Cloud AWS: 用千简化整合 Amazon Web Service 的组件。
* Spring Cloud Security: 安全工具包，提供在Zuul代理中对OAuth2 客户端请求的中继器。
* Spring Cloud Sleuth:Spring Cloud应用的分布式跟踪实现，可以完美整合Zipkn。
* Spring Cloud ZooKeeper: 基于 ZooKeeper 的服务发现与配置管理组件。
* Spring Cloud Starters: Spring Cloud 的基础组件， 它是基于 Spring Boot 风格项目的基础依赖模块。
* Spring Cloud CLI: 用于在 Groovy 中快速创建 Spring Cloud 应用的 Spring Boot CLI插件。

### 10.1.3. 版本说明

由于 Spring Cloud 不像 Spring 社区其他一些项目那样相对独立， 它是一个拥有诸多子项目的大型综合项目， 可以说是对微服务架构解决方案的综合套件组合， 其包含的各个子项目也都独立进行着内容更新与迭代，各自都维护着自己的发布版本号。因此每一 个Spring Cloud 的版本都会包含多个不同版本的子项目， 为了管理每个版本的子项目清单， 避免Spring Cloud的版本号与其子项目的版本号相混淆，没有采用版本号的方式，而是通过命名的方式。使用单词而不是字母主要是因为:设计的目的是为了更好的管理每个SpringCloud子项目的清单，避免自己的版本号与子项目的版本号混淆.

这些版本的名字采用了伦敦地铁站的名字， 根据字母表的顺序来对应版本时间顺序，比如最早的Release版本为Angel, 第二个Release版本为Brixton

当一个版本的Spring Cloud项目的发布内容积累到临界点或者一 个严重bug解决可用后， 就会发布 一个"service releases"版本， 简称SRX版本， 其中 X是 一 个递增的数字，所以Brixton.SRS就是Brixton的第5个Release版本。

pom文件中指定cloud的版本，便可以不用指定各个子项目依赖的版本号
```xml
 <dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Finchley.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

**希腊字母版本号**
* Base：设计阶段。只有相应的设计没有具体的功能实现。
* Alpha：软件的初级版本。基本功能已经实现，但存在较多的bug。
* Bate：相对于Alpha已经有了很大的进步，消除了严重的BUG，但还存在一些潜在的BUG，还需要不断测试。
* RELEASE：最终版本，没有太大的问题

**关于版本发布说明**
* BUILD-XXX
    * 开发版,开发团队内部使用，不是很稳定
* GA
    * 稳定版,相比于开发版，基本上可以使用了
* PRE（M1、M2）　　　  
    * 里程碑版,主要是修复了一些BUG的版本，一个GA后通常有多个里程碑版
* RC　　　　　　　　　　
    * 候选发布版,该阶段的软件类似于最终版的一个发行观察期，基本只修复比较严重的BUG
* SR
    * 正式发布版　　

**Spring Cloud不同版本对应的Spring Boot版本**
* Hoxton:2.2.x (2019:里程碑阶段)
* Greenwich:2.1.x (2019,稳定发布版本)
* Finchley:2.0.x
* Edgware:1.5.x
* Dalston:1.5.x


## 10.2. 服务治理Eureka
<a href="#menu" >目录</a>

和 Consul 、 Zookeeper 类似， Eureka 是一个用于服务注册和发现的组件， Eureka 分为 Eureka Server 和 Eureka Client, Eureka　Server 为 Eureka 服务注册中心， Eureka Client 为 Eureka 客户端 。

* 选择的原因
  * 开源，并且经过生产环境检验
  * Spring cloud 推荐，可以和其他模块无缝对接。完成相关功能
* 组件
  * Register Service：服务注册中心，它是一个 Eureka Server，提供服务注册和发现的功能。
  * Provider Service：服务提供者，它是一个 Eureka Client，提供服务 。
  * Consumer Service：服务消费者，它是一个 Eureka Cient，消费服务

服务消费的基本过程如下：首先需要一个服务注册中心 Eureka Server，服务提供者 EurekaClient 向服务注册中心 Eureka Server 注册，将自己的信息（比如服务名和服务的 IP 地址等）通过restful的形式提交给服务注册中心 Eureka Server。同样，服务消费者 Eureka Client 也向服务注册中心Eureka Server 注册，同时服务消费者获取一份服务注册列表的信息 ， 该列表包含了所有向服务注册中心 Eureka Server 注册的服务信息。获取服务注册列表信息之后 ，服务消费者就知到服务提供者的 IP 地址，可以通过 Http远程调度来消费服务提供者的服务。


### 10.2.1. 基本使用

**注册中心**

* 依赖引入
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```
* 配置文件
```yml
server:
  port: 8001

spring:
  application:
    name: user-service
eureka:
  instance:
    hostname: localhost
    #instance-id是eureka服务的唯一标记，主要用于区分集群中不同的实例
    #默认是eureka.instance.hostname:spring.application.name:server.port
    instance-id: ${spring.application.name}:${server.port}:${random.value}
  client:
    #如果是单个eureka，应当设置为false　
    #false:禁止向注册中心注册,默认true
    register-with-eureka: false
    #false:禁止获取注册中心中各个微服务的注册信息,默认true
    fetch-registry: false
    service-url:
      #配置自己的地址　http://hostip:port/eureka/
      defaultZone:　http://localhost:8001/eureka/
```



* 启动类通过@EnableEurekaServer使能配置中心
```java
@EnableEurekaServer
@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }
}
```
配置中心创建完成.

**访问配置中心**

访问地址:http://localhost:8001/

![注册中心页面](pic/spring/springcloud/center.png)
这里配置了一个消费者(8003)和两个服务提供者（8002/8012）

status的UP后面的字符串即为服务的唯一标识instance-id。可以通过eureka.instance.instance-id进行修改。

**微服务**
* 依赖引入
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

* 指定配置中心地址
```yml
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8001/eureka/
```
* 使用@EnableEurekaClient或者@EnableDiscoveryClient使能微服务
```java
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {


        SpringApplication.run(ConsumerApplication.class,args);
    }
}
```
微服务创建完成

**获取元数据**

```java
@Autowired
private EurekaDiscoveryClient discoveryClient;
//参数是spring.application.name
List<ServiceInstance> serviceInstances =  discoveryClient.getInstances("USER-SERVICE");
```
```yml
[
  {
    "metadata": {
      "management.port": "8004",
      "jmx.port": "45273"
    },
    "secure": false,
    "uri": "http://localhost:8004",
    "serviceId": "USER-SERVICE",
    "instanceId": "localhost:user-service:8004",
    "instanceInfo": {
      "instanceId": "localhost:user-service:8004",
      "app": "USER-SERVICE",
      "ipAddr": "192.168.1.104",
      "sid": "na",
      "homePageUrl": "http://localhost:8004/",
      "statusPageUrl": "http://localhost:8004/actuator/info",
      "healthCheckUrl": "http://localhost:8004/actuator/health",
      "vipAddress": "user-service",
      "secureVipAddress": "user-service",
      "countryId": 1,
      "dataCenterInfo": {
        "@class": "com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo",
        "name": "MyOwn"
      },
      "hostName": "localhost",
      "status": "UP",　
      "overriddenStatus": "UNKNOWN",
      "leaseInfo": {
        "renewalIntervalInSecs": 30,
        "durationInSecs": 90,
        "registrationTimestamp": 1593791512137,
        "lastRenewalTimestamp": 1593791512137,
        "evictionTimestamp": 0,
        "serviceUpTimestamp": 1593791512137
      },
      "isCoordinatingDiscoveryServer": false,
      "metadata": {
        "management.port": "8004",
        "jmx.port": "45273"
      },
      "lastUpdatedTimestamp": 1593791512137,
      "lastDirtyTimestamp": 1593791512095,
      "actionType": "ADDED"
    },
    "scheme": "http",
    "host": "localhost",
    "port": 8004
  }
]
```

**给注册中心添加登录认证**

* 注册中心引入POM
```XML
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```
* 配置文件配置用户名和密码
```yml
security:
    basic:
         开启基于HTTP basic的认证
        enable: true
    user:
        name: user
        password: 123456
```
* 微服务配置
给defaultZone添加用户名和密码
```yml
eureka:
  client:
    service-url:
      defaultZone: http://user:123456@localhost:8001/eureka/
```

### 10.2.2. 高可用注册中心

* 注册中心可以集群部署，提高高可用

* 只需要配置多个地址即可，并且把之前的几个禁止去掉
```yml
server:
  port: 8001
eureka:
  instance:
    hostname: localhost
  client:
    #因为注册中新要互相向对方注册和获取注册信息，因此需要设置为true
    #false 禁止向注册中心注册,默认true
    #register-with-eureka: false
    #false进制获取注册中心中各个微服务的注册信息,默认true
    #fetch-registry: false
    service-url:
      defaultZone: http://localhost:8001/eureka/,http://localhost:8002/eureka/,http://localhost:8003/eureka/
```
服务消费者和服务提供者配置
```yml
```yml
eureka:
  client:
    service-url:
    #如果这里只是·配置其中的一个节点，也能正常注册到集群，因为server集群节点间会进行同步，一般最好配置多个集群节点
      defaultZone: http://localhost:8001/eureka/,http://localhost:8002/eureka/,http://localhost:8003/eureka/
```


EurekaServer的高可用实际上就是将自己作为服务向其他服务注册中心注册自己， 这样就可以形成一组互相注册的服务注册中心， 以实现服务清单的互相同步， 达到高可用的效果

### 9.2.3. 原理说明
<a href="#menu" >目录</a>

#### 9.2.3.1. 基础模块说明
<a href="#menu" >目录</a>

**基础架构**
* 服务注册中心
    * Eureka 提供的服务端， 提供服务注册与发现的功能， 也就是在上一节中我们实现的 eureka-server。
* 服务提供者
    * 提供服务的应用， 可以是 Spring Boot 应用， 也可以是其他技术平台且遵循 Eureka 通信机制的应用。它将自己提供的服务注册到 Eureka, 以供其他应用发现。
* 服务消费者
    * 消费者应用从服务注册中心获取服务列表， 从而使消费者可以知道去何处调用其所需要的服务

**服务治理机制**
![Spring Cloud服务架构图](pic/spring/springcloud/eureka.png)

* **服务提供者**
    * 服务注册
        * “服务提供者" 在启动的时候会通过发送REST请求的方式将自己注册到EurekaServer上，同时带上了自身服务的一些元数据信息。
        * Eureka Server接收到这个REST请求之后，将元数据信息存储在一个双层结构Map中， 其中第一层的key是服务名， 第二层的key是具体服务的实例名。
        * eureka.client.register-with-eureka=true默认为true。 若设置为false将不会启动注册操作。
        * 元数据
            * 标准元数据
                * 主机名，IP地址，端口号，状态页和健康检查等信息
            * 自定义元数据
                * 通过eureka.instance.metadata-map进行配置，key-value型
    * 服务同步
        * 如架构图中所示， 这里的两个服务提供者分别注册到了两个不同的服务注册中心上，也就是说， 它们的信息分别被两个服务注册中心所维护。 此时，由于服务注册中心之间因互相注册为服务， 当服务提供者发送注册请求到一个服务注册中心时， 它会将该请求转发给集群中相连的其他注册中心， 从而实现注册中心之间的服务同步 。 
        * 通过服务同步，两个服务提供者的服务信息就可以通过这两台服务注册中心中的任意一台获取到。
    * 服务续约
        * 服务注册中心和服务提供者将会进行心跳操作，服务注册中心如果长时间没有心跳，则会注销该实例。
        * eureka.instance.lease-renewal-interval-in-seconds 参数用于定义服务续约任务的调用间隔时间，默认为30秒
        * eureka.instance.lease-expiration-duration-in-seconds参数用于定义服务失效的时间，默认为90秒.也就是说连续三次没有心跳，说明该服务实例失效了
* **服务消费者**
    * 获取服务
        * 启动服务消费者的时候，它会发送一个REST请求给服务注册中心，来获取上面注册的服务清单
        * Eureka Server会维护一份只读的服务清单来返回给客户端，同时该缓存清单会每隔30秒更新一次.
        * 获取服务是服务消费者的基础，所以必须确保eureka.client.fetch-registry=true,默认值为true
        * 希望修改缓存清单的 更新时间，可以通过 eureka.client.registry-fetch-interval-seconds=30参数进行修改，该参数默认值为30, 单位为秒        
    * 服务调用
        * 服务消费者在 获取服务清单后，通过服务名可以获得具体提供服务的实例名和该实例的元数据信息。 因为有这些服务实例的详细信息， 所以客户端可以根据自己的需要决定具体调用哪个实例，在ribbon中会默认采用轮询的方式进行调用，从而实现客户端的负载均衡
        * 对于访问实例的选择，Eureka中有Region和Zone的概念， 一 个Region中可以包含多个Zone, 每个服务客户端需要被注册到 一个Zone中， 所以每个客户端对应一个Region和一个Zone。 在进行服务调用的时候， 优先访问同处一个 Zone 中的服务提供方， 若访问不到，就访问其他的Zone
    * 服务下线
        * 当服务实例进行正常的关闭操作时， 它会触发一个服务下线的REST请求给Eurkea-Server
        * 服务端在接收到请求 之后， 将该服务状态置为下线(DOWN), 并把该下线事件传播出去
* **服务注册中心**
    * 失效剔除
        * Eureka Server在启动的时候会创建一个定时任务，默认每隔一段时间（默认为60秒） 将当前清单中超时（默认为90秒）没有续约的服务剔除出去。
    * 自我保护
        * EurekaServer在运行期间，会统计心跳失败的比例在15分钟之内是否低于85%, 如果出现低于的情况（在单机调试的时候很容易满足， 实际在生产环境上通常是由于网络不稳定导致）， EurekaServer会将当前的实例注册信息保护起来， 让这些实例不会过期， 尽可能保护这些注册信息
        * 在这段保护期间内实例若出现问题， 那么客户端很容易拿到实际已经不存在的服务实例， 会出现调用失败的清况， 所以客户端必须要有容错机制， 比如可以使用请求重试、 断路器等机制。
        * eureka.server.enableself-preservation=true,默认使能
    * 服务注册中心应当具备的功能
      * 服务注册表：是服务注册组件的核心。用来记录各个微服务的信息。例如名称,ip,端口等。服务注册表提供查询API和管理API,查询API用于查询可用的微服务实例，管理API用于服务的注销和注册
      * 服务注册和服务发现，服务注册是在微服务启动的时候，将自己的信息注册到服务注册中心。服务发现是指查询可用微服务及其网络地址的信息
      * 服务检查，使用一定机制检查已经注册的服务，如发现某实例长时间无法访问，就从服务注册表中移除该实例。
    * Spring注册中心的实现有Eureka,Consul,zookeeper

服务消费者本身也可能是服务提供者，所以其启动和运行时操作上是一致的。

#### 9.2.3.2. Region,Zone

**背景**

用户量比较大或者用户地理位置分布范围很广的项目，一般都会有多个机房。这个时候如果上线springCloud服务的话，我们希望一个机房内的服务优先调用同一个机房内的服务，当同一个机房的服务不可用的时候，再去调用其它机房的服务，以达到减少延时的作用。

**概念**

eureka提供了region和zone两个概念来进行分区，这两个概念均来自于亚马逊的AWS：
* region：可以简单理解为地理上的分区，比如亚洲地区，或者华北地区，再或者北京等等，没有具体大小的限制。根据项目具体的情况，可以自行合理划分region。每个region之间完全隔离
* zone：可以简单理解为region内的具体机房，比如说region划分为北京，然后北京有两个机房，就可以在此region之下划分出zone1,zone2两个zone。

**分区服务架构图**

![](https://segmentfault.com/img/bV7lKo?w=865&h=343)

如图所示，有一个region:beijing，下面有zone-1和zone-2两个分区，每个分区内有一个注册中心Eureka Server和一个服务提供者Service。 我们在zone-1内创建一个Consumer-1服务消费者的话，其会优先调用同一个zone内的Service-1，当Service-1不可用时，才会去调用zone-2内的Service-2。

**配置**

* Eureka Server-1：
```yml
spring:
  application:
    name: Server-1
server:
  port: 30000
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    hostname: localhost
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
     # 对于服务提供者，优先注册到前面的zone.对于服务消费者，优先请求排在前面的服务提供者
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

```

* Eureka Server-2：

```yml
spring:
  application:
    name: Server-2
server:
  port: 30001
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    hostname: localhost
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
   
      beijing: zone-2,zone-1
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/
```

Service-1:

测试代码：
```java
@RestController
public class HiController {
    @Value("${zone.name}")
    private String zoneName;
    
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return zoneName;
    }
}
```
配置文件：

```yml
spring:
  application:
    name: service
server:
  port: 30010
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-1
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

zone.name: zone-1
```


Service-2:
```yml
spring:
  application:
    name: service
server:
  port: 30011
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-2
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-2,zone-1
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

zone.name: zone-2
```

Consumer-1:

调用服务代码：
```java
@RestController
public class HiController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer")
    public String hi() {
        return restTemplate.getForObject("http://service/hi", String.class);
    }
}
```
配置文件：

```yml
spring:
  application:
    name: consumer
server:
  port: 30030
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-1
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

```
* Consumer-1优先调用的是同一个zone-1的Service-1，这个时候，无论怎么刷新，调用多少次，都只会调用Service-1，不会调用Service-2.
* 当我们把Service-1服务停掉，再调用的话,才会调用zone-2分区下的Service-2。

**配置文件讲解**

整个分区分为两步：
* 服务注册：要保证服务注册到同一个zone内的注册中心，因为如果注册到别zone的注册中心的话，网络延时比较大，心跳检测很可能出问题。
* 服务调用：要保证优先调用同一个zone内的服务，只有在同一个zone内的服务不可用时，才去调用别zone的服务。

1. 服务注册的配置文件
```yml
eureka:
  client:
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/
```

当一个服务（作为一个eureka client）向注册中心（eureka server）注册的时候，会根据eureka.client下的配置来进行注册。这里我们主要关心有多个注册中心的情况下，服务会注册到哪个注册中心，并且和哪个注册中心来维持心跳检测。
注册中心选择逻辑：
1. 如果prefer-same-zone-eureka为false，按照service-url下的 list取第一个注册中心来注册，并和其维持心跳检测。不会再向list内的其它的注册中心注册和维持心跳。只有在第一个注册失败的情况下，才会依次向其它的注册中心注册，总共重试3次，如果3个service-url都没有注册成功，则注册失败。每隔一个心跳时间，会再次尝试。
2. 如果prefer-same-zone-eureka为true，先通过region取availability-zones内的第一个zone，然后通过这个zone取service-url下的list，并向list内的第一个注册中心进行注册和维持心跳，不会再向list内的其它的注册中心注册和维持心跳。只有在第一个注册失败的情况下，才会依次向其它的注册中心注册，总共重试3次，如果3个service-url都没有注册成功，则注册失败。每隔一个心跳时间，会再次尝试。

所以说，为了保证服务注册到同一个zone的注册中心，一定要注意availability-zones的顺序，必须把同一zone写在前面

2. 服务调用的配置文件
```yml
eureka:
  instance:
    metadata-map:
      zone: zone-1
```
服务消费者和服务提供者分别属于哪个zone，均是通过eureka.instance.metadata-map.zone来判定的。
服务消费者会先通过ribbon去注册中心拉取一份服务提供者的列表，然后通过eureka.instance.metadata-map.zone指定的zone进行过滤，过滤之后如果同一个zone内的服务提供者有多个实例，则会轮流调用。
只有在同一个zone内的所有服务提供者都不可用时，才会调用其它zone内的服务提供者。

* 扩展
```yml
eureka.instance.lease-renewal-interval-in-seconds: 30
```
服务和注册中心的心跳间隔时间，默认为30s
```yml
eureka.instance.lease-expiration-duration-in-seconds: 90
```
服务和注册中心的心跳超时时间，默认为90s

也就是说，当一个服务异常down掉后，90s之后注册中心才会知道这个服务不可用了。在此期间，依旧会把这个服务当成正常服务。ribbon调用仍会把请求转发到这个服务上。为了避免这段期间出现无法提供服务的情况，要开启ribbon的重试功能，去进行其它服务提供者的重试。

#### 9.2.3.3. 源码分析
<a href="#menu" >目录</a>

Eureka服务端与客户之间的通讯方式为http，服务端通过提供rest API风格的接口与客户端或其它服务端交互。

我们在将一个普通的 Spring Boot 应用注册到 Eureka Server 或是从 Eureka Server 中获取服务列表时， 主要就做了两件事：
* 在应用主类中配置了@EnableDiscoveryClient注解。
* 在app让cation.yml 中用 eureka.client.serviceUrl.defaultZone参数指定了服务注册中心的位置。

##### 9.2.3.3.1. EnableDiscoveryClient注解说明
<a href="#menu" >目录</a>

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableDiscoveryClientimportSelector.class)
public @interface EnableDiscoveryClient {

}
```
从注解上看.主要引入了EnableDiscoveryClientImportSelector类
```java
@Order(2147483547)
public class EnableDiscoveryClientImportSelector extends SpringFactoryImportSelector<EnableDiscoveryClient> {
    public EnableDiscoveryClientImportSelector() {
    }

    public String[] selectImports(AnnotationMetadata metadata) {
        String[] imports = super.selectImports(metadata);
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(metadata.getAnnotationAttributes(this.getAnnotationClass().getName(), true));
        boolean autoRegister = attributes.getBoolean("autoRegister");
        if (autoRegister) {
            List<String> importsList = new ArrayList(Arrays.asList(imports));
            importsList.add("org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationConfiguration");
            imports = (String[])importsList.toArray(new String[0]);
        } else {
            Environment env = this.getEnvironment();
            if (ConfigurableEnvironment.class.isInstance(env)) {
                ConfigurableEnvironment configEnv = (ConfigurableEnvironment)env;
                LinkedHashMap<String, Object> map = new LinkedHashMap();
                map.put("spring.cloud.service-registry.auto-registration.enabled", false);
                MapPropertySource propertySource = new MapPropertySource("springCloudDiscoveryClient", map);
                configEnv.getPropertySources().addLast(propertySource);
            }
        }

        return imports;
    }

    protected boolean isEnabled() {
        return (Boolean)this.getEnvironment().getProperty("spring.cloud.discovery.enabled", Boolean.class, Boolean.TRUE);
    }

    protected boolean hasDefaultFactory() {
        return true;
    }
}

```

##### 9.2.3.3.2. 服务注册
<a href="#menu" >目录</a>


##### 9.2.3.3.3. 服务续约
<a href="#menu" >目录</a>




### 9.2.4. 更多配置说明
<a href="#menu" >目录</a>


#### 9.2.4.1. 服务注册类配置

关于服务注册类的配置信息， 我们可以通过查看 org.springframework.cloud.netflix.eureka.EurekaClien.ConfigBean 的源码来获得比官方文档中更 为详尽的内容

```java
@ConfigurationProperties("eureka.client")
public class EurekaClientConfigBean implements EurekaClientConfig, Ordered {
    public static final String PREFIX = "eureka.client";
    public static final String DEFAULT_URL = "http://localhost:8761/eureka/";
    public static final String DEFAULT_ZONE = "defaultZone";
    private static final int MINUTES = 60;
    @Autowired(
        required = false
    )
    PropertyResolver propertyResolver;

    //启用客户端
    private boolean enabled = true;
    @NestedConfigurationProperty
    private EurekaTransportConfig transport = new CloudEurekaTransportConfig();
    //client从server获取服务列表信息的间隔
    private int registryFetchIntervalSeconds = 30;
    //server复制实例更改的间隔 
    private int instanceInfoReplicationIntervalSeconds = 30;
    //server复制实例信息的间隔
    private int initialInstanceInfoReplicationIntervalSeconds = 40;
    //server可能被添加和移除，这个参数控制client最快多久知道这个情况 
    private int eurekaServiceUrlPollIntervalSeconds = 300;
    //eureka server的代理端口 
    private String proxyPort;
    //eureka server的代理host name
    private String proxyHost;
    //eureka server的代理user name 
    private String proxyUserName;
    //eureka server的代理 密码
    private String proxyPassword;
    //从server读取所需的超时时间
    private int eurekaServerReadTimeoutSeconds = 8;
    // 连接server的超时时间
    private int eurekaServerConnectTimeoutSeconds = 5;
    //Gets the name of the implementation which implements BackupRegistry to fetch the registry information as a fall back option for only the first time when the eureka client starts.
    private String backupRegistryImpl;
    // 被允许连接到所有server host的总连接数
    private int eurekaServerTotalConnections = 200;
    //被允许连接到每一个server host的总连接数
    private int eurekaServerTotalConnectionsPerHost = 50;
    private String eurekaServerURLContext;
    //端口
    private String eurekaServerPort;
    /**
    
    */
    private String eurekaServerDNSName;
    /**
    地区，可以为任意值，一个region中有多个zone.
    */
    private String region = "us-east-1";
    /**
    连接到server的http连接的空闲超时时间，超时时间到会被防火墙清理掉
    */
    private int eurekaConnectionIdleTimeoutSeconds = 30;
    /**
    指示这个client 是否仅对single VIP的注册信息感到兴趣
    */
    private String registryRefreshSingleVipAddress;
    /**
    heartbeatExecutor 的线程数
    */
    private int heartbeatExecutorThreadPoolSize = 2;
    /**
    Heartbeat executor exponential back off related property. It is a maximum multiplier value for retry delay, in case where a sequence of timeouts occurred.
    */
    private int heartbeatExecutorExponentialBackOffBound = 10;
    /**
    cacheRefreshExecutor 的线程数
    */
    private int cacheRefreshExecutorThreadPoolSize = 2;
    /**
    Cache refresh executor exponential back off related property. It is a maximum multiplier value for retry delay, in case where a sequence of timeouts occurred.
    */
    private int cacheRefreshExecutorExponentialBackOffBound = 10;
    /**
    注册中心的地址。 格式:zone-1: http://server1:8001/eureka/
    */
    private Map<String, String> serviceUrl = new HashMap();
    /**
    从server获取的信息是否需要压缩，压缩可以优化网络情况
    */
    private boolean gZipContent;
    /**
    
    */
    private boolean useDnsForFetchingServiceUrls;
    /**
    指示本身是否能够被其他server发现并注册
    */
    private boolean registerWithEureka;
    /**
    指示当出现延迟或者其他原因 ，此实例是否在会优先从同一个zone中寻找服务提供者
    */
    private boolean preferSameZoneEureka;
    /**
    指示是否记录server和client之间的差异
    */
    private boolean logDeltaDiff;
    /**
    true: client 每次从server获取相关信息都是获取全部的信息，false:只获取增加的新的信息
    */
    private boolean disableDelta;
    /**
    
    */
    private String fetchRemoteRegionsRegistry;
    /**
    zone，一个region中有多个zone.可以配置多个值，中间使用逗号分隔。 格式: us-east-1: zone-0,zone-1
    */
    private Map<String, String> availabilityZones;
    /**
    获取实例时是否过滤，仅保留UP状态的实例。
    */
    private boolean filterOnlyUpInstances;
    /**
    指示client是否从server获取注册信息 
    */
    private boolean fetchRegistry;
    /**
    在server序列化/反序列化信息时获取替换字符串美元符号"$"
    */
    private String dollarReplacement;
    /**
    在server序列化/反序列化信息时获取替换字符串下划线"_"
    */
    private String escapeCharReplacement;
    /**
    指示服务器是否可以将客户端请求重定向到备份服务器/集群。如果设置为false，服务器将直接处理请求，如果设置为true，则可以使用新的服务器位置向客户端发送HTTP重定向
    */
    private boolean allowRedirects;
    /**
    如果设置为true,通过ApplicationInfoManager 更新本地状态将会触发（有限的速率）注册/更新到远程的eureka server
    */
    private boolean onDemandUpdateStatusChange;
    /**
     一个瞬态配置，一旦最新的编解码器稳定，就可以删除
    */
    private String encoderName;
    /**
    一个瞬态配置，一旦最新的编解码器稳定，就可以删除
    */
    private String decoderName;
    /**
    EurekaAccept name for client data accept 
    */
    private String clientDataAccept;
    /**
    指示客户端是否应在客户端关闭时从远程服务器显式注销自身
    */
    private boolean shouldUnregisterOnShutdown;
    /**
    指示客户端是否应在初始化期间强制注册 
    */
    private boolean shouldEnforceRegistrationAtInit;
    /**
    Order of the discovery client used by CompositeDiscoveryClient for sorting available clients 
    */
    private int order;

    public EurekaClientConfigBean() {
        this.serviceUrl.put("defaultZone", "http://localhost:8761/eureka/");
        this.gZipContent = true;
        this.useDnsForFetchingServiceUrls = false;
        this.registerWithEureka = true;
        this.preferSameZoneEureka = true;
        this.availabilityZones = new HashMap();
        this.filterOnlyUpInstances = true;
        this.fetchRegistry = true;
        this.dollarReplacement = "_-";
        this.escapeCharReplacement = "__";
        this.allowRedirects = false;
        this.onDemandUpdateStatusChange = true;
        this.clientDataAccept = EurekaAccept.full.name();
        this.shouldUnregisterOnShutdown = true;
        this.shouldEnforceRegistrationAtInit = false;
        this.order = 0;
    }
}
```


**前缀eureka.client**
|参数名| 说明| 默认值|
|---|---|---|
|enabled| 启用Eureka客户端| true
|registryFetcl让ntervalSeconds |从Eureka服务端获取注册信息的间隔时间，单位为秒 |30
|instancelnfoReplicationlnterva!Seconds 更新实例信息的变化到E田eka服务端的间隔时间， 单位为秒 30
|inItiallnstancelnfoRepIicationintervalSeconds| 初始化 实例信息到 Eureka 服务端的间隔时间， 单位为秒| 40
|eurekaServiceUrlPolllntervalSeconds|轮询Eureka服务端地址更改的间隔时间，单位为秒。当我们与Spring Cloud Config配合，动态刷新Eureka的serv1ceURL地址时需要关注该参数|300
|eurekaServerReadTimeoutSeconds| 读取Eureka Se1-ver信息的超时时间， 单位为秒| 8
|eurekaServerConnectTimeoutSeconds| 连接 Eureka Server的超时时间， 单位为秒| 5
|eurekaServerTotalConnections| 从Eureka客户端到所有Eureka服务端的连接总数| 200
|eurekaServerTotalConnectionsPerHost |从Eureka客户端到每个Eureka服务端主机的连接总数 |50
|eurekaConnectionldleTimeoutSeconds| Eureka服务端 连接的空闲关闭时间， 单位为秒| 30
|heartbeatExecutorT缸eadPoolSize |心跳连接池的初始化线程数| 2
|heartbeatExecutorExponentta!BackOffBound |心跳超时重试延迟时间的最大乘数值| 10
|cacheRefresl让xecutorThreadPoolS1ze| 缓存刷新线程池的初始化线程数| 2
|cacheRefreshExecutorExponentialBackOffBound |缓存刷新重试延迟时间的最大乘数值| 10
|useDnsForFetchmgServ1ceUrls| 使用DNS来获取Eureka服务端的serviceUri| false
|registerWitl也ureka |是否要将自身的实例信息 注册到Eureka服务端| true
|preferSameZoneEureka |是否偏好使用处于相同Zone的Eureka服务端| true
|filterOnlyUplnstances| 获取实例 时是否过滤， 仅保留UP状态的实例 |true
|fetchRegistry| 是否从Eureka服务端获取注册信息|true


#### 9.2.4.2. 服务实例类配置

关千服务实例类的配置信息， 我们可以通过查看org.springframework.cloud.netflix.eureka.EurekainstanceConfigBean的源码来获取详细内容， 这些配置信息都以eureka.instance为前缀

```java

@ConfigurationProperties("eureka.instance")
public class EurekaInstanceConfigBean implements CloudEurekaInstanceConfig, EnvironmentAware {
    private static final String UNKNOWN = "unknown";
    /*
    
    */
    private HostInfo hostInfo;
    /*
    
    */
    private InetUtils inetUtils;
    /*
    
    */
    private String actuatorPrefix = "/actuator";
    /*
    服务名，默认取 spring.application.name 配置值，如果没有则为 unknown
    */
    private String appname = "unknown";
    /*
    
    */
    private String appGroupName;
    /*
    
    */
    private boolean instanceEnabledOnit;
    /*
    
    */
    private int nonSecurePort = 80;
    /*
    
    */
    private int securePort = 443;
    /*
    
    */
    private boolean nonSecurePortEnabled = true;
    /*
    
    */
    private boolean securePortEnabled;
    /*
    定义服务续约任务（心跳）的调用间隔，单位：秒
    */
    private int leaseRenewalIntervalInSeconds = 30;
    /*
    定义服务失效的时间，单位：秒
    */
    private int leaseExpirationDurationInSeconds = 90;
    /*
    
    */
    private String virtualHostName = "unknown";
    /*
    区分同一服务中不同实例的唯一标识
    默认为${spring.cloud.client.hostname}:${spring.application.name}:${spring.application.instance—id:${server.port}}
    */
    private String instanceId;
    /*
    
    */
    private String secureVirtualHostName = "unknown";
    /*
    
    */
    private String aSGName;
    /*
    自定义的元数据,消费者可以获取到
    */
    private Map<String, String> metadataMap = new HashMap();
    /*
    
    */
    private DataCenterInfo dataCenterInfo;
    /*
    IP地址
    */
    private String ipAddress;
    /*
    状态页面的URL，相对路径，默认使用 HTTP 访问，如果需要使用 HTTPS则需要使用绝对路径配置
    */
    private String statusPageUrlPath;
    /*
    状态页面的URL，绝对路径
    */
    private String statusPageUrl;
    /*
    
    */
    private String homePageUrlPath;
    /*
    
    */
    private String homePageUrl;
    /*
    健康检查页面的URL，相对路径，默认使用 HTTP 访问，如果需要使用 HTTPS则需要使用绝对路径配置
    */
    private String healthCheckUrlPath;
    /*
    健康检查页面的URL，绝对路径
    */
    private String healthCheckUrl;
    /*
    
    */
    private String secureHealthCheckUrl;
    /*
    
    */
    private String namespace;
    /*
    设置当前实例的主机名称
    */
    private String hostname;
    /*
    不使用主机名来定义注册中心的地址，而使用IP地址的形式，如果设置了eureka.instance.ip-address 属性，则使用该属性配置的IP，否则自动获取除环路IP外的第一个IP地址
    */
    private boolean preferIpAddress;
    /*
    
    */
    private InstanceStatus initialStatus;
    /*
    
    */
    private String[] defaultAddressResolutionOrder;
    /*
    
    */
    private Environment environment;

    public String getHostname() {
        return this.getHostName(false);
    }

    private EurekaInstanceConfigBean() {
        this.dataCenterInfo = new MyDataCenterInfo(Name.MyOwn);
        this.statusPageUrlPath = this.actuatorPrefix + "/info";
        this.homePageUrlPath = "/";
        this.healthCheckUrlPath = this.actuatorPrefix + "/health";
        this.namespace = "eureka";
        this.preferIpAddress = false;
        this.initialStatus = InstanceStatus.UP;
        this.defaultAddressResolutionOrder = new String[0];
    }

    public EurekaInstanceConfigBean(InetUtils inetUtils) {
        this.dataCenterInfo = new MyDataCenterInfo(Name.MyOwn);
        this.statusPageUrlPath = this.actuatorPrefix + "/info";
        this.homePageUrlPath = "/";
        this.healthCheckUrlPath = this.actuatorPrefix + "/health";
        this.namespace = "eureka";
        this.preferIpAddress = false;
        this.initialStatus = InstanceStatus.UP;
        this.defaultAddressResolutionOrder = new String[0];
        this.inetUtils = inetUtils;
        this.hostInfo = this.inetUtils.findFirstNonLoopbackHostInfo();
        this.ipAddress = this.hostInfo.getIpAddress();
        this.hostname = this.hostInfo.getHostname();
    }
}
```


**前缀eureka.instance**
|参数名| 说明| 默认值|
|---|---|---|
|preferlpAddress| 是否优先使用IP地址作为主机名的标识| false
|leaseRenewallntervallnSeconds| Eureka客户端向服务端发送心跳的时间间隔， 单位为秒| 30
|leaseExpirationDurationlnSeconds |Eureka服务端在收到砓后 一次心跳之后等待的时间上限，单位为秒。 超过该时间之后服务端会将该服务实例从服务消单中剔除， 从而禁止服务调用请求被发送到该实例上 |90
|nonSecurePort |非安全的通信端口号 |80
|securePort |安全的通信端口号| 443
|nonSecurePotiEnabled |是否启用非安全的通信端口号 |true
|securePortEnabled| 是否启用安全的通信端口号
|appname |服务名，默认取spring.application.name的配置值，如果没有则为unknown
|hostname |主机名， 不配置的时候将根据操作系统的主机名来获取






## 9.3. 负载均衡Ribbon
<a href="#menu" >目录</a>

Spring Cloud Ribbon 是一个基于 HTTP 和 TCP 的客户端负载均衡工具，它基于 Netflix ribbon 实现。 通过 Spring Cloud 的封装， 可以让我们轻松地将面向服务的 REST 模板请求自动转换成客户端负载均衡的服务调用。 Spring Cloud Ribbon 虽然只是一个工具类框架，它不像服务注册中心、 配置中心、 API 网关那样需要独立部署， 但是它几乎存在于每一个Spring Cloud 构建的微服务和基础设施中。 因为微服务间的调用，API 网关的请求转发等内容实际上都是通过伈bbon 来实现的，包括后续我们将要介绍的 Feign, 它也是基于 Ribbon实现的工具。 所以， 对 Spring Cloud Ribbon 的理解和使用， 对于我们使用 Spring Cloud 来构建微服务非常重要。

ribbon底层是基于RestTemplate实现Http请求
org.springframework.web.client.RestTemplate

### 9.3.1. 基本使用
<a href="#menu" >目录</a>

**引入依赖**
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```
**代码**

```java
@Configuration
public class RibbonConfig {

    @Bean
    //开启客户端ribbon负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

@Service
public class RibbonService {

    private  static Logger log = LoggerFactory.getLogger(RibbonService.class);

    //注入
    @Autowired
    private  RestTemplate restTemplate;

    //用于容错，可以不用
    @HystrixCommand(fallbackMethod = "ribbonFail")
    public String  ribbon(){
        //通过服务名称cloud-provider进行调用
        return  restTemplate.getForObject("http://cloud-provider/ribbon",String.class);
    }
    public String  ribbonFail(){
        log.info("ribbon 请求失败");
        return  "ribbon 请求失败" + new Date().getSeconds();
    }

}



```

### 9.3.2. 原理说明
<a href="#menu" >目录</a>

#### 9.3.2.1. 源码分析

**LoadBalancerAutoConfiguration配置类**

在该自动化配置类中， 主要做了下面三件事：
* 创建了一个LoadBalancer工吐erceptor的Bean, 用千实现对客户端发起请求时进行拦截， 以实现客户端负载均衡。
* 创建了 一个RestTemplateCustomizer的Bean, 用于给Res七Template增加LoadBalancer工nterceptor拦截器。
* 维护了 一个被@LoadBalanced 注解修饰的RestTempl琴e对象列表， 并在这里进行初始化， 通过调用Res七TemplateCustomizer的实例来给需要客户端负载均衡的Res七Template增加LoadBalancerin七erceptor拦截器。

```java
@Configuration
@ConditionalOnClass({RestTemplate.class})
@ConditionalOnBean({LoadBalancerClient.class})
@EnableConfigurationProperties({LoadBalancerRetryProperties.class})
public class LoadBalancerAutoConfiguration {
    @LoadBalanced
    @Autowired(
        required = false
    )
    private List<RestTemplate> restTemplates = Collections.emptyList();
    @Autowired(
        required = false
    )
    private List<LoadBalancerRequestTransformer> transformers = Collections.emptyList();

    public LoadBalancerAutoConfiguration() {
    }

    @Bean
    public SmartInitializingSingleton loadBalancedRestTemplateInitializerDeprecated(final ObjectProvider<List<RestTemplateCustomizer>> restTemplateCustomizers) {
        return () -> {
            restTemplateCustomizers.ifAvailable((customizers) -> {
                Iterator var2 = this.restTemplates.iterator();

                while(var2.hasNext()) {
                    RestTemplate restTemplate = (RestTemplate)var2.next();
                    Iterator var4 = customizers.iterator();

                    while(var4.hasNext()) {
                        RestTemplateCustomizer customizer = (RestTemplateCustomizer)var4.next();
                        customizer.customize(restTemplate);
                    }
                }

            });
        };
    }

    @Bean
    @ConditionalOnMissingBean
    public LoadBalancerRequestFactory loadBalancerRequestFactory(LoadBalancerClient loadBalancerClient) {
        return new LoadBalancerRequestFactory(loadBalancerClient, this.transformers);
    }

    @Configuration
    @ConditionalOnClass({RetryTemplate.class})
    public static class RetryInterceptorAutoConfiguration {
        public RetryInterceptorAutoConfiguration() {
        }

        @Bean
        @ConditionalOnMissingBean
        public RetryLoadBalancerInterceptor ribbonInterceptor(LoadBalancerClient loadBalancerClient, LoadBalancerRetryProperties properties, LoadBalancerRequestFactory requestFactory, LoadBalancedRetryFactory loadBalancedRetryFactory) {
            return new RetryLoadBalancerInterceptor(loadBalancerClient, properties, requestFactory, loadBalancedRetryFactory);
        }

        @Bean
        @ConditionalOnMissingBean
        public RestTemplateCustomizer restTemplateCustomizer(final RetryLoadBalancerInterceptor loadBalancerInterceptor) {
            return (restTemplate) -> {
                List<ClientHttpRequestInterceptor> list = new ArrayList(restTemplate.getInterceptors());
                list.add(loadBalancerInterceptor);
                restTemplate.setInterceptors(list);
            };
        }
    }

    @Configuration
    @ConditionalOnClass({RetryTemplate.class})
    public static class RetryAutoConfiguration {
        public RetryAutoConfiguration() {
        }

        @Bean
        @ConditionalOnMissingBean
        public LoadBalancedRetryFactory loadBalancedRetryFactory() {
            return new LoadBalancedRetryFactory() {
            };
        }
    }

    @Configuration
    @ConditionalOnMissingClass({"org.springframework.retry.support.RetryTemplate"})
    static class LoadBalancerInterceptorConfig {
        LoadBalancerInterceptorConfig() {
        }

        @Bean
        public LoadBalancerInterceptor ribbonInterceptor(LoadBalancerClient loadBalancerClient, LoadBalancerRequestFactory requestFactory) {
            return new LoadBalancerInterceptor(loadBalancerClient, requestFactory);
        }

        @Bean
        @ConditionalOnMissingBean
        public RestTemplateCustomizer restTemplateCustomizer(final LoadBalancerInterceptor loadBalancerInterceptor) {
            return (restTemplate) -> {
                List<ClientHttpRequestInterceptor> list = new ArrayList(restTemplate.getInterceptors());
                list.add(loadBalancerInterceptor);
                restTemplate.setInterceptors(list);
            };
        }
    }
}


```
当一个被@LoadBalanced 注解修饰的 RestTemplate 对象向外发起 HTTP 请求时， 会被 LoadBalancerinterceptor 类的 intercept 函数所拦截。

![ribbon请求流程](pic/spring/springcloud/ribbon-dorequest.png)

restTemplate.getForObject()-->RestTemplate.execute()-->RestTemplate.doExecute()-->AbstractClientHttpRequest.execute()-->AbstractBufferingClientHttpRequest.executeInternal()-->InterceptingClientHttpRequest.execute()-->InterceptingClientHttpRequest.InterceptingRequestExecution.execute()

也就是说应用程序调用restTemplate的相关操作方法时,会被拦截器拦截,拦截器中有负载均衡拦截器,通过负载均衡拦截器中的IRule对象获取到本次的请求目的服务,最终发出请求.
用户可以自行定义IRule实现类.

InterceptingClientHttpRequest

```java

public class RestTemplate extends InterceptingHttpAccessor implements RestOperations {
    @Nullable
    public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
        RequestCallback requestCallback = this.acceptHeaderRequestCallback(responseType);
        HttpMessageConverterExtractor<T> responseExtractor = new HttpMessageConverterExtractor(responseType, this.getMessageConverters(), this.logger);
        //RestTemplate的调用请求最终都会调用execute方法来执行.
        return this.execute(url, HttpMethod.GET, requestCallback, responseExtractor, (Object[])uriVariables);
    }
}

public ClientHttpResponse execute(HttpRequest request, byte[] body) throws IOException {
    if (this.iterator.hasNext()) {
        //执行拦截器
        ClientHttpRequestInterceptor nextInterceptor = (ClientHttpRequestInterceptor)this.iterator.next();
        return nextInterceptor.intercept(request, body, this);
    } else {
        HttpMethod method = request.getMethod();
        Assert.state(method != null, "No standard HTTP method");
        ClientHttpRequest delegate = InterceptingClientHttpRequest.this.requestFactory.createRequest(request.getURI(), method);
        request.getHeaders().forEach((key, value) -> {
            delegate.getHeaders().addAll(key, value);
        });
        if (body.length > 0) {
            if (delegate instanceof StreamingHttpOutputMessage) {
                StreamingHttpOutputMessage streamingOutputMessage = (StreamingHttpOutputMessage)delegate;
                streamingOutputMessage.setBody((outputStream) -> {
                    StreamUtils.copy(body, outputStream);
                });
            } else {
                StreamUtils.copy(body, delegate.getBody());
            }
        }

        return delegate.execute();
    }
}
```

上面的nextInterceptor.intercept(request, body, this);将会执行负载均衡拦截器,也就是LoadBalancerInterceptor的intercept()方法.

该方法最终调用的是LoadBalancerClient的execute方法.

```java
public class LoadBalancerInterceptor implements ClientHttpRequestInterceptor {
    private LoadBalancerClient loadBalancer;
    private LoadBalancerRequestFactory requestFactory;

    public LoadBalancerInterceptor(LoadBalancerClient loadBalancer, LoadBalancerRequestFactory requestFactory) {
        this.loadBalancer = loadBalancer;
        this.requestFactory = requestFactory;
    }

    public LoadBalancerInterceptor(LoadBalancerClient loadBalancer) {
        this(loadBalancer, new LoadBalancerRequestFactory(loadBalancer));
    }

    public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, final ClientHttpRequestExecution execution) throws IOException {
        URI originalUri = request.getURI();
        String serviceName = originalUri.getHost();
        Assert.state(serviceName != null, "Request URI does not contain a valid hostname: " + originalUri);
        return (ClientHttpResponse)this.loadBalancer.execute(serviceName, this.requestFactory.createRequest(request, body, execution));
    }
}
```


**通过负载均衡获取服务器并执行请求**

* @LoadBalanced注解 源码的注释中可以知道， 该注解用来给RestTemplate做标记， 以使用负载均衡的客户端(LoadBalancerClient)来配置它

```java
package org.springframework.cloud.client.loadbalancer;

import java.io.IOException;
import java.net.URI;
import org.springframework.cloud.client.ServiceInstance;

public interface LoadBalancerClient extends ServiceInstanceChooser {
    <T> T execute(String serviceId, LoadBalancerRequest<T> request) throws IOException;

    <T> T execute(String serviceId, ServiceInstance serviceInstance, LoadBalancerRequest<T> request) throws IOException;

    URI reconstructURI(ServiceInstance instance, URI original);
}
```
LoadBalancerClient的实现类是RibbonLoadBalancerClient，看下其具体实现
```java
public <T> T execute(String serviceId, LoadBalancerRequest<T> request) throws IOException {
    return this.execute(serviceId, (LoadBalancerRequest)request, (Object)null);
}
public <T> T execute(String serviceId, LoadBalancerRequest<T> request, Object hint) throws IOException {

    //获取负载均衡器
    ILoadBalancer loadBalancer = this.getLoadBalancer(serviceId);
    //通过负载均衡器获取服务
    Server server = this.getServer(loadBalancer, hint);
    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerClient.RibbonServer ribbonServer = new RibbonLoadBalancerClient.RibbonServer(serviceId, server, this.isSecure(server, serviceId), this.serverIntrospector(serviceId).getMetadata(server));
        //最终执行实际的Http请求
        return this.execute(serviceId, (ServiceInstance)ribbonServer, (LoadBalancerRequest)request);
    }
}

protected Server getServer(ILoadBalancer loadBalancer, Object hint) {
    return loadBalancer == null ? null : loadBalancer.chooseServer(hint != null ? hint : "default");
}

    
```
最终是由ILoadBalancer的实现类的chooseServer（）方法负责实现，系统提供了几个，用户也可以自己实现
```java
public interface ILoadBalancer {

    // 向负载均衡器中维护的实例列表增加服务实例。
    void addServers(List<Server> var1);
    //通过某种策略， 从负载均衡器中挑选出 一个具体的服务实例。
    Server chooseServer(Object var1);
    //用来通知和标识负载均衡器中某个具体实例已经停止服务， 不然负载均衡器在下一次获取服务实例清单前都会认为服务实例均是正常服务的
    void markServerDown(Server var1);

    /** @deprecated */
    @Deprecated    
    List<Server> getServerList(boolean var1);
    //获取当前正常服务的实例列表
    List<Server> getReachableServers();
    //获取所有已知的服务实例列表， 包括正常服务和停止服务的实例
    List<Server> getAllServers();
}
```
![负载均衡实现类](pic/spring/springcloud/loadbalance-extends.png)

可以看到默认的是ZoneAwareLoadBalancer方式
```java
public class RibbonClientConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig config) {
        if (this.propertiesFactory.isSet(IRule.class, this.name)) {
            return (IRule)this.propertiesFactory.get(IRule.class, config, this.name);
        } else {
            ZoneAvoidanceRule rule = new ZoneAvoidanceRule();
            rule.initWithNiwsConfig(config);
            return rule;
        }
    }
    @Bean
    @ConditionalOnMissingBean
    public ILoadBalancer ribbonLoadBalancer(IClientConfig config, ServerList<Server> serverList, ServerListFilter<Server> serverListFilter, IRule rule, IPing ping, ServerListUpdater serverListUpdater) {
        return (ILoadBalancer)(this.propertiesFactory.isSet(ILoadBalancer.class, this.name) ? (ILoadBalancer)this.propertiesFactory.get(ILoadBalancer.class, config, this.name) : new ZoneAwareLoadBalancer(config, rule, ping, serverList, serverListFilter, serverListUpdater));
    } 
}
```
再回到 RibbonLoadBalancerC巨ent 的 execute 函数逻辑， 在通过ZoneAwareLoadBalancer 的 chooseServer 函数获取了负载均衡策略分配到的服务实例对象 Server 之后， 将其内容包装成贮bbonServer 对象（该对象除了存储了服务实例的信息之外， 还增加了服务名 service豆、 是否需要使用 HTTPS 等其他信息）， 然后使用该对象再回调 LoadBalancerinterceptor 请求拦截器中 LoadBalancerRequest的 apply(丘nal Serviceins七ance instance) 函数， 向 一个实际的具体服务实例发起请求，从而实现一开始以服务名为 host 的 URI 请求到 host:post 形式的实际访问地址的转换。

RibbonLoadBalancerClient类
```java
//
 public <T> T execute(String serviceId, LoadBalancerRequest<T> request, Object hint) throws IOException {
    ILoadBalancer loadBalancer = this.getLoadBalancer(serviceId);
    Server server = this.getServer(loadBalancer, hint);
    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerClient.RibbonServer ribbonServer = new RibbonLoadBalancerClient.RibbonServer(serviceId, server, this.isSecure(server, serviceId), this.serverIntrospector(serviceId).getMetadata(server));
        return this.execute(serviceId, (ServiceInstance)ribbonServer, (LoadBalancerRequest)request);
    }
}

public <T> T execute(String serviceId, ServiceInstance serviceInstance, LoadBalancerRequest<T> request) throws IOException {
    Server server = null;
    if (serviceInstance instanceof RibbonLoadBalancerClient.RibbonServer) {
        server = ((RibbonLoadBalancerClient.RibbonServer)serviceInstance).getServer();
    }

    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerContext context = this.clientFactory.getLoadBalancerContext(serviceId);
        RibbonStatsRecorder statsRecorder = new RibbonStatsRecorder(context, server);

        try {
            //最终执行请求LoadBalancerRequest实现
            T returnVal = request.apply(serviceInstance);
            statsRecorder.recordStats(returnVal);
            return returnVal;
        } catch (IOException var8) {
            statsRecorder.recordStats(var8);
            throw var8;
        } catch (Exception var9) {
            statsRecorder.recordStats(var9);
            ReflectionUtils.rethrowRuntimeException(var9);
            return null;
        }
    }
}

```

#### 9.3.2.2. 负载均衡器

![负载均衡实现类](pic/spring/springcloud/loadbalance-extends.png)

**AbstractLoadBalancer**是ILoadBalancer接口的抽象实现。在该抽象类中定义了一个关于服务实例的分组枚举类 ServerGroup
```java
public abstract class AbstractLoadBalancer implements ILoadBalancer {
    public AbstractLoadBalancer() {
    }

    public Server chooseServer() {
        return this.chooseServer((Object)null);
    }

    public abstract List<Server> getServerList(AbstractLoadBalancer.ServerGroup var1);

    public abstract LoadBalancerStats getLoadBalancerStats();

    public static enum ServerGroup {
        //所有服务实例。
        ALL,
        //正常服务的实例。
        STATUS_UP,
        //停止服务的实例
        STATUS_NOT_UP;

        private ServerGroup() {
        }
    }
}
public class BaseLoadBalancer extends AbstractLoadBalancer implements PrimeConnectionListener, IClientConfigAware {
     protected IRule rule;

    public Server chooseServer(Object key) {
        if (this.counter == null) {
            this.counter = this.createCounter();
        }

        this.counter.increment();
        if (this.rule == null) {
            return null;
        } else {
            try {
                //通过IRule对象实现服务选择
                return this.rule.choose(key);
            } catch (Exception var3) {
                logger.warn("LoadBalancer [{}]:  Error choosing server for key {}", new Object[]{this.name, key, var3});
                return null;
            }
        }
    }
}

```
**BaseloadBalancer**
BaseLoadBalancer 类是ribbon 负载均衡器的基础实现类，在该类中定义了很多关于负载均衡器相关的基础内容。
* 定义并维护了两个存储服务实例 Server 对象的列表。 一个用千存储所有 服务实例的清单， 一个用于存储正常服务的实例清单。
* 定义了之前我 们提到的用来存储负载均衡器各服务 实 例 属性和统计信息的LoadBalancerS七ats 对象
* 定义了检查服务实例是否正常服务的工贮ng 对象， 在 BaseLoadBalancer 中默认为 null, 需要在构造时注入它的具体实现。
* 定义了检查服务实例操作的执行策略对象工贮ngStrategy,在 BaseLoadBalancer中默认使用了该类中定义的静态内部类 SerialPingStrategy 实现。 根据源码，我们可以看到该策略采用线性遍历 ping 服务实例的方式实现检查。 该策略在当IPing 的实现速度不理想， 或是 Server 列表过大时， 可能会影响系统性能， 这时候需要通过实现 IPingS七rategy 接口并重写 pingServers(Iping ping,Server[] servers) 函数去扩展 ping 的执行策略。
* 定 义 了负 载 均 衡的处理规 则 工Rule 对 象， 从 BaseLoadBalancer 中chooseServer(Object key) 的实现源码， 我们可以知道， 负载均衡器实际将服务实例选择任务委托给了IRule 实例中的 choose 函数来实现。 而在这里， 默认初始化了 RoundRob江Rule 为工Rule 的实现对象。 RoundRobinRule 实现了最基本且常用的线性负载均衡规则
* 启动 ping 任务：在 BaseLoadBalancer 的默认构造函数中，会直接启动一个用于定时检查 Server 是否健康的任务。 该任务默认的执行间隔为 10 秒。
* 实现了 ILoadBalancer 接口定义的负载均衡器应具备以下一系列基本操作。
* addServers(List newServers): 向负载均衡器中增加新的服务实例列表，该实现将原本已经维护着的所有服务实例清单 al1Server巨st 和新传入的服务 实 例 清 单 newServers 都加入到 newList 中， 然后通 过调用setServersList 函数对 newList 进行处理，在 BaseLoadBalancer 中实现的时候会使用新的列表覆盖旧的列表。而之后介绍的几个扩展实现类对千服务实例清单更新的优化都是通过对 setServersLi江函数的重写来实现的

**DynamicServerlistloadBalancer**
DynamicServerListLoadBalancer 类继承于 BaseLoadBalancer 类， 它是对基础负载均衡器的扩展。 在该负载均衡器中， 实现了服务实例清单在运行期的动态更新能力；同时， 它还具备了对服务实例清单的过滤功能， 也就是说， 我们可以通过过滤器来选择性地获取一批服务实例清单

**ZoneAwareloadBalancer**
ZoneAwareLoadBalancer 负载均衡器是对 DynamicServerListLoadBalancer的扩展。在 DynamicServerLis七LoadBalancer 中， 我们可以看到它并没有重写选择具体服务实例的 chooseServer 函数， 所以它依然会采用在 BaseLoadBalancer 中实现的算法。 使用 RoundRobinRule 规则， 以线性轮询的方式来选择调用的服务实例， 该算法实现简单并没有区域 (Zone) 的概念， 所以它会把所有实例视为一个 Zone下的节点来看待， 这样就会周期性地产生跨区域 (Zone) 访问的情况， 由于跨区域会产生更��的延迟，这些实例主要以防止区域性故障实现高可用为目的而不能作为常规访问的实例， 所以在多区域部署的清况下会有一定的性能问题， 而该负载均衡器则 可以避免这样的问题.

#### 9.3.2.3. 负载均衡策略
<a href="#menu" >目录</a>

* IRule
    * 负载均衡接口
    * AbstractLoadBalancerRule
        * 负载均衡策略的 抽象类，在该抽象类中定义了负载均衡器ILoadBalancer对象 ，该对象能够在具体实现选择服务 策略时，获取到一些负载均衡器中维护的信息来作为分配依据， 并以此设计一些符法来实现针对特定场景的高效策略
        * ClientConfigEnabledRoundRobinRule
            * 该策略较为特殊， 我们一般不直接使用它。 因为它本身并没有实现什么特殊的处理逻辑
            * 在它的内部定义了一个 RoundRobinRule 策略， 而 choose函数的实现也正是使用了 RoundRobinRule 的线性轮询机制， 所以它实现的功能实际上与 RoundRobinRule 相同
            * 默认的 choose 就实现了线性轮询机制， 在子类中做一些高级策略时通常有可能会存在一些无法实施的情况， 那么就可以用父类的实现作为备选 
            * BestAvailableRule
                * 通过遍历负载均衡器中维护的所有服务实例， 会过滤掉故障的实例， 并找出并发请求数最小的一个， 所以该策略的特性是可选出最空闲的实例。
            * PredicateBasedRule
                * 一个抽象策略,先过滤清单， 再轮询选择
                * ZoneAvoidanceRule
                * AvailabilityFilteringRule
                    * 该策略继承自上面介绍的抽象策略 Predic红eBasedRule, 所以它也继承了 “先过滤清单，再轮询选择 "的基本处理逻辑
                    * 过滤故障的节点
        * RoundRobinRule
            * 该策略实现了按照线性轮询的方式依次选择每个服务实例的功能。
            * WeightedResponseTimeRule
                * 该策略是对 RoundRobinRule 的扩展， 增加了根据实例的运行情况来计算权重， 并根据权重来挑选实例， 以达到更优的分配效果
            * ResponseTimeWeightedRule
                * 旧的实现，废弃不用
        * RandomRule
            * 该策略实现了从服务实例清单中随机选择 一个服务实例的功能
        * RetryRule
            * 该策略实现了一个具备重试机制的实例选择功能
            * 若选择不到就根据设置的尝试结束时间为阙值 maxRetryMillis参数定义的值+ choose 方法开始执行的时间戳）， 当超过该阑值后就返回 null


**修改负载均衡策略**
```java
@Configuration
public class MyRuleConfig {

    @Bean //修改轮询规则为随机
    public IRule iRule(){
        return new RandomRule();
    }
}
```


```java
public interface IRule {
    Server choose(Object var1);

    void setLoadBalancer(ILoadBalancer var1);

    ILoadBalancer getLoadBalancer();
}
```
**AbstractLoadBalancerRule**
负载均衡策略的 抽象类，在该抽象类中定义了负载均衡器ILoadBalancer对象 ，该对象能够在具体实现选择服务 策略时，获取到一些负载均衡器中维护的信息来作为分配依据， 并以此设计一些符法来实现针对特定场景的高效策略 。

```java
public abstract class AbstractLoadBalancerRule implements IRule, IClientConfigAware {
    private ILoadBalancer lb;

    public AbstractLoadBalancerRule() {
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }
}

```

**RandomRule**

该策略实现了从服务实例清单中随机选择 一个服务实例的功能。

```java

public class RandomRule extends AbstractLoadBalancerRule {
    public RandomRule() {
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```
**RoundRobinRule**
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoundRobinRule extends AbstractLoadBalancerRule {
    private AtomicInteger nextServerCyclicCounter;
    private static final boolean AVAILABLE_ONLY_SERVERS = true;
    private static final boolean ALL_SERVERS = false;
    private static Logger log = LoggerFactory.getLogger(RoundRobinRule.class);

    public RoundRobinRule() {
        this.nextServerCyclicCounter = new AtomicInteger(0);
    }

    public RoundRobinRule(ILoadBalancer lb) {
        this();
        this.setLoadBalancer(lb);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            log.warn("no load balancer");
            return null;
        } else {
            Server server = null;
            int count = 0;

            while(true) {
                if (server == null && count++ < 10) {
                    List<Server> reachableServers = lb.getReachableServers();
                    List<Server> allServers = lb.getAllServers();
                    int upCount = reachableServers.size();
                    int serverCount = allServers.size();
                    if (upCount != 0 && serverCount != 0) {
                        int nextServerIndex = this.incrementAndGetModulo(serverCount);
                        server = (Server)allServers.get(nextServerIndex);
                        if (server == null) {
                            Thread.yield();
                        } else {
                            if (server.isAlive() && server.isReadyToServe()) {
                                return server;
                            }

                            server = null;
                        }
                        continue;
                    }

                    log.warn("No up servers available from load balancer: " + lb);
                    return null;
                }

                if (count >= 10) {
                    log.warn("No available alive servers after 10 tries from load balancer: " + lb);
                }

                return server;
            }
        }
    }

    private int incrementAndGetModulo(int modulo) {
        int current;
        int next;
        do {
            current = this.nextServerCyclicCounter.get();
            next = (current + 1) % modulo;
        } while(!this.nextServerCyclicCounter.compareAndSet(current, next));

        return next;
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```
**WeightedResponseTimeRule**
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;
import com.netflix.client.config.IClientConfigKey;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeightedResponseTimeRule extends RoundRobinRule {
    public static final IClientConfigKey<Integer> WEIGHT_TASK_TIMER_INTERVAL_CONFIG_KEY = new IClientConfigKey<Integer>() {
        public String key() {
            return "ServerWeightTaskTimerInterval";
        }

        public String toString() {
            return this.key();
        }

        public Class<Integer> type() {
            return Integer.class;
        }
    };
    public static final int DEFAULT_TIMER_INTERVAL = 30000;
    private int serverWeightTaskTimerInterval = 30000;
    private static final Logger logger = LoggerFactory.getLogger(WeightedResponseTimeRule.class);
    private volatile List<Double> accumulatedWeights = new ArrayList();
    private final Random random = new Random();
    protected Timer serverWeightTimer = null;
    protected AtomicBoolean serverWeightAssignmentInProgress = new AtomicBoolean(false);
    String name = "unknown";

    public WeightedResponseTimeRule() {
    }

    public WeightedResponseTimeRule(ILoadBalancer lb) {
        super(lb);
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        super.setLoadBalancer(lb);
        if (lb instanceof BaseLoadBalancer) {
            this.name = ((BaseLoadBalancer)lb).getName();
        }

        this.initialize(lb);
    }

    void initialize(ILoadBalancer lb) {
        if (this.serverWeightTimer != null) {
            this.serverWeightTimer.cancel();
        }

        this.serverWeightTimer = new Timer("NFLoadBalancer-serverWeightTimer-" + this.name, true);
        this.serverWeightTimer.schedule(new WeightedResponseTimeRule.DynamicServerWeightTask(), 0L, (long)this.serverWeightTaskTimerInterval);
        WeightedResponseTimeRule.ServerWeight sw = new WeightedResponseTimeRule.ServerWeight();
        sw.maintainWeights();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                WeightedResponseTimeRule.logger.info("Stopping NFLoadBalancer-serverWeightTimer-" + WeightedResponseTimeRule.this.name);
                WeightedResponseTimeRule.this.serverWeightTimer.cancel();
            }
        }));
    }

    public void shutdown() {
        if (this.serverWeightTimer != null) {
            logger.info("Stopping NFLoadBalancer-serverWeightTimer-" + this.name);
            this.serverWeightTimer.cancel();
        }

    }

    List<Double> getAccumulatedWeights() {
        return Collections.unmodifiableList(this.accumulatedWeights);
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                List<Double> currentWeights = this.accumulatedWeights;
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                int serverIndex = 0;
                double maxTotalWeight = currentWeights.size() == 0 ? 0.0D : (Double)currentWeights.get(currentWeights.size() - 1);
                if (maxTotalWeight >= 0.001D && serverCount == currentWeights.size()) {
                    double randomWeight = this.random.nextDouble() * maxTotalWeight;
                    int n = 0;

                    for(Iterator var13 = currentWeights.iterator(); var13.hasNext(); ++n) {
                        Double d = (Double)var13.next();
                        if (d >= randomWeight) {
                            serverIndex = n;
                            break;
                        }
                    }

                    server = (Server)allList.get(serverIndex);
                } else {
                    server = super.choose(this.getLoadBalancer(), key);
                    if (server == null) {
                        return server;
                    }
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                }
            }

            return server;
        }
    }

    void setWeights(List<Double> weights) {
        this.accumulatedWeights = weights;
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
        super.initWithNiwsConfig(clientConfig);
        this.serverWeightTaskTimerInterval = (Integer)clientConfig.get(WEIGHT_TASK_TIMER_INTERVAL_CONFIG_KEY, 30000);
    }

    class ServerWeight {
        ServerWeight() {
        }

        public void maintainWeights() {
            ILoadBalancer lb = WeightedResponseTimeRule.this.getLoadBalancer();
            if (lb != null) {
                if (WeightedResponseTimeRule.this.serverWeightAssignmentInProgress.compareAndSet(false, true)) {
                    try {
                        WeightedResponseTimeRule.logger.info("Weight adjusting job started");
                        AbstractLoadBalancer nlb = (AbstractLoadBalancer)lb;
                        LoadBalancerStats stats = nlb.getLoadBalancerStats();
                        if (stats != null) {
                            double totalResponseTime = 0.0D;

                            ServerStats ss;
                            for(Iterator var6 = nlb.getAllServers().iterator(); var6.hasNext(); totalResponseTime += ss.getResponseTimeAvg()) {
                                Server server = (Server)var6.next();
                                ss = stats.getSingleServerStat(server);
                            }

                            Double weightSoFar = 0.0D;
                            List<Double> finalWeights = new ArrayList();
                            Iterator var20 = nlb.getAllServers().iterator();

                            while(var20.hasNext()) {
                                Server serverx = (Server)var20.next();
                                ServerStats ssx = stats.getSingleServerStat(serverx);
                                double weight = totalResponseTime - ssx.getResponseTimeAvg();
                                weightSoFar = weightSoFar + weight;
                                finalWeights.add(weightSoFar);
                            }

                            WeightedResponseTimeRule.this.setWeights(finalWeights);
                            return;
                        }
                    } catch (Exception var16) {
                        WeightedResponseTimeRule.logger.error("Error calculating server weights", var16);
                        return;
                    } finally {
                        WeightedResponseTimeRule.this.serverWeightAssignmentInProgress.set(false);
                    }

                }
            }
        }
    }

    class DynamicServerWeightTask extends TimerTask {
        DynamicServerWeightTask() {
        }

        public void run() {
            WeightedResponseTimeRule.ServerWeight serverWeight = WeightedResponseTimeRule.this.new ServerWeight();

            try {
                serverWeight.maintainWeights();
            } catch (Exception var3) {
                WeightedResponseTimeRule.logger.error("Error running DynamicServerWeightTask for {}", WeightedResponseTimeRule.this.name, var3);
            }

        }
    }
}

```

**RetryRule**

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;

public class RetryRule extends AbstractLoadBalancerRule {
    IRule subRule = new RoundRobinRule();
    long maxRetryMillis = 500L;

    public RetryRule() {
    }

    public RetryRule(IRule subRule) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
    }

    public RetryRule(IRule subRule, long maxRetryMillis) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
        this.maxRetryMillis = maxRetryMillis > 0L ? maxRetryMillis : 500L;
    }

    public void setRule(IRule subRule) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
    }

    public IRule getRule() {
        return this.subRule;
    }

    public void setMaxRetryMillis(long maxRetryMillis) {
        if (maxRetryMillis > 0L) {
            this.maxRetryMillis = maxRetryMillis;
        } else {
            this.maxRetryMillis = 500L;
        }

    }

    public long getMaxRetryMillis() {
        return this.maxRetryMillis;
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        super.setLoadBalancer(lb);
        this.subRule.setLoadBalancer(lb);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        long requestTime = System.currentTimeMillis();
        long deadline = requestTime + this.maxRetryMillis;
        Server answer = null;
        answer = this.subRule.choose(key);
        if ((answer == null || !answer.isAlive()) && System.currentTimeMillis() < deadline) {
            InterruptTask task = new InterruptTask(deadline - System.currentTimeMillis());

            while(!Thread.interrupted()) {
                answer = this.subRule.choose(key);
                if (answer != null && answer.isAlive() || System.currentTimeMillis() >= deadline) {
                    break;
                }

                Thread.yield();
            }

            task.cancel();
        }

        return answer != null && answer.isAlive() ? answer : null;
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```

#### 9.3.2.4. 配置详解 

**Ribbon相关的配置**

* IClientConig: Ribbon 的 客户端配置 ， 默认采用 com.netflix.client.config.Defaul七ClientConfigimpl实现。
* IRule: Ribbon 的负载均衡策略 ， 默认采用 com.netflix.loadbalancer.ZoneAvoidanceRule实现，该策略能够在多区域环境下选出最佳区域的实例进行访问。
* IPing: Ribbon的实例检查策略，默认采用com.netflix.loadbalancer.NoOpping实现， 该 检查策略是一个特殊的实现，实际上它并不会检查实例是否可用， 而是始终返回true, 默认认为所有服务实例都是可用的 。
* ServerList<Server>: 服务实例清单的维护机制， 默认采用 com.netflix.loadbalancer.ConfigurationBasedServerList实现。
* ServerListFilter<Server>: 服 务 实 例 清 单过滤机 制 ， 默认采用 org.springframework.cloud.netflix.ribbon.ZonePreferenceServerListFilter实现， 该策略能够优先过滤出与请求调用 方处于同区域的服务实例。
* ILoadBalancer: 负载均衡器， 默 认采用 com.ne七flix.loadbalancer.ZoneAwareLoadBalancer实现， 它具备了区域感知的 能力。


```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.cloud.netflix.ribbon;

import com.netflix.client.DefaultLoadBalancerRetryHandler;
import com.netflix.client.RetryHandler;
import com.netflix.client.config.CommonClientConfigKey;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ConfigurationBasedServerList;
import com.netflix.loadbalancer.DummyPing;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PollingServerListUpdater;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import com.netflix.loadbalancer.ServerListFilter;
import com.netflix.loadbalancer.ServerListUpdater;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import com.netflix.niws.client.http.RestClient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.client.apache4.ApacheHttpClient4;
import java.net.URI;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.commons.httpclient.HttpClientConfiguration;
import org.springframework.cloud.netflix.ribbon.apache.HttpClientRibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.okhttp.OkHttpRibbonConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties
@Import({HttpClientConfiguration.class, OkHttpRibbonConfiguration.class, RestClientRibbonConfiguration.class, HttpClientRibbonConfiguration.class})
public class RibbonClientConfiguration {
    public static final int DEFAULT_CONNECT_TIMEOUT = 1000;
    public static final int DEFAULT_READ_TIMEOUT = 1000;
    public static final boolean DEFAULT_GZIP_PAYLOAD = true;
    @RibbonClientName
    private String name = "client";
    @Autowired
    private PropertiesFactory propertiesFactory;

    public RibbonClientConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean
    public IClientConfig ribbonClientConfig() {
        DefaultClientConfigImpl config = new DefaultClientConfigImpl();
        config.loadProperties(this.name);
        config.set(CommonClientConfigKey.ConnectTimeout, 1000);
        config.set(CommonClientConfigKey.ReadTimeout, 1000);
        config.set(CommonClientConfigKey.GZipPayload, true);
        return config;
    }

    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig config) {
        if (this.propertiesFactory.isSet(IRule.class, this.name)) {
            return (IRule)this.propertiesFactory.get(IRule.class, config, this.name);
        } else {
            ZoneAvoidanceRule rule = new ZoneAvoidanceRule();
            rule.initWithNiwsConfig(config);
            return rule;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public IPing ribbonPing(IClientConfig config) {
        return (IPing)(this.propertiesFactory.isSet(IPing.class, this.name) ? (IPing)this.propertiesFactory.get(IPing.class, config, this.name) : new DummyPing());
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerList<Server> ribbonServerList(IClientConfig config) {
        if (this.propertiesFactory.isSet(ServerList.class, this.name)) {
            return (ServerList)this.propertiesFactory.get(ServerList.class, config, this.name);
        } else {
            ConfigurationBasedServerList serverList = new ConfigurationBasedServerList();
            serverList.initWithNiwsConfig(config);
            return serverList;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerListUpdater ribbonServerListUpdater(IClientConfig config) {
        return new PollingServerListUpdater(config);
    }

    @Bean
    @ConditionalOnMissingBean
    public ILoadBalancer ribbonLoadBalancer(IClientConfig config, ServerList<Server> serverList, ServerListFilter<Server> serverListFilter, IRule rule, IPing ping, ServerListUpdater serverListUpdater) {
        return (ILoadBalancer)(this.propertiesFactory.isSet(ILoadBalancer.class, this.name) ? (ILoadBalancer)this.propertiesFactory.get(ILoadBalancer.class, config, this.name) : new ZoneAwareLoadBalancer(config, rule, ping, serverList, serverListFilter, serverListUpdater));
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerListFilter<Server> ribbonServerListFilter(IClientConfig config) {
        if (this.propertiesFactory.isSet(ServerListFilter.class, this.name)) {
            return (ServerListFilter)this.propertiesFactory.get(ServerListFilter.class, config, this.name);
        } else {
            ZonePreferenceServerListFilter filter = new ZonePreferenceServerListFilter();
            filter.initWithNiwsConfig(config);
            return filter;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public RibbonLoadBalancerContext ribbonLoadBalancerContext(ILoadBalancer loadBalancer, IClientConfig config, RetryHandler retryHandler) {
        return new RibbonLoadBalancerContext(loadBalancer, config, retryHandler);
    }

    @Bean
    @ConditionalOnMissingBean
    public RetryHandler retryHandler(IClientConfig config) {
        return new DefaultLoadBalancerRetryHandler(config);
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerIntrospector serverIntrospector() {
        return new DefaultServerIntrospector();
    }

    @PostConstruct
    public void preprocess() {
        RibbonUtils.setRibbonProperty(this.name, CommonClientConfigKey.DeploymentContextBasedVipAddresses.key(), this.name);
    }

    static class OverrideRestClient extends RestClient {
        private IClientConfig config;
        private ServerIntrospector serverIntrospector;

        protected OverrideRestClient(IClientConfig config, ServerIntrospector serverIntrospector) {
            this.config = config;
            this.serverIntrospector = serverIntrospector;
            this.initWithNiwsConfig(this.config);
        }

        public URI reconstructURIWithServer(Server server, URI original) {
            URI uri = RibbonUtils.updateToSecureConnectionIfNeeded(original, this.config, this.serverIntrospector, server);
            return super.reconstructURIWithServer(server, uri);
        }

        protected Client apacheHttpClientSpecificInitialization() {
            ApacheHttpClient4 apache = (ApacheHttpClient4)super.apacheHttpClientSpecificInitialization();
            apache.getClientHandler().getHttpClient().getParams().setParameter("http.protocol.cookie-policy", "ignoreCookies");
            return apache;
        }
    }
}

```

**修改默认配置**

* 方式1

自定义一个Bean
```java
@Configuration
public class MyRibbonConfiguration {
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
}
```

* 方式2
通过注解RibbonClient配置，实现更加细粒度的配置
```java
package org.springframework.cloud.netflix.ribbon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RibbonClientConfigurationRegistrar.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RibbonClient {
    String value() default "";

    String name() default "";

    Class<?>[] configuration() default {};
}

//配置某个服务的的策略
//HelloServiceConfiguration中定义了新的配置如方式1
@Configuration
@RibbonClient(name = "hello-service", configuration = HelloServiceConfiguration.class)
public class RibbonConfiguration 
}
```

### 9.3.3. ribbon配置
<a href="#menu" >目录</a>


对千Ribbon的参数 配置通常有两种方式： 全局配置以及指定客户端配置。
* 全局配置的方式很简单， 只需使用 ribbon.< key>=< value>格式进行配置即可。其中， < key>代表了 Ribbon 客户端配置的参数 名， < value>则代表了 对应参数的值。 比如， 我们可以像下面这样全局配置Ribbon创建连接的超时时间：ribbon.ConnectTimeout=250.全局配置可以作为默认值进行设置， 当指定客户端配置 了相应key 的值时， 将覆盖全局配置的内容。
* 指定客户端的配置方式 采用 < client> .ribbon.< key>=< value>的格式进行配置。 其中， < key>和< value>的含义同全局配置相同， 而 < client>代表了客户端的名称， 如上文中我们在＠RibbonClient中指定的名称， 也可以将它理解 为是一个服务名。 为了方便理解这种 配置方式， 我们举一个具体的例子： 假设， 有一个服务消费者通过RestTemplate来访问hello-service 服务的/hello 接口，这时 我 们 会这 样调用 restTemplate.getForEntity("http: //helloservice/hello", String.class) .getBody();。 如果没有服务治理框架的帮助，我们需要为该客户端指定 具体的实例清单，可以指定服务名来做详细的配置，具体如下：hello-service.ribbon.listOfServers=localhost:8001,localhost:8002, localhost:8003对于Ribbon .

#### 9.3.3.1. 配置参数说明
<a href="#menu" >目录</a>


参数的key以及value类型的定义，可以通过查看com.netfix.client.con丘g.CommonCentConfigKey类获得更为详细的配置内容.

位于 ribbon-core包下
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.client.config;

import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeToken;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class CommonClientConfigKey<T> implements IClientConfigKey<T> {
    public static final IClientConfigKey<String> AppName = new CommonClientConfigKey<String>("AppName") { };
    public static final IClientConfigKey<String> Version = new CommonClientConfigKey<String>("Version") {  };
    public static final IClientConfigKey<Integer> Port = new CommonClientConfigKey<Integer>("Port") {   };
    public static final IClientConfigKey<Integer> SecurePort = new CommonClientConfigKey<Integer>("SecurePort") {    };
    public static final IClientConfigKey<String> VipAddress = new CommonClientConfigKey<String>("VipAddress") {    };
    public static final IClientConfigKey<Boolean> ForceClientPortConfiguration = new CommonClientConfigKey<Boolean>("ForceClientPortConfiguration") {    };
    public static final IClientConfigKey<String> DeploymentContextBasedVipAddresses = new CommonClientConfigKey<String>("DeploymentContextBasedVipAddresses") {    };
    public static final IClientConfigKey<Integer> MaxAutoRetries = new CommonClientConfigKey<Integer>("MaxAutoRetries") {    };
    public static final IClientConfigKey<Integer> MaxAutoRetriesNextServer = new CommonClientConfigKey<Integer>("MaxAutoRetriesNextServer") {    };
    public static final IClientConfigKey<Boolean> OkToRetryOnAllOperations = new CommonClientConfigKey<Boolean>("OkToRetryOnAllOperations") {    };
    public static final IClientConfigKey<Boolean> RequestSpecificRetryOn = new CommonClientConfigKey<Boolean>("RequestSpecificRetryOn") {    };
    public static final IClientConfigKey<Integer> ReceiveBufferSize = new CommonClientConfigKey<Integer>("ReceiveBufferSize") {    };
    public static final IClientConfigKey<Boolean> EnablePrimeConnections = new CommonClientConfigKey<Boolean>("EnablePrimeConnections") {    };
    public static final IClientConfigKey<String> PrimeConnectionsClassName = new CommonClientConfigKey<String>("PrimeConnectionsClassName") {    };
    public static final IClientConfigKey<Integer> MaxRetriesPerServerPrimeConnection = new CommonClientConfigKey<Integer>("MaxRetriesPerServerPrimeConnection") {    };
    public static final IClientConfigKey<Integer> MaxTotalTimeToPrimeConnections = new CommonClientConfigKey<Integer>("MaxTotalTimeToPrimeConnections") {    };
    public static final IClientConfigKey<Float> MinPrimeConnectionsRatio = new CommonClientConfigKey<Float>("MinPrimeConnectionsRatio") {    };
    public static final IClientConfigKey<String> PrimeConnectionsURI = new CommonClientConfigKey<String>("PrimeConnectionsURI") {    };
    public static final IClientConfigKey<Integer> PoolMaxThreads = new CommonClientConfigKey<Integer>("PoolMaxThreads") {    };
    public static final IClientConfigKey<Integer> PoolMinThreads = new CommonClientConfigKey<Integer>("PoolMinThreads") {    };
    public static final IClientConfigKey<Integer> PoolKeepAliveTime = new CommonClientConfigKey<Integer>("PoolKeepAliveTime") {    };
    public static final IClientConfigKey<String> PoolKeepAliveTimeUnits = new CommonClientConfigKey<String>("PoolKeepAliveTimeUnits") {    };
    public static final IClientConfigKey<Boolean> EnableConnectionPool = new CommonClientConfigKey<Boolean>("EnableConnectionPool") {    };
    /** @deprecated */
    @Deprecated
    public static final IClientConfigKey<Integer> MaxHttpConnectionsPerHost = new CommonClientConfigKey<Integer>("MaxHttpConnectionsPerHost") {    };
    /** @deprecated */
    @Deprecated
    public static final IClientConfigKey<Integer> MaxTotalHttpConnections = new CommonClientConfigKey<Integer>("MaxTotalHttpConnections") {    };
    public static final IClientConfigKey<Integer> MaxConnectionsPerHost = new CommonClientConfigKey<Integer>("MaxConnectionsPerHost") {    };
    public static final IClientConfigKey<Integer> MaxTotalConnections = new CommonClientConfigKey<Integer>("MaxTotalConnections") {    };
    public static final IClientConfigKey<Boolean> IsSecure = new CommonClientConfigKey<Boolean>("IsSecure") {    };
    public static final IClientConfigKey<Boolean> GZipPayload = new CommonClientConfigKey<Boolean>("GZipPayload") {    };
    public static final IClientConfigKey<Integer> ConnectTimeout = new CommonClientConfigKey<Integer>("ConnectTimeout") {    };
    public static final IClientConfigKey<Integer> BackoffInterval = new CommonClientConfigKey<Integer>("BackoffTimeout") {    };
    public static final IClientConfigKey<Integer> ReadTimeout = new CommonClientConfigKey<Integer>("ReadTimeout") {    };
    public static final IClientConfigKey<Integer> SendBufferSize = new CommonClientConfigKey<Integer>("SendBufferSize") {    };
    public static final IClientConfigKey<Boolean> StaleCheckingEnabled = new CommonClientConfigKey<Boolean>("StaleCheckingEnabled") {    };
    public static final IClientConfigKey<Integer> Linger = new CommonClientConfigKey<Integer>("Linger") {    };
    public static final IClientConfigKey<Integer> ConnectionManagerTimeout = new CommonClientConfigKey<Integer>("ConnectionManagerTimeout") {    };
    public static final IClientConfigKey<Boolean> FollowRedirects = new CommonClientConfigKey<Boolean>("FollowRedirects") {    };
    public static final IClientConfigKey<Boolean> ConnectionPoolCleanerTaskEnabled = new CommonClientConfigKey<Boolean>("ConnectionPoolCleanerTaskEnabled") {    };
    public static final IClientConfigKey<Integer> ConnIdleEvictTimeMilliSeconds = new CommonClientConfigKey<Integer>("ConnIdleEvictTimeMilliSeconds") {    };
    public static final IClientConfigKey<Integer> ConnectionCleanerRepeatInterval = new CommonClientConfigKey<Integer>("ConnectionCleanerRepeatInterval") {    };
    public static final IClientConfigKey<Boolean> EnableGZIPContentEncodingFilter = new CommonClientConfigKey<Boolean>("EnableGZIPContentEncodingFilter") {    };
    public static final IClientConfigKey<String> ProxyHost = new CommonClientConfigKey<String>("ProxyHost") {    };
    public static final IClientConfigKey<Integer> ProxyPort = new CommonClientConfigKey<Integer>("ProxyPort") {    };
    public static final IClientConfigKey<String> KeyStore = new CommonClientConfigKey<String>("KeyStore") {    };
    public static final IClientConfigKey<String> KeyStorePassword = new CommonClientConfigKey<String>("KeyStorePassword") {    };
    public static final IClientConfigKey<String> TrustStore = new CommonClientConfigKey<String>("TrustStore") {    };
    public static final IClientConfigKey<String> TrustStorePassword = new CommonClientConfigKey<String>("TrustStorePassword") {    };
    public static final IClientConfigKey<Boolean> IsClientAuthRequired = new CommonClientConfigKey<Boolean>("IsClientAuthRequired") {    };
    public static final IClientConfigKey<String> CustomSSLSocketFactoryClassName = new CommonClientConfigKey<String>("CustomSSLSocketFactoryClassName") {    };
    public static final IClientConfigKey<Boolean> IsHostnameValidationRequired = new CommonClientConfigKey<Boolean>("IsHostnameValidationRequired") {    };
    public static final IClientConfigKey<Boolean> IgnoreUserTokenInConnectionPoolForSecureClient = new CommonClientConfigKey<Boolean>("IgnoreUserTokenInConnectionPoolForSecureClient") {    };
    public static final IClientConfigKey<String> ClientClassName = new CommonClientConfigKey<String>("ClientClassName") {    };
    public static final IClientConfigKey<Boolean> InitializeNFLoadBalancer = new CommonClientConfigKey<Boolean>("InitializeNFLoadBalancer") {    };
    public static final IClientConfigKey<String> NFLoadBalancerClassName = new CommonClientConfigKey<String>("NFLoadBalancerClassName") {    };
    public static final IClientConfigKey<String> NFLoadBalancerRuleClassName = new CommonClientConfigKey<String>("NFLoadBalancerRuleClassName") {    };
    public static final IClientConfigKey<String> NFLoadBalancerPingClassName = new CommonClientConfigKey<String>("NFLoadBalancerPingClassName") {    };
    public static final IClientConfigKey<Integer> NFLoadBalancerPingInterval = new CommonClientConfigKey<Integer>("NFLoadBalancerPingInterval") {    };
    public static final IClientConfigKey<Integer> NFLoadBalancerMaxTotalPingTime = new CommonClientConfigKey<Integer>("NFLoadBalancerMaxTotalPingTime") {    };
    public static final IClientConfigKey<String> NFLoadBalancerStatsClassName = new CommonClientConfigKey<String>("NFLoadBalancerStatsClassName") {    };
    public static final IClientConfigKey<String> NIWSServerListClassName = new CommonClientConfigKey<String>("NIWSServerListClassName") {    };
    public static final IClientConfigKey<String> ServerListUpdaterClassName = new CommonClientConfigKey<String>("ServerListUpdaterClassName") {    };
    public static final IClientConfigKey<String> NIWSServerListFilterClassName = new CommonClientConfigKey<String>("NIWSServerListFilterClassName") {    };
    public static final IClientConfigKey<Integer> ServerListRefreshInterval = new CommonClientConfigKey<Integer>("ServerListRefreshInterval") {
    };
    public static final IClientConfigKey<Boolean> EnableMarkingServerDownOnReachingFailureLimit = new CommonClientConfigKey<Boolean>("EnableMarkingServerDownOnReachingFailureLimit") {    };
    public static final IClientConfigKey<Integer> ServerDownFailureLimit = new CommonClientConfigKey<Integer>("ServerDownFailureLimit") {
    };
    public static final IClientConfigKey<Integer> ServerDownStatWindowInMillis = new CommonClientConfigKey<Integer>("ServerDownStatWindowInMillis") {    };
    public static final IClientConfigKey<Boolean> EnableZoneAffinity = new CommonClientConfigKey<Boolean>("EnableZoneAffinity") {
    };
    public static final IClientConfigKey<Boolean> EnableZoneExclusivity = new CommonClientConfigKey<Boolean>("EnableZoneExclusivity") {    };
    public static final IClientConfigKey<Boolean> PrioritizeVipAddressBasedServers = new CommonClientConfigKey<Boolean>("PrioritizeVipAddressBasedServers") {    };
    public static final IClientConfigKey<String> VipAddressResolverClassName = new CommonClientConfigKey<String>("VipAddressResolverClassName") {    };
    public static final IClientConfigKey<String> TargetRegion = new CommonClientConfigKey<String>("TargetRegion") {    };
    public static final IClientConfigKey<String> RulePredicateClasses = new CommonClientConfigKey<String>("RulePredicateClasses") {    };
    public static final IClientConfigKey<String> RequestIdHeaderName = new CommonClientConfigKey<String>("RequestIdHeaderName") {    };
    public static final IClientConfigKey<Boolean> UseIPAddrForServer = new CommonClientConfigKey<Boolean>("UseIPAddrForServer") {    };
    public static final IClientConfigKey<String> ListOfServers = new CommonClientConfigKey<String>("listOfServers") {    };
    private static final Set<IClientConfigKey> keys = new HashSet();
    private final String configKey;
    private final Class<T> type;
    }
}

```

#### 9.3.3.2. 重试机制
<a href="#menu" >目录</a>

由于Spring Cloud Eureka实现的服务治理机制强调了CAP原理中的AP, 即可用性与可靠性，它与Zoo Keeper这类强调CP( 一致性、可靠性）的服务治理框架最大的区别就是，Eureka为了实现更高的服务可用性， 牺牲了一定的一致性， 在极端情况下它宁愿接受故障实例也不要丢掉 “ 健康 " 实例， 比如， 当服务注册中心的网络发生故障断开时， 由于所有的服务实例无法维持续约心跳， 在强调 AP的服务治理中将会把所有服务实例都剔除掉，而Eureka则会因为超过85%的实例丢失心跳而会触发保护机制，注册中心将会保留此时的所有节点， 以实现服务间依然可以进行互相调用的场景， 即使其中有部分故障节点， 但这样做可以继续保障大多数的服务正常消费。

由于Spring Cloud Eureka在可用性与一致性上的取舍， 不论是由于触发了保护机制还是服务剔除的延迟， 引起服务调用到故障实例的时候， 我们还是希望能够增强对这类问题的容错。 所以， 我们在实现服务调用的时候通常会加入一些重试机制。 在目前我们使用的Brixton版本中， 对于重试机制的实现需要我们自己来扩展完成。 而从CamdenSR2版本开始，Spring Cloud整合了SpringRetry来增强RestTernplate的重试能力， 对于开发者来说只需通过简单的配置， 原来那些通过 RestTemplate 实现的服务访问就会自动根据配置来实现重试策略

```yml
 16. 开启重试机制,默认打开
spring.cloud.loadbalancer.retry.enabled=true
 17. 断路器的超时时间需要大于Ribbon的超时时间， 不然不会触发重试
hystrix.command.default.execution.isolation.thread.timeoutinMilliseconds=lOOOO
 18. 请求连接的超时时间。
hello-service.ribbon.ConnectTimeout=250
 19. 请求处理的超时时间。
hello-service.ribbon.ReadTimeout=lOOO
 20. 对所有操作请求都进行重试
hello-service.ribbon.OkToRetryOnAllOperations=true
 21. 切换实例的重试次数
hello-service.ribbon.MaxAutoRe七riesNex七Server=2
 22. 对当前实例的重试次数
hello-service.ribbon.MaxAutoRetries=l
```
根据如上配置， 当访问到故障请求的时候， 它会再尝试访问 一次当前实例（次数由MaxAutoRetries配置）， 如果不行， 就换 一个实例进行访问， 如果还是不行， 再换 一次实例访问（更换次数由MaxAutoRe红iesNextServer配置）， 如果依然不行， 返回失败信息


## 9.4. 声明式服务调用feign
<a href="#menu" >目录</a>

### 9.4.1. 使用案例

引入依赖，因为feign底层是依赖ribbon,因此也要引入该包
```xml
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```

生明调用的接口，value为服务提供者的应用名称，@GetMapping用于定义服务提供者服务的方法和URL
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo();
}
```
启动类添加注解
```java
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignApplication.class, args);
    }

}
```
完成。

**多参数**

http://xxx?key1=xx&key2=xxx


get
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo(@RequestParam("key1") String key1,@RequestParam("key1") String key2);
}

//或者使用map
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo(@RequestParam Map<String,Object> map);
}

//调用
map.put("key1",xxx);
map.put("key2",xxx);
demo(map);

```

post
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @PostMapping("/provider/demo")
    public String demo(@RequestBody User user);
}
```

### 9.4.2. 实现原理
<a href="#menu" >目录</a>

#### 9.4.2.1. 配置类
<a href="#menu" >目录</a>

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.cloud.openfeign;

import com.fasterxml.jackson.databind.Module;
import com.netflix.hystrix.HystrixCommand;
import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.Retryer;
import feign.Feign.Builder;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.hystrix.HystrixFeign;
import feign.optionals.OptionalDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.PageJacksonModule;
import org.springframework.cloud.openfeign.support.PageableSpringEncoder;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

@Configuration
public class FeignClientsConfiguration {
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;
    @Autowired(
        required = false
    )
    private List<AnnotatedParameterProcessor> parameterProcessors = new ArrayList();
    @Autowired(
        required = false
    )
    private List<FeignFormatterRegistrar> feignFormatterRegistrars = new ArrayList();
    @Autowired(
        required = false
    )
    private Logger logger;

    public FeignClientsConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean
    public Decoder feignDecoder() {
        return new OptionalDecoder(new ResponseEntityDecoder(new SpringDecoder(this.messageConverters)));
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnMissingClass({"org.springframework.data.domain.Pageable"})
    public Encoder feignEncoder() {
        return new SpringEncoder(this.messageConverters);
    }

    @Bean
    @ConditionalOnClass(
        name = {"org.springframework.data.domain.Pageable"}
    )
    @ConditionalOnMissingBean
    public Encoder feignEncoderPageable() {
        return new PageableSpringEncoder(new SpringEncoder(this.messageConverters));
    }

    @Bean
    @ConditionalOnMissingBean
    public Contract feignContract(ConversionService feignConversionService) {
        return new SpringMvcContract(this.parameterProcessors, feignConversionService);
    }

    @Bean
    public FormattingConversionService feignConversionService() {
        FormattingConversionService conversionService = new DefaultFormattingConversionService();
        Iterator var2 = this.feignFormatterRegistrars.iterator();

        while(var2.hasNext()) {
            FeignFormatterRegistrar feignFormatterRegistrar = (FeignFormatterRegistrar)var2.next();
            feignFormatterRegistrar.registerFormatters(conversionService);
        }

        return conversionService;
    }

    /*
    重试策略
    */
    @Bean
    @ConditionalOnMissingBean
    public Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    public Builder feignBuilder(Retryer retryer) {
        return Feign.builder().retryer(retryer);
    }

    @Bean
    @ConditionalOnMissingBean({FeignLoggerFactory.class})
    public FeignLoggerFactory feignLoggerFactory() {
        return new DefaultFeignLoggerFactory(this.logger);
    }

    @Bean
    @ConditionalOnClass(
        name = {"org.springframework.data.domain.Page"}
    )
    public Module pageJacksonModule() {
        return new PageJacksonModule();
    }

    @Configuration
    @ConditionalOnClass({HystrixCommand.class, HystrixFeign.class})
    protected static class HystrixFeignConfiguration {
        protected HystrixFeignConfiguration() {
        }

        @Bean
        @Scope("prototype")
        @ConditionalOnMissingBean
        @ConditionalOnProperty(
            name = {"feign.hystrix.enabled"}
        )
        public Builder feignHystrixBuilder() {
            return HystrixFeign.builder();
        }
    }
}

```

#### 9.4.2.2. 启动注解说明
<a href="#menu" >目录</a>

feign是一个伪客户端，即它不做任何的请求处理。Feign通过处理注解生成request，从而实现简化HTTP API开发的目的，即开发人员可以使用注解的方式定制request api模板，在发送http request请求之前，feign通过处理注解的方式替换掉request模板中的参数，这种实现方式显得更为直接、可理解。

```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo(@RequestParam("key1") String key1,@RequestParam("key1") String key2);
}

public @interface FeignClient {
    @AliasFor("name")
    String value() default "";
    /** @deprecated */
    @Deprecated
    String serviceId() default "";
    String contextId() default "";
    @AliasFor("value")
    String name() default "";
    String qualifier() default "";
    String url() default "";
    boolean decode404() default false;
    Class<?>[] configuration() default {};
    Class<?> fallback() default void.class;
    Class<?> fallbackFactory() default void.class;
    String path() default "";
    boolean primary() default true;
}
```


#### 9.4.2.3. 调用实现原理
<a href="#menu" >目录</a>


通过包扫描注入FeignClient的bean，该源码在FeignClientsRegistrar类：
首先在启动配置上检查是否有@EnableFeignClients注解，如果有该注解，则开启包扫描，扫描被@FeignClient注解接口。代码如下：

在使用Feign时,需要在启动类上添加注解@EnableFeignClients
可以看到引入了FeignClientsRegistrar类
```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({FeignClientsRegistrar.class})
public @interface EnableFeignClients {
    String[] value() default {};

    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};
}
```
FeignClientsRegistrar类
```java

class FeignClientsRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, EnvironmentAware {
    
    /**
    由于实现了ImportBeanDefinitionRegistrar,启动后会调用这个registerBeanDefinitions方法
    */
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        this.registerDefaultConfiguration(metadata, registry);
        this.registerFeignClients(metadata, registry);
    }

    /**
    通过包扫描注入FeignClient的bean，该源码在FeignClientsRegistrar类：首先在启动配置上检查是否有@EnableFeignClients注解，如果有该注解，则开启包扫描，扫描被@FeignClient注解接口
    */
    private void registerDefaultConfiguration(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        Map<String, Object> defaultAttrs = metadata.getAnnotationAttributes(EnableFeignClients.class.getName(), true);
        if (defaultAttrs != null && defaultAttrs.containsKey("defaultConfiguration")) {
            String name;
            if (metadata.hasEnclosingClass()) {
                name = "default." + metadata.getEnclosingClassName();
            } else {
                name = "default." + metadata.getClassName();
            }
            //获取FeignClientsRegistrar.defaultConfiguration的信息并创建bean
            this.registerClientConfiguration(registry, name, defaultAttrs.get("defaultConfiguration"));
        }

    }
    /*
    程序启动后通过包扫描，当类有@ FeignClient 注解，将注解的信息取出，连同类名一起取出，赋给BeanDefinitionBuilder，然后根据BeanDefinitionBuilder得到beanDefinition，最后beanDefinition式注入到ioc容器中
    */
    public void registerFeignClients(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        ClassPathScanningCandidateComponentProvider scanner = this.getScanner();
        scanner.setResourceLoader(this.resourceLoader);
        Map<String, Object> attrs = metadata.getAnnotationAttributes(EnableFeignClients.class.getName());
        AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(FeignClient.class);
        Class<?>[] clients = attrs == null ? null : (Class[])((Class[])attrs.get("clients"));
        Object basePackages;
        if (clients != null && clients.length != 0) {
            final Set<String> clientClasses = new HashSet();
            basePackages = new HashSet();
            Class[] var9 = clients;
            int var10 = clients.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                Class<?> clazz = var9[var11];
                ((Set)basePackages).add(ClassUtils.getPackageName(clazz));
                clientClasses.add(clazz.getCanonicalName());
            }

            AbstractClassTestingTypeFilter filter = new AbstractClassTestingTypeFilter() {
                protected boolean match(ClassMetadata metadata) {
                    String cleaned = metadata.getClassName().replaceAll("\\$", ".");
                    return clientClasses.contains(cleaned);
                }
            };
            scanner.addIncludeFilter(new FeignClientsRegistrar.AllTypeFilter(Arrays.asList(filter, annotationTypeFilter)));
        } else {
            scanner.addIncludeFilter(annotationTypeFilter);
            basePackages = this.getBasePackages(metadata);
        }
        //存放FeignClient注解的基础包类名
        Iterator var17 = ((Set)basePackages).iterator();

        while(var17.hasNext()) {
            String basePackage = (String)var17.next();
            Set<BeanDefinition> candidateComponents = scanner.findCandidateComponents(basePackage);
            Iterator var21 = candidateComponents.iterator();

            while(var21.hasNext()) {
                //FeignClient注解的类的BeanDefinition
                BeanDefinition candidateComponent = (BeanDefinition)var21.next();
                if (candidateComponent instanceof AnnotatedBeanDefinition) {
                    AnnotatedBeanDefinition beanDefinition = (AnnotatedBeanDefinition)candidateComponent;
                    AnnotationMetadata annotationMetadata = beanDefinition.getMetadata();
                    Assert.isTrue(annotationMetadata.isInterface(), "@FeignClient can only be specified on an interface");
                    Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(FeignClient.class.getCanonicalName());
                    String name = this.getClientName(attributes);
                    //获取FeignClient注解的configuration属性并注册对应的BeanDefinition到容器中
                    this.registerClientConfiguration(registry, name, attributes.get("configuration"));
                    //注册FeignClient注解的类BeanDefinition到IOC容器中
                    this.registerFeignClient(registry, annotationMetadata, attributes);
                }
            }
        }

    }
    //
    private void registerFeignClient(BeanDefinitionRegistry registry, AnnotationMetadata annotationMetadata, Map<String, Object> attributes) {
        String className = annotationMetadata.getClassName();
        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(FeignClientFactoryBean.class);
        this.validate(attributes);
        definition.addPropertyValue("url", this.getUrl(attributes));
        definition.addPropertyValue("path", this.getPath(attributes));
        String name = this.getName(attributes);
        definition.addPropertyValue("name", name);
        String contextId = this.getContextId(attributes);
        definition.addPropertyValue("contextId", contextId);
        definition.addPropertyValue("type", className);
        definition.addPropertyValue("decode404", attributes.get("decode404"));
        definition.addPropertyValue("fallback", attributes.get("fallback"));
        definition.addPropertyValue("fallbackFactory", attributes.get("fallbackFactory"));
        definition.setAutowireMode(2);
        String alias = contextId + "FeignClient";
        AbstractBeanDefinition beanDefinition = definition.getBeanDefinition();
        boolean primary = (Boolean)attributes.get("primary");
        beanDefinition.setPrimary(primary);
        String qualifier = this.getQualifier(attributes);
        if (StringUtils.hasText(qualifier)) {
            alias = qualifier;
        }

        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition, className, new String[]{alias});
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, registry);
    }
    
}
```
BeanDefinition，顾名思义，是一个对象(Bean)在Spring中描述
注意上面注册的是BeanDefinition,还没有创建bean,只有在SpringApplication调用public ConfigurableApplicationContext run(String... args) {this.refreshContext(context);}时才会创建bean.

注入bean之后，通过jdk的代理,创建FeignClient注解的类bean
```java
public class ReflectiveFeign extends Feign {
    private final ReflectiveFeign.ParseHandlersByName targetToHandlersByName;
    private final InvocationHandlerFactory factory;
    private final QueryMapEncoder queryMapEncoder;

    ReflectiveFeign(ReflectiveFeign.ParseHandlersByName targetToHandlersByName, InvocationHandlerFactory factory, QueryMapEncoder queryMapEncoder) {
        this.targetToHandlersByName = targetToHandlersByName;
        this.factory = factory;
        this.queryMapEncoder = queryMapEncoder;
    }

    public <T> T newInstance(Target<T> target) {
        Map<String, MethodHandler> nameToHandler = this.targetToHandlersByName.apply(target);
        Map<Method, MethodHandler> methodToHandler = new LinkedHashMap();
        List<DefaultMethodHandler> defaultMethodHandlers = new LinkedList();
        Method[] var5 = target.type().getMethods();
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Method method = var5[var7];
            if (method.getDeclaringClass() != Object.class) {
                if (Util.isDefault(method)) {
                    DefaultMethodHandler handler = new DefaultMethodHandler(method);
                    defaultMethodHandlers.add(handler);
                    methodToHandler.put(method, handler);
                } else {
                    methodToHandler.put(method, (MethodHandler)nameToHandler.get(Feign.configKey(target.type(), method)));
                }
            }
        }

        //这里是FeignInvocationHandler
        InvocationHandler handler = this.factory.create(target, methodToHandler);
        //创建代理对象
        T proxy = Proxy.newProxyInstance(target.type().getClassLoader(), new Class[]{target.type()}, handler);
        Iterator var12 = defaultMethodHandlers.iterator();

        while(var12.hasNext()) {
            DefaultMethodHandler defaultMethodHandler = (DefaultMethodHandler)var12.next();
            defaultMethodHandler.bindTo(proxy);
        }

        return proxy;
    }

    static class FeignInvocationHandler implements InvocationHandler {
        private final Target target;
        private final Map<Method, MethodHandler> dispatch;

        FeignInvocationHandler(Target target, Map<Method, MethodHandler> dispatch) {
            this.target = (Target)Util.checkNotNull(target, "target", new Object[0]);
            this.dispatch = (Map)Util.checkNotNull(dispatch, "dispatch for %s", new Object[]{target});
        }
        //调用时,将会被拦截
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (!"equals".equals(method.getName())) {
                if ("hashCode".equals(method.getName())) {
                    return this.hashCode();
                } else {
                    //SynchronousMethodHandler的invoke执行
                    return "toString".equals(method.getName()) ? this.toString() : ((MethodHandler)this.dispatch.get(method)).invoke(args);
                }
            } else {
                try {
                    Object otherHandler = args.length > 0 && args[0] != null ? Proxy.getInvocationHandler(args[0]) : null;
                    return this.equals(otherHandler);
                } catch (IllegalArgumentException var5) {
                    return false;
                }
            }
        }
        
}
```

在SynchronousMethodHandler类进行拦截处理，当被FeignClient的方法被拦截会根据参数生成RequestTemplate对象，该对象就是http请求的模板，代码如下：

```java
final class SynchronousMethodHandler implements MethodHandler {
  
    public Object invoke(Object[] argv) throws Throwable {
        RequestTemplate template = this.buildTemplateFromArgs.create(argv);
        Retryer retryer = this.retryer.clone();

        while(true) {
            try {
                return this.executeAndDecode(template);
            } catch (RetryableException var8) {
                RetryableException e = var8;

                try {
                    retryer.continueOrPropagate(e);
                } catch (RetryableException var7) {
                    Throwable cause = var7.getCause();
                    if (this.propagationPolicy == ExceptionPropagationPolicy.UNWRAP && cause != null) {
                        throw cause;
                    }

                    throw var7;
                }

                if (this.logLevel != Level.NONE) {
                    this.logger.logRetry(this.metadata.configKey(), this.logLevel);
                }
            }
        }
    }
```
其中有个executeAndDecode()方法，该方法是通RequestTemplate生成Request请求对象，然后根据用client获取response。

也就是说Feign的调用,中间生成了RequestTemplate对象,调用RequestTemplate的相关方法后,将会通过ribbon相关类来最终实现负载均衡,发送请求处理响应等操作.所以Feign本质上还是使用ribbon来实现.

#### 9.4.2.4. 总结

总到来说，Feign的源码实现的过程如下：
* 首先通过@EnableFeignCleints注解开启FeignCleint
* 根据Feign的规则实现接口，并加@FeignCleint注解
* 程序启动后，会进行包扫描，扫描所有的@ FeignCleint的注解的类，并将这些信息注入到ioc容器中。
* 当接口的方法被调用，通过jdk的代理，来生成具体的RequesTemplate
* RequesTemplate在生成Request
* Request交给Client去处理，其中Client可以是HttpUrlConnection、HttpClient也可以是Okhttp
* 最后Client被封装到LoadBalanceClient类，这个类结合类Ribbon做到了负载均衡。


## 9.5. 服务容错保护 Hystrix
<a href="#menu" >目录</a>




### 9.5.1. Ribbon中使用Hystrix
<a href="#menu" >目录</a>

引入依赖

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
</dependency>
```


启动类添加@EnableHystrix注解
```java
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }

}
```
在请求方法上添加@HystrixCommand,当请求方法出现异常的时候,将会调用定义的出错回调方法fallbackMethod.
```java
@Slf4j
@Component
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "demoError")
    public String demo(){
        log.info("客户端访问");
        return  restTemplate.getForObject("Http://provider/provider/demo1",String.class);
    }

    public String demoError(){
        log.info("客户端访问出错");

        return "客户端访问出错";
    }

}
```

### 9.5.2. Feign中使用Hystrix
<a href="#menu" >目录</a>

由 于 Feign 的起步依赖中已经引入了 Hystrix 的依赖，所以在 Feign 中使用 Hystrix 不需要引入任何的依赖 。 只需要在 eureka-feign"client 工程的配置文件 application.yml 中配置开启Hystrix 的功能，配置文件 application.yml 中加以下配置 ：

```yml
 23. 默认是false
feign.hystrix.enable=true
```

```java
@Component
//fallback的类是出错逻辑实现类
@FeignClient(value = "provider",fallback= DemoFeignHystrix.class)
public interface DemoFeign {

    @GetMapping("/provider/demo1")
    public String demo();


}

//出错逻辑定义
@Slf4j
@Component
class DemoFeignHystrix implements DemoFeign{

    @Override
    public String demo() {
        log.info("客户端访问出错");

        return "客户端访问出错";
    }
}
```
不需要在启动类上添加@EnableHystrix注解



### 9.5.3. Hystrix详解
<a href="#menu" >目录</a>

#### 9.5.3.1. 背景
<a href="#menu" >目录</a>

分布式系统环境下，服务间类似依赖非常常见，一个业务调用通常依赖多个基础服务。如下图，对于同步调用，当库存服务不可用时，商品服务请求线程被阻塞，当有大批量请求调用库存服务时，最终可能导致整个商品服务资源耗尽，无法继续对外提供服务。并且这种不可用可能沿请求调用链向上传递，这种现象被称为雪崩效应。

![](https://static.oschina.net/uploads/space/2018/0122/170502_7fqS_2663573.png)

**雪崩效应常见场景**
* 硬件故障：如服务器宕机，机房断电，光纤被挖断等。
* 流量激增：如异常流量，重试加大流量等。
* 缓存穿透：一般发生在应用重启，所有缓存失效时，以及短时间内大量缓存失效时。大量的缓存不命中，使请求直击后端服务，造成服务提供者超负荷运行，引起服务不可用。
* 程序BUG：如程序逻辑导致内存泄漏，JVM长时间FullGC等。
* 同步等待：服务间采用同步调用模式，同步等待造成的资源耗尽。

**雪崩效应应对策略**
针对造成雪崩效应的不同场景，可以使用不同的应对策略，没有一种通用所有场景的策略，参考如下：
* 硬件故障：多机房容灾、异地多活等。
* 流量激增：服务自动扩容、流量控制（限流、关闭重试）等。
* 缓存穿透：缓存预加载、缓存异步加载等。
* 程序BUG：修改程序bug、及时释放资源等。
* 同步等待：资源隔离、MQ解耦、不可用服务调用快速失败等。资源隔离通常指不同服务调用采用不同的线程池；不可用服务调用快速失败一般通过熔断器模式结合超时机制实现。
综上所述，如果一个应用不能对来自依赖的故障进行隔离，那该应用本身就处在被拖垮的风险中。 因此，为了构建稳定、可靠的分布式系统，我们的服务应当具有自我保护能力，当依赖服务不可用时，当前服务启动自我保护功能，从而避免发生雪崩效应。



#### 9.5.3.2. 基本认识
<a href="#menu" >目录</a>

**Hystrix是什么**
在分布式环境中，许多服务依赖项中的一些必然会失败。Hystrix是一个库，通过添加延迟容忍和容错逻辑，帮助你控制这些分布式服务之间的交互。Hystrix通过隔离服务之间的访问点、停止级联失败和提供回退选项来实现这一点，所有这些都可以提高系统的整体弹性。

**Hystrix为了什么**

Hystrix被设计的目标是：
* 对通过第三方客户端库访问的依赖项（通常是通过网络）的延迟和故障进行保护和控制。
* 在复杂的分布式系统中阻止级联故障。
* 快速失败，快速恢复。
* 回退，尽可能优雅地降级。
* 启用近实时监控、警报和操作控制。

**Hystrix解决了什么问题**
复杂分布式体系结构中的应用程序有许多依赖项，每个依赖项在某些时候都不可避免地会失败。如果主机应用程序没有与这些外部故障隔离，那么它有可能被他们拖垮。

例如，对于一个依赖于30个服务的应用程序，每个服务都有99.99%的正常运行时间，你可以期望如下：
99.9930  =  99.7% 可用
也就是说一亿个请求的0.03% = 3000000 会失败
如果一切正常，那么每个月有2个小时服务是不可用的

现实通常是更糟糕 

当一切正常时，请求看起来是这样的：

![](https://images2018.cnblogs.com/blog/874963/201807/874963-20180730172725624-245631738.png)

当其中有一个系统有延迟时，它可能阻塞整个用户请求：

![](https://images2018.cnblogs.com/blog/874963/201807/874963-20180730172821821-960520983.png)

在高流量的情况下，一个后端依赖项的延迟可能导致所有服务器上的所有资源在数秒内饱和（PS：意味着后续再有请求将无法立即提供服务）
![](https://images2018.cnblogs.com/blog/874963/201807/874963-20180730172949326-29467411.png)

**Hystrix设计原则是什么**
* 防止任何单个依赖项耗尽所有容器（如Tomcat）用户线程。
* 甩掉包袱，快速失败而不是排队。
* 在任何可行的地方提供回退，以保护用户不受失败的影响。
* 使用隔离技术（如隔离板、泳道和断路器模式）来限制任何一个依赖项的影响。
* 通过近实时的度量、监视和警报来优化发现时间。
* 通过配置的低延迟传播来优化恢复时间。
* 支持对Hystrix的大多数方面的动态属性更改，允许使用低延迟反馈循环进行实时操作修改。
* 避免在整个依赖客户端执行中出现故障，而不仅仅是在网络流量中。

**Hystrix是如何实现它的目标的**
* 用一个HystrixCommand 或者 HystrixObservableCommand （这是命令模式的一个例子）包装所有的对外部系统（或者依赖）的调用，典型地它们在一个单独的线程中执行
* 调用超时时间比你自己定义的阈值要长。有一个默认值，对于大多数的依赖项你是可以自定义超时时间的。
* 为每个依赖项维护一个小的线程池(或信号量)；如果线程池满了，那么该依赖性将会立即拒绝请求，而不是排队。
* 调用的结果有这么几种：成功、失败（客户端抛出异常）、超时、拒绝。
* 在一段时间内，如果服务的错误百分比超过了一个阈值，就会触发一个断路器来停止对特定服务的所有请求，无论是手动的还是自动的。
* 当请求失败、被拒绝、超时或短路时，执行回退逻辑。
* 近实时监控指标和配置变化。

当你使用Hystrix来包装每个依赖项时，上图中所示的架构会发生变化，如下图所示：

每个依赖项相互隔离，当延迟发生时，它会被限制在资源中，并包含回退逻辑，该逻辑决定在依赖项中发生任何类型的故障时应作出何种响应：

![](https://images2018.cnblogs.com/blog/874963/201807/874963-20180730173442729-1485668320.png)

[官方wiki](https://github.com/Netflix/Hystrix/wiki)

#### 9.5.3.3. hystrix适用场景
<a href="#menu" >目录</a>

**核心无降级业务**
计费业务，id生成器业务作为核心业务，是整个短信业务的核心，如果引入熔断机制会导致业务流程失败，相当于整个短信业务不可用，所以这类核心无降级的服务是不应该启动hystrix的。

**边缘业务或者可降级的业务**
相对的，短信发送微服务，因为对接了多个渠道，当某个渠道不可用的情况下，hystrix熔断掉，然后采取另外的渠道进行下发。在发送量级比较大的情况，可以减少短信发送进行重试的时间。
如果需要保护后端的es集群，需要协调调用方限制自己的请求，当后端请求返回比较慢的情况下，通过hystrix超时进行熔断，避免后端es挂掉。前提是调用方对查询的数据容忍度比较高，就算查询不到数据也可以接受（短暂性）

**hystrix vs dubbo**
dubbo对于调用方，可以设置超时时间来打断未响应的调用，但是并不能减轻提供方的压力。 
hystrix可以有丰富的配置，其原理是：在一个窗口时间内针对错误进行计数，当达到阈值则熔断提供方，不在请求该熔断的提供方，然后快速返回。

**总结**
是否启动hystrix和hystrix作用阈值应该根据不同业务进行不同精细化的配置，才能发挥出最大的作用。
并不是每一个业务都需要开启hystrix的支持
在启用hystrix的情况下，对于整个分布式服务集群来讲，并不能完全避免服务雪崩，仅能保证调用方服务在发生网络雪崩发时候自己不被拖死，减少雪崩的影响范围。

#### 9.5.3.4. 注解说明
<a href="#menu" >目录</a>

通过在方法上添加 @HystrixCommand 注解并配置注解的参数来实现配置，但有的时候一个类里面会有多个 Hystrix 方法，每个方法都是类似配置的话会冗余很多代码，这时候我们可以在类上使用 @DefaultProperties 注解来给整个类的 Hystrix 方法设置一个默认值

```java
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface HystrixCommand {
    String groupKey() default "";

    String commandKey() default "";

    String threadPoolKey() default "";

    String fallbackMethod() default "";

    HystrixProperty[] commandProperties() default {};

    HystrixProperty[] threadPoolProperties() default {};

    Class<? extends Throwable>[] ignoreExceptions() default {};

    ObservableExecutionMode observableExecutionMode() default ObservableExecutionMode.EAGER;

    HystrixException[] raiseHystrixExceptions() default {};

    String defaultFallback() default "";
}

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DefaultProperties {
    String groupKey() default "";

    String threadPoolKey() default "";

    HystrixProperty[] commandProperties() default {};

    HystrixProperty[] threadPoolProperties() default {};

    Class<? extends Throwable>[] ignoreExceptions() default {};

    HystrixException[] raiseHystrixExceptions() default {};

    String defaultFallback() default "";
}

```
* groupKey：一组 Hystrix 命令的集合， 用来统计、报告，默认取类名，可不配置。
* commandKey：用来标识一个 Hystrix 命令，默认会取被注解的方法名。需要注意：Hystrix 里同一个键的唯一标识并不包括 groupKey，建议取一个独一二无的名字，防止多个方法之间因为键重复而互相影响。
* threadPoolKey：用来标识一个线程池，如果没设置的话会取 groupKey，很多情况下都是同一个类内的方法在共用同一个线程池，如果两个共用同一线程池的方法上配置了同样的属性，在第一个方法被执行后线程池的属性就固定了，所以属性会以第一个被执行的方法上的配置为准。
* fallbackMethod：方法执行时熔断、错误、超时时会执行的回退方法，需要保持此方法与 Hystrix 方法的签名和返回值一致。
* commandProperties：与此命令相关的属性。
* threadPoolProperties：与线程池相关的属性，
* ignoreExceptions：默认 Hystrix 在执行方法时捕获到异常时执行回退，并统计失败率以修改熔断器的状态，而被忽略的异常则会直接抛到外层，不会执行回退方法，也不会影响熔断器的状态。
* observableExecutionMode：当 Hystrix 命令被包装成 RxJava 的 Observer 异步执行时，此配置指定了 Observable 被执行的模式，默认是 ObservableExecutionMode.EAGER，Observable 会在被创建后立刻执行，而 ObservableExecutionMode.EAGER模式下，则会产生一个 Observable 被 subscribe 后执行。我们常见的命令都是同步执行的，此配置项可以不配置。
* raiseHystrixExceptions：当配置项包括 HystrixRuntimeException 时，所有的未被忽略的异常都会被包装成 HystrixRuntimeException，配置其他种类的异常好像并没有什么影响。
* defaultFallback：默认回退方法，当配置 fallbackMethod 项时此项没有意义，另外，默认回退方法不能有参数，返回值要与 Hystrix方法的返回值相同。

**commandProperties**
配置方式
Hystrix 的命令属性是由 @HystrixProperty 注解数组构成的，HystrixProperty 由 name 和 value 两个属性，数据类型都是字符串。

以下将所有的命令属性分组来介绍。
* 线程隔离(Isolation)
    * execution.isolation.strategy： 配置请求隔离的方式，有 threadPool（线程池，默认）和 semaphore（信号量）两种，信号量方式高效但配置不灵活，我们一般采用 Java 里常用的线程池方式。
    * execution.timeout.enabled：是否给方法执行设置超时，默认为 true。
    * execution.isolation.thread.timeoutInMilliseconds：方法执行超时时间，默认值是 1000，即 1秒，此值根据业务场景配置。
    * execution.isolation.thread.interruptOnTimeout： execution.isolation.thread.interruptOnCancel：是否在方法执行超时/被取消时中断方法。需要注意在 JVM 中我们无法强制中断一个线程，如果 Hystrix 方法里没有处理中断信号的逻辑，那么中断会被忽略。
    * execution.isolation.semaphore.maxConcurrentRequests：默认值是 10，此配置项要在 execution.isolation.strategy 配置为 semaphore 时才会生效，它指定了一个 Hystrix 方法使用信号量隔离时的最大并发数，超过此并发数的请求会被拒绝。信号量隔离的配置就这么一个，也是前文说信号量隔离配置不灵活的原因。
* 统计器(Metrics)
    * 滑动窗口： Hystrix 的统计器是由滑动窗口来实现的，我们可以这么来理解滑动窗口：一位乘客坐在正在行驶的列车的靠窗座位上，列车行驶的公路两侧种着一排挺拔的白杨树，随着列车的前进，路边的白杨树迅速从窗口滑过，我们用每棵树来代表一个请求，用列车的行驶代表时间的流逝，那么，列车上的这个窗口就是一个典型的滑动窗口，这个乘客能通过窗口看到的白杨树就是 Hystrix 要统计的数据。
    * 桶： bucket 是 Hystrix 统计滑动窗口数据时的最小单位。同样类比列车窗口，在列车速度非常快时，如果每掠过一棵树就统计一次窗口内树的数据，显然开销非常大，如果乘客将窗口分成十分，列车前进行时每掠过窗口的十分之一就统计一次数据，开销就完全可以接受了。 Hystrix 的 bucket （桶）也就是窗口 N分之一 的概念。
    * metrics.rollingStats.timeInMilliseconds：此配置项指定了窗口的大小，单位是 ms，默认值是 1000，即一个滑动窗口默认统计的是 1s 内的请求数据。
    * metrics.healthSnapshot.intervalInMilliseconds：它指定了健康数据统计器（影响 Hystrix 熔断）中每个桶的大小，默认是 500ms，在进行统计时，Hystrix 通过 metrics.rollingStats.timeInMilliseconds / metrics.healthSnapshot.intervalInMilliseconds 计算出桶数，在窗口滑动时，每滑过一个桶的时间间隔时就统计一次当前窗口内请求的失败率。
    * metrics.rollingStats.numBuckets：Hystrix 会将命令执行的结果类型都统计汇总到一块，给上层应用使用或生成统计图表，此配置项即指定了，生成统计数据流时滑动窗口应该拆分的桶数。此配置项最易跟上面的 metrics.healthSnapshot.intervalInMilliseconds 搞混，认为此项影响健康数据流的桶数。 此项默认是 10，并且需要保持此值能被 metrics.rollingStats.timeInMilliseconds 整除。
    * metrics.rollingPercentile.enabled：是否统计方法响应时间百分比，默认为 true 时，Hystrix 会统计方法执行的 1%,10%,50%,90%,99% 等比例请求的平均耗时用以生成统计图表。
    * metrics.rollingPercentile.timeInMilliseconds：统计响应时间百分比时的窗口大小，默认为 60000，即一分钟。
    * metrics.rollingPercentile.numBuckets：统计响应时间百分比时滑动窗口要划分的桶用，默认为6，需要保持能被metrics.rollingPercentile.timeInMilliseconds 整除。
    * metrics.rollingPercentile.bucketSize：统计响应时间百分比时，每个滑动窗口的桶内要保留的请求数，桶内的请求超出这个值后，会覆盖最前面保存的数据。默认值为 100，在统计响应百分比配置全为默认的情况下，每个桶的时间长度为 10s = 60000ms / 6，但这 10s 内只保留最近的 100 条请求的数据。


* 熔断器(Circuit Breaker)
    * circuitBreaker.enabled：是否启用熔断器，默认为 true;
    * circuitBreaker.forceOpen： circuitBreaker.forceClosed：是否强制启用/关闭熔断器，强制启用关闭都想不到什么应用的场景，保持默认值，不配置即可。
    * circuitBreaker.requestVolumeThreshold：启用熔断器功能窗口时间内的最小请求数。试想如果没有这么一个限制，我们配置了 50% 的请求失败会打开熔断器，窗口时间内只有 3 条请求，恰巧两条都失败了，那么熔断器就被打开了，5s 内的请求都被快速失败。此配置项的值需要根据接口的 QPS 进行计算，值太小会有误打开熔断器的可能，值太大超出了时间窗口内的总请求数，则熔断永远也不会被触发。建议设置为 QPS * 窗口秒数 * 60%。
    * circuitBreaker.errorThresholdPercentage：在通过滑动窗口获取到当前时间段内 Hystrix 方法执行的失败率后，就需要根据此配置来判断是否要将熔断器打开了。 此配置项默认值是 50，即窗口时间内超过 50% 的请求失败后会打开熔断器将后续请求快速失败。
    * circuitBreaker.sleepWindowInMilliseconds：熔断器打开后，所有的请求都会快速失败，但何时服务恢复正常就是下一个要面对的问题。熔断器打开时，Hystrix 会在经过一段时间后就放行一条请求，如果这条请求执行成功了，说明此时服务很可能已经恢复了正常，那么会将熔断器关闭，如果此请求执行失败，则认为服务依然不可用，熔断器继续保持打开状态。此配置项指定了熔断器打开后经过多长时间允许一次请求尝试执行，默认值是 5000。


* 其他(Context/Fallback)
    * requestCache.enabled：是否启用请求结果缓存。默认是 true，但它并不意味着我们的每个请求都会被缓存。缓存请求结果和从缓存中获取结果都需要我们配置 cacheKey，并且在方法上使用 @CacheResult 注解声明一个缓存上下文。
    * requestLog.enabled：是否启用请求日志，默认为 true。
    * fallback.enabled：是否启用方法回退，默认为 true 即可。
    * fallback.isolation.semaphore.maxConcurrentRequests：回退方法执行时的最大并发数，默认是10，如果大量请求的回退方法被执行时，超出此并发数的请求会抛出 REJECTED_SEMAPHORE_FALLBACK 异常。

**threadPoolProperties**
配置方式
线程池的配置也是由 HystrixProperty 数组构成，配置方式与命令属性一致。

* 配置项
    * coreSize：核心线程池的大小，默认值是 10，一般根据 QPS * 99% cost + redundancy count 计算得出。
    * allowMaximumSizeToDivergeFromCoreSize：是否允许线程池扩展到最大线程池数量，默认为 false;
    * maximumSize：线程池中线程的最大数量，默认值是 10，此配置项单独配置时并不会生效，需要启用 allowMaximumSizeToDivergeFromCoreSize 项。
    * maxQueueSize：作业队列的最大值，默认值为 -1，设置为此值时，队列会使用 SynchronousQueue，此时其 size 为0，Hystrix 不会向队列内存放作业。如果此值设置为一个正的 int 型，队列会使用一个固定 size 的 LinkedBlockingQueue，此时在核心线程池内的线程都在忙碌时，会将作业暂时存放在此队列内，但超出此队列的请求依然会被拒绝。
    * queueSizeRejectionThreshold：由于 maxQueueSize 值在线程池被创建后就固定了大小，如果需要动态修改队列长度的话可以设置此值，即使队列未满，队列内作业达到此值时同样会拒绝请求。此值默认是 5，所以有时候只设置了 maxQueueSize 也不会起作用。
    * keepAliveTimeMinutes：由上面的 maximumSize，我们知道，线程池内核心线程数目都在忙碌，再有新的请求到达时，线程池容量可以被扩充为到最大数量，等到线程池空闲后，多于核心数量的线程还会被回收，此值指定了线程被回收前的存活时间，默认为 2，即两分钟。
* 工作方式
    * Hystrix 内线程池的使用是基于 Java 内置线程池的简单包装，通常有以下三种状态：
    * 如果请求量少，达不到 coreSize，通常会使用核心线程来执行任务。
    * 如果设置了 maxQueueSize，当请求数超过了 coreSize, 通常会把请求放到 queue 里，待核心线程有空闲时消费。
    * 如果 queue 长度无法存储请求，则会创建新线程执行直到达到 maximumSize 最大线程数，多出核心线程数的线程会在空闲时回收。


#### 9.5.3.5. 如何使用
<a href="#menu" >目录</a>

##### 9.5.3.5.1. 基本的实例
<a href="#menu" >目录</a>

**引入依赖**
```xml
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-core</artifactId>
    <version>1.5.18</version>
</dependency>
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-serialization</artifactId>
    <version>1.5.18</version>
</dependency>
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-metrics-event-stream</artifactId>
    <version>1.5.18</version>
</dependency>
<dependency>
    <groupId>com.netflix.hystrix</groupId>
    <artifactId>hystrix-javanica</artifactId>
    <version>1.5.18</version>
</dependency>
```

Hystrix有两个请求命令 HystrixCommand、HystrixObservableCommand。
* HystrixCommand用在依赖服务返回单个操作结果的时候。又两种执行方式
    * -execute():同步执行。从依赖的服务返回一个单一的结果对象，或是在发生错误的时候抛出异常。
    * -queue();异步执行。直接返回一个Future对象，其中包含了服务执行结束时要返回的单一结果对象。
* HystrixObservableCommand 用在依赖服务返回多个操作结果的时候。它也实现了两种执行方式
    * -observe():返回Obervable对象，他代表了操作的多个结果，他是一个HotObservable
    * -toObservable():同样返回Observable对象，也代表了操作多个结果，但它返回的是一个Cold Observable。

**与HystrixCommand进行比较：**
* HystrixCommand提供了同步和异步两种执行方式，而HystrixObservableCommand只有**异步方式**
* HystrixCommand的run方法是用内部线程池的线程来执行的，而HystrixObservableCommand则是由调用方(例如Tomcat容器)的线程来执行的，因为是异步，所以两种方式都能很好的起到资源隔离的效果。这点也可以从前面的测试结果中看出，当调用HystrixCommand的run方法时，控制台输出执行线程为：hystrix-usercommand-1is running......，而HystrixObservableCommand的控制台输出线程为：http-nio-8080-exec-1is running......
* HystrixCommand一次只能发送单条数据返回，而HystrixObservableCommand一次可以发送多条数据返回，从上面的示例可以看出

**HystrixCommand：**
 
* 使用方式一：继承的方式
```java
package org.hope.hystrix.example;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lisen on 2017/12/15.
 * HystrixCommand用在命令服务返回单个操作结果的时候
 */
public class CommandHelloWorld extends HystrixCommand<String> {
    private final String name;

    public CommandHelloWorld(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        int i = 1/0;
        return "Hello " + name + "!";
    }

    /**
     * 降级。Hystrix会在run()执行过程中出现错误、超时、线程池拒绝、断路器熔断等情况时，
     * 执行getFallBack()方法内的逻辑
     */
    @Override
    protected String getFallback() {
        return "faild";
    }
}
```
* 单元测试：

```java
package org.hope.hystrix.example;

import org.junit.Test;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.functions.Action1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class CommandHelloWorldTest {

    /**
     * 测试同步执行
     */
    @Test
    public void testSynchronous() {
        System.out.println(new CommandHelloWorld("World").execute());
    }

    /**
     * 测试异步执行
     */
    @Test
    public void testAsynchronous() throws ExecutionException, InterruptedException {
        Future<String> fWorld = new CommandHelloWorld("World").queue();
        System.out.println(fWorld.get());  //一步执行用get()来获取结果
    }

    /**
     * 虽然HystrixCommand具备了observe()和toObservable()的功能，但是它的实现有一定的局限性，
     * 它返回的Observable只能发射一次数据，所以Hystrix还提供了HystrixObservableCommand,
     * 通过它实现的命令可以获取能发多次的Observable
     */
    @Test
    public void testObserve() {
        /**
         * 返回的是Hot Observable,HotObservable，不论 “事件源" 是否有“订阅者"
         * 都会在创建后对事件进行发布。所以对于Hot Observable的每一个“订阅者"都有
         * 可能从“事件源"的中途开始的，并可能只是看到了整个操作的局部过程
         */
        //blocking
        Observable<String> ho = new CommandHelloWorld("World").observe();
//        System.out.println(ho.toBlocking().single());

        //non-blockking
        //- this is a verbose anonymous inner-class approach and doesn't do assertions
        ho.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("==============onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(String s) {
                System.out.println("=========onNext: " + s);
            }
        });

        ho.subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("==================call:" + s);
            }
        });
    }

    @Test
    public void testToObservable() {
        /**
         * Cold Observable在没有 “订阅者" 的时候并不会发布时间，
         * 而是进行等待，知道有 “订阅者" 之后才发布事件，所以对于
         * Cold Observable的订阅者，它可以保证从一开始看到整个操作的全部过程。
         */
        Observable<String> co = new CommandHelloWorld("World").toObservable();
        System.out.println(co.toBlocking().single());
    }

}
```

* 使用方式二：注解的方式；

```java
package org.hope.hystrix.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.ObservableExecutionMode;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Subscriber;

import java.util.concurrent.Future;

/**
 * 用@HystrixCommand的方式来实现
 */
@Service
public class UserService {
    /**
     * 同步的方式。
     * fallbackMethod定义降级
     */
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String getUserId(String name) {
        int i = 1/0; //此处抛异常，测试服务降级
        return "你好:" + name;
    }

    public String helloFallback(String name) {
        return "error";
    }

    //异步的执行
    @HystrixCommand(fallbackMethod = "getUserNameError")
    public Future<String> getUserName(final Long id) {
        return new AsyncResult<String>() {
            @Override
            public String invoke() {
                int i = 1/0;//此处抛异常,测试服务降级
                return "小明:" + id;
            }
        };
    }

    public String getUserNameError(Long id) {
        return "faile";
    }
}
```
* 单元测试：

```java
package org.hope.hystrix.example.service;

import javafx.application.Application;
import org.hope.hystrix.example.HystrixApplication;
import org.hope.hystrix.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutionException;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HystrixApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 测试同步
     */
    @Test
    public void testGetUserId() {
        System.out.println("=================" + userService.getUserId("lisi"));
    }

    /**
     * 测试异步
     */
    @Test
    public void testGetUserName() throws ExecutionException, InterruptedException {
        System.out.println("=================" + userService.getUserName(30L).get());
    }
}
```

**HystrixObservableCommand：**
* 使用方式一：继承的方式
HystrixObservable通过实现 protected Observable<String> construct() 方法来执行逻辑。通过 重写 resumeWithFallback方法来实现服务降级

```java
package org.hope.hystrix.example;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class ObservableCommandHelloWorld extends HystrixObservableCommand<String> {

    private final String name;

    public ObservableCommandHelloWorld(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected Observable<String> construct() {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                try {
                    if(!subscriber.isUnsubscribed()) {
                        subscriber.onNext("Hello");
                        int i = 1 / 0; //模拟异常
                        subscriber.onNext(name + "!");
                        subscriber.onCompleted();
                    }
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        }).subscribeOn(Schedulers.io());
    }

    /**
     * 服务降级
     */
    @Override
    protected Observable<String> resumeWithFallback() {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                try {
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onNext("失败了！");
                        subscriber.onNext("找大神来排查一下吧！");
                        subscriber.onCompleted();
                    }
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        }).subscribeOn(Schedulers.io());
    }
}
```
 
* 单元测试：

```java
package org.hope.hystrix.example;

import org.junit.Test;
import rx.Observable;

import java.util.Iterator;

public class ObservableCommandHelloWorldTest {

    @Test
    public void testObservable() {
        Observable<String> observable= new ObservableCommandHelloWorld("World").observe();

        Iterator<String> iterator = observable.toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testToObservable() {
        Observable<String> observable= new ObservableCommandHelloWorld("World").observe();
        Iterator<String> iterator = observable.toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
```

* 使用方式二：注解的方式；
```java
package org.hope.hystrix.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.ObservableExecutionMode;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Subscriber;

@Service
public class ObservableUserService {
    /**
     *  EAGER参数表示使用observe()方式执行
     */
    @HystrixCommand(observableExecutionMode = ObservableExecutionMode.EAGER, fallbackMethod = "observFailed") //使用observe()执行方式
    public Observable<String> getUserById(final Long id) {
       return Observable.create(new Observable.OnSubscribe<String>() {
           @Override
           public void call(Subscriber<? super String> subscriber) {
               try {
                   if(!subscriber.isUnsubscribed()) {
                       subscriber.onNext("张三的ID:");
                       int i = 1 / 0; //抛异常，模拟服务降级
                       subscriber.onNext(String.valueOf(id));
                       subscriber.onCompleted();
                   }
               } catch (Exception e) {
                   subscriber.onError(e);
               }
           }
       });
    }

    private String observFailed(Long id) {
        return "observFailed---->" + id;
    }

    /**
     * LAZY参数表示使用toObservable()方式执行
     */
    @HystrixCommand(observableExecutionMode = ObservableExecutionMode.LAZY, fallbackMethod = "toObserbableError") //表示使用toObservable()执行方式
    public Observable<String> getUserByName(final String name) {
        return Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                try {
                    if(!subscriber.isUnsubscribed()) {
                        subscriber.onNext("找到");
                        subscriber.onNext(name);
                        int i = 1/0; ////抛异常，模拟服务降级
                        subscriber.onNext("了");
                        subscriber.onCompleted();
                    }
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        });
    }

    private String toObserbableError(String name) {
        return "toObserbableError--->" + name;
    }

}
```

* 单元测试：
```java
package org.hope.hystrix.example.service;

import org.hope.hystrix.example.HystrixApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HystrixApplication.class)
public class ObservableUserServiceTest {

    @Autowired
    private ObservableUserService observableUserService;

    @Test
    public void testObserve() {
        Iterator<String> iterator = observableUserService.getUserById(30L).toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println("===============" + iterator.next());
        }
    }

    @Test
    public void testToObservable() {
        Iterator<String> iterator = observableUserService.getUserByName("王五").toBlocking().getIterator();
        while(iterator.hasNext()) {
            System.out.println("===============" + iterator.next());
        }
    }
}
```
总结：在实际使用时，我们需要为大多数执行过程中可能会失败的Hystrix命令实现服务降级逻辑，但是也有一些情况可以不去实现降级逻辑，比如：执行写操作的命令;执行批处理或离线计算的命令.



##### 9.5.3.5.2. 同步执行
<a href="#menu" >目录</a>

HystrixCommand
```java
//执行以下方法将会调用CommandHelloWorld的run方法
new CommandHelloWorld("xxx").execute();

```
HystrixObservableCommand 没有同步执行

```java
Observable<String> observable = new CommandHelloWorld("lgj").observe();
observable.toBlocking().toFuture().get();
```

##### 9.5.3.5.3. 异步执行
<a href="#menu" >目录</a>

HystrixCommand
```java
//调用queue方法是异步执行
Future<String> fs = new CommandHelloWorld("World").queue();
//调用Future的get获取执行结果
String s = fs.get();
```
HystrixObservableCommand 

```java
Observable<String> observable = new CommandHelloWorld("lgj").observe();
observable.toBlocking().toFuture().get();
```

##### 9.5.3.5.4. Reactive Execution
<a href="#menu" >目录</a>

You can also observe the results of a HystrixCommand as an Observable by using one of the following methods:

observe() — returns a “hot" Observable that executes the command immediately, though because the Observable is filtered through a ReplaySubject you are not in danger of losing any items that it emits before you have a chance to subscribe
toObservable() — returns a “cold" Observable that won’t execute the command and begin emitting its results until you subscribe to the Observable
Observable<String> ho = new CommandHelloWorld("World").observe();
// or Observable<String> co = new CommandHelloWorld("World").toObservable();
You then retrieve the value of the command by subscribing to the Observable:
```java
ho.subscribe(new Action1<String>() {

    @Override
    public void call(String s) {
         // value emitted here
    }

});
```
The following unit tests demonstrate the behavior:
```java
@Test
public void testObservable() throws Exception {

    Observable<String> fWorld = new CommandHelloWorld("World").observe();
    Observable<String> fBob = new CommandHelloWorld("Bob").observe();

    // blocking
    assertEquals("Hello World!", fWorld.toBlockingObservable().single());
    assertEquals("Hello Bob!", fBob.toBlockingObservable().single());

    // non-blocking 
    // - this is a verbose anonymous inner-class approach and doesn't do assertions
    fWorld.subscribe(new Observer<String>() {

        @Override
        public void onCompleted() {
            // nothing needed here
        }

        @Override
        public void onError(Throwable e) {
            e.printStackTrace();
        }

        @Override
        public void onNext(String v) {
            System.out.println("onNext: " + v);
        }

    });

    // non-blocking
    // - also verbose anonymous inner-class
    // - ignore errors and onCompleted signal
    fBob.subscribe(new Action1<String>() {

        @Override
        public void call(String v) {
            System.out.println("onNext: " + v);
        }

    });
}
```
Using Java 8 lambdas/closures is more compact; it would look like this:
```java
    fWorld.subscribe((v) -> {
        System.out.println("onNext: " + v);
    })
    
    // - or while also including error handling
    
    fWorld.subscribe((v) -> {
        System.out.println("onNext: " + v);
    }, (exception) -> {
        exception.printStackTrace();
    })
```
More information about Observable can be found at http://reactivex.io/documentation/observable.html

##### 9.5.3.5.5. Reactive Commands
<a href="#menu" >目录</a>

Rather than converting a HystrixCommand into an Observable using the methods described above, you can also create a HystrixObservableCommand that is a specialized version of HystrixCommand meant to wrap Observables. A HystrixObservableCommand is capable of wrapping Observables that emit multiple items, whereas ordinary HystrixCommands, even when converted into Observables, will never emit more than one item.

In such a case, instead of overriding the run method with your command logic (as you would with an ordinary HystrixCommand), you would override the construct method so that it returns the Observable you intend to wrap.

To obtain an Observable representation of the HystrixObservableCommand, use one of the following two methods:

observe() — returns a “hot" Observable that subscribes to the underlying Observable immediately, though because it is filtered through a ReplaySubject you are not in danger of losing any items that it emits before you have a chance to subscribe to the resulting Observable
toObservable() — returns a “cold" Observable that won’t subscribe to the underlying Observable until you subscribe to the resulting Observable
##### 9.5.3.5.6. Fallback
<a href="#menu" >目录</a>


You can support graceful degradation in a Hystrix command by adding a fallback method that Hystrix will call to obtain a default value or values in case the main command fails. You will want to implement a fallback for most Hystrix commands that might conceivably fail, with a couple of exceptions:

a command that performs a write operation
If your Hystrix command is designed to do a write operation rather than to return a value (such a command might normally return a void in the case of a HystrixCommand or an empty Observable in the case of a HystrixObservableCommand), there isn’t much point in implementing a fallback. If the write fails, you probably want the failure to propagate back to the caller.
batch systems/offline compute
If your Hystrix command is filling up a cache, or generating a report, or doing any sort of offline computation, it’s usually more appropriate to propagate the error back to the caller who can then retry the command later, rather than to send the caller a silently-degraded response.
Whether or not your command has a fallback, all of the usual Hystrix state and circuit-breaker state/metrics are updated to indicate the command failure.

In an ordinary HystrixCommand you implement a fallback by means of a getFallback() implementation. Hystrix will execute this fallback for all types of failure such as run() failure, timeout, thread pool or semaphore rejection, and circuit-breaker short-circuiting. The following example includes such a fallback:
```java
public class CommandHelloFailure extends HystrixCommand<String> {

    private final String name;

    public CommandHelloFailure(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() {
        throw new RuntimeException("this command always fails");
    }

    @Override
    protected String getFallback() {
        return "Hello Failure " + name + "!";
    }
}
```
This command’s run() method will fail on every execution. However, the caller will always receive the value returned by the command’s getFallback() method instead of receiving an exception:
```java
    @Test
    public void testSynchronous() {
        assertEquals("Hello Failure World!", new CommandHelloFailure("World").execute());
        assertEquals("Hello Failure Bob!", new CommandHelloFailure("Bob").execute());
    }
```
HystrixObservableCommand Equivalent
For a HystrixObservableCommand you instead may override the resumeWithFallback method so that it returns a second Observable that will take over from the primary Observable if it fails. Note that because an Observable may fail after having already emitted one or more items, your fallback should not assume that it will be emitting the only values that the observer will see.

Internally, Hystrix uses the RxJava onErrorResumeNext operator to seamlessly transition between the primary and fallback Observable in case of an error.

Sequence Diagram
@adrianb11 has kindly provided a sequence diagram demonstrating how a timeout then fallback works.

##### 9.5.3.5.7. Error Propagation
<a href="#menu" >目录</a>

All exceptions thrown from the run() method except for HystrixBadRequestException count as failures and trigger getFallback() and circuit-breaker logic.

You can wrap the exception that you would like to throw in HystrixBadRequestException and retrieve it via getCause(). The HystrixBadRequestException is intended for use cases such as reporting illegal arguments or non-system failures that should not count against the failure metrics and should not trigger fallback logic.

HystrixObservableCommand Equivalent
In the case of a HystrixObservableCommand, non-recoverable errors are returned via onError notifications from the resulting Observable, and fallbacks are accomplished by falling back to a second Observable that Hystrix obtains through the resumeWithFallback method that you implement.

Execution Exception types
Failure Type	Exception class	Exception.cause	subject to fallback
FAILURE	HystrixRuntimeException	underlying exception (user-controlled)	YES
TIMEOUT	HystrixRuntimeException	j.u.c.TimeoutException	YES
SHORT_CIRCUITED	HystrixRuntimeException	j.l.RuntimeException	YES
THREAD_POOL_REJECTED	HystrixRuntimeException	j.u.c.RejectedExecutionException	YES
SEMAPHORE_REJECTED	HystrixRuntimeException	j.l.RuntimeException	YES
BAD_REQUEST	HystrixBadRequestException	underlying exception (user-controlled)	NO
##### 9.5.3.5.8. Command Name
<a href="#menu" >目录</a>

A command name is, by default, derived from the class name:

getClass().getSimpleName();
To explicitly define the name pass it in via the HystrixCommand or HystrixObservableCommand constructor:
```java
    public CommandHelloWorld(String name) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("HelloWorld")));
        this.name = name;
    }
```
To save a Setter allocation per command allocation, you may also cache the Setter like so:
```java
    private static final Setter cachedSetter = 
        Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
            .andCommandKey(HystrixCommandKey.Factory.asKey("HelloWorld"));    

    public CommandHelloWorld(String name) {
        super(cachedSetter);
        this.name = name;
    }
```
HystrixCommandKey is an interface and can be implemented as an enum or regular class, but it also has the helper Factory class to construct and intern instances such as:

HystrixCommandKey.Factory.asKey("HelloWorld")
##### 9.5.3.5.9. Command Group
<a href="#menu" >目录</a>

Hystrix uses the command group key to group together commands such as for reporting, alerting, dashboards, or team/library ownership.

By default Hystrix uses this to define the command thread-pool unless a separate one is defined.

HystrixCommandGroupKey is an interface and can be implemented as an enum or regular class, but it also has the helper Factory class to construct and intern instances such as:

HystrixCommandGroupKey.Factory.asKey("ExampleGroup")
##### 9.5.3.5.10. Command Thread-Pool
<a href="#menu" >目录</a>

The thread-pool key represents a HystrixThreadPool for monitoring, metrics publishing, caching, and other such uses. A HystrixCommand is associated with a single HystrixThreadPool as retrieved by the HystrixThreadPoolKey injected into it, or it defaults to one created using the HystrixCommandGroupKey it is created with.

To explicitly define the name pass it in via the HystrixCommand or HystrixObservableCommand constructor:
```java
public CommandHelloWorld(String name) {
    super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
            .andCommandKey(HystrixCommandKey.Factory.asKey("HelloWorld"))
            .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("HelloWorldPool")));
    this.name = name;
}
```
HystrixThreadPoolKey is an interface and can be implemented as an enum or regular class, but it also has the helper Factory class to construct and intern instances such as:

HystrixThreadPoolKey.Factory.asKey("HelloWorldPool")
The reason why you might use HystrixThreadPoolKey instead of just a different HystrixCommandGroupKey is that multiple commands may belong to the same “group" of ownership or logical functionality, but certain commands may need to be isolated from each other.

Here is a simple example:

two commands used to access Video metadata
group name is “VideoMetadata"
command A goes against resource #1
command B goes against resource #2
If command A becomes latent and saturates its thread-pool it should not prevent command B from executing requests since they each hit different back-end resources.

Thus, we logically want these commands grouped together but want them isolated differently and would use HystrixThreadPoolKey to give each of them a different thread-pool.

##### 9.5.3.5.11. Request Cache
<a href="#menu" >目录</a>

You enable request caching by implementing the getCacheKey() method on a HystrixCommand or HystrixObservableCommand object as follows:
```java
public class CommandUsingRequestCache extends HystrixCommand<Boolean> {

    private final int value;

    protected CommandUsingRequestCache(int value) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.value = value;
    }

    @Override
    protected Boolean run() {
        return value == 0 || value % 2 == 0;
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(value);
    }
}
```

Since this depends on request context we must initialize the HystrixRequestContext.

In a simple unit test you could do this as follows:
```java
@Test
public void testWithoutCacheHits() {
    HystrixRequestContext context = HystrixRequestContext.initializeContext();
    try {
        assertTrue(new CommandUsingRequestCache(2).execute());
        assertFalse(new CommandUsingRequestCache(1).execute());
        assertTrue(new CommandUsingRequestCache(0).execute());
        assertTrue(new CommandUsingRequestCache(58672).execute());
    } finally {
        context.shutdown();
    }
}
```
Typically this context will be initialized and shut down via a ServletFilter that wraps a user request or some other lifecycle hook.

The following is an example that shows how commands retrieve their values from the cache (and how you can query an object to know whether its value came from the cache) within a request context:
```java
@Test
public void testWithCacheHits() {
    HystrixRequestContext context = HystrixRequestContext.initializeContext();
    try {
        CommandUsingRequestCache command2a = new CommandUsingRequestCache(2);
        CommandUsingRequestCache command2b = new CommandUsingRequestCache(2);

        assertTrue(command2a.execute());
        // this is the first time we've executed this command with
        // the value of "2" so it should not be from cache
        assertFalse(command2a.isResponseFromCache());

        assertTrue(command2b.execute());
        // this is the second time we've executed this command with
        // the same value so it should return from cache
        assertTrue(command2b.isResponseFromCache());
    } finally {
        context.shutdown();
    }

    // start a new request context
    context = HystrixRequestContext.initializeContext();
    try {
        CommandUsingRequestCache command3b = new CommandUsingRequestCache(2);
        assertTrue(command3b.execute());
        // this is a new request context so this 
        // should not come from cache
        assertFalse(command3b.isResponseFromCache());
    } finally {
        context.shutdown();
    }
}
```
##### 9.5.3.5.12. Request Collapsing
<a href="#menu" >目录</a>

Request collapsing enables multiple requests to be batched into a single HystrixCommand instance execution.

A collapser can use the batch size and the elapsed time since the creation of the batch as triggers for executing a batch.

There are 2 styles of request-collapsing supported by Hystrix: request-scoped and globally-scoped. This is configured at collapser construction, and defaulted to request-scoped.

A request-scoped collapser collects a batch per HystrixRequestContext, while a globally-scoped collapser collects a batch across multiple HystrixRequestContexts. As a result, if your downstream dependencies cannot handle multiple HystrixRequestContexts in a single command invocation, request-scoped collapsing is the proper choice.

At Netflix, we exclusively use request-scoped collapsers because all current systems have been built on the assumption that a single HystrixRequestContext will be used in each command. Since the batches are per-request only, collapsing is effective when commands occur in parallel with different arguments in the same request.

Following is a simple example of how to implement a request-scoped HystrixCollapser:
```java
public class CommandCollapserGetValueForKey extends HystrixCollapser<List<String>, String, Integer> {

    private final Integer key;

    public CommandCollapserGetValueForKey(Integer key) {
        this.key = key;
    }

    @Override
    public Integer getRequestArgument() {
        return key;
    }

    @Override
    protected HystrixCommand<List<String>> createCommand(final Collection<CollapsedRequest<String, Integer>> requests) {
        return new BatchCommand(requests);
    }

    @Override
    protected void mapResponseToRequests(List<String> batchResponse, Collection<CollapsedRequest<String, Integer>> requests) {
        int count = 0;
        for (CollapsedRequest<String, Integer> request : requests) {
            request.setResponse(batchResponse.get(count++));
        }
    }

    private static final class BatchCommand extends HystrixCommand<List<String>> {
        private final Collection<CollapsedRequest<String, Integer>> requests;

        private BatchCommand(Collection<CollapsedRequest<String, Integer>> requests) {
                super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("GetValueForKey")));
            this.requests = requests;
        }

        @Override
        protected List<String> run() {
            ArrayList<String> response = new ArrayList<String>();
            for (CollapsedRequest<String, Integer> request : requests) {
                // artificial response for each argument received in the batch
                response.add("ValueForKey: " + request.getArgument());
            }
            return response;
        }
    }
}
```
The following unit test shows how to use a collapser to automatically batch four executions of CommandCollapserGetValueForKey into a single HystrixCommand execution:
```java
@Test
public void testCollapser() throws Exception {
    HystrixRequestContext context = HystrixRequestContext.initializeContext();
    try {
        Future<String> f1 = new CommandCollapserGetValueForKey(1).queue();
        Future<String> f2 = new CommandCollapserGetValueForKey(2).queue();
        Future<String> f3 = new CommandCollapserGetValueForKey(3).queue();
        Future<String> f4 = new CommandCollapserGetValueForKey(4).queue();

        assertEquals("ValueForKey: 1", f1.get());
        assertEquals("ValueForKey: 2", f2.get());
        assertEquals("ValueForKey: 3", f3.get());
        assertEquals("ValueForKey: 4", f4.get());

        // assert that the batch command 'GetValueForKey' was in fact
        // executed and that it executed only once
        assertEquals(1, HystrixRequestLog.getCurrentRequest().getExecutedCommands().size());
        HystrixCommand<?> command = HystrixRequestLog.getCurrentRequest().getExecutedCommands().toArray(new HystrixCommand<?>[1])[0];
        // assert the command is the one we're expecting
        assertEquals("GetValueForKey", command.getCommandKey().name());
        // confirm that it was a COLLAPSED command execution
        assertTrue(command.getExecutionEvents().contains(HystrixEventType.COLLAPSED));
        // and that it was successful
        assertTrue(command.getExecutionEvents().contains(HystrixEventType.SUCCESS));
    } finally {
        context.shutdown();
    }
}
```
##### 9.5.3.5.13. Request Context Setup
<a href="#menu" >目录</a>

To use request-scoped features (request caching, request collapsing, request log) you must manage the HystrixRequestContext lifecycle (or implement an alternative HystrixConcurrencyStrategy).

This means that you must execute the following before a request:

HystrixRequestContext context = HystrixRequestContext.initializeContext();
and then this at the end of the request:

context.shutdown();
In a standard Java web application, you can use a Servlet Filter to initialize this lifecycle by implementing a filter similar to this:
```java
public class HystrixRequestContextServletFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
     throws IOException, ServletException {
        HystrixRequestContext context = HystrixRequestContext.initializeContext();
        try {
            chain.doFilter(request, response);
        } finally {
            context.shutdown();
        }
    }
}
```
You could enable the filter for all incoming traffic by adding a section to the web.xml as follows:
```xml
    <filter>
      <display-name>HystrixRequestContextServletFilter</display-name>
      <filter-name>HystrixRequestContextServletFilter</filter-name>
      <filter-class>com.netflix.hystrix.contrib.requestservlet.HystrixRequestContextServletFilter</filter-class>
    </filter>
    <filter-mapping>
      <filter-name>HystrixRequestContextServletFilter</filter-name>
      <url-pattern>/*</url-pattern>
   </filter-mapping>
```
##### 9.5.3.5.14. Common Patterns
<a href="#menu" >目录</a>

In the following sections are common uses and patterns of use for HystrixCommand and HystrixObservableCommand.

Fail Fast
The most basic execution is one that does a single thing and has no fallback behavior. It will throw an exception if any type of failure occurs.
```java
public class CommandThatFailsFast extends HystrixCommand<String> {

    private final boolean throwException;

    public CommandThatFailsFast(boolean throwException) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.throwException = throwException;
    }

    @Override
    protected String run() {
        if (throwException) {
            throw new RuntimeException("failure from CommandThatFailsFast");
        } else {
            return "success";
        }
    }
```
These unit tests show how it behaves:
```java
@Test
public void testSuccess() {
    assertEquals("success", new CommandThatFailsFast(false).execute());
}

@Test
public void testFailure() {
    try {
        new CommandThatFailsFast(true).execute();
        fail("we should have thrown an exception");
    } catch (HystrixRuntimeException e) {
        assertEquals("failure from CommandThatFailsFast", e.getCause().getMessage());
        e.printStackTrace();
    }
}
```
HystrixObservableCommand Equivalent
The equivalent Fail-Fast solution for a HystrixObservableCommand would involve overriding the resumeWithFallback method as follows:
```java
    @Override
    protected Observable<String> resumeWithFallback() {
        if (throwException) {
            return Observable.error(new Throwable("failure from CommandThatFailsFast"));
        } else {
            return Observable.just("success");
        }
    }
```
##### 9.5.3.5.15. Fail Silent
]<a href="#menu" >目录</a>

Failing silently is the equivalent of returning an empty response or removing functionality. It can be done by returning null, an empty Map, empty List, or other such responses.

You do this by implementing a getFallback() method on the HystrixCommand instance:


```java
public class CommandThatFailsSilently extends HystrixCommand<String> {

    private final boolean throwException;

    public CommandThatFailsSilently(boolean throwException) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.throwException = throwException;
    }

    @Override
    protected String run() {
        if (throwException) {
            throw new RuntimeException("failure from CommandThatFailsFast");
        } else {
            return "success";
        }
    }

    @Override
    protected String getFallback() {
        return null;
    }
}
```
```java
@Test
public void testSuccess() {
    assertEquals("success", new CommandThatFailsSilently(false).execute());
}

@Test
public void testFailure() {
    try {
        assertEquals(null, new CommandThatFailsSilently(true).execute());
    } catch (HystrixRuntimeException e) {
        fail("we should not get an exception as we fail silently with a fallback");
    }
}
```
Another implementation that returns an empty list would look like:
```java
    @Override
    protected List<String> getFallback() {
        return Collections.emptyList();
    }
```
HystrixObservableCommand Equivalent
The equivalent Fail-Silently solution for a HystrixObservableCommand would involve overriding the resumeWithFallback() method as follows:
```java
    @Override
    protected Observable<String> resumeWithFallback() {
        return Observable.empty();
    }
```
##### 9.5.3.5.16. Fallback: Static
<a href="#menu" >目录</a>

Fallbacks can return default values statically embedded in code. This doesn’t cause the feature or service to be removed in the way that “fail silent" often does, but instead causes default behavior to occur.

For example, if a command returns a true/false based on user credentials but the command execution fails, it can default to true:
```java
    @Override
    protected Boolean getFallback() {
        return true;
    }
```
HystrixObservableCommand Equivalent
The equivalent Static solution for a HystrixObservableCommand would involve overriding the resumeWithFallback method as follows:
```java
    @Override
    protected Observable<Boolean> resumeWithFallback() {
        return Observable.just( true );
    }
```
##### 9.5.3.5.17. Fallback: Stubbed
<a href="#menu" >目录</a>

You typically use a stubbed fallback when your command returns a compound object containing multiple fields, some of which can be determined from other request state while other fields are set to default values.

Examples of places where you might find state appropriate to use in these stubbed values are:

cookies
request arguments and headers
responses from previous service requests prior to the current one failing
Your fallback can retrieve stubbed values statically from the request scope, but typically it is recommended that they be injected at command instantiation time for use if they are needed such as this following example demonstrates in the way it treats the countryCodeFromGeoLookup field:
```java
public class CommandWithStubbedFallback extends HystrixCommand<UserAccount> {

    private final int customerId;
    private final String countryCodeFromGeoLookup;

    /**
     * @param customerId
     *            The customerID to retrieve UserAccount for
     * @param countryCodeFromGeoLookup
     *            The default country code from the HTTP request geo code lookup used for fallback.
     */
    protected CommandWithStubbedFallback(int customerId, String countryCodeFromGeoLookup) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.customerId = customerId;
        this.countryCodeFromGeoLookup = countryCodeFromGeoLookup;
    }

    @Override
    protected UserAccount run() {
        // fetch UserAccount from remote service
        //        return UserAccountClient.getAccount(customerId);
        throw new RuntimeException("forcing failure for example");
    }

    @Override
    protected UserAccount getFallback() {
        /**
         * Return stubbed fallback with some static defaults, placeholders,
         * and an injected value 'countryCodeFromGeoLookup' that we'll use
         * instead of what we would have retrieved from the remote service.
         */
        return new UserAccount(customerId, "Unknown Name",
                countryCodeFromGeoLookup, true, true, false);
    }

    public static class UserAccount {
        private final int customerId;
        private final String name;
        private final String countryCode;
        private final boolean isFeatureXPermitted;
        private final boolean isFeatureYPermitted;
        private final boolean isFeatureZPermitted;

        UserAccount(int customerId, String name, String countryCode,
                boolean isFeatureXPermitted,
                boolean isFeatureYPermitted,
                boolean isFeatureZPermitted) {
            this.customerId = customerId;
            this.name = name;
            this.countryCode = countryCode;
            this.isFeatureXPermitted = isFeatureXPermitted;
            this.isFeatureYPermitted = isFeatureYPermitted;
            this.isFeatureZPermitted = isFeatureZPermitted;
        }
    }
}
```
```java
The following unit test demonstrates its behavior:

    @Test
    public void test() {
        CommandWithStubbedFallback command = new CommandWithStubbedFallback(1234, "ca");
        UserAccount account = command.execute();
        assertTrue(command.isFailedExecution());
        assertTrue(command.isResponseFromFallback());
        assertEquals(1234, account.customerId);
        assertEquals("ca", account.countryCode);
        assertEquals(true, account.isFeatureXPermitted);
        assertEquals(true, account.isFeatureYPermitted);
        assertEquals(false, account.isFeatureZPermitted);
    }
```
HystrixObservableCommand Equivalent
The equivalent Stubbed solution for a HystrixObservableCommand would involve overriding the resumeWithFallback method to return an Observable that emits the stub responses. A version equivalent to the previous example would look like this:
```java
@Override
protected Observable<Boolean> resumeWithFallback() {
    return Observable.just( new UserAccount(customerId, "Unknown Name",
                                            countryCodeFromGeoLookup, true, true, false) );
}
```
But if you are expecting to emit multiple items from your Observable, you may be more interested in generating stubs for only those items that the original Observable had not yet emitted before it failed. Here is a simple example to show how you might accomplish this — it keeps track of the last item emitted from the main Observable so that the fallback knows where to pick up to continue the sequence:
```java
@Override
protected Observable<Integer> construct() {
    return Observable.just(1, 2, 3)
            .concatWith(Observable.<Integer> error(new RuntimeException("forced error")))
            .doOnNext(new Action1<Integer>() {
                @Override
                public void call(Integer t1) {
                    lastSeen = t1;
                }
                
            })
            .subscribeOn(Schedulers.computation());
}

@Override
protected Observable<Integer> resumeWithFallback() {
    if (lastSeen < 4) {
        return Observable.range(lastSeen + 1, 4 - lastSeen);
    } else {
        return Observable.empty();
    }
}
```
##### 9.5.3.5.18. Fallback: Cache via Network
<a href="#menu" >目录</a>


Sometimes if a back-end service fails, a stale version of data can be retrieved from a cache service such as memcached.

Since the fallback will go over the network it is another possible point of failure and so it also needs to be wrapped by a HystrixCommand or HystrixObservableCommand.



It is important to execute the fallback command on a separate thread-pool, otherwise if the main command were to become latent and fill the thread-pool, this would prevent the fallback from running if the two commands share the same pool.

The following code shows how CommandWithFallbackViaNetwork executes FallbackViaNetwork in its getFallback() method.

Note how if the fallback fails, it also has a fallback which does the “fail silent" approach of returning null.

To configure the FallbackViaNetwork command to run on a different threadpool than the default RemoteServiceX derived from the HystrixCommandGroupKey, it injects HystrixThreadPoolKey.Factory.asKey("RemoteServiceXFallback") into the constructor.

This means CommandWithFallbackViaNetwork will run on a thread-pool named RemoteServiceX and FallbackViaNetwork will run on a thread-pool named RemoteServiceXFallback.
```java
public class CommandWithFallbackViaNetwork extends HystrixCommand<String> {
    private final int id;

    protected CommandWithFallbackViaNetwork(int id) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("RemoteServiceX"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("GetValueCommand")));
        this.id = id;
    }

    @Override
    protected String run() {
        //        RemoteServiceXClient.getValue(id);
        throw new RuntimeException("force failure for example");
    }

    @Override
    protected String getFallback() {
        return new FallbackViaNetwork(id).execute();
    }

    private static class FallbackViaNetwork extends HystrixCommand<String> {
        private final int id;

        public FallbackViaNetwork(int id) {
            super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("RemoteServiceX"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("GetValueFallbackCommand"))
                    // use a different threadpool for the fallback command
                    // so saturating the RemoteServiceX pool won't prevent
                    // fallbacks from executing
                    .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("RemoteServiceXFallback")));
            this.id = id;
        }

        @Override
        protected String run() {
            MemCacheClient.getValue(id);
        }

        @Override
        protected String getFallback() {
            // the fallback also failed
            // so this fallback-of-a-fallback will 
            // fail silently and return null
            return null;
        }
    }
}
```

##### 9.5.3.5.19. Primary + Secondary with Fallback
<a href="#menu" >目录</a>

Some systems have dual-mode behavior — primary and secondary, or primary and failover.

Sometimes the secondary or failover is considered a failure state and it is intended only for fallback; in those scenarios it would fit in the same pattern as “Cache via Network" described above.

However, if flipping to the secondary system is common, such as a normal part of rolling out new code (sometimes this is part of how stateful systems handle code pushes) then every time the secondary system is used the primary will be in a failure state, tripping circuit breakers and firing alerts.

This is not the desired behavior, if for no other reason than to avoid the “cry wolf" fatigue that will cause alerts to be ignored when a real issue is occurring.

So in such a case the strategy is instead to treat the switching between primary and secondary as normal, healthy patterns and put a façade in front of them.



The primary and secondary HystrixCommand implementations are thread-isolated since they are doing network traffic and business logic. They may each have very different performance characteristics (often the secondary system is a static cache) so another benefit of separate commands for each is that they can be individually tuned.

You do not expose these two commands publicly but you instead hide them behind another HystrixCommand that is semaphore-isolated and that implements the conditional logic as to whether to invoke the primary or secondary command. If both primary and secondary fail then control switches to the fallback of the façade command itself.

The façade HystrixCommand can use semaphore-isolation since all of the work it is doing is going through two other HystrixCommands that are already thread-isolated. It is unnecessary to have yet another layer of threading as long as the run() method of the façade is not doing any other network calls, retry logic, or other “error prone" things.
```java
public class CommandFacadeWithPrimarySecondary extends HystrixCommand<String> {

    private final static DynamicBooleanProperty usePrimary = DynamicPropertyFactory.getInstance().getBooleanProperty("primarySecondary.usePrimary", true);

    private final int id;

    public CommandFacadeWithPrimarySecondary(int id) {
        super(Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey("SystemX"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("PrimarySecondaryCommand"))
                .andCommandPropertiesDefaults(
                        // we want to default to semaphore-isolation since this wraps
                        // 2 others commands that are already thread isolated
                        HystrixCommandProperties.Setter()
                                .withExecutionIsolationStrategy(ExecutionIsolationStrategy.SEMAPHORE)));
        this.id = id;
    }

    @Override
    protected String run() {
        if (usePrimary.get()) {
            return new PrimaryCommand(id).execute();
        } else {
            return new SecondaryCommand(id).execute();
        }
    }

    @Override
    protected String getFallback() {
        return "static-fallback-" + id;
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(id);
    }

    private static class PrimaryCommand extends HystrixCommand<String> {

        private final int id;

        private PrimaryCommand(int id) {
            super(Setter
                    .withGroupKey(HystrixCommandGroupKey.Factory.asKey("SystemX"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("PrimaryCommand"))
                    .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("PrimaryCommand"))
                    .andCommandPropertiesDefaults(
                            // we default to a 600ms timeout for primary
                            HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(600)));
            this.id = id;
        }

        @Override
        protected String run() {
            // perform expensive 'primary' service call
            return "responseFromPrimary-" + id;
        }

    }

    private static class SecondaryCommand extends HystrixCommand<String> {

        private final int id;

        private SecondaryCommand(int id) {
            super(Setter
                    .withGroupKey(HystrixCommandGroupKey.Factory.asKey("SystemX"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("SecondaryCommand"))
                    .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("SecondaryCommand"))
                    .andCommandPropertiesDefaults(
                            // we default to a 100ms timeout for secondary
                            HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(100)));
            this.id = id;
        }

        @Override
        protected String run() {
            // perform fast 'secondary' service call
            return "responseFromSecondary-" + id;
        }

    }

    public static class UnitTest {

        @Test
        public void testPrimary() {
            HystrixRequestContext context = HystrixRequestContext.initializeContext();
            try {
                ConfigurationManager.getConfigInstance().setProperty("primarySecondary.usePrimary", true);
                assertEquals("responseFromPrimary-20", new CommandFacadeWithPrimarySecondary(20).execute());
            } finally {
                context.shutdown();
                ConfigurationManager.getConfigInstance().clear();
            }
        }

        @Test
        public void testSecondary() {
            HystrixRequestContext context = HystrixRequestContext.initializeContext();
            try {
                ConfigurationManager.getConfigInstance().setProperty("primarySecondary.usePrimary", false);
                assertEquals("responseFromSecondary-20", new CommandFacadeWithPrimarySecondary(20).execute());
            } finally {
                context.shutdown();
                ConfigurationManager.getConfigInstance().clear();
            }
        }
    }
}
```

##### 9.5.3.5.20. Client Doesn't Perform Network Access
<a href="#menu" >目录</a>

When you wrap behavior that does not perform network access, but where latency is a concern or the threading overhead is unacceptable, you can set the executionIsolationStrategy property to ExecutionIsolationStrategy.SEMAPHORE and Hystrix will use semaphore isolation instead.

The following shows how to set this property as the default for a command via code (you can also override it via dynamic properties at runtime).
```java
public class CommandUsingSemaphoreIsolation extends HystrixCommand<String> {

    private final int id;

    public CommandUsingSemaphoreIsolation(int id) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                // since we're doing an in-memory cache lookup we choose SEMAPHORE isolation
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withExecutionIsolationStrategy(ExecutionIsolationStrategy.SEMAPHORE)));
        this.id = id;
    }

    @Override
    protected String run() {
        // a real implementation would retrieve data from in memory data structure
        return "ValueFromHashMap_" + id;
    }

}
```

##### 9.5.3.5.21. Get-Set-Get with Request Cache Invalidation
<a href="#menu" >目录</a>

If you are implementing a Get-Set-Get use case where the Get receives enough traffic that request caching is desired but sometimes a Set occurs on another command that should invalidate the cache within the same request, you can invalidate the cache by calling HystrixRequestCache.clear().

Here is an example implementation:
```java
public class CommandUsingRequestCacheInvalidation {

    /* represents a remote data store */
    private static volatile String prefixStoredOnRemoteDataStore = "ValueBeforeSet_";

    public static class GetterCommand extends HystrixCommand<String> {

        private static final HystrixCommandKey GETTER_KEY = HystrixCommandKey.Factory.asKey("GetterCommand");
        private final int id;

        public GetterCommand(int id) {
            super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GetSetGet"))
                    .andCommandKey(GETTER_KEY));
            this.id = id;
        }

        @Override
        protected String run() {
            return prefixStoredOnRemoteDataStore + id;
        }

        @Override
        protected String getCacheKey() {
            return String.valueOf(id);
        }

        /**
         * Allow the cache to be flushed for this object.
         * 
         * @param id
         *            argument that would normally be passed to the command
         */
        public static void flushCache(int id) {
            HystrixRequestCache.getInstance(GETTER_KEY,
                    HystrixConcurrencyStrategyDefault.getInstance()).clear(String.valueOf(id));
        }

    }

    public static class SetterCommand extends HystrixCommand<Void> {

        private final int id;
        private final String prefix;

        public SetterCommand(int id, String prefix) {
            super(HystrixCommandGroupKey.Factory.asKey("GetSetGet"));
            this.id = id;
            this.prefix = prefix;
        }

        @Override
        protected Void run() {
            // persist the value against the datastore
            prefixStoredOnRemoteDataStore = prefix;
            // flush the cache
            GetterCommand.flushCache(id);
            // no return value
            return null;
        }
    }
}
```

The unit test that confirms the behavior is:
```java
@Test
public void getGetSetGet() {
    HystrixRequestContext context = HystrixRequestContext.initializeContext();
    try {
        assertEquals("ValueBeforeSet_1", new GetterCommand(1).execute());
        GetterCommand commandAgainstCache = new GetterCommand(1);
        assertEquals("ValueBeforeSet_1", commandAgainstCache.execute());
        // confirm it executed against cache the second time
        assertTrue(commandAgainstCache.isResponseFromCache());
        // set the new value
        new SetterCommand(1, "ValueAfterSet_").execute();
        // fetch it again
        GetterCommand commandAfterSet = new GetterCommand(1);
        // the getter should return with the new prefix, not the value from cache
        assertFalse(commandAfterSet.isResponseFromCache());
        assertEquals("ValueAfterSet_1", commandAfterSet.execute());
    } finally {
        context.shutdown();
    }
}
}
```
##### 9.5.3.5.22. Get-Set-Get with Request Cache Invalidation
<a href="#menu" >目录</a>

Migrating a Library to Hystrix
When you are migrating an existing client library to use Hystrix, you should replace each of the “service methods" with a HystrixCommand.

The service methods should then forward calls to the HystrixCommand and not have any additional business logic in them.

Thus, before migration a service library may look like this:



After migrating, users of a library will be able to access the HystrixCommands directly or indirectly via the service facade that delegates to the HystrixCommands.





#### 9.5.3.6. 工作原理
<a href="#menu" >目录</a>




### 9.5.4. Spring Cloud 中使用Hystrix原理
<a href="#menu" >目录</a>

### 9.5.5. Hystrix监控


## 9.6. API网关服务
<a href="#menu" >目录</a>

### 9.6.1. zuul
<a href="#menu" >目录</a>

### 9.6.2. GateWay
<a href="#menu" >目录</a>



## 9.7. 分布式配置中心Config
<a href="#menu" >目录</a>

### 9.7.1. 基本使用

#### 9.7.1.1. 配置中心

**引入依赖**
```xml
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>
```

**SpringBoot配置文件**


这里有两种方式，一种是从git中读取配置文件，一种是从本地读取文件

* 从本地读取文件
```yml
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/lgjlife/micro-blog
          #Spring Cloud Config Server强制从远程存储库中提取
          force-pull: true
          search-paths: config-repo
        native:
          search-locations: /home/lgj/config-repo #classpath:config-repo #
  profiles:
    active: native
```

* 从git中读取配置文件
micro-blog为仓库名称，search-paths为仓库中的文件夹名称，不要以"/"开头。如果是多级，则为 aa/bb
```yml
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/lgjlife/micro-blog
          #Spring Cloud Config Server强制从远程存储库中提取
          username: xxx
          password: xxx
          force-pull: true
          search-paths: config-repo

```
**启动类添加注解@EnableConfigServer**
```java
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
```
**配置文件**
读取的配置文件的命名方式为 application-profile.yml/application-profile.properties

application和profile都是任意设置的,中间必须是"-"隔开。
比如本例中config-client.yml，config-client-test.yml,config-client-dev.yml


**运行启动,验证是否启动成功**
通过向 Config Server 发送 GET 请求以直接的方式获取， 可用下面的链接形式。
* 不带{label}分支信息，默认访问 master 分支， 可使用：
    * /{application}-{profile}.yml
    * /{application}-{profile}.properties
* 带{label}分支信息， 可使用：
    * /{label}/{application}-{profile}.yml
    * /{application}/{profile} [/{label}]
    * /{label}/{application}-{profile}.properties

比如要访问上面的配置文件,config-client-dev.yml
```yml
name: 123456adsfd3143
data: 7890fdff3413
server:
  port: 8004
```
使用http://localhost:9001/config-client/dev访问，可以看到返回的是JSON格式的数据，说明Config Server配置成功

```json
{"name":"config-client","profiles":["dev"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:/home/lgj/config-repo/config-client-dev.yml","source":{"name":"123456adsfd3143","data":"7890fdff3413","server.port":8004}},{"name":"file:/home/lgj/config-repo/config-client.yml","source":{"name":"default1"}}]}
```
使用http://localhost:9001/config-client-dev.yml访问,显示的是实际的yml结构配置
```yml
data: 7890fdff3413
name: 123456adsfd3143
server:
  port: 8004
```

#### 9.7.1.2. bootstrap.yml与application.yml区别
说明：其实yml和properties文件是一样的原理，主要是说明application和bootstrap的加载顺序。且一个项目上要么yml或者properties，二选一的存在

**执行顺序**
* bootstrap.yml（bootstrap.properties）用来程序引导时执行，应用于更加早期配置信息读取，如可以使用来配置application.yml中使用到参数等
* application.yml（application.properties) 应用程序特有配置信息，可以用来配置后续各个模块中需使用的公共参数等。
* bootstrap.yml 先于 application.yml 加载
* 如果两个配置文件都有相同的配置,application.yml将会覆盖bootstrap.yml的值

**典型的应用场景如下**
* 当使用 Spring Cloud Config Server 的时候，你应该在 bootstrap.yml 里面指定 spring.application.name 和 spring.cloud.config.server.git.uri和一些加密/解密的信息
技术上，bootstrap.yml 是被一个父级的 Spring ApplicationContext 加载的。这个父级的 Spring ApplicationContext是先加载的，在加载application.yml 的 ApplicationContext之前。

为何需要把 config server 的信息放在 bootstrap.yml 里？
当使用Spring Cloud的时候，配置信息一般是从config server加载的，为了取得配置信息（比如密码等），你需要一些提早的或引导配置。因此，把 config server 信息放在 bootstrap.yml，用来加载真正需要的配置信息。

**高级使用场景**

* 启动上下文
Spring Cloud会创建一个`Bootstrap Context`，作为Spring应用的`Application Context`的父上下文。初始化的时候，`Bootstrap Context`负责从外部源加载配置属性并解析配置。这两个上下文共享一个从外部获取的`Environment`。`Bootstrap`属性有高优先级，默认情况下，它们不会被本地配置覆盖。 `Bootstrap context`和`Application Context`有着不同的约定，所以新增了一个`bootstrap.yml`文件，而不是使用`application.yml` (或者`application.properties`)。保证`Bootstrap Context`和`Application Context`配置的分离。下面是一个例子： **bootstrap.yml**

```yml
spring:
  application:
    name: foo
  cloud:
    config:
      uri: ${SPRING_CONFIG_URI:http://localhost:8888}
```
推荐在`bootstrap.yml` or `application.yml`里面配置`spring.application.name`. 你可以通过设置`spring.cloud.bootstrap.enabled=false`来禁用`bootstrap`。

* 应用上下文层次结构
如果你通过`SpringApplication`或者`SpringApplicationBuilder`创建一个`Application Context`,那么会为spring应用的`Application Context`创建父上下文`Bootstrap Context`。在Spring里有个特性，子上下文会继承父类的`property sources` and `profiles` ，所以`main application context` 相对于没有使用Spring Cloud Config，会新增额外的`property sources`。额外的`property sources`有：

“bootstrap" : 如果在Bootstrap Context扫描到PropertySourceLocator并且有属性，则会添加到CompositePropertySource。Spirng Cloud Config就是通过这种方式来添加的属性的，详细看源码ConfigServicePropertySourceLocator`。下面也也有一个例子自定义的例子。
“applicationConfig: [classpath:bootstrap.yml]" ，（如果有spring.profiles.active=production则例如 applicationConfig: [classpath:/bootstrap.yml]#production）: 如果你使用bootstrap.yml来配置Bootstrap Context，他比application.yml优先级要低。它将添加到子上下文，作为Spring Boot应用程序的一部分。下文有介绍。
由于优先级规则，Bootstrap Context不包含从bootstrap.yml来的数据，但是可以用它作为默认设置。

你可以很容易的扩展任何你建立的上下文层次，可以使用它提供的接口，或者使用SpringApplicationBuilder包含的方法（parent()，child()，sibling()）。Bootstrap Context将是最高级别的父类。扩展的每一个Context都有有自己的bootstrap property source（有可能是空的）。扩展的每一个Context都有不同spring.application.name。同一层层次的父子上下文原则上也有一有不同的名称，因此，也会有不同的Config Server配置。子上下文的属性在相同名字的情况下将覆盖父上下文的属性。

注意SpringApplicationBuilder允许共享Environment到所有层次，但是不是默认的。因此，同级的兄弟上下文不在和父类共享一些东西的时候不一定有相同的profiles或者property sources。

* 修改Bootstrap属性配置
源码位置BootstrapApplicationListener。

```java
String configName = environment.resolvePlaceholders("${spring.cloud.bootstrap.name:bootstrap}");

String configLocation = environment.resolvePlaceholders("${spring.cloud.bootstrap.location:}");

Map<String, Object> bootstrapMap = new HashMap<>();bootstrapMap.put("spring.config.name",configName);
if(StringUtils.hasText(configLocation)){
    bootstrapMap.put("spring.config.location", configLocation);
}
```
bootstrap.yml是由spring.cloud.bootstrap.name（默认:"bootstrap"）或者spring.cloud.bootstrap.location（默认空）。这些属性行为与spring.config.*类似，通过它的Environment来配置引导ApplicationContext。如果有一个激活的profile（来源于spring.profiles.active或者Environment的Api构建），例如bootstrap-development.properties 就是配置了profile为development的配置文件.

* 覆盖远程属性
property sources被bootstrap context 添加到应用通常通过远程的方式，比如"Config Server"。默认情况下，本地的配置文件不能覆盖远程配置，但是可以通过启动命令行参数来覆盖远程配置。如果需要本地文件覆盖远程文件，需要在远程配置文件里设置授权 
spring.cloud.config.allowOverride=true（这个配置不能在本地被设置）。一旦设置了这个权限，你可以配置更加细粒度的配置来配置覆盖的方式，

比如： 
```
- spring.cloud.config.overrideNone=true 覆盖任何本地属性 
- spring.cloud.config.overrideSystemProperties=false 仅仅系统属性和环境变量 
```
源文件见PropertySourceBootstrapProperties

* 自定义启动配置
bootstrap context是依赖/META-INF/spring.factories文件里面的org.springframework.cloud.bootstrap.BootstrapConfiguration条目下面，通过逗号分隔的Spring  @Configuration类来建立的配置。任何main application context需要的自动注入的Bean可以在这里通过这种方式来获取。这也是ApplicationContextInitializer建立@Bean的方式。可以通过@Order来更改初始化序列，默认是"last"。

```yml
 24. spring-cloud-context-1.1.1.RELEASE.jar
 25. spring.factories
 26. AutoConfiguration
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration,\
org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration

 27. Application Listeners
org.springframework.context.ApplicationListener=\
org.springframework.cloud.bootstrap.BootstrapApplicationListener,\
org.springframework.cloud.context.restart.RestartListener

 28. Bootstrap components
org.springframework.cloud.bootstrap.BootstrapConfiguration=\
org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration,\
org.springframework.cloud.bootstrap.encrypt.EncryptionBootstrapConfiguration,\
org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration,\
org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration
```

警告 
小心，你添加的自定义BootstrapConfiguration类没有错误的@ComponentScanned到你的主应用上下文，他们可能是不需要的。使用一个另外的包不被@ComponentScan或者@SpringBootApplication注解覆盖到。


bootstrap context通过spring.factories配置的类初始化的所有的Bean都会在SpingApplicatin启动前加入到它的上下文里去。

自定义引导配置来源：Bootstrap Property Sources
默认的`property source`添加额外的配置是通过配置服务（Config Server），你也可以自定义添加`property source`通过实现`PropertySourceLocator`接口来添加。你可以使用它加配置属性从不同的服务、数据库、或者其他。

下面是一个自定义的例子:
```java
@Configuration
public class CustomPropertySourceLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate(Environment environment) {
        return new MapPropertySource("customProperty",
                Collections.<String, Object>singletonMap("property.from.sample.custom.source", "worked as intended"));
    }
}
```

Environment被ApplicationContext建立，并传入property sources（可能不同个profile有不同的属性），所以，你可以从Environment寻找找一些特别的属性。比如spring.application.name，它是默认的Config Server property source。

如果你建立了一个jar包，里面添加了一个META-INF/spring.factories文件：

org.springframework.cloud.bootstrap.BootstrapConfiguration=sample.custom.CustomPropertySourceLocator
那么，"customProperty“的PropertySource将会被包含到应用。


#### 9.7.1.3. 客户端配置

**引入依赖**

```xml
 <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

**yml配置文件**
```yml
 29. 必须放在bootstrap.yml中
spring:
  application:
    name: config-client
   cloud config 配置中心
  cloud:
    config:
      #config server 地址
      uri: http://localhost:9001
      #如果服务无法连接到配置服务器，则可能希望启动服务失败
      fail-fast: true
      label: master
   指定profiles
  profiles:
    active: dev

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8001/eureka/

```

**java代码中使用**

使用@Value注解引入，由于上面设置 fail-fast: true，因此注入失败时将会报错，服务无法启动。
```java
@Slf4j
@RefreshScope // curl -X POST http://localhost:8004/actuator/refresh
@RestController
@RequestMapping("/config")
public class ConfigController {


    @Value("${data}")
    private String data;

    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    public String name(){
        log.info("name = " + name );
        return name;
    }

    @RequestMapping("/data")
    public String data(){
        log.info("data = " + data );
        return data;
    }
}
```

#### 9.7.1.4. 刷新配置
有一种场景需要更改配置而不需要重启服务。

* 客户端需要进行相关的配置

必须要引入actuator依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

默认端点是不开放的，需要使能打开
```yml
management:
  endpoints:
    web:
      exposure:
        include: "*"
```

向客户端发送post请求http://localhost:8004/actuator/refresh即可刷新配置
```
curl -X POST http://localhost:8004/actuator/refresh
```


### 9.7.2. 原理说明
<a href="#menu" >目录</a>

### 9.7.3. 更多使用方式
<a href="#menu" >目录</a>

## 9.8. 消息总线bus
<a href="#menu" >目录</a>

Spring Cloud Bus是用轻量的消息代理将分布式的节点连接起来,可以用于广播配置文件的更改或者服务的监控管理。一个关键的思想就是,消息总线可以为微服务做监控,也可以实现应用程序之间相互通信。 Spring Cloud Bus可选的消息代理线线泡括RabbitMQ、 AMQP和Kaka等。
     
为什么需要用 Spring Cloud Bus去刷新配置呢?
如果有几十个微服务,而每一个服务又是多实例,当更改配置时,需要重新启动多个微服务实例,会非常麻烦。 Spring Cloud Bus的一个功能就是让这个过程变得简单,当远程Git仓库的配置更改后,只需要向某一个微服务实例发送一个Post请求,通过消息组件通知其他微服务实例重新拉取配置文件

![](https://springcloud-oss.oss-cn-shanghai.aliyuncs.com/chapter8/configbus1.jpg)

根据此图我们可以看出利用Spring Cloud Bus做配置更新的步骤:
1. 提交代码触发post给客户端A发送bus/refresh
2. 客户端A接收到请求从Server端更新配置并且发送给Spring Cloud Bus
3. Spring Cloud bus接到消息并通知给其它客户端
4. 其它客户端接收到通知，请求Server端获取最新配置
5. 全部客户端均获取到最新的配置

### 9.8.1. 消息代理
消息代理 (Message Broker) 是一种消息验证、 传输、 路由的架构模式。 它在应用程序之间起到通信调度并最小化应用之间的依赖的作用， 使得应用程序可以高效地解耦通信过程。 消息代理是一个中间件产品， 它的核心是一个消息的路由程序， 用来实现接收和分发消息， 并根据设定好的消息处理流来转发给正确的应用。 它包括独立的通信和消息传递协议， 能够实现组织内部和组织间的网络通信。 设计代理的目的就是为了能够从应用程序中传入消息， 并执行一些特别的操作， 下面这些是在企业应用中， 我们经常需要使用消息代理的场景：
* 将消息路由到一个或多个目的地
* 消息转化为其他的表现方式。
* 执行消息的聚集、 消息的分解， 并将结果发送到它们的目的地， 然后重新组合响应返回给消息用户。
* 调用Web服务来检索数据。
* 响应事件或错误。
* 使用发布－订阅模式来提供内容或基千主题的消息路由。

当前版本的Spring Cloud Bus仅支待两款中间件产品： RabbitMQ和Kafka

## 9.9. 消息驱动的微服务Stream
<a href="#menu" >目录</a>

## 9.10. 分布式服务跟踪Sleuth
<a href="#menu" >目录</a>

### 9.10.1. 基本使用 

pom配置
```xml
<!--  sleuth -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
```

**配置文件**
因为数据需要发送到zipkin进行可视化查看，所以要配置zipkin的地址
```yml
spring:
  zipkin:
     ZIPKINF地址
    base-url: http://localhost:9411
    sleuth:
      sampler:
        percentage: 1.0
```

**zipkin可视化查看**
[下载zipkin](https://github.com/openzipkin/zipkin/tree/master/zipkin-server)
可以直接下载jar文件，默认端口是9411。
访问：http://localhost:9411

**数据说明**
消费者发起一个请求，输出日志

```
//消费者
2019-08-23 02:03:57.657  INFO [eureka-consumer-feign,c920e0c9f8dbb546,c920e0c9f8dbb546,false] 6682 --- [nio-8004-exec-5] c.s.e.controller.ClientController        : 客户端访问
//服务提供者
2019-08-23 02:03:57.667  INFO [provider,c920e0c9f8dbb546,5259cbee0117b850,false] 6558 --- [nio-8002-exec-3] c.s.e.provider.ProviderController        : THis is provider!,[null]

```
[eureka-consumer-feign,c920e0c9f8dbb546,c920e0c9f8dbb546,false]
[provider,c920e0c9f8dbb546,5259cbee0117b850,false]
* 第一个值： eureka-consumer-feign/provider,它记录了应用的名称，也就是spring.application.name参数配置的属性。
* 第二个值： c920e0c9f8dbb546,Spring Cloud Sleuth生成的一个ID, 称为Trace ID,它用来标识一条请求链路。 一条请求链路中包含一个TraceID, 多个SpanID。
* 第三个值： 5259cbee0117b850, Spring Cloud Sleuth生成的另外一个 ID, 称为SpanID, 它表示一个基本的工作单元， 比如发送一个HTTP请求。
* 第四个值： false, 表示是否要将该信息 输出到Zipkin等服务中来收集和展示 。

上面四个值中的**TraceID**和**SpanID**是Spring Cloud Sleuth实现分布式服务跟踪的核心。 在一次服务请求链路的调用过程中， 会保待并传递同一个**Trace ID**, 从而将整个分布于不同微服务进程中的请求跟踪 信息串联起来。 以上面输出内容为例， trace-1 和trace-2同属于一个前端服务请求来源，所以它们的TraceID是相同的，处于同一条请求链路中


### 9.10.2. 跟踪原理

这里只讲feign和Sleuth的实现原理，其他方式基本原理上差不多。

#### 9.10.2.1. 基本实现原理

在了解其实现原理之前需要思考的问题是，假如消费者使用的Feign声明式服务调用，sleuth是如何接入的，是如何生成各种ID插入请求的？

在使用feign进行调用时，最终执行调用的是feign包下的execute(Request var1, Options var2)方法执行。
Feign使用其内部静态实现类Default进行具体的处理

```java
package feign;

public interface Client {
    Response execute(Request var1, Options var2) throws IOException;
    public static class Default implements Client {
        public Response execute(Request request, Options options) throws IOException {
            HttpURLConnection connection = this.convertAndSend(request, options);
            return this.convertResponse(connection, request);
        }
    }
}
```
因此我们只需要继承或者使用装饰模式即可对Request进行扩展，也就是添加各种ID。

```java
//使用继承模式
public class SleuthClient implements Client.Default {

    
    public Response execute(Request request, Options options) throws IOException {
        request.setHeader("X-B3-Traceld",1234);
        request.setHeader("X-B3-Spanld",1234);
        treturn super.client(request,options);        
    }
}

//使用装饰模式
public class SleuthClient implements Client {

    private Client client;

    public SleuthClient(Client client){
        this.client = client;
    }

    public Response execute(Request request, Options options) throws IOException {
        request.setHeader("X-B3-Traceld",1234);
        request.setHeader("X-B3-Spanld",1234);
        treturn this.client(request,options);        
    }
}

main(){
    //使用继承模式
    SleuthClient sleuthClient = new SleuthClient();
    sleuthClient.excute(request,opts);

    //使用装饰模式
    Client.Default default = new Client.Default();
    SleuthClient sleuthClient = new SleuthClient(default);
    sleuthClient.excute(request,opts);
}
```
----

#### 9.10.2.2. 支持的组件
Spring Cloud Sleuth可以追踪10种类型的组件，async、Hystrix，messaging，websocket，rxjava，scheduling，web（Spring MVC Controller，Servlet），webclient（Spring RestTemplate）、Feign、Zuul。下面是常用的八种类型。

![Sleuth支持的组件](pic/spring/springcloud/sleuth-instructment.png)
**Scheduled**
原理是AOP处理Scheduled注解TraceSchedulingAspect可以带出，只要是在IOC容器中的Bean带有@Scheduled注解的方法的调用都会被sleuth处理。

**Messaging**
原理是基于spring messaging的ChannelInterceptor。
TraceChannelInterceptor/IntegrationTraceChannelInterceptor 
MessagingSpanTextMapExtractor和MessagingSpanTextMapInjector

**Hystrix**
原理是使用HystrixPlugins添加trace相关的plugin，自定义了一个HystrixConcurrencyStrategy的实现SleuthHystrixConcurrencyStrategy 
具体参考TraceCommand和SleuthHystrixConcurrencyStrategy

**Feign**
原理是实现了两个Feign Client实例，一个不带Ribbon TraceFeignClient、一个带Ribbon，TraceLoadBalancerFeignClient 
TraceFeignAspect AOP里面的逻辑是，有地方想获取Client实例，就拦截返回自己封装的Client。

**Async**
@Async注解和ThreadPoolTaskExecutor下面的类 
具体参看TraceAsyncAspect

**RestTempate**
原理是spring client的Interceptor机制。具体参看TraceRestTemplateInterceptor。

**Zuul**
原理是zuul的Filter机制，ZuulFilter 
实现了三个TracePreZuulFilter、TracePostZuulFilter两个Filter。

#### 9.10.2.3. 一些基本概念

* 为了实现请求跟踪， 当请求发送到分布式系统的入口端点时， 只需要服务跟踪框架为该请求创建一个唯一的跟踪标识， 同时在分布式系统内部流转的时候， 框架始终保待传递 该唯一标识， 直到返回给请求方为止， 这个唯一 标识就是前文中提到的TraceID。 通过TraceID 的记录， 我们就能将所有请求过程的日志关联起来。
* 为了统计各处理单元的时间延迟， 当请求到达各个服务组件时， 或是处理逻辑到达某个状态时， 也通过一个唯一标识来标记它的开始、 具体过程以及结束， 该标识就是前文中提到的SpanID。 对于每个Span来说， 它必须有开始和结束 两个节点， 通过记录开始 Span和结束Span的时间戳，就能统计出该Span的时间延迟，除了时间戳记录之外， 它还可以包含一些其他元数据， 比如事件名称、 请求信息等


* cs - Client Sent -客户端发起一个请求，这个annotion描述了这个span的开始
* sr - Server Received -服务端获得请求并准备开始处理它，如果将其sr减去cs时间戳便可得到网络延迟
* ss - Server Sent -注解表明请求处理的完成(当请求返回客户端)，如果ss减去sr时间戳便可得到服务端需要的处理请求时间
* cr - Client Received -表明span的结束，客户端成功接收到服务端的回复，如果cr减去cs时间戳便可得到客户端从服务端获取回复的所有所需时间

在请求发送到下一个应用之前， Sleuth 会在该请求的Header中增加实现跟踪需要的重要信息，主要有下面这几个
* X-B3-Traceld: 一条请求链路 (Trace) 的唯一 标识， 必需的值。
* X-B3-Spanld: 一个工作单元 (Span) 的唯一 标识， 必需的值。
* X-B3-ParentSpanld: 标识当前工作单元所属的上一个工作单元 ， Root Span C 请求链路的第一个工作单元） 的该值为空。
* X-B3-Sampled: 是否被抽样输出的标志， 1 表示需要被输出 ， 0 表示不需要被输出
* X-B3-Flags: 用于Debug,为1代表采样

```java
package brave.propagation;
public final class B3Propagation<K> implements Propagation<K> {
    static final String TRACE_ID_NAME = "X-B3-TraceId";
    static final String SPAN_ID_NAME = "X-B3-SpanId";
    static final String PARENT_SPAN_ID_NAME = "X-B3-ParentSpanId";
    static final String SAMPLED_NAME = "X-B3-Sampled";
    static final String FLAGS_NAME = "X-B3-Flags";
}
```

#### 9.10.2.4. zipkin
Zipkin是Twitter的一个开源项目，我们可以使用它来收集各个服务器上请求链路的跟踪数据，并通过它提供的API接口来辅助查询跟踪数据以分布式系统的监控程序，通过UI组件帮助我们及时发现系统中出现的延迟升高问题以及系统性能瓶颈根源。
**基本概念**
下面展示Zipkin的基础架构，它主要由4个核心组件构成

![](https://img-blog.csdn.net/20181010190929921?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

* Collector（收集器组件）：主要负责收集外部系统跟踪信息，转化为Zipkin内部的Span格式。
* Storage（存储组件）：主要负责收到的跟踪信息的存储，默认为存储在内存中，同时支持存储到Mysql、Cassandra以及ElasticSearch。
* API（Query）： 负责查询Storage中存储的数据，提供简单的JSON API获取数据，主要提供给web UI使用。
* Web UI（展示组件）：提供简单的web界面，方便进行跟踪信息的查看以及查询，同时进行相关的分析。

Instrumented Client 和Instrumented Server，是指分布式架构中使用了Trace工具的两个应用，Client会调用Server提供的服务，两者都会向Zipkin上报Trace相关信息。在Client 和 Server通过Transport上报Trace信息后，由Zipkin的Collector模块接收，并由Storage模块将数据存储在对应的存储介质中，然后Zipkin提供API供UI界面查询Trace跟踪信息。Non-Instrumented Server，指的是未使用Trace工具的Server，显然它不会上报Trace信息。

**数据模型**
我们先来看看 Zipkin中关于跟踪信息的 一些基础概念。 由于 Zipkin的实现借鉴了Google的Dapper, 所以它们有着类似的核心术语， 主要有下面几项内容。

* **Span:** 它代表了一个基础的工作单元。 我们以 HTTP请求为例，一次完整的请求过程在客户端和服务端都会产生多个不同的事件状态（比如下面所说的4个核心Annotation 所标识的不同阶段）。对于同一个请求来说， 它们属于一个工作单元， 所以同一 HTTP 请求过程中的 4 个 Annotation 同属千一个 Span。每一个不同的工作单元都通过一个 64 位的 ID 来唯一标识， 称为 Span ID。 另外， 在工作单元中还存储了一个用来串联其他工作单元的 ID, 它也通过一个 64 位的 ID 来唯一标识， 称为Trace ID。 在同一条请求链路中的不同工作单元都会有不同的 Span ID, 但是它们的Trace ID 是相同的， 所以通过 Trace ID 可以将一次请求中依赖的所有依赖请求串联起来形成请求链路。 除了这两个核心的 ID 之外， Span 中还存储了一些其他信息，比如，描述信息、事件时间戳、Annotation 的键值对属性、上一级工作单元的 Span ID等。
* **Trace:** 它是由 一系列具有相同 Trace ID 的 Span 串联形成的一个树状结构。 在复杂的分布式系统中， 每一个外部请求通常都会产生一个复杂的树状结构的 Trace。
* **Annotation:** 它用来及时地记录一个事件的存在。我们可以把 Annotation 理解为一个包含有时间戳的事件标签， 对千一个 HTTP 请求来说， 在 Sleuth 中定义了下面 4 个核心 Annotation 来标识一个请求的开始和结束。
    * cs (Client Send): 该 Annotation 用来记录客户端发起了一个请求， 同时它也标识了这个 HTTP 请求的开始。
    * sr (Server Received): 该 Annotation 用来记录服务端接收到了请求， 并准备开始处理它。通过计算 sr 与 cs 两个Annotation 的时间戳之差，我们可以得到当前 HTTP请求的网络延迟。
    * ss (Server Send): 该 Annotation 用来记录服务端处理完请求后准备发送请求响应信息。 通过计算 ss 与 sr 两个 Annotation 的时间戳之差， 我们可以得到当前服务端处理请求的时间消耗。
    * cr (Client Received): 该 Annotation 用来记录客户端接收到服务端的回复， 同时它也标识了这个 HTTP 请求的结束。 通过计算 er 与 cs 两个 Annotation 的时间戳之差， 我们可以得到该 HTTP 请求从客户端发起到接收服务端响应的总时间消耗。
* **BinaryAnnotation:** 它用来对跟踪信息添加一些额外的补充说明， 一般以键值对的方式出现。 比如， 在记录 HTTP 请求接收后执行具体业务逻辑时， 此时并没有默认的Annotation 来标识该事件状态， 但是有 BinaryAnnotation 信息对其进行补充。


**追踪流程**
流程图如下：
![](https://img-blog.csdn.net/20181010190939687?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

由上图可以看出，用户的应用发起Http Get（User Request）请求（请求路径/trace），经过spring cloud Sleuth的Trace框架（Trace Instrumentation）拦截，并依次经过如下步骤，最后记录Trace信息到Zipkin中：

记录tags信息；
1. 将当前调用链的Trace信息记录到Http Headers中；
2. 记录当前调用的时间戳（timestamp）；
3. 发送http请求，并携带Trace相关的Header，如TraceId:11aa， SpanId:22bb；
4. 调用结束后，记录当次调用所花的时间（duration）；
5. 将步骤1-5，汇总成一个Span（最小的Trace单元），上报该Span信息给Zipkin Collector。

**sletuh+streaming+zipkin**
这种方式通过spring cloud streaming将追踪信息发送到zipkin。spring cloud streaming目前只支持kafka和rabbitmq。Zipkin Collector从消息中间件中读取数据并存储：
![](https://img-blog.csdn.net/20181010191040623?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

#### 9.10.2.5. 调用过程

![Sleuth支持的组件](pic/spring/springcloud/sleuth-request.png)

```
消费者feign声明式调用--->中间处理--->org.springframework.cloud.openfeign.ribbon.FeignLoadBalancer.execute()--->org.springframework.cloud.openfeign.ribbon.execute()--->org.springframework.cloud.sleuth.instrument.web.client.feign.LazyTracingFeignClient.execute()--->org.springframework.cloud.sleuth.instrument.web.client.feign.TracingFeignClient.execute()--->feign.Client.Default.execute()
```
其中在TracingFeignClient.execute()处添加了Headers
```java
//TracingFeignClient.execute(),handleSend执行修改 headers处理
Span span = this.handleSend(headers, request, (Span)null);
//org.springframework.cloud.sleuth.instrument.web.client.feign.TracingFeignClient
Span handleSend(Map<String, Collection<String>> headers, Request request, Span clientSpan) {
    return clientSpan != null ? this.handler.handleSend(this.injector, headers, request, clientSpan) : this.handler.handleSend(this.injector, headers, request);
}
//brave.http.HttpClientHandler。这是io.zipkin.brave下的类
public <C> Span handleSend(Injector<C> injector, C carrier, Req request, Span span) {
    injector.inject(span.context(), carrier);
    return this.handleStart(request, span);
} 
//B3Propagation类下的内部类
static final class B3Injector<C, K> implements Injector<C> {
final B3Propagation<K> propagation;
final Setter<C, K> setter;

B3Injector(B3Propagation<K> propagation, Setter<C, K> setter) {
    this.propagation = propagation;
    this.setter = setter;
}

public void inject(TraceContext traceContext, C carrier) {
    this.setter.put(carrier, this.propagation.traceIdKey, traceContext.traceIdString());
    this.setter.put(carrier, this.propagation.spanIdKey, traceContext.spanIdString());
    String parentId = traceContext.parentIdString();
    if (parentId != null) {
        this.setter.put(carrier, this.propagation.parentSpanIdKey, parentId);
    }

    if (traceContext.debug()) {
        this.setter.put(carrier, this.propagation.debugKey, "1");
    } else if (traceContext.sampled() != null) {
        this.setter.put(carrier, this.propagation.sampledKey, traceContext.sampled() ? "1" : "0");
    }

}
}
```







# 10. 单元测试
<a href="#menu" >目录</a>

## 10.1. Junit
<a href="#menu" >目录</a>

### 10.1.1. 概述
<a href="#menu" >目录</a>

所谓单元测试是测试应用程序的功能是否能够按需要正常运行，并且确保是在开发人员的水平上，单元测试生成图片。单元测试是一个对单一实体（类或方法）的测试。单元测试是每个软件公司提高产品质量、满足客户需求的重要环节。

**单元测试可以由两种方式完成**
* 人工测试	
    * 手动执行测试用例并不借助任何工具的测试被称为人工测试。
    * 消耗时间并单调：由于测试用例是由人力资源执行，所以非常缓慢并乏味。
    * 人力资源上投资巨大：由于测试用例需要人工执行，所以在人工测试上需要更多的试验员。
    * 可信度较低：人工测试可信度较低是可能由于人工错误导致测试运行时不够精确。
    * 非程式化：编写复杂并可以获取隐藏的信息的测试的话，这样的程序无法编写。
* 自动测试
    * 借助工具支持并且利用自动工具执行用例被称为自动测试。
    * 快速自动化运行测试用例时明显比人力资源快。 
    * 人力资源投资较少：测试用例由自动工具执行，所以在自动测试中需要较少的试验员。
    * 可信度更高：自动化测试每次运行时精确地执行相同的操作。
    * 程式化：试验员可以编写复杂的测试来显示隐藏信息。

**什么是 JUnit？**
JUnit 是一个 Java 编程语言的单元测试框架。JUnit 在测试驱动的开发方面有很重要的发展，是起源于 JUnit 的一个统称为 xUnit 的单元测试框架之一。

JUnit 促进了“先测试后编码"的理念，强调建立测试数据的一段代码，可以先测试，然后再应用。这个方法就好比“测试一点，编码一点，测试一点，编码一点……"，增加了程序员的产量和程序的稳定性，可以减少程序员的压力和花费在排错上的时间。

* 特点：
    * JUnit 是一个开放的资源框架，用于编写和运行测试。
    * 提供注释来识别测试方法。
    * 提供断言来测试预期结果。
    * 提供测试运行来运行测试。
    * JUnit 测试允许你编写代码更快，并能提高质量。
    * JUnit 优雅简洁。没那么复杂，花费时间较少。
    * JUnit 测试可以自动运行并且检查自身结果并提供即时反馈。所以也没有必要人工梳理测试结果的报告。
    * JUnit 测试可以被组织为测试套件，包含测试用例，甚至其他的测试套件。
    * JUnit 在一个条中显示进度。如果运行良好则是绿色；如果运行失败，则变成红色。

**什么是一个单元测试用例?**
* 单元测试用例是一部分代码，可以确保另一端代码（方法）按预期工作。为了迅速达到预期的结果，就需要测试框架。JUnit 是 java 编程语言理想的单元测试框架。
* 一个正式的编写好的单元测试用例的特点是：已知输入和预期输出，即在测试执行前就已知。已知输入需要测试的先决条件，预期输出需要测试后置条件。
* 每一项需求至少需要两个单元测试用例：一个正检验，一个负检验。如果一个需求有子需求，每一个子需求必须至少有正检验和负检验两个测试用例。


### 10.1.2. JUnit 中的重要的 API
<a href="#menu" >目录</a>

JUnit 中的最重要的程序包是 junit.framework 它包含了所有的核心类。一些重要的类列示如下：

* **Assert**	
    * assert 方法的集合
    * void assertEquals(boolean expected, boolean actual) 
        * 检查两个变量或者等式是否平衡
    * void assertFalse(boolean condition) 
        * 检查条件是假的
    * void assertNotNull(Object object) 
        * 检查对象不是空的
    * void assertNull(Object object) 
        * 检查对象是空的
    * void assertTrue(boolean condition) 
        * 检查条件为真
    * void fail() 
        * 在没有报告的情况下使测试不通过
* **TestCase**	
    * 一个定义了运行多重测试的固定装置
    * int countTestCases()
        * 为被run(TestResult result) 执行的测试案例计数
    * TestResult createResult()
        * 创建一个默认的 TestResult 对象
    * String getName()
        * 获取 TestCase 的名称
    * TestResult run()
        * 一个运行这个测试的方便的方法，收集由TestResult 对象产生的结果
    * void run(TestResult result)
        * 在 TestResult 中运行测试案例并收集结果
    * void setName(String name)
        * 设置 TestCase 的名称
    * void setUp()
        * 创建固定装置，例如，打开一个网络连接
    * void tearDown()
        * 拆除固定装置，例如，关闭一个网络连接
    * String toString()
        * 返回测试案例的一个字符串表示
* **TestResult**
	* TestResult 集合了执行测试样例的所有结果
    * void addError(Test test, Throwable t)
        * 在错误列表中加入一个错误
    * void addFailure(Test test, AssertionFailedError t)
        * 在失败列表中加入一个失败
    * void endTest(Test test)
        * 显示测试被编译的这个结果
    * int errorCount()
        * 获取被检测出错误的数量
    * Enumeration errors()
        * 返回错误的详细信息
    * int failureCount()
        * 获取被检测出的失败的数量
    * void run(TestCase test)
        * 运行 TestCase
    * int int runCount()
        * 获得运行测试的数量
    * void startTest(Test test)
        * 声明一个测试即将开始
    * void stop()
        * 标明测试必须停止

* **TestSuite**	
    * TestSuite TestSuite 类是测试的组成部分。它运行了很多的测试案例
    * void addTest(Test test) 
        * 在套中加入测试。
    * void addTestSuite(Class<? extends TestCase> testClass)
        * 将已经给定的类中的测试加到套中。
    * int countTestCases()
        * 对这个测试即将运行的测试案例进行计数。
    * String getName()
        * 返回套的名称。
    * void run(TestResult result)
        * 在 TestResult 中运行测试并收集结果。
    * void setName(String name)
        * 设置套的名称。
    * Test testAt(int index)
        * 在给定的目录中返回测试。
    * int testCount()
        * 返回套中测试的数量。
    * static Test warning(String message)
        * 返回会失败的测试并且记录警告信息。

### 10.1.3. 常用注解
<a href="#menu" >目录</a>

**@Test**
@Test注解的public void方法将会被当做测试用例
JUnit每次都会创建一个新的测试实例，然后调用@Test注解方法
任何异常的抛出都会认为测试失败
@Test注解提供2个参数：
* “expected"，定义测试方法应该抛出的异常，如果测试方法没有抛出异常或者抛出了一个不同的异常，测试失败
* “timeout"，如果测试运行时间长于该定义时间，测试失败（单位为毫秒）

**@Ignore**
对包含测试类的类或@Test注解方法使用@Ignore注解将使被注解的类或方法不会被当做测试执行
JUnit执行结果中会报告被忽略的测试数

**@Before**
使用@Before注解一个public void 方法会使该方法在@Test注解方法被执行前执行（那么就可以在该方法中创建相同的对象）
父类的@Before注解方法会在子类的@Before注解方法执行前执行

**@BeforeClass**
使用注解一个public static void 方法，并且该方法不带任何参数，会使该方法在所有测试方法被执行前执行一次，并且只执行一次
父类的@BeforeClass注解方法会在子类的@BeforeClass注解方法执行前执行

**@After**
使用@After注解一个public void方法会使该方法在@Test注解方法执行后被执行
即使在@Before注解方法、@Test注解方法中抛出了异常，所有的@After注解方法依然会被执行
父类中的@After注解方法会在子类@After注解方法执行后被执行

在 before() 方法和 after() 方法之间，执行每一个测试用例。

**@BeforeClass**
如果在@BeforeClass注解方法中分配了代价高昂的额外的资源，那么在测试类中的所有测试方法执行完后，需要释放分配的资源。
使用@AfterClass注解一个public static void方法会使该方法在测试类中的所有测试方法执行完后被执行
即使在@BeforeClass注解方法中抛出了异常，所有的@AfterClass注解方法依然会被执行
父类中的@AfterClass注解方法会在子类@AfterClass注解方法执行后被执行

### 10.1.4. 套件测试
<a href="#menu" >目录</a>

```java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestJunit1.class,
   TestJunit2.class
})
public class JunitTestSuite {   
}  
```

只要运行JunitTestSuite类,那么TestJunit1和TestJunit2中的测试方法也会云运行.

或者使用以下方式运行
```java
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JunitTestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  
```

## 10.2. TestNG测试
<a href="#menu" >目录</a>


### 10.2.1. 概述
<a href="#menu" >目录</a>

**JUnit缺点：**
* 最初的设计，使用于单元测试，现在只用于各种测试。
* 不能依赖测试
* 配置控制欠佳(安装/拆卸)
* 侵入性(强制扩展类，并以某种方式命名方法)
* 静态编程模型(不必要的重新编译)
* 不适合管理复杂项目应用，JUnit复杂项目中测试非常棘手原文出自

TestNG是一个测试框架，其灵感来自JUnit和NUnit，但引入了一些新的功能，使其功能更强大，使用更方便。
TestNG是一个开源自动化测试框架;TestNG表示下一代(Next Generation的首字母)。 TestNG类似于JUnit(特别是JUnit 4)，但它不是JUnit框架的扩展。它的灵感来源于JUnit。它的目的是优于JUnit，尤其是在用于测试集成多类时。 TestNG的创始人是Cedric Beust(塞德里克·博伊斯特)。
TestNG消除了大部分的旧框架的限制，使开发人员能够编写更加灵活和强大的测试。 因为它在很大程度上借鉴了Java注解(JDK5.0引入的)来定义测试，它也可以显示如何使用这个新功能在真实的Java语言生产环境中。

**TestNG的特点**
* 注解
* TestNG使用Java和面向对象的功能
* 支持综合类测试(例如，默认情况下，不用创建一个新的测试每个测试方法的类的实例)
* 独立的编译时测试代码和运行时配置/数据信息
* 灵活的运行时配置
* 主要介绍“测试组"。当编译测试，只要要求TestNG运行所有的“前端"的测试，或“快"，“慢"，“数据库"等
* 支持依赖测试方法，并行测试，负载测试，局部故障灵活的插件API支持多线程测试

TestNG(Next Generation)是一个测试框架，它受到JUnit和NUnit的启发，而引入了许多新的创新功能，如依赖测试，分组概念，使测试更强大，更容易做到。 它旨在涵盖所有类别的测试：单元，功能，端到端，集成等


**对比**



**依赖**

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.10</version>
    <scope>test</scope>
</dependency>

```
### 10.2.2. JUnit 4 Vs TestNG比较

| 特点 | JUnit 4| TestNG
|---|---|---|
| 测试注释| @Test| @Test
| 在套件中的所有测试运行之前运行| -| @BeforeSuite
| 在套件中的所有测试运行之后运行| -| @AfterSuite
| 测试之前运行| -| @BeforeTest
| 测试之后运行| -| @AfterTest
| 在调用属于任何这些组的第一个测试方法之前运行| -| @BeforeGroups| 
| 在调用属于任何这些组的第一个测试方法之后运行| -| @AfterGroups
| 在调用当前类的第一个测试方法之前运行| @BeforeClass| @BeforeClass
| 在调用当前类的第一个测试方法之后运行| @AfterClass| @AfterClass
| 在每个测试方法之前运行| @Before| @BeforeMethod
| 在每个测试方法之后运行| @After| @AfterMethod
| 忽略测试| @ignore| @Test(enbale=false)
| 预期的异常| @Test(expected = ArithmeticException.class)| @Test(expectedExceptions = ArithmeticException.class)
| 超时测试| @Test(timeout = 1000)| @Test(timeout = 1000)原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/testng/junit-vs-testng-comparison.html

JUnit4和TestNG之间的主要注释差异是：
* 在JUnit 4中，我们必须声明“@BeforeClass"和“@AfterClass"方法作为静态方法。 TestNG在方法声明中更灵活，它没有这个约束。
* 3个额外的setUp / tearDown级别：suite和group(@Before / AfterSuite，@Before / After Test，@Before / After Group)。原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/testng/junit-vs-testng-comparison.html




### 10.2.3. 注解说明
<a href="#menu" >目录</a>

TestNG支持多种注解，可以进行各种组合，如下进行简单的说明
|注解|	描述|
|---|---|
|@BeforeSuite	|在该套件的所有测试都运行在注释的方法之前，仅运行一次
|@AfterSuite	|在该套件的所有测试都运行在注释方法之后，仅运行一次
|@BeforeClass	|在调用当前类的第一个测试方法之前运行，注释方法仅运行一次
|@AfterClass	|在调用当前类的第一个测试方法之后运行，注释方法仅运行一次
|@BeforeTest	|注释的方法将在属于test标签内的类的所有测试方法运行之前运行
|@AfterTest	|注释的方法将在属于test标签内的类的所有测试方法运行之后运行
|@BeforeGroups	|配置方法将在之前运行组列表。 此方法保证在调用属于这些组中的任何一个的第一个测试方法之前不久运行
|@AfterGroups	|此配置方法将在之后运行组列表。该方法保证在调用属于任何这些组的最后一个测试方法之后不久运行
|@BeforeMethod	|注释方法将在每个测试方法之前运行
|@AfterMethod	|注释方法将在每个测试方法之后运行
|@DataProvider	|标记一种方法来提供测试方法的数据。 注释方法必须返回一个Object [] []，其中每个Object []可以被分配给测试方法的参数列表。 要从该DataProvider接收数据的@Test方法需要使用与此注释名称相等的dataProvider名称
|@Factory	|将一个方法标记为工厂，返回TestNG将被用作测试类的对象。 该方法必须返回Object []
|@Listeners	|定义测试类上的侦听器
|@Parameters|	描述如何将参数传递给@Test方法
|@Test	|将类或方法标记为测试的一部分，此标记若放在类上，则该类所有公共方法都将被作为测试方法

### 10.2.4. 测试案例

#### 10.2.4.1. 基本例子
<a href="#menu" >目录</a>

```java
package com.spring.test.testng;

import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void test(){

        System.out.println("test ng");
    }
}

```
输出
```
[TestNG] Running:
  /home/lgj/.IntelliJIdea2018.3/system/temp-testng-customsuite.xml
test ng

===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0
```

#### 10.2.4.2. 预期异常测试
<a href="#menu" >目录</a>

必须抛出ArithmeticException,否则测试失败
```java
@Test(expectedExceptions = ArithmeticException.class)
public void divisionWithException() {
    int i = 1 / 0;
    System.out.println("After division the value of i is :"+ i);
}

```

#### 10.2.4.3. 忽略测试
<a href="#menu" >目录</a>

通过enabled控制
```
@Test(enabled = false)
```
#### 10.2.4.4. 超时测试
<a href="#menu" >目录</a>

```java
 @Test(timeOut = 5000)
```
#### 10.2.4.5. 分组测试 
<a href="#menu" >目录</a>

这里有两个分组,group1-test和group2-test,只有这两个分组都执行成功了,group()方法才会执行,因为它使用dependsOnGroups依赖这两个分组.
```java
@Test(groups = "group1-test")
public void group1() {
    System.out.println("group1-test");
}
@Test(groups = "group1-test")
public void group1_1() {
    System.out.println("group1-1-test");
}


@Test(groups = "group2-test")
public void group2() {
    System.out.println("group2-test");
}

@Test(dependsOnGroups={"group1-test","group2-test"})
public void group() {
    System.out.println("group-test");
}
```

## 10.3. Mockito  
<a href="#menu" >目录</a>


### 10.3.1. 介绍
<a href="#menu" >目录</a>

**Mockito是什么？**
Mockito是mocking框架，它让你用简洁的API做测试。而且Mockito简单易学，它可读性强和验证语法简洁。

**为什么需要Mock**
测试驱动的开发( TDD)要求我们先写单元测试，再写实现代码。在写单元测试的过程中，我们往往会遇到要测试的类有很多依赖，这些依赖的类/对象/资源又有别的依赖，从而形成一个大的依赖树，要在单元测试的环境中完整地构建这样的依赖，是一件很困难的事情。如下图所示： 
![](https://images2015.cnblogs.com/blog/484791/201701/484791-20170120134044703-96948251.png)
为了测试类A，我们需要Mock B类和C类（用虚拟对象来代替）如下图所示：
![](https://images2015.cnblogs.com/blog/484791/201701/484791-20170120134311703-125872357.png)

* 场景1:比如我们要测试服务层,服务层要依赖于DAO层,如果仅仅测试服务层的代码,还要去启动数据库等操作,这时可以Mock一个DAO层的对象,然后注入服务层的类
* 场景2:代码分团队进开发,A依赖B,但是B还未开发好,也可以Mock 模块A中使用的B对象,然后注入A中.

**Stub和Mock异同**
相同：Stub和Mock都是模拟外部依赖
不同：Stub是完全模拟一个外部依赖， 而Mock还可以用来判断测试通过还是失败
 
**Mockito资源**
官网： http://mockito.org
API文档：http://docs.mockito.googlecode.com/hg/org/mockito/Mockito.html
项目源码：https://github.com/mockito/mockito 

**使用场景**
* 提前创建测试; TDD（测试驱动开发）
* 团队可以并行工作
* 你可以创建一个验证或者演示程序
* 为无法访问的资源编写测试
* Mock 可以交给用户
* 隔离系统  

**引入依赖**
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-all</artifactId>
    <version>1.9.5</version>
    <scope>test</scope>
</dependency>
```
因为是基于Junit进行测试,还需要引入Junit包
```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.11</version>
    <scope>test</scope>
</dependency>
```

### 10.3.2. Mockito说明

在使用过程中,都是使用Mockito类的相关静态方法来操作
```java
package org.mockito;


public class Mockito extends ArgumentMatchers {
    static final MockitoCore MOCKITO_CORE = new MockitoCore();
    public static final Answer<Object> RETURNS_DEFAULTS;
    public static final Answer<Object> RETURNS_SMART_NULLS;
    public static final Answer<Object> RETURNS_MOCKS;
    public static final Answer<Object> RETURNS_DEEP_STUBS;
    public static final Answer<Object> CALLS_REAL_METHODS;
    public static final Answer<Object> RETURNS_SELF;

    public Mockito() {
    }

    public static <T> T mock(Class<T> classToMock);

    @CheckReturnValue
    public static <T> T mock(Class<T> classToMock, String name) {
        return mock(classToMock, withSettings().name(name).defaultAnswer(RETURNS_DEFAULTS));
    }

    @CheckReturnValue
    public static MockingDetails mockingDetails(Object toInspect) {
        return MOCKITO_CORE.mockingDetails(toInspect);
    }

    @CheckReturnValue
    public static <T> T mock(Class<T> classToMock, Answer defaultAnswer) {
        return mock(classToMock, withSettings().defaultAnswer(defaultAnswer));
    }

    @CheckReturnValue
    public static <T> T mock(Class<T> classToMock, MockSettings mockSettings) {
        return MOCKITO_CORE.mock(classToMock, mockSettings);
    }

    @CheckReturnValue
    public static <T> T spy(T object) {
        return MOCKITO_CORE.mock(object.getClass(), withSettings().spiedInstance(object).defaultAnswer(CALLS_REAL_METHODS));
    }

    @Incubating
    @CheckReturnValue
    public static <T> T spy(Class<T> classToSpy) {
        return MOCKITO_CORE.mock(classToSpy, withSettings().useConstructor(new Object[0]).defaultAnswer(CALLS_REAL_METHODS));
    }

    @CheckReturnValue
    public static <T> OngoingStubbing<T> when(T methodCall) {
        return MOCKITO_CORE.when(methodCall);
    }

    @CheckReturnValue
    public static <T> T verify(T mock) {
        return MOCKITO_CORE.verify(mock, times(1));
    }

    @CheckReturnValue
    public static <T> T verify(T mock, VerificationMode mode) {
        return MOCKITO_CORE.verify(mock, mode);
    }

    public static <T> void reset(T... mocks) {
        MOCKITO_CORE.reset(mocks);
    }

    public static <T> void clearInvocations(T... mocks) {
        MOCKITO_CORE.clearInvocations(mocks);
    }

    public static void verifyNoMoreInteractions(Object... mocks) {
        MOCKITO_CORE.verifyNoMoreInteractions(mocks);
    }

    public static void verifyZeroInteractions(Object... mocks) {
        MOCKITO_CORE.verifyNoMoreInteractions(mocks);
    }

    @CheckReturnValue
    public static Stubber doThrow(Throwable... toBeThrown) {
        return MOCKITO_CORE.stubber().doThrow(toBeThrown);
    }

    @CheckReturnValue
    public static Stubber doThrow(Class<? extends Throwable> toBeThrown) {
        return MOCKITO_CORE.stubber().doThrow(toBeThrown);
    }

    @CheckReturnValue
    public static Stubber doThrow(Class<? extends Throwable> toBeThrown, Class... toBeThrownNext) {
        return MOCKITO_CORE.stubber().doThrow(toBeThrown, toBeThrownNext);
    }

    @CheckReturnValue
    public static Stubber doCallRealMethod() {
        return MOCKITO_CORE.stubber().doCallRealMethod();
    }

    @CheckReturnValue
    public static Stubber doAnswer(Answer answer) {
        return MOCKITO_CORE.stubber().doAnswer(answer);
    }

    @CheckReturnValue
    public static Stubber doNothing() {
        return MOCKITO_CORE.stubber().doNothing();
    }

    @CheckReturnValue
    public static Stubber doReturn(Object toBeReturned) {
        return MOCKITO_CORE.stubber().doReturn(toBeReturned);
    }

    @CheckReturnValue
    public static Stubber doReturn(Object toBeReturned, Object... toBeReturnedNext) {
        return MOCKITO_CORE.stubber().doReturn(toBeReturned, toBeReturnedNext);
    }

    @CheckReturnValue
    public static InOrder inOrder(Object... mocks) {
        return MOCKITO_CORE.inOrder(mocks);
    }

    public static Object[] ignoreStubs(Object... mocks) {
        return MOCKITO_CORE.ignoreStubs(mocks);
    }

    @CheckReturnValue
    public static VerificationMode times(int wantedNumberOfInvocations) {
        return VerificationModeFactory.times(wantedNumberOfInvocations);
    }

    @CheckReturnValue
    public static VerificationMode never() {
        return times(0);
    }

    @CheckReturnValue
    public static VerificationMode atLeastOnce() {
        return VerificationModeFactory.atLeastOnce();
    }

    @CheckReturnValue
    public static VerificationMode atLeast(int minNumberOfInvocations) {
        return VerificationModeFactory.atLeast(minNumberOfInvocations);
    }

    @CheckReturnValue
    public static VerificationMode atMost(int maxNumberOfInvocations) {
        return VerificationModeFactory.atMost(maxNumberOfInvocations);
    }

    @CheckReturnValue
    public static VerificationMode calls(int wantedNumberOfInvocations) {
        return VerificationModeFactory.calls(wantedNumberOfInvocations);
    }

    @CheckReturnValue
    public static VerificationMode only() {
        return VerificationModeFactory.only();
    }

    @CheckReturnValue
    public static VerificationWithTimeout timeout(long millis) {
        return new Timeout(millis, VerificationModeFactory.times(1));
    }

    @CheckReturnValue
    public static VerificationAfterDelay after(long millis) {
        return new After(millis, VerificationModeFactory.times(1));
    }

    public static void validateMockitoUsage() {
        MOCKITO_CORE.validateMockitoUsage();
    }

    @CheckReturnValue
    public static MockSettings withSettings() {
        return (new MockSettingsImpl()).defaultAnswer(RETURNS_DEFAULTS);
    }

    @CheckReturnValue
    public static VerificationMode description(String description) {
        return times(1).description(description);
    }

    /** @deprecated */
    @Deprecated
    @CheckReturnValue
    static MockitoDebugger debug() {
        return new MockitoDebuggerImpl();
    }

    @Incubating
    @CheckReturnValue
    public static MockitoFramework framework() {
        return new DefaultMockitoFramework();
    }

    @Incubating
    @CheckReturnValue
    public static MockitoSessionBuilder mockitoSession() {
        return new DefaultMockitoSessionBuilder();
    }

    @Incubating
    public static LenientStubber lenient() {
        return MOCKITO_CORE.lenient();
    }

    static {
        RETURNS_DEFAULTS = Answers.RETURNS_DEFAULTS;
        RETURNS_SMART_NULLS = Answers.RETURNS_SMART_NULLS;
        RETURNS_MOCKS = Answers.RETURNS_MOCKS;
        RETURNS_DEEP_STUBS = Answers.RETURNS_DEEP_STUBS;
        CALLS_REAL_METHODS = Answers.CALLS_REAL_METHODS;
        RETURNS_SELF = Answers.RETURNS_SELF;
    }
}

```

### 10.3.3. 例子 
<a href="#menu" >目录</a>


#### 10.3.3.1. 基本的例子 
<a href="#menu" >目录</a>

这里需要测试UserDemoService类的代码
```java
@Service
public class UserDemoService {

    @Autowired
    private  UserDemoMapper userDemoMapper;
    public List<UserDemo> list(){
        return  userDemoMapper.list();
    }

    public List<UserDemo> list(String name){
        return  userDemoMapper.list( name);
    }
}
```

创建测试类

```java
package com.spring.test.service;

import com.spring.test.dao.UserDemo;
import com.spring.test.dao.UserDemoMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class UserDemoServiceTest {
    //Mock一个userDemoMapper对象
    @Mock
    UserDemoMapper userDemoMapper;
    
    //需要注入的对象
    @InjectMocks
    UserDemoService userDemoService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void list() {

        //测试1-------------------------
        String name = "aaa";

        UserDemo userDemo = new UserDemo();
        userDemo.setId(1000);
        userDemo.setAge(105);
        userDemo.setName(name);
        List<UserDemo> userDemos = new ArrayList<>();
        userDemos.add(userDemo);
        
        //当调用userDemoMapper.list(name)时返回userDemos对象
        Mockito.when(userDemoMapper.list(name)).thenReturn(userDemos);

        List<UserDemo> userDemoList =   userDemoService.list(name);
        System.out.println("name = " + name + ", return:"+userDemoList);

        //测试2-------------------------
        String name1 = "bbb";

        UserDemo userDemo1 = new UserDemo();
        userDemo1.setId(1000);
        userDemo1.setAge(105);
        userDemo1.setName(name1);
        List<UserDemo> userDemos1 = new ArrayList<>();
        userDemos1.add(userDemo1);

        Mockito.when(userDemoMapper.list(name1)).thenReturn(userDemos1);
        List<UserDemo> userDemoList1 =   userDemoService.list(name1);
        System.out.println("name = " + name1 + ", return:"+userDemoList1);


    }
}
```
输出
```
name = aaa, return:[UserDemo(id=1000, name=aaa, age=105)]
name = bbb, return:[UserDemo(id=1000, name=bbb, age=105)]
```

#### 10.3.3.2. 验证行为
<a href="#menu" >目录</a>

```java
@Test
public void verify_behaviour(){
    //模拟创建一个List对象
    List mock = mock(List.class);
    //使用mock的对象
    mock.add(1);
    mock.clear();
    //验证add(1)和clear()行为是否发生
    verify(mock).add(1);
    verify(mock).clear();
}
```
#### 10.3.3.3. 模拟我们所期望的结果
<a href="#menu" >目录</a>

```java
    @Test
    public void when_thenReturn(){
        //mock一个Iterator类
        Iterator iterator = mock(Iterator.class);
        //预设当iterator调用next()时第一次返回hello，第n次都返回world
        when(iterator.next()).thenReturn("hello").thenReturn("world");
        //使用mock的对象
        String result = iterator.next() + " " + iterator.next() + " " + iterator.next();
        //验证结果
        assertEquals("hello world world",result);
    }
```
```java
    @Test(expected = IOException.class)
    public void when_thenThrow() throws IOException {
        OutputStream outputStream = mock(OutputStream.class);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        //预设当流关闭时抛出异常
        doThrow(new IOException()).when(outputStream).close();
        outputStream.close();
    }
```
#### 10.3.3.4. RETURNS_SMART_NULLS和RETURNS_DEEP_STUBS
<a href="#menu" >目录</a>

RETURNS_SMART_NULLS实现了Answer接口的对象，它是创建mock对象时的一个可选参数，mock(Class,Answer)。

在创建mock对象时，有的方法我们没有进行stubbing，所以调用时会放回Null这样在进行操作是很可能抛出NullPointerException。如果通过RETURNS_SMART_NULLS参数创建的mock对象在没有调用stubbed方法时会返回SmartNull。例如：返回类型是String，会返回"";是int，会返回0；是List，会返回空的List。另外，在控制台窗口中可以看到SmartNull的友好提示。

```java
    @Test
    public void returnsSmartNullsTest() {
        List mock = mock(List.class, RETURNS_SMART_NULLS);
        System.out.println(mock.get(0));
        
        //使用RETURNS_SMART_NULLS参数创建的mock对象，不会抛出NullPointerException异常。另外控制台窗口会提示信息“SmartNull returned by unstubbed get() method on mock"
        System.out.println(mock.toArray().length);
    }
```
RETURNS_DEEP_STUBS也是创建mock对象时的备选参数

RETURNS_DEEP_STUBS参数程序会自动进行mock所需的对象，方法deepstubsTest和deepstubsTest2是等价的

```java
    @Test
    public void deepstubsTest(){
        Account account=mock(Account.class,RETURNS_DEEP_STUBS);
        when(account.getRailwayTicket().getDestination()).thenReturn("Beijing");
        account.getRailwayTicket().getDestination();
        verify(account.getRailwayTicket()).getDestination();
        assertEquals("Beijing",account.getRailwayTicket().getDestination());
    }
    @Test
    public void deepstubsTest2(){
        Account account=mock(Account.class); 
        RailwayTicket railwayTicket=mock(RailwayTicket.class);        
        when(account.getRailwayTicket()).thenReturn(railwayTicket); 
        when(railwayTicket.getDestination()).thenReturn("Beijing");
        
        account.getRailwayTicket().getDestination();
        verify(account.getRailwayTicket()).getDestination();    
        assertEquals("Beijing",account.getRailwayTicket().getDestination());
    }    
    
    public class RailwayTicket{
        private String destination;

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }        
    }
    
    public class Account{
        private RailwayTicket railwayTicket;

        public RailwayTicket getRailwayTicket() {
            return railwayTicket;
        }

        public void setRailwayTicket(RailwayTicket railwayTicket) {
            this.railwayTicket = railwayTicket;
        }
    }
```
#### 10.3.3.5. 模拟方法体抛出异常
<a href="#menu" >目录</a>

```java
    @Test(expected = RuntimeException.class)
    public void doThrow_when(){
        List list = mock(List.class);
        doThrow(new RuntimeException()).when(list).add(1);
        list.add(1);
    }
```

#### 10.3.3.6. 使用注解来快速模拟 
<a href="#menu" >目录</a>

在上面的测试中我们在每个测试方法里都mock了一个List对象，为了避免重复的mock，是测试类更具有可读性，我们可以使用下面的注解方式来快速模拟对象：

```java
    @Mock
    private List mockList;
OK，我们再用注解的mock对象试试 

    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
```
运行这个测试类你会发现报错了，mock的对象为NULL，为此我们必须在基类中添加初始化mock的代码

```java
public class MockitoExample2 {
    @Mock
    private List mockList;

    public MockitoExample2(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
}
```
或者使用built-in runner：MockitoJUnitRunner

```java
@RunWith(MockitoJUnitRunner.class)
public class MockitoExample2 {
    @Mock
    private List mockList;

    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
}
```
#### 10.3.3.7. 参数匹配
<a href="#menu" >目录</a>

```java
@Test
public void with_arguments(){
    Comparable comparable = mock(Comparable.class);
    //预设根据不同的参数返回不同的结果
    when(comparable.compareTo("Test")).thenReturn(1);
    when(comparable.compareTo("Omg")).thenReturn(2);
    assertEquals(1, comparable.compareTo("Test"));
    assertEquals(2, comparable.compareTo("Omg"));
    //对于没有预设的情况会返回默认值
    assertEquals(0, comparable.compareTo("Not stub"));
}
```
除了匹配制定参数外，还可以匹配自己想要的任意参数

```java
@Test
public void with_unspecified_arguments(){
    List list = mock(List.class);
    //匹配任意参数
    when(list.get(anyInt())).thenReturn(1);
    when(list.contains(argThat(new IsValid()))).thenReturn(true);
    assertEquals(1, list.get(1));
    assertEquals(1, list.get(999));
    assertTrue(list.contains(1));
    assertTrue(!list.contains(3));
}

private class IsValid extends ArgumentMatcher<List>{
    @Override
    public boolean matches(Object o) {
        return o == 1 || o == 2;
    }
}
```
注意：如果你使用了参数匹配，那么所有的参数都必须通过matchers来匹配，如下代码：

```java
@Test
public void all_arguments_provided_by_matchers(){
    Comparator comparator = mock(Comparator.class);
    comparator.compare("nihao","hello");
    //如果你使用了参数匹配，那么所有的参数都必须通过matchers来匹配
    verify(comparator).compare(anyString(),eq("hello"));
    //下面的为无效的参数匹配使用
    //verify(comparator).compare(anyString(),"hello");
}
```
#### 10.3.3.8. 自定义参数匹配
<a href="#menu" >目录</a>

```java
@Test
public void argumentMatchersTest(){
    //创建mock对象
    List<String> mock = mock(List.class);

    //argThat(Matches<T> matcher)方法用来应用自定义的规则，可以传入任何实现Matcher接口的实现类。
    when(mock.addAll(argThat(new IsListofTwoElements()))).thenReturn(true);

    mock.addAll(Arrays.asList("one","two","three"));
    //IsListofTwoElements用来匹配size为2的List，因为例子传入List为三个元素，所以此时将失败。
    verify(mock).addAll(argThat(new IsListofTwoElements()));
}

class IsListofTwoElements extends ArgumentMatcher<List>
{
    public boolean matches(Object list)
    {
        return((List)list).size()==2;
    }
}
```
#### 10.3.3.9. 捕获参数来进一步断言
<a href="#menu" >目录</a>

较复杂的参数匹配器会降低代码的可读性，有些地方使用参数捕获器更加合适。

```java
@Test
public void capturing_args(){
    PersonDao personDao = mock(PersonDao.class);
    PersonService personService = new PersonService(personDao);

    ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);
    personService.update(1,"jack");
    verify(personDao).update(argument.capture());
    assertEquals(1,argument.getValue().getId());
    assertEquals("jack",argument.getValue().getName());
}

    class Person{
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

interface PersonDao{
    public void update(Person person);
}

class PersonService{
    private PersonDao personDao;

    PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void update(int id,String name){
        personDao.update(new Person(id,name));
    }
}
```
#### 10.3.3.10. 使用方法预期回调接口生成期望值（Answer结构）
<a href="#menu" >目录</a>

```java
@Test
public void answerTest(){
    when(mockList.get(anyInt())).thenAnswer(new CustomAnswer());
    assertEquals("hello world:0",mockList.get(0));
    assertEquals("hello world:999",mockList.get(999));
}

private class CustomAnswer implements Answer<String>{
    @Override
    public String answer(InvocationOnMock invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        return "hello world:"+args[0];
    }
}
```
也可使用匿名内部类实现

```java
@Test
public void answer_with_callback(){
    //使用Answer来生成我们我们期望的返回
    when(mockList.get(anyInt())).thenAnswer(new Answer<Object>() {
        @Override
        public Object answer(InvocationOnMock invocation) throws Throwable {
            Object[] args = invocation.getArguments();
            return "hello world:"+args[0];
        }
    });
    assertEquals("hello world:0",mockList.get(0));
    assertEquals("hello world:999",mockList.get(999));
}
```
#### 10.3.3.11. 修改对未预设的调用返回默认期望
<a href="#menu" >目录</a>

```java
@Test
public void unstubbed_invocations(){
    //mock对象使用Answer来对未预设的调用返回默认期望值
    List mock = mock(List.class,new Answer() {
        @Override
        public Object answer(InvocationOnMock invocation) throws Throwable {
            return 999;
        }
    });
    //下面的get(1)没有预设，通常情况下会返回NULL，但是使用了Answer改变了默认期望值
    assertEquals(999, mock.get(1));
    //下面的size()没有预设，通常情况下会返回0，但是使用了Answer改变了默认期望值
    assertEquals(999,mock.size());
}
```
#### 10.3.3.12. 用spy监控真实对象 
<a href="#menu" >目录</a>

Mock不是真实的对象，它只是用类型的class创建了一个虚拟对象，并可以设置对象行为
Spy是一个真实的对象，但它可以设置对象行为
InjectMocks创建这个类的对象并自动将标记@Mock、@Spy等注解的属性值注入到这个中
```java
@Test(expected = IndexOutOfBoundsException.class)
public void spy_on_real_objects(){
    List list = new LinkedList();
    List spy = spy(list);
    //下面预设的spy.get(0)会报错，因为会调用真实对象的get(0)，所以会抛出越界异常
    //when(spy.get(0)).thenReturn(3);

    //使用doReturn-when可以避免when-thenReturn调用真实对象api
    doReturn(999).when(spy).get(999);
    //预设size()期望值
    when(spy.size()).thenReturn(100);
    //调用真实对象的api
    spy.add(1);
    spy.add(2);
    assertEquals(100,spy.size());
    assertEquals(1,spy.get(0));
    assertEquals(2,spy.get(1));
    verify(spy).add(1);
    verify(spy).add(2);
    assertEquals(999,spy.get(999));
    spy.get(2);
}
```
#### 10.3.3.13. 真实的部分mock
<a href="#menu" >目录</a>

```java
@Test
public void real_partial_mock(){
    //通过spy来调用真实的api
    List list = spy(new ArrayList());
    assertEquals(0,list.size());
    A a  = mock(A.class);
    //通过thenCallRealMethod来调用真实的api
    when(a.doSomething(anyInt())).thenCallRealMethod();
    assertEquals(999,a.doSomething(999));
}


class A{
    public int doSomething(int i){
        return i;
    }
}
```
#### 10.3.3.14. 重置mock
<a href="#menu" >目录</a>

```java
@Test
public void reset_mock(){
    List list = mock(List.class);
    when(list.size()).thenReturn(10);
    list.add(1);
    assertEquals(10,list.size());
    //重置mock，清除所有的互动和预设
    reset(list);
    assertEquals(0,list.size());
}
```
#### 10.3.3.15. 验证确切的调用次数
<a href="#menu" >目录</a>

```java
@Test
public void verifying_number_of_invocations(){
    List list = mock(List.class);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(3);
    //验证是否被调用一次，等效于下面的times(1)
    verify(list).add(1);
    verify(list,times(1)).add(1);
    //验证是否被调用2次
    verify(list,times(2)).add(2);
    //验证是否被调用3次
    verify(list,times(3)).add(3);
    //验证是否从未被调用过
    verify(list,never()).add(4);
    //验证至少调用一次
    verify(list,atLeastOnce()).add(1);
    //验证至少调用2次
    verify(list,atLeast(2)).add(2);
    //验证至多调用3次
    verify(list,atMost(3)).add(3);
}
```
#### 10.3.3.16. 连续调用
<a href="#menu" >目录</a>

```java
@Test(expected = RuntimeException.class)
public void consecutive_calls(){
    //模拟连续调用返回期望值，如果分开，则只有最后一个有效
    when(mockList.get(0)).thenReturn(0);
    when(mockList.get(0)).thenReturn(1);
    when(mockList.get(0)).thenReturn(2);
    when(mockList.get(1)).thenReturn(0).thenReturn(1).thenThrow(new RuntimeException());
    assertEquals(2,mockList.get(0));
    assertEquals(2,mockList.get(0));
    assertEquals(0,mockList.get(1));
    assertEquals(1,mockList.get(1));
    //第三次或更多调用都会抛出异常
    mockList.get(1);
}
```
#### 10.3.3.17. 验证执行顺序
<a href="#menu" >目录</a>

```java
@Test
public void verification_in_order(){
    List list = mock(List.class);
    List list2 = mock(List.class);
    list.add(1);
    list2.add("hello");
    list.add(2);
    list2.add("world");
    //将需要排序的mock对象放入InOrder
    InOrder inOrder = inOrder(list,list2);
    //下面的代码不能颠倒顺序，验证执行顺序
    inOrder.verify(list).add(1);
    inOrder.verify(list2).add("hello");
    inOrder.verify(list).add(2);
    inOrder.verify(list2).add("world");
}
```
#### 10.3.3.18. 确保模拟对象上无互动发生
<a href="#menu" >目录</a>

```java
@Test
public void verify_interaction(){
    List list = mock(List.class);
    List list2 = mock(List.class);
    List list3 = mock(List.class);
    list.add(1);
    verify(list).add(1);
    verify(list,never()).add(2);
    //验证零互动行为
    verifyZeroInteractions(list2,list3);
}
```
#### 10.3.3.19. 找出冗余的互动(即未被验证到的)
<a href="#menu" >目录</a>

```java
@Test(expected = NoInteractionsWanted.class)
public void find_redundant_interaction(){
    List list = mock(List.class);
    list.add(1);
    list.add(2);
    verify(list,times(2)).add(anyInt());
    //检查是否有未被验证的互动行为，因为add(1)和add(2)都会被上面的anyInt()验证到，所以下面的代码会通过
    verifyNoMoreInteractions(list);

    List list2 = mock(List.class);
    list2.add(1);
    list2.add(2);
    verify(list2).add(1);
    //检查是否有未被验证的互动行为，因为add(2)没有被验证，所以下面的代码会失败抛出异常
    verifyNoMoreInteractions(list2);
}
```
### 10.3.4. Mockito如何实现Mock[3]
<a href="#menu" >目录</a>

Mockito并不是创建一个真实的对象，而是模拟这个对象，他用简单的when(mock.method(params)).thenRetrun(result)语句设置mock对象的行为，如下语句：

// 设置mock对象的行为 － 当调用其get方法获取第0个元素时，返回"first"
Mockito.when(mockedList.get(0)).thenReturn("first");
在Mock对象的时候，创建一个proxy对象，保存被调用的方法名（get），以及调用时候传递的参数（0），然后在调用thenReturn方法时再把“first"保存起来，这样，就有了构建一个stub方法所需的所有信息，构建一个stub。当get方法被调用的时候，实际上调用的是之前保存的proxy对象的get方法，返回之前保存的数据。


## 10.4. 控制层测试
<a href="#menu" >目录</a>

主要思路是：使用MockMvc发起请求，然后执行相应的代码，在执行的过程中使用Mockito的mock模拟底层数据的返回，最后结果验证。

Mockito框架[官方地址mockito:https://site.mockito.org/](https://site.mockito.org/)，
[文档地址:https://static.javadoc.io/org.mockito/mockito-core/3.0.0/org/mockito/Mockito.html](https://static.javadoc.io/org.mockito/mockito-core/3.0.0/org/mockito/Mockito.html)

MockMvc相关[官方地址官方指南:https://spring.io/guides/gs/testing-web/](https://spring.io/guides/gs/testing-web/)，
[文档地址:https://spring.io/guides/gs/testing-web/](https://spring.io/guides/gs/testing-web/)


### 10.4.1. 基本使用
<a href="#menu" >目录</a>

#### 10.4.1.1. 依赖

**首先需要增加相应的依赖：**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```
将会添加以下类库
* Junit，标准的单元测试 Java 应用程序 。
* Spring Test & Spring Boot Test，对 Spring Boot 应用程序的单元测试 。
* Mockito, Java mocking 框架，用于模拟任何 Spring 管理的 Bean，比如在单元测试中模拟一个第三方系统 Service 接口返回的数据，而不会去真正调用第三方系统 。
* AssertJ ， 一个流畅的 assertion 库，同时也提供了更多 的期望值与测试返回值的比较方式 。
* Hamcrest，库的匹配对象（也称为约束或谓词） 。
* JSONassert，对 JSON 对象或者 JSON 字符串断 言 的库 。
* JsonPath，提供类似 XPath 那样的符号来获取 JSON 数据片段 。



#### 10.4.1.2. 基本使用
```java
//模拟一个 Get 请求：
mockMvc.perform(get (" / hotels?foo={foo }","bar"));

//模拟－个 Post 请求：
mockMvc.perform(p。 st （"／ hotels/{id ｝"， 42) ;

//模拟文件上传：
mockMvc.perform(multipart("/doc").file("file"，"文件内容".getBytes("UTF-8")));

//模拟提交 message 参数
mvc.perform(get （"／ user/{id}/{n缸ne ｝"， userid,name).param ("message","hello"));
//模拟一个 checkbox 提交
mvc.perform(get ("/user/{id}/{name }", userid,name).param ("job"，"IT"，"ov"）.param( .. . ));


//直接使用 MultiValueMap 构造参数
LinkedMultiValueMap params = new LinkedMultiValueMap () ;
params.put ("message","hello") ;
params.put ("job","IT");
params.put ("job" ,"gov");
mvc.perforrn(get (" / user/{id)/{narne } ", userId, name) . param (params) ) ;
//模拟 Session 和 Cookie:
mvc.perform(get (" / user .html") . sessionAttr(name, value ));
mvc.perform(get ("/user . html ") . cookie (new Cookie(narne , value))) ;

//设置 HTTP Body 内容，比如提交的 JSON:
String json = "{"name": "liang"}",
mvc.perform(get ("/user.html ") .content(json));

//设置 HTTP Header:
mvc.perform(get ("/user / {id} /{narne } ", userid,name)
    .contentType ("application/x-www-forrn-urlencoded") // HTTP 提交内容
    .accept( " application/json "）//期望返回内容
    .header (header,value）） //设直 HTTP 头
```

#### 10.4.1.3. 比较 MVC 的返回结果

```java
rnockMvc.perform(get("/user/l"))
.andExpect(status().isOk())//期望成功调用，即HTTPStatus为200
//期望返回内容是application/json
.andExpect(content().contentType(MediaType.APPLICATIONJSON))
.andExpect（jsonPath（"$.name"）.value（"Jason"））；//检查返回内容


rnockMvc.perform(post("/form")).andExpect(view().name("/success.btl"));

//比较Model:
mockMvc.perform(post("/form"))
.andExpect(status().isOk()
.andExpect(model().size(1))
.andExpect(model().attributeExists("person")
//第9章Testing单元测试’I203
.andExpect(model().attribute("person","xiandadfu"));
//比较forward或者redirect:
mockMvc.perform(post("/login"))
.andExpect(forwardedUrl（"／index.html"））；／／或者
redirectedUrl("/index.html")
//比较返回内容，使用content():
andExpect(content().string("helloworld"));
//返回内容是XML，并且与xmlCotent一样
andExpect(content().xml(xmlCotent));
//返回内容是JSON，并且与jsonContent一样
andExpect(content().json(jsonContent));
andExpect(content().bytes(bytes);

```

#### 10.4.1.4. 完整例子


需要在测试类中增加如下注解：

**方式1:自动配置MockMvc**
```java
@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureMockMvc是用于自动配置MockMvc
@AutoConfigureMockMvc
public class MockXXXTest {

    //配置MockMvc
    @Autowired
    protected MockMvc mockMvc;

    @Test
    public void homePage() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/readingList"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name("readingList"))
        .andExpect(MockMvcResultMatchers.model().attributeExists("books"))
        .andExpect(MockMvcResultMatchers.model().attribute("books",
        Matchers.is(Matchers.empty())));
    }
  
}
```

@RunWith 是 JUnit 标准的一个注解，用来告诉 JUnit 单元测试框架不要使用内置的方式进行单元测试，而应使用 RunWith 指明的类来提供单元测试，所有的 Spring 单元测试总是使用SpringRunner.class 。

@SpringBootTest 用 于 Spring Boot 应用测试，它默认会根据包名逐级往上找， 一直找到Spring Boot 主程序 ，也就是通过类注解是否包含＠SpringBootApplication 来判断是否是主程序 ，并在单元测试的时候启动该类来创建 Spring 上下文环境。

注意： Spring 单元测试并不会在每个单元测试方法前都启动一个全新的 Spring 上下 文 ，因为这样大耗时 。 Sp「ing 单元测试会缓存上下文环境 ， 以提供给每个单元测试方法 。 如果你的单元测试方法改变了上下文，比如更改了 Bean 定义 ， 你需要在此单元测试方法上加上＠Di 「tiesContext 以提示 Spring 重新加载 Spring 上下文 。




**方式2:手动配置MockMvc**
```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReadingListApplication.class)
@WebAppConfiguration
public class MockMvcWebTests {
    @Autowired
    private WebApplicationContext webContext;
    private MockMvc mockMvc;
   
    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders
        .webAppContextSetup(webContext)
        .build();
    }

    @Test
    public void homePage() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/readingList"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name("readingList"))
        .andExpect(MockMvcResultMatchers.model().attributeExists("books"))
        .andExpect(MockMvcResultMatchers.model().attribute("books",
        Matchers.is(Matchers.empty())));
    }

}
```

@WebAppConfiguration注解声明，由SpringJUnit4ClassRunner创建的应用程序上下文应该是一个WebApplicationContext（相对于基本的非WebApplicationContext）。setupMockMvc()方法上添加了JUnit的@Before注解，表明它应该在测试方法之前执行。它将WebApplicationContext注入webAppContextSetup()方法，然后调用build()产生了一
个MockMvc实例，该实例赋给了一个实例变量，供测试方法使用。


**接着需要使用@MockBean模拟相应对象**
这里的主要作用是：使用mock对象代替原来spring的bean，然后模拟底层数据的返回，而不是调用原本真正的实现。

注：与@MockBean 对应的还有@SpyBean（有兴趣可以去找一下相关的内容）。 @SpyBean与 @Spy 的关系类似于 @MockBean 与 @Mock 的关系。和 @MockBean 不同的是，它不会生成一个 Bean 的替代品装配到类中，而是会监听一个真正的 Bean 中某些特定的方法，并在调用这些方法时给出指定的反馈。

首先增加 @MockBean 注解

```java
public class MockXXXTest {
    @MockBean
    private XXXDao xxxtDao;
 

}
```

SpringBoot 中, @MockBean 会将mock的bean替换掉 SpringBoot 管理的原生bean，从而达到mock的效果。

mock:在软件开发的世界之外, "mock"一词是指模仿或者效仿. 因此可以将“mock"理解为一个替身，替代者. 在软件开发中提及"mock"，通常理解为模拟对象或者Fake

然后 Stub 打桩
```java
 Mockito.when(
        xxxDao.findMapBySql(
                Mockito.anyString(),Mockito.anyList()
        )
 ).thenReturn(dataList);
```
   这里的when(…).thenReturn(…)表示的是：当定义(when)对象、方法和参数（输入），然后(thenReturn) 中返回结果（输出）。默认情况下，所有的函数都有返回值。mock函数默认返回的是null，一个空的集合或者一个被对象类型包装的内置类型，例如：0、false对应的对象类型为Integer、Boolean。

  这里值得注意的是：方法中使用的参数可以使用参数匹配器，如：Mockito.anyString(),Mockito.anyList()，当其中有一个参数使用了参数匹配器，其实的所有参数也需要使用参数匹配器，否则会出现异常。

**使用MockMvc发送请求**

这里的主要作用是：使用MockMvc发起一个请求，然后进行验证规则、进一步处理返回结果等。

```java
//配置MockMvc
@Autowired
protected MockMvc mockMvc;
@Test
public void TestXXX() throws Exception {
       MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/xxxController/xxx_query")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)      
                        .param("xxx","xxx")
                    

        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
       
    }
｝
```
* perform() 执行一个MockMvcRequestBuilders请求。其中.get()表示发送get请求（可以使用get、post、put、delete等）；.contentType()设置编码格式；.param()请求参数,可以带多个。
andExpect()添加 MockMvcResultMatchers验证规则，验证执行结果是否正确。
* .andDo()添加 MockMvcResultHandlers结果处理器,这是可以用于打印结果输出。
* .andReturn()结果还回，然后可以进行下一步的处理。

**完整例子如下：**

```java
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockXXXTest {
    @Autowired
    protected MockMvc mockMvc;
    @MockBean
    private XXXDao xxxtDao;
    @Test
    public void TestXXX() throws Exception {
        List<Map<String,Object>> dataList= new ArrayList<>();
        Map m=new HashMap();
        m.put("name","test");
        dataList.add(m);
        Mockito.when(xxxDao.findMapBySql(Mockito.anyString(),Mockito.anyList())).thenReturn(dataList);

        Mockito.when(xxxDao.findTotalCountBySql(Mockito.anyString(),Mockito.any())).thenReturn((long)1);
     
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/xxxController/xxx_query")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)      
                        .param("xxx","xxx")
                    

        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(result);
    }
}
```


 
### 10.4.2. 相关类说明
<a href="#menu" >目录</a>

Spring mvc测试框架提供了测试MVC需要的API，主要包括Servlet/JSP Mock、MockMvcBuilder、MockMvc、RequestBuilder、ResultMatcher、ResultHandler、MvcResult等。另外提供了几个静态工厂方法便于测试：MockMvcBuilders、MockMvcRequestBuilders、MockMvcResultMatchers、MockMvcResultHandlers。在使用时请使用静态方法导入方便测试，如：

```java
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;  
```

#### 10.4.2.1. MockMvcBuilder/MockMvcBuilders
<a href="#menu" >目录</a>

MockMvcBuilder是用来构造MockMvc的构造器，其主要有两个实现：StandaloneMockMvcBuilder和DefaultMockMvcBuilder，分别对应之前的两种测试方式。对于我们来说直接使用静态工厂MockMvcBuilders创建即可：
* MockMvcBuilders.webAppContextSetup(WebApplicationContext context)：指定WebApplicationContext，将会从该上下文获取相应的控制器并得到相应的MockMvc
* MockMvcBuilders.standaloneSetup(Object... controllers)：通过参数指定一组控制器，这样就不需要从上下文获取了；

```java
@Autowired
private WebApplicationContext context;
private MockMvc mockMvc;
@Before
public void setupMockMvc() throws Exception {
    MockitoAnnotations.initMocks(this);

    // mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

    mockMvc = MockMvcBuilders
            .standaloneSetup(userDemoController)
            .setRemoveSemicolonContent(false)
            .build();

}
```
也可以使用注解:@AutoConfigureMockMvc+@WebAppConfiguration
```java
//测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的；value指定web应用的根；
public @interface WebAppConfiguration {
    String value() default "src/main/webapp";
}
```
```java
@ImportAutoConfiguration
@PropertyMapping("spring.test.mockmvc")
public @interface AutoConfigureMockMvc {
    boolean addFilters() default true;

    @PropertyMapping(
        skip = SkipPropertyMapping.ON_DEFAULT_VALUE
    )
    MockMvcPrint print() default MockMvcPrint.DEFAULT;

    boolean printOnlyOnFailure() default true;

    @PropertyMapping("webclient.enabled")
    boolean webClientEnabled() default true;

    @PropertyMapping("webdriver.enabled")
    boolean webDriverEnabled() default true;

    /** @deprecated */
    @Deprecated
    boolean secure() default true;
}
```

然后
```java
@Autowired
protected MockMvc mockMvc;
```

其中DefaultMockMvcBuilder还提供了如下API：
* addFilters(Filter... filters)/addFilter(Filter filter, String... urlPatterns)：添加javax.servlet.Filter过滤器
* defaultRequest(RequestBuilder requestBuilder)：默认的RequestBuilder，每次执行时会合并到自定义的RequestBuilder中，即提供公共请求数据的；
* alwaysExpect(ResultMatcher resultMatcher)：定义全局的结果验证器，即每次执行请求时都进行验证的规则；
* alwaysDo(ResultHandler resultHandler)：定义全局结果处理器，即每次请求时都进行结果处理；
* dispatchOptions：DispatcherServlet是否分发OPTIONS请求方法到控制器；

 

StandaloneMockMvcBuilder继承了DefaultMockMvcBuilder，又提供了如下API：
* setMessageConverters(HttpMessageConverter<?>...messageConverters)：设置HTTP消息转换器；
* setValidator(Validator validator)：设置验证器；
* setConversionService(FormattingConversionService conversionService)：设置转换服务；
* addInterceptors(HandlerInterceptor... interceptors)/addMappedInterceptors(String[] pathPatterns, HandlerInterceptor... interceptors)：添加spring mvc拦截器；
* setContentNegotiationManager(ContentNegotiationManager contentNegotiationManager)：设置内容协商管理器；
* setAsyncRequestTimeout(long timeout)：设置异步超时时间；
* setCustomArgumentResolvers(HandlerMethodArgumentResolver... argumentResolvers)：设置自定义控制器方法参数解析器；
* setCustomReturnValueHandlers(HandlerMethodReturnValueHandler... handlers)：设置自定义控制器方法返回值处理器；
* setHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers)/setHandlerExceptionResolvers(HandlerExceptionResolver... exceptionResolvers)：设置异常解析器；
* setViewResolvers(ViewResolver...resolvers)：设置视图解析器；
* setSingleView(View view)：设置单个视图，即视图解析时总是解析到这一个（仅适用于只有一个视图的情况）；
* setLocaleResolver(LocaleResolver localeResolver)：设置Local解析器；
* setFlashMapManager(FlashMapManager flashMapManager)：设置FlashMapManager，如存储重定向数据；
* setUseSuffixPatternMatch(boolean useSuffixPatternMatch)：设置是否是后缀模式匹配，如“/user"是否匹配"/user.*"，默认真即匹配；
* setUseTrailingSlashPatternMatch(boolean useTrailingSlashPatternMatch)：设置是否自动后缀路径模式匹配，如“/user"是否匹配“/user/"，默认真即匹配；
* addPlaceHolderValue(String name, String value) ：添加request mapping中的占位符替代；


因为StandaloneMockMvcBuilder不会加载Spring MVC配置文件，因此就不会注册我们需要的一些组件，因此就提供了如上API用于注册我们需要的相应组件。

#### 10.4.2.2. MockMvc
<a href="#menu" >目录</a>

使用之前的MockMvcBuilder.build()得到构建好的MockMvc；这个是mvc测试的核心API，对于该API的使用方式如下：
```java
MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))  
       .andExpect(MockMvcResultMatchers.view().name("user/view"))  
       .andExpect(MockMvcResultMatchers.model().attributeExists("user"))  
       .andDo(MockMvcResultHandlers.print())  
       .andReturn(); 
```
* perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
* andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确；
* andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台；
* andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理；

另外还提供了以下API：
* setDefaultRequest：设置默认的RequestBuilder，用于在每次perform执行相应的RequestBuilder时自动把该默认的RequestBuilder合并到perform的RequestBuilder中；
* setGlobalResultMatchers：设置全局的预期结果验证规则，如我们通过MockMvc测试多个控制器时，假设它们都想验证某个规则时，就可以使用这个；
* setGlobalResultHandlers：设置全局的ResultHandler结果处理器；

  

#### 10.4.2.3. RequestBuilder/MockMvcRequestBuilders
<a href="#menu" >目录</a>

从名字可以看出，RequestBuilder用来构建请求的，其提供了一个方法buildRequest(ServletContext servletContext)用于构建MockHttpServletRequest；其主要有两个子类MockHttpServletRequestBuilder和MockMultipartHttpServletRequestBuilder（如文件上传使用），即用来Mock客户端请求需要的所有数据。


MockMvcRequestBuilders主要API：
* MockHttpServletRequestBuilder get(String urlTemplate, Object... urlVariables)：根据uri模板和uri变量值得到一个GET请求方式的MockHttpServletRequestBuilder；如get("/user/{id}", 1L)；
* MockHttpServletRequestBuilder post(String urlTemplate, Object... urlVariables)：同get类似，但是是POST方法；
* MockHttpServletRequestBuilder put(String urlTemplate, Object... urlVariables)：同get类似，但是是PUT方法；
* MockHttpServletRequestBuilder delete(String urlTemplate, Object... urlVariables) ：同get类似，但是是DELETE方法；
* MockHttpServletRequestBuilder options(String urlTemplate, Object... urlVariables)：同get类似，但是是OPTIONS方法；
* MockHttpServletRequestBuilder request(HttpMethod httpMethod, String urlTemplate, Object... urlVariables)：提供自己的Http请求方法及uri模板和uri变量，如上API都是委托给这个API；
* MockMultipartHttpServletRequestBuilder fileUpload(String urlTemplate, Object... urlVariables)：提供文件上传方式的请求，得到MockMultipartHttpServletRequestBuilder；
* RequestBuilder asyncDispatch(final MvcResult mvcResult)：创建一个从启动异步处理的请求的MvcResult进行异步分派的RequestBuilder；

接下来再看看MockHttpServletRequestBuilder和MockMultipartHttpServletRequestBuilder API：
* MockHttpServletRequestBuilder API：
* MockHttpServletRequestBuilder header(String name, Object... values)/MockHttpServletRequestBuilder headers(HttpHeaders httpHeaders)：添加头信息；
* MockHttpServletRequestBuilder contentType(MediaType mediaType)：指定请求的contentType头信息；
* MockHttpServletRequestBuilder accept(MediaType... mediaTypes)/MockHttpServletRequestBuilder accept(String... mediaTypes)：指定请求的Accept头信息；
* MockHttpServletRequestBuilder content(byte[] content)/MockHttpServletRequestBuilder content(String content)：指定请求Body体内容；
* MockHttpServletRequestBuilder cookie(Cookie... cookies)：指定请求的Cookie；
* MockHttpServletRequestBuilder locale(Locale locale)：指定请求的Locale；
* MockHttpServletRequestBuilder characterEncoding(String encoding)：指定请求字符编码；
* MockHttpServletRequestBuilder requestAttr(String name, Object value) ：设置请求属性数据；
* MockHttpServletRequestBuilder sessionAttr(String name, Object value)/MockHttpServletRequestBuilder sessionAttrs(Map<String, Object> * sessionAttributes)：设置请求session属性数据；
* MockHttpServletRequestBuilder flashAttr(String name, Object value)/MockHttpServletRequestBuilder flashAttrs(Map<String, Object> flashAttributes)：指定请求的flash信息，比如重定向后的属性信息；
* MockHttpServletRequestBuilder session(MockHttpSession session) ：指定请求的Session；
* MockHttpServletRequestBuilder principal(Principal principal) ：指定请求的Principal；
* MockHttpServletRequestBuilder contextPath(String contextPath) ：指定请求的上下文路径，必须以“/"开头，且不能以“/"结尾；
* MockHttpServletRequestBuilder pathInfo(String pathInfo) ：请求的路径信息，必须以“/"开头；
* MockHttpServletRequestBuilder secure(boolean secure)：请求是否使用安全通道；
* MockHttpServletRequestBuilder with(RequestPostProcessor postProcessor)：请求的后处理器，用于自定义一些请求处理的扩展点；

MockMultipartHttpServletRequestBuilder继承自MockHttpServletRequestBuilder，又提供了如下API：
* MockMultipartHttpServletRequestBuilder file(String name, byte[] content)/MockMultipartHttpServletRequestBuilder file(MockMultipartFile file)：指定要上传的文件；

 

#### 10.4.2.4. ResultActions
<a href="#menu" >目录</a>

调用MockMvc.perform(RequestBuilder requestBuilder)后将得到ResultActions，通过ResultActions完成如下三件事：
* ResultActions andExpect(ResultMatcher matcher) ：添加验证断言来判断执行请求后的结果是否是预期的；
* ResultActions andDo(ResultHandler handler) ：添加结果处理器，用于对验证成功后执行的动作，如输出下请求/结果信息用于调试；
* MvcResult andReturn() ：返回验证成功后的MvcResult；用于自定义验证/下一步的异步处理；

 

#### 10.4.2.5. ResultMatcher/MockMvcResultMatchers
<a href="#menu" >目录</a>

ResultMatcher用来匹配执行完请求后的结果验证，其就一个match(MvcResult result)断言方法，如果匹配失败将抛出相应的异常；spring mvc测试框架提供了很多***ResultMatchers来满足测试需求。注意这些***ResultMatchers并不是ResultMatcher的子类，而是返回ResultMatcher实例的。Spring mvc测试框架为了测试方便提供了MockMvcResultMatchers静态工厂方法方便操作；具体的API如下：
* HandlerResultMatchers handler()：请求的Handler验证器，比如验证处理器类型/方法名；此处的Handler其实就是处理请求的控制器；
* RequestResultMatchers request()：得到RequestResultMatchers验证器；
* ModelResultMatchers model()：得到模型验证器；
* ViewResultMatchers view()：得到视图验证器；
* FlashAttributeResultMatchers flash()：得到Flash属性验证；
* StatusResultMatchers status()：得到响应状态验证器；
* HeaderResultMatchers header()：得到响应Header验证器；
* CookieResultMatchers cookie()：得到响应Cookie验证器；
* ContentResultMatchers content()：得到响应内容验证器；
* JsonPathResultMatchers jsonPath(String expression, Object ... args)/ResultMatcher jsonPath(String expression, Matcher<T> matcher)：得到Json表达式验证器；
* XpathResultMatchers xpath(String expression, Object... args)/XpathResultMatchers xpath(String expression, Map<String, String> namespaces, Object... args)：得到Xpath表达式验证器；
* ResultMatcher forwardedUrl(final String expectedUrl)：验证处理完请求后转发的url（绝对匹配）；
* ResultMatcher forwardedUrlPattern(final String urlPattern)：验证处理完请求后转发的url（Ant风格模式匹配，@since spring4）；
* ResultMatcher redirectedUrl(final String expectedUrl)：验证处理完请求后重定向的url（绝对匹配）；
* ResultMatcher redirectedUrlPattern(final String expectedUrl)：验证处理完请求后重定向的url（Ant风格模式匹配，@since spring4）；


得到相应的***ResultMatchers后，接着再调用其相应的API得到ResultMatcher，如ModelResultMatchers.attributeExists(final String... names)判断Model属性是否存在。具体请查看相应的API。再次就不一一列举了。

#### 10.4.2.6. ResultHandler/MockMvcResultHandlers
<a href="#menu" >目录</a>

ResultHandler用于对处理的结果进行相应处理的，比如输出整个请求/响应等信息方便调试，Spring mvc测试框架提供了MockMvcResultHandlers静态工厂方法，该工厂提供了ResultHandler print()返回一个输出MvcResult详细信息到控制台的ResultHandler实现。


#### 10.4.2.7. MvcResult
<a href="#menu" >目录</a>

即执行完控制器后得到的整个结果，并不仅仅是返回值，其包含了测试时需要的所有信息，如：
* MockHttpServletRequest getRequest()：得到执行的请求；
* MockHttpServletResponse getResponse()：得到执行后的响应；
* Object getHandler()：得到执行的处理器，一般就是控制器；
* HandlerInterceptor[] getInterceptors()：得到对处理器进行拦截的拦截器；
* ModelAndView getModelAndView()：得到执行后的ModelAndView；
* Exception getResolvedException()：得到HandlerExceptionResolver解析后的异常；
* FlashMap getFlashMap()：得到FlashMap；
* Object getAsyncResult()/Object getAsyncResult(long timeout)：得到异步执行的结果；

### 10.4.3. 测试运行中的应用程序
<a href="#menu" >目录</a>

在真实的服务器里启动应用程序，用真实的Web浏览器访问它，这样比使用模拟的测试引擎更能展现应用程序在用户端的行为。但是，用真实的Web浏览器在真实的服务器上运行测试会很麻烦。虽然构建时的插件能把应用程序部署到Tomcat或者Jetty里，但它们配置起来多有不便。而且测试这么多，几乎不可能隔离运行，也很难不启动构建工具


使用@WebIntegrationTest在服务器里启动应用程序。
```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=ReadingListApplication.class)
@WebIntegrationTest
public class SimpleWebTest {
    @Test(expected=HttpClientErrorException.class)
    public void pageNotFound() {
        try {
            RestTemplate rest = new RestTemplate();
            rest.getForObject("http://localhost:8080/bogusPage", String.class);
            fail("Should result in HTTP 404");
        } catch (HttpClientErrorException e) {
            assertEquals(HttpStatus.NOT_FOUND, e.getStatusCode());
            throw e;
        }
    }
}

```

**用随机端口启动服务器**

让Spring Boot在随机选择的端口上启动服务器很方便。一种办法是将server.port属性设置为0，让Spring Boot选择一个随机的可用端口。 @WebIntegrationTest的value属性接受一个String数组，数组中的每项都是键值对，形如name=value，用来设置测试中使用的属性。要设置server.port，你可以这样做：@WebIntegrationTest(value={"server.port=0"})
另外，因为只要设置一个属性，所以还能有更简单的形式：@WebIntegrationTest("server.port=0")

通过value属性来设置属性通常还算方便。但@WebIntegrationTest还提供了一个randomPort属性，更明确地表示让服务器在随机端口上启动。你可以将randomPort设置为true，启用随机端口：
@WebIntegrationTest(randomPort=true)

既然我们在随机端口上启动了服务器，就需要在发起Web请求时确保使用正确的端口。此时的getForObject()方法在URL里硬编码了8080端口。如果端口是随机选择的，那在构造请求时又该怎么确定正确的端口呢？

首先，我们需要以实例变量的形式注入选中的端口。为了方便， Spring Boot将local.server.port的值设置为了选中的端口。我们只需使用Spring的@Value注解将其注入即可：
```java
@Value("${local.server.port}")
private int port;
```

有了端口之后，只需对getForObject()稍作修改，使用这个port就好了：rest.getForObject("http://localhost:{port}/bogusPage", String.class, port);这里我们在URL里把硬编码的8080改为{port}占位符。在getForObject()调用里把port属性作为最后一个参数传入，就能确保该占位符被替换为注入port的值了。





## 10.5. 服务层测试
<a href="#menu" >目录</a>

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
classes=AddressBookConfiguration.class)
public class AddressServiceTests {
    @Autowired
    private AddressService addressService;
    @Test
    public void testService() {
        Address address = addressService.findByLastName("Sheman");
        assertEquals("P", address.getFirstName());
    }
}

```

AddressServiceTests上加注了@RunWith和@ContextConfiguration注解。@RunWith的参数是SpringJUnit4ClassRunner.class，开启了Spring集成测试支持。@ContextConfiguration指定了如何加载应用程序上下文。此处我们让它加载AddressBookConfiguration里配置的Spring应用程序上下文

虽然@ContextConfiguration在加载Spring应用程序上下文的过程中做了很多事情，但它没能加载完整的Spring Boot。 Spring Boot应用程序最终是由SpringApplication加载的。它可
以显式加载，在这里也可以使用SpringBootServletInitializer。 SpringApplication不仅加载应用程序上下文，还会开启日志、加载外部属性（ application.properties或application.yml），以及其他Spring Boot特性。用@ContextConfiguration则得不到这些特性。要在集成测试里获得这些特性，可以把@ContextConfiguration替换为Spring Boot的
@SpringApplicationConfiguration：

@SpringApplicationConfiguration的用法和@ContextConfiguration大致相同，但也有不同的地方， @SpringApplicationConfiguration加载Spring应用程序上下文的方式同
SpringApplication相同，处理方式和生产应用程序中的情况相同。这包括加载外部属性和Spring Boot日志。为Spring Boot应用程序编写测试时应该用SpringApplicationConfiguration代替@ContextConfiguration。


```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(
classes=AddressBookConfiguration.class)
public class AddressServiceTests {

}
```


## 10.6. DAO层测试
<a href="#menu" >目录</a>


## 10.7. SpringBoot实现单元测试时回滚事务
<a href="#menu" >目录</a>

SpringBoot跑个单元测试只需要在测试类加两个注解就行了。

```java
@RunWith(SpringRunner.class)
@SpringBootTest
```

然而这样的单元测试默认是提交事务的，一般的场景下都是要对事务进行回滚的。要支持回滚，只需要增加一个@Transactional注解即可。

```java
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
```
单独的@Transactional是回滚事务，在添加@Transactional的情况下如果要提交事务，只需要增加@Rollback(false)：

```java
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
```

由于@Rollback可以用在方法上，所以一个测试类中，我们可以实现部分测试方法用@Rollback回滚事务，部分测试方法用@Rollback(false)来提交事务。
