/**
 * /mnt/e/#Fod Do/Codeforces/Wrong_Subtraction.java
 * @author Kritika Srivastava
 * @since March 25, 2021
 *
 * Link - https://codeforces.com/problemset/problem/977/A
 */
import java.util.Scanner;
public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        System.out.println(n);
    }
}
