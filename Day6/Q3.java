package Day6;

/*
Question 344 - Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class Q3{
    public void reverseString(char[] s) {
        int len = s.length;
        char [] t = new char[len];
        int j = 0;
        for(int i=s.length-1; i>=0; i--){
            t[j] = s[i];
            j++;
        }

        for(int i=0; i<s.length; i++){
            s[i] = t[i];
        }
    }    
}