package Leetcode.Medium;

import java.util.HashMap;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\FirstCompletelyPaintedRowOrColumn.java
 * @author Kritika Srivastava
 * @since January 20, 2025
 *
 * Link - https://leetcode.com/problems/first-completely-painted-row-or-column/
 */
/*
 * @lc app=leetcode id=2661 lang=java
 *
 * [2661] First Completely Painted Row or Column
 */

// @lc code=start
public class FirstCompletelyPaintedRowOrColumn {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        HashMap<Integer, int[]> map = new HashMap<>();
        int rowCount[] = new int[m];
        int columnCount[] = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(mat[i][j], new int[] { i, j });
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int temp[] = map.get(arr[i]);
            int ii = temp[0], jj = temp[1];

            rowCount[ii]++;
            columnCount[jj]++;

            if (rowCount[ii] == n || columnCount[jj] == m) {
                return i;

            }
        }
        return -1;
    }

    // static boolean isPainted(boolean[][] mat, int m, int n, int ii, int jj) {

    // boolean flag = true;
    // for (int j = 0; j < n; j++) {
    // if (!mat[ii][j]) {
    // flag = false;
    // }
    // }
    // if (flag) {
    // return true;
    // }

    // flag = true;
    // for (int i = 0; i < m; i++) {
    // if (!mat[i][jj]) {
    // flag = false;
    // }
    // }
    // if (flag) {
    // return true;
    // }

    // return false;
    // }
    // @lc code=end

}
