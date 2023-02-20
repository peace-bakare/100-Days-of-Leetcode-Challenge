package Day10;

/*
 * 
 * Question 145 - Binary Tree Postorder Traversal
 */
import java.util.ArrayList;
import java.util.List;

import Day8.TreeNode;

public class Q3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<Integer>();

        if(root == null){
            return new ArrayList<>();
        }

        tree.addAll(postorderTraversal(root.left));
        tree.addAll(postorderTraversal(root.right));
        tree.add(root.val);

        return tree;
    }
}
