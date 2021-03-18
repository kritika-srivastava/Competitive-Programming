
/**
 * /mnt/e/#Fod Do/Codeforces/Domino_piling.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 *Link - https://codeforces.com/problemset/problem/50/A
 */
import java.util.Scanner;

public class Domino_piling {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int p = m * n;
        System.out.println(p / 2);
    }
}