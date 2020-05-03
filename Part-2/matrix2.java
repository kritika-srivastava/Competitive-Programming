
/*PROGRAM 13
Write a program to enter a matrix and perform the following functions:
1.Print the matrix and its mirror-image.
2.Rotate the matrix 90 degree.
3.Print the sum of each row of matrix. 
 */
import java.util.Scanner;

public class matrix2 {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int m = 3;
        int s[] = new int[m];
        int a[][] = new int[m][m];
        int f = 0;
        int sum1 = 0, sum2 = 0;
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = kb.nextInt();
                s[i] += a[i][j];
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The mirFror image is:");
        for (int i = 0; i < m; i++) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The matrix rotated 90 degree clockwise is:");
        for (int i = 0; i < m; i++) {
            for (int j = (m - 1); j >= 0; j--) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            System.out.println("Sum 0f row " + (i + 1) + " elements = " + s[i]);
        }
    }
}