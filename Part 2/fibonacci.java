
/*PROGRAM 5
 Write a program to enter a number and generate fibonacci series to that number of terms.
 */
import java.util.Scanner;

public class fibonacci {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of terms in Series:");
        int n = kb.nextInt();
        System.out.println("The series is:");
        String s0 = "a", s1 = "b";
        if (n == 0) {
        }
        if (n == 1) {
            System.out.println(s0);
        }
        if (n == 2) {
            System.out.println(s0);
            System.out.println(s1);
        } else {
            System.out.println(s0);
            System.out.println(s1);
            for (int i = 2; i < n; i++) {
                String s2 = s1.concat(s0);
                System.out.println(s2);
                s0 = s1;
                s1 = s2;
            }
        }
    }
}