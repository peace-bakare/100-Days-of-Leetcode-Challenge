package Day20;

import java.util.Arrays;

/*
 * Question 242 - Valid Anagram
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once. 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

public class Q1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        int i = 0;
        while(i < sArr.length){
            if(sArr[i] != tArr[i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
