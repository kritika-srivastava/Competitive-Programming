
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class B2 {
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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
    }

    public static void main(String[] args) {
        FastReader kb = new FastReader();
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            int a[] = new int[n];
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            HashMap<Integer, LinkedList<Integer>> fill = new HashMap<Integer, LinkedList<Integer>>();
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
                if (!fill.containsKey(a[i])) {
                    LinkedList<Integer> l = new LinkedList<Integer>();
                    fill.put(a[i], l);
                }
            }
            for (int i = 0; i < n; i++) {
                if (!map.containsKey(a[i])) {
                    map.put(a[i], 1);
                } else {
                    map.put(a[i], map.get(a[i]) + 1);
                }
            }
            int max = 0;
            for (int i : map.keySet()) {
                if (map.get(i) <= k) {
                    max += map.get(i);
                } else {
                    max += k;
                }
            }
            max = (int)Math.ceil(max / k);
            HashMap<Integer, Integer> color = new HashMap<Integer, Integer>();

            for (int i = 1; i <= k; i++) {
                color.put(i, max);
            }

            for (int i = 0; i < n; i++) {
                boolean flag = false;
                for (int j : color.keySet()) {
                    if (!fill.get(a[i]).contains(j) && color.get(j) > 0) {
                        LinkedList<Integer> ll = fill.get(a[i]);
                        ll.add(j);
                        fill.put(a[i], ll);
                        System.out.print(j + " ");
                        color.put(j, color.get(j) - 1);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
