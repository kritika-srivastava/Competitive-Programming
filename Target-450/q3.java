
/**
 * C:\Users\kriti\Desktop\Target 450\q1.java
 * @author Kritika Srivastava
 * @since November 09, 2020
 *
 * Find the maximum and minimum element in an array
 * Link : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt(); // number of testcases
        while (t-- > 0) {
            int n = kb.nextInt(); // array size
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            Arrays.sort(a);
            int k = kb.nextInt();
            System.out.println(a[k - 1]);
        }
        kb.close();

    }
}