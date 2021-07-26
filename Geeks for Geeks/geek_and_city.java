
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/geek_and_city.java
 * @author Kritika Srivastava
 * @since July 26, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/geek-and-city/0#
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class geek_and_city {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        while (t-- > 0) {
            int n = 0, m = 0;
            String s = kb.nextLine();
            String st[] = s.trim().split("\\ ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);

            ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i <= n; i++) {
                a.add(new ArrayList<Integer>());
            }

            for (int i = 0; i < m; i++) {
                String l = kb.nextLine();
                String ll[] = l.trim().split("\\ ");
                int x = Integer.parseInt(ll[0]);
                int y = Integer.parseInt(ll[1]);

                // System.out.println(" x,y "+x+" "+y);
                a.get(x).add(y);
                a.get(y).add(x);
            }
            int k = 0;
            boolean v[] = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!v[i]) {
                    k++;
                    dfs(i, a, v);
                }
            }
            System.out.println(k - 1);

        }
    }

    static void dfs(int i, ArrayList<ArrayList<Integer>> a, boolean[] v) {
        if (v[i]) {
            return;
        } else {
            v[i] = true;
            for (int j : a.get(i)) {

                dfs(j, a, v);
            }
        }
    }
}