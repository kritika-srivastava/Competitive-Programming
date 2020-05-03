
/*PROGRAM 7
 Write a program to enter a denomination and print it as the sum of standard currency notes.
 */
import java.util.Scanner;

public class Bank {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the denomination: ");
        int n = kb.nextInt();
        int a[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int b[] = new int[9];
        int f = 0;
        for (int i = 0; i < 9; i++) {
            b[i] = n / a[i];
            n = n % a[i];
            f += b[i];
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 9 - i - 1; j++) {
                int tmp = 0;
                if (b[j] > b[j - 1]) {
                    tmp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = tmp;
                    int tm = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tm;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(a[i] + " Rs notes = " + b[i]);
        }
        System.out.println();
        System.out.println("Frequency = " + f);
    }
}