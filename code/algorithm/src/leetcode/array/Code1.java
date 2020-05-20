package leetcode.array;

import java.util.Arrays;

/**
 * 量数之和
 * 给定一个数组和一个目标值,返回和为目标值的两个数的数组位置
 * example: 
 *  Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1]

 */
public class Code1{
    public static void main(String[] args){


        Solution solution = new Solution();

        int[] nums= {2, 7, 11, 15};
        int target = 22;
        int[] result =  solution.twoSum1(nums, target);

        System.out.println("result = " + Arrays.toString(result));
    }
}
class Solution {

    //常规方法 慢
    public int[] twoSum(int[] nums, int target) {

        if(nums.length < 2){
            return  new int[]{};
        }

        int max = nums.length-1;
        for(int i  = 0; i < max;i++){
            int diff = target - nums[i];
            for(int index = i+1 ; index < nums.length ; index++){
                if(diff == nums[index]){
                    return new int[]{i,index};
                }
    
            }
        }

        
        return  new int[]{};
    }

    public int[] twoSum1(int[] nums, int target) { 
            int volume =2048; //100000000000 
            int bitMode = volume-1;//011111111111 
            int [] result =new int[volume];

            for (int i=0;i<nums.length;i++){
                int c = (target - nums[i]) & bitMode;
                System.out.println(c +  "  " + Integer.toBinaryString(c));
                if (result[c]!=0){
                    return new int[]{result[c],i};
                }
                result[nums[i] & bitMode]=i;
            }
        return null;
    }

}
