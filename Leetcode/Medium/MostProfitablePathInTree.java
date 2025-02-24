import java.util.ArrayList;
import java.util.List;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MostProfitablePathInTree.java
 * @author Kritika Srivastava
 * @since February 24, 2025
 *
 * Link: https://leetcode.com/problems/most-profitable-path-in-a-tree
 */
public class MostProfitablePathInTree {

    public int mostProfitablePath(int[][] connections, int target, int[] values) {
        nodeCount = values.length;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < nodeCount; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        bobDistance = new int[nodeCount];

        for (int[] link : connections) {
            adjacencyList.get(link[0]).add(link[1]);
            adjacencyList.get(link[1]).add(link[0]);
        }

        return calculateMaxProfit(0, 0, 0, target, values);
    }

    private List<List<Integer>> adjacencyList;
    private int[] bobDistance;
    private int nodeCount;

    private int calculateMaxProfit(
        int current,
        int previous,
        int elapsedTime,
        int target,
        int[] values
    ) {
        int totalProfit = 0, bestSubtreeProfit = Integer.MIN_VALUE;

        if (current == target) {
            bobDistance[current] = 0;
        } else {
            bobDistance[current] = nodeCount;
        }

        for (int neighbor : adjacencyList.get(current)) {
            if (neighbor != previous) {
                bestSubtreeProfit = Math.max(
                    bestSubtreeProfit,
                    calculateMaxProfit(neighbor, current, elapsedTime + 1, target, values)
                );
                bobDistance[current] = Math.min(
                    bobDistance[current],
                    bobDistance[neighbor] + 1
                );
            }
        }

        if (bobDistance[current] > elapsedTime) {
            totalProfit += values[current];
        } else if (bobDistance[current] == elapsedTime) {
            totalProfit += values[current] / 2;
        }

        return (bestSubtreeProfit == Integer.MIN_VALUE)
            ? totalProfit
            : totalProfit + bestSubtreeProfit;
    }

}
