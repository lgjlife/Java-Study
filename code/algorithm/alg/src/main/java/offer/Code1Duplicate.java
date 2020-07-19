package offer;

import java.util.HashMap;
import java.util.Map;

/**
 *功能描述
 * @author lgj
 * @Description 　　　
 * @date 　
 *
 *
 * 找出重复的数字 数组长度为n,数值为0- n-1，
*/
public class Code1Duplicate {

    public static void main(String args[]){

        int result = -1;

        int[] test1 = {0,1,2,3,4,5};
        int[] test2 = {0,1,2,3,1,2};


        System.out.println(duplicate1(test1));
        System.out.println(duplicate1(test2));

        //System.out.println(duplicate2(test1));
        //System.out.println(duplicate2(test2));
        System.out.println(duplicate2(getData(499)));



    }


    public static  int duplicate1(int[] arr){

        Map<Integer,Integer>  map = new HashMap();


        for(int i = 0; i< arr.length; i++){

            if( null == map.get(arr[i])){
                map.put(arr[i],arr[i]);
            }
            else {
                return arr[i];
            }
        }
        return -1;
    }

    public static  int duplicate2(int[] arr){

        for(int i = 0; i< arr.length; i++){

            while(arr[i] != i){

                int val = arr[i];
                if(val == arr[val]){
                    return val;
                }

                int temp = arr[val];
                arr[val] = val;
                arr[i] = temp;

                System.out.println("内循环" + i);
            }

            System.out.println("外循环：" + i);
        }

        return -1;
    }


    public static int[] getData(int length){

        int[] data = new int[length];

        for(int i = 0; i< length-2; i++){

            data[i]  = i+1;
        }

        data[length-2] = 0;
        data[length-1] = 1;

        return data;
    }

}
