public class Program {
    public static void main(String Args[]) {
        int i, j, s;
        s = 0;
        int m[][] = { { 3, 4, 5, 6 }, { 7, 8, 9, 10 }, { 11, 12, 13, 14 } };
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                s = s + m[i][j];
            }
        }
        System.out.println("The output is " + s);
    }
}
