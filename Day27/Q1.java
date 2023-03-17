package Day27;

/*
 * Question 1200 - Minimum Absolute Difference
 * 
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference 
 * of any two elements.

    Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

    a, b are from arr
    a < b
    b - a equals to the minimum absolute difference of any two elements in arr

    Example 1:
    Input: arr = [4,2,1,3]
    Output: [[1,2],[2,3],[3,4]]
    Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

    Example 2:
    Input: arr = [1,3,6,10,15]
    Output: [[1,3]]

    Example 3:
    Input: arr = [3,8,-10,23,19,-4,-14,27]
    Output: [[-14,-10],[19,23],[23,27]]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int max = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            max = Math.min((arr[i] - arr[i-1]), max);
        }

        int j = 0;
        int k = 1;        
        while(k != arr.length){            
            if((arr[k] - arr[j]) == max){
                List<Integer> nums = Arrays.asList(arr[j], arr[k]);
                list.add(nums);
            }
            j++; k++;
        }

        return list;        
    }
}
