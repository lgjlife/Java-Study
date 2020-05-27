package leetcode.list;

public class Code0202KthToLast {
    public static void main(String[] args) {
    
        KthToLastSolution solution = new KthToLastSolution();
        int k = 2;
        ListNode listNode = ListNodeUtil.createListNode(new int[]{1,2,3,4,5});
        int result = solution.kthToLast1(listNode, k);

        System.out.println("result = " + result);
    }
}
/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 */
class KthToLastSolution {
    public int kthToLast(ListNode head, int k) {
        int  length = 0;
        //任意赋值
        int diff = -1;
        ListNode temp = head;
        while(diff != 0){
            if(temp != null){
                temp = temp.next;
                length++;
                if(diff != - 1){
                    diff--;
                }
            }
            else{
                diff = length-k;
                temp = head;
            }
        }
        return temp.val;
    }

    public int kthToLast1(ListNode head, int k) {
        int step = 0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1 != null){
            temp1  = temp1.next;
            step++;
            if(step > k){
                temp2  = temp2.next;
            }
        }
        return temp2.val;
    }

}