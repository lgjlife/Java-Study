package leetcode2021.bit.util;

public class BitUtil {

    public static String byteToBinaryString(byte data){

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< 8; i++){
            int bit = (data&(1<<i)) == 0?0:1;
            builder.append(bit);
        }

        return builder.reverse().toString();


    }

    public static String intToBinaryString(int data){

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< 64; i++){
            int bit = (data&(1<<i)) == 0?0:1;
            builder.append(bit);
        }

        return builder.reverse().toString();


    }


    public static void main(String args[]){

        System.out.println(byteToBinaryString((byte)0b1011));

        System.out.println(byteToBinaryString((byte)-3));
    }


}
