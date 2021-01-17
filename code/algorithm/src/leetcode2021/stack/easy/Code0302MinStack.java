package leetcode2021.stack.easy;

import java.util.Stack;

public class Code0302MinStack {

    class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();


        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {

            stack.push(x);

            if(!minStack.isEmpty()){
                if(x <= minStack.peek()){
                    minStack.push(x);
                }
            }
            else {
                minStack.push(x);
            }

        }

        public void pop() {

            if(!stack.isEmpty()){
                int result = stack.pop();

                if(!minStack.isEmpty()){
                    if(result == minStack.peek()){
                        minStack.pop();
                    }
                }
            }
        }

        public int top() {
            if(!stack.isEmpty()){
                return stack.peek();
            }
            return -1;
        }

        public int getMin() {
            if(!minStack.isEmpty()){
                return minStack.peek();
            }
            return -1;
        }
    }

    public static void main(String args[]){


    }
}
