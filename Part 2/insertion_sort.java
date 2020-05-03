
/*Program 16
Write a program to implement insertion sort.
 */
import java.util.Scanner;

public class insertion_sort {
    public static void main() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = kb.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        ins_Sort(array, n);
        System.out.println("Sorted array :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    static void ins_Sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            int b = arr[i];
            while (j > 0 && arr[j - 1] > b) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = b;
        }
    }
}