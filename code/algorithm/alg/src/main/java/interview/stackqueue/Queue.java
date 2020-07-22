package interview.stackqueue;

public class Queue {

    private int size;
    private Node head = new Node();
    private Node tail = null;

    public Queue() {
        head.next = tail;
    }

    public void add(int data){

        Node newNode  = new Node(data);

        if(tail == null){
            tail = newNode;
            head.next = tail;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;

    }


    public int poll(){

        if(head.next == null){
            throw  new NullPointerException();
        }

        int result = head.next.val;
        head = head.next;
        size--;

        return result;

    }

    private class  Node{
        private int val;
        private Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void printInfo(){
        System.out.println("size = " + size);

        Node temp = head;

        while (temp.next!=null){
            System.out.print(temp.next.val);
            temp = temp.next;
            if(temp.next != null){
                System.out.print("-->");
            }
        }

        System.out.println();

    }

    public static void main(String args[]){
        Queue queue = new Queue();

        queue.add(11);
        queue.add(12);
        queue.add(13);

        queue.printInfo();

        for(int i = 0; i< 4;i++){


            System.out.println("读取的数据:" + queue.poll());

            queue.printInfo();
        }
    }
}
