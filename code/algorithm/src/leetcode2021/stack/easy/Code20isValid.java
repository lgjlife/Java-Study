package leetcode2021.stack.easy;

import java.util.Stack;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。


 */
public class Code20isValid {

    public static  boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        char[] chars =  s.toCharArray();

        for(char c:chars){

            if(stack.size() == 0){
                stack.push(c);
            }

            else if(isPair(stack.peek(),c)){
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }


        return stack.size() == 0;
    }

    public static boolean isPair(char left,char right){

        return ((left == '(') && ( right == ')'))
                || ((left == '[') && ( right == ']'))
                || ((left == '{') && ( right == '}'));

    }

    public static void main(String args[]){

        System.out.println(isValid("{([})}"));
    }

}
