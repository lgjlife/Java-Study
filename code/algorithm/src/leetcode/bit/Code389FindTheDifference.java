package leetcode.bit;

public class Code389FindTheDifference {
    public static void main(String[] args) {
        
        int[] nums = {4,1,2,1,2};

        FindTheDifferenceSolution solution = new FindTheDifferenceSolution();
        
        String s = "abcd";
        String t = "abcde";

        int result = solution.findTheDifference(s,t);

        System.out.println("result = " + result);
    }
}
/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。请找出在 t 中被添加的字母。
示例:
输入：
s = "abcd"
t = "abcde"
输出：
e
解释：
'e' 是那个被添加的字母。

解题思路: 同一个数异或为0，两个字符串中只有一个字符是单独的，因此其他字符异或之后为0，所有字符异或之后的值就是多出来的字符
        先把字符串转换成byte数组，再进行异或
 */
class FindTheDifferenceSolution {
    public char findTheDifference(String s, String t) {
        byte[] sByte = s.getBytes();
        byte[] tByte = t.getBytes();

        int minLen = sByte.length < tByte.length? sByte.length:tByte.length;
        int data = 0;
        for (int i = 0; i < minLen; i++) {
            data ^= sByte[i]^tByte[i];
        }
        if(minLen != sByte.length ){
            data ^= sByte[sByte.length-1];
        }
        else{
            data ^= tByte[tByte.length-1];
        }

        return (char)data;
    }
}
