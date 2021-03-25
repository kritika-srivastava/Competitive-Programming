
/**
 * /mnt/e/#Fod Do/Codeforces/Soldier_and_Bananas.java
 * 
 * @author Kritika Srivastava
 * @since March 25, 2021
 *
 *        Link - https://codeforces.com/problemset/problem/546/A
 */
import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int n = kb.nextInt();
        int w = kb.nextInt();
        // total money reqd = 1k+2k+3k+.......nk
        // money to be borrowed =total - money soldier already has
        long out = (w * (w + 1) / 2) * k - n;
        /*
         * incase soldier has more money than required then out will come out to be
         * negative
         */
        if (out >= 0) {
            System.out.println(out);
        } else {
            System.out.println(0);
        }

    }
}
