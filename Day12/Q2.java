package Day12;

/*
 * 
 * Question 111 - Minimum Depth of Binary Tree
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the 
nearest leaf node.

Note: A leaf is a node with no children.
 */

import Day8.TreeNode;

public class Q2 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return 1 + minDepth(root.right);
        }
        
        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;        
    }
}
