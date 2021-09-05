/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/climbing_stairs.java
 * 
 * @author Kritika Srivastava
 * @since September 05, 2021
 *
 *        Link - https://leetcode.com/problems/climbing-stairs/
 */
public class climbing_stairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
}
