
<h1>WEB安全</h1>

<span id="menu"></span>
<!-- TOC -->

- [1. 浏览器安全](#1-浏览器安全)
    - [1.1. 同源策略](#11-同源策略)
- [2. 跨站脚本攻击XSS](#2-跨站脚本攻击xss)
    - [2.1. 简介](#21-简介)
    - [2.2. XSS攻击](#22-xss攻击)
    - [2.3. XSS防御](#23-xss防御)
- [3. 跨站点请求伪造CSRF](#3-跨站点请求伪造csrf)
    - [3.1. 基本概念](#31-基本概念)
- [4. 点击劫持](#4-点击劫持)
- [5. HTML5安全](#5-html5安全)
- [6. 注入攻击](#6-注入攻击)
- [7. 文件上传漏洞](#7-文件上传漏洞)
- [8. 认证和会话管理](#8-认证和会话管理)
- [9. 访问控制](#9-访问控制)
- [10. 加密算法和随机数](#10-加密算法和随机数)
- [11. WEB框架安全](#11-web框架安全)
- [12. 应用拒绝服务攻击](#12-应用拒绝服务攻击)
- [13. WEB SERVER配置安全](#13-web-server配置安全)

<!-- /TOC -->

# 1. 浏览器安全
<a href="#menu" style="float:right">目录</a>

## 1.1. 同源策略

* 定义
    * 脚本只访问同源的服务器 
    * 同源策略是浏览器的行为，是为了保护本地数据不被JavaScript代码获取回来的数据污染，因此拦截的是客户端发出的请求回来的数据接收，即请求发送了，服务器响应了，但是无法被浏览器接收
    * html中的 img / a /link / script /  ifame 等标签不受此限制，脚本访问才会受限制
    * DOM,Cookie,XMLHttpRequest(ajax)受同源限制,以及浏览器加载的第三方插件比如Flash,JavaApplet等有自己的控制策略
    * 脚本访问不同源的数据叫跨域访问
    
* 同源区分
    * 协议
    * host
    * 端口
    * 子域名
* 破解跨域访问
    * 通过响应的HTTP头来授权
    * Access-Control-Allow-Origin   
        * https://www.zhoutao123.com	
        * 标明允许https://www.zhoutao123.com	发起跨域请求
    * Access-Control-Max-Age	
        * 3628800	
        * 表明在3628800秒内，不需要再发送预检验请求
    * Access-Control-Allow-Methods	
        * GET，PUT, DELETE	允许GET、PUT、DELETE的外域请求
    * Access-Control-Allow-Headers
        * content-type	
        * 允许跨域请求包含content-type头
* Spring Boot开启
方式1：
```java
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    
    //允许跨域的服务器
    @AliasFor("origins")
    String[] value() default {};
    
    //和上面是一样的 AliasFor
    @AliasFor("value")
    String[] origins() default {};

    //允许头部
    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};
    
    /**
     * The list of supported HTTP request methods.
     * <p>By default the supported methods are the same as the ones to which a
     * controller method is mapped.
     */
    RequestMethod[] methods() default {};
    
    String allowCredentials() default "";
    
    /**
     * The maximum age (in seconds) of the cache duration for preflight responses.
     * <p>This property controls the value of the {@code Access-Control-Max-Age}
     * response header of preflight requests.
     * <p>Setting this to a reasonable value can reduce the number of preflight
     * request/response interactions required by the browser.
     * A negative value means <em>undefined</em>.
     * <p>By default this is set to {@code 1800} seconds (30 minutes).
     */
    long maxAge() default -1;
}
 //根据CrossOrigin的注释可以再请求参数的不存在的时候,CORS支持的方法和Mapper支持的方法一致
@CrossOrigin(origins = "http://localhost:9000")
@GetMapping("/test")
public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
    System.out.println("==== in tesing ====");
    return "SUCCESS";
}
```  
方式2
```java
 @Bean
  @SuppressWarnings("deprecation")
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        log.info("CORS 配置参数 origins = {}  url = {}", allowedOrigins, allowedUrl);
        registry
            .addMapping("/**")
            .allowedMethods("GET", "POST", "PATCH", "DELETE", "PUT", "OPTIONS")
            .allowedOrigins("http://localhost:9090");
      }
    };
  }
```

# 2. 跨站脚本攻击XSS
<a href="#menu" style="float:right">目录</a>

## 2.1. 简介
<a href="#menu" style="float:right">目录</a>
* 全称 Cross Site Script,为与CSS区别，使用XSS
* 概念
    * 通过HTML注入篡改了网页，插入恶意的脚本，从而在用户浏览网页的时候，控制用户浏览器的一种攻击。
    * 这种攻击是跨域的，所以叫跨站脚本。
    * 操作
        * 输入用户名为lxx,输入成功后显示的也是lxx
        * 如果存在恶意的脚本攻击，发送到服务器的为 < script>alter(xxx)</ script>
        * 页面显示将会弹出弹框 
* 根据效果区分
    * 反射型
        * 用户点击一个恶意链接，才能攻击成功
        * 脚本不会传输到服务器
    * 存储型
        * 恶意脚本将会存储到服务端
        * 比如在一篇博客中嵌入恶意脚本，用户访问时将会执行这段恶意代码

## 2.2. XSS攻击
<a href="#menu" style="float:right">目录</a>

## 2.3. XSS防御
<a href="#menu" style="float:right">目录</a>

* 服务端设置Cookie时，将属性设置为HttpOnly,将禁止页面的js访问该Cookie
    * Cookie的使用过程
        * 浏览器向服务器发起请求，这个时候没有Cookie
        * 服务器返回时发送Set-Cookie头，向客户端浏览器写入Cookie
        * 在该Cookie到期前，浏览器访问该域下的所有请求，都将发送该Cookie
        * 服务器可以设置多个Cookie,HttpOnl可以有选择性的设置
* 输入检查
    * 比如电话邮箱正确性校验，特殊字符校验
* 输出编码
    * 服务器返回的参数进行编码
    * 即死恶意脚本获取到编码后的数据，可能也无法破解出原始数据


# 3. 跨站点请求伪造CSRF

<a href="#menu" style="float:right">目录</a>

## 3.1. 基本概念
* Cross Site Request Forgery
 
# 4. 点击劫持
<a href="#menu" style="float:right">目录</a>

# 5. HTML5安全
<a href="#menu" style="float:right">目录</a>

# 6. 注入攻击
<a href="#menu" style="float:right">目录</a>

# 7. 文件上传漏洞
<a href="#menu" style="float:right">目录</a>

# 8. 认证和会话管理
<a href="#menu" style="float:right">目录</a>

# 9. 访问控制
<a href="#menu" style="float:right">目录</a>

# 10. 加密算法和随机数
<a href="#menu" style="float:right">目录</a>

# 11. WEB框架安全
<a href="#menu" style="float:right">目录</a>

# 12. 应用拒绝服务攻击
<a href="#menu" style="float:right">目录</a>

# 13. WEB SERVER配置安全
<a href="#menu" style="float:right">目录</a>

