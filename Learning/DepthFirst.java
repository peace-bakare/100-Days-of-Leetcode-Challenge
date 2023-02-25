import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirst{
    public List<Integer> depthFirstIterative(TreeNode node){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<>();

        if(node == null){
            return new ArrayList<>();
        }

        TreeNode currentNode;        
        stack.push(node);
        while(!stack.empty()){
            currentNode = stack.pop();
            list.add(currentNode.val);
            if(currentNode._right != null){
                stack.push(node._right);
            }

            if(node._left != null){
                stack.push(node._left);
            }
            // if(!stack.empty()){
            //     currentNode = stack.pop();
            // }
        }

        return list;
    }


    public List<Integer> depthFirstRecursion(TreeNode node){
        List<Integer> list = new ArrayList<>();
        if(node == null){
            return new ArrayList<>();
        }

        var leftVals = depthFirstRecursion(node._left);
        var rightVals = depthFirstRecursion(node._right);

        list.addAll(leftVals);
        list.addAll(rightVals);

        return list;
    }


    public void Main(String[]args){

    }
}



/*
 *             A
 *          /     \
 *        B         C
 *      /   \         \
 *    D       E         F
 * 
 * 
 * Algorithm
 * 1. Store the root node on the stack
 * 2. Check if the stack is empty
 * 3. If stack is not empty, move the item in the stack into a variable, current, 
 * then add it to the list of visited nodes
 * 4. Check if the node has left and right children
 * 5. If it has, add the children to the stack, right one first;
 * 6. Ask if the stack is empty again, if not, pop the top item, put it in the current variable,
 * then add it to the list of items visited;
 * 7. Check again if the current has children
 * 8. If it has, push the right one and then the left into the stack
 * 9. If the stack is not empty, pop the item on top, put it in the current variable,
 * then add it to the list of items visited;
 * 10. If the current node does not have children, pop the next item in the stack until the next node
 * has children then push the children in the stack and add to the list. 
 */