package Day3;

/*Given an array nums. We define a running sum of an array as 
runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums. 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: 
[1, 1+2, 1+2+3, 1+2+3+4].*/

public class Q1 {
    public int [] runningSum(int [] nums){
        int res = 0;
        int [] newArray = new int [nums.length];
        for(int i=0; i<nums.length; i++){
            res += nums[i];
            newArray[i] = res;
        }
        return newArray;
    }

    public void Main (String[]args){
        int [] nums1 = {1, 2, 3, 4};
        int [] nums2 = {1, 1, 1, 1, 1};
        int [] nums3 = {3, 1, 2, 10, 1};

        System.out.println(runningSum(nums1));
        System.out.println(runningSum(nums2));
        System.out.println(runningSum(nums3));
    }
}
