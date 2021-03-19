
/**
 * /mnt/e/#Fod Do/Target 450/Codes/q443.java
 * @author Kritika Srivastava
 * @since March 20, 2021
 *
 * Check if a numbe ris the power of 2
 * Link - https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1#
 */
import java.io.*;

class Driver_class {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());// testcases

        while (t-- > 0) {
            // input a number n
            long n = Long.parseLong(read.readLine());
            if (isPowerofTwo(n) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean isPowerofTwo(long N) {

        long m = (long) (Math.log10(N) / Math.log10(2));
        double n = Math.log10(N) / Math.log10(2);
        if (n - m == 0) {
            return true;
        } else {
        }
        return false;
    }
}
