# Spring

## 基本概念

* POJO: 简单的Java对象(Plain Old Java Object)
* 控制反转(IOC Inversion of Control)：对象不再由使用者通过new来创建，而是交由容器创建并管理。
* 依赖注入(DI)： 应用程序不负责寻找它们依赖的对象，而是由IOC容器处理对象的创建和依赖注入。
    * 构造函数注入
        * 容器中同一个对象实例都有一致的状态，并且创建之后就可以使用
    * Setter方法注入
        * 在运行的过程中，随时更换注入的对象
    * 应当两种都需要提供
## Spring 常用注解
* @Autowired : 按类型注入bean
    * required : 默认为true ,如果找不到注入对象，将会抛出异常
* @Qualifier: 用于指定bean的ID
    * value 
* @Resource  : 类似@Autowired，这个是按name注入bean
* @Component， @Controller, @Service, @Repository :功能一样，被注解的类将会被容器注册成单例bean。不同的名字只是为了分层。
