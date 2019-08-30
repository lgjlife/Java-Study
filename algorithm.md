
<span id="menu" >
<!-- TOC -->

- [1. 数据结构和算法](#1-数据结构和算法)
    - [1.1. 数据结构](#11-数据结构)
        - [1.1.1. 数组](#111-数组)
        - [1.1.2. 栈](#112-栈)
        - [1.1.3. 队列](#113-队列)
    - [1.2. 算法](#12-算法)
        - [1.2.1. 基本算法](#121-基本算法)
        - [1.2.2. 数组](#122-数组)
        - [1.2.3. 字符串](#123-字符串)
        - [1.2.4. Random](#124-random)
        - [1.2.5. 链表](#125-链表)
        - [1.2.6. 位运算](#126-位运算)
        - [1.2.7. 栈](#127-栈)
        - [1.2.8. 队列](#128-队列)
        - [1.2.9. 递归](#129-递归)
        - [1.2.10. 双指针](#1210-双指针)
        - [1.2.11. 排序](#1211-排序)
        - [1.2.12. 二分查找](#1212-二分查找)
        - [1.2.13. 树](#1213-树)
        - [1.2.14. 哈希表](#1214-哈希表)
        - [1.2.15. 动态规划](#1215-动态规划)
        - [1.2.16. 贪心算法](#1216-贪心算法)
        - [1.2.17. 数学](#1217-数学)
        - [1.2.18. 深度优先搜索](#1218-深度优先搜索)
        - [1.2.19. 广度优先搜索](#1219-广度优先搜索)
        - [1.2.20. 回溯算法](#1220-回溯算法)
        - [1.2.21. 设计](#1221-设计)
        - [1.2.22. 图](#1222-图)
        - [1.2.23. 堆](#1223-堆)
        - [1.2.24. 并查表](#1224-并查表)
        - [1.2.25. 分治算法](#1225-分治算法)
        - [1.2.26. Sliding Window](#1226-sliding-window)
        - [1.2.27. 字典树](#1227-字典树)
        - [1.2.28. Ordered Map](#1228-ordered-map)
        - [1.2.29. 线段树](#1229-线段树)
        - [1.2.30. 极小化极大](#1230-极小化极大)
        - [1.2.31. 树状数组](#1231-树状数组)
        - [1.2.32. 拓扑排序](#1232-拓扑排序)
        - [1.2.33. 脑筋急转弯](#1233-脑筋急转弯)
        - [1.2.34. 几何](#1234-几何)
        - [1.2.35. Line Sweep](#1235-line-sweep)
        - [1.2.36. 二次](#1236-二次)

<!-- /TOC -->


# 1. 数据结构和算法

## 1.1. 数据结构

### 1.1.1. 数组
<a href="#menu" style="float:right">目录</a>

### 1.1.2. 栈
<a href="#menu" style="float:right">目录</a>

### 1.1.3. 队列
<a href="#menu" style="float:right">目录</a>



## 1.2. 算法
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 基本算法
<a href="#menu" style="float:right">目录</a>

### 1.2.2. 数组
<a href="#menu" style="float:right">目录</a>

### 1.2.3. 字符串
<a href="#menu" style="float:right">目录</a>

### 1.2.4. Random
<a href="#menu" style="float:right">目录</a>

**470. 用 Rand7() 实现 Rand10()**
这是一道概率题 计算两个rand7()和的个位，两个数用a b表示，即( rand7() + rand7() ) % 10

枚举如下：
```
	a	1	2	3	4	5	6	7
b								
1		2	3	4	5	6	7	8
2		3	4	5	6	7	8	9
3		4	5	6	7	8	9	0
4		5	6	7	8	9	0	1
5		6	7	8	9	0	1	2
6		7	8	9	0	1	2	3
7		8	9	0	1	2	3	4
```
去掉右上角的 
``` 
6	7	8
7	8	9
8	9	0
```
后

每个数字的出现次数为4次，0-9的概率相同

```java
class Solution extends SolBase {
    public int rand10() {
        int a=rand7();
        int b=rand7();
         while(a>4&&b<4) {
           a=rand7();
           b=rand7(); 
         } 
        return (a+b)%10+1;
    }
}
```

### 1.2.5. 链表
<a href="#menu" style="float:right">目录</a>

### 1.2.6. 位运算
<a href="#menu" style="float:right">目录</a>


### 1.2.7. 栈
<a href="#menu" style="float:right">目录</a>


### 1.2.8. 队列
<a href="#menu" style="float:right">目录</a>


### 1.2.9. 递归
<a href="#menu" style="float:right">目录</a>


### 1.2.10. 双指针
<a href="#menu" style="float:right">目录</a>


### 1.2.11. 排序
<a href="#menu" style="float:right">目录</a>


### 1.2.12. 二分查找
<a href="#menu" style="float:right">目录</a>


### 1.2.13. 树
<a href="#menu" style="float:right">目录</a>


### 1.2.14. 哈希表
<a href="#menu" style="float:right">目录</a>


### 1.2.15. 动态规划
<a href="#menu" style="float:right">目录</a>




### 1.2.16. 贪心算法
<a href="#menu" style="float:right">目录</a>




### 1.2.17. 数学
<a href="#menu" style="float:right">目录</a>








### 1.2.18. 深度优先搜索
<a href="#menu" style="float:right">目录</a>





### 1.2.19. 广度优先搜索
<a href="#menu" style="float:right">目录</a>



### 1.2.20. 回溯算法
<a href="#menu" style="float:right">目录</a>

### 1.2.21. 设计

<a href="#menu" style="float:right">目录</a>





### 1.2.22. 图
<a href="#menu" style="float:right">目录</a>

### 1.2.23. 堆
<a href="#menu" style="float:right">目录</a>

### 1.2.24. 并查表
<a href="#menu" style="float:right">目录</a>

### 1.2.25. 分治算法
<a href="#menu" style="float:right">目录</a>

### 1.2.26. Sliding Window 
<a href="#menu" style="float:right">目录</a>

### 1.2.27. 字典树
<a href="#menu" style="float:right">目录</a>


### 1.2.28. Ordered Map

### 1.2.29. 线段树



### 1.2.30. 极小化极大

### 1.2.31. 树状数组



### 1.2.32. 拓扑排序

### 1.2.33. 脑筋急转弯

### 1.2.34. 几何

### 1.2.35. Line Sweep

### 1.2.36. 二次














