import java.util.Scanner;

public class Column_Sort {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int a[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter column Number:");
        int c = kb.nextInt();
        c -= 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= m - i - 1; j++) {
                if (a[j - 1][c] > a[j][c]) {
                    for (int k = 0; k < m; k++) {
                        int tmp = a[j - 1][k];
                        a[j - 1][k] = a[j][k];
                        a[j][k] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        kb.close();
    }
}