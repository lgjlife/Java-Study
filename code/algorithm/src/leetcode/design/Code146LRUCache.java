package leetcode.design;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Code146LRUCache {

    public static void main(String args[]){

        LRUCache1 cache = new LRUCache1( 2 /* 缓存容量 */ );

        int result = 0;
        cache.put(1, 1);
        cache.put(2, 2);
        result=cache.get(1);       // 返回  1
        System.out.println(result==1);

        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        result=cache.get(2);       // 返回 -1 (未找到)
        System.out.println(result==-1);

        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        result= cache.get(1);       // 返回 -1 (未找到)
        System.out.println(result==-1);

        result=cache.get(3);       // 返回  3
        System.out.println(result==3);

        result=cache.get(4);       // 返回  4
        System.out.println(result==4);
    }
}

/*
* 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。

获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字/值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
进阶:你是否可以在 O(1) 时间复杂度内完成这两种操作？

* */
/*
* 方式１：　直接使用LinkedHashMap的removeEldestEntry实现，注意初始化时的accessOrder需要为true.当添加元素时，如果removeEldestEntry返回true,则删除队尾数据
* 　　mybatis中的lru缓存也是使用这种方式
* */
class LRUCache {

    private int cap;

    private LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int cap){
        this.cap = cap;

        this.cache = new  LinkedHashMap<Integer,Integer>(cap,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return this.size() > cap;
            }
        };
    }

    public int get(int key){
        Integer result =  this.cache.get(key);
        return result==null?-1:result;
    }
    public void put(int key, int val){
        this.cache.put(key,val);
    }
}
/**
 * 方式２: 自行实现双链表，数据存储在hashmap中，hashmap最优情况下可以实现O(1)读写。
*/
//运行18ms
class LRUCache1 {

    private class  Node{
        int key ;
        int value;
        Node next;
        Node pre;

        public Node(){}
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }

    }
    //热数据在head,冷数据在tail,超出大小删除tail数据
    //队头队尾并不存储有效数据
    private Node head ;
    private Node tail;
    //最大容量
    private int cap;
    //当前实际数据量
    private int size;
    private HashMap<Integer,Node> cache = new HashMap<>();

    public LRUCache1(int  cap){
        this.cap = cap;
        this.size  = 0;

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        Node result = this.cache.get(key);
        //不存在，返回-1
        if(result == null){
            return -1;
        }
        //存在，移到队头
        moveToHead(result);
        return result.value;
    }
    public void put(int key, int val){

        Node node = this.cache.get(key);
        if(node == null){
            //数据不存在
            node = new Node(key,val);
            //添加到队头
            addToHead(node);
            //添加到缓存
            this.cache.put(key,node);
            size++;
            if(size > cap){
                //超出则移除
               Node removeNode =  removeFromTail();
               this.cache.remove(removeNode.key);
               size--;
            }

        }
        else {
            //数据存在
            node.value = val;
            moveToHead(node);
        }
    }

    //移动到队头
    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }
    //删除元素
    private void removeNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    //添加新元素到队头
    private void addToHead(Node node){
        node.next = head.next;
        node.next.pre = node;
        head.next = node;
        node.pre =  head;
    }
    //删除队尾元素
    private Node removeFromTail(){
        Node removeNode = tail.pre;
        removeNode(removeNode);
        return  removeNode;
    }
}