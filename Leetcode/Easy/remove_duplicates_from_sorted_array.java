/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/remove_duplicates_from_sorted_array.java
 * 
 * @author Kritika Srivastava
 * @since June 15, 2021
 *
 *        Description - Given an integer array nums sorted in non-decreasing
 *        order, remove the duplicates in-place such that each unique element
 *        appears only once. The relative order of the elements should be kept
 *        the same.
 * 
 *        Link -
 *        https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }
        int prev = nums[0];
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[pos] = nums[i];
                pos++;
                prev = nums[i];

            } else {
            }
        }
        return pos;
    }
}
