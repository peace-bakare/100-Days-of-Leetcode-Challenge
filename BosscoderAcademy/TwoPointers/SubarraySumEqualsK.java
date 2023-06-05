package BosscoderAcademy.TwoPointers;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        int count = 0;
        int sum = 0;

        if(nums.length <= 1 && k < nums[i]){
            return 0;
        }

        while(j < nums.length){
            sum += nums[j];
            
            while(i <= j && sum > k){
                sum -= nums[i];
                i++;
            }

            if(sum == k){
                count++;
            }

            j++;
        }

        return count;
    }

    public static void main (String[]args){
        int [] nums = {-1, -1, 1};
        int k = 0;
        
        System.out.println(subarraySum(nums, k));
    }
}
