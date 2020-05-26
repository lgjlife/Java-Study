package leetcode.list;

public class ListNodeUtil {

    public static void main(String[] args) {
        
        int[] arr1 = {4,1,8,4,5};
        ListNode listNode = createListNode(arr1);
        printListNode(listNode);

    }

    public static ListNode createListNode(int[] values){
        ListNode head = new ListNode(values[0]);
        ListNode tail = head;

        for (int i = 1; i < values.length; i++) {
            tail.setNext(new ListNode(values[i]));
            tail = tail.next;
        }

        return head;

    }

    public static void printListNode(ListNode listNode){
        while(listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    @Override
    public String  toString() {
        return "ListNode[" + "val=" + val + "]";
    }
}