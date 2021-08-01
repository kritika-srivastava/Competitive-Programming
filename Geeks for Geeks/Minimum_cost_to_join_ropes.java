
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Minimum_cost_to_join_ropes.java
 * @author Kritika Srivastava
 * @since August 01, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/
 */

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass {
    // Driver Code
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        Integer nextInt() {
            return Integer.parseInt(next());
        }

        Long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            out.println(new Solution().minCost(arr, n));
            t--;
        }
        out.flush();
    }
}// } Driver Code Ends

class Solution {
    // Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) {
        if (n == 1) {
            return 0;
        }
        long ret = 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(arr[i]);
        }

        while (q.size() >= 2) {
            long c = q.poll() + q.poll();
            ret += c;
            q.add(c);
        }

        return ret;
    }
}