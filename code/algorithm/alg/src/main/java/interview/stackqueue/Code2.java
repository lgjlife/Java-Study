package interview.stackqueue;


/**
 *功能描述  用两个栈实现队列
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code2 {

    //
    private  Stack stack1 = new Stack();
    private  Stack stack2 = new Stack();



    public void add(int data){

        if(stack2.isEmpty()){
            stack1.push(data);
        }
        else {

            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());

            }
            stack1.push(data);
        }

    }


    public int remove(){

        if(stack2.isEmpty()){

            while (!stack1.isEmpty()){

                stack2.push(stack1.pop());
            }


        }
        return stack2.pop();
    }

    public static void main(String args[]){

        Code2 queue = new Code2();

        queue.add(11);
        queue.add(12);
        System.out.println(queue.remove());
        queue.add(13);


        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }

}
