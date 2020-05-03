import java.util.Scanner;

public class Combination {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        System.out.println("Enter the first matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        System.out.println("Enter the second matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = kb.nextInt();
            }
        }
        System.out.println("combined matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}