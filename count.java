import java.util.*;
public class count {
    static int GetPairsCount(int N, int[] A) {
        int ret = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (!isPrime(gcd(A[i], A[j]))) {
                    ret++;
                    ret %= (int) Math.pow(10, 9) + 7;
                }}}
        return ret;
    }
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqrtN = (int) Math.sqrt(n) + 1;
        for (int i = 6; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N = scan.nextInt();
        int[] A = new int[N];
        for (int j = 0; j < N; j++) {
            A[j] = scan.nextInt();
        }
        int result = GetPairsCount(N, A);
        System.out.println(result);
    }
}
