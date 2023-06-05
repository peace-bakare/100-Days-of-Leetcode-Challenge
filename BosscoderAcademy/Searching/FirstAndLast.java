package BosscoderAcademy.Searching;

public class FirstAndLast {

    public static void main (String [] args){
        int [] nums = {5,7,7,8,8,10};
        int target = 6;
        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {
        int a = findFirstPosition(nums, target);
        int b = findLastPosition(nums, target);

        return new int [] {a, b};
    }

    public static int findFirstPosition(int [] nums, int target){
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        int res = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    public static int findLastPosition(int [] nums, int target){
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        int res = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
