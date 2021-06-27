import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int even = 0, odd = 0;
        while (n > 0) {
            int x = n % 10;
            if (x % 2 == 0) {
                even += x;
            } else {
                odd += x;
            }
            n /= 10;
        }
        System.out.println(even + " " + odd);
    }
}