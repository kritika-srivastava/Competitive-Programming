
/**
 * C:\Users\kriti\Desktop\DS\Target 450\q90.java
 * @author Kritika Srivastava
 * @since January 17, 2021
 *
 * First and last occurence of an element in a sorted array
 * Link - https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0#
 */
import java.util.*;

class q90 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int elem = kb.nextInt();
            int a[] = new int[n];
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
                if (a[i] == elem) {
                    if (first == -1) {
                        first = i;
                    } else {
                    }

                    last = i;
                }
            }
            if (first == -1) {
                System.out.println(first);
            } else {
                System.out.println(first + " " + last);
            }

        }
    }
}