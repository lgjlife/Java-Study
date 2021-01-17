package leetcode2021.stack.easy;

public class Code1047removeDuplicates {

    public static String removeDuplicates(String S) {

        char[] chars = new char[S.length()];
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            if (index != 0 && S.charAt(i) == chars[index - 1]) {
                index--;
            } else {
                chars[index++] = S.charAt(i);
            }
        }
        return new String(chars, 0, index);

    }

    public static void main(String args[]){

        System.out.println(removeDuplicates("abbaca"));
    }
}
