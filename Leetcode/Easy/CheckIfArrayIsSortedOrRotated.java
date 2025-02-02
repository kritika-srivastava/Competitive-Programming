/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\CheckIfArrayIsSortedOrRotated.java
 * @author Kritika Srivastava
 * @since February 02, 2025
 *
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class CheckIfArrayIsSortedOrRotated {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        return count <= 1;
    } 
}
