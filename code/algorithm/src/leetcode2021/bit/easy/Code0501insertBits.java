package leetcode2021.bit.easy;

import leetcode2021.bit.util.BitUtil;

/*

插入。给定两个32位的整数N与M，以及表示比特位置的i与j。编写一种方法，将M插入N，使得M从N的第j位开始，到第i位结束。假定从j位到i位足以容纳M，也即若M = 10 011，那么j和i之间至少可容纳5个位。例如，不可能出现j = 3和i = 2的情况，因为第3位和第2位之间放不下M。

示例1:

 输入：N = 1024(10000000000), M = 19(10011), i = 2, j = 6
 输出：N = 1100(10001001100)
示例2:

 输入： N = 0, M = 31(11111), i = 0, j = 4
 输出：N = 31(11111)



 */
public class Code0501insertBits {


    public static int insertBits(int N, int M, int i, int j) {

        int diff = j - i +1;

        while( (M != 0) || diff != 0){

           N =  N & (~(1<<i));
           int bit = M&0x1;
           N = N| (bit<<i);
           M =M>>1;
           i++;

           diff--;
        }

        return N;
    }

    public static void main(String args[]){

        int N = 2032243561,M=10,i=24,j=29;
        System.out.println(Integer.toBinaryString(N));
        //System.out.println(Integer.toBinaryString(M));
        int result = insertBits(N,M,i,j);
        System.out.println(Integer.toBinaryString(result));
        System.out.println(result);

    }

    /*

111 1001 0010  0001 1001 0011 0110 1001
1111010001000011001001101101001
1001010001000011001001101101001
     1010
    * */
}
