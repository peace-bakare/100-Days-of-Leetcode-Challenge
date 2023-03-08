package Day21;

import java.util.HashMap;

/*
 * Question 2351 - First Letter to Appear Twice
 * 
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
Note:
A letter a appears twice before another letter b if the second occurrence of a is before the second 
occurrence of b. s will contain at least one letter that appears twice.

Example 1:
Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
Example 2:
Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
 */
public class Q2 {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len = s.length();

        char a = s.charAt(0);
        for(int i=0; i<len; i++){
            a = s.charAt(i);
            int c = map.getOrDefault(a, 0) + 1;
            map.put(a, c);
            if(c == 2){
                break;
            }
        }

        return a;
    }
}
