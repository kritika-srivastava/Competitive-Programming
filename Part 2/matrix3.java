
/*PROGRAM 14
Write a program to enter a matrix and find if it is symmetric or not.
*/
import java.util.Scanner;

public class matrix3 {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the order of matrix:");
        int m = kb.nextInt();
        int n = kb.nextInt();
        if (m == n) {
            int a[][] = new int[m][m];
            int k = 0;
            int s[][] = new int[m][m];
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
                    s[j][i] = a[i][j];
                }
            }
            System.out.println("The transpose matrix is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(s[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (s[i][j] == a[i][j]) {
                        k++;
                    } else {
                    }
                }
            }
            if (k == (m * m))
                System.out.println("Symmetric matrix.");
            else
                System.out.println("Asymmetric matrix.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
