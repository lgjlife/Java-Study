package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

/*
*  实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。

 

示例：

输入：单向链表a->b->c->d->e->f中的节点c
结果：不返回任何数据，但该链表变为a->b->d->e->f

注意:这里不是删除中间的节点，而是删除头尾之间的某个节点
* */
public class Code0203DeleteNode {

    public static void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String args[]){


        //1,2,3,4 --> 1,3,4
        //1,2,3,4,5 --> 1,2,4,5
        ListNode list = ListUtil.getList(4,5,1,9);
        ListNode list1 = ListUtil.getList(1,2,3,4,5);

        deleteNode(list);

        ListUtil.print(list);


        deleteNode(list1);
        ListUtil.print(list1);


    }

}
