package leetcode2021.dp.mid;

/*
给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。

一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。

例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。

 

示例 1：

输入：text1 = "abcde", text2 = "ace"
输出：3
解释：最长公共子序列是 "ace" ，它的长度为 3 。
示例 2：

输入：text1 = "abc", text2 = "abc"
输出：3
解释：最长公共子序列是 "abc" ，它的长度为 3 。
示例 3：

输入：text1 = "abc", text2 = "def"
输出：0
解释：两个字符串没有公共子序列，返回 0 。
 

提示：

1 <= text1.length, text2.length <= 1000
text1 和 text2 仅由小写英文字符组成。

  a b c b c b a
a 1 1 1 1 1 1 1
b 1 2 2 2 2 2 2
c 1 2 3 3 3 3 3
b 1 2 3 4 4 4 4
a 1 2 3 4 4 4 5


当c1[i] == c[j],dp[i][j] = dp[i-1][j-1] + 1;
当c1[i] != c[j],dp[i][j] = max(dp[i-1][j],dp[i][j-1])
 */
public class Code1143LongestCommonSubsequence {


    public static void main(String args[]){

        String str1 = "abcba",str2 = "abcbcba";

        System.out.println(longestCommonSubsequence(str1,str2));
    }

    public static  int longestCommonSubsequence(String text1, String text2) {

        if((text1 == null) || (text2 == null)) return 0;
        if((text1.length() == 0) || (text2.length() == 0)) return 0;

        char[] c1 = text1.toCharArray();
        char[] c2 = text2.toCharArray();


        int[][] dp = new int[c1.length +1][c2.length +1];

        for(int i = 1; i< c1.length+1; i++){

            for(int j = 1; j < c2.length+1; j++){

                if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }



        return dp[c1.length][c2.length];


    }

    public void  print(char[] c1,char[] c2,int[][] dp){
        System.out.print("  ");
        for(int j = 1; j < c2.length +1; j++){
            System.out.print(c2[j-1] + " ");
        }
        System.out.println();
        for(int i = 1; i< c1.length +1; i++){
            System.out.print(c1[i-1] + " ");
            for(int j = 1; j < c2.length +1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
