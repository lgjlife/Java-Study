package leetcode2021.bit.easy;

public class Code461hammingDistance {

    public static int hammingDistance(int x, int y) {

        int res = x^y;

        int count = 0;
        for(int i = 0; i< 32; i++){

            if((res & 0x1) == 1) count++;
            res >>= 1;

        }

        return count;
    }

    public static int conut(int data){

        data = (data & 0x55555555) + ((data >>1) &  0x55555555);
        data = (data & 0x33333333) + ((data >>2) &  0x33333333);
        data = (data & 0x0F0F0F0F) + ((data >>4) &  0x0F0F0F0F);
        data = (data * (0x01010101))>>24;

        return data;
    }


    public static void main(String args[]){

        System.out.println(hammingDistance(1,4));


        System.out.println(conut(-1));
    }
}
