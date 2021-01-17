package leetcode2021.bit.easy;

import leetcode2021.bit.util.BitUtil;

/**
 *
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 *  
 *
 * 进阶：
 *
 * 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 *

 */
public class Code268MissingNumber {

    public static int missingNumber(int[] nums) {

        byte[] datas = new byte[nums.length/8+1];

        for(int i = 0; i< nums.length; i++){
            int index = nums[i]/8;
            datas[index] |= 1<< (nums[i]%8);
           // System.out.println(i + " - " + nums[i] + "－"+ "index = " + index + " " +  BitUtil.byteToBinaryString(datas[1])  + "  "+ BitUtil.byteToBinaryString(datas[0]) );

        }

        for(int i = 0; i< datas.length; i++){
            if((datas[i] & 0xFF) != 0xFF){
                int result = i*8 + getPos(datas[i]);
                return result;
            }
        }
        return -1;

    }

    public static int getPos(byte data){

        for(int i = 0; i< 8; i++){

            if( (data&(1<<i)) == 0){
                return i;
            }
        }

        return -1;
    }

    public static int missingNumber1(int[] nums) {

        int res = nums.length;
        for(int i = 0; i< nums.length; i++){

            res ^= (i^nums[i]);
        }

        return res;

    }





    public static void main(String args[]){

        int[] nums = {9,6,4,2,3,5,7,0,1};

        int result = missingNumber1(nums);

        System.out.println("result = " + result);

        System.out.println(getPos((byte)0b11111011));



    }
}
