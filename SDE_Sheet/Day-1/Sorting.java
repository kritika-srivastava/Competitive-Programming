
/**
 * C:\Users\kriti\Desktop\SDE Problems\Day 1\Sorting.java
 * @author Kritika Srivastava
 * @since October 26, 2020
 *
 * Sort an array of 0’s 1’s 2’s without using extra space or sorting algo
 */
import java.util.Scanner;

public class Sorting {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int low = 0, mid = 0, max = n - 1;
        while (mid <= max) {
            if (a[mid] == 0) {
                int tmp = a[low];
                a[low] = a[mid];
                a[mid] = tmp;
                low++;
                mid++;
            } else if (a[mid] == 1)

            {
                mid++;
            } else if (a[mid] == 2) {
                int tmp = a[max];
                a[max] = a[mid];
                a[mid] = tmp;
                max--;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
