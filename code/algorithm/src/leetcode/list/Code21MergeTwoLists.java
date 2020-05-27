package leetcode.list;

import javax.print.DocFlavor.READER;

public class Code21MergeTwoLists {
    public static void main(String[] args) {
    
        MergeTwoListsSolution solution = new MergeTwoListsSolution();

        ListNode listNode1 = ListNodeUtil.createListNode(new int[]{1,2,5});
        ListNode listNode2 = ListNodeUtil.createListNode(new int[]{1,2,4,5});

        ListNodeUtil.printListNode(listNode1);
        ListNodeUtil.printListNode(listNode2);


        ListNode result = solution.mergeTwoLists1(listNode1, listNode2);

        ListNodeUtil.printListNode(result);
    }
    
}

class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode temp = new ListNode(0);
        ListNode tail = temp ;

        while( l1!= null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else if(l1.val >= l2.val){
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }
        tail.next = l1==null?l2:l1;

        return temp.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else {
            l2.next =  mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}