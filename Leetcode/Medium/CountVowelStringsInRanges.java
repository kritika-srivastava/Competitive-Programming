package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\CountVowelStringsInRanges.java
 * @author Kritika Srivastava
 * @since January 02, 2025
 *
 * Link: https://leetcode.com/problems/count-vowel-strings-in-ranges
 */
public class CountVowelStringsInRanges {

    public int[] vowelStrings(String[] words, int[][] queries) {
        String vowelSet = "aeiou";

        int temp = 0, n = words.length;
        int vowelCount[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (vowelSet.indexOf(words[i].charAt(0)) != -1
                    && vowelSet.indexOf(words[i].charAt(words[i].length() - 1)) != -1) {
                temp++;
            }

            vowelCount[i] = temp;
        }
        int m = queries.length;
        int ans[] = new int[m];

        for (int i = 0; i < m; i++) {
            if (queries[i][0] == 0) {
                ans[i] = vowelCount[queries[i][1]];
            } else {
                ans[i] = vowelCount[queries[i][1]] - vowelCount[queries[i][0] - 1];
            }
        }

        return ans;
    }
}