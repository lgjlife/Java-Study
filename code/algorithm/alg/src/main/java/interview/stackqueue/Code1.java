package interview.stackqueue;

/**
 *功能描述 一个具有getmin功能的栈
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code1 {

    private Stack normalStack = new Stack();
    private Stack minStack = new Stack();


    public void push(int data){

        normalStack.push(data);

        if(minStack.isEmpty()){

            minStack.push(data);
        }
        else {

            if(minStack.peek() >= data){
                minStack.push(data);
            }
        }
    }

    public int pop(){
        int result = normalStack.pop();

        if(!minStack.isEmpty()){

            if(minStack.peek() == result){

                minStack.pop();
            }
        }
        return result;
    }
    public int getMin(){

        return minStack.peek();
    }


    public static void main(String args[]){

        Code1 demo = new Code1();



        demo.push(3);
        printGetMin(demo);

        demo.push(4);
        printGetMin(demo);

        demo.push(1);
        printGetMin(demo);

        demo.push(1);
        printGetMin(demo);


        demo.push(5);
        printGetMin(demo);

        //////////////////////

        System.out.println("=============================================");
        for(int i = 0; i< 5; i++){

            demo.pop();
            printGetMin(demo);
        }







    }

    public static void printGetMin(Code1 demo){


        System.out.println("-------------");
        demo.normalStack.printInfo();
        System.out.println("getMin = " + demo.getMin());
        System.out.println("-------------");
    }
}
