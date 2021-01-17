package leetcode2021.bit.easy;


/*

给定两个字符串 s 和 t，它们只包含小写字母。

字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

请找出在 t 中被添加的字母。

输入：s = "abcd", t = "abcde"
输出："e"
解释：'e' 是那个被添加的字母。

 */
public class Code389FindTheDifference {

    public static char findTheDifference(String s, String t) {

        byte[] sByts = s.getBytes();
        byte[] tByte = t.getBytes();

        int res = 0;
        for(int i = 0; i< sByts.length; i++){
            res ^= sByts[i]^tByte[i];
        }

        res ^=tByte[tByte.length-1];
        return (char)(res);
    }

    public static void main(String args[]){
        String s = "", t = "y";

        System.out.println(findTheDifference(s,t));

    }
}
