
/*PROGRAM 3
Write a program to enter two numbers m and n(m<n) and print prime palindrome numbers between them(inclusive).
*/
import java.util.Scanner;

public class Prime_Palindrome {
    static boolean Prime(int aa) {
        int a = aa;
        int mid = a / 2, k = 0;
        for (int i = 2; i < mid; i++) {
            if (a % i == 0) {
                k++;
            } else {
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
        System.out.println("Enter the numbers:");
        int m = kb.nextInt();
        int n = kb.nextInt();
        int f = 0;
        System.out.println("Prime palindrome numbers are as follows;");
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (Prime(i) == true) {
                    int j = 0, l = i;
                    while (l != 0) {
                        int k = l % 10;
                        j = (j * 10) + k;
                        l /= 10;
                    }
                    if (i == j) {
                        System.out.println(i);
                        f++;
                    } else {
                    }
                }
            }
        } else {
            System.out.println("Invalid input.");
        }
        System.out.println("frequency = " + f);
    }
}
