package Day24;

import java.util.Arrays;

/*
 * Question 169 - Majority Element
 * 
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority 
element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class Q3 {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;
        // int maj = n / 2;
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // if(map.containsKey(maj++))
        // return map.getValue()

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;
        int num = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count = 1;
            }

            if(count > maxCount){
                maxCount = count;
                num = nums[i - 1];
            }
        }
        return num;
    }
}
