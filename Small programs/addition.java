public class addition {
    public static void main(String Args[]) {
        int i, j, p, q;
        int m[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Matrix 1 is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        System.out.println("Matrix 2 is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        System.out.println("The sum of two matrices is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(m[i][j] + n[i][j] + " ");
            System.out.println();
        }
    }
}
