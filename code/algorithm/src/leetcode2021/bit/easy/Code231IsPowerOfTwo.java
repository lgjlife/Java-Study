package leetcode2021.bit.easy;

public class Code231IsPowerOfTwo {

    public static  boolean isPowerOfTwo(int n) {

        if(n < 0) return false;
        int count = 0;

        for(int i = 0; i< 32; i++){

            if((n & (1<<i)) != 0){
                count++;
            }
        }

        return count == 1;
    }

    public static  boolean isPowerOfTwo1(int n) {

        if (n < 0) return false;

        if( ( n & (n-1)) == 0) return true;
        return false;
    }


    public static void main(String args[]){

        System.out.println(isPowerOfTwo1(-2147483648));

    }
}
