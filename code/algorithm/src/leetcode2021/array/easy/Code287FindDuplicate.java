package leetcode2021.array.easy;

public class Code287FindDuplicate {

    public static void main(String args[]){

        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

        int [] nums1 = {0,1, 2,3, 4, 0, 5, 6};

        System.out.println(findRepeatNumber2(nums));
    }
    public static int findDuplicate(int[] nums) {

        if( (nums == null) || (nums.length < 2)) return -1;

        int[] table = new int[nums.length+1];

        for(int i = 0; i < nums.length;i++){
            if(table[nums[i]] == nums[i]) {
                return nums[i];
            }

            table[nums[i]] = nums[i];
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
