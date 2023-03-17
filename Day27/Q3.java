package Day27;

import java.util.HashSet;

/*
 * Question 217 - Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class Q3 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            hash.add(nums[i]);
        }
        
        if(hash.size() != n){
            return true;
        }
        
        return false;
    }
}
