/**
 * E:\#Fod Do\Codeforces\Word_Capitalization.java
 * @author Kritika Srivastava
 * @since March 21, 2021
 *
 * Link - https://codeforces.com/problemset/problem/281/A
 */
import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String ss = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(ss);
    }
}