
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
        FastReader kb = new FastReader();
        int t = kb.nextInt();
        // int k = s.nextInt();
        // int count = 0;
        while (t-- > 0) {
            int n=kb.nextInt();
            int c1=0,cc1=0,c2=0,cc2=0;
            cc1=n/3;
            cc2=n/3;
            c1=cc1;
            c2=2*cc2;
            if(n-(c1+c2)==1)
            {
                cc1++;
            }
            else if(n-(c1+c2)==2){
                cc2++;
            }

            System.out.println(cc1+" "+cc2);
        }
    }

}
