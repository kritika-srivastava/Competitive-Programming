package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\RedundantConnection.java
 * 
 * @author Kritika Srivastava
 * @since January 29, 2025
 *
 *        Link: https://leetcode.com/problems/redundant-connection/
 */
/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 */

// @lc code=start
public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {

        // DSU implementation :)

        int n = edges.length;
        int[] parent = new int[n + 1];
        int ans[] = new int[2];

        // Initializing parent of every node
        // Ignoring i=0 as graph is 1 indexed
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < n; i++) {

            int parent1 = 0, parent2 = 0;
            int node1 = edges[i][0];
            int node2 = edges[i][1];

            // Tracing back parents of both nodes
            while (node2 != parent[node2]) {
                node2 = parent[node2];
            }

            while (node1 != parent[node1]) {
                node1 = parent[node1];
            }

            // if both nodes have common parent -> redundant vertex
            if (node1 == node2) {
                ans[0] = edges[i][0];
                ans[1] = edges[i][1];
            } else {
                // adding the node2 to Disjoint Set containing node1
                parent[node2] = node1;
            }

        }
        return ans;
    }
}
// @lc code=end
