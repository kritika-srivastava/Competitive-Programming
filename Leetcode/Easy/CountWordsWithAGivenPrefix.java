package Leetcode.Easy;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\CountWordsWithAGivenPrefix.java
 * 
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 *        Link:
 *        https://leetcode.com/problems/counting-words-with-a-given-prefix/
 */
public class CountWordsWithAGivenPrefix {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int ans = 0, n = words.length;
            for (int i = 0; i < n; i++) {
                if (words[i].startsWith(pref)) {
                    ans++;
                } else {
                }
            }

            return ans;
        }
    }
}
