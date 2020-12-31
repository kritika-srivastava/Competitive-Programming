
/**
 * C:\Users\kriti\Desktop\DS\Codefores\Good bye 2020\four.java
 * @author Kritika Srivastava
 * @since December 31, 2020
 *
 * Link - https://codeforces.com/group/Mka6Tznt4j/contest/309296/problem/B
 */
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        if (n < 4) {
            System.out.println(0);
        } else {
            int k = 0;
            for (int ii = 2; ii <= n; ii++) {
                int flag = 0;
                int i = ii;
                while (i != 0) {
                    int x = i % 10;
                    if (x == 4) {
                        flag = 1;
                        break;
                    } else {
                    }
                    i /= 10;
                }
                if (flag == 1) {
                    k++;
                } else {
                }
            }
            System.out.println(k);
        }

    }
}
