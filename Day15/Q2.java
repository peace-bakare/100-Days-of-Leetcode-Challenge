package Day15;

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
 */
public class Q2 {
    public int lengthOfLastWord(String s) {
        int count = 0;        
        s = s.trim();
        var arrayWords = s.split(" ");
        String lastWord = arrayWords[arrayWords.length-1];
        count = lastWord.length();
        return count;
    }
}
