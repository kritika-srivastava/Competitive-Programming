
/* PROGRAM 23
Write a program to enter a paragraph and print the number of tokens and sentences in paragraph.
 */
import java.util.*;
import java.io.*;

public class TextFill {
    public static void main(String args[]) throws IOException {
        int chr = 0;
        int line = 0;
        int word = 0, num = 0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a paragraph ");
        String str = ob.nextLine();
        StringReader p = new StringReader(str);
        StreamTokenizer t = new StreamTokenizer(p);
        t.whitespaceChars(0, ' ');
        t.eolIsSignificant(true);
        t.ordinaryChar('\n');
        while (t.ttype != t.TT_EOF) {
            int n = t.nextToken();
            switch (n) {
                case StreamTokenizer.TT_EOF:
                    break;
                case StreamTokenizer.TT_EOL:
                    line++;
                    break;
                case StreamTokenizer.TT_WORD:
                    word++;
                    break;
                case StreamTokenizer.TT_NUMBER:
                    num++;
                    break;
                case ' ':
                    chr++;
                    break;
                default:
                    System.out.println("enception");
            }
        }
        System.out.println("Number of tokens" + (word + num));
        System.out.println("number  of lines " + line);
    }
}