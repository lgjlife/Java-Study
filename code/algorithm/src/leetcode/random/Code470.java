package leetcode.random;

import java.util.Random;

/**
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 */
public class Code470 {
 
    public static void main(String[] args){

        Solution solution = new Solution();
        int result = solution.rand10();
    }
}

class Solution  {
    public int rand10() {
        return 0;
    }

    public int rand7() {
        
        int data =  new Random().nextInt(1);
        return data;
    }

}
