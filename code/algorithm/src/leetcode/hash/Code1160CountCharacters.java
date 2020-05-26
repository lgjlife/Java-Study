package leetcode.hash;

public class Code1160CountCharacters {
    
    public static void main(String[] args) {
        CountCharactersSolution solution = new CountCharactersSolution();

        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int result = solution.countCharacters(words, chars);
        System.out.println("result = " + result);
    }
}
//TODO:拼写单词
/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。

假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。

注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。

返回词汇表 words 中你掌握的所有单词的 长度之和。
 */
class CountCharactersSolution {
    public int countCharacters(String[] words, String chars) {

        
        int result = 0;
        char[] charDatas = chars.toCharArray();
        for (String word : words) {
            char[]  wordChars = word.toCharArray();
            
        }


        return result;
    }
}