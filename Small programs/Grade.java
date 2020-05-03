import java.util.Scanner;

public class Grade {
    void myMethod() {
        int G;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the marks:");
        G = kb.nextInt();
        if ((90 <= G) & (G <= 100)) {
            System.out.println("Grade A+");
        }
        if ((80 <= G) & (G < 89)) {
            System.out.println("Grade A");
        }
        if ((70 <= G) & (G <= 79)) {
            System.out.println("Grade B+");
        }
        if ((60 <= G) & (G <= 69)) {
            System.out.println("Grade B");
        }
        if ((50 <= G) & (G <= 59)) {
            System.out.println("Grade C");
        }
        if ((40 <= G) & (G <= 49)) {
            System.out.println("Grade D");
        }
        if ((00 <= G) & (G <= 39)) {
            System.out.println("Grade E");
        }
    }
}
