package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\KthLexStringOfAllHappyStrings.java
 * @author Kritika Srivastava
 * @since February 19, 2025
 *
 * Link: https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n
 */
public class KthLexStringOfAllHappyStrings {

    static List<String> happyStrings;
    static char[] characters;

    public String getHappyString(int n, int k) {
        happyStrings = new ArrayList<>();
        characters = new char[] { 'a', 'b', 'c' };

        // Strings generated are already sorted
        for (char c : characters) {
            backtrack("" + c, n, k);
        }

        if (happyStrings.size() >= k) {
            return happyStrings.get(k - 1);
        }

        return "";
    }

    static void backtrack(String current, int length, int k) {
        if (current.length() == length) {
            happyStrings.add(current);
            return;
        }
        // Also return when Kth String is found
        if (happyStrings.size() == k) {
            return;
        }

        for (char c : characters) {
            if (current.charAt(current.length() - 1) != c) {
                backtrack(current + c, length, k);
            } else {
            }
        }

    }
}