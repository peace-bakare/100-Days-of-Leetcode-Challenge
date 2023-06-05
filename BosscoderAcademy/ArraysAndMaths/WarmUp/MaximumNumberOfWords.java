package BosscoderAcademy.ArraysAndMaths.WarmUp;

/*
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

Example:
Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.
 */
public class MaximumNumberOfWords {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;  
        int max = 0;   
        for(int i=0; i<n; i++){
            max = Math.max(max, countSpaces(sentences[i]));
        }   
        return max;
    }

    public int countSpaces(String word){
        int j = word.length();
        int count = 0;
        for(int i=0; i<j; i++){
            if(word.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }
}
