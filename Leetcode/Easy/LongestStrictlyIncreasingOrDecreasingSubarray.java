package Leetcode.Easy;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\LongestStrictlyIncreasingOrDecreasingSubarray.java
 * @author Kritika Srivastava
 * @since February 03, 2025
 *
 * Link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
 */
public class LongestStrictlyIncreasingOrDecreasingSubarray {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            int prevInc = i, prevDec = i;
            int tempInc = 1, tempDec = 1;
            // Strictly Increasing
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[prevInc]) {
                    prevInc = j;
                    tempInc++;
                } else {
                    break;
                }
            }

            // Strictly Decreasing
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[prevDec]) {
                    prevDec = j;
                    tempDec++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, Math.max(tempInc, tempDec));
        }

        return ans;
    }
}
