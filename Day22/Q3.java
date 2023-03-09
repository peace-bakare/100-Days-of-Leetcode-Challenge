package Day22;

/*
 * 
 * Question 771 - Jewels and Stones
 * 
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the 
 * stones you have. Each character in stones is a type of stone you have. You want to know how many of the 
 * stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Q3 {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<stones.length(); i++){
            char a = stones.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(int i=0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }

        Iterator<Character> it = set.iterator();
        while(it.hasNext()){
            if(map.containsKey(it.next())){
                int j = map.get(it.next());
                count += j;
            }
        }

        return count;
    }

    public void Main(String[]args){
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }
}
