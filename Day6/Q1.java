package Day6;

/*
Question 9 - Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class Q1{
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int len = number.length();

        int i = 0; int j = len - 1;
        while(i < j){
            if(number.charAt(i) != number.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}