package Day11;

import Day8.TreeNode;

/*
 * 
 * Question 226 - Invert Binary Tree
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class Q1 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}
