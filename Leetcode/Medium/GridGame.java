package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\GridGame.java
 * 
 * @author Kritika Srivastava
 * @since January 21, 2025
 *
 *        Link: https://leetcode.com/problems/grid-game/
 */
/*
 * @lc app=leetcode id=2017 lang=java
 *
 * [2017] Grid Game
 */

// @lc code=start
class GridGame {

    public long gridGame(int[][] grid) {
        long upperRowSum = 0;
        for (int element : grid[0]) {
            upperRowSum += element;
        }
        long lowerRowSum = 0;
        long ans = Long.MAX_VALUE;
        for (int index = 0; index < grid[0].length; ++index) {
            upperRowSum -= grid[0][index];
            ans = Math.min(ans, Math.max(upperRowSum, lowerRowSum));
            lowerRowSum += grid[1][index];
        }
        return ans;
    }
}
// @lc code=end
