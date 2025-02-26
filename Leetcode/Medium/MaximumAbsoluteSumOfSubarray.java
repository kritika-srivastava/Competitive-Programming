package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MaximumAbsoluteSumOfSubarray.java
 * @author Kritika Srivastava
 * @since February 26, 2025
 *
 * Link: https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/
 */
public class MaximumAbsoluteSumOfSubarray {
    public int maxAbsoluteSum(int[] nums) {

        int sum = 0, currSum = 0, minCurrSum = 0, minSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            } else {
            }
            sum = Math.max(sum, currSum);

            minCurrSum += nums[i];
            if (minCurrSum >= 0) {
                minCurrSum = 0;
            } else {
            }
            minSum = Math.min(minSum, minCurrSum);
        }

        return Math.max(sum, minSum * (-1));
    }
}
