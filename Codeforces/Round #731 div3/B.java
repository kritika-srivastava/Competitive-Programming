
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
        int n = kb.nextInt();

        while (n-- > 0) {
            String s = kb.nextLine();
            boolean flag = true;
            
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(0) - 'a' == i) {
                    s = s.substring(1);
                } else if (s.charAt(s.length() - 1) - 'a' == i) {
                    s = s.substring(0, s.length() - 1);
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag)
            {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
