/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner kb = new Scanner(System.in)) {
            int t = kb.nextInt();
            int res = 0;
            while (t-- > 0) {
                int s = kb.nextInt();
                int n = kb.nextInt();
                int k = kb.nextInt();
                int r = kb.nextInt();
                int sum = k;
                for (int i = 0; i < n - 1; i++) {
                    sum += (Math.pow(r, i + 1) * k);
                }
                if (sum <= s) {
                    System.out.println("POSSIBLE " + (s - sum));
                    res += (s - sum);
                } else {
                    System.out.println("IMPOSSIBLE " + (sum - s));
                    res += (s - sum);
                }

            }
            if (res >= 0) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } catch (Exception e) {
            return;
        }
    }
}
