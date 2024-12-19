
import java.util.Scanner;

/**
 * E:\GithubProjects\Competitive-Programming\CSES\RemovingDigits.java
 * 
 * @author Kritika Srivastava
 * @since December 15, 2024
 *
 *        URL: https://cses.fi/problemset/task/1637
 */
public class RemovingDigits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int count=0;
        while (n != 0) {
            int nn = n, max = 0;
            while (nn != 0) {
                int temp = nn % 10;
                nn /= 10;
                if (temp <= n) {
                    max = Math.max(max, temp);
                }
            }
            n -= max;
            count++;
        }

        System.out.println(count);
    }
}
