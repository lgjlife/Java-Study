package offer;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
长度n的数组，数值为0~n-1，有一个重复，找出重复的数

[1,2,2,3,4,5,6,7] 数组是无序的,2 <= n <= 100000

方法1:　先排序再查找，排序的复杂度为O(n*logn)

方法2:


 */
public class Code1Duplicate {

    public static void main(String args[]){

        int [] nums = null;
        int [] nums0 = {1,1,2};

        int [] nums1 = {0,1, 2,3, 4, 0, 5, 6};

        System.out.println(findRepeatNumber2(nums1));
    }

    public static int findRepeatNumber(int[] nums) {

        if(nums == null) return -1;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){

            Integer val = map.get(nums[i]);
            if( val == null){
                map.put(nums[i],nums[i]);
            }
            else if(val == nums[i]){
                return val;
            }
        }

        return -1;

    }

    public static int findRepeatNumber1(int[] nums) {

        if(nums == null) return -1;


        Integer[] table = new Integer[nums.length];

        Arrays.fill(table,-1);

        for(int i = 0; i< nums.length; i++){

            if(table[nums[i]] == -1){
                table[nums[i]] = nums[i];
            }
            else if(table[nums[i]] == nums[i]){

                return nums[i];

            }
        }

        return -1;

    }

    public static int findRepeatNumber2(int[] nums) {

        if(nums == null) return -1;

        int[] table = new int[nums.length];

        for(int i = 0; i< nums.length; i++){

            while (nums[i] != i){

                if(table[nums[i]] == nums[i]){
                    return nums[i];
                }
                table[nums[i]] = nums[i];
            }

        }

        return -1;

    }


}
