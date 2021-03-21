
/**
 * E:\#Fod Do\Codeforces\Stones_on_the_Table.java
 * @author Kritika Srivastava
 * @since March 21, 2021
 *
 * Link - https://codeforces.com/problemset/problem/266/A
 */
import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String s = kb.nextLine();
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                k++;
            } else {
            }
        }
        System.out.println(k);
    }
}
