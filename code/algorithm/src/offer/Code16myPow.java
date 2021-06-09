package offer;

public class Code16myPow {

    public static void main(String args[]){

        int n = -2147483648;



        for(int i = -5; i< 5; i++){

            System.out.println(myPow(2,i));
        }
    }

    public static double myPow(double x, int n) {

        if(n==0) return 1;
        if(n==-1) return 1/x;
        if((n&1) != 0) return myPow(x*x,n>>1);
        else return  myPow(x*x,n>>1);

    }

}
