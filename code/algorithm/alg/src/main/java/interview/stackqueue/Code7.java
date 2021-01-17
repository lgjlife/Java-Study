package interview.stackqueue;

import java.util.LinkedList;

/**
 *功能描述  获取窗口最大值的数组
 * 　4,3,5,4,3,3,4,6,7
 *   [4,3,5],4,3,3,4,6,7 --- max = 5
 *   4,[3,5,4],3,3,4,6,7 --- max = 5
 *   4,3,[5,4,3],3,4,6,7 --- max = 5
 *   4,3,5,[4,3,3],4,6,7 --- max = 4
 *   4,3,5,4,[3,3,4],6,7 --- max = 4
 *   4,3,5,4,3,[3,4,6],7 --- max = 6
 *   4,3,5,4,3,3,[4,6,7] --- max = 7

返回:[5,5,5,4,4,6,7]

 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code7 {

    public int[] getMaxWindown(int[] arr,int w){

        if((arr==null) || (w<1) || (arr.length < w)){
            return new int[]{};
        }

        LinkedList<Integer> qmax = new LinkedList<>();

        int[] res = new int[arr.length-w+1];
        int index = 0;
        for(int i = 0; i< arr.length; i++){

            while ((!qmax.isEmpty()) && (arr[qmax.peekLast()] <= arr[i])){

              int remove =   qmax.pollLast();

            }
            qmax.addLast(i);

            if (qmax.peekFirst() + w == i){
                qmax.pollFirst();
            }

            System.out.println(qmax);
            if(i >= w-1){
                res[index++] = arr[qmax.peekFirst()];
            }


        }

        return res;

    }


    public static void main(String args[]){

        int[] arr = {4,3,5,3,4,3,4,6,7};

        Code7 demo = new Code7();

        int[] result = demo.getMaxWindown(arr,3);

        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + ",");
        }


    }
}
