package BosscoderAcademy;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;

        while (left < nums1.length && right < nums2.length){
            if(nums1[left] < nums2[right]){
                left++;
            }
            else if(nums1[left] > nums2[right]){
                right++;
            }
            else{
                return nums1[left];
            }
        }
        return -1;
    }

    public static void main (String[]args){
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4};

        System.out.println(getCommon(nums1, nums2));
    }
}
