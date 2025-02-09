package Leetcode.Medium;

import java.util.HashMap;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\CountNumberOfBadPairs.java
 * @author Kritika Srivastava
 * @since February 09, 2025
 *
 * Link: https://leetcode.com/problems/count-number-of-bad-pairs
 */
public class CountNumberOfBadPairs {

    public long countBadPairs(int[] nums) {
        long ans = 0, n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // O(n^2) solution

        /*
         * for (int i = 0; i < nums.length; i++) {
         * for (int j = i + 1; j < nums.length; j++) {
         * if ((j - i) != nums[j] - nums[i]) {
         * ans++;
         * }
         * }
         * }
         */

        // O(n) solution
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i] - i)) {
                map.put(nums[i] - i, 1);
            } else {
                int prev = map.get(nums[i] - i);
                map.put(nums[i] - i, prev + 1);
            }
        }

        // Total pairs=nC2
        ans = n * (n - 1) / 2;

        // Subtract number of good pairs

        for (int i : map.keySet()) {
            long size = map.get(i);
            if (size > 1) {
                long goodPairs = size * (size - 1) / 2;
                ans -= goodPairs;
            }
        }
        return ans;
    }
}
