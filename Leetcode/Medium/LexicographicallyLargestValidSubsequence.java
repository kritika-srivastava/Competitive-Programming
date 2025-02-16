package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\LexicographicallyLargestValidSubsequence.java
 * @author Kritika Srivastava
 * @since February 16, 2025
 *
 * Link: https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence
 */
public class LexicographicallyLargestValidSubsequence {

    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        int[] result = new int[size];
        boolean[] used = new boolean[n + 1];

        backtrack(result, used, 0, n);
        return result;

    }

    static boolean backtrack(int[] result, boolean[] used, int index, int n) {
        if (index == result.length) {
            return true;
        }
        if (result[index] != 0) {
            return backtrack(result, used, index + 1, n);
        }
        for (int num = n; num >= 1; num--) {
            if (used[num])
                continue;
            if (num == 1) {
                result[index] = 1;
                used[1] = true;
                if (backtrack(result, used, index + 1, n))
                    return true;
                result[index] = 0;
                used[1] = false;
            } else {
                int nextIndex = index + num;
                if (nextIndex < result.length && result[nextIndex] == 0) {
                    result[index] = result[nextIndex] = num;
                    used[num] = true;
                    if (backtrack(result, used, index + 1, n))
                        return true;
                    result[index] = result[nextIndex] = 0;
                    used[num] = false;
                }
            }
        }
        return false;
    }
}