package interview.stackqueue;

/**
 *功能描述  使用递归逆序栈
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code3 {

    private Stack stack = new Stack();

    public Code3() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

    }

    public int getAndRemoveLastElement(Stack stack){

        int result = stack.pop();
        if (stack.isEmpty()){
           return result;
        }else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }


    }

    public void reverse(Stack stack){
        if (stack.isEmpty()){
            return;
        }
        int last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

    public static void main(String args[]){
        Code3 code3 = new Code3();
        code3.stack.printInfo();


        code3.reverse(code3.stack);

        code3.stack.printInfo();

    }
}
