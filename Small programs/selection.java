import java.util.Scanner;

public class selection {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int i, t, min, j;
        int m[] = new int[10];
        System.out.println("Enter ten numbers:");
        for (i = 0; i < 10; i++) {
            m[i] = kb.nextInt();
        }
        for (i = 0; i < 10; i++) {
            min = i;
            for (j = i + 1; j < 10; j++) {
                if (m[j] < m[min])
                    min = j;
            }
            t = m[i];
            m[i] = m[min];
            m[min] = t;
        }
        System.out.println("The numbers arranged in ascending order are:");
        for (i = 0; i < 10; i++) {
            System.out.println(m[i]);
        }
    }
}
