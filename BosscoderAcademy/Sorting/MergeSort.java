package BosscoderAcademy.Sorting;

public class MergeSort {
    public void mergeSort(int [] nums, int left, int right){
        // left = 0;
        // right = nums.length - 1;

        if(left < right){
            int mid = left + (right - left)/2;

            //Recursively sort the subarrays
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            //Merge the subarrays into one array
            merge(nums, left, mid, right);
        }
    }

    public void merge(int [] nums, int left, int mid, int right){
        int len1 = mid - left + 1;
        int len2 = right - mid;

        //Create two temporary arrays that would be merged together
        int [] leftArr = new int[len1];
        int [] rightArr = new int[len2];

        for(int i=0; i<len1; i++){
            leftArr[i] = nums[left + i];
        }
        for(int i=0; i<len2; i++){
            rightArr[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        //Loop that merges the two subarray into one array with length as of initial array
        while(i < len1 && j < len2){
            if(leftArr[i] <= rightArr[j]){
                nums[k] = leftArr[i];
                i++;
            }
            else{
                nums[k] = rightArr[j];
                j++;
            }

            k++;
        }

        //Copy remaining items in leftArray if any
        while(i < len1){
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        //Copy remaining items in rightArray if any
        while(j < len2){
            nums[k] = rightArr[i];
            j++;
            k++;
        }
    }
}
