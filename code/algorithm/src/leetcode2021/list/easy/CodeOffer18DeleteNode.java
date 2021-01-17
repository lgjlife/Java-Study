package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/*
给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

返回删除后的链表的头节点。

注意：此题对比原题有改动

示例 1:

输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
示例 2:

输入: head = [4,5,1,9], val = 1
输出: [4,5,9]
解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 

说明：

题目保证链表中节点的值互不相同
若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点

 */
public class CodeOffer18DeleteNode {

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = cur;

        if(cur.val == val){
            return cur.next;
        }
        //1-2-3-4-5  5
        while((cur != null) ){
            if(cur.val == val){
                pre.next = pre.next.next;
                break;
            }
            pre = cur;
            cur = cur.next;

        }
        if(cur == null){
            pre.next = null;
        }

        return head;

    }


    public static void main(String args[]){

        ListNode listNode = ListUtil.getList(1,2,3,4,5);


        ListNode result =  deleteNode(listNode,5);

        ListUtil.print(result);
    }
}
