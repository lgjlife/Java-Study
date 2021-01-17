package interview.list;



public class DoubleList {

    private DoubleNode head;


    public DoubleList(int... datas) {

        for(int data:datas){

            add(data);
        }
    }

    public void add(int data){

        if(head == null){
            head = new DoubleNode(data);
        }
        else {
            DoubleNode node = new DoubleNode(data);
            DoubleNode temp = head;

            while (temp.next != null){

                temp = temp.next;
            }
            temp.next = node;

            node.pre  = temp;
        }

    }


    public int removeLastData(){
        DoubleNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        int result = temp.value;

        temp.pre.next = null;

        return result;

    }

    public int removeHeadData(){
        DoubleNode temp = head;
        int result = head.value;
        head = head.next;
        head.pre = null;
        temp.next = null;
        return result;

    }

    public DoubleNode getHead(){

        return head;
    }

    public void printNote(DoubleNode head){

        DoubleNode node = head;

        while (node!=null){

            System.out.print(node.value);
            if(node.next != null){
                System.out.print("-->");
            }

            node = node.next;
        }

        System.out.println();

    }


    public void printList(){

        if(head != null){
            DoubleNode temp = head;

            while (temp != null){
                System.out.print(temp.value);
                if(temp.next != null){

                    System.out.print("-->");
                }
                temp = temp.next;
            }

        }

        System.out.println();
    }


    public class DoubleNode{

        public int value;
        public DoubleNode pre;
        public DoubleNode next;

        public DoubleNode(int value) {
            this.value = value;
        }
    }


    public static void main(String args[]){

        DoubleList doubleList = new DoubleList(1,2,3,4,5);
        doubleList.printList();

        doubleList.printNote(doubleList.getHead());

        doubleList.removeHeadData();
        doubleList.printList();

        doubleList.removeLastData();
        doubleList.printList();
    }
}
