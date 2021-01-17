package interview.list;

public class Code3 {

    public List.Node removeMidNode(List.Node head){
        if(head == null){
            return null;
        }
        if(head.next == null ){
            return head;
        }
        if(head.next.next == null){
            return head.next;
        }
        List.Node pre = head;
        List.Node cur = head.next.next;
        while((cur.next != null) && (cur.next.next != null)) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    public List.Node removeNodeByRation(List.Node head,int a,int b){

        if(head == null){
            return  null;
        }
        if((a < 1) || (a > b)){
            return head;
        }
        List.Node cur = head;

        //求解总数
        int count = 0 ;
        while (cur != null){
            cur = cur.next;
            count++;
        }

        int index = (int)(Math.floor(count*a*1.0/b + 0.5));

        if(index  == 1){
            return head.next;
        }
        cur = head;
        while ((cur != null) && ((index--) < 0)){
            cur = cur.next;
        }

        cur.next  = cur.next.next;
        return head;

    }

    public static void main(String args[]){
        List list = new List(1,2,3,4);

        Code3 code = new Code3();

        List.Node result = code.removeMidNode(list.getHead());

        list.printNote(result);


        System.out.println("------------------------------------");


        List list1 = new List(1,2,3,4,5);

        List.Node node1 = code.removeNodeByRation(list1.getHead(),2,5);
        list1.printNote(node1);


    }

}
