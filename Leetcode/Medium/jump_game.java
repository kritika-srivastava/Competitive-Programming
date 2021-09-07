/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/jump_game.java
 * 
 * @author Kritika Srivastava
 * @since September 06, 2021
 *
 *        Link - https://leetcode.com/problems/jump-game/
 */
public class jump_game {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            } else {
                max = Math.max(max, i + nums[i]);
            }
        }
        return true;
    }
}
