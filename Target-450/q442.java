
/**
 * /mnt/e/#Fod Do/Target 450/Codes/q442.java
 * @author Kritika Srivastava
 * @since March 20, 2021
 *
 * Count the number of set bits from 1 to N.
 * Link  - https://practice.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1#
 */
import java.util.*;
import java.io.*;

class Main {
    public static int countSetBits(int n) {
        int ret = 0;
        while (n > 0) {
            int i = (int) (Math.log10(n) / Math.log10(2));
            ret += Math.pow(2, i - 1) * i;
            ret += n - Math.pow(2, i) + 1;
            n -= Math.pow(2, i);
        }
        return ret;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// testcases
        int x, n;
        while (t-- > 0) {
            n = sc.nextInt();// input n
            System.out.println(countSetBits(n));// calling countSetBits() method
        }
    }
}
