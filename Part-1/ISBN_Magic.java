import java.util.Scanner;

public class ISBN_Magic {
    void ISBN() {
        long sum = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the ISBN code:");
        long a = kb.nextLong();
        for (int i = 1; i <= 10; i++) {
            long b = 10;
            long c = 1;
            long d = a % b;
            long e = d * c;
            sum += e;
            c += 1;
            a = a / 10;
        }
        if (sum % 11 == 0)
            System.out.println("A valid ISBN.");
        else
            System.out.println("Not a valid ISBN.");
    }

    void Magic() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = kb.nextInt();
        int sum = 0, num = n;
        while (num > 9) {
            sum = num;
            int s = 0;
            while (sum != 0) {
                s = s + (sum % 10);
                sum = sum / 10;
                num = s;
            }
        }
        if (num == 1) {
            System.out.println(n + " is a magic number.");
        } else {
            System.out.println(n + " is not a magic number");
        }
    }
}
