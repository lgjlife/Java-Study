package interview.list;



/**
 *功能描述  反转单链表　/反转双链表
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code4 {


    public List.Node reverseList(List.Node  head){

        if(head == null){
            return null;
        }

        List.Node pre = null;
        List.Node next = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head =  next;

        }

        return pre;

    }

    public DoubleList.DoubleNode reverseList(DoubleList.DoubleNode  head){

        if(head == null){
            return null;
        }

        DoubleList.DoubleNode pre = null;
        DoubleList.DoubleNode next = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head =  next;


        }

        return pre;
    }

    public static void main(String args[]){

        List list1 = new List(1,2,3,4,5);

        Code4 code = new Code4();

        List.Node result = code.reverseList(list1.getHead());
        list1.printNote(result);
    }
}
