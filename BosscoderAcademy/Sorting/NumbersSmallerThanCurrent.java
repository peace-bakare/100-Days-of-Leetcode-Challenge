package BosscoderAcademy.Sorting;

import java.util.ArrayList;
import java.util.List;

public class NumbersSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            list.add(count);
        }

        int [] arr = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            arr[k] = list.get(k);
        }

        return arr;
    }
}
