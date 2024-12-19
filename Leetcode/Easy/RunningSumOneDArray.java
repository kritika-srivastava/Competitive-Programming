package Leetcode.Easy;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\RunningSumOneDArray.java
 * @author Kritika Srivastava
 * @since December 19, 2024
 *
 * Link - https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOneDArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
