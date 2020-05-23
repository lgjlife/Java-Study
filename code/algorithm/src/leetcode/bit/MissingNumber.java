package leetcode.bit;

public class MissingNumber {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        MissingNumberSolution solution = new MissingNumberSolution();
        int[] data = {9,6,4,2,3,5,7,0,1};
        int result = solution.missingNumber(data);

        System.out.println("result = " + result);
    }
}
/**
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 * 
 * 思路： 同数值异或为0， 这个数组的值为0-n,也就是多出来的值被n替代
 * 
 * 原本数组: [0,1,2,3]
 * 实际数组: [0,4,2,3] ,可以看出所求的没有出现的数字是1
 * 以上所有数据全部异或= 1^4; 
 * 4即为数组的长度n
 * result = 1^4^n  = 1^4^4= 1.
 */

class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }
        result ^= nums.length;
        return result;
    }
}