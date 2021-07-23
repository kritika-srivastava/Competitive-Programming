
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class B {
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
            String s = kb.nextLine();
            char[] ch = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < ch.length; i++) {
                if (!map.containsKey(ch[i])) {
                    map.put(ch[i], 1);
                } else {
                    map.put(ch[i], map.get(ch[i]) + 1);
                }
            }
            int k = 0;
            for (char i : map.keySet()) {
                int m = map.get(i);
                //System.out.println(i+" "+m);
                if (m <= 2) {
                    k += m;
                } else {
                    k += 2;
                }
            }
            System.out.println((int) Math.ceil(k / 2));
        }
    }
}
