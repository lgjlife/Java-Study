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

## 创建Bean

* 注解配置方式

 @Component， @Controller, @Service, @Repository 
```java
@Component
public class User{
    
}
```
* xml 配置方式
```xml
<beans>
    <bean  id="user"   class="com.User">        
    </bean>
</beans>

```

* Java配置方式，推荐
```java
@Configuration
public UserConfig{
    
    @Bean
    //会自动注入已经创建好的Location bean
    public User user(Location location){
        return new User(location);
    }
}

```

* 依赖注入:Setter注入 
```xml
<beans>
    <bean  id="user"   class="com.User">   
    <!-- ref 指定注入bean的ID-->
        <property name="location"    ref="location"></property>      
    </bean>
</beans>

```

* 依赖注入:构造函数注入 
    
```xml
<beans>
    <bean  id="user"   class="com.User">   
    <!-- ref 指定注入bean的ID-->
        <constructor-arg   ref="location"></property>      
    </bean>
</beans>

```
* 循环依赖问题。
比如User和Location 互相依赖，在使用构造函数注入时，需要对方创建好bean之后自己才能创建，由于对方还未创建Bean，便无法注入。
解决这个问题时使用Setter注入方式

* [ BeanFatory和ApplicationContext总结](https://www.cnblogs.com/xiaoxi/p/5846416.html)

* 父子容器
    * 通过HierarchicalBeanFactory接口，IOC容器可以建立父子层级关联的容器体系，子容器可以访问父容器中的bean。
  反之则不行。Bean ID在容器内必须唯一。
  通过这个可以实现MVC架构中展现曾可以访问业务曾和持久曾的Bean，反之则不行。

* [Bean生命周期](https://www.cnblogs.com/lgjlife/p/10664320.html)
![]()
## Bean 作用域
|||
|---|---|
|singleton|单例|
|prototype|多例|
|request|每次Http请求都会创建一个新的Bean,该作用仅适用于WebApplicationContext环境|
|session|同一个HttpSession共享一个Bean，该作用仅适用于WebApplicationContext环境|
|globalSession|同一个全局Session共享一个Bean，一般用于 Portlet该作用仅适用于WebApplicationContext环境|
通过以下两种方式配置
```java
<bean id="xxx" scope="singleton"/>

@Scope("singleton") (配合@Bean 或者@Component)
```
* singleton单例模式不应该存在实例共享变量，也就是无状态单例，否则会产生安全问题。可以使用LocalThread变量解决这个问题。
* 默认情况下，Spring 容器启动时不实例化prototype的bean。即Spring不能对该Bean的整个生命周期负责。具有prototype作用域的Bean创建后交由调用者负责销毁对象回收资源
* 需要回收重要资源(数据库连接等)的事宜配置为singleton，如果配置为prototype需要应用确保资源正常回收。
* 有状态的Bean配置成singleton会引发未知问题，可以考虑配置为prototype


## AOP面向切面编程
* 基本概念
|||
|---|---|
|连接点JoinPoint||
|切点Pointcut||
|增强Advice||
|目标对象Target||
|引介Introduction||
|织入||
|代理||
|切面||
