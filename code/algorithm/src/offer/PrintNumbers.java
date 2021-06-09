package offer;

import java.util.Arrays;

public class PrintNumbers {

    public static void main(String args[]){

        System.out.println();

        int[] arr = printNumbers(2);

        for(int  data:arr){

            System.out.println(data);
        }

    }

    public static  int[] printNumbers(int n) {

        int max =  ((int)Math.pow(10,n)) - 1;

        int[] arr = new int[max];

        for(int i = 1 ; i < max +1;i++){
            arr[i-1] = i;
        }

        return arr;
    }

}
