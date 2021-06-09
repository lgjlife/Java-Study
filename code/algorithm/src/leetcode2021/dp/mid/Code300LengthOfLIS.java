package leetcode2021.dp.mid;
/*
给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。

子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。

 
示例 1：

输入：nums = [10,9,2,5,3,7,101,18]
输出：4
解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
示例 2：

输入：nums = [0,1,0,3,2,3]
输出：4
示例 3：

输入：nums = [7,7,7,7,7,7,7]
输出：1

 */
public class Code300LengthOfLIS {

    public static void main(String args[]){

        int[] nums1 = {};

        int[] nums2 = {0};
        int[] nums3 = {10,9,2,5,3,7,101,180,105};
        int[] nums4 = {0,1,0,3,2,3};
        int[] nums5 = {10,9,2,5,3,7,101,18};
        int[] nums6 = {4,10,4,3,8,9};

      //  System.out.println(lengthOfLIS(nums1));
     //   System.out.println(lengthOfLIS(nums2));
     //   System.out.println(lengthOfLIS(nums3));
        int[] nums = nums6;

        System.out.println(lengthOfLIS1(nums));
        System.out.println(lengthOfLIS2(nums));
        System.out.println(lengthOfLIS3(nums));
    }

    public static int lengthOfLIS3(int[] nums) {

        if (nums == null) return -1;
        if (nums.length == 0) return -1;

        int[] dp = new int[nums.length];

        int count = 0;
        int left = 0;
        int right = count;

        for (int i = 0; i < nums.length; i++) {

            int mid = (left + right) >> 1;
            int cur = nums[i];
            while (left < right){

                if(dp[mid] == cur){

                }


            }

        }

        return count;
    }

    public static int lengthOfLIS2(int[] nums) {

        if(nums == null ) return  -1;
        if(nums.length == 0 ) return  -1;

        int[] top = new int[nums.length];
        // 牌堆数初始化为 0
        int piles = 0;
        for (int i = 0; i < nums.length; i++) {
            // 要处理的扑克牌
            int poker = nums[i];
            /***** 搜索左侧边界的⼆分查找 *****/
            int left = 0, right = piles;
            while (left < right) {
                int mid = (left + right) / 2;
                if (top[mid] > poker) {
                    right = mid;
                } else if (top[mid] < poker) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            // 没找到合适的牌堆， 新建⼀堆
            if (left == piles) piles++;
            // 把这张牌放到牌堆顶
            top[left] = poker;
        } // 牌堆数就是 LIS ⻓度
        return piles;
    }




    public static int lengthOfLIS1(int[] nums) {

        if(nums == null ) return  -1;
        if(nums.length == 0 ) return  -1;

        int[] dp = new int[nums.length];
        for(int i = 0; i< dp.length; i++){

            dp[i] = 1;
        }

        int max = 0;
        for(int i = 0; i< nums.length; i++){

            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){


                    dp[i] = ((dp[i] > dp[j]+1)?dp[i]:dp[j]+1);


                }
            }
            max = (max > dp[i])?max:dp[i];
        }





        return max;

    }
}
