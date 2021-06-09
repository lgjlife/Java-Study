package leetcode2021.binary.easy;

/*

实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2
示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842...,
     由于返回类型是整数，小数部分将被舍去。

* */
public class Code69MySqrt {

    public static void main(String args[]){

        System.out.println(mySqrt(4));

    }

    public static int mySqrt(int x) {

        int left = 0,right = x;

        int mid = (left + right) >> 1;

        while (left <= right){

            if( ( mid  <= x /mid)
                && ((mid+1) > x/(mid+1) )){

                return mid;
            }
            else if ( mid  < x /mid){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

            mid = (left + right) >> 1;
        }


        return -1;
    }
}
