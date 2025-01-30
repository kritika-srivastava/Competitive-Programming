package Leetcode.Hard;

import java.util.*;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Hard\DivideNodesInMaxNumberOfGroups.java
 * @author Kritika Srivastava
 * @since January 30, 2025
 *
 * Link: https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups/
 */
public class DivideNodesInMaxNumberOfGroups {

    private int[] group;
    private List<List<Integer>> graph;
    private int size;

    private boolean checkBipartite(int node, int color, List<Integer> component) {
        group[node] = color;
        component.add(node);
        for (int neighbor : graph.get(node)) {
            if (group[neighbor] == color)
                return false;
            if (group[neighbor] == -1 && !checkBipartite(neighbor, 1 - color, component))
                return false;
        }
        return true;
    }

    private int calculateMaxGroups(List<Integer> component) {
        int maxDepth = 0;
        for (int start : component) {
            int[] depth = new int[size];
            Arrays.fill(depth, -1);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            depth[start] = 0;
            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : graph.get(node)) {
                    if (depth[neighbor] == -1) {
                        depth[neighbor] = depth[node] + 1;
                        maxDepth = Math.max(maxDepth, depth[neighbor]);
                        queue.add(neighbor);
                    }
                }
            }
        }
        return maxDepth + 1;
    }

    public int magnificentSets(int size, int[][] connections) {
        this.size = size;
        group = new int[size];
        Arrays.fill(group, -1);
        graph = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            int u = connection[0] - 1, v = connection[1] - 1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        List<List<Integer>> components = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (group[i] == -1) {
                List<Integer> component = new ArrayList<>();
                if (!checkBipartite(i, 0, component))
                    return -1;
                components.add(component);
            }
        }

        int totalGroups = 0;
        for (List<Integer> component : components) {
            totalGroups += calculateMaxGroups(component);
        }

        return totalGroups;
    }
}
