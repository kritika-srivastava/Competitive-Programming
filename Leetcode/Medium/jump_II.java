/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/jump_II.java
 * 
 * @author Kritika Srivastava
 * @since September 05, 2021
 *
 *        Link - https://leetcode.com/problems/jump-game-ii/
 */
public class jump_II {
    public int jump(int[] nums) {
        int ret = 0, end = 0, further = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            further = Math.max(further, i + nums[i]);
            if (i == end) {
                ret++;
                end = further;
            }
        }
        return ret;
    }
}
