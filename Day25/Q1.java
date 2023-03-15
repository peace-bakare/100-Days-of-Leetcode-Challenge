package Day25;

/*
 * Question 283 - Move Zeroes
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the 
 * non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */

public class Q1 {
    public void moveZeroes(int[] nums) {
        int noOfZeroes = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                noOfZeroes++;
            }
        }

        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        int n = nums.length - noOfZeroes;
        for(int i=nums.length-1; i>=n; i--){
            nums[i] = 0;
        }
    }
}
