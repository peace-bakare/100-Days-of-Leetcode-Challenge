package Day11;

/*
 * 
 * Question 94 - Binary Tree Inorder Traversal
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 
 */
import java.util.ArrayList;
import java.util.List;

import Day8.TreeNode;

public class Q2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();

        if(root == null){
            return new ArrayList<>();
        }

        tree.addAll(inorderTraversal(root.left));
        tree.add(root.val);
        tree.addAll(inorderTraversal(root.right));

        return tree;
    }
}
