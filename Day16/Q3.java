package Day16;

/*
 * Question 9 - Palindrome Number
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise. 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
Therefore it is not a palindrome.
 */
public class Q3 {
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        String newX = Integer.toString(x);
        int i = 0; int j = newX.length()-1;
        while(i < j){
            if(newX.charAt(i) != newX.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
