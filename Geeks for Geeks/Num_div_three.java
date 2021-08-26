// { Driver Code Starts
//Initial Template for Java

/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Num_div_three.java
 * @author Kritika Srivastava
 * @since August 26, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1/
 */
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
        int ret = 0;
        for (int i = 0; i < N; i++) {
            ret = (ret + arr[i]) % 3;
        }
        return ret % 3 == 0 ? 1 : 0;
    }
}