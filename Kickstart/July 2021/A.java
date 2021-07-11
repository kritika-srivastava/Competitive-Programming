
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

class Solution {
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
        FastReader s = new FastReader();
        int n = s.nextInt();
        // int k = s.nextInt();
        int count = 1;
        while (n-- > 0) {
            long a[][] = new long[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j && j == 1) {
                    } else {
                        a[i][j] = s.nextLong();
                    }
                }
            }

            long m[] = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
            // Row : 2
            if ((a[1][0] + a[1][2]) % 2 == 0) {
                m[0] = (a[1][0] + a[1][2]) / 2;

            }
            // Col : 2
            if ((a[0][1] + a[2][1]) % 2 == 0) {
                m[1] = (a[0][1] + a[2][1]) / 2;

            }

            // Diag : 1
            if ((a[0][0] + a[2][2]) % 2 == 0) {
                m[2] = (a[0][0] + a[2][2]) / 2;

            }

            // Diag : 2
            if ((a[0][2] + a[2][0]) % 2 == 0) {
                m[3] = (a[0][2] + a[2][0]) / 2;

            }
            // Arrays.sort(m);

            Map<Long, Integer> hp = new HashMap<Long, Integer>();

            for (int i = 0; i < 4; i++) {
                long key = m[i];
                if (hp.containsKey(key)) {
                    hp.put(key, hp.get(key) + 1);
                } else if (m[i] != Integer.MIN_VALUE) {
                    hp.put(key, 1);
                } else {
                }
            }

            // find max frequency.
            int max_count = 0;

            for (Entry<Long, Integer> val : hp.entrySet()) {
                if (max_count < val.getValue()) {
                    max_count = val.getValue();
                }
            }
            // System.out.println("Max count "+max_count);
            // Row :1
            if ((a[0][0] + a[0][2]) == 2 * a[0][1]) {
                max_count++;
            }
            // Row : 3
            if ((a[2][0] + a[2][2]) == 2 * a[2][1]) {
                max_count++;
            }
            // Col : 1
            if ((a[0][0] + a[2][0]) == 2 * a[1][0]) {
                max_count++;
            }
            // Col : 3

            if ((a[0][2] + a[2][2]) == 2 * a[1][2]) {

                max_count++;
            }

            System.out.println("Case #" + count + ": " + max_count);
            count++;
        }

    }
}
