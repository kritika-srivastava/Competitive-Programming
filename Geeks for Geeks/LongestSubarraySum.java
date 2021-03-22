
/**
 * /mnt/e/#Fod Do/Gfg/sample.java
 * @author Kritika Srivastava
 * @since March 22, 2021
 *
 * Longest Subarray Sum
 * Link - https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1/
 */
import java.io.*;
import java.util.*;

class LongestSubarraySum {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] element = line.trim().split("\\s+");
            int sizeOfArray = Integer.parseInt(element[0]);
            int K = Integer.parseInt(element[1]);

            int arr[] = new int[sizeOfArray];

            line = br.readLine();
            String[] elements = line.trim().split("\\s+");
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution obj = new Solution();
            int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);

            System.out.println(res);
        }
    }
}

class Solution {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int len = 0;
        for (int i = 0; i < A.length; i++) {
            int j = i, sum = 0;
            while (j < A.length) {
                sum += A[j];
                if (sum == K) {
                    if ((j - i + 1) > len) {
                        len = j - i + 1;
                        // System.out.println(sum);break;
                    } else {
                    }
                } else {
                }
                j++;
            }
        }
        return len;
    }
}
