package BosscoderAcademy;

import java.util.Arrays;
import java.util.HashMap;

public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        
        // Create a new array to store the sorted names
        String[] sortedNames = new String[names.length];
        
        // Populate the sortedNames array based on the sorted heights and the heightMap
        for (int i = heights.length - 1; i >= 0; i--) {
            sortedNames[heights.length - 1 - i] = map.get(heights[i]);
        }
        
        return sortedNames;        
    }
}
