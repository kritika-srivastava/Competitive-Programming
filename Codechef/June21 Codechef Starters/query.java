/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class query {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        long a[] = new long[n];
        int q = kb.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextLong();
        }
        while (q-- > 0) {

            int k = kb.nextInt();
            if (k == 1) {
                int l = kb.nextInt();
                int r = kb.nextInt();
                long x = kb.nextLong();

                for (int i = l - 1; i < r; i++) {
                    a[i] += (x + i + 1 - l) * (x + i + 1 - l);
                }
            } else {
                int kk = kb.nextInt() - 1;
                System.out.println(a[kk]);
            }
        }
    }
}
