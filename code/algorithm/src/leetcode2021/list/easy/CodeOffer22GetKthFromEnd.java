package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

public class CodeOffer22GetKthFromEnd {

    public static  ListNode getKthFromEnd(ListNode head, int k) {

        if(head == null) throw  new NullPointerException();
        ListNode l1 = head,l2 = head;
        while ((k >  0) && (l1 != null)){
            l1 = l1.next;
            k--;
        }
        while (l1 != null){
            l2 = l2.next;
            l1 = l1.next;
        }
        return l2;

    }

    public static void main(String args[]){

        ListNode list = ListUtil.getList(1,2,3,4,5);
        int k = 3;

        ListNode result = getKthFromEnd(list,k);

        ListUtil.print(result);

    }
}
