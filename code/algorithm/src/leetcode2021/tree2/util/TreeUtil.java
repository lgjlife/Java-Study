package leetcode2021.tree2.util;

public class TreeUtil {



    public static  TreeNode createTree(){
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(25, new TreeNode(15), new TreeNode(30));
        root.right = new TreeNode(75, new TreeNode(65), new TreeNode(85));

        return root;
    }
}
