package interview.list;

/**
 *功能描述
 反转单链表的部分，给定头节点head ,和from ,to，反转第　from-to范围的节点

 1-->2-->3-->4-->5 --> null,from = 2,to = 4;

 ==> 1-->4-->3-->2--5-->null

 1-->2--3-->null

 ==> 3-->2-->1-->null

 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code5 {


    public List.Node reverseList(List.Node head,int from,int to){

        if(head == null) {
            return null;
        }

        int count = 0 ;

        List.Node pre = null;
        List.Node next = null;
        List.Node temp = head;

        while ((temp.next != null) && ( (count++) < from)){
            temp = temp.next;
        }

        while ((temp != null) && ( (count++) <= to)){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp =  next;
        }

        return head;

    }





    public static void main(String args[]){
        List list1 = new List(1,2,3,4,5);
        list1.printList();
        Code5 code = new Code5();

        List.Node result = code.reverseList(list1.getHead(),2,4);
        list1.printNote(result);
    }
}
