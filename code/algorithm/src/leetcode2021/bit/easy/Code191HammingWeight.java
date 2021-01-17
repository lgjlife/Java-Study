package leetcode2021.bit.easy;

/*
编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class Code191HammingWeight {

    public static int hammingWeight(int n) {

        int count = 0;
        while (n != 0){
            if((n&0x1)  == 1) count++;
            n >>>=1;
        }
        return count;
    }

    public static void main(String args[]){

        System.out.println(hammingWeight(5));
    }
}
