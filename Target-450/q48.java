/**
 * E:\#Fod Do\Target 450\Codes\q48.java
 * @author Kritika Srivastava
 * @since March 23, 2021
 *
 * Check if string is palindrome or not.
 * Link - https://practice.geeksforgeeks.org/problems/palindrome-string0817/1#
 */
import java.io.*;

class q48 {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            System.out.println(isPlaindrome(S));
        }
    }

    static int isPlaindrome(String S) {
        String s = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            s += S.charAt(i);
        }
        if (s.equals(S) == true) {
            return 1;
        }
        return 0;
    }
}
