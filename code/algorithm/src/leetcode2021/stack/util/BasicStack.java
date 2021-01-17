package leetcode2021.stack.util;

public class BasicStack {

    private Node head = new Node();
    private Node tail = new Node();

    public BasicStack() {

        tail = head;
        head.next = tail;

    }

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node() {

        }
    }

    public void push(int x) {

        Node node = new Node(x);
        tail.next = node;
        tail = tail.next;
    }

    public void pop() {



    }

//    public int top() {
//
//    }

}
