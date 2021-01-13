/**
 * C:\Users\kriti\Desktop\GFG.java
 * @author Kritika Srivastava
 * @since January 13, 2021
 *
 * Link - https://www.codechef.com/JAN21C/problems/WIPL
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WIPL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        bk: while (t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            int a[] = new int[n];
            LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            Arrays.sort(a);
            hash.add(a[n - 1]);
            sum = a[n - 1];
            int z = -1;
            for (int i = n - 2; i >= 0; i--) {
                LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
                sum = sum + a[i];
                Iterator i1 = hash.iterator();
                while (i1.hasNext()) {
                    int p = (int) (i1.next());
                    h2.add(p);
                    h2.add(a[i]);
                    h2.add(p + a[i]);
                    if (((p + a[i]) >= k) && ((sum - p - a[i]) >= k)) {
                        z = n - i;
                        break;
                    }
                    if (((a[i]) >= k) && ((sum - a[i]) >= k)) {
                        z = n - i;
                        break;
                    }
                }
                if (z != -1) {
                    break;
                }
                hash = h2;
            }
            System.out.println(z);
        }
    }
}
