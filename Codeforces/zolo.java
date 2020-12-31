/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\zolo.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/group/Mka6Tznt4j/contest/309296/problem/A
 */
import java.util.Scanner;

public class zolo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        if (n >= 1) {
            System.out.println(n + 10);
        } else {
            System.out.println(n - 10);
        }
    }
}
