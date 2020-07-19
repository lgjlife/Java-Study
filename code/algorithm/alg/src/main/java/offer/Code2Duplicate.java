package offer;

/**
 *功能描述
 * @author lgj
 * @Description 　　　
 * @date 　
 *
 * 长度n+1的数组，数值为1-n，至少有一个重复的数字，找出这个重复的数字
*/
public class Code2Duplicate {

    public static void main(String args[]){

        int[] arr ={1,3,1,4,5,6,2};

        System.out.println(getDuplicate(arr));
    }

    public static  int getDuplicate(int[] arr){

        if( (arr == null) || (arr.length == 1)){
            return  -1;
        }
        int start = 1;
        int end = arr.length-1;

        while (start <= end){

            int mid = ((start + end) >> 1);

            int count = getCount(arr,start,mid);

            if(start == end){
                if(count >1){
                    return start;
                }
                else break;
            }
            if(count > (mid-start +1)){
                end = mid;
            }
            else {
                //==
                start =mid+1;
            }
        }


        return -1;



    }


    public static  int getCount(int[] arr,int start,int end){

        int count = 0;
        for(int i = 0; i< arr.length; i++){

            if((arr[i] >= start)  && (arr[i] <= end)){
                count++;
            }
        }

        System.out.println("start=" + start + " end = " + end + " count = "  + count);
        return count;
    }
}


