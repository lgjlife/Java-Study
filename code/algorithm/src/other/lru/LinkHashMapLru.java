package other.lru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LinkHashMapLru<K,V> extends LinkedHashMap<K,V> {

    private final int MAX_SIZE;

    public LinkHashMapLru(int maxSize,
                          float loadFactor,
                          boolean accessOrder) {
        super(maxSize,loadFactor,accessOrder);

        MAX_SIZE = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {

        return size() > MAX_SIZE;

    }

    public static void main(String args[]){


        LinkHashMapLru lru = new LinkHashMapLru<String,String>(5,0.75f,true);

        int a = 1,b=2;




        lru.put("key1","value1");
        lru.put("key2","value2");
        lru.put("key3","value3");
        lru.put("key4","value4");

        lru.put("key5","value5");

        lru.get("key1");
        lru.put("key6","value6");

        System.out.println(lru.toString());

        lru.get("key1");
        lru.put("key4","value41");
        System.out.println(lru.toString());



    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(String.format("%s:%s   ", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
