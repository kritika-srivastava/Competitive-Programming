/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Set_Matrix_Zero.java
 * @author Kritika Srivastava
 * @since July 23, 2022
 *
 * Link - https://leetcode.com/problems/set-matrix-zeroes/
 */
class Set_Matrix_Zero {

  public void setZeroes(int[][] matrix) {
    boolean[][] vis = new boolean[matrix.length][matrix[0].length];
    //Arrays.fill(vis,false);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0 && !vis[i][j]) {
          vis[i][j] = true;
          helper(matrix, vis, i, j);
        }
      }
    }
  }

  static void helper(int[][] matrix, boolean[][] vis, int i, int j) {
    for (int ii = 0; ii < matrix.length; ii++) {
      if (matrix[ii][j] == 0 && !vis[ii][j]) {
        vis[ii][j] = true;
        helper(matrix, vis, ii, j);
      } else {
        matrix[ii][j] = 0;
        vis[ii][j] = true;
      }
    }
    for (int jj = 0; jj < matrix[0].length; jj++) {
      if (matrix[i][jj] == 0 && !vis[i][jj]) {
        vis[i][jj] = true;
        helper(matrix, vis, i, jj);
      } else {
        matrix[i][jj] = 0;
        vis[i][jj] = true;
      }
    }
  }
}
