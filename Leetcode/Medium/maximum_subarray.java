/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/maximum_subarray.java
 * 
 * @author Kritika Srivastava
 * @since September 07, 2021
 *
 *        Link - https://leetcode.com/problems/maximum-subarray/
 */
public class maximum_subarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (sum < curr) {
                sum = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }
        return sum;
    }
}
