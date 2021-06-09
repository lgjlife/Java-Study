package leetcode2021.array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Code1TwoSum {


    public int[] twoSum(int[] nums, int target) {

        if((nums == null) && nums.length == 0){
            return new int[0];
        }

        int diff;

        HashMap<Integer,Integer> map = new HashMap();

        diff = target - nums[0];
        map.put(diff,0);

        for(int i = 1; i< nums.length ;i++){

            //System.out.println(map);

            if(map.get(nums[i]) != null){
                return new int[]{map.get(nums[i]),i};
            }
            else {
                diff = target - nums[i];
                map.put(diff,i);
            }


        }

        return new int[0];

    }

    public int[] twoSum1(int[] nums, int target) {

        if((nums == null) && nums.length == 0){
            return new int[0];
        }

        int diff;

        int bitMap = 0;
        bitMap = bitMap & (1 << nums[0]);

        for(int i = 1; i< nums.length; i++){

            if((( 1 << (target - nums[i]))  & bitMap) == 1){

            }
        }




        return new int[0];

    }



    public static void main(String args[]){
        Code1TwoSum code1TwoSum = new Code1TwoSum();

        int[] nums = new int[]{2, 7, 11, 15};

        int target = 19;

        int[] result = code1TwoSum.twoSum(nums,target);

        System.out.println("result = " + Arrays.toString(result));

    }
}
