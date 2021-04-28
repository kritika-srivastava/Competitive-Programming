/**
 * /mnt/e/#Fod Do/Codeforces/Bear_and_Big_Brother.java
 * 
 * @author Kritika Srivastava
 * @since March 25, 2021
 *
 *        Link - https://codeforces.com/problemset/problem/791/A
 */
import java.util.Scanner;
public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int k = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            k++;
        }
        System.out.println(k);
    }
}
