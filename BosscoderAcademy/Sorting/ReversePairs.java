package BosscoderAcademy.Sorting;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        int [] temp = new int[nums.length];        
        return mergeSort(nums, temp, 0, nums.length-1);
    }

    public int mergeSort(int [] nums, int [] temp, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = low + (high - low) / 2;
        int reversePairCount = 0;
        reversePairCount += mergeSort(nums, temp, low, mid);
        reversePairCount += mergeSort(nums, temp, mid+1, high);
        reversePairCount += merge(nums, temp, low, mid, high);
        return reversePairCount;
    }

    public int merge(int [] nums, int [] temp, int low, int mid, int high){
        int reversePairCount = 0;
        int i = low;
        int j = mid + 1;
        int k = low;
        
        while (i <= mid && j <= high) {
            if ((long) nums[i] > 2 * (long) nums[j]) {
                reversePairCount += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }
        
        i = low;
        j = mid + 1;
        k = low;
        
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        
        for (int idx = low; idx <= high; idx++) {
            nums[idx] = temp[idx];
        }
        
        return reversePairCount;
    }
}
