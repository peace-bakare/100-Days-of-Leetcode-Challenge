package Day9;

/*
 * Question 258 - Add Digits
 * 
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
 * Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

 * 
 */
public class Q1 {
    public int addDigits(int num) {
        int ans = 0;
        ans = num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
        return ans;
    }
}
