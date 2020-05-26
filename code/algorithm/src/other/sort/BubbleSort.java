package other.sort;
import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args) {
        
        int[] arr = {1,6,12,78,12,4,6};
        int[] result = sort2(arr);

        System.out.println("result = " + Arrays.toString(result));
    }

    //普通交换排序，不符合两两相邻比较
    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] <= arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }
    //冒泡排序
    public static int[] sort1(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if(arr[j-1] >= arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
        return arr;
    }
    //优化
    public static int[] sort2(int[] arr){

        boolean flag = true;
        for (int i = 0; i < arr.length && flag == true; i++) {            
            flag = false;
            for (int j = arr.length-1; j > i; j--) {
                if(arr[j-1] >= arr[j]){
                    swap(arr, j-1, j);
                    flag = true;
                }
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