package leetcode2021.array.easy;

/*
给定一个整数数组，判断是否存在重复元素。

如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。

 */
public class Code217ContainsDuplicate {

    public static void main(String args[]){

        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        if( (nums == null) || (nums.length<2))return false;

        // Map<Integer,Integer> map = new HashMap<>();
        int[] table = new int[nums.length];
        for(int i = 0; i < nums.length;i++){

            if(table[nums[i]] == nums[i]){
                 return true;
            }
            else{
                table[nums[i]] = nums[i] ;
            }

        }
        return false;

    }
}
