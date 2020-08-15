import java.util.Scanner;

public class Contiguous_Subarray {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int k = kb.nextInt();
        int[][] a = new int[N - k + 1][k];
        int A[] = new int[N];
        for (int j = 0; j < N; j++) {
            A[j] = kb.nextInt();
        }
        for (int i = 0; i < N - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = A[j + i];
            }
        }
        int m = 0, n = 101;
        for (int i = 0; i < N - k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[i][j] < a[i + 1][j]) {
                    if (j < n) {
                        m = i + 1;
                    } else {
                    }
                    break;
                } else if (a[i][j] > a[i + 1][j]) {
                    if (j < n) {
                        m = i;
                    } else {
                    }
                    break;
                } else {
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(a[m][i]);
        }
        kb.close();
    }
}
