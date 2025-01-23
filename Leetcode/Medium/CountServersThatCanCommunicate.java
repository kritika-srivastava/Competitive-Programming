/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\CountServersThatCanCommunicate.java
 * @author Kritika Srivastava
 * @since January 23, 2025
 *
 * Link - https://leetcode.com/problems/count-servers-that-communicate
 */

public class CountServersThatCanCommunicate {
    public int countServers(int[][] grid) {
        int ans = 0, row = grid.length, column = grid[0].length;
        boolean vis[][] = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    int temp = 0;
                    for (int ii = 0; ii < row; ii++) {
                        if (grid[ii][j] == 1 && !vis[ii][j] && ii != i) {
                            temp++;
                            vis[ii][j] = true;
                        } else if (ii != i) {
                            vis[ii][j] = true;
                        }

                    }
                    for (int jj = 0; jj < column; jj++) {
                        if (grid[i][jj] == 1 && !vis[i][jj] && jj != j) {
                            temp++;
                            vis[i][jj] = true;
                        } else if (jj != j) {
                            vis[i][jj] = true;
                        }

                    }

                    if (!vis[i][j] && temp > 0) {
                        vis[i][j] = true;
                        temp++;
                    } else {
                    }

                    ans += temp;
                }
            }
        }

        return ans;
    }
}
