package leetcode.bit;

public class ConvertInteger {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        ConvertIntegerSolution solution = new ConvertIntegerSolution();
        int A = 0b11101;
        int B = 0b01111;
        int result = solution.convertInteger(A,B);

        System.out.println("result = " + result);
    }
}

/**
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。

示例1:

 输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 输出：2

 */
class ConvertIntegerSolution {
    public int convertInteger(int A, int B) {
        int result = 0;

        int data = A^B;
        while(data != 0){
            result += data&0x01;
            data >>>=1;            
        }

        return result;
    }
}