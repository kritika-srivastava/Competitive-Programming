
import java.util.Scanner;

/**
 * E:\GithubProjects\Competitive-Programming\CSES\MissingNumber.java
 * 
 * @author Kritika Srivastava
 * @since December 14, 2024
 *
 *        URL: https://cses.fi/problemset/task/1083
 */
public class MissingNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long n = kb.nextLong();
        long sum = n * (n + 1) / 2;

        while (n-- > 1) {
            sum -= kb.nextLong();
        }

        System.out.println(sum);
        kb.close();

    }
}
