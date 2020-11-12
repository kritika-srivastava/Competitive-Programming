
/**
 * C:\Users\kriti\Desktop\Target 450\q5.java
 * @author Kritika Srivastava
 * @since November 12, 2020
 *
 * Move all the negative elements to one side of the array 
 * Link : https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
 */
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt(); // number of testcases
        while (t-- > 0) {
            int n = kb.nextInt(); // array size
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            int min = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < 0 && i > 0) {
                    int tmp = a[i];
                    for (int j = i; j > min; j--) {
                        a[j] = a[j - 1];
                    }
                    a[min] = tmp;
                    min++;

                } else {
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }
        kb.close();

    }
}
