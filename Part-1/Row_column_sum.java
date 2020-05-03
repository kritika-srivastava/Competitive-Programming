import java.util.Scanner;

public class Row_column_sum {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter the first matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        System.out.println("Sum of array elements column-wise:");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " column elements:" + sum);
        }
        System.out.println("Sum of array elements row-wise:");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of " + (j + 1) + " row elements:" + sum);
        }
    }
}
