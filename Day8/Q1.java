package Day8;

/*
Question 2236 - RootEquals Sum of Children

 * You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, 
 * and its right child.

Return true if the value of the root is equal to the sum of the values of its two children, 
or false otherwise.
 */
public class Q1{
    public boolean checkTree(TreeNode root) {
        int rootVal = root.val;
        int leftChild = root.left.val;
        int rightChild = root.right.val;

        int sum = leftChild + rightChild;
        if(rootVal == sum){
            return true;
        }else{
            return false;
        }
    }
}