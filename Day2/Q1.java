package Day2;
import java.util.HashMap;

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they 
add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

public class Q1{
    public int[]twoSum (int [] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int [] {map.get(complement), i};
            }
            map.put(nums[i], i);            
        }
        return new int [0];
    }

    public void Main(String[]args){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(twoSum(numbers, target));
    }
}