package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

public class Code0207GetIntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curA = headA;
        ListNode curB = headB;

        while ( curA !=  curB ){

            curA = (curA == null)?headB:curA.next;
            curB = (curB == null)?headA:curB.next;

        }

        return curA;

    }

    public static void main(String args[]){

        ListNode l1 = ListUtil.getList(1,2,3,4,5);
        ListNode l2 = ListUtil.getList(1,2,3,4,5);

        ListNode l3 =  ListUtil.getList(6,7,8);

        ListNode l13 = ListUtil.insertNodeLast(l1,l3);
        ListNode l23 = ListUtil.insertNodeLast(l2,l3);

        ListNode result = getIntersectionNode(l1,l2);

        ListUtil.print(result);


    }
}
