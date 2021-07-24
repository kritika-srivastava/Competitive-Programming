/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Grapg_BFS.java
 * @author Kritika Srivastava
 * @since July 24, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
 */
// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class Graph_BFS {
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
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        ArrayList<Integer> l = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            if (!l.contains(q.peek())) {
                int a = q.remove();
                ArrayList<Integer> m = adj.get(a);
                for (int i : m) {
                    q.add(i);
                }
                l.add(a);

            } else {
                q.remove();
            }
        }

        return l;
    }
}