import java.util.*;
import java.lang.*;
import java.io.*;
class Bleak
 {
	public static void main (String[] args)
{	 Scanner kb = new Scanner(System.in);
        long t = kb.nextLong();
        while (t-- > 0) {
            long n = kb.nextLong();
            long m = n, x = 1;
            while (m >= 1) {
                if ((m + Set(binary(m))) == n) {
                    x = 0;
                } else {
                }
                m--;
            }
            System.out.println(x);
        }
    }

    static long binary(long n) {
        long k = 0;
        while (n != 0) {
            k *= 10;
            k += (n % 2);
            n /= 2;
        }
        return k;
    }

    static long Set(long n) {
        long k = 0;
        while (n != 0) {
            if (n % 10 == 1) {
                k++;
            } else {
            }
            n /= 10;
        }
        return k;
    }
}
