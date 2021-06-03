/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Max_Island_Area.java
 * 
 * @author Kritika Srivastava
 * @since June 03, 2021
 *
 *        Description - You are given an m x n binary matrix grid. An island is
 *        a group of 1's (representing land) connected 4-directionally
 *        (horizontal or vertical.) You may assume all four edges of the grid
 *        are surrounded by water.The area of an island is the number of cells
 *        with a value 1 in the island. Return the maximum area of an island in
 *        grid. If there is no island, return 0. Link
 *        -https://leetcode.com/problems/max-area-of-island/
 */
public class Max_Island_Area {
    int grid[][];

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ret = Math.max(ret, area(i, j));
            }
        }
        return ret;

    }

    public int area(int m, int n) {
        int re = 0;

        if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == 0) {

            return 0;
        } else {
            grid[m][n] = 0;
            re = 1 + area(m + 1, n) + area(m - 1, n) + area(m, n + 1) + area(m, n - 1);
        }
        return re;

    }
}
