package Day2;

/*Given an integer array nums of length n, you want to create an array ans of length 2n where 
ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans. */

public class Q2 {
    public int [] getConcatenation(int[]nums){
        int len = 2 * nums.length;
        int [] answer = new int[len];
        for(int i=0; i<nums.length; i++){
            answer[i] = nums[i];
        }

        int a = 0;
        for(int i=nums.length; i<len; i++){
            answer[i] = nums[a];
            a++;
        }

        return answer;
    }

    public void Main(String[]args){
        int [] num1 = {1, 2, 1};
        int [] num2 = {1, 3, 2, 1};

        System.out.println(getConcatenation(num1));
        System.out.println(getConcatenation(num2));
    }
}
