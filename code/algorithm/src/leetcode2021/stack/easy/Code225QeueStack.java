package leetcode2021.stack.easy;

import java.util.Deque;
import java.util.LinkedList;

public class Code225QeueStack {

    Deque<Integer> deque = new LinkedList<>();

    class MyStack {

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            deque.addLast(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return deque.removeLast();
        }

        /** Get the top element. */
        public int top() {
            return deque.getLast();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return deque.isEmpty();
        }
    }

    public static void main(String args[]){

        MyStack stack = new Code225QeueStack().new MyStack();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }
}
