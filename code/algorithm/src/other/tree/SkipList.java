package other.tree;

import sun.nio.cs.ext.MacArabic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class SkipList<K,E> {

    //最大的层数
    private int maxLevel;
    //默认层数
    private final int DEFAULT_LEVEL = 4;

    Random random = new Random();

    private SkipNode<K,E>[] root;
    private int[] powers;

    public static void main(String args[]){


        SkipList<Double,Integer> skipList = new SkipList();
        for(int i = 0; i<10 ; i++){
            skipList.test();

        }
    }

    private  void  test(){


        this.choosePowers1();
        System.out.println(Arrays.toString(this.powers));

        ArrayList<Integer> result = new ArrayList<>(4);
        result.add(0,0);
        result.add(1,0);
        result.add(2,0);
        result.add(3,0);

        for(int i = 0; i< 10000; i++){
            int level =  this.chooseLevel1();
            int temp =  result.get(level);
            result.set(level,temp+1);
        }

        for(int i = 0; i< maxLevel; i++){

            System.out.println(result.get(i)/10000.0);
        }

        System.out.println("result = " + result);
    }

    public SkipList(){
        this.maxLevel = DEFAULT_LEVEL;
       // initRoot(maxLevel);
    }

    public SkipList(int maxLevel){
        this.maxLevel = maxLevel;
        initRoot(maxLevel);
    }

    private void initRoot(int maxLevel){
        for(int i = 0; i<maxLevel ; i++){
            root[i] = null;
        }
    }

    /**
     * 每一层的链表结构
    */
    private class  SkipNode<K,E>{

        private K key;
        private E data;

        SkipNode<K,E> next;
        SkipNode<K,E> down;

        public  SkipNode(){}

        public  SkipNode(K key,E data){
            this.data = data;
        }
    }

    private void choosePowers(){

       //int[] powers = {8,12,14,15};

       //this.powers =powers;

        powers = new int[maxLevel];


        for(int i = 0; i< this.maxLevel; i++){

            int data1 = 2 << (maxLevel-1);
            int data2 = 2 << (maxLevel-i-2);
            System.out.printf("%d - %d = %d",data1,data2,data1-data2);
            System.out.println();

            powers[i] = data1 - data2 ;
        }

    }
    private int chooseLevel(){

        int data = (int)Math.pow(2,maxLevel);
        int r = random.nextInt() % data;

        for(int i = 0; i< maxLevel; i++){
            if(r < powers[i]){
                return i;
            }
        }

        return  0;
    }


    public void choosePowers1() {
        powers = new int[maxLevel];
        powers[maxLevel-1] = (2 << (maxLevel-1)) - 1;    // 2^maxLevel - 1
        for (int i = maxLevel - 2, j = 0; i >= 0; i--, j++)
            powers[i] = powers[i+1] - (2 << j);           // 2^(j+1)
    }

    public int chooseLevel1() {
        int i, r = Math.abs(random.nextInt()) % powers[maxLevel - 1] + 1;
        for (i = 1; i < maxLevel; i++)
            if (r < powers[i])
                return i - 1; // return a level < the highest level;
        return i - 1;         // return the highest level;
    }



    public void insertData(E data){

        int level = chooseLevel1();



    }

}
