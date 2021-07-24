
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Undirected_Graph_cycle.java
 * @author Kritika Srivastava
 * @since July 24, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
 */
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (check(i, adj, visited, -1)) {
                    // System.out.println("h1");
                    return true;
                }
            }
        }
        return false;
    }

    static boolean check(int u, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
        visited[u] = true;
        for (int j : adj.get(u)) {
            if (!visited[j]) {
                if (check(j, adj, visited, u)) {
                    // System.out.println("h2");
                    return true;

                }
            } else if (j != parent) {
                // System.out.println(j+" "+parent+" "+u);
                return true;
            } else {
            }

        }
        return false;
    }

}