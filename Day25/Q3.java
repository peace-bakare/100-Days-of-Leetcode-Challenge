package Day25;

/*
 * Question 101 - Symmetric Tree
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 
 * Example 1:
 * Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 */
import Day8.TreeNode;

public class Q3 {
    public boolean isSymmetric(TreeNode root) {             
        if(root == null){
            return true;
        }else{
            return isImage(root.left, root.right);
        }
    }

    public boolean isImage(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        }
        else if(a == null || b == null){
            return false;
        }
        else if(a.val != b.val){
            return false;
        }
        else{
            return isImage(a.left, b.right) && isImage(a.right, b.left);
        }
    }
}
