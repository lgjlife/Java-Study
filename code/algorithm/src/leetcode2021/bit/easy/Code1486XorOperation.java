package leetcode2021.bit.easy;

/*

给你两个整数，n 和 start 。

数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。

请返回 nums 中所有元素按位异或（XOR）后得到的结果。

 

示例 1：

输入：n = 5, start = 0
输出：8
解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
     "^" 为按位异或 XOR 运算符。
示例 2：

输入：n = 4, start = 3
输出：8
解释：数组 nums 为 [3, 5, 7, 9]，其中 (3 ^ 5 ^ 7 ^ 9) = 8.

 */
public class Code1486XorOperation {

    public static int xorOperation(int n, int start) {

        int res = 0;
        for(int i = 0; i< n; i++){

            res ^= (start + 2*i);

        }

        return res;
    }

    public static void main(String args[]){

        System.out.println(xorOperation(4,3));

    }
}
