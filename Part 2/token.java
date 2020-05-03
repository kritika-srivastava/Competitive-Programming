
/* PROGRAM 22
Write a program to enter a string and print the number of characters,words and sentences. 
 */
import java.util.*;
import java.util.Scanner;

class token {
    static void main() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Sentence ");
        String a = ob.nextLine();
        int l = a.length();
        StringTokenizer sen = new StringTokenizer(a, ".");
        int sentence = sen.countTokens();
        a = a.substring(0, l - 1);
        StringTokenizer words = new StringTokenizer(a);
        int word = (words.countTokens()) + sentence - 1;
        int ch = 0;
        for (int i = 0; i < l - 1; i++)
            if (Character.isLetter(a.charAt(i))) {
                ch++;
            }
        System.out.println("Number of characters : " + ch);
        System.out.println("Number of words : " + word);
        System.out.println("Number of sentences :" + sentence);
    }
}