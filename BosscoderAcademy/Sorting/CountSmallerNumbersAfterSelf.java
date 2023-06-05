package BosscoderAcademy.Sorting;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int [] indices = new int[n];

        for(int i=0; i<n; i++){
            indices[i] = i;
        }

        mergeSort(indices, 0, n, res, nums);
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i : res){
            resultList.add(i);
        }

        return resultList;
    }

    public void mergeSort(int [] indices, int left, int right, int [] res, int [] nums){
        if(right - left <= 1){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(indices, left, mid, res, nums);
        mergeSort(indices, mid, right, res, nums);
        merge(indices, left, right, mid, res, nums);
    }

    public void merge(int [] indices, int left, int right, int mid, int [] res, int [] nums){
        int i = left;
        int j = mid;
        List<Integer> temp = new ArrayList<>();

        while(i < mid && j < right){
            if(nums[indices[i]] <= nums[indices[j]]){
                //j-mid numbers jumpt to the left side of indices[i]
                res[indices[i]] += (j - mid);
                temp.add(indices[i]);
                i++;
            }
            else{
                temp.add(indices[j]);
                j++;
            }
        }

        while(i < mid){
            res[indices[i]] += (j-mid);
            temp.add(indices[i]);
            i++;
        }

        while(j < right){
            temp.add(indices[j]);
            j++;
        }

        for(int k = left; k < right; k++){
            indices[k] = temp.get(k - left);
        }
    } 
}
