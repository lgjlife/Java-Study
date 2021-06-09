package hot100;

/*
 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 示例 1:

输入: s = "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

0 <= s.length <= 5 * 104
s 由英文字母、数字、符号和空格组成

 */
public class Code03LengthOfLongestSubstring {

    public static void main(String args[]){

        String s1 = "" ;
        String s2 = "a" ;
        String s3 = "aa";
        String s4 = "abcabc";
        String s5 = "jbpnbwwd";

        System.out.println(lengthOfLongestSubstring1(s1));
        System.out.println(lengthOfLongestSubstring1(s2));
        System.out.println(lengthOfLongestSubstring1(s3));
        System.out.println(lengthOfLongestSubstring1(s4));
        System.out.println(lengthOfLongestSubstring1(s5));
    }


    public static int lengthOfLongestSubstring(String s) {


        int[] last = new int[128];

        for(int i = 0; i< last.length; i++){

            last[i] = -1;
        }

        int start = 0;
        int res = 0;

        for(int i = 0; i< s.length(); i++){

            char index = s.charAt(i);

            start = Math.max(start,last[index] + 1);
            res = Math.max(res,i-start+1);
            last[index] = i;


        }


        return res;
    }

    public static int lengthOfLongestSubstring1(String s) {


        int[] last = new int[128];


        for(int i = 0; i< last.length; i++){

            last[i] = -1;
        }
        //f(i-1)
        int curLength = 0;
        int maxLength  = 0;

        for(int i = 0; i< s.length(); i++){

            int preIndex = last[s.charAt(i)];
            //当字符未出现过的时候
            //当字符出现过时，并且diff  > f(i-1)
            if( (preIndex < 0) || ( (i - preIndex) > curLength )){
                curLength++;
            }
            else {
                //当字符出现过时，并且diff <= f(i-1)
                //最新的长度为diff
                if(curLength > maxLength){
                    maxLength = curLength;

                }

                curLength = i - preIndex;
            }


            last[s.charAt(i)] = i;

        }
        if(curLength > maxLength ) maxLength = curLength;

        return maxLength;
    }


}
