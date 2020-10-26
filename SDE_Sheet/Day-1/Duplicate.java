
/**
 * C:\Users\kriti\Desktop\SDE Problems\Day 1\Duplicate.java
 * @author Kritika Srivastava
 * @since October 24, 2020
 *
 * Find the duplicate in an array of N+1 integers.
 * There is only one duplicate number but it could be repeated more than once.
 */
import java.util.Scanner;
import java.util.*;

public class Duplicate {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
                break;
            }
        }

    }
}
