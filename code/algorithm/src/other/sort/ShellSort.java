package other.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        
        int[] arr = {178,6,12,78,12,4,654,43};
        int[] result = sort(arr);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] sort(int[] arr){        
        int increment = arr.length;        
        while(increment > 1){

            increment = increment/3+1;
            //使用直接插入法排序
            //先对increment后面的数据进行直接插入排序
            for (int i = increment; i < arr.length-1; i++) {
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

        }   
        return arr;
    }
}