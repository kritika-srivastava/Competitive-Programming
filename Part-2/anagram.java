
/*PROGRAM 6
 Write a program to enter a word and generate anagrams of the word.
 */
import java.util.Scanner;

public class anagram {
    String a = " ";
    static int f = 0;

    void make_anagram(String prefix, String a) {
        if (a.length() <= 1) {
            System.out.println(prefix + a);
            f++;
        } else {
            for (int i = 0; i < a.length(); i++) {
                String cur = a.substring(i, i + 1);
                String before = a.substring(0, i);
                String after = a.substring(i + 1);
                make_anagram(prefix + cur, before + after);
            }
        }
    }

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        anagram ob = new anagram();
        System.out.println("Enter the string;");
        String a = kb.nextLine();
        String b = " ";
        ob.make_anagram(b, a);
        System.out.println("Frequency = " + f);
    }
}