package Day20;

/*
 * Question 344 - Reverse a string
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class Q2 {
    public void reverseString(char[] s) {
        int j = 0;
        char [] t = new char [s.length];
        for(int i=s.length-1; i>=0; i--){
            t[j] = s[i];
            j++;
        }

        for(int i=0; i<t.length; i++){
            s[i] = t[i];
        }
    }
}
