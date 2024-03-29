package Day26;

/*
 * Question 104 - Maximum Depth of Binary Tree
 * 
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the 
farthest leaf node. 

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2
 */
import Day8.TreeNode;

public class Q1 {
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
