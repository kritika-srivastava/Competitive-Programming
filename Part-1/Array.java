import java.util.Scanner;

public class Array {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter ten elements");
        for (int i = 0; i < 10; i++) {
            a[i] = kb.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < 10; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
