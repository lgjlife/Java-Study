package offer;


import base.ListNode;
import base.ListUtil;

//删除节点
public class Code18deleteNode {


    public static void main(String args[]){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListUtil.printList(l1);

        deleteNode(l1,l3);

    }
    public static ListNode deleteNode(ListNode head, ListNode node) {



        return null;
    }
}
