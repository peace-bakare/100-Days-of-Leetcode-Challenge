package Day26;

/*
 * Question 110 - Balanced Binary Tree
 * 
 * Given a binary tree, determine if it is height-balanced. 
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node 
 * never differs by more than one.
 * 
 * Example 1: 
 * Input: root = [3,9,20,null,null,15,7]
    Output: true

    Example 2:
    Input: root = [1,2,2,3,3,null,null,4,4]
    Output: false
    
    Example 3:
    Input: root = []
    Output: true

 */
import Day8.TreeNode;

public class Q3 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(right - left) > 1){
            return false;
        } 
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode x){
        if(x == null){
            return 0;
        }

        return 1 + Math.max(height(x.left), height(x.right));
    }
}
