package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MoveAllBallsToEachBox1769.java
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 * Link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 */
public class MoveAllBallsToEachBox1769 {

    public int[] minOperations(String boxes) {
        // char[] box=boxes.toCharArray();
        int count = 0, n = boxes.length();
        int left[] = new int[n];
        int right[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
            } else {
                left[i] = count * 1 + left[i - 1];
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
            } else {
                right[i] = count * 1 + right[i + 1];
            }
            if (boxes.charAt(i) == '1') {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            left[i] = left[i] + right[i];
        }

        return left;
    }

}
