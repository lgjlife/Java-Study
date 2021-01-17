package leetcode2021.doublePoint.easy;

import java.util.Arrays;

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

 */
public class Code283moveZeroes {

    public  static  void moveZeroes(int[] nums) {

        int p1 = 0,p2  = 0;
        int right = -1;
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == 0){

                right = (right == -1)?(i+1):right;
                for(int j = right; j < nums.length; j++){
                    if(nums[j] != 0){
                        right = j;
                        swap(nums,i,j);
                        break;
                    }

                }

            }

        }
    }

    public static void moveZeroes1(int[] nums) {

        if((nums == null) || (nums.length == 0 )){
            return;
        }

        int left = 0 ;


        for(int right = 0; right< nums.length ; right++){

            if(nums[right] != 0 ){
                int temp = nums[right];
                nums[right] =  nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void swap(int[] nums , int x,int y){

        if((x >= nums.length) || (y >= nums.length)) return;
        int temp = nums[x];
        nums[x] =  nums[y];
        nums[y] = temp;

    }
    public static void main(String args[]){

        int[] nums = {0,1,2,0,4};


        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));

    }
}
