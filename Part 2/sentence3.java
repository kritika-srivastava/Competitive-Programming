
/*PROGRAM 11
 Write a program to enter a sentence and a word and find the frequency of that word in the sentence.
 */
import java.util.Scanner;
import java.util.*;

public class sentence3 {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = kb.nextLine();
        System.out.println("Enter the word to find frequency of: ");
        String t = kb.nextLine();
        int f = 0;
        StringTokenizer st = new StringTokenizer(s);
        int m = st.countTokens();
        String k[] = new String[m];
        for (int i = 0; i < m; i++) {
            k[i] = st.nextToken();
            k[i] = k[i].trim();
            if (k[i].equals(t) == true) {
                f++;
            } else {
            }
        }
        System.out.println("Frequency of " + t + " in sentence is " + f);
    }
}