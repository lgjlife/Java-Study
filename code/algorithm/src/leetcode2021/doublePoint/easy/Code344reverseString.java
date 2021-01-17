package leetcode2021.doublePoint.easy;

import java.util.Arrays;

public class Code344reverseString {

    public static void reverseString(char[] s) {

        int l = 0 , r = s.length-1;

        while (l <= r){

            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }


    }
    public static void main(String args[]){

        char[] nums = {'h','e','l','l','o','e'};

        reverseString(nums);
        System.out.println(Arrays.toString(nums));
    }
}
