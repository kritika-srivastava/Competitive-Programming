import java.util.Scanner;

public class transpose {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[2][3];
        int b[][] = new int[3][2];
        System.out.println("Enter the first matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
