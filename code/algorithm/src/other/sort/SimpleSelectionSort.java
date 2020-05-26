package other.sort;

import java.util.Arrays;

public class SimpleSelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {1,6,12,78,12,4,6};
        int[] result = sort(arr);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr){

        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                 if(arr[j] < arr[min]){
                     min = j;
                 }
            }
            if(min != i){
                swap(arr, i, min);
            }
        }
        return arr;
    }


    public static void swap(int[] arr,int i , int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}