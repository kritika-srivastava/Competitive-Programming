import java.util.*;
import java.math.BigInteger;

public class B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            long ret = 1;
            long n = kb.nextLong();
            for (long i = n; i >= 2; i--) {
                if (n / i < i && n % i == 0) {
                    if (BigInteger.valueOf(i).isProbablePrime(1) == true) {
                        ret = i;
                        break;
                    } else {
                    }

                } else {
                }
            }
            System.out.println(ret);
        }

    }
}
