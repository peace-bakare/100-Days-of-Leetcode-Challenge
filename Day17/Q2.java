package Day17;

import java.util.Stack;

/*
 * Question 20 - Valid Parentheses
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input 
 * string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. 

Example 1:

Input: s = "()"
Output: true
 */
public class Q2 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (Character a : s.toCharArray()) {
            if(a == '('){
                stack.push(')');   
                continue;             
            }
            if(a == '{'){
                stack.push('}');
                continue;
            }
            if(a == '['){
                stack.push(']');
                continue;
            }
            if(stack.size() == 0 || a != stack.pop()){
                return false;
            }            
        }
        return stack.size() == 0;
    }
}
