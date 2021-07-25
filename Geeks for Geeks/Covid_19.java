import java.util.*;
import java.lang.*;
import java.io.*;

class pair {
    int a;
    int b;

    public pair(int m, int n) {
        a = m;
        b = n;
    }

}

public class Covid_19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        while (t-- > 0) {
            int m = 0, n = 0;
            String st = kb.nextLine();
            String[] s = st.trim().split("\\ ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            int a[][] = new int[m][n];
            int k = 0;

            for (int i = 0; i < m; i++) {
                String l = kb.nextLine();
                String[] ll = l.trim().split("\\ ");

                for (int j = 0; j < ll.length; j++) {
                    a[i][j] = Integer.parseInt(ll[j]);
                    if (a[i][j] == 1) {
                        k++;
                    }
                }
            }
            //System.out.println("K initially"+k);
            int ret = 0;
            while (k > 0) {
                Queue<pair> q = new java.util.LinkedList<pair>();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        // System.out.println(a[i][j] + " " + i + " " + j);
                        if (a[i][j] == 0) {

                            if (j - 1 >= 0 && a[i][j - 1] == 1 ) {
                                k--;
                                a[i][j-1]=-1;
                                q.add(new pair(i, j - 1));
                            }
                            if (j + 1 < n && a[i][j + 1] == 1) {
                                k--;
                                a[i][j+1]=-1;
                                q.add(new pair(i, j + 1));
                            }
                            if (i - 1 >= 0 && a[i - 1][j] == 1) {
                                k--;
                                a[i-1][j]=-1;
                                q.add(new pair(i - 1, j));
                            }
                            if (i + 1 < m && a[i + 1][j] == 1) {
                                k--;
                                a[i+1][j]=-1;
                                q.add(new pair(i + 1, j));
                            }

                        }
                    }
                }
                
                while (!q.isEmpty()) {
                    pair p = q.remove();
                    a[p.a][p.b] = 0;
                    // System.out.println("removing " + ret);
                }
                ret += 1;
            }

            System.out.println(ret);
        }
    }
}