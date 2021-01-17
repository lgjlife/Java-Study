package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *

 */
public class Code21MergeTwoLists {

    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();

        ListNode cur = head;

        while ( (l1 != null) && (l2 != null)){

            if(l1.val <= l2 .val){

                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;

        }

        if(l1 != null){

            cur.next = l1;
        }

        if(l2 != null){
            cur.next = l2;
        }

        return head.next;

    }

    public static void main(String args[]){

        ListNode l1 = ListUtil.getList(1,2,4);
        ListNode l2 = ListUtil.getList(1,3,4);

        ListNode result = mergeTwoLists(l1,l2);

        ListUtil.print(result);
    }


}
