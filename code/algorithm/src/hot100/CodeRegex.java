package hot100;


/*
给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。

'.' 匹配任意单个字符
'*' 匹配零个或多个前面的那一个元素
所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。

 */
public class CodeRegex {

    public static void main(String args[]){

        System.out.println("".isEmpty());
        System.out.println("" == null);

        String[] strs1 = {"a","."};
        String[] strs2 = {"aac",".ac"};
        String[] strs3 = {"abc","a.c"};
        String[] strs4 = {"abc","ab."};
        String[] strs5 = {"abc","abd"};

        System.out.println();

//        System.out.println(isMatch(strs1[0],strs1[1]));
//        System.out.println(isMatch(strs2[0],strs2[1]));
//        System.out.println(isMatch(strs3[0],strs3[1]));
//        System.out.println(isMatch(strs4[0],strs4[1]));
//        System.out.println(isMatch(strs5[0],strs5[1]));

        String[] strs11 = {"aa","a*"};
        String[] strs22 = {"aa","a*"};
        String[] strs33 = {"ab",".*"};
        String[] strs44 = {"aab","c*a*b"};


        System.out.println(isMatch(strs11[0],strs11[1]));
        System.out.println(isMatch(strs22[0],strs22[1]));
        System.out.println(isMatch(strs33[0],strs33[1]));
        System.out.println(isMatch(strs44[0],strs44[1]));


    }

    public static boolean isMatch(String text, String pattern) {
        if ((text == null) || (pattern == null)) return false;

        if(text.isEmpty() && pattern.isEmpty())  return true;

        if(pattern.isEmpty() && (!text.isEmpty())) return false;

        boolean match = (text.charAt(0) == pattern.charAt(0))
                || (pattern.charAt(0) == '.');


        if( (pattern.length() >= 2) && (pattern.charAt(1) == '*')){

            if(text.substring(1).isEmpty()) return match;

            //isMatch(text,pattern.substring(2))
            //                    ||
            return ( (match)&&( isMatch(text.substring(1),pattern)) );
        }

        if((text.substring(1).length() != 0) && (pattern.substring(1).length() != 0)) {
            return match && isMatch(text.substring(1), pattern.substring(1));
        }
        //当前字符为最末尾字符
        else if((text.substring(1).length() == 0) && (pattern.substring(1).length() == 0)){
            return match;
        }
        //有一个为空，说明长度不同
        else {
            return false;
        }
    }


}
