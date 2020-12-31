
/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\bundle.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/group/Mka6Tznt4j/contest/309296/problem/C
 */
import java.util.Scanner;
import java.util.*;

public class bundle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            System.out.println(lcm(n, m) / n);
        }

    }

    static long gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static long lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
