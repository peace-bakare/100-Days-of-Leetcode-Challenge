package BosscoderAcademy.Sorting;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        for(int j = 0; j < k; j++){
            int index = j;
            for(int i=j+1; i<n; i++){
                if(nums[i] > nums[index]){
                    index = i;
                }
            }
            swap(nums, j, index);
        }
        return nums[k-1];
    }

    public static void swap (int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[]args){
        int [] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}
