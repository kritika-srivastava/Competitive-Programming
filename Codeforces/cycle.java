
/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\cycle.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/group/Mka6Tznt4j/contest/309296/problem/F
 * The grader shows TLE, modifications are welcome.
 */
import java.util.Scanner;
import java.util.*;

public class cycle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int q = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        while (q-- > 0) {
            int k = 0;
            int l = kb.nextInt();
            l -= 1;
            int r = kb.nextInt();
            r -= 1;

            if (l < r) {

                for (int i = l; i <= r; i++) {
                    if (m.containsKey(a[i])) {
                        m.replace(a[i], m.get(a[i]), m.get(a[i]) + 1);
                    } else {
                        m.put(a[i], 1);
                    }
                }
                for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    if (entry.getValue() % 2 == 0) {
                        k++;
                    } else {
                    }
                }
                System.out.println(k);
            } else {
                for (int i = l; i < n; i++) {

                    if (m.containsKey(a[i])) {
                        m.replace(a[i], m.get(a[i]), m.get(a[i]) + 1);
                    } else {
                        m.put(a[i], 1);
                    }
                }
                for (int i = 0; i <= r; i++) {
                    if (m.containsKey(a[i])) {
                        m.replace(a[i], m.get(a[i]), m.get(a[i]) + 1);
                    } else {
                        m.put(a[i], 1);
                    }
                }

                for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    if (entry.getValue() % 2 == 0) {
                        k++;
                        // System.out.println(entry.getKey()+"===k==V==="+entry.getValue());
                    } else {
                    }
                }
                System.out.println(k);
            }
            k = 0;
            m.clear();
        }
    }

}
