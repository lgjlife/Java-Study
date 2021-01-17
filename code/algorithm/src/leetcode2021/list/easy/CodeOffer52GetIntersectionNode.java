package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/**
 * 输入两个链表，找出它们的第一个公共节点。

 如果两个链表没有交点，返回 null.
 在返回结果后，两个链表仍须保持原有的结构。
 可假定整个链表结构中没有循环。
 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。



 */
public class CodeOffer52GetIntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curA = headA;
        ListNode curB = headB;
        //
        //有相交点: a + b + c = c +b + a ;
        //无相交点: a + b = b+ a ,同时为null，所以不会四循环
        while (  curA != curB){
            curA = (curA == null)?headB:curA.next;
            curB = (curB == null)?headA:curB.next;
        }
        return curA;

    }

    public static void main(String args[]){




        ListNode l1 = ListUtil.getList(1,2,3,4,5);
        ListNode l2 = ListUtil.getList(1,2,3,4,5);

        //ListUtil.insertNode()

        ListNode result = getIntersectionNode(l1,l2);

        ListUtil.print(result);

    }

}
