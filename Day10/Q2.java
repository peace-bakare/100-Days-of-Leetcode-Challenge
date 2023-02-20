package Day10;

/*
 * 
 * Question 144 - Binary Tree Preorder Traversal* 
 * 
 */
import java.util.ArrayList;
import java.util.List;

import Day8.TreeNode;

public class Q2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();

        if(root == null){
            return new ArrayList<>();
        }
        
        tree.add(root.val);
        tree.addAll(preorderTraversal(root.left));
        tree.addAll(preorderTraversal(root.right));

        return tree;
    }
}
