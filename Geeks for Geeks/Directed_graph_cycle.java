
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Directed_graph_cycle.java
 * @author Kritika Srivastava
 * @since July 25, 2021
 *
 * Link -https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
 */
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends

/* Complete the function below */

class Directed_graph_cycle {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (check(i, visited, adj, stack))
                    return false;
                return true;
            }
        }

        return false;
    }

}

    static boolean check(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, boolean[] stack) {
        if (stack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        stack[i] = true;

        for (int j : adj.get(i)) {

            if (check(j, visited, adj, stack)) {
                return true;
            }

        }
        stack[i] = false;
        return false;
    }
}
