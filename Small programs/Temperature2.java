import java.util.Scanner;

public class Temperature2 {
    void myMethod() {
        int a, number;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter  the  temperature");
        a = kb.nextInt();
        System.out.println("Press 1 for temperature in celsius or 2 for Farenheit");
        number = kb.nextInt();
        switch (number) {
            case 1:
                System.out.println("Temperature in celsius=" + (a - 273));
                break;
            case 2:
                System.out.println("Temperature in Farenheit =" + (9 * (a) + 160 / 5));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
