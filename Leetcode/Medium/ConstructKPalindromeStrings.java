package Leetcode.Medium;

import java.util.Arrays;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ConstructKPalindromeStrings.java
 * @author Kritika Srivastava
 * @since January 12, 2025
 *
 * Link: https://leetcode.com/problems/construct-k-palindrome-strings
 */
public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }

        int oddChar = 0, curr = 1;
        char[] cArray = s.toCharArray();

        Arrays.sort(cArray);

        for (int i = 1; i < s.length(); i++) {
            if (cArray[i] != cArray[i - 1]) {
                if (curr % 2 == 0) {
                    curr = 1;
                } else {
                    oddChar++;
                    curr = 1;
                }
            } else {
                curr++;
            }
        }
        if (curr % 2 != 0) {
            oddChar++;
        }

        if (oddChar > k) {
            return false;
        }

        return true;
    }

}