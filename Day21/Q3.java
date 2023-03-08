package Day21;

import java.util.HashMap;

/*
 * Question 1207 - Unique Number of Occurrences
 * 
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is 
 * unique or false otherwise.

Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:
Input: arr = [1,2]
Output: false

Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */
public class Q3 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int len = arr.length;
        int a = arr[0];
        for(int i=0; i<len; i++){
            a = arr[i];
            int b = map.getOrDefault(a, 0) + 1;
            map.put(a, b);
        }

        int j = 1;
        for(int i=0; i<map.size()-1; i++){
            if(map.get(i) == map.get(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
