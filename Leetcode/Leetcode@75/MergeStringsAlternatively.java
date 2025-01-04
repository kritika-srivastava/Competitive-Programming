package Leetcode.Leetcode @75;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Leetcode@75\MergeStringsAlternatively.java
 * @author Kritika Srivastava
 * @since January 03, 2025
 *
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int i, j;
        String ans = "";
        for (i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++) {
            ans = ans + word1.charAt(i) + word2.charAt(j);
        }

        if (i != word1.length()) {
            ans = ans + word1.substring(i);
        }
        if (j != word2.length()) {
            ans = ans + word2.substring(j);
        }

        return ans;
    }

}
