package leetcode2021.stack.easy;

import java.util.Stack;

public class Offer09Cqueue {


    class CQueue{

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();


        public CQueue() {
        }

        public void appendTail(int value){

            while (s2.size() != 0){
                s1.push(s2.pop());
            }

            s1.push(value);

        }

        public int  deleteHead(){

            if((s1.size() == 0 ) && (s2.size() == 0)) return -1;

            if(s2.isEmpty()){
                while (s1.size() != 0){
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }
    }
}
