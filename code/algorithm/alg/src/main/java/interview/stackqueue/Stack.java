package interview.stackqueue;

public class Stack {

    private int size;
    private  Node head;


    public void push(int data){

        if (head == null){

            head = new Node(data);
            size++;

        }

        else {
            Node temp = head;
            Node node = new Node(data);

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;

            size++;
        }
    }


    public int pop(){

        if (size == 0){
            throw new RuntimeException("You stack is empty");
        }



        if(head.next == null){

            int result = head.val;
            head = null;
            size--;

            return result;

        }
        else {

            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }

            int result = temp.next.val;
            temp.next = null;
            size--;
            return result;
        }
    }

    public int peek(){
        if (size == 0){
            throw new RuntimeException("You stack is empty");
        }
        if(head.next == null){

            int result = head.val;
            return result;

        }
        else {

            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }

            int result = temp.next.val;
            return result;
        }
    }

    public boolean isEmpty(){

        return size==0;
    }


    public void printInfo(){
        System.out.println("size = " + size);

        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
            if(temp != null){
                System.out.print("-->");
            }
        }

        System.out.println();

    }

    private class  Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String args[]){

        Stack stack = new Stack();

        stack.push(10);

        System.out.println(stack.peek());
        stack.push(11);
        System.out.println(stack.peek());
        stack.push(12);
        System.out.println(stack.peek());
        stack.push(13);
        System.out.println(stack.peek());

        stack.printInfo();




        for(int i = 0; i< 5; i++){
            System.out.println("读取数据:" + stack.pop());
            stack.printInfo();
        }

    }

}
