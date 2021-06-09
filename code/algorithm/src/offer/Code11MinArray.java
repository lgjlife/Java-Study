package offer;

/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  

示例 1：

输入：[3,4,5,1,2]
输出：1
示例 2：

输入：[2,2,2,0,1]
输出：0

 */
public class Code11MinArray {

    public static void main(String args[]){


        int nums[] = {0};
        int nums1[] = {2,1};
        int nums2[] = {10,2,10,10,10};
        int nums3[] = {3,4,1,2};
        int nums4[] = {3,4,1,2,2,2};
        int nums5[] = {1,2,2,2};

     //   System.out.println(minArray(nums));
       // System.out.println(minArray(nums1));
        System.out.println(minArray(nums5));
      //  System.out.println(minArray(nums3));
      //  System.out.println(minArray(nums4));
     //   System.out.println(minArray(nums5));

    }

    public static int minArray(int[] numbers) {



        if((numbers == null ) || numbers.length == 0) return -1;
        int indexLeft = 0 ;
        int indexRight = numbers.length-1;

        if(numbers[indexLeft] < numbers[indexRight]){
            return numbers[0];
        }

        int mid = (indexLeft + indexRight) >> 1;

        while(numbers[indexLeft] >=  numbers[indexRight]){

            if( (numbers[indexLeft] == numbers[indexRight])
                    &&(numbers[mid] <= numbers[indexLeft])){
                return getMin(numbers);
            }

            if(indexLeft == indexRight -1){
                mid = indexRight;
                break;
            }



            if(numbers[mid] >= numbers[indexRight]){
                indexLeft = mid;
            }
            else if(numbers[mid] <= numbers[indexLeft]){
                indexRight = mid;
            }
            mid = (indexLeft + indexRight) >> 1;


        }


        return numbers[mid];
    }

    public static int getMin(int[] numbers) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i< numbers.length; i++){
            min = (min < numbers[i])?min:numbers[i];
        }

        return min;
    }
}
