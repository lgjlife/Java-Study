package hot100;

/*
给你一个字符串 s，找到 s 中最长的回文子串。


 */
public class Code5longestPalindrome {

    public static void main(String args[]){

        String str = "12345441";
        String str1 = "aaa";
        String str2 = "a";
        String str3 = "ab";
        String str4 = "aa";

        longestPalindrome("aaa");

        String[] strs = {"a","aa","ab","aaa","aaaa","012211","123454321","123454367"};

        System.out.println(str1.substring(0,1));



        for(String s : strs){
            System.out.println(s + "-->" + longestPalindrome(s));
        }



    }


    //中心扩展法
    public static String longestPalindrome(String s) {

        int maxLen =0;
        int start = 0,end = 0;
        char[] str = s.toCharArray();

        for(int i = 0; i< s.length(); i++){

            int  count1 = expand(str,i-1,i+1);
            int  count2 = expand(str,i,i+1);

            if(count1 >= maxLen){
                maxLen = count1;
                start = i - count1;
                end = start + 2 *count1 + 1;
            }
            if(count2 > maxLen){
                maxLen = count2;
                start = i - count2 + 1;
                end = start + count2 * 2 ;
            }

        }

       // System.out.printf("\r\ns=%s, start = %d,end = %d ",s,start,end);

        if(maxLen == 0) return s.substring(0,1);

        return s.substring(start,end);
    }

    public static int expand(char[] str ,int left ,int right){

        int count  = 0 ;

        while ( (left >= 0) && (right < str.length)){

            if(str[left] == str[right]){
                left--;
                right++;
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }


}
