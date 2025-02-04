package Leetcode.Easy;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\MaximumAscendingSubarraySum.java
 * @author Kritika Srivastava
 * @since February 04, 2025
 *
 * Link: https://leetcode.com/problems/maximum-ascending-subarray-sum
 */
public class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        int ans = 0, temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                ans = Math.max(ans, temp);
                temp = nums[i];
            }
        }

        ans = Math.max(ans, temp);

        return ans;

    }
}