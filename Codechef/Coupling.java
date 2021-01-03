/**
 * C:\Users\kriti\Desktop\DS\Codefores\Codecheef.java
 * @author Kritika Srivastava
 * @since January 03, 2021
 *
 * Link - https://www.codechef.com/INRO2021/problems/COUPLING
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Coupling {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bu.readLine());
        int i, a;
        String s[] = bu.readLine().split(" ");
        for (i = 0; i < n; i++) {
            a = Integer.parseInt(s[i]);
            int x = a ^ 2;
            if (a == 2)
                x = 1;
            sb.append(x + " ");
        }
        System.out.print(sb);
    }
}
