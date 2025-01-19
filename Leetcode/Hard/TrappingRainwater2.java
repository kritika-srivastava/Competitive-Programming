package Leetcode.Hard;

import java.util.PriorityQueue;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Hard\TrappingRainwater2.java
 * 
 * @author Kritika Srivastava
 * @since January 19, 2025
 *
 *        Link - https://leetcode.com/problems/trapping-rain-water-ii
 */
public class TrappingRainwater2 {
    public int trapRainWater(int[][] heightMap) {
        int[] rowDirections = { 0, 0, -1, 1 };
        int[] colDirections = { -1, 1, 0, 0 };

        int rows = heightMap.length;
        int cols = heightMap[0].length;

        boolean[][] visitedCells = new boolean[rows][cols];
        PriorityQueue<Cell> minHeap = new PriorityQueue<>();

        for (int row = 0; row < rows; row++) {
            minHeap.offer(new Cell(heightMap[row][0], row, 0));
            minHeap.offer(new Cell(heightMap[row][cols - 1], row, cols - 1));
            visitedCells[row][0] = visitedCells[row][cols - 1] = true;
        }

        for (int col = 0; col < cols; col++) {
            minHeap.offer(new Cell(heightMap[0][col], 0, col));
            minHeap.offer(new Cell(heightMap[rows - 1][col], rows - 1, col));
            visitedCells[0][col] = visitedCells[rows - 1][col] = true;
        }

        int totalWater = 0;

        while (!minHeap.isEmpty()) {
            Cell current = minHeap.poll();
            int currentRow = current.row;
            int currentCol = current.col;
            int boundaryHeight = current.height;

            for (int direction = 0; direction < 4; direction++) {
                int neighborRow = currentRow + rowDirections[direction];
                int neighborCol = currentCol + colDirections[direction];

                if (isWithinBounds(neighborRow, neighborCol, rows, cols) &&
                        !visitedCells[neighborRow][neighborCol]) {
                    int neighborHeight = heightMap[neighborRow][neighborCol];
                    if (neighborHeight < boundaryHeight) {
                        totalWater += boundaryHeight - neighborHeight;
                    }
                    minHeap.offer(
                            new Cell(
                                    Math.max(neighborHeight, boundaryHeight),
                                    neighborRow,
                                    neighborCol));
                    visitedCells[neighborRow][neighborCol] = true;
                }
            }
        }

        return totalWater;
    }

    private static class Cell implements Comparable<Cell> {
        int height;
        int row;
        int col;

        public Cell(int height, int row, int col) {
            this.height = height;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Cell other) {
            return Integer.compare(this.height, other.height);
        }
    }

    private boolean isWithinBounds(int row, int col, int rows, int cols) {
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }
}
