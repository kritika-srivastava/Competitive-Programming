package Leetcode.Hard;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Hard\MinCostOneValidPathInGrid.java
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 * Link : https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
 */
public class MinCostOneValidPathInGrid {
    int[][] directions = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int minCost(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        queue.offer(new int[] { 0, 0, 0 });

        int[][] costs = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(costs[i], Integer.MAX_VALUE);
        }
        costs[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cost = current[0], row = current[1], col = current[2];

            if (costs[row][col] != cost) continue;

            for (int dir = 0; dir < 4; dir++) {
                int newRow = row + directions[dir][0];
                int newCol = col + directions[dir][1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int newCost = cost + (dir != (grid[row][col] - 1) ? 1 : 0);

                    if (costs[newRow][newCol] > newCost) {
                        costs[newRow][newCol] = newCost;
                        queue.offer(new int[] { newCost, newRow, newCol });
                    }
                }
            }
        }

        return costs[rows - 1][cols - 1];
    }
}
