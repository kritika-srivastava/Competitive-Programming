package Leetcode.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MaximumFishInAGrid.java
 * @author Kritika Srivastava
 * @since January 28, 2025
 *
 * Link: https://leetcode.com/problems/maximum-number-of-fish-in-a-grid
 */
/*
* @lc app=leetcode id=2658 lang=java
*
* [2658] Maximum Number of Fish in a Grid
*/

// @lc code=start

public class MaximumFishInAGrid {

    public int findMaxFish(int[][] grid) {

        int ans = 0;
        int row = grid.length, column = grid[0].length;

        // Visited Array
        boolean[][] vis = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            Arrays.fill(vis[i], false);
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] == 0) {
                    vis[r][c] = true;
                } else if (grid[r][c] != 0 && !vis[r][c]) {

                    Queue<int[]> adjacency = new LinkedList<>();

                    int maxFish = 0;
                    vis[r][c] = true;
                    adjacency.add(new int[] { r, c });

                    while (!adjacency.isEmpty()) {
                        int[] currPosition = adjacency.poll();
                        int currRow = currPosition[0], currCol = currPosition[1];

                        maxFish += grid[currRow][currCol];

                        if (currRow - 1 >= 0 && !vis[currRow - 1][currCol] && grid[currRow - 1][currCol] != 0) {
                            vis[currRow - 1][currCol] = true;
                            adjacency.add(new int[] { currRow - 1, currCol });
                        }
                        if (currRow + 1 < row && !vis[currRow + 1][currCol] && grid[currRow + 1][currCol] != 0) {
                            vis[currRow + 1][currCol] = true;
                            adjacency.add(new int[] { currRow + 1, currCol });
                        }
                        if (currCol - 1 >= 0 && !vis[currRow][currCol - 1] && grid[currRow][currCol - 1] != 0) {
                            vis[currRow][currCol - 1] = true;
                            adjacency.add(new int[] { currRow, currCol - 1 });
                        }
                        if (currCol + 1 < column && !vis[currRow][currCol + 1] && grid[currRow][currCol + 1] != 0) {
                            vis[currRow][currCol + 1] = true;
                            adjacency.add(new int[] { currRow, currCol + 1 });
                        }

                    }
                    ans = Math.max(ans, maxFish);
                }
            }
        }

        return ans;
    }
}
// @lc code=end
