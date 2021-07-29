/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Graph_Transitive_closure.java
 * @author Kritika Srivastava
 * @since July 29, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1/
 * Based on floyd-warshalls algo
 */
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];

            for (int i = 0; i < N; i++) {
                String a[] = in.readLine().trim().split("\\s+");
                for (int j = 0; j < N; j++)
                    graph[i][j] = Integer.parseInt(a[j]);
            }

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < ans.get(i).size(); j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.println();
            }
        }
    }
}// } Driver Code Ends

// User function Template for Java

class Solution {

    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        int r[][] = graph;
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    r[i][j] = (r[i][j] != 0 || (r[i][k] != 0 && r[k][j] != 0)) ? 1 : 0;
                    if (i == j) {
                        r[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            ret.add(new ArrayList<Integer>());
            for (int j = 0; j < N; j++) {
                ret.get(ret.size() - 1).add(r[i][j]);
            }
        }

        return ret;
    }
}