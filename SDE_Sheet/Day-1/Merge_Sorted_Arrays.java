
/**
 * C:\Users\kriti\Desktop\SDE Problems\Day 1\Merge_Sorted_Arrays.java
 * @author Kritika Srivastava
 * @since October 26, 2020
 *
 * Merge two sorted Arrays without extra space
 */
import java.util.Scanner;

public class Merge_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        // Algo 1 - Bruteforce (Printing values in order)
        merge_bruteforce(a, b);
        // Algo 2 - Using insertion sort (Inplace sorting with space complexity O(1))
        merge_insertion(a, b);
        kb.close();
    }

    static void merge_bruteforce(int a[], int b[]) {

        if (a.length < b.length) {
            int lb = 0;
            for (int i = 0; i < a.length;) {
                if (a[i] <= b[lb]) {
                    System.out.print(a[i] + " ");
                    i++;
                } else {
                    System.out.print(b[lb] + " ");
                    lb++;
                }
            }
            for (int i = lb + 1; i < b.length; i++) {
                System.out.print(b[i] + " ");
                i++;
            }
            System.out.println();
        } else {
            int la = 0;
            for (int i = 0; i < b.length;) {
                if (b[i] <= a[la]) {
                    System.out.print(b[i] + " ");
                    i++;
                } else {
                    System.out.print(a[la] + " ");
                    la++;
                }
            }
            for (int i = la + 1; i < a.length; i++) {
                System.out.print(a[i] + " ");
                i++;
            }
            System.out.println();
        }
    }

    static void merge_insertion(int a[], int b[]) {

        if (a.length < b.length) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] > a[0]) {
                    int tmp = b[i];
                    b[i] = a[0];
                    a[0] = tmp;
                    System.out.print(b[i] + " ");
                    insertion_Sort(a);
                } else {
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > b[0]) {
                    int tmp = a[i];
                    a[i] = b[0];
                    b[0] = tmp;
                    System.out.print(a[i] + " ");
                    insertion_Sort(b);
                } else {
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
        }

    }

    static void insertion_Sort(int x[]) {
        for (int i = 1; i < x.length; i++) {
            int tmp = x[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (x[j] > x[i]) {
                    x[j + 1] = x[j];
                } else {
                    break;
                }
                x[j] = tmp;
            }
        }
    }

}
