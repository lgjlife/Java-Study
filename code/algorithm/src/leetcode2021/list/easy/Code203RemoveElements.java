package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/*
删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 */
public class Code203RemoveElements {

    public static ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }

        ListNode header = new ListNode(1);

        header.next = head;
        ListNode cur = header.next;
        ListNode pre = header;

        while (cur != null){

            if(cur.val == val){
                pre.next = pre.next.next;
            }
            else {
                pre = cur;
            }
            cur = cur.next;

        }
        return header.next;


    }

    public static void main(String args[]){

        ListNode l1 = ListUtil.getList(1,2);
        ListNode result = removeElements(l1,2);

        ListUtil.print(result);

    }
}
