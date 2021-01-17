
/**
 * C:\Users\kriti\Desktop\Target 450\q4.java
 * 
 * @author Kritika Srivastava
 * @since November 12, 2020
 *
 *        Given an array which consists of only 0, 1 and 2. Sort the array
 *        without using any sorting algo 
 * Link - https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
 */
import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int st = 0, mid = 0, end = n - 1;
        while (mid <= end) {
            if (a[mid] == 0) {
                int tmp = a[mid];
                a[mid] = a[st];
                a[st] = tmp;
                st++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                int tmp = a[mid];
                a[mid] = a[end];
                a[end] = tmp;
                mid++;
                end--;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
