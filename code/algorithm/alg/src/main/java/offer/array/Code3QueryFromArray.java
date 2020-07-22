package offer.array;

public class Code3QueryFromArray {

    public static void main(String args[]){

        int arr[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15},{9,11,13,17}};

        System.out.println( query(arr,134));

        byte[] data = "STRING DATA".getBytes();

        System.out.println();


    }

    public static boolean query(int[][] arr,int data){

        if((arr==null) || (arr.length == 0 )){
            return false;
        }
        if(arr[0].length == 0){
            return false;
        }

        int columns = arr[0].length;
        int rows =  arr.length;


        int row = 0;
        int column = columns -1;

        System.out.println("rows =  " + rows + " columns = " + columns);

        while((row <  rows) && (column >0)){

            if(data < arr[row][column]){
                column--;
            }
            else if(data == arr[row][column]){
                return true;
            }
            else {
                row++;
            }

        }





        return false;
    }
}
