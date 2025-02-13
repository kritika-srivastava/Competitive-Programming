package Leetcode.Medium;

import java.util.PriorityQueue;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MinOperationsToExceedThreshValue2.java
 * @author Kritika Srivastava
 * @since February 13, 2025
 *
 * Link: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/
 */
public class MinOperationsToExceedThreshValue2 {

    public int minOperations(int[] nums, int k) {
        int ans = 0;
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add((long) nums[i]);
        }

        while (heap != null && heap.peek() < k) {
            long n1 = heap.poll();
            long n2 = heap.poll();

            long newElement = Math.min(n1, n2) * 2 + Math.max(n1, n2);
            heap.add(newElement);
            ans++;
        }
        return ans;
    }l̥
}