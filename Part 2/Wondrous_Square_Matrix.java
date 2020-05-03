
/*PROGRAM 15
Write a program to enter a matrix and check if it is wondrous square matrix or not.
*/
import java.util.Scanner;

public class Wondrous_Square_Matrix {
    static boolean Prime(int aa) {
        int a = aa;
        int mid = a / 2, k = 0;
        for (int i = 2; i <= mid; i++) {
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
        System.out.println("Enter the order of matrix:");
        int m = kb.nextInt();
        int a[][] = new int[m][m];
        int k = 0;
        int s[] = new int[m * m];
        int r[] = new int[m];
        int c[] = new int[m];
        for (int i = 0; i < m; i++) {
            s[i] = 0;
        }
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] <= (m * m)) {
                    s[a[i][j] - 1] += 1;
                } else {
                    System.out.println("Invalid input.");
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (s[i] != 1) {
                System.out.println("Invalid Input.");
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                r[i] += a[i][j];
                c[i] += a[j][i];
            }
        }
        int h = ((m * (m * m + 1)) / 2);
        for (int i = 0; i < m; i++) {
            if ((r[i] == h) & (c[i] == h)) {
                k = k + 2;
            } else {
            }
        }
        if (k == (2 * m)) {
            System.out.println("Wondrous square matrix.");
        } else {
            System.out.println("Not a Wondrous square matrix.");
        }
        System.out.println("Prime numbers are as follows:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (Prime(a[i][j]) == true) {
                    System.out.println(a[i][j] + " Row =" + (i + 1) + " column = " + (j + 1));
                } else {
                }
            }
        }
    }
}