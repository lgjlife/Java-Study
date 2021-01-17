package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class CodeOffer06ReversePrint {

    int len = 0;
    int count = 0;
    int[] res ;

    public   int[] reversePrint(ListNode head) {

        if(head == null){
            len = count;
           return new int[count];
        }

        count++;

        res = reversePrint(head.next);
        count--;

        res[len - count - 1] = head.val;

        return res;

    }

    public static void main(String args[]){
        ListNode listNode = ListUtil.getList(1,2,3,4,5,6);

        CodeOffer06ReversePrint demo = new CodeOffer06ReversePrint();


        int[] result = demo.reversePrint(listNode);

        System.out.println();



    }
}
