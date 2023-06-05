package BosscoderAcademy.Searching;

import java.util.HashSet;

public class CheckDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if(hash.contains(2 * arr[i]) || (arr[i] % 2 == 0 && hash.contains(arr[i] / 2))){
                return true;
            }
            hash.add(arr[i]);
        }
        return false;
    }
}
