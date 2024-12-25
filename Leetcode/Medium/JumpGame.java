package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\JumpGame.java
 * @author Kritika Srivastava
 * @since December 25, 2024
 *
 * Link: https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {
    /*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i > maxJump) {
                return false;
            }
            maxJump = Math.max(maxJump, nums[i] + i);
            if (maxJump >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}

