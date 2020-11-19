
/**
 * C:\Users\kriti\Desktop\Target 450\cf.java
 * @author Kritika Srivastava
 * @since November 19, 2020
 *
 * Merge 2 sorted arrays without extra space
 *  Link - https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1
 */
import java.io.*;
import java.util.*;

class q12 {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }
            merge(arr1, arr2, n, m);
        }
    }
    // } Driver Code Ends

    static void merge(int arr1[], int arr2[], int n, int m) {
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
