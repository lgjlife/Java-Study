package leetcode2021.list.easy;

import leetcode2021.list.base.ListNode;
import leetcode2021.list.base.ListUtil;

public class Code1290GetDecimalValue {

    int len  = 0;
    int count = 0;
    int result = 0;

    public   int getDecimalValue(ListNode head) {

        if(head == null){
            len = count;
            return 0;
        }
        count++;
        int temp  = getDecimalValue(head.next);

        count--;
        // 链表　１->0->1
        // 初始：len = 3,count =3  ;
        //count-- --> count = 2:  必须0 ; 3- 2 - 1 = 0
        //count-- --> count = 1:  必须1 ; 3- 1 - 1 = 1
        //count-- --> count = 0:  必须2 ; 3- 0 - 1 = 2
        int cur =  head.val << (len - count -1);

        result = temp |  cur;

        return result;

    }

    public static void main(String args[]){

        ListNode listNode = ListUtil.getList(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0);

        Code1290GetDecimalValue demo = new Code1290GetDecimalValue();
        int result =  demo.getDecimalValue(listNode);

        System.out.println("result = " + result);

    }
}
