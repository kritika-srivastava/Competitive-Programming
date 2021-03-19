
/**
 * E:\#Fod Do\Target 450\Codes\q439.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Count the number of set bits
 * Link - https://practice.geeksforgeeks.org/problems/set-bits0143/1#
 */
import java.io.*;
import java.util.*;

class q439 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int cnt = setBits(N);
            System.out.println(cnt);
        }
    }

    static int setBits(int N) {
        String m = Integer.toBinaryString(N);
        int ret = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == '1') {
                ret++;
            } else {
            }
        }
        return ret;
    }
}
