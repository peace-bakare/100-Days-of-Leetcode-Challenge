package Day14;

/*
 * 
 * Question 14 - Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */
import java.util.Arrays;

public class Q2 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        int i = 0;

        //i < f.length() && i < l.length() --> works the same way as i < f.length() since f would be longer than l
        while(i < f.length()){
            if(f.charAt(i) == l.charAt(i)){
                str.append(f.charAt(i));
                i++;
            }else{
                break;
            }
        }
        return str.toString();
        //return f.substring(0, i);
    }
}
