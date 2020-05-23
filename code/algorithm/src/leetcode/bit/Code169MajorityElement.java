package leetcode.bit;

public class Code169MajorityElement {
    public static void main(String[] args) {
        
        int[] nums = {3,2,3};

        MajorityElementSolution solution = new MajorityElementSolution();
        int result = solution.majorityElement(nums);

        System.out.println("result = " + result);
    }
}
/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素  你可以假设数组是非空的，并且给定的数组总是存在多数元素。
示例 1:
输入: [3,2,3]
输出: 3
示例 2:
输入: [2,2,1,1,1,2,2]
输出: 2

解决思路:
摩尔投票法：
多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素，那么多数元素的数量一定大于其他元素的总数量
 3 x x 3 3
 3 3 3 x x
 这就相当于每个“多数元素”和其他元素 两两相互抵消，抵消到最后肯定还剩余至少1个“多数元素”。
 */

class MajorityElementSolution {
    public int majorityElement(int[] nums) {
       
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(result == nums[i]){
                count++;
            }
            else if(--count == 0){
                result = nums[i];
                count = 1;
            }
        }
        return result;
    }
}