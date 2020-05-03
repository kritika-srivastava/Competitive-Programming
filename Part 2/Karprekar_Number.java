
/*PROGRAM 4
Write a program to enter two numbers m and n(m<n) and print karprekar numbers between them.
 */
import java.util.Scanner;

public class Karprekar_Number {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int m = kb.nextInt();
        int n = kb.nextInt();
        int f = 0;
        if (m < n) {
            System.out.println("Karprekar numbers are as follows:");
            for (int i = m; i <= n; i++) {
                int p = (i * i);
                int q = p, a = 0;
                while (q != 0) {
                    q /= 10;
                    a++;
                }
                if (a % 2 == 0) {
                    int mid = a / 2;
                    int b = mid;
                    int x = 1;
                    while (b >= 1) {
                        x *= 10;
                        b--;
                    }
                    int c = p / x;
                    int d = p % x;
                    int sum = c + d;
                    if (sum == i) {
                        System.out.println(i);
                        f++;
                    } else {
                    }
                } else {
                }
            }
        } else {
            System.out.println("Invalid input.");
        }
        System.out.println("Frequency = " + f);
    }
}