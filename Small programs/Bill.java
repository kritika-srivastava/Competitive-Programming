import java.util.Scanner;

public class Bill {
    void myMethod() {
        float f, g, u;
        f = 150;
        g = 98;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the units consumed:");
        u = kb.nextFloat();
        if ((0 <= u) & (u <= 99)) {
            System.out.println("Money payble is:" + (u * 0.8 + f + g) + "Rs");
        }
        if ((100 <= u) & (u <= 199)) {
            System.out.println("Money payble is:" + (u * 1 + f + g) + "Rs");
        }
        if (u >= 200) {
            System.out.println("Money payble is:" + (u * 1.25 + f + g) + "Rs");
        }
    }
}
