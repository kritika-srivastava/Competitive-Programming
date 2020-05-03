import java.util.Scanner;

public class the {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String a = kb.nextLine();
        int n = a.length();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == 't' && a.charAt(i + 1) == 'h' && a.charAt(i + 2) == 'e') {
                k++;
            }
            if (a.charAt(i) == ' ') {
            } else {
            }
        }
        System.out.println("The frequency of occurrence of the in this line is " + k);
    }
}
