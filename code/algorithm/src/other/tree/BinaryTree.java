package other.tree;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

    private Node root ;

    public static void main(String args[]){

        BinaryTree binaryTree = new BinaryTree();

        int[] datas = {50,25,12,35,75,65,85,30,40};
        for(int data:datas){
            binaryTree.insertData(data);
        }

        System.out.println("\r\n前序遍历－－递归方式");
        binaryTree.preOrderTraverse1(binaryTree.root);

        System.out.println("\r\n前序遍利－－非递归方式");
        binaryTree.preOrderTraverse2(binaryTree.root);

        System.out.println("\r\n中序遍利－－递归方式");
        binaryTree.inOrderTraverse1(binaryTree.root);

        System.out.println("\r\n中序遍利－－非递归方式");
        binaryTree.inOrderTraverse2(binaryTree.root);


        System.out.println("\r\n后序遍利－－递归方式");
        binaryTree.postOrderTraverse1(binaryTree.root);

        System.out.println("\r\n后序遍利－－非递归方式");
        binaryTree.postOrderTraverse2(binaryTree.root);


        System.out.println("\r\n层次遍利－－非递归方式");
        binaryTree.levelTraverse(binaryTree.root);



    }


    private class Node{

        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public void insertData(int data){

        if(root == null){
            root = new Node(data);
            return;
        }

        Node temp =  root;
        while(true){

            if(data < temp.data ){
                if(temp.left == null){
                    temp.left = new Node(data);
                    return;
                }
                else {
                    temp =temp.left;
                }
            }
            else if(data >= temp.data ){
                if(temp.right == null){
                    temp.right = new Node(data);
                    return;
                }
                else {
                    temp =temp.right;
                }
            }
        }

    }
    //前序遍利－－递归方式
    public void preOrderTraverse1(Node node){

        if (node == null) return;

        System.out.print(node.data + "  "  );
        preOrderTraverse1(node.left);
        preOrderTraverse1(node.right);
    }
    //前序遍利－－非递归方式
    public void preOrderTraverse2(Node node){

        if (node == null) return;

        Stack<Node> stack = new Stack<>();
        Node temp = node;

        while(temp != null || !stack.isEmpty()){

            if (temp != null){
                System.out.print(temp.data + "  ");
                stack.push(temp);
                temp = temp.left;
            }
            else {
                //
                Node node1  =  stack.pop();
                temp = node1.right;
            }
        }
    }

    //中序遍利－－递归方式
    public void inOrderTraverse1(Node node){

        if (node == null) return;
        inOrderTraverse1(node.left);
        System.out.print(node.data + "  "  );
        inOrderTraverse1(node.right);
    }
    //中序遍利－－非递归方式
    public void inOrderTraverse2(Node node){

        Stack<Node> stack = new Stack<>();
        Node temp = node;

        while(temp != null || !stack.isEmpty()){

            if (temp != null){

                stack.push(temp);
                temp = temp.left;
            }
            else {
                //
                Node node1  =  stack.pop();
                System.out.print(node1.data + "  ");
                temp = node1.right;
            }
        }
    }


    public void postOrderTraverse1(Node node){

        if (node == null) return;


        postOrderTraverse1(node.left);
        postOrderTraverse1(node.right);
        System.out.print(node.data + "  "  );
    }
    public void postOrderTraverse2(Node node){

        if (node == null) return;


        Stack<Node> stack = new Stack<>();
        Node temp = node;

        while(temp != null || !stack.isEmpty()){

            if (temp != null){

                stack.push(temp);
                temp = temp.left;
            }
            else {
                //
                Node node1  =  stack.pop();
                temp = node1.right;
               // System.out.print(temp.data + "  ");
            }
        }
    }

    public void  levelTraverse(Node node){

        if (node == null) return;
        LinkedList<Node> nodes = new LinkedList<>();

        nodes.add(node);

        while(!nodes.isEmpty()){

            Node temp = nodes.poll();
            System.out.print(temp.data + "  ");

            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right != null){
                nodes.add(temp.right);
            }
        }
    }
}
