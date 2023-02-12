package Day5;

/*
2185. Counting Words With a Given Prefix
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

 */
public class Q3{
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i< words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }

        return count;
    }

    public void Main(String[]args){
        String [] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        System.out.println(prefixCount(words, pref));
    }
}