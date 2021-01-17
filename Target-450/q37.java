
/**
 * C:\Users\kriti\Desktop\DS\Target 450\q37.java
 * @author Kritika Srivastava
 * @since January 17, 2021
 *
 * Spiral Matrix
 * Link - https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1#
 */
// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val : ans)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends

class Solution {
    static ArrayList<Integer> spirallyTraverse(int a[][], int m, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i, k = 0, l = 0;
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) {
                arr.add(a[k][i]);
            }
            k++;

            for (i = k; i < m; ++i) {
                arr.add(a[i][n - 1]);
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    arr.add(a[m - 1][i]);
                }
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    arr.add(a[i][l]);
                }
                l++;
            }

        }
        return arr;
    }
}
