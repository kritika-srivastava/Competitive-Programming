package Leetcode.Medium;

import java.util.HashSet;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\LongestFibonacciSubsequece.java
 * 
 * @author Kritika Srivastava
 * @since February 27, 2025
 *
 *        Link:
 *        https://leetcode.com/problems/length-of-longest-fibonacci-subsequence
 */
public class LongestFibonacciSubsequece {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, ans = 0, num1 = 0, num2 = 0, num3 = 0, curr = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                num1 = arr[i];
                num2 = arr[j];
                curr = 0;

                while (set.contains(num1 + num2)) {
                    curr++;
                    num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;
                }
                if (curr != 0) {
                    ans = Math.max(ans, curr + 2);
                }

            }

        }

        return ans;

    }
}
