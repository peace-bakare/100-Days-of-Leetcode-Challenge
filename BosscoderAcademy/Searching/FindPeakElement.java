package BosscoderAcademy.Searching;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[mid+1]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
