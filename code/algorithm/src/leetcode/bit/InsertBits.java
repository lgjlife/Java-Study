package leetcode.bit;

public class InsertBits {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        InsertBitsSolution solution = new InsertBitsSolution();
        int N = 2032243561;
        int M = 10;
        int i = 24, j = 29;  
        int expect = 1243714409;
        
        
             
        
        int result = solution.insertBits(N,M,i,j);
        System.out.println("N      = " + Integer.toBinaryString(N) + "  " + N);
        System.out.println("M      = " + Integer.toBinaryString(M) + "  " + M);
        System.out.println("result = " + Integer.toBinaryString(result));
        System.out.println("expect = " + Integer.toBinaryString(expect));
    }
}
/**
 * 插入。给定两个32位的整数N与M，以及表示比特位置的i与j。编写一种方法，将M插入N，使得M从N的第j位开始，到第i位结束。
 * 假定从j位到i位足以容纳M，也即若M = 10 011，那么j和i之间至少可容纳5个位。例如，不可能出现j = 3和i = 2的情况，因为第3位和第2位之间放不下M。

示例1:

 输入：N = 10000000000, M = 10011, i = 2, j = 6
 输出：N = 10001001100
示例2:

 输入： N = 0, M = 11111, i = 0, j = 4
 输出：N = 11111

 解答思路:
 知识点：
num = 0b11101;
设置num第3位为0： num &= ~(1<<3); --> 0b11001
设置num第2位为1: num |= (1<<2); --> 0b11111

注意点：如果区间的长度[i,j]超过M的长度，剩余的要补0

 */
class InsertBitsSolution {
    public int insertBits(int N, int M, int i, int j) {
        while((i<=j)){
            int bit  = (M&0x01);
            N = (bit== 0)?N&(~(1<< i)):N|(1<< i);        
            M >>= 1;
            i++;
        }
        return N;
    }
}