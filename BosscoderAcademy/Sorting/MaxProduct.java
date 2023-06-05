package BosscoderAcademy.Sorting;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int product = 1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                product = ((nums[i] - 1) * (nums[j] - 1));   
                max = Math.max(max, product);             
            }
        }

        return max;
    }

    public static void main (String[]args){
        int [] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
}
