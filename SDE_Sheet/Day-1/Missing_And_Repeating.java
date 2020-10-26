
/**
 * C:\Users\kriti\Desktop\SDE Problems\Day 1\Missing_And_Repeating.java
 * @author Kritika Srivastava
 * @since October 26, 2020
 *
 * Given an unsorted array of size n. Array elements are in the range from 1 to n. 
 * One number from set {1, 2, …n} is missing and one number occurs twice in the array. 
 * Find these two numbers.
 */
import java.util.*;

public class Missing_And_Repeating {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int miss = 0, rep = 0;
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] == 0) {
                rep = a[i];
            } else if (a[i] - a[i - 1] > 1) {
                miss = a[i] - 1;
            } else {
            }
        }
        System.out.println("Missing = " + miss);
        System.out.println("Repeating = " + rep);

    }
}
