/**
 * /mnt/e/#Fod Do/Codeforces/Boy_or_Girl.java
 * @author Kritika Srivastava
 * @since March 21, 2021
 *
 * Link - https://codeforces.com/problemset/problem/236/A
 */
import java.util.*;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int k = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                k++;
            } else {
            }
        }
        if (k % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}