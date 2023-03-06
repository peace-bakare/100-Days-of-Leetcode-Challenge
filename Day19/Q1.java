package Day19;

/*
 * Question 58 - Length of Last Word
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */

public class Q1 {
    public int lengthOfLastWord(String s) {
        s.trim();
        String [] arrayWords = s.split(" ");
        String lastWord = arrayWords[arrayWords.length-1];
        return lastWord.length();
    }
}
