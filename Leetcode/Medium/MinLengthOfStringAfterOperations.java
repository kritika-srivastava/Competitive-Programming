package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MinLengthOfStringAfterOperations.java
 * 
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 *        Link -
 *        https://leetcode.com/problems/minimum-length-of-string-after-operations
 */
public class MinLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        int[] letterCounts = new int[26];
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            letterCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (letterCounts[i] > 2 && letterCounts[i] % 2 == 0) {
                result += 2;
            } else if (letterCounts[i] > 2 && letterCounts[i] % 2 != 0) {
                result += 1;
            } else {
                result += letterCounts[i];
            }
        }

        return result;

    }
}
