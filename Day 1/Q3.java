/*Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] 
(i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1. */

public class Q3{
    public int maximumDifference(int [] nums){
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            } else if(nums[i] - min > maxDiff){
                maxDiff = nums[i] - min;
            }
        }
        return maxDiff;
    }

    public void Main(String[]args){
        int [] numbers1 = {7, 1, 5, 4};
        int [] numbers2 = {9, 4, 3, 2};
        int [] numbers3 = {1, 5, 2, 10};

        System.out.println(maximumDifference(numbers1));
        System.out.println(maximumDifference(numbers2));
        System.out.println(maximumDifference(numbers3));
    }
}