public class transpose {
    public static void main(String Args[]) {
        int i, j;
        int m[][] = { { 0, 1 }, { 1, 0 } };
        int n[][] = new int[2][2];
        System.out.println("The matrix is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                m[i][j] = m[j][i];
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
