package Day5;

/*
1832. Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, 
or false otherwise. 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */

public class Q1{
    public boolean checkIfPangram(String sentence){
        HashSet<Character> set = new HashSet<Character>();

        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }

        if(set.size() < 26){
            return false;
        }
        return true;
    }

    public void Main(String[]args){
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println(checkIfPangram(sentence1));
        System.out.println(checkIfPangram(sentence2));
    }
}