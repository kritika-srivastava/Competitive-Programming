/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/search_a_2d_matrix.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Write an efficient algorithm that searches for a value
 *        in an m x n matrix. This matrix has the following properties: Integers
 *        in each row are sorted from left to right. The first integer of each
 *        row is greater than the last integer of the previous row.
 * 
 *        Link -https://leetcode.com/problems/search-a-2d-matrix/
 */
public class search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) {
                        found = true;
                        break;
                    } else {
                    }
                }
                break;
            } else {
            }
        }
        return found;
    }
}
