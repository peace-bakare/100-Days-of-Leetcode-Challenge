package Day24;

/*
 * Question 392 - Is Subsequence
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a 
subsequence of "abcde" while "aec" is not). 

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */

public class Q2 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int m = t.length();
        int n = s.length();

        if(n < 1){
            return true;
        }

        while(i < m && j < n){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }
        return j == n;
    }
}
