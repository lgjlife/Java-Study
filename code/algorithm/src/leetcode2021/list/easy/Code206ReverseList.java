package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

public class Code206ReverseList {

    public static  ListNode reverseList(ListNode head) {

        ListNode cur = head,pre = null;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;


        }

        return pre;

    }

    public static void main(String args[]){

        ListNode listNode = ListUtil.getList(1,2,3,4,5,6);


        ListNode result =  reverseList(listNode);

        ListUtil.print(result);

    }

}
