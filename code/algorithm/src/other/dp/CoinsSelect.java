package other.dp;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;

public class CoinsSelect {

    public static void main(String args[]){

        int[] coins = {1,2,5};
        int amount = 11;

        System.out.printf("结果: %d",coinChange(coins,amount));

        System.out.printf("素数: %d",countPrimes(1,17));

    }


    public static int coinChange(int[] coins, int amount){


        return 0;
    }

    public static int dp(int amount){

        if(amount == 0) return 0;
        if(amount < 0 ) return -1;


        return  0;
    }

    static int countPrimes(int start,int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, false);
        for (int i = start; i * i < n; i++)
            if (!isPrim[i])
                for (int j = i * i; j < n; j += i)
                    isPrim[j] = true;
        int count = 0;
        for (int i = start; i < n; i++)
            if (isPrim[i]) count++;
        return count;
    }



}
