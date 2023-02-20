package Day5;

import java.util.Arrays;

/*
169. Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
 */
public class Q2{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        //Stack<Integer> stack = new Stack<Integer>();

        int count = 1;
        int maxCount = 1;
        int num = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count = 1;
            }
            //maxCount = Math.max(maxCount, count);
            if(count > maxCount){
                maxCount = count;
                num = nums[i - 1];
            }
        }
        //int me = stack.peek();
        return num;
    }

    public void Main(String[]args){
        int [] array1 = {3, 2, 3};
        int [] array2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(array1));
        System.out.println(majorityElement(array2));
    }
}