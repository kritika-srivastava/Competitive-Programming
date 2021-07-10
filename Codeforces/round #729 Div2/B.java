
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

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
        FastReader s = new FastReader();
        int t = s.nextInt();
        // int k = s.nextInt();
        // int count = 0;
        while (t-- > 0) {
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            if (check(n, a, b) == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

    static boolean check(long n, int a, int b) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % b == 1) {
            return true;
        }
        else if(a==1)
        {return (n%b==1);}

        if (n % a == 0 ) {
            while (n % a == 0) {
                n = n / a;
            }

        } else {
            n = n - b;
        }
        return check(n, a, b);

    }
}
