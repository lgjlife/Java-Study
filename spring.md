

<span id="menu"></span>

<!-- TOC -->

- [1. Spring](#1-spring)
- [2. SpringBoot](#2-springboot)
    - [2.1. 基本概念](#21-基本概念)
    - [2.2. Spring Boot 环境下创建Bean](#22-spring-boot-环境下创建bean)
- [3. SpringCloud](#3-springcloud)
- [4. 测试](#4-测试)
    - [4.1. 基本测试](#41-基本测试)
    - [4.2. 控制层测试](#42-控制层测试)
    - [4.3. 服务层测试](#43-服务层测试)
    - [4.4. DAO层测试](#44-dao层测试)
- [5. 登录认证](#5-登录认证)
    - [5.1. Shiro](#51-shiro)
    - [5.2. oauth2](#52-oauth2)
    - [5.3. token](#53-token)

<!-- /TOC -->
# 1. Spring
<a href="#menu" style="float:right">目录</a>
# 2. SpringBoot
<a href="#menu" style="float:right">目录</a>

## 2.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

## 2.2. Spring Boot 环境下创建Bean

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

# 3. SpringCloud
<a href="#menu" style="float:right">目录</a>



# 4. 测试
<a href="#menu" style="float:right">目录</a>
## 4.1. 基本测试
<a href="#menu" style="float:right">目录</a>
## 4.2. 控制层测试
<a href="#menu" style="float:right">目录</a>
## 4.3. 服务层测试
<a href="#menu" style="float:right">目录</a>
## 4.4. DAO层测试
<a href="#menu" style="float:right">目录</a>


# 5. 登录认证
## 5.1. Shiro
## 5.2. oauth2
## 5.3. token