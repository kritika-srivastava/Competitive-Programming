/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\NumberOfWaysToSplitArray.java
 * @author Kritika Srivastava
 * @since January 03, 2025
 *
 * Link: https://leetcode.com/problems/number-of-ways-to-split-array/
 */
public class NumberOfWaysToSplitArray {

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long cumulativeSum[] = new long[n];

        long sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            cumulativeSum[i] = sum;
        }
        for (int i = 0; i < n - 1; i++) {
            if (cumulativeSum[i] >= sum - cumulativeSum[i]) {
                ans++;
            } else {
            }
        }

        return ans;

    }

}
