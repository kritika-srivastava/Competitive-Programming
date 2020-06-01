/* package codechef; // don't place package name! */
/* 
Lapindrome is defined as a string which when split in the middle, gives two halves having the same 
characters and same frequency of each character. If there are odd number of characters in the string,
we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the
two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a
few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same 
characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.
*/

import java.util.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Lapindrome {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = kb.nextInt();
            while (t-- > 0) {
                String s = kb.next();
                int l = s.length(), k = 0;
                String p = "", q = "";
                if (l % 2 == 0) {
                    p = s.substring(0, (l / 2));
                    q = s.substring((l / 2), l);

                } else {
                    p = s.substring(0, (l / 2) + 1);
                    q = s.substring((l / 2), l);

                }
                for (int i = 0; i < p.length(); i++) {

                    if (q.indexOf(p.charAt(i)) != -1) {
                        int m = q.indexOf(p.charAt(i));
                        k++;
                        String rep=Character.toString(q.charAt(m));
                        q = q.replaceFirst(rep, " ");
                    } else {
                    }
                }

                if (k == p.length()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
