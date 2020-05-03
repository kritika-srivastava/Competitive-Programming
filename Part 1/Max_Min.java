import java.util.Scanner;

public class Max_Min {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        int min = a[0][0];
        int max = a[0][0];
        int h = 0, k = 0, l = 0, p = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    h = i;
                    k = j;
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                    l = i;
                    p = j;
                }
            }
        }
        System.out
                .println("The maximum element is " + a[h][k] + " present in row " + (h + 1) + " and column " + (k + 1));
        System.out
                .println("The minimum element is " + a[l][p] + " present in row " + (l + 1) + " and column " + (p + 1));
    }
}