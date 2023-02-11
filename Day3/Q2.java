package Day3;

import java.util.Arrays;

/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the 
richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the 
customer that has the maximum wealth. 

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6. */

public class Q2 {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int [] newArray = new int [m];
        int res = 0;
        for(int i=0; i<m; i++){
            int n = accounts[i].length;
            for(int j=0; j<n; j++){
                res += accounts[i][j];
            }
            newArray[i] = res;
            res = 0;
        }

        Arrays.sort(newArray);
        return newArray[m-1];
    }

    public void Main(String[]args){
        int [][] nums1 = {{1,2,3}, {3,2,1}};
        int [][] nums2 = {{1,5}, {7,3},{3,5}};
        int [][] nums3 = {{2,8,7}, {7,1,3}, {1,9,5}};

        System.out.println(maximumWealth(nums1));
        System.out.println(maximumWealth(nums2));
        System.out.println(maximumWealth(nums3));
    }
}
