package Day22;

/*
 * Question 680 - Valid Palindrome II
 * 
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3:
Input: s = "abc"
Output: false
 */
public class Q1 {
    public boolean validPalindrome(String s) {  
        int m = 0;      
        int n = s.length() - 1;
        
        if(isPalindrome(s, m, n)){
            return true;
        }

        while(m < n){
            if(s.charAt(m) == s.charAt(n)){
                m++; n--;
                continue;
            }
            return (isPalindrome(s, m + 1, n) || isPalindrome(s, m, n - 1));
        }
        return true;
    }

    public boolean isPalindrome(String a, int i, int j){
        while(i < j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
