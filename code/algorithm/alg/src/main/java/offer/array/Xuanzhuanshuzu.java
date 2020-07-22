package offer.array;

/**
 *功能描述 
 * @author lgj  求旋转数组最小值
 * @Description 　　　
 * @date 　
*/
public class Xuanzhuanshuzu {

    public static void main(String args[]){

        int[] arr = {8,9,2,3,4,5,6,7};
        int[] arr1 = {1,1,0,1,1,1};
        System.out.println(func1(arr));
        System.out.println(func1(arr1));
    }


    public static int func1(int[] arr){

        int left = 0;
        int right = arr.length-1;
        int mid = (left + right) >> 2;

        int index = 0;

        while (left<=right){

            if((arr[left] == arr[right])
            &&(arr[left] == arr[mid])){
                return minInOrder(arr , left, right);

            }

            if(arr[mid] > arr[mid+1]){

                index = mid+1;
                break;
            }
            if(arr[mid] < arr[mid-1]){
                index = mid;
                break;
            }

            if(arr[mid] >= arr[0]){

                left = mid;
            }
            else {
                right = mid ;
            }

            mid = (left + right) >> 2;

        }

        return arr[index];

    }

    static int minInOrder(int[] arr ,int left,int right){

        int result = arr[left];
        for(int i = left+1; i< right; i++){

            if(result > arr[i]){
                result =arr[i];
            }

        }

        return result;

    }
}
