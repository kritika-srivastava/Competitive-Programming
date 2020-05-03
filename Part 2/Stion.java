import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Stion {

    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        System.out.println("vdg");
        int b = kb.nextInt();
        int n = kb.nextInt();
        int m = kb.nextInt();
        if (((m >= 1) && (m <= 1000)) && ((n >= 1) && (n <= 1000)) && ((b >= 1) && (b < 1000000))) {
            int key[] = new int[n];
            for (int i = 0; i < n; i++) {
                key[i] = kb.nextInt();
            }
            int dr[] = new int[m];
            for (int i = 0; i < m; i++) {
                dr[i] = kb.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (key[j] > key[j + 1]) {
                        int tmp = key[j];
                        key[j] = key[j + 1];
                        key[j + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Key " + key[i]);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (dr[j] > dr[j + 1]) {
                        int tmp = dr[j];
                        dr[j] = dr[j + 1];
                        dr[j + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                System.out.println("dr " + dr[i]);
            }
            int k = -1, sum = 0;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if ((key[i] + dr[j]) <= b) {
                        k++;
                        sum = key[i] + dr[j];
                        System.out.println("Key " + key[i] + "Dr " + dr[j]);
                        break;
                    } else {
                    }
                }

                if (k != -1) {
                    break;
                } else {
                }
            }
            if (k != -1) {
                System.out.println(sum);
            } else {
                System.out.println(k);
            }
        }
    }
}
