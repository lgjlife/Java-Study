package alg.string;


/**
 *功能描述  字符串匹配，暴力解法，时间复杂度　n*m
 *
 * ababcababa
 * abc
 * 输出2
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class StringBf {

    public static  int BFMatch(String s,String p){

        byte[] sByte = s.getBytes();
        byte[] pByte = p.getBytes();

        int index = 0 ;

        for(int i = 0; i< sByte.length; i++){
            index = i;
            for(int j = 0; j < pByte.length ; j++){
                if(index == sByte.length) return -1;
                if(sByte[index++] == pByte[j]){
                    if(j == pByte.length-1)return i;
                    continue;
                }
                else {
                    break;
                }

            }
        }
        return -1;
    }

    public static void main(String args[]){

        String s1 = "ababcababa";
        String s2 = "abc";

        int result = BFMatch(s1,s2);

        System.out.println("result = " + result);
    }
}
