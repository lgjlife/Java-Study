package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

//实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
public class Code0202kthToLast {


    public int kthToLast(ListNode head, int k) {
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
        return l2.val;
    }


    public static void main(String args[]){

        ListNode list = ListUtil.getList(1,2,3,4,5);
        int k = 12;


        Code0202kthToLast code0202kthToLast = new Code0202kthToLast();
        int result = code0202kthToLast.kthToLast(list,k);

        System.out.println("result = " + result);
    }
}
