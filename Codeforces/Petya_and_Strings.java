
/**
 * /mnt/e/#Fod Do/Codeforces/Petya_and_Strings.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Link - https://codeforces.com/problemset/problem/112/A
 */
import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine().toLowerCase();
        String b = kb.nextLine().toLowerCase();
        int m = a.compareTo(b);
        if (m < 0) {
            System.out.println(-1);
        } else if (m > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
