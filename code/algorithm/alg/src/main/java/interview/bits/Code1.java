package interview.bits;

/**
 *功能描述  不用中间变量交换两个变量的值
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code1 {

    public static void main(String args[]){

        int a = 2;
        int b = 3;
        System.out.println("a = " + a  + " b = " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a  + " b = " + b);
    }
}
