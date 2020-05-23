package leetcode.bit;

public class Code191HammingWeight {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        HammingWeightSolution solution = new HammingWeightSolution();
        int data = 0b11111111111111111111111111111101;
        int result = solution.hammingWeight(data);

        System.out.println("result = " + result);
    }
}
/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数
 */
 class HammingWeightSolution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0){
            count += (n & 0x01);
            n = n>>>1;
        }
        return count;
    }
}
