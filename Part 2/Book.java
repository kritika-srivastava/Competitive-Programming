import java.util.Scanner;

public class Book {

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter:");
        int n = kb.nextInt();
        int p = kb.nextInt();
        if (((n >= 1) && (n <= 100000)) && ((p >= 1) && (p <= n))) {
            if (p == n) {
                System.out.println(0);
            } else if (p <= n / 2) {
                int k = p / 2;
                System.out.println(k);
            } else if ((p > n / 2) && (n % 2 == 0)) {
                int k = (n - p - 1) / 2 + 1;
                System.out.println(k);
            } else if ((p > n / 2) && (n % 2 != 0)) {
                int k = (n - p - 1) / 2;
                System.out.println(k);
            }

        }
    }
}
