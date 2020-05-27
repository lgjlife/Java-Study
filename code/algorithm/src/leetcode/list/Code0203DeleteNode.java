package leetcode.list;

public class Code0203DeleteNode {
    public static void main(String[] args) {
    
        DeleteNodeSolution solution = new DeleteNodeSolution();
  
        ListNode listNode = ListNodeUtil.createListNode(new int[]{4,5,1,9});
        ListNodeUtil.printListNode(listNode);
        solution.deleteNode(listNode);
        ListNodeUtil.printListNode(listNode);
    }
}
//TODO:DeleteNodeSolution 删除列表节点
class DeleteNodeSolution {
    public void deleteNode(ListNode node) {
        
        int length = 0;
        int mid = -1;
        int count = 0;
        ListNode temp = node;
        while(mid != 0){
            
            temp=temp.next;
            length++;
            mid--;
            if(temp == null){
                mid = length/2;
                mid = mid%2 == 0?mid-1:mid;
                temp = node;
                System.out.println(mid);
            }            
            if(mid != -1){
                count++;
                if(count == mid){
                    temp.next = temp.next.next;
                    break;
                }
            }
        }
        ListNodeUtil.printListNode(node);
    }
}
