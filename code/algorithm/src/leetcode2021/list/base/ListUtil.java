package leetcode2021.list.base;

public class ListUtil {

    public static ListNode getList(int... datas){

        if((datas == null) && datas.length == 0) return new ListNode();

        ListNode head = new ListNode(datas[0]);
        ListNode cur = head;

        for(int i =1; i< datas.length; i++){
            ListNode node = new ListNode(datas[i]);
            cur.next = node;
            cur = cur.next;
        }

        return head;
    }

    public static ListNode insertNode(ListNode src ,ListNode node,int index){

        if(index == 0){

            node.next = src;
            return node;
        }

        ListNode pre = src;
        ListNode cur = src;
        while (index>0){
            index--;

            pre = cur;
            cur = cur.next;
        }

        pre.next = node;
        node.next = cur;

        return src;
    }

    public static ListNode insertNodeLast(ListNode src ,ListNode node){

        ListNode cur = src;

        while (cur.next != null){

            cur = cur.next;
        }

        cur.next = node;

        return src;

    }





    public static void print(ListNode node){

        ListNode cur = node;

        while (cur != null){

            System.out.print(cur.val+ "-->");
            cur = cur.next;
        }

        System.out.println("null");

    }

    public static void main(String args[]){

        ListNode list = getList(1,2,3,4);
        print(list);
    }
}
