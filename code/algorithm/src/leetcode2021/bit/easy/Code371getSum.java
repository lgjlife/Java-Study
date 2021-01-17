package leetcode2021.bit.easy;

/*
不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。

计算二进制值相加： 5-101，7-111
第一步：相加各位的值，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111。
第二步：计算进位值，得到1010，相当于各位做与操作得到101，再向左移一位得到1010，(101&111)<<1。
第三步重复上述两步， 各位相加 010^1010=1000，进位值为100=(010&1010)<<1。 继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果。

 */
public class Code371getSum {

    public static int getSum(int num1, int num2) {

        while(num2!=0)
        {
            int temp=num1^num2;// 各位相加的值
            num2=(num1&num2)<<1;// 进位值
            num1=temp;
        }
        return num1;
    }

    public static void main(String args[]){

        System.out.println(getSum(-8,2));

        System.out.println(-1 << 1);
        System.out.println(-1^2);
    }
}
