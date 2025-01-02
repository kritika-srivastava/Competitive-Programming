package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\JumpGame2.java
 * @author Kritika Srivastava
 * @since January 02, 2025
 *
 * Link: https://leetcode.com/problems/jump-game-ii
 */
import java.util.Arrays;

public class JumpGame2 {

    public int jump(int[] nums) {
        int vis[] = new int[nums.length];
        Arrays.fill(vis, -1);
        return backtrack(nums, 0, vis);
    }

    static int backtrack(int[] nums, int currPos, int[] vis) {
        if (currPos == nums.length - 1) {
            return 0;
        }

        int minJump = Integer.MAX_VALUE - 1;
        int maxJumps = nums[currPos], i = 1;

        if (maxJumps == 0) {
            return -1;
        }
        while (currPos + i < nums.length && i <= maxJumps) {
            // System.out.println(currPos);
            int jump;
            if (vis[currPos + i] != -1) {
                jump = 1 + vis[currPos + i];
            } else {

                jump = 1 + backtrack(nums, currPos + i, vis);
                vis[currPos + i] = jump - 1;
            }

            if (jump == 0) {
                // return -1;
            } else {
                minJump = Math.min(minJump, jump);
            }
            i++;
        }
        return minJump;

    }
}
