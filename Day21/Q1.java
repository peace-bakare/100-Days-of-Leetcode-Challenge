package Day21;

import java.util.HashMap;
/*
 * Question 387 - First Unique Character in a String
 * 
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, 
 * return -1. 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */

public class Q1 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len = s.length();

        for(int i=0; i<len; i++){
            char a = s.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(int i=0; i<len; i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
