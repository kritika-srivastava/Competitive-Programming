
/**
 * /mnt/e/#Fod Do/Codeforces/Bit_plus_plus.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Link - https://codeforces.com/problemset/problem/282/A
 */
import java.util.Scanner;

public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = 0;
        int n = Integer.parseInt(kb.nextLine());
        while (n-- > 0) {
            String s = kb.nextLine();
            if (s.charAt(1) == '+') {
                x += 1;
            } else {
                x -= 1;
            }
        }
        System.out.println(x);
    }
}
