
/**
 * /mnt/e/#Fod Do/Codeforces/Helpful_Maths.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Link - https://codeforces.com/problemset/problem/339/A
 */
import java.util.*;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        int n = s.length() - s.length() / 2;
        int a[] = new int[n];
        int x = 0;
        for (int i = 0; i < s.length();) {
            a[x] = s.charAt(i) - (int) '0';
            x++;
            i += 2;
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + "+");
        }
        System.out.print(a[n - 1]);
    }
}
