
/**
 * C:\Users\kriti\Desktop\Target 450\q1.java
 * @author Kritika Srivastava
 * @since November 09, 2020
 *
 * Reverse the Array or String
 * Link : https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        while (t-- > 0) {
            String s = kb.nextLine();
            char a[] = s.toCharArray();
            int n = a.length;
            for (int i = 0; i < n / 2; i++) {
                char tmp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = tmp;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }
        kb.close();

    }
}