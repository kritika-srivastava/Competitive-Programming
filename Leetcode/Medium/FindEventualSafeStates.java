package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\FindEventualSafeStates.java
 * 
 * @author Kritika Srivastava
 * @since January 24, 2025
 *
 *        Link: https://leetcode.com/problems/find-eventual-safe-states
 */

public class FindEventualSafeStates {
    /*
     * @lc app=leetcode id=802 lang=java
     *
     * [802] Find Eventual Safe States
     */

    // @lc code=start

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        List<List<Integer>> incomingNodes = new ArrayList<>();
        int[] safeCounter = new int[n];
        Queue<Integer> safeNodes = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            incomingNodes.add(new ArrayList<Integer>());
        }

        // outgoing adjacency list
        for (int i = 0; i < n; i++) {
            for (int neighbour : graph[i]) {
                incomingNodes.get(neighbour).add(i);
            }
            safeCounter[i] = graph[i].length;
            if (safeCounter[i] == 0) {
                safeNodes.offer(i);
            }
        }

        List<Integer> ans = new LinkedList<Integer>();

        while (!safeNodes.isEmpty()) {
            int node = safeNodes.poll();
            ans.add(node);

            for (int neighbour : incomingNodes.get(node)) {
                safeCounter[neighbour] -= 1;
                if (safeCounter[neighbour] == 0) {
                    safeNodes.offer(neighbour);
                } else {
                }

            }
        }
        Collections.sort(ans);

        return ans;
    }
    // @lc code=end

}
