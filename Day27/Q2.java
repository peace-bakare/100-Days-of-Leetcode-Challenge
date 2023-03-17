package Day27;

import java.util.ArrayList;
import java.util.List;

/*
 * Question 1431 - Kids With the Greatest Number of Candies
 * 
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the 
 * number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you 
 * have.

    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the 
    extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.

    Example 1:
    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true] 
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
public class Q2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }

        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
