
/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\Cow.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/contest/1466/problem/A
 */
import java.util.Scanner;
import java.util.*;

public class Cow {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        fd: while (t-- > 0) {
            int r = kb.nextInt();
            int a[] = new int[r];
            for (int i = 0; i < r; i++) {
                a[i] = kb.nextInt();
            }
            if (r == 0 | r == 1) {
                System.out.println(0);
                continue fd;
            }
            int x = (r * (r - 1)) / 2;
            double out[] = new double[x];
            int y = 0;
            for (int i = 0; i < r; i++) {
                for (int j = i + 1; j < r; j++) {

                    double l = Math.sqrt(Math.pow(1, 2) + Math.pow(a[i], 2));
                    double m = Math.abs(a[j] - a[i]);
                    double n = Math.sqrt(Math.pow(1, 2) + Math.pow(a[j], 2));
                    double s = (l + m + n) / 2;
                    double area = Math.sqrt(s * (s - l) * (s - m) * (s - n));
                    area = Math.round(area * 10.0) / 10.0;
                    out[y] = area;
                    y++;

                }
            }

            int k = 1;

            Arrays.sort(out);
            if (out[0] == 0) {
                k = 0;
            }
            for (int i = 1; i < x; i++) {

                if (out[i] != out[i - 1] && out[i] != 0) {
                    k++;
                } else {

                }
            }

            System.out.println(k);
        }
    }
}
