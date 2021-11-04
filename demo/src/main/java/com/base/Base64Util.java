package com.base;

public class Base64Util {
    char[] table = {};
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 255; i++) {
            System.out.printf("i=%d -- %s\r\n",i,charBinaryString((char)i));
        }
    }

    public static String Encode(String str){
        StringBuilder builder = new StringBuilder();
        char[] cArr = str.toCharArray();

        int i = 0;
        int count = 0;
        String[] temp= {};
        StringBuilder tempBuilder = new StringBuilder();
        while(i < cArr.length) {

            tempBuilder.append(charBinaryString(cArr[i]));
            count++;
            if(count == 3){
                count = 0;
                String s = tempBuilder.toString();

                String s1 = "00" + s.substring(0,6);
                String s2 = "00" + s.substring(6,12);
                String s3 = "00" + s.substring(12,18);
                String s4 = "00" + s.substring(18,24);


            }

            i++;
        }

        return builder.toString();
    }

    public static String charBinaryString(char c){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if((c & 0x80) != 0){
                builder.append(1);
            }
            else{
                builder.append(0);   
            }
            c = (char)(c<<1);
        }


        return builder.toString();
    }
}