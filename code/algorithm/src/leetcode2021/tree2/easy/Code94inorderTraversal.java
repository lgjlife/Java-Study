package leetcode2021.tree2.easy;

import leetcode2021.tree2.util.TreeNode;
import leetcode2021.tree2.util.TreeUtil;

import java.util.ArrayList;
import java.util.List;

public class Code94inorderTraversal {

    static List<Integer> list = new ArrayList();

    public static List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public static void main(String args[]){

        TreeNode root = TreeUtil.createTree();

        List result = inorderTraversal(root);

        System.out.println(result);
    }
}
