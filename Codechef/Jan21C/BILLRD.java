/**
 * C:\Users\kriti\Desktop\GFG.java
 * @author Kritika Srivastava
 * @since January 13, 2021
 *
 * Link - https://www.codechef.com/JAN21C/problems/BILLRD
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BILLRD {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        bk: while (t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            int x = kb.nextInt();
            int y = kb.nextInt();

            int m = k % 4;
            int X[] = new int[4];
            int Y[] = new int[4];
            if (x > y) {
                // for n,n
                X[0] = n;
                Y[0] = y + n - x;
                // for 0,n
                X[1] = Y[0] - n + X[0];
                Y[1] = n;
                // for 0,0
                X[2] = 0;
                Y[2] = n - X[1];
                // for n,0
                X[3] = Y[2];
                Y[3] = 0;
            } else {
                // for 0,n
                Y[0] = n;
                X[0] = n - y + x;
                // for n,0
                Y[1] = X[0];
                X[1] = Y[0];
                // for 0,0
                Y[2] = 0;
                X[2] = n - Y[1];
                // for 0,n
                Y[3] = X[2];
                X[3] = 0;
            }
            for (int i = 0; i < 4; i++) {
                if (X[i] == n && Y[i] == n) {
                    System.out.println(n + " " + n);
                    continue bk;
                } else if (X[i] == 0 && Y[i] == n) {
                    System.out.println(0 + " " + n);
                    continue bk;
                } else if (X[i] == 0 && Y[i] == 0) {
                    System.out.println(0 + " " + 0);
                    continue bk;
                } else if (X[i] == n && Y[i] == 0) {
                    System.out.println(n + " " + 0);
                    continue bk;
                }
            }

            if (m == 0) {
                System.out.println(X[3] + " " + Y[3]);
            } else {
                System.out.println(X[m - 1] + " " + Y[m - 1]);
            }

        }
    }
}
