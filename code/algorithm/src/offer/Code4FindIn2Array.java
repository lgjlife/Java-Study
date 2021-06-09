package offer;

/*

二维数组　左右上下递增数组，寻找是否存在num

 */
public class Code4FindIn2Array {

    public static void main(String args[]){

        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15},{8,9,12,16}};
        int num = 3;
        int[][] array1 = {{},{}};
        int[][] array2 = {};
        System.out.println(array1[0].length);
        System.out.println(array1.length);
        System.out.println(find(array,num));
    }

    public static boolean find(int[][] array,int num){

        if(array == null  ) return false;
        if (array[0].length == 0 ) return  false;


        int row = 0;
        int col = array[0].length-1;

        while((row < array.length) && (col > 0)){

            if(num == array[row][col]){
                return true;
            }
            else if(num < array[row][col]){
                col--;
            }
            else {
                row++;
            }
        }

        return false;
    }
}
