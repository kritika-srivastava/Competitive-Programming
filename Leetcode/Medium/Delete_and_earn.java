/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Delete_and_earn.java
 * 
 * @author Kritika Srivastava
 * @since September 05, 2021
 *
 *        Link - https://leetcode.com/problems/delete-and-earn/
 */

public class Delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        int n = 20001;
        int values[] = new int[n];
        int dp[] = new int[n];
        for (int i : nums) {
            values[i] += i;
        }
        dp[0] = values[0];
        dp[1] = values[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(values[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
