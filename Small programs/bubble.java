import java.util.Scanner;

public class bubble {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int i, t, j;
        int m[] = new int[10];
        System.out.println("Enter ten numbers:");
        for (i = 0; i < 10; i++) {
            m[i] = kb.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (j = 1; j < 10 - i - 1; j++) {
                if (m[j - 1] > m[j]) {
                    t = m[j - 1];
                    m[j - 1] = m[j];
                    m[j] = t;
                }
            }
        }
        System.out.println("The numbers arranged in ascending order are:");
        for (i = 0; i < 10; i++) {
            System.out.println(m[i]);
        }
    }
}
