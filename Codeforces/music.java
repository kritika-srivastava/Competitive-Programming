/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\music.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/contest/1466/problem/B
 */
import java.util.Scanner;
import java.util.*;

public class music {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            int k = 0;
            HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();
            for (int i = n - 1; i >= 0; i--) {
                if (!l.containsKey(a[i] + 1)) {
                    l.put(a[i] + 1, 0);
                    k++;
                } else if (!l.containsKey(a[i])) {
                    l.put(a[i], 0);
                } else {
                }
            }
            System.out.println(l.size());
        }

    }
}
