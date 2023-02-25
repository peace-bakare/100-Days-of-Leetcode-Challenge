package Day12;

/*
 * 
 * Question 104 - Maximum Depth of Binary Tree
 * 
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node 
down to the farthest leaf node.
 */
import Day8.TreeNode;

public class Q3 {
    public int maxDepth(TreeNode root) {
        int height = 0;

        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        height = Math.max(left, right) + 1;

        return height;
    }
}
