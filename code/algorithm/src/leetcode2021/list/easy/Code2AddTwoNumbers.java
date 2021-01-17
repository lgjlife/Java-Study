package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

public class Code2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head =  new ListNode();
        ListNode cur = head;
        int flag = 0;

        while ( (l1 != null)|| (l2 != null)){

            if(l1 != null){
                flag += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                flag += l2.val;
                l2 = l2.next;
            }

            cur.next = new ListNode(flag%10);;
            flag = flag/10;
            cur = cur.next;

        }

        if(flag == 1){
            cur.next = new ListNode(flag);;
            cur = cur.next;
        }

        return head.next;
    }
    public static void main(String args[]){

        ListNode l1 = ListUtil.getList(2,4,3);
        ListNode l2 = ListUtil.getList(5,6,4);

        Code2AddTwoNumbers code2AddTwoNumbers = new Code2AddTwoNumbers();
        ListNode result = code2AddTwoNumbers.addTwoNumbers(l1,l2);

        ListUtil.print(result);
    }
}
