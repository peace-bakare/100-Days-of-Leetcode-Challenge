package BosscoderAcademy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder buildPrefix = new StringBuilder(strs[0]);
        
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            
            int j = 0;
            while (j < buildPrefix.length() && j < current.length() && buildPrefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            
            buildPrefix.setLength(j);
            
            if (buildPrefix.length() == 0) {
                return "";
            }
        }
        
        return buildPrefix.toString();
    }
}
