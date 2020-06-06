import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class  designerPdfViewer{

    
    static int designerPdfViewer(int[] h, String word) {
        HashMap<Character, Integer> alphabets = new HashMap<>(); 
        for(int i=0;i<26;i++)
        {
            alphabets.put((char)(i+97),h[i]);
        }
        int pro=0;
        int a[]=new int[word.length()];
        for(int i=0;i<word.length();i++)
        {
            a[i]=alphabets.get(word.charAt(i));
        }
        Arrays.sort(a);
        int l=a.length;
        pro=(a[l-1]*l);
        return pro;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
