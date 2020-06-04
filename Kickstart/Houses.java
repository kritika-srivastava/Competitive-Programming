import java.util.*;
import java.util.Scanner;

class Houses {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        int j = 1;
        while (j <= t) {
            int n = kb.nextInt();
            int a[] = new int[n];
            int amt = kb.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            Arrays.sort(a);
            int k = 0;
            for (int i = 0; i < n; i++) {
                if ((amt - a[i]) >= 0) {
                    amt -= a[i];
                    k++;
                } else {
                    break;
                }
            }
            System.out.println("Case #" + j + ": " + k);
            j++;
        }
    }
}
