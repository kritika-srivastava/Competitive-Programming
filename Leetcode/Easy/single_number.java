/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/single_number.java
 * 
 * @author Kritika Srivastava
 * @since June 26, 2021
 *
 *        Description - Given a non-empty array of integers nums, every element
 *        appears twice except for one. Find that single one. You must implement
 *        a solution with a linear runtime complexity and use only constant
 *        extra space.
 * 
 *        Link - https://leetcode.com/problems/single-number/
 */
class single_number {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret = ret ^ nums[i];
        }
        return ret;
    }
}