package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\SubArrayWithOddSum.java
 * @author Kritika Srivastava
 * @since February 25, 2025
 *
 * Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/description/
 */

public class SubArrayWithOddSum {
    /*
 * @lc app=leetcode id=1524 lang=java
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

// @lc code=start

    public int numOfSubarrays(int[] arr) {

        /*
         * int ans = 0;
         * int prefixSum = 0;
         * 
         * HashMap<Integer, Integer> contiguousSum = new HashMap<>();
         * contiguousSum.put(-1, 0);
         * 
         * for (int i = 0; i < arr.length; i++) {
         * prefixSum += arr[i];
         * 
         * contiguousSum.put(i, prefixSum);
         * }
         * for (int k = 0; k < arr.length; k++) {
         * for (int j = k; j < arr.length; j++) {
         * int sum = contiguousSum.get(j) - contiguousSum.get(j - k - 1);
         * if (sum % 2 != 0) {
         * ans = (int) ((ans + 1) % (Math.pow(10, 9) + 7));
         * }
         * }
         * 
         * }
         * 
         * return ans;
         */

        int ans = 0;
        int prefixSum = 0;

        // Even count starts at 1 to handle first element itself being odd.
        int oddCount = 0, evenCount = 1; 

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                ans = (int) ((ans + oddCount) % (Math.pow(10, 9) + 7));
                evenCount++;
            } else {
                ans = (int) ((ans + evenCount) % (Math.pow(10, 9) + 7));
                oddCount++;
            }
        }

        return ans;

    }

// @lc code=end

}
