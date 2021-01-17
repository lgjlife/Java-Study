package interview.list;

public class List {

    private int size;
    private Node head = null;

    public List(int... datas) {


        for (int data:datas){
            add(data);
        }

    }

    public void add(int data){

        if(head == null){
            head = new Node(data);
            size++;
        }

        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }

    }

    public Node getHead(){

        return  head;
    }






    public boolean isEmpty(){
        return size==0;
    }


    public class Node{

        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void printNote(List.Node head){

        List.Node node = head;

        while (node!=null){

            System.out.print(node.val);
            if(node.next != null){
                System.out.print("-->");
            }

            node = node.next;
        }

        System.out.println();

    }


    public void printList(){

        if(head != null){
            Node temp = head;

            while (temp != null){
                System.out.print(temp.val);
                if(temp.next != null){

                    System.out.print("-->");
                }
                temp = temp.next;
            }

        }

        System.out.println();
    }

    public static void main(String args[]){

        List list = new List(1,2,3,4,5);

        list.printList();
    }
}
