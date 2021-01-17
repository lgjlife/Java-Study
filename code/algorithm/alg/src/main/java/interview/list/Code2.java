package interview.list;

/**
 *功能描述  删除倒数第k个节点
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code2 {

    public List.Node removLastKNode(List.Node head ,int k){
        if((head == null) || (k <= 0)){
            return  head;
        }
        List.Node node1 = head;
        List.Node node2 = head;


        while (node1 != null){
            node1 = node1.next;
            if((k--) < 0){
                node2 = node2.next;
            }
        }

        if(k > 0){
            System.out.println("不删除任何数据");
            return head;
        }
        else if(k == 0){
            System.out.println(head.val);
            head = head.next;
            return head;
        }
        else {
            System.out.println(node2.next.val);
            node2.next = node2.next.next;
            return head;
        }
    }


    public static void main(String args[]){
        Code2 code = new Code2();

//        List list1 = new List(1,4,6,8,9,15,20,24);
//        list1.printList();
//
//        Code2 code = new Code2();
//        int k = 20;
//        System.out.println("移除倒数第" + k + "个节点");
//        List.Node result = code.removLastKNode(list1.getHead(),k);
//        list1.printNote(result);

        for(int i = 0; i< 10; i++){
            List list = new List(1,4,6,8,9,15,20,24);
            System.out.print("移除倒数第" + i + "个节点:");
            List.Node result1 = code.removLastKNode(list.getHead(),i);
            list.printNote(result1);
        }
    }
}
