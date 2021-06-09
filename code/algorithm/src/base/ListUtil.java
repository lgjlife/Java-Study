package base;

public class ListUtil {

    public static void printList(ListNode head){

        if(head == null) {
            System.out.print("null");
            return;
        }
        System.out.print(head.val + "-->");
        printList(head.next);

    }
}
