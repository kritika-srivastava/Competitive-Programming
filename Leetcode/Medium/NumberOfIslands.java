package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\NumberOfIslands.java
 * @author Kritika Srivastava
 * @since January 30, 2025
 *
 * Link: https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        int numberOfIslands = 0;
        int row = grid.length, col = grid[0].length;

        boolean[][] vis = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    numberOfIslands++;
                    BFS(vis, i, j, row, col, grid);
                } else {
                }
            }
        }
        return numberOfIslands;
    }

    static void BFS(boolean[][] vis, int i, int j, int row, int col, char[][] grid) {
        if (i >= 0 && i < row && j >= 0 && j < col && !vis[i][j]) {
            vis[i][j] = true;
            if (grid[i][j] == '1') {
                BFS(vis, i - 1, j, row, col, grid);
                BFS(vis, i + 1, j, row, col, grid);
                BFS(vis, i, j - 1, row, col, grid);
                BFS(vis, i, j + 1, row, col, grid);
            }
        }

    }
}
