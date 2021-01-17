package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Code83DeleteDuplicates {


    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode header = new ListNode();
        header.next =  head;

        ListNode pre = head;
        ListNode next = head.next;

        while (next != null){

            if(pre.val == next.val){
                pre.next = next.next;
                next = next .next;
            }
            else {
                pre = pre.next;
                next = next.next;
            }
        }
        return header.next;
    }

    public static void main(String args[]){
        ListNode l1 = ListUtil.getList(1,1,2,4,4,4);

        ListNode result = deleteDuplicates(l1);

        ListUtil.print(result);


    }
}
