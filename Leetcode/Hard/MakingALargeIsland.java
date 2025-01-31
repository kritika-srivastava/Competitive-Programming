
import java.util.*;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Hard\MakingALargeIsland.java
 * 
 * @author Kritika Srivastava
 * @since January 31, 2025
 *
 *        Link: https://leetcode.com/problems/making-a-large-island
 */
public class MakingALargeIsland {

    private int gridSize;
    private int[][] matrix;
    private Map<Integer, Integer> islandMap = new HashMap<>();
    private static final int[][] MOVES = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int largestIsland(int[][] grid) {
        this.gridSize = grid.length;
        this.matrix = grid;
        int islandId = 2; // Start labeling islands from 2
        int maxIslandSize = 0;
        boolean hasWater = false;

        // Step 1: Identify and mark islands while storing their sizes
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (matrix[row][col] == 1) {
                    int size = exploreIsland(row, col, islandId);
                    islandMap.put(islandId, size);
                    maxIslandSize = Math.max(maxIslandSize, size);
                    islandId++;
                } else {
                    hasWater = true;
                }
            }
        }

        // If no water cells exist, return the total island size
        if (!hasWater)
            return maxIslandSize;

        // Step 2: Convert each water cell into land and compute max possible island
        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (matrix[row][col] == 0) {
                    Set<Integer> neighboringIslands = new HashSet<>();
                    int newIslandSize = 1; // Start with 1 (flipping a water cell)

                    // Check all 4 adjacent directions for neighboring islands
                    for (int[] move : MOVES) {
                        int newRow = row + move[0], newCol = col + move[1];
                        if (isWithinBounds(newRow, newCol) && matrix[newRow][newCol] > 1
                                && neighboringIslands.add(matrix[newRow][newCol])) {
                            newIslandSize += islandMap.get(matrix[newRow][newCol]);
                        }
                    }

                    maxIslandSize = Math.max(maxIslandSize, newIslandSize);
                }
            }
        }
        return maxIslandSize;
    }

    private int exploreIsland(int row, int col, int islandId) {
        if (!isWithinBounds(row, col) || matrix[row][col] != 1)
            return 0;

        matrix[row][col] = islandId; // Mark cell with unique island ID
        int size = 1;

        for (int[] move : MOVES) {
            size += exploreIsland(row + move[0], col + move[1], islandId);
        }

        return size;
    }

    private boolean isWithinBounds(int row, int col) {
        return row >= 0 && row < gridSize && col >= 0 && col < gridSize;
    }
}
