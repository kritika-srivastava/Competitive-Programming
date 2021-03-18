/**
 * /mnt/e/#Fod Do/Codeforces/Next_Round.java
 * @author Kritika Srivastava
 * @since March 18, 2021
 *
 * Link - https://codeforces.com/problemset/problem/158/A
 * Comments - Took me 5 minutes to write and 45 minutes to debug.
 * I seriously dont know why though.
 */
import java.util.*;

public class Next_Round {
    public static void main(String[] Args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt() - 1;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int out = 0;
        int m = a[k];
        for (int i = 0; i < n; i++) {
            if (a[i] >= m && a[i] != 0) {
                out++;
            } else {
                break;
            }
        }
        System.out.println(out);
    }
}
