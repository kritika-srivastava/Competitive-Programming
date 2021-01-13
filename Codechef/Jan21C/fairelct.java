/**
 * C:\Users\kriti\Desktop\GFG.java
 * @author Kritika Srivastava
 * @since January 13, 2021
 *
 * Link - https://www.codechef.com/JAN21C/problems/FAIRELCT
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fairelct {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < m; i++) {
                b[i] = kb.nextInt();
            }
            Arrays.sort(b);

            if (sum(a) > sum(b)) {
                System.out.println(0);
            } else {
                int k = 0;
                for (int i = 0, j = m - 1; i < n && j >= 0; i++, j--) {

                    int tmp = a[i];
                    a[i] = b[j];
                    b[j] = tmp;
                    k++;
                    if (sum(a) > sum(b)) {
                        break;
                    } else {
                    }
                }
                if (sum(a) > sum(b))
                    System.out.println(k);
                else
                    System.out.println(-1);
            }

        }

    }

    static int sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
