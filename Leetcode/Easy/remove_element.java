/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/remove_element.java
 * 
 * @author Kritika Srivastava
 * @since June 15, 2021
 *
 *        Description - Given an integer array nums and an integer val, remove
 *        all occurrences of val in nums in-place. The relative order of the
 *        elements may be changed.
 * 
 *        Link - https://leetcode.com/problems/remove-element/
 */
public class remove_element {
    public int removeElement(int[] nums, int val) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ret] = nums[i];
                ret++;
            }
        }
        return ret;
    }
}
