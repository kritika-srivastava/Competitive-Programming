
/*PROGRAM 18
A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. Design a program to accept the number of boxes to be packed (N) by the user (maximum up to 1000 boxes) and display the break-up of the cartons used in descending order of capacity (i.e. preference should be given to the highest capacity available, and if boxes left are less than 6, an extra carton of capacity 6 should be used.)
Test your program with the following data and some random data
*/
import java.util.Scanner;

public class cartons {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int c[] = { 48, 24, 12, 6 };
        int d[] = new int[4];
        int sum = 0, i = 0;
        System.out.println("Enter the number of boxes:");
        int N = kb.nextInt();
        int p = N;
        if (N <= 4000) {
            while (p >= 6) {
                int q = p / c[i];
                sum += q;
                System.out.println(c[i] + " * " + q + " = " + (c[i] * q));
                p = p - (q * c[i]);
                i++;
            }
            System.out.println("Remaining Boxes =\t" + p + " * " + 1 + " = " + p);
            if (p != 0) {
                sum += 1;
            } else {
            }
            System.out.println("Total number of boxes = " + N);
            System.out.println("Total number of cartons = " + sum);
        } else {
            System.out.println("INVALID INPUT.");
        }
    }
}
