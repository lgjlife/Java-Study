package leetcode2021.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制 。
实现 LRUCache 类：

LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。
当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。

 */
public class LRUCache {

    public Map<Integer,Integer> map = new HashMap<>();
    public List<Integer> list = new LinkedList<>();
    public Integer cap = 0;


    public static void main(String args[]){

    }


    public LRUCache(int capacity) {
        cap = capacity;
    }

    public int get(int key) {

        return  0;

    }

    public void put(int key, int value) {
        if(map.get(key) != null){
            map.put(key,value);
        }
    }
}
