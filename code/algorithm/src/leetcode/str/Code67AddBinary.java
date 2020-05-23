package leetcode.str;


public class Code67AddBinary {
    
    public static void main(String[] args) {
        Code67Solution solution = new Code67Solution();
        String a = "1010", b = "1011";
        String result = solution.addBinary(a,b);
        System.out.println("result = " + result);
       
    }
}
/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示） 输入为 非空 字符串且只包含数字 1 和 0。

示例 1:
输入: a = "11", b = "1"
输出: "100"
示例 2:
输入: a = "1010", b = "1011"
输出: "10101"
 
提示：
每个字符串仅由字符 '0' 或 '1' 组成。
1 <= a.length, b.length <= 10^4
字符串如果不是 "0" ，就都不含前导零。

 */
class Code67Solution {

    public String addBinary(String a, String b) {
        

        int aIndex = a.length()-1;
        int bIndex = b.length()-1;

        int aVal = 0;
        int bVal = 0;
        int flag = 0;

        StringBuilder stringBuilder = new StringBuilder();
        while((aIndex >= 0) && (bIndex >= 0)){
            aVal = a.charAt(aIndex--)=='1'?1:0;
            bVal = b.charAt(bIndex--)=='1'?1:0; 
            int val = aVal+bVal+flag;
            stringBuilder.append(val%2==1?1:0);
            flag = val >>1;
        }
        //超出长度处理
        //a的长度较长
        if(aIndex >= 0){
            while(aIndex >= 0){
                aVal = a.charAt(aIndex--)=='1'?1:0;
                int val = aVal+flag;
                stringBuilder.append(val%2==1?1:0);
                flag = val >>1; 
            }
        }
        //b的长度较长
        else if(bIndex >= 0){
            while(bIndex >= 0){
                bVal = b.charAt(bIndex--)=='1'?1:0;
                int val = bVal+flag;
                stringBuilder.append(val%2==1?1:0);
                flag = val >>1; 
            }
        }
        //最高位还有进位
        if (flag == 1) {
            stringBuilder.append('1');
        }
        

        return stringBuilder.reverse().toString();
    }

}