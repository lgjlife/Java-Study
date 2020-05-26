package other.sort;

import java.util.Arrays;

public class StraightInsertionSort {
    public static void main(String[] args) {
        
        int[] arr = {5,2,3,1};
        int[] result = sort(arr);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                int j=i+1;
                int data = arr[j];
                while(  (j > 0) && (arr[j-1]> data)){
                    arr[j] = arr[j-1];
                    j--;
                }
            
                arr[j] = data;
            }
        }
        return arr;
    }
}