import java.util.Scanner;

public class Temperature {
    void myMethod() {
        int c, f, k;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter temperature (in Kelvin):");
        k = kb.nextInt();
        c = k - 273;
        f = ((9 * c) + 160) / 5;
        System.out.println("Temperature in Celsius= " + c);
        System.out.println("Temperatre in Farenheit= " + f);
    }
}
