
/*PROGRAM 17
Write a program to enter a string and print the string in lower as well as upper case.
Also convert the string to piglatin form.
 */
import java.util.Scanner;

public class string_s {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = kb.nextLine();
        int a = s.length();
        for (int i = 0; i < a; i++) {
            System.out.println(s.charAt(i) + "\tPosition = \t" + (i + 1));
        }
        s = s.toLowerCase();
        System.out.println("String to lower case = " + s);
        s = s.toUpperCase();
        System.out.println("String to upper case = " + s);
        for (int i = 0; i < a; i++) {
            if ((s.charAt(i) == 'A') | (s.charAt(i) == 'E') | (s.charAt(i) == 'I') | (s.charAt(i) == 'O')
                    | (s.charAt(i) == 'U')) {
                System.out.println("String to piglatin :" + s.substring(i) + s.substring(0, i) + "AY");
                break;
            } else {
            }
        }
    }
}