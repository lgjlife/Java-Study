package other.fib;

public class Fib {

    public static void main(String args[]){


        int n = 10;
        for(int i = 0; i< 45; i++){

           // System.out.printf("n = %d  递归解法: %d\r\n",i,fib1(i));
            System.out.printf("　　　 非递归解法: %d\r\n",fib2(45));
            System.out.printf("　　　非递归解法1: %d\r\n",fib3(45));

        }


    }


    public static  long fib1(long n){

        if(n <= 0 ) return  0;
        if((n == 1 ) || ( n == 2)) return  1;

        return fib1(n-1) + fib1(n -2 );

    }

    public static  long fib2(int n){

        if(n <= 0 ) return  0;

        long[] arr = new long[n+1];

        return helper(arr,n);
    }

    public static  long helper(long[] arr,int n){
        if((n == 1 ) || ( n == 2)) return  1;

        if(arr[n] != 0 ) return arr[n];

        arr[n] = helper(arr, n-1) + helper(arr,n-2);

        return arr[n];
    }

    public static  long fib3(int n){

        if(n <= 0 ) return  0;
        if((n == 1 ) || ( n == 2)) return  1;

        long[] arr = new long[n+1];
        arr[1] = arr[2] = 1;

        for(int i = 3; i<= n; i++){

            arr[i] = arr[i-1] + arr[i-2];
        }


        return arr[n];
    }
}
