package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\WordSubsets.java
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 * Link: https://leetcode.com/problems/word-subsets/
 */
public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();

        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        for (String word : words1) {
            int[] freq = countFrequency(word);
            if (isUniversal(freq, maxFreq)) {
                ans.add(word);
            }
        }

        return ans;
    }

    private int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    private boolean isUniversal(int[] freq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }

}
