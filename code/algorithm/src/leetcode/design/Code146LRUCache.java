package leetcode.design;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Code146LRUCache {

    public static void main(String args[]){

        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        int result = 0;
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

    }
}

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
    //热数据在head,冷数据在tail
    private Node head ;
    private Node tail;
    private int cap;
    private int size;
    private HashMap<Integer,Node> cache = new HashMap<>();

    public LRUCache1(int  cap){
        this.cap = cap;
        this.size  = 0;

        Node head = new Node();
        Node tail = new Node();

        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        Node result = this.cache.get(key);

        if(result == null){
            return -1;
        }

        addToHead(result);
        return result.value;
    }
    public void put(int key, int val){

    }

    private void addToHead(Node node){

    }

}