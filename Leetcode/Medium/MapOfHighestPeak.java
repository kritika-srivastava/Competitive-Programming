package Leetcode.Medium;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MapOfHighestPeak.java
 * @author Kritika Srivastava
 * @since January 22, 2025
 *
 * Link: https://leetcode.com/problems/map-of-highest-peak
 */
import java.util.Arrays;
import java.util.Queue;

public class MapOfHighestPeak {
    public int[][] highestPeak(int[][] isWater) {

        int m = isWater.length, n = isWater[0].length;
        int[][] peak = new int[m][n];

        for (int[] row : peak) {
            Arrays.fill(row, -1);
        }
        Queue<int[]> cellIteration = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    peak[i][j] = 0;
                    cellIteration.add(new int[] { i, j });
                }
            }
        }
        int height = 1;

        while (!cellIteration.isEmpty()) {
            int rippleSize = cellIteration.size();

            for (int k = 0; k < rippleSize; k++) {
                int[] curr = cellIteration.poll();
                int i = curr[0], j = curr[1];
                // top
                if (i - 1 >= 0 && peak[i - 1][j] == -1) {
                    peak[i - 1][j] = height;
                    cellIteration.add(new int[] { i - 1, j });
                }
                // bottom
                if (i + 1 < m && peak[i + 1][j] == -1) {
                    peak[i + 1][j] = height;
                    cellIteration.add(new int[] { i + 1, j });
                }
                // left
                if (j - 1 >= 0 && peak[i][j - 1] == -1) {
                    peak[i][j - 1] = height;
                    cellIteration.add(new int[] { i, j - 1 });
                }
                // right
                if (j + 1 < n && peak[i][j + 1] == -1) {
                    peak[i][j + 1] = height;
                    cellIteration.add(new int[] { i, j + 1 });
                }
            }
            height++;
        }

        return peak;
    }
}