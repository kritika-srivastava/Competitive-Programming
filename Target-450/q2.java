
/**
 * C:\Users\kriti\Desktop\Target 450\q1.java
 * @author Kritika Srivastava
 * @since November 09, 2020
 *
 * Find the maximum and minimum element in an array
 * Link : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        while (t-- > 0) {
            String s = kb.nextLine();
            char a[] = s.toCharArray();
            Arrays.sort(a);
            System.out.println(a[0] + " " + a[a.length - 1]);
        }
        kb.close();

    }
}