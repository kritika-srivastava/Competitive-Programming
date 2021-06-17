/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/maximum_subarray.java
 * 
 * @author Kritika Srivastava
 * @since June 17, 2021
 *
 *        Description - Given an integer array nums, find the contiguous
 *        subarray (containing at least one number) which has the largest sum
 *        and return its sum.
 * 
 *        Link - https://leetcode.com/problems/maximum-subarray/
 */
public class maximum_subarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            if (max < 0) {
                max = 0;
            } else if (sum < max) {
                sum = max;
            }
            if (nums[i] > sum) {
                sum = nums[i];
            }

        }
        return sum;
    }
}
