package leetcode.bit;

public class Code136SingleNumber {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        SingleNumberSolution solution = new SingleNumberSolution();
        int result = solution.singleNumber(nums);

        System.out.println("result = " + result);
    }
}
/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:
输入: [2,2,1]
输出: 1
示例 2:
输入: [4,1,2,1,2]
输出: 4
 */
class SingleNumberSolution {
    public int singleNumber(int[] nums) {

        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}