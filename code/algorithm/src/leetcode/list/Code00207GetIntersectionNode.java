package leetcode.list;

public class Code00207GetIntersectionNode {
    
    public static void main(String[] args) {
        GetIntersectionNodeSolution solution = new GetIntersectionNodeSolution();

        ListNode commomListNode = ListNodeUtil.createListNode(new int[]{8,4,5});
        //
        ListNode headA = new ListNode(4);
        ListNode tailA = headA;
        tailA.next = new ListNode(1);
        tailA = tailA.next;
        tailA.next = commomListNode;
       


        //
        ListNode headB = new ListNode(5);
        ListNode tailB = headB;
        tailB.next = new ListNode(0);
        tailB = tailB.next;
        tailB.next = new ListNode(1);
        tailB = tailB.next;
        tailB.next = commomListNode;
        

        ListNodeUtil.printListNode(headA);
        ListNodeUtil.printListNode(headB);
     

        ListNode result = solution.getIntersectionNode(headA, headB);
    
        System.out.println(result);

    }

    
}

// Definition for singly-linked list.

/**
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 * 
 * 解决:双指针法,
 * 　链表A:  A---D---Ｃ
 * 　链表B:  B---D---C
 * 　两个链表假如有相交节点Ｄ，每条链的头结点先走完自己的链表长度,然后回头走另外的一条链表,那么两结点一定为相交于D点。
 * 　Ａ的走法: A->D->C->B->D ,走过的路程　AD+DC+BD,
 * 　Ｂ的走法: B->D->C->A->D ,走过的路程　BD+DC+AD,
 * 　两个走过的距离相同，必定相交与节点Ｄ。
 * 　如果第二次仍然走到尾节点，那么说明不存在相交节点，返回null
 */
class GetIntersectionNodeSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        int flag = 0;

        while(listA!=listB){
            if(listA != null){
                listA  =listA.next;
            }
            else{
                listA = headB;
                flag++;
            }

            if(listB != null){
                listB  =listB.next;
            }
            else{
                listB = headA;
                flag++;
            }
            if(flag > 2){
                return null;
            }
        }
        return listA;
    }
}
