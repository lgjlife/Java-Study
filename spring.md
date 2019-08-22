

<span id="menu"></span>
<!-- TOC -->

- [1. Spring 体系](#1-spring-体系)
    - [1.1. Spring](#11-spring)
        - [1.1.1. IOC容器](#111-ioc容器)
        - [1.1.2. AOP面向切面编程](#112-aop面向切面编程)
        - [1.1.3. Spring 事务管理](#113-spring-事务管理)
        - [1.1.4. 常用注解](#114-常用注解)
        - [1.1.5. 常用工具类](#115-常用工具类)
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
                - [1.4.2.3.2. 源码分析](#14232-源码分析)
            - [1.4.2.4. 更多配置说明](#1424-更多配置说明)
        - [1.4.3. 负载均衡Ribbon](#143-负载均衡ribbon)
        - [1.4.4. 声明式服务调用](#144-声明式服务调用)
        - [1.4.5. API网关服务](#145-api网关服务)
            - [1.4.5.1. zuul](#1451-zuul)
            - [1.4.5.2. GateWay](#1452-gateway)
        - [1.4.6. 服务容错保护 Hystrix](#146-服务容错保护-hystrix)
        - [1.4.7. 分布式配置中心Config](#147-分布式配置中心config)
        - [1.4.8. 消息总线Bus](#148-消息总线bus)
        - [1.4.9. 分布式服务跟踪Sleuth](#149-分布式服务跟踪sleuth)
        - [1.4.10. 消息驱动的微服务](#1410-消息驱动的微服务)
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

### 1.1.2. AOP面向切面编程
<a href="#menu" style="float:right">目录</a>

### 1.1.3. Spring 事务管理
<a href="#menu" style="float:right">目录</a>

### 1.1.4. 常用注解
<a href="#menu" style="float:right">目录</a>

### 1.1.5. 常用工具类
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
（1 ）HttpServlet 对象，主要包括HttpServletRequest 、HttpServletResponse 和HttpSession 对象。 这些参数Spring 在调用处理器方法的时候会自动给它们赋值，所以当在处理器方法中需要使用到这些对象的时候，可以直接在方法上给定一个方法参数的申明，然后在方法体里面直接用就可以了。但是有一点需要注意的是在使用HttpSession 对象的时候，如果此时HttpSession 对象还没有建立起来的话就会有问题。
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
* 降低复杂度
    * 将原来偶合在一起的复杂业务拆分为单个服务，规避了原本复杂度无止境的积累。每一个微服务专注于单一功能，并通过定义良好的接口清晰表述服务边界。每个服务开发者只专注服务本身，通过使用缓存、DAL等各种技术手段来提升系统的性能，而对于消费方来说完全透明。
* 可独立部署
    * 由于微服务具备独立的运行进程，所以每个微服务可以独立部署。当业务迭代时只需要发布相关服务的迭代即可，降低了测试的工作量同时也降低了服务发布的风险。
* 容错
    * 在微服务架构下，当某一组件发生故障时，故障会被隔离在单个服务中。 通过限流、熔断等方式降低错误导致的危害，保障核心业务正常运行。
* 扩展
    * 单块架构应用也可以实现横向扩展，就是将整个应用完整的复制到不同的节点。当应用的不同组件在扩展需求上存在差异时，微服务架构便体现出其灵活性，因为每个服务可以根据实际需求独立进行扩展。

**SpringCloud子项目**
* SpringCloudConfig: 配置管理工具， 支持使用Git存储 配置内容， 可以使用它实现
应用配置的外部化存储， 并支持客户端配置信息刷新、 加密／解密配置内容 等。
* SpringCloudNetflix: 核心 组件， 对多个Netflix OSS开源套件进行整合。
* Eureka: 服务治理组件， 包含服务注册中心、 服务注册与发现机制的实现。
* Hystrix: 容错管理组件，实现断路器模式， 帮助服务依赖中出现的延迟和为故障
提供强大的容错能力。
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
![Spring Cloud服务架构图](eurekka.png)

* **服务提供者**
    * 服务注册
    * 服务同步
    * 服务续约
* **服务消费者**
    * 获取服务
    * 服务调用
    * 服务下线
* **服务注册中心**
    * 失效剔除
    * 自我保护

##### 1.4.2.3.2. 源码分析
<a href="#menu" style="float:right">目录</a>



#### 1.4.2.4. 更多配置说明
<a href="#menu" style="float:right">目录</a>


### 1.4.3. 负载均衡Ribbon
<a href="#menu" style="float:right">目录</a>

### 1.4.4. 声明式服务调用
<a href="#menu" style="float:right">目录</a>

### 1.4.5. API网关服务
<a href="#menu" style="float:right">目录</a>

#### 1.4.5.1. zuul
<a href="#menu" style="float:right">目录</a>

#### 1.4.5.2. GateWay
<a href="#menu" style="float:right">目录</a>

### 1.4.6. 服务容错保护 Hystrix
<a href="#menu" style="float:right">目录</a>

### 1.4.7. 分布式配置中心Config
<a href="#menu" style="float:right">目录</a>

### 1.4.8. 消息总线Bus
<a href="#menu" style="float:right">目录</a>

### 1.4.9. 分布式服务跟踪Sleuth
<a href="#menu" style="float:right">目录</a>

### 1.4.10. 消息驱动的微服务
<a href="#menu" style="float:right">目录</a>





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


