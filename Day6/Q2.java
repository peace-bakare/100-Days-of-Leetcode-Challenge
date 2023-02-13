package Day6;

/*

Question 485 - Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 */
public class Q2{
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}