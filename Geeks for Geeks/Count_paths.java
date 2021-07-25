/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Count_paths.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/count-the-paths4332/1/
 */// { Driver Code Starts
    //Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for (int i = 0; i < m; i++) {
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    public int possible_paths(int[][] edges, int n, int s, int d) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edges.length; i++) {
            a.get(edges[i][0]).add(edges[i][1]);
        }
        // boolean[] v=new boolean[n];
        int k = 0;
        k = backtrack(a, s, d, k);
        return k;

    }

    static int backtrack(ArrayList<ArrayList<Integer>> a, int s, int d, int k) {

        if (s == d) {
            k++;
        }
        for (int i : a.get(s)) {
            k = backtrack(a, i, d, k);
        }

        return k;
    }
}