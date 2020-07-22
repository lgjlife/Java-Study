package offer.recursion;

public class Fibonacci {

    public static void main(String args[]){

        System.out.println(Integer.MAX_VALUE);

        int n = 50;
        //System.out.println(fibonacci1(n));
        for(int i = 0; i< n; i++){

            long result = fibonacci2(i);
            long diff = Long.MAX_VALUE - result;
            System.out.println("i = "+ i + " result = " + result + "  diff = " + diff );
        }
    }

    public static   int fibonacci1(int n){

        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci1(n-1) + fibonacci1(n-2);
    }


    public static   long fibonacci2(int n){

        if(n == 0) return 0;
        if(n == 1) return 1;


        long fn1 = 1;
        long fn2 = 0;
        long fn = 0;

        for(int i = 2; i<= n; i++){

            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;

        }


        return fn;
    }

}
