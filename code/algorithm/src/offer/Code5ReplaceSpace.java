package offer;

/*
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."

 */
public class Code5ReplaceSpace {
    public static void main(String args[]){

        String s1 = " ";
        String s2 = "a b";
        String s3 = "ab ";
        String s4 = "a ";
        System.out.println(replaceSpace(s2));
    }

    public static String replaceSpace(String s) {

        if((s == null) || (s.length() == 0 )) return "";

        int sLen = s.length();

        int count = 0 ;

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }

        int newLen = sLen - count + count * 3;

        char[] newStr = new char[newLen];

        int j = s.length()-1;
        int i = newLen-1 ;
        while (i >= 0){

            char c = s.charAt(j--);
            if(c == ' '){
                newStr[i--] = '0';
                newStr[i--] = '2';
                newStr[i--] = '%';
            }else {
                newStr[i--] = c;
            }
        }

        return new String(newStr);

    }

}
