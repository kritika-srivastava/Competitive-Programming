
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Slution {

    public static void main(String Args[]) throws IOException {
        System.out.println("dg");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader kb = new BufferedReader(r);
        int n = Integer.parseInt(kb.readLine());

        if ((n >= 1) && (n <= 1000000)) {
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (kb.readLine());
                ;

            }
            int k = 0;
            String x = "U", y = "D";
            for (int i = 0; i < n - 1; i++) {
                if ((arr[i].equals(y) == true) && (arr[i + 1].equals(x) == true)) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}
