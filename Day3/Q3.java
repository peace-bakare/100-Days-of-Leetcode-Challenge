package Day3;

/* 
704. Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity. */

public class Q3 {
    public int binarySearch(int [] nums, int target){
        int left = 0; int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public void Main(String[]args){
        int [] number = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(binarySearch(number, target));
    }
}
