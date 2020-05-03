public class DDA_2 {
    public static void main(String Args[]) {
        char m[][] = { { '1', '2', '3', '4' }, { '5', '6', '7', '8' } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + ", ");
            }
            System.out.println();
        }
    }
}