
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {
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
        // int count = 0;
        while (n-- > 0) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();

            int x2 = s.nextInt();
            int y2 = s.nextInt();

            int x3 = s.nextInt();
            int y3 = s.nextInt();

           
            int ans = Math.abs(y2-y1)+Math.abs(x2-x1);
            
             if(((x1==x2 && x1==x3) && ((y3>y1 && y3<y2)||(y3<y1 && y3>y2)))||((y1==y2 && y1==y3) && ((x3>x1 && x3<x2)||(x3<x1 && x3>x2)))) {
                ans += 2;
            }

            System.out.println(ans);

        }
    }

}
