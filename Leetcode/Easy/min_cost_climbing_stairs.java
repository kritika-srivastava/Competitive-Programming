/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/min_cost_climbing_stairs.java
 * 
 * @author Kritika Srivastava
 * @since September 05, 2021
 *
 *        Link - https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                dp[i] = cost[i];
            } else {
                dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            }
        }
        return Math.min(dp[n - 1], dp[n - 2]);

    }
}
