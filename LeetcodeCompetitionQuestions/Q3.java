/* 
Question 6327
Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.

Example 1:
Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. 
It can be proven that 15 is the smallest number we can have.

Example 2:
Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.
 * 
 */

 package LeetcodeCompetitionQuestions;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Collections;
 
 public class Q3 {
     public static int minNumber(int [] nums1, int [] nums2){
         List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         List<Integer> list3 = new ArrayList<>();
 
         //Put each item in nums1 into list1
         for(int i : nums1){
             list1.add(i);
         }
 
         //Put each item in nums2 into list2
         for(int i : nums2){
             list2.add(i);
         }
 
         //Put all item in nums1 and nums2 into list3
         for(int i : nums1){
             list3.add(i);
         }
 
         for(int i : nums2){
             list3.add(i);
         }
 
         //Sort the list3
         Collections.sort(list3);
 
         for(int i : list3){
             if(list1.contains(i) && list2.contains(i)){
                 return i;
             }
         }
 
         Collections.sort(list1);
         Collections.sort(list2);
 
         int a = list1.get(0);
         int b = list2.get(0);
         int z = 0;
         
         if(a < b){
             z = (a * 10) + b;
         }
         else{
             z = (b * 10) + a;
         }
         return z;
     }
 
     public static void Main (String[]args){
         int [] nums1 = {4, 1, 3};
         int [] nums2 = {5, 7};
 
         System.out.println(minNumber(nums1, nums2));
     }
 }
 