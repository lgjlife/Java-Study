package interview.list;

/**
 *功能描述  打印两个有序链表的公共部分(相等的值)
 * @author lgj
 * @Description 　　　
 * @date 　
*/
public class Code1 {


    public void printCommon(List.Node head1 , List.Node head2){

        List.Node h1 = head1;
        List.Node h2 = head2;

        while ((h1 != null)&&(h2 != null)){

            if(h1.val < h2.val){
                h1 = h1.next;
            }
            else if(h1.val > h2.val){
                h2 = h2.next;
            }
            else if(h1.val == h2.val){
                System.out.print(h1.val +  " ");
                h1 = h1.next;
                h2 = h2.next;
            }
        }
    }

    public static void main(String args[]){

        List list1 = new List(1,4,6,8,9,15,20,24);
        List list2 = new List(2,3,6,8,9,14,20,24,37,45);

        Code1 demo = new Code1();

        demo.printCommon(list1.getHead(),list2.getHead());

    }

}
