package BosscoderAcademy;

import java.util.Arrays;
import java.util.Comparator;

public class SortSentence {
    // Split the shuffled sentence into words
    public String sortSentence(String s) {
        // Split the shuffled sentence into words
        String[] words = s.split(" ");

        // Sort the words based on the numeric suffix
        Arrays.sort(words, Comparator.comparingInt(word -> Integer.parseInt(word.substring(word.length() - 1))));

        // Remove the numeric suffix from each word
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, words[i].length() - 1);
        }

        // Reconstruct the original sentence
        String originalSentence = String.join(" ", words);

        return originalSentence;
    }
}
