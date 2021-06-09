package offer;

import leetcode2021.list.base.ListNode;

/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。



示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
 */
public class Code6ReversePrint {

    public static void main(String args[]){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;


        int[] res = reversePrint(l1);

        for (int data:res){
            System.out.println(data);
        }

    }

    static int len;
    static int count;
    static int[] res;

    public static   int[] reversePrint(ListNode head) {

        if(head == null){
            len = count;
            return new int[len];
        }

        count++;
        res = reversePrint(head.next);
        res[len - count ] = head.val;
        count--;
        return res;
    }
}
