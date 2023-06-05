package BosscoderAcademy.Searching;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return mid;
            }else if(nums[mid] > nums[mid+1] && mid % 2 == 0){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main (String[]args){
        int [] nums = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleNonDuplicate(nums));        
    }
}
