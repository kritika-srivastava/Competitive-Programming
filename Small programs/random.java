import java.util.Scanner;

public class random {
    public static void main(String Args[]) {
        double w;
        Scanner kb = new Scanner(System.in);
        System.out.println("Emter the number:");
        w = kb.nextDouble();
        double b = Math.log(w);
        double c = Math.sqrt(w);
        double d = Math.abs(w);
        double e = Math.random();
        System.out.println(b + " " + c + " " + d + " " + e);
    }
}