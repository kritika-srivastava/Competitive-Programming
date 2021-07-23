/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Pairs_with_given_sum.java
 * @author Kritika Srivastava
 * @since July 23, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
 */
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                ret += map.get(k - arr[i]);
                if (k - arr[i] == arr[i]) {
                    ret--;
                }
            }
        }
        return ret / 2;
    }
}
