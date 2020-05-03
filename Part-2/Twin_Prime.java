
/*PROGRAM 8
 Write a program to enter a number and enter the first twin prime pair after it.
 */
import java.util.Scanner;

public class Twin_Prime {
    static boolean Prime(int aa) {
        int a = aa, k = 0, mid = a / 2;
        for (int i = 2; i <= mid; i++) {
            if (a % i == 0) {
                k++;
            }
        }
        if (k == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = kb.nextInt();
        int i = n;
        int l = 0;
        do {
            if ((i != 1) & (Prime(i) == true) & (Prime(i + 2) == true)) {
                System.out.println("Twin Prime numbers are " + i + " and " + (i + 2));
                l = 1;
                break;
            } else {
                i++;
            }
        } while (l == 0);
    }
}
