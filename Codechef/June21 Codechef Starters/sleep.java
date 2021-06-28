/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class sleep {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = Integer.parseInt(kb.nextLine());
            while (t-- > 0) {
                String st = kb.nextLine();
                String ss[] = st.split(" ");
                int tt = Integer.parseInt(ss[0]);
                int h = Integer.parseInt(ss[1]);
                String s = kb.nextLine();
                int zeros = h;
                for (int i = 0; i < tt; i++) {
                    if (s.charAt(i) == '0') {
                        h -= 1;
                        if (h == 0) {
                            break;
                        }

                    } else {
                        if (zeros != h) {
                            h *= 2;

                        }
                    }
                }
                if (h == 0) {
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
