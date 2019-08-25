

<span id="menu"></span>

<!-- TOC -->

- [1. Spring 体系](#1-spring-体系)
    - [1.1. Spring](#11-spring)
        - [1.1.1. IOC容器](#111-ioc容器)
            - [1.1.1.1. 控制反转和依赖注入](#1111-控制反转和依赖注入)
            - [1.1.1.2. 注入方式](#1112-注入方式)
                - [1.1.1.2.1. setter注入与构造方法注入](#11121-setter注入与构造方法注入)
                - [1.1.1.2.2. 自动注入方式](#11122-自动注入方式)
        - [1.1.2. IOC容器](#112-ioc容器)
        - [1.1.3. AOP面向切面编程](#113-aop面向切面编程)
        - [1.1.4. Spring 事务管理](#114-spring-事务管理)
            - [1.1.4.1. 数据库事务基础知识](#1141-数据库事务基础知识)
            - [1.1.4.2. Spring 对事务管理的支持](#1142-spring-对事务管理的支持)
                - [1.1.4.2.1. Spring事务传播行为和隔离级别](#11421-spring事务传播行为和隔离级别)
                - [1.1.4.2.2. 事务管理关键抽象](#11422-事务管理关键抽象)
                - [1.1.4.2.3. 事务管理器实现类](#11423-事务管理器实现类)
            - [1.1.4.3. 编程式事务管理](#1143-编程式事务管理)
            - [1.1.4.4. 使用XML配置声明式事务](#1144-使用xml配置声明式事务)
            - [1.1.4.5. 使用注解配置事务](#1145-使用注解配置事务)
            - [1.1.4.6. 事务实现原理](#1146-事务实现原理)
        - [1.1.5. Spring Cache](#115-spring-cache)
            - [1.1.5.1. 几个重要概念&缓存注解](#1151-几个重要概念缓存注解)
            - [1.1.5.2. SpEL上下文数据](#1152-spel上下文数据)
            - [1.1.5.3. 基本使用](#1153-基本使用)
        - [1.1.6. 常用注解](#116-常用注解)
        - [1.1.7. 常用工具类](#117-常用工具类)
    - [1.2. Sppring MVC](#12-sppring-mvc)
        - [1.2.1. MVC体系概述](#121-mvc体系概述)
            - [1.2.1.1. MVC 架构](#1211-mvc-架构)
        - [1.2.2. Restful](#122-restful)
            - [1.2.2.1. URL 设计](#1221-url-设计)
            - [1.2.2.2. 状态码](#1222-状态码)
            - [1.2.2.3. 服务器回应](#1223-服务器回应)
        - [1.2.3. 注解说明](#123-注解说明)
        - [1.2.4. 拦截器](#124-拦截器)
        - [1.2.5. 过滤器](#125-过滤器)
            - [1.2.5.1. 过滤器和拦截器的区别：](#1251-过滤器和拦截器的区别)
            - [1.2.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途](#1252-拦截器interceptor和过滤器filter的一些用途)
    - [1.3. SpringBoot](#13-springboot)
        - [1.3.1. 基本概念](#131-基本概念)
        - [1.3.2. Spring Boot 环境下创建Bean](#132-spring-boot-环境下创建bean)
    - [1.4. SpringCloud](#14-springcloud)
        - [1.4.1. 基础知识](#141-基础知识)
        - [1.4.2. 服务治理Eureka](#142-服务治理eureka)
            - [1.4.2.1. 基本使用](#1421-基本使用)
            - [1.4.2.2. 高可用注册中心](#1422-高可用注册中心)
            - [1.4.2.3. 原理说明](#1423-原理说明)
                - [1.4.2.3.1. 基础模块说明](#14231-基础模块说明)
                - [1.4.2.3.2. Region,Zone](#14232-regionzone)
                - [1.4.2.3.3. 源码分析](#14233-源码分析)
            - [1.4.2.4. 更多配置说明](#1424-更多配置说明)
        - [1.4.3. 负载均衡Ribbon](#143-负载均衡ribbon)
            - [1.4.3.1. 基本使用](#1431-基本使用)
            - [1.4.3.2. 原理说明](#1432-原理说明)
                - [1.4.3.2.1. 源码分析](#14321-源码分析)
                - [1.4.3.2.2. 负载均衡器](#14322-负载均衡器)
                - [1.4.3.2.3. 负载均衡策略](#14323-负载均衡策略)
                - [1.4.3.2.4. 配置详解](#14324-配置详解)
        - [1.4.4. 声明式服务调用feign](#144-声明式服务调用feign)
            - [1.4.4.1. 使用案例](#1441-使用案例)
        - [1.4.5. 服务容错保护 Hystrix](#145-服务容错保护-hystrix)
        - [1.4.6. API网关服务](#146-api网关服务)
            - [1.4.6.1. zuul](#1461-zuul)
            - [1.4.6.2. GateWay](#1462-gateway)
        - [1.4.7. 分布式配置中心Config](#147-分布式配置中心config)
            - [1.4.7.1. 基本使用](#1471-基本使用)
                - [1.4.7.1.1. 配置中心](#14711-配置中心)
                - [1.4.7.1.2. bootstrap.yml与application.yml区别](#14712-bootstrapyml与applicationyml区别)
                - [1.4.7.1.3. 客户端配置](#14713-客户端配置)
                - [1.4.7.1.4. 刷新配置](#14714-刷新配置)
            - [1.4.7.2. 原理说明](#1472-原理说明)
            - [1.4.7.3. 更多使用方式](#1473-更多使用方式)
        - [1.4.8. 消息总线bus](#148-消息总线bus)
            - [1.4.8.1. 消息代理](#1481-消息代理)
        - [1.4.9. 消息驱动的微服务Stream](#149-消息驱动的微服务stream)
        - [1.4.10. 分布式服务跟踪Sleuth](#1410-分布式服务跟踪sleuth)
            - [1.4.10.1. 基本使用](#14101-基本使用)
            - [1.4.10.2. 跟踪原理](#14102-跟踪原理)
                - [1.4.10.2.1. 基本实现原理](#141021-基本实现原理)
                - [1.4.10.2.2. 支持的组件](#141022-支持的组件)
                - [1.4.10.2.3. 一些基本概念](#141023-一些基本概念)
                - [1.4.10.2.4. zipkin](#141024-zipkin)
                - [1.4.10.2.5. 调用过程](#141025-调用过程)
    - [1.5. 测试](#15-测试)
        - [1.5.1. 基本测试](#151-基本测试)
        - [1.5.2. 控制层测试](#152-控制层测试)
        - [1.5.3. 服务层测试](#153-服务层测试)
        - [1.5.4. DAO层测试](#154-dao层测试)

<!-- /TOC -->
# 1. Spring 体系

## 1.1. Spring
<a href="#menu" style="float:right">目录</a>

### 1.1.1. IOC容器
<a href="#menu" style="float:right">目录</a>

#### 1.1.1.1. 控制反转和依赖注入
<a href="#menu" style="float:right">目录</a>

**IoC是什么**
　　Ioc—Inversion of Control，即“控制反转”，不是什么技术，而是一种设计思想。在Java开发中，Ioc意味着将你设计好的对象交给容器控制，而不是传统的在你的对象内部直接控制。如何理解好Ioc呢？理解好Ioc的关键是要明确“谁控制谁，控制什么，为何是反转（有反转就应该有正转了），哪些方面反转了”，那我们来深入分析一下：
* 谁控制谁，控制什么：传统Java SE程序设计，我们直接在对象内部通过new进行创建对象，是程序主动去创建依赖对象；而IoC是有专门一个容器来创建这些对象，即由Ioc容器来控制对 象的创建；谁控制谁？当然是IoC 容器控制了对象；控制什么？那就是主要控制了外部资源获取（不只是对象包括比如文件等）。
* 为何是反转，哪些方面反转了：有反转就有正转，传统应用程序是由我们自己在对象中主动控制去直接获取依赖对象，也就是正转；而反转则是由容器来帮忙创建及注入依赖对象；为何是反转？因为由容器帮我们查找及注入依赖对象，对象只是被动的接受依赖对象，所以是反转；哪些方面反转了？依赖对象的获取被反转了。

**IoC能做什么**
　　IoC 不是一种技术，只是一种思想，一个重要的面向对象编程的法则，它能指导我们如何设计出松耦合、更优良的程序。传统应用程序都是由我们在类内部主动创建依赖对象，从而导致类与类之间高耦合，难于测试；有了IoC容器后，把创建和查找依赖对象的控制权交给了容器，由容器进行注入组合对象，所以对象与对象之间是 松散耦合，这样也方便测试，利于功能复用，更重要的是使得程序的整个体系结构变得非常灵活。
其实IoC对编程带来的最大改变不是从代码上，而是从思想上，发生了“主从换位”的变化。应用程序原本是老大，要获取什么资源都是主动出击，但是在IoC/DI思想中，应用程序就变成被动的了，被动的等待IoC容器来创建并注入它所需要的资源了。

IoC很好的体现了面向对象设计法则之一—— 好莱坞法则：“别找我们，我们找你”；即由IoC容器帮对象找相应的依赖对象并注入，而不是由对象主动去找。

**IoC和DI**
　　DI—Dependency Injection，即“依赖注入”：组件之间依赖关系由容器在运行期决定，形象的说，即由容器动态的将某个依赖关系注入到组件之中。依赖注入的目的并非为软件系统带来更多功能，而是为了提升组件重用的频率，并为系统搭建一个灵活、可扩展的平台。通过依赖注入机制，我们只需要通过简单的配置，而无需任何代码就可指定目标需要的资源，完成自身的业务逻辑，而不需要关心具体的资源来自何处，由谁实现。

理解DI的关键是：“谁依赖谁，为什么需要依赖，谁注入谁，注入了什么”，那我们来深入分析一下：
* 谁依赖于谁：当然是应用程序依赖于IoC容器；
* 为什么需要依赖：应用程序需要IoC容器来提供对象需要的外部资源；
* 谁注入谁：很明显是IoC容器注入应用程序某个对象，应用程序依赖的对象；
* 注入了什么：就是注入某个对象所需要的外部资源（包括对象、资源、常量数据）。

IoC和DI由什么关系呢？其实它们是同一个概念的不同角度描述，由于控制反转概念比较含糊（可能只是理解为容器控制对象这一个层面，很难让人想到谁来维护对象关系），所以2004年大师级人物Martin Fowler又给出了一个新的名字：“依赖注入”，相对IoC 而言，“依赖注入”明确描述了“被注入对象依赖IoC容器配置依赖对象”。


**IoC(控制反转)**
　　首先想说说IoC（Inversion of Control，控制反转）。这是spring的核心，贯穿始终。所谓IoC，对于spring框架来说，就是由spring来负责控制对象的生命周期和对象间的关系。这是什么意思呢，举个简单的例子，我们是如何找女朋友的？常见的情况是，我们到处去看哪里有长得漂亮身材又好的mm，然后打听她们的兴趣爱好、qq号、电话号、ip号、iq号………，想办法认识她们，投其所好送其所要，然后嘿嘿……这个过程是复杂深奥的，我们必须自己设计和面对每个环节。传统的程序开发也是如此，在一个对象中，如果要使用另外的对象，就必须得到它（自己new一个，或者从JNDI中查询一个），使用完之后还要将对象销毁（比如Connection等），对象始终会和其他的接口或类藕合起来。

　　那么IoC是如何做的呢？有点像通过婚介找女朋友，在我和女朋友之间引入了一个第三者：婚姻介绍所。婚介管理了很多男男女女的资料，我可以向婚介提出一个列表，告诉它我想找个什么样的女朋友，比如长得像李嘉欣，身材像林熙雷，唱歌像周杰伦，速度像卡洛斯，技术像齐达内之类的，然后婚介就会按照我们的要求，提供一个mm，我们只需要去和她谈恋爱、结婚就行了。简单明了，如果婚介给我们的人选不符合要求，我们就会抛出异常。整个过程不再由我自己控制，而是有婚介这样一个类似容器的机构来控制。Spring所倡导的开发方式就是如此，所有的类都会在spring容器中登记，告诉spring你是个什么东西，你需要什么东西，然后spring会在系统运行到适当的时候，把你要的东西主动给你，同时也把你交给其他需要你的东西。所有的类的创建、销毁都由 spring来控制，也就是说控制对象生存周期的不再是引用它的对象，而是spring。对于某个具体的对象而言，以前是它控制其他对象，现在是所有对象都被spring控制，所以这叫控制反转。

**DI(依赖注入)**
　　IoC的一个重点是在系统运行中，动态的向某个对象提供它所需要的其他对象。这一点是通过DI（Dependency Injection，依赖注入）来实现的。比如对象A需要操作数据库，以前我们总是要在A中自己编写代码来获得一个Connection对象，有了 spring我们就只需要告诉spring，A中需要一个Connection，至于这个Connection怎么构造，何时构造，A不需要知道。在系统运行时，spring会在适当的时候制造一个Connection，然后像打针一样，注射到A当中，这样就完成了对各个对象之间关系的控制。A需要依赖 Connection才能正常运行，而这个Connection是由spring注入到A中的，依赖注入的名字就这么来的。那么DI是如何实现的呢？ Java 1.3之后一个重要特征是反射（reflection），它允许程序在运行的时候动态的生成对象、执行对象的方法、改变对象的属性，spring就是通过反射来实现注入的。

#### 1.1.1.2. 注入方式

##### 1.1.1.2.1. setter注入与构造方法注入
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

##### 1.1.1.2.2. 自动注入方式

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

### 1.1.2. IOC容器
<a href="#menu" style="float:right">目录</a>


### 1.1.3. AOP面向切面编程
<a href="#menu" style="float:right">目录</a>

### 1.1.4. Spring 事务管理
<a href="#menu" style="float:right">目录</a>

#### 1.1.4.1. 数据库事务基础知识
<a href="#menu" style="float:right">目录</a>

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
    * 幻读是事务非独立执行时发生的一种现象。例如事务T1对一个表中所有的行的某个数据项做了从“1”修改为“2”的操作，这时事务T2又对这个表中插入了一行数据项，而这个数据项的数值还是为“1”并且提交给数据库。而操作事务T1的用户如果再查看刚刚修改的数据，会发现还有一行没有修改，其实这行是从事务T2中添加的，就好像产生幻觉一样，这就是发生了幻读。
    * 幻读和不可重复读都是读取了另一条已经提交的事务（这点就脏读不同），所不同的是不可重复读查询的都是同一个数据项，而幻读针对的是一批数据整体（比如数据的个数）。

SQL标准定义了4类隔离级别，包括了一些具体规则，用来限定事务内外的哪些改变是可见的，哪些是不可见的。低级别的隔离级一般支持更高的并发处理，并拥有更低的系统开销。
MySQL数据库的四种事务隔离级别
* Read Uncommitted（读取未提交内容）
    * 在该隔离级别，所有事务都可以看到其他未提交事务的执行结果。本隔离级别很少用于实际应用，因为它的性能也不比其他级别好多少。读取未提交的数据，也被称之为脏读（Dirty Read）；
* Read Committed（读取提交内容）
    * 这是大多数数据库系统的默认隔离级别（但不是MySQL默认的）。它满足了隔离的简单定义：一个事务只能看见已经提交事务所做的改变。这种隔离级别 也支持所谓的不可重复读（Nonrepeatable Read），因为同一事务的其他实例在该实例处理其间可能会有新的commit，所以同一select可能返回不同结果；
* Repeatable Read（可重读）
    * 这是MySQL的默认事务隔离级别，它确保同一事务的多个实例在并发读取数据时，会看到同样的数据行。不过理论上，这会导致另一个棘手的问题：幻读 （Phantom Read）。
    * 简单的说，幻读指当用户读取某一范围的数据行时，另一个事务又在该范围内插入了新行，当用户再读取该范围的数据行时，会发现有新的“幻影” 行。
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
Spring事务的本质其实就是数据库对事务的支持，没有数据库的事务支持，spring是无法提供事务功能的。对于纯JDBC操作数据库，想要用到事务，可以按照以下步骤进行：

* 获取连接 Connection con = DriverManager.getConnection()
* 开启事务con.setAutoCommit(true/false);
* 执行CRUD
* 提交事务/回滚事务 con.commit() / con.rollback();
* 关闭连接 conn.close()；

使用Spring的事务管理功能后，我们可以不再写步骤 2 和 4 的代码，而是由Spirng 自动完成。那么Spring是如何在我们书写的 CRUD 之前和之后开启事务和关闭事务的呢？解决这个问题，也就可以从整体上理解Spring的事务管理实现原理了。下面简单地介绍下，注解方式为例子

* 配置文件开启注解驱动，在相关的类和方法上通过注解@Transactional标识。
* spring 在启动的时候会去解析生成相关的bean，这时候会查看拥有相关注解的类和方法，并且为这些类和方法生成代理，并根据@Transaction的相关参数进行相关配置注入，这样就在代理中为我们把相关的事务处理掉了（开启正常提交事务，异常回滚事务）。
* 真正的数据库层的事务提交和回滚是通过binlog或者redo log实现的


#### 1.1.4.2. Spring 对事务管理的支持
<a href="#menu" style="float:right">目录</a>

##### 1.1.4.2.1. Spring事务传播行为和隔离级别

**嵌套事务**
嵌套是子事务套在父事务中执行，子事务是父事务的一部分，在进入子事务之前，父事务建立一个回滚点，叫save point，然后执行子事务，这个子事务的执行也算是父事务的一部分，然后子事务执行结束，父事务继续执行。重点就在于那个save point。看几个问题就明了了：

* 如果子事务回滚，会发生什么？
父事务会回滚到进入子事务前建立的save point，然后尝试其他的事务或者其他的业务逻辑，父事务之前的操作不会受到影响，更不会自动回滚。

* 如果父事务回滚，会发生什么？
父事务回滚，子事务也会跟着回滚！为什么呢，因为父事务结束之前，子事务是不会提交的，我们说子事务是父事务的一部分，正是这个道理。

* 事务的提交，是什么情况？
是父事务先提交，然后子事务提交，还是子事务先提交，父事务再提交？答案是第二种情况，还是那句话，子事务是父事务的一部分，由父事务统一提交。


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


**例子讲解以上七中事务传播机制**
假设有类A的方法methodB(),有类B的方法methodB().
![](https://img-blog.csdn.net/20170228222731090)

* **PROPAGATION_REQUIRED**

A.methodA()调用B的methodB()方法，那么如果A的方法包含事务，则B的方法则不重新开启事务，
1. 如果B的methodB()抛出异常，A的methodB()没有捕获，则A和B的事务都会回滚；
2. 如果B的methodB()运行期间异常会导致B的methodB()的回滚，A如果捕获了异常，并正常提交事务，则会发生Transaction rolled back because it has been marked as rollback-only的异常。
3. 如果A的methodA()运行期间异常，则A和B的Method的事务都会被回滚

* **PROPAGATION_SUPPORTS**

A.methodA()调用B的methodB()方法，那么如果A的方法包含事务，则B运行在此事务环境中，如果A的方法不包含事务，则B运行在非事务环境；
1. 如果A没有事务，则A和B的运行出现异常都不会回滚。
2. 如果A有事务，A的method方法执行抛出异常，B.methodB和A.methodA都会回滚。
3. 如果A有事务，B.method抛出异常，B.methodB和A.methodA都会回滚，如果A捕获了B.method抛出的异常，则会出现异常Transactionrolled back because it has been marked as rollback-only。

 

* **PROPAGATION_MANDATORY**

表示当前方法必须在一个事务中运行，如果没有事务，将抛出异常，如下图调用关系：
B.methodB()事务传播特性定义为:PROPAGATION_MANDATORY
1. 如果A的methoda()方法没有事务运行环境，则B的methodB()执行的时候会报如下异常：No existingtransaction found for transaction marked with propagation 'mandatory'
2. 如果A的Methoda()方法有事务并且执行过程中抛出异常，则A.methoda（）和B.methodb（）执行的操作被回滚；
3. 如果A的methoda()方法有事务，则B.methodB()抛出异常时，A的methoda()和B.methodB()都会被回滚；如果A捕获了B.method抛出的异常，则会出现异常Transaction rolled back because ithas been marked as rollback-only

* **PROPAGATION_NESTED**

B的methodB()定义的事务为PROPAGATION_NESTED；
1. 如果A的MethodA()不存在事务，则B的methodB()运行在一个新的事务中，B.method()抛出的异常，B.methodB()回滚,但A.methodA()不回滚；如果A.methoda()抛出异常，则A.methodA()和B.methodB()操作不回。
2. 如果A的methodA()存在事务，则A的methoda()抛出异常，则A的methoda()和B的Methodb()都会被回滚；
3. 如果A的MethodA()存在事务，则B的methodB()抛出异常，B.methodB()回滚，如果A不捕获异常，则A.methodA()和B.methodB()都会回滚，如果A捕获异常，则B.methodB()回滚,A不回滚；

* **PROPAGATION_NEVER**

表示事务传播特性定义为PROPAGATION_NEVER的方法不应该运行在一个事务环境中

如果B.methodB()的事务传播特性被定义为PROPAGATION_NEVER，则如果A.methodA()方法存在事务，则会出现异常Existingtransaction found for transaction marked with propagation 'never'。

* **PROPAGATION_REQUIRES_NEW**

表示事务传播特性定义为PROPAGATION_REQUIRES_NEW的方法需要运行在一个新的事务中。
1. 如果A存在事务，A.methodA()抛出异常，A.methodA()的事务被回滚，但B.methodB()事务不受影响；如果B.methodB()抛出异常，A不捕获的话，A.methodA()和B.methodB()的事务都会被回滚。如果A捕获的话，A.methodA()的事务不受影响但B.methodB()的事务回滚。

* **PROPAGATION_NOT_SUPPORTED**

表示该方法不应该在一个事务中运行。如果有一个事务正在运行，他将在运行期被挂起，直到这个事务提交或者回滚才恢复执行。
1. 如果A.methodA()存在事务，如果B.methodB()抛出异常，A.methodA()不捕获的话，A.methodA()的事务被回滚，而B.methodB()出现异常前数据库操作不受影响。如果A.methodA()捕获的话，则A.methodA()的事务不受影响，B.methodB()异常抛出前的数据操作不受影响。


**实际场景中的七大事务传播行为的使用**
1. 在一个话费充值业务处理逻辑中，有如下图所示操作:
![](https://img-blog.csdn.net/20170228222113143?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcG1sMTg3MTA5NzMwMzY=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

业务需要扣款操作和创建订单操作同成功或者失败，因此，charger()和order()的事务不能相互独立，需要包含在chargeHandle()的事务中；
通过以上需求，可以给charge()和order()的事务传播行为定义成：PROPAGATION_MANDATORY
只要charge()或者order()抛出异常整个chargeHandle()都一起回滚，即使chargeHandle()捕获异常也没用，不允许提交事务。

2. 如果业务需求每接受到一次请求到要记录日志到数据库，如下图：
![](https://img-blog.csdn.net/20170228222320615?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcG1sMTg3MTA5NzMwMzY=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

因为log()的操作不管扣款和创建订单成功与否都要生成日志，并且日志的操作成功与否不影响充值处理，所以log()方法的事务传播行为可以定义为:PROPAGATION_REQUIRES_NEW.

3. 在订单的售后处理中，更新完订单金额后，需要自动统计销售报表，如下图所示：
![](https://img-blog.csdn.net/20170228222423429)
根据业务可知，售后是已经处理完订单的充值请求后的功能，是对订单的后续管理，统计报表report()方法耗时较长，因此，我们需要设置report()的事务传播行为为:PROPAGATION_NEVER,表示不适合在有事务的操作中调用，因为report()太耗时。


4. 在银行新增银行卡业务中，需要执行两个操作，一个是保存银行卡信息，一个是登记新创建的银行卡信息，其中登记银行卡信息成功与否不影响银行卡的创建。
![](https://img-blog.csdn.net/20170228222634004)


由以上需求，我们可知对于regster()方法的事务传播行为，可以设置为PROPAGATION_NESTED，action()事务的回滚，regster()保存的信息就没意义，也就需要跟着回滚，而regster()的回滚不影响action()事务；insert()的事务传播行为可以设置为PROPAGATION_REQUIRED, PROPAGATION_MANDATORY，即insert()回滚事务，action()的事务必须跟着回滚。





**spring 什么情况下进行事务回滚**

Spring、EJB的声明式事务默认情况下都是在抛出unchecked exception后才会触发事务的回滚

unchecked异常,即运行时异常runntimeException 回滚事务;

checked异常,即Exception可try{}捕获的不会回滚.当然也可配置spring参数让其回滚.

spring的事务边界是在调用业务方法之前开始的，业务方法执行完毕之后来执行commit or rollback(Spring默认取决于是否抛出runtime异常).
如果抛出runtime exception 并在你的业务方法中没有catch到的话，事务会回滚。
一般不需要在业务方法中catch异常，如果非要catch，在做完你想做的工作后（比如关闭文件等）一定要抛出runtime exception，否则spring会将你的操作commit,这样就会产生脏数据.所以你的catch代码是画蛇添足。

**Spring中的隔离级别**
|常量|	解释|
|---|---|
|ISOLATION_DEFAULT|	这是个 PlatfromTransactionManager 默认的隔离级别，使用数据库默认的事务隔离级别。另外四个与 JDBC 的隔离级别相对应。
|ISOLATION_READ_UNCOMMITTED	|这是事务最低的隔离级别，它充许另外一个事务可以看到这个事务未提交的数据。这种隔离级别会产生脏读，不可重复读和幻像读。
|ISOLATION_READ_COMMITTED|	保证一个事务修改的数据提交后才能被另外一个事务读取。另外一个事务不能读取该事务未提交的数据。
|ISOLATION_REPEATABLE_READ|	这种事务隔离级别可以防止脏读，不可重复读。但是可能出现幻像读。
|ISOLATION_SERIALIZABLE|这是花费最高代价但是最可靠的事务隔离级别。事务被处理为顺序执行。

##### 1.1.4.2.2. 事务管理关键抽象

事务管理的抽象主要包含以下三个接口
```java
org.springframework.transaction.PlatformTransactionManager
org.springframework.transaction.TransactionDefinition
org.springframework.transaction.TransactionStatus
```

**org.springframework.transaction.TransactionDefinition**
用于描述事务的隔离级别，超时时间，是否是只读事务和事务传播规则等控制事务具体行为的事务属性，这些事务属性可以通过XML方式、注解、编程方式指定
PlatformTransactionManager根据TransactionDefinition指定的参数创建事务，并用TransactionStatus描述事务状态


* **TransactionDefinition**
定义了事务传播行为和隔离特性的常量
```java

package org.springframework.transaction;

import org.springframework.lang.Nullable;

public interface TransactionDefinition {

    //事务传播行为
	int PROPAGATION_REQUIRED = 0;
	int PROPAGATION_SUPPORTS = 1;
	int PROPAGATION_MANDATORY = 2;
	int PROPAGATION_REQUIRES_NEW = 3;
	int PROPAGATION_NOT_SUPPORTED = 4;
	int PROPAGATION_NEVER = 5;
	int PROPAGATION_NESTED = 6;
    //事务隔离特性
	int ISOLATION_DEFAULT = -1;
	int ISOLATION_READ_UNCOMMITTED = 1;  // same as java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
	int ISOLATION_READ_COMMITTED = 2;  // same as java.sql.Connection.TRANSACTION_READ_COMMITTED;
	int ISOLATION_REPEATABLE_READ = 4;  // same as java.sql.Connection.TRANSACTION_REPEATABLE_READ;
	int ISOLATION_SERIALIZABLE = 8;  // same as java.sql.Connection.TRANSACTION_SERIALIZABLE;

    //事务超时时间，超时时间到就执行回滚
	int TIMEOUT_DEFAULT = -1;


	default int getPropagationBehavior() {
		return PROPAGATION_REQUIRED;
	}
	default int getIsolationLevel() {
		return ISOLATION_DEFAULT;
	}

	default int getTimeout() {
		return TIMEOUT_DEFAULT;
	}

    //只读状态，只读事务会进行相关的优化，提高运行性能
	default boolean isReadOnly() {
		return false;
	}
    //事务名称
	@Nullable
	default String getName() {
		return null;
	}

	static TransactionDefinition withDefaults() {
		return StaticTransactionDefinition.INSTANCE;
	}

}

```

* **TransactionStatus**

TransactionStatus代表一个事务的具体运行状态，事务管理器可以通过该接口获取事务运行期的状态信息，也可以通过该接口间接的回滚事务。相比于抛出异常时回滚事务的方式更具有可控性。
SavepointManager基于JDBC3.0保存点的分段事务控制能力提供了嵌套事务的机制
```java
public interface SavepointManager {

	/**
	 * Create a new savepoint. You can roll back to a specific savepoint
	 * via {@code rollbackToSavepoint}, and explicitly release a savepoint
	 * that you don't need anymore via {@code releaseSavepoint}.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints at transaction completion.
	 * @return a savepoint object, to be passed into
	 * {@link #rollbackToSavepoint} or {@link #releaseSavepoint}
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the savepoint could not be created,
	 * for example because the transaction is not in an appropriate state
	 * @see java.sql.Connection#setSavepoint
	 */
     //创建保存点对象
	Object createSavepoint() throws TransactionException;

	/**
	 * Roll back to the given savepoint.
	 * <p>The savepoint will <i>not</i> be automatically released afterwards.
	 * You may explicitly call {@link #releaseSavepoint(Object)} or rely on
	 * automatic release on transaction completion.
	 * @param savepoint the savepoint to roll back to
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the rollback failed
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 */
     //将事务回滚到特定的保存点上，被回滚的保存点将自动释放
	void rollbackToSavepoint(Object savepoint) throws TransactionException;

	/**
	 * Explicitly release the given savepoint.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints on transaction completion.
	 * <p>Implementations should fail as silently as possible if proper
	 * resource cleanup will eventually happen at transaction completion.
	 * @param savepoint the savepoint to release
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the release failed
	 * @see java.sql.Connection#releaseSavepoint
	 */
     //释放保存点，如果事务提交，则所有的保存点将会自动释放，无需手动清除
	void releaseSavepoint(Object savepoint) throws TransactionException;

}
public interface TransactionExecution {

	/**
	 * Return whether the present transaction is new; otherwise participating
	 * in an existing transaction, or potentially not running in an actual
	 * transaction in the first place.
	 */
     //是否是一个新事务，false:当前事务是一个已经存在的事务，或者当前未运行在事务环境中
	boolean isNewTransaction();

	/**
	 * Set the transaction rollback-only. This instructs the transaction manager
	 * that the only possible outcome of the transaction may be a rollback, as
	 * alternative to throwing an exception which would in turn trigger a rollback.
	 */
     
	void setRollbackOnly();

	/**
	 * Return whether the transaction has been marked as rollback-only
	 * (either by the application or by the transaction infrastructure).
	 */
	boolean isRollbackOnly();

	/**
	 * Return whether this transaction is completed, that is,
	 * whether it has already been committed or rolled back.
	 */
     //事务是否已经结束(提交或者回滚)
	boolean isCompleted();

}


public interface TransactionStatus extends TransactionExecution, SavepointManager, Flushable {


	/**
	 * Return whether this transaction internally carries a savepoint,
	 * that is, has been created as nested transaction based on a savepoint.
	 * <p>This method is mainly here for diagnostic purposes, alongside
	 * {@link #isNewTransaction()}. For programmatic handling of custom
	 * savepoints, use the operations provided by {@link SavepointManager}.
	 * @see #isNewTransaction()
	 * @see #createSavepoint()
	 * @see #rollbackToSavepoint(Object)
	 * @see #releaseSavepoint(Object)
	 */
     //判断当前事务是否内部创建了一个保存点
	boolean hasSavepoint();

	/**
	 * Flush the underlying session to the datastore, if applicable:
	 * for example, all affected Hibernate/JPA sessions.
	 * <p>This is effectively just a hint and may be a no-op if the underlying
	 * transaction manager does not have a flush concept. A flush signal may
	 * get applied to the primary resource or to transaction synchronizations,
	 * depending on the underlying resource.
	 */
	@Override
	void flush();

}
```

* **PlatformTransactionManager**


```java

package org.springframework.transaction;

import org.springframework.lang.Nullable;

/**

 * @author Rod Johnson
 * @author Juergen Hoeller
 * @since 16.05.2003
 * @see org.springframework.transaction.support.TransactionTemplate
 * @see org.springframework.transaction.interceptor.TransactionInterceptor
 */
public interface PlatformTransactionManager extends TransactionManager {

	/**
	 * Return a currently active transaction or create a new one, according to
	 * the specified propagation behavior.
	 * <p>Note that parameters like isolation level or timeout will only be applied
	 * to new transactions, and thus be ignored when participating in active ones.
	 * <p>Furthermore, not all transaction definition settings will be supported
	 * by every transaction manager: A proper transaction manager implementation
	 * should throw an exception when unsupported settings are encountered.
	 * <p>An exception to the above rule is the read-only flag, which should be
	 * ignored if no explicit read-only mode is supported. Essentially, the
	 * read-only flag is just a hint for potential optimization.
	 * @param definition the TransactionDefinition instance (can be {@code null} for defaults),
	 * describing propagation behavior, isolation level, timeout etc.
	 * @return transaction status object representing the new or current transaction
	 * @throws TransactionException in case of lookup, creation, or system errors
	 * @throws IllegalTransactionStateException if the given transaction definition
	 * cannot be executed (for example, if a currently active transaction is in
	 * conflict with the specified propagation behavior)
	 * @see TransactionDefinition#getPropagationBehavior
	 * @see TransactionDefinition#getIsolationLevel
	 * @see TransactionDefinition#getTimeout
	 * @see TransactionDefinition#isReadOnly
	 */
	TransactionStatus getTransaction(@Nullable TransactionDefinition definition)
			throws TransactionException;

	/**
	 * Commit the given transaction, with regard to its status. If the transaction
	 * has been marked rollback-only programmatically, perform a rollback.
	 * <p>If the transaction wasn't a new one, omit the commit for proper
	 * participation in the surrounding transaction. If a previous transaction
	 * has been suspended to be able to create a new one, resume the previous
	 * transaction after committing the new one.
	 * <p>Note that when the commit call completes, no matter if normally or
	 * throwing an exception, the transaction must be fully completed and
	 * cleaned up. No rollback call should be expected in such a case.
	 * <p>If this method throws an exception other than a TransactionException,
	 * then some before-commit error caused the commit attempt to fail. For
	 * example, an O/R Mapping tool might have tried to flush changes to the
	 * database right before commit, with the resulting DataAccessException
	 * causing the transaction to fail. The original exception will be
	 * propagated to the caller of this commit method in such a case.
	 * @param status object returned by the {@code getTransaction} method
	 * @throws UnexpectedRollbackException in case of an unexpected rollback
	 * that the transaction coordinator initiated
	 * @throws HeuristicCompletionException in case of a transaction failure
	 * caused by a heuristic decision on the side of the transaction coordinator
	 * @throws TransactionSystemException in case of commit or system errors
	 * (typically caused by fundamental resource failures)
	 * @throws IllegalTransactionStateException if the given transaction
	 * is already completed (that is, committed or rolled back)
	 * @see TransactionStatus#setRollbackOnly
	 */
	void commit(TransactionStatus status) throws TransactionException;

	/**
	 * Perform a rollback of the given transaction.
	 * <p>If the transaction wasn't a new one, just set it rollback-only for proper
	 * participation in the surrounding transaction. If a previous transaction
	 * has been suspended to be able to create a new one, resume the previous
	 * transaction after rolling back the new one.
	 * <p><b>Do not call rollback on a transaction if commit threw an exception.</b>
	 * The transaction will already have been completed and cleaned up when commit
	 * returns, even in case of a commit exception. Consequently, a rollback call
	 * after commit failure will lead to an IllegalTransactionStateException.
	 * @param status object returned by the {@code getTransaction} method
	 * @throws TransactionSystemException in case of rollback or system errors
	 * (typically caused by fundamental resource failures)
	 * @throws IllegalTransactionStateException if the given transaction
	 * is already completed (that is, committed or rolled back)
	 */
	void rollback(TransactionStatus status) throws TransactionException;

}

```

##### 1.1.4.2.3. 事务管理器实现类
Spring 将事务管理委托给底层具体的持久化实现框架来完成。因此，Spring为不同的持久化框架提供了PlatformTransactionManager 接口的实现类。

|事务|	说明|
|---|---|
|org.springframework.transaction.jta.JtaTransactionManager|	使用JPA进行持久化时，使用该事务管理器
|org.springframework.orm.hibernate3.HibernateTransactionManager	|使用Hibernate X.0(X 可以为3 4 5)版本进行持久化时，使用该事务管理器
|org.springframework.jdbc.datasource.DataSourceTransactionManager|	使用Spring JDBC  或 Mybatis 等基于DataSource数据源的持久化技术时，使用 该事务管理器
|org.springframework.orm.jdo.JdoTransactionManager|	使用JDO进行持久化时 ，使用该事务管理器
|org.springframework.transaction.jta.JtaTransactionManager|	具有多个数据源的全局事务使用该事务管理器(不管采用何种持久化技术)



#### 1.1.4.3. 编程式事务管理
<a href="#menu" style="float:right">目录</a>

实际中很少使用

#### 1.1.4.4. 使用XML配置声明式事务
<a href="#menu" style="float:right">目录</a>

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
    </bean>  
    <!--配置一个JdbcTemplate实例，并将这个“共享的”，“安全的”实例注入到不同的DAO类中去 -->  
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
    <!--配置一个JdbcTemplate实例，并将这个“共享的”，“安全的”实例注入到不同的DAO类中去 -->  
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

#### 1.1.4.5. 使用注解配置事务
<a href="#menu" style="float:right">目录</a>

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


#### 1.1.4.6. 事务实现原理
<a href="#menu" style="float:right">目录</a>



### 1.1.5. Spring Cache
<a href="#menu" style="float:right">目录</a>

#### 1.1.5.1. 几个重要概念&缓存注解

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
|value|	缓存的名称，在 spring 配置文件中定义，必须指定至少一个.例如：@Cacheable(value=”mycache”) 或者@Cacheable(value={”cache1”,”cache2”}
|key	|缓存的 key，可以为空，如果指定要按照 SpEL 表达式编写，如果不指定，则缺省按照方法的所有参数进行组合.例如：@Cacheable(value=”testcache”,key=”#id”)
|condition|	缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存/清除缓存.例如：@Cacheable(value=”testcache”,condition=”#userName.length()>2”)
|unless	|否定缓存。当条件结果为TRUE时，就不会缓存。@Cacheable(value=”testcache”,unless=”#userName.length()>2”)
|allEntries(@CacheEvict )|	是否清空所有缓存内容，缺省为 false，如果指定为 true,则方法调用后将立即清空所有缓存.例如：@CachEvict(value=”testcache”,allEntries=true)
|beforeInvocation(@CacheEvict)	|是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存,例如：@CachEvict(value=”testcache”，beforeInvocation=true)

#### 1.1.5.2. SpEL上下文数据
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
1. 当我们要使用root对象的属性作为key时我们也可以将“#root”省略，因为Spring默认使用的就是root对象的属性。 如
@Cacheable(key = "targetClass + methodName +#p0")
2. 使用方法参数时我们可以直接使用“#参数名”或者“#p参数index”。 如：
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

#### 1.1.5.3. 基本使用

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
    * @CachEvict(value=”testcache”,allEntries=true)
* beforeInvocation	
    * 是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存	
    * @CachEvict(value=”testcache”，beforeInvocation=true)
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

### 1.1.6. 常用注解
<a href="#menu" style="float:right">目录</a>

### 1.1.7. 常用工具类
<a href="#menu" style="float:right">目录</a>


## 1.2. Sppring MVC
<a href="#menu" style="float:right">目录</a>

### 1.2.1. MVC体系概述
<a href="#menu" style="float:right">目录</a>

Spring MVC是一个基于Java的实现了MVC设计模式的请求驱动类型的轻量级Web框架，通过把Model，View，Controller分离，将web层进行职责解耦，把复杂的web应用分成逻辑清晰的几部分，简化开发，减少出错，方便组内开发人员之间的配合。

#### 1.2.1.1. MVC 架构
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
### 1.2.2. Restful
<a href="#menu" style="float:right">目录</a>

#### 1.2.2.1. URL 设计

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
#### 1.2.2.2. 状态码
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

#### 1.2.2.3. 服务器回应
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

### 1.2.3. 注解说明
<a href="#menu" style="float:right">目录</a>

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

* 在 Matrix Variable 中，多个变量可以使用 “;”（分号）分隔，例如：
    * /books;author=Tom;year=2016
* 如果一个变量对应多个值，那么可以使用 “,”（逗号）分隔，例如：
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
相应的 bookId 和 a 都会被映射到这个方法中，如果匹配不到，则会报 "bad request”。如果 URI 只是 "/books/11”，则也可以映射到这个方法中，但需要指定空值不报错：@MatrixVariable(required=false）。

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
两者都可以写在字段和setter方法上。两者如果都写在字段上，那么就不需要再写setter方法。
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

   在上面的代码中我们可以看到在标记variable1 为path 变量的时候我们使用的是@PathVariable ，而在标记variable2 的时候使用的是@PathVariable(“variable2”) 。这两者有什么区别呢？第一种情况就默认去URI 模板中找跟参数名相同的变量，但是这种情况只有在使用debug 模式进行编译的时候才可以，而第二种情况是明确规定使用的就是URI 模板中的variable2 变量。当不是使用debug 模式进行编译，或者是所需要使用的变量名跟参数名不相同的时候，就要使用第二种方式明确指出使用的是URI 模板中的哪个变量。

 除了在请求路径中使用URI 模板，定义变量之外，@RequestMapping 中还支持通配符“* ”。如下面的代码我就可以使用/myTest/whatever/wildcard.do 访问到Controller 的testWildcard 方法。如：

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
（7 ）除以上几种情况之外的其他任何返回类型都会被当做模型中的一个属性来处理，而返回的视图还是由RequestToViewNameTranslator 来决定，添加到模型中的属性名称可以在该方法上用@ModelAttribute(“attributeName”) 来定义，否则将使用返回类型的类名称的首字母小写形式来表示。使用@ModelAttribute 标记的方法会在@RequestMapping 标记的方法执行之前执行。

4. 使用 @ModelAttribute 和 @SessionAttributes 传递和保存数据
SpringMVC 支持使用 @ModelAttribute 和 @SessionAttributes 在不同的模型（model）和控制器之间共享数据。 @ModelAttribute 主要有两种使用方式，一种是标注在方法上，一种是标注在 Controller 方法参数上。

当 @ModelAttribute 标记在方法上的时候，该方法将在处理器方法执行之前执行，然后把返回的对象存放在 session 或模型属性中，属性名称可以使用 @ModelAttribute(“attributeName”) 在标记方法的时候指定，若未指定，则使用返回类型的类名称（首字母小写）作为属性名称。关于 @ModelAttribute 标记在方法上时对应的属性是存放在 session 中还是存放在模型中，我们来做一个实验，看下面一段代码。

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

当 @ModelAttribute 标记在处理器方法参数上的时候，表示该参数的值将从模型或者 Session 中取对应名称的属性值，该名称可以通过 @ModelAttribute(“attributeName”) 来指定，若未指定，则使用参数类型的类名称（首字母小写）作为属性名称。

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
这种方式实际的效果就是在调用@RequestMapping的方法之前，为request对象的model里put（“account”， Account）。

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

### 1.2.4. 拦截器 
<a href="#menu" style="float:right">目录</a>

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

### 1.2.5. 过滤器
<a href="#menu" style="float:right">目录</a>


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

#### 1.2.5.1. 过滤器和拦截器的区别：

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


#### 1.2.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途
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


## 1.3. SpringBoot
<a href="#menu" style="float:right">目录</a>

### 1.3.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

### 1.3.2. Spring Boot 环境下创建Bean

**方式1**：

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
 

**方式2**：
使用@Bean注解,这种方式用在Spring Boot 应用中。

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

 

**方式3**：
使用注解@Import,也会创建对象并注入容器中

```java
@Import(User.class)
public class MicroblogUserWebApplication {
    public static void main(String args[]) {
        SpringApplication.run(MicroblogUserWebApplication.class, args);
    }
}
```
**方式4**：
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

 

**方式5**
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

## 1.4. SpringCloud
<a href="#menu" style="float:right">目录</a>

### 1.4.1. 基础知识
<a href="#menu" style="float:right">目录</a>

**什么是微服务**
微服务是系统架构上的一种设计风格， 它的主旨是将一个原本独立的系统拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP的RESTful API进行通信协作。 被拆分成的每一个小型服务都围绕着系统中的某一项或一些耦合度较高的业务功能进行构建， 并且每个服务都维护着自身的数据存储、 业务开发、自动化测试案例以及独立部署机制。 由千有了轻量级的通信协作基础， 所以这些微服务可以使用不同的语言来编写

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

**SpringCloud子项目**
* SpringCloudConfig: 配置管理工具， 支持使用Git存储 配置内容， 可以使用它实现应用配置的外部化存储， 并支持客户端配置信息刷新、 加密／解密配置内容 等。
* SpringCloudNetflix: 核心 组件， 对多个Netflix OSS开源套件进行整合。
* Eureka: 服务治理组件， 包含服务注册中心、 服务注册与发现机制的实现。
* Hystrix: 容错管理组件，实现断路器模式， 帮助服务依赖中出现的延迟和为故障提供强大的容错能力。
* ribbon: 客户端负载均衡的服务调用组件
* Feign: 基于伈bbon 和 Hystrix 的声明式服务调用组件。
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

**版本说明**
由于 Spring Cloud 不像 Spring 社区其他一些项目那样相对独立， 它是一个拥有诸多子项目的大型综合项目， 可以说是对微服务架构解决方案的综合套件组合， 其包含的各个子项目也都独立进行着内容更新与迭代，各自都维护着自己的发布版本号。因此每一 个Spring
Cloud 的版本都会包含多个不同版本的子项目， 为了管理每个版本的子项目清单， 避免
Spring Cloud的版本号与其子项目的版本号相混淆，没有采用版本号的方式，而是通过命名
的方式。

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


### 1.4.2. 服务治理Eureka
<a href="#menu" style="float:right">目录</a>

#### 1.4.2.1. 基本使用

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
eureka:
  instance:
    hostname: localhost
  client:
    #false 禁止向注册中心注册,默认true
    register-with-eureka: false
    #false进制获取注册中心中各个微服务的注册信息,默认true
    fetch-registry: false
    service-url:
      defaultZone:
          http://localhost:8001/eureka/
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
配置中心创建完成

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
* 使用@EnableEurekaClient或者@EnableDiscoveryClien七使能微服务
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

**访问配置中心**

访问地址:http://localhost:8001/

![注册中心页面](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/center.png)
这里配置了一个消费者(8003)和两个服务提供者（8002/8012）

status的UP后面的字符串即为服务的唯一标识instance-id。可以通过eureka.instance.instance-id进行修改。

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
        # 开启基于HTTP basic的认证
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

#### 1.4.2.2. 高可用注册中心

* 注册中心可以集群部署，提高高可用

* 只需要配置多个地址即可，并且把之前的几个禁止去掉
```yml
server:
  port: 8001
eureka:
  instance:
    hostname: localhost
  client:
    #false 禁止向注册中心注册,默认true
    #register-with-eureka: false
    #false进制获取注册中心中各个微服务的注册信息,默认true
    #fetch-registry: false
    service-url:
      defaultZone:
          http://localhost:8001/eureka/,http://localhost:8002/eureka/,http://localhost:8003/eureka/
```
EurekaServer的高可用实际上就是将自己作为服务向其他服务注册中心注册自己， 这样就可以形成一组互相注册的服务注册中心， 以实现服务清单的互相同步， 达到高可用的效果

#### 1.4.2.3. 原理说明
<a href="#menu" style="float:right">目录</a>

##### 1.4.2.3.1. 基础模块说明
<a href="#menu" style="float:right">目录</a>

**基础架构**
* 服务注册中心
    * Eureka 提供的服务端， 提供服务注册与发现的功能， 也就是在上一节中我们实现的 eureka-server。
* 服务提供者
    * 提供服务的应用， 可以是 Spring Boot 应用， 也可以是其他技术平台且遵循 Eureka 通信机制的应用。它将自己提供的服务注册到 Eureka, 以供其他应用发现，也就是在上一节中我们实现的 HELLO-SERVICE 应用。
* 服务消费者
    * 消费者应用从服务注册中心获取服务列表， 从而使消费者可以知道去何处调用其所需要的服务

**服务治理机制**
![Spring Cloud服务架构图](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/eureka.png)

* **服务提供者**
    * 服务注册
        * “服务提供者” 在启动的时候会通过发送REST请求的方式将自己注册到EurekaServer上，同时带上了自身服务的一些元数据信息。
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
        * 服务注册中心和服务提供者将会进行心跳操作
        * eureka.instance.lease-renewal-interval-in-seconds 参数用于定义服务续约任务的调用间隔时间，默认为30秒。 eureka.instance.lease-expiration-duration-in-seconds参数用于定义服务失效的时间，默认为90秒
* **服务消费者**
    * 获取服务
        * 启动服务消费者的时候，它会发送一个REST请求给服务注册中心，来获取上面注册的服务清单
        * Eureka Server会维护一份只读的服务清单来返回给客户端，同时该缓存清单会每隔30秒更新一次.
        * 获取服务是服务消费者的基础，所以必须确保eureka.c巨ent.fetch-registry=true,默认值为true
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


##### 1.4.2.3.2. Region,Zone
**背景**
用户量比较大或者用户地理位置分布范围很广的项目，一般都会有多个机房。这个时候如果上线springCloud服务的话，我们希望一个机房内的服务优先调用同一个机房内的服务，当同一个机房的服务不可用的时候，再去调用其它机房的服务，以达到减少延时的作用。

**概念**
eureka提供了region和zone两个概念来进行分区，这两个概念均来自于亚马逊的AWS：
* region：可以简单理解为地理上的分区，比如亚洲地区，或者华北地区，再或者北京等等，没有具体大小的限制。根据项目具体的情况，可以自行合理划分region。
* zone：可以简单理解为region内的具体机房，比如说region划分为北京，然后北京有两个机房，就可以在此region之下划分出zone1,zone2两个zone。

**分区服务架构图**
![](https://segmentfault.com/img/bV7lKo?w=865&h=343)
如图所示，有一个region:beijing，下面有zone-1和zone-2两个分区，每个分区内有一个注册中心Eureka Server和一个服务提供者Service。
我们在zone-1内创建一个Consumer-1服务消费者的话，其会优先调用同一个zone内的Service-1，当Service-1不可用时，才会去调用zone-2内的Service-2。

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

zone.name: zone-
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

##### 1.4.2.3.3. 源码分析
<a href="#menu" style="float:right">目录</a>



#### 1.4.2.4. 更多配置说明
<a href="#menu" style="float:right">目录</a>

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

### 1.4.3. 负载均衡Ribbon
<a href="#menu" style="float:right">目录</a>

Spring Cloud Ribbon 是一个基于 HTTP 和 TCP 的客户端负载均衡工具，它基于 Netflixribbon 实现。 通过 Spring Cloud 的封装， 可以让我们轻松地将面向服务的 REST 模板请求自动转换成客户端负载均衡的服务调用。 Spring Cloud Ribbon 虽然只是一个工具类框架，它不像服务注册中心、 配置中心、 API 网关那样需要独立部署， 但是它几乎存在于每一个Spring Cloud 构建的微服务和基础设施中。 因为微服务间的调用，API 网关的请求转发等内容实际上都是通过伈bbon 来实现的，包括后续我们将要介绍的 Feign, 它也是基于 Ribbon实现的工具。 所以， 对 Spring Cloud Ribbon 的理解和使用， 对于我们使用 Spring Cloud 来构建微服务非常重要。

ribbon底层是基于RestTemplate实现Http请求
org.springframework.web.client.RestTemplate

#### 1.4.3.1. 基本使用
<a href="#menu" style="float:right">目录</a>

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
    //开启客户端负载均衡
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

#### 1.4.3.2. 原理说明
<a href="#menu" style="float:right">目录</a>

##### 1.4.3.2.1. 源码分析

**LoadBalancerAutoConfiguration配置类**

在该自动化配置类中， 主要做了下面三件事：
• 创建了一个LoadBalancer工吐erceptor的Bean, 用千实现对客户端发起请求
时进行拦截， 以实现客户端负载均衡。
• 创建了 一个RestTemplateCustomizer的Bean, 用于给Res七Template增加
LoadBalancer工nterceptor拦截器。
• 维护了 一个被@LoadBalanced 注解修饰的RestTempl琴e对象列表， 并在这里
进行初始化， 通过调用Res七TemplateCustomizer的实例来给需要客户端负载
均衡的Res七Template增加LoadBalancerin七erceptor拦截器。

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.cloud.client.loadbalancer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;

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
当 一个被@LoadBalanced 注解修饰的 RestTemplate 对象向外发起 HTTP 请求时， 会被 LoadBalancerintercep七or 类的 intercept 函数所拦截。

![ribbon请求流程](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/ribbon-dorequest.png)

InterceptingClientHttpRequest

```java
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
        //执行实际的Http请求
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
![负载均衡实现类](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/loadbalance-extends.png)

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

##### 1.4.3.2.2. 负载均衡器

![负载均衡实现类](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/loadbalance-extends.png)

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
```
**BaseloadBalancer**
BaseLoadBalancer 类是和bbon 负载均衡器的基础实现类，在该类中定义了很多关于负载均衡器相关的基础内容。
* 定义并维护了两个存储服务实例 Server 对象的列表。 一个用千存储所有 服务实例的清单， 一个用于存储正常服务的实例清单。
* 定义了之前我 们提到的用来存储负载均衡器各服务 实 例 属性和统计信息的LoadBalancerS七ats 对象
* 定义了检查服务实例是否正常服务的工贮ng 对象， 在 BaseLoadBalancer 中默认为 null, 需要在构造时注入它的具体实现。
* 定义了检查服务实例操作的执行策略对象工贮ngStrategy,在 BaseLoadBalancer中默认使用了该类中定义的静态内部类 SerialPingStrategy 实现。 根据源码，我们可以看到该策略采用线性遍历 ping 服务实例的方式实现检查。 该策略在当IPing 的实现速度不理想， 或是 Server 列表过大时， 可能会影响系统性能， 这时候需要通过实现 IPingS七rategy 接口并重写 pingServers(Iping ping,Server[] servers) 函数去扩展 ping 的执行策略。
* 定 义 了负 载 均 衡的处理规 则 工Rule 对 象， 从 BaseLoadBalancer 中chooseServer(Object key) 的实现源码， 我们可以知道， 负载均衡器实际将服务实例选择任务委托给了IRule 实例中的 choose 函数来实现。 而在这里， 默认初始化了 RoundRob江Rule 为工Rule 的实现对象。 RoundRobinRule 实现了最基本且常用的线性负载均衡规则
* 启动 ping 任务：在 BaseLoadBalancer 的默认构造函数中，会直接启动一个用于定时检查 Server 是否健康的任务。 该任务默认的执行间隔为 10 秒。
* 实现了 ILoadBalancer 接口定义的负载均衡器应具备以下一系列基本操作。
* addServers(List newServers): 向负载均衡器中增加新的服务实例列表，该实现将原本已经维护着的所有服务实例清单 al1Server巨st 和新传入的服务 实 例 清 单 newServers 都加入到 newList 中， 然后通 过调用setServersList 函数对 new口st 进行处理，在 BaseLoadBalancer 中实现的时候会使用新的列表覆盖旧的列表。而之后介绍的几个扩展实现类对千服务实例清单更新的优化都是通过对 setServersLi江函数的重写来实现的

**DynamicServerlistloadBalancer**
DynamicServerListLoadBalancer 类继承于 BaseLoadBalancer 类， 它是对基础负载均衡器的扩展。 在该负载均衡器中， 实现了服务实例清单在运行期的动态更新能力；同时， 它还具备了对服务实例清单的过滤功能， 也就是说， 我们可以通过过滤器来选择性地获取一批服务实例清单

**ZoneAwareloadBalancer**
ZoneAwareLoadBalancer 负载均衡器是对 DynamicServerListLoadBalancer的扩展。在 DynamicServerLis七LoadBalancer 中， 我们可以看到它并没有重写选择具体服务实例的 chooseServer 函数， 所以它依然会采用在 BaseLoadBalancer 中实现的算法。 使用 RoundRobinRule 规则， 以线性轮询的方式来选择调用的服务实例， 该算法实现简单并没有区域 (Zone) 的概念， 所以它会把所有实例视为一个 Zone下的节点来看待， 这样就会周期性地产生跨区域 (Zone) 访问的情况， 由于跨区域会产生更高的延迟，这些实例主要以防止区域性故障实现高可用为目的而不能作为常规访问的实例， 所以在多区域部署的清况下会有一定的性能问题， 而该负载均衡器则 可以避免这样的问题.

##### 1.4.3.2.3. 负载均衡策略
<a href="#menu" style="float:right">目录</a>

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
                    * 该策略继承自上面介绍的抽象策略 Predic红eBasedRule, 所以它也继承了 “先过滤清单，再轮询选择 ”的基本处理逻辑
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
****
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
****
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

##### 1.4.3.2.4. 配置详解 

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

### 1.4.4. 声明式服务调用feign
<a href="#menu" style="float:right">目录</a>

#### 1.4.4.1. 使用案例

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

### 1.4.5. 服务容错保护 Hystrix
<a href="#menu" style="float:right">目录</a>


### 1.4.6. API网关服务
<a href="#menu" style="float:right">目录</a>

#### 1.4.6.1. zuul
<a href="#menu" style="float:right">目录</a>

#### 1.4.6.2. GateWay
<a href="#menu" style="float:right">目录</a>



### 1.4.7. 分布式配置中心Config
<a href="#menu" style="float:right">目录</a>

#### 1.4.7.1. 基本使用

##### 1.4.7.1.1. 配置中心

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
      #  git:
       #   uri: https://github.com/lgjlife/micro-blog
          #Spring Cloud Config Server强制从远程存储库中提取
       #   force-pull: true
        #  search-paths: config-repo
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

##### 1.4.7.1.2. bootstrap.yml与application.yml区别
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

“bootstrap” : 如果在Bootstrap Context扫描到PropertySourceLocator并且有属性，则会添加到CompositePropertySource。Spirng Cloud Config就是通过这种方式来添加的属性的，详细看源码ConfigServicePropertySourceLocator`。下面也也有一个例子自定义的例子。
“applicationConfig: [classpath:bootstrap.yml]” ，（如果有spring.profiles.active=production则例如 applicationConfig: [classpath:/bootstrap.yml]#production）: 如果你使用bootstrap.yml来配置Bootstrap Context，他比application.yml优先级要低。它将添加到子上下文，作为Spring Boot应用程序的一部分。下文有介绍。
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
bootstrap.yml是由spring.cloud.bootstrap.name（默认:”bootstrap”）或者spring.cloud.bootstrap.location（默认空）。这些属性行为与spring.config.*类似，通过它的Environment来配置引导ApplicationContext。如果有一个激活的profile（来源于spring.profiles.active或者Environment的Api构建），例如bootstrap-development.properties 就是配置了profile为development的配置文件.

* 覆盖远程属性
property sources被bootstrap context 添加到应用通常通过远程的方式，比如”Config Server”。默认情况下，本地的配置文件不能覆盖远程配置，但是可以通过启动命令行参数来覆盖远程配置。如果需要本地文件覆盖远程文件，需要在远程配置文件里设置授权 
spring.cloud.config.allowOverride=true（这个配置不能在本地被设置）。一旦设置了这个权限，你可以配置更加细粒度的配置来配置覆盖的方式，

比如： 
```
- spring.cloud.config.overrideNone=true 覆盖任何本地属性 
- spring.cloud.config.overrideSystemProperties=false 仅仅系统属性和环境变量 
```
源文件见PropertySourceBootstrapProperties

* 自定义启动配置
bootstrap context是依赖/META-INF/spring.factories文件里面的org.springframework.cloud.bootstrap.BootstrapConfiguration条目下面，通过逗号分隔的Spring  @Configuration类来建立的配置。任何main application context需要的自动注入的Bean可以在这里通过这种方式来获取。这也是ApplicationContextInitializer建立@Bean的方式。可以通过@Order来更改初始化序列，默认是”last”。

```yml
# spring-cloud-context-1.1.1.RELEASE.jar
# spring.factories
# AutoConfiguration
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration,\
org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration

# Application Listeners
org.springframework.context.ApplicationListener=\
org.springframework.cloud.bootstrap.BootstrapApplicationListener,\
org.springframework.cloud.context.restart.RestartListener

# Bootstrap components
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
那么，”customProperty“的PropertySource将会被包含到应用。


##### 1.4.7.1.3. 客户端配置

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
# 必须放在bootstrap.yml中
spring:
  application:
    name: config-client
  # cloud config 配置中心
  cloud:
    config:
      #config server 地址
      uri: http://localhost:9001
      #如果服务无法连接到配置服务器，则可能希望启动服务失败
      fail-fast: true
      label: master
  # 指定profiles
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

##### 1.4.7.1.4. 刷新配置
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


#### 1.4.7.2. 原理说明
<a href="#menu" style="float:right">目录</a>

#### 1.4.7.3. 更多使用方式
<a href="#menu" style="float:right">目录</a>

### 1.4.8. 消息总线bus
<a href="#menu" style="float:right">目录</a>

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

#### 1.4.8.1. 消息代理
消息代理 (Message Broker) 是一种消息验证、 传输、 路由的架构模式。 它在应用程序之间起到通信调度并最小化应用之间的依赖的作用， 使得应用程序可以高效地解耦通信过程。 消息代理是一个中间件产品， 它的核心是一个消息的路由程序， 用来实现接收和分发消息， 并根据设定好的消息处理流来转发给正确的应用。 它包括独立的通信和消息传递协议， 能够实现组织内部和组织间的网络通信。 设计代理的目的就是为了能够从应用程序中传入消息， 并执行一些特别的操作， 下面这些是在企业应用中， 我们经常需要使用消息代理的场景：
* 将消息路由到一个或多个目的地
* 消息转化为其他的表现方式。
* 执行消息的聚集、 消息的分解， 并将结果发送到它们的目的地， 然后重新组合响应返回给消息用户。
* 调用Web服务来检索数据。
* 响应事件或错误。
* 使用发布－订阅模式来提供内容或基千主题的消息路由。

当前版本的Spring Cloud Bus仅支待两款中间件产品： RabbitMQ和Kafka

### 1.4.9. 消息驱动的微服务Stream
<a href="#menu" style="float:right">目录</a>

### 1.4.10. 分布式服务跟踪Sleuth
<a href="#menu" style="float:right">目录</a>

#### 1.4.10.1. 基本使用 

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
    # ZIPKINF地址
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


#### 1.4.10.2. 跟踪原理

这里只讲feign和Sleuth的实现原理，其他方式基本原理上差不多。

##### 1.4.10.2.1. 基本实现原理

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

##### 1.4.10.2.2. 支持的组件
Spring Cloud Sleuth可以追踪10种类型的组件，async、Hystrix，messaging，websocket，rxjava，scheduling，web（Spring MVC Controller，Servlet），webclient（Spring RestTemplate）、Feign、Zuul。下面是常用的八种类型。

![Sleuth支持的组件](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/sleuth-instructment.png?raw=true)
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

##### 1.4.10.2.3. 一些基本概念

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

##### 1.4.10.2.4. zipkin
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

##### 1.4.10.2.5. 调用过程

![Sleuth支持的组件](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/sleuth-request.png?raw=true)

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







## 1.5. 测试
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 基本测试
<a href="#menu" style="float:right">目录</a>

### 1.5.2. 控制层测试
<a href="#menu" style="float:right">目录</a>

### 1.5.3. 服务层测试
<a href="#menu" style="float:right">目录</a>

### 1.5.4. DAO层测试
<a href="#menu" style="float:right">目录</a>


