package leetcode2021.dp.hard;

public class Regex {


    public static void main(String args[]){

        String text = "aa";
        String pattern = "a*";

        System.out.println(isMatchDiot(text,pattern));


        System.out.println(isMatch(text,pattern));


    }

    public static boolean isMatchDiot(String text,String pattern){

        if( (text == null) || (pattern == null)) return  false;



        boolean match = (text.charAt(0) == pattern.charAt(0))
                || (pattern.charAt(0) == '.');

        if(pattern.substring(1).length() == 0){

            return  match;
        }
        else if((text.substring(1).length() == 0) && (pattern.substring(1).length() != 0)){
            return false;
        }
        else
            return match && isMatchDiot(text.substring(1), pattern.substring(1));
    }

    public static boolean isMatch(String text,String pattern) {

        if ((text == null) || (pattern == null)) return false;

        if(text.isEmpty() && pattern.isEmpty())  return true;


        boolean match = (text.charAt(0) == pattern.charAt(0))
                || (pattern.charAt(0) == '.');


        if((text.substring(1).length() != 0) && (pattern.substring(1).length() != 0)) {
            return match && isMatch(text.substring(1), pattern.substring(1));
        }
        else {
            return false;
        }

    }


}



