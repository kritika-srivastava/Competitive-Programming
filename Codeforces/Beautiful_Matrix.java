
/**
 * /mnt/e/#Fod Do/Codeforces/Beautiful_Matrix.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Link - https://codeforces.com/problemset/problem/263/A
 */
import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a[][] = new int[5][5];
        int row = -1, col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = kb.nextInt();
                if (a[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        int moves = Math.abs(3 - row) + Math.abs(3 - col);
        System.out.println(moves);
    }
}
