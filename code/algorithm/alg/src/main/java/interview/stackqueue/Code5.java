package interview.stackqueue;

import java.util.Random;

/**
 *功能描述  用一个栈实现另一个栈的排序
 * 要求:只能申请一个栈和变量，不能申请其他数据结构
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code5 {


    public Stack sort( Stack stack){

        Stack helpStack = new Stack();
        int temp = 0;

        while(!stack.isEmpty()){
            temp = stack.pop();
            while((!helpStack.isEmpty())&&((helpStack.peek()) > temp)){
                stack.push(helpStack.pop());
            }
            helpStack.push(temp);
        }
        return helpStack;
    }

    public static Stack getStack(){

        Stack stack = new Stack();

        for(int i = 0; i< 10; i++){
            stack.push(new Random().nextInt(100));
        }

        return stack;

    }
    public static void main(String args[]){

        Stack stack = getStack();

        Code5 demo = new Code5();

        Stack resultStack = demo.sort(stack);

        resultStack.printInfo();

    }

}
