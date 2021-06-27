/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cyclic_quadrilateral {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = kb.nextInt();
            while (t-- > 0) {
                int x1 = kb.nextInt();
                int y1 = kb.nextInt();
                int x2 = kb.nextInt();
                int y2 = kb.nextInt();
                if (x1 + x2 == y1 + y2 && x1 + x2 == 180) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        } catch (Exception e) {
            return;
        }
    }
}
