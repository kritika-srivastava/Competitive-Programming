/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


// DID NOT WORK
// WILL CORRECT TOMORROW





/* Name of the class has to be "Main" only if the class is public. */
class query {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {

            // String m = kb.nextLine();
            // String p[] = m.split(" ");
            int n = kb.nextInt();
            int a[] = new int[n];
            int q = kb.nextInt();
            // String sk = kb.nextLine();
            // String ts[] = sk.split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            while (q-- > 0) {
                // String s = kb.nextLine();
                // String st[] = s.split(" ");
                int k = kb.nextInt();
                if (k == 1) {
                    int l = kb.nextInt();
                    int r = kb.nextInt();
                    int x = kb.nextInt();

                    for (int i = l - 1; i < r; i++) {
                        int temp = (int) Math.pow(x + i + 1 - l, 2);
                        a[i] += temp;
                    }
                } else {
                    int kk = kb.nextInt() - 1;
                    sb.append(Integer.toString(a[kk])+"\n");
                }
            }
            System.out.println(sb);
        } catch (Exception e) {
            return;
        }
    }
}
