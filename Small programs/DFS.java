/**
 * C:\Users\kriti\Desktop\DS\Java Practice\DFS.java
 * @author Kritika Srivastava
 * @since January 24, 2021
 *
 * Depth first search of Graph
 */
import java.util.*;

class DFS {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();

        while (T-- > 0) {

            int V = kb.nextInt();
            int E = kb.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {

                int u = kb.nextInt();
                ;
                int v = kb.nextInt();
                ;
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            ArrayList<Integer> ans = dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }

    static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < V; i++) {

            if (visited[i] == false) {
                dfs(adj, i, a, visited);

            }
        }
        return a;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int i, ArrayList<Integer> a, boolean visited[]) {
        visited[i] = true;
        a.add(i);
        for (int j : adj.get(i)) {
            if (!visited[j]) {
                dfs(adj, j, a, visited);
            }
        }
    }
}
