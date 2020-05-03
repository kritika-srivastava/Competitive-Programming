
/*PROGRAM 12
 Write a program to enter a matrix and perform the following functions:
 1.Enter the values and sort the non-boundary elements.
 2.Calculate the sum of odd numbers of both the diagonals.
 3.Display the sorted matrix along with upper and lower triangular elements. 
 */
import java.util.Scanner;

public class matrix {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the order of matrix:");
        int m = kb.nextInt();
        if ((m > 3) & (m < 10)) {
            int a[][] = new int[m][m];
            int f = 0;
            int sum1 = 0, sum2 = 0;
            int k = (m - 2) * (m - 2);
            int b[] = new int[k];
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
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    b[f] = a[i][j];
                    f++;
                }
            }
            for (int i = 0; i < k; i++) {
                for (int j = 1; j < k; j++) {
                    if (b[j] < b[j - 1]) {
                        int tmp = b[j];
                        b[j] = b[j - 1];
                        b[j - 1] = tmp;
                    }
                }
            }
            f = 0;
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    a[i][j] = b[f];
                    f++;
                }
            }
            System.out.println("The rearranged matrix is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i == j) & (a[i][j] % 2 != 0)) {
                        sum1 += a[i][j];
                    }
                    if (((i + j) == m - 1) & (a[i][j] % 2 != 0)) {
                        sum2 += a[i][j];
                    }
                }
            }
            System.out.println("Sum of odd left diagonal elements is " + sum1);
            System.out.println("Sum of odd right diagonal elements is " + sum2);
            System.out.println("Upper triangular elements:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i < j) {
                        System.out.print(a[i][j] + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
            System.out.println("Lower triangular elements:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i > j) {
                        System.out.print(a[i][j] + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input");
            System.out.println("Enter the order of matrix between 3 and 10.");
        }
    }
}