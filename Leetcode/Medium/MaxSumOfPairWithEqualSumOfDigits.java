package Leetcode.Medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MaxSumOfPairWithEqualSumOfDigits.java
 * @author Kritika Srivastava
 * @since February 12, 2025
 *
 * Link: https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/
 */
public class MaxSumOfPairWithEqualSumOfDigits {

    public int maximumSum(int[] nums) {

        int ans = -1, n = nums.length;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        int sumNums[] = new int[n];

        for (int i = 0; i < n; i++) {
            sumNums[i] = sum(nums[i]);
        }

        for (int i = 0; i < n; i++) {

            if (!map.containsKey(sumNums[i])) {
                PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
                priorityQueue.add(nums[i]);

                map.put(sumNums[i], priorityQueue);
            } else {
                PriorityQueue<Integer> priorityQueue = map.get(sumNums[i]);
                priorityQueue.add(nums[i]);
                map.put(sumNums[i], priorityQueue);
            }

        }

        for (int i : map.keySet()) {
            PriorityQueue<Integer> priorityQueue = map.get(i);
            int priorityQueueN = priorityQueue.size();
            if (priorityQueueN > 1) {

                int sum = priorityQueue.poll() + priorityQueue.poll();
                ans = Math.max(sum, ans);
            }
        }

        return ans;

    }

    static int sum(int num) {

        int ans = 0;
        while (num > 0) {
            ans += num % 10;
            num /= 10;
        }

        return ans;

    }
}
