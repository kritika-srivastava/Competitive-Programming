import java.util.Scanner;

public class Prime {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = kb.nextInt();
        int n = 2, lim = a / 2;
        for (n = 2; n <= lim; n++) {
            if (a % n == 0)
                break;
        }
        if (n > lim)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
    }
}