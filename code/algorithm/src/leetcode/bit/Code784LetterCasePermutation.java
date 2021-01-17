package leetcode.bit;

import java.util.ArrayList;
import java.util.List;

public class Code784LetterCasePermutation {
    public static void main(String[] args) {
        LetterCasePermutationSolution solution = new LetterCasePermutationSolution();
        // string data =  "a1b2";
        // List<string> result = solution.letterCasePermutation(N,M,i,j);
       // System.out.println("result = " + result);
    }
}
/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。

示例:
输入: S = "a1b2"
输出: ["a1b2", "a1B2", "A1b2", "A1B2"]

输入: S = "3z4"
输出: ["3z4", "3Z4"]

输入: S = "12345"
输出: ["12345"]
注意：
S 的长度不超过12。
S 仅由数字和字母组成。
 */

//todo
class LetterCasePermutationSolution {
    public List<String> letterCasePermutation(String S) {

        List<String> list = new ArrayList();
        

        return list;
    }

    private char getValue(char c){

        if((c >= '0') && (c <= '9')){
            return c;
        }
        else if((c >= 'a') && (c <= 'z')){
            return (char)(c-32);
        }
        else if((c >= 'A') && (c <= 'Z')){
            return (char)(c+32);
        }

        return c;
    }
}
