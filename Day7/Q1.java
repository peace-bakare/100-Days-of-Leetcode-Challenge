package Day7;


/*
Question 1470 - Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
public class Q1{
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int [] newNums = new int [n*2];

        for(int k=0; k<newNums.length; k+=2){
            newNums[k] = nums[i];
            newNums[k+1] = nums[j];
            i++; j++;
        }
        return newNums;
    }
}