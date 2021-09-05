/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/House_robber.java
 * 
 * @author Kritika Srivastava
 * @since September 05, 2021
 *
 *        Link - https://leetcode.com/problems/house-robber/
 */
public class House_robber {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return dp[0] = nums[0];
        }
        if (n == 2) {
            return dp[1] = Math.max(nums[1], nums[0]);
        }
        if (n == 3) {
            return dp[2] = Math.max(nums[0] + nums[2], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[0] + nums[2], nums[1]);
        for (int i = 3; i < n; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
            // System.out.println(dp[i]);

        }
        return Math.max(dp[n - 1], dp[n - 2]);
    }
}
