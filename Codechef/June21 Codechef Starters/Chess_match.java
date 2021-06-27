/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chess_Match {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = kb.nextInt();
            while (t-- > 0) {
                int N = kb.nextInt();
                int A = kb.nextInt();
                int B = kb.nextInt();
                int ret = 2 * (180 + N) - A - B;
                System.out.println(ret);

            }
        } catch (Exception e) {
            return;
        }
    }
}
