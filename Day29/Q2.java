package Day29;

/*
 * Question 136 - Single Number
 * 
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Example 1:
    Input: nums = [2,2,1]
    Output: 1

    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4
 */
import java.util.HashSet;
import java.util.Iterator;

public class Q2 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }else{
                hashSet.add(nums[i]);
            }
        }

        Iterator<Integer> iterate = hashSet.iterator();
        return iterate.next();

    }
}
