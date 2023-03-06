package Day19;

/*
 * Question 125 - Valid Palindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric 
 * characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.


Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */
public class Q2 {
    public boolean isPalindrome(String s) {
        s.trim().toLowerCase();
        s = s.replaceAll("[^a-zA-Z]","");
        int i = 0; int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
