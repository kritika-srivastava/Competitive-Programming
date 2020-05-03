import java.util.Scanner;

public class Sorting {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[2][2];
        int c[] = new int[4];
        int l = 0;
        System.out.println("Enter the first matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[l] = a[i][j];
                l++;
            }
        }
        for (int i = 0; i < 4; i++) {
            int t;
            for (int j = 1; j < 4; j++) {
                if (c[j - 1] > c[j]) {
                    t = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = t;
                }
            }
        }
        l = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = c[l];
                l++;
            }
        }
        System.out.println("Completely sorted array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
