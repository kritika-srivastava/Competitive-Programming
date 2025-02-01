/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\SpecialArray1.java
 * @author Kritika Srivastava
 * @since February 01, 2025
 *
 * Link: https://leetcode.com/problems/special-array-i
 */
public class SpecialArray1 {

    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            } else {
            }
        }

        return true;
    }
}