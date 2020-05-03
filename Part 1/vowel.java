import java.util.Scanner;

public class vowel {
    public static void main(String Args[]) {
        int k = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String a = kb.nextLine();
        int l = a.length();
        if (a.charAt(0) == 'a' | a.charAt(0) == 'e' | a.charAt(0) == 'i' | a.charAt(0) == 'o' | a.charAt(0) == 'u') {
            k++;
        }
        for (int i = 0; i < l - 1; i++) {
            if (a.charAt(i) == ' ') {
                if (a.charAt(i + 1) == 'a' | a.charAt(i + 1) == 'e' | a.charAt(i + 1) == 'i' | a.charAt(i + 1) == 'o'
                        | a.charAt(i + 1) == 'u') {
                    k++;
                }
            } else {
            }
        }
        System.out.println("Frequency:" + k);
    }
}