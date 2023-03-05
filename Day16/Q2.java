package Day16;

/*
Question 1 - Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they 
 * add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.HashMap;

public class Q2 {
    public int [] twoSum(int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement = 0;

        for(int i=0; i<nums.length; i++){
            complement = target - nums[i];
            if(!map.containsKey(complement)){
                map.put(nums[i], i);
            }else{
                return new int [] {map.get(complement), i};
            }
        }
        return new int [0];
    }
}
