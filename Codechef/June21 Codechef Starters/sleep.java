/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;




// DID NOT WORK
// WILL CORRECT TOMORROW





/* Name of the class has to be "Main" only if the class is public. */
class sleep {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = Integer.parseInt(kb.nextLine());
            while (t-- > 0) {
                String st = kb.nextLine();
                String ss[] = st.split(" ");
                int tt = Integer.parseInt(ss[0]);
                long h = Long.parseLong(ss[1]);
                String s = kb.nextLine();
                int zeros = 0;
                for (int i = 0; i < tt; i++) {
                    if ( s.charAt(i) == '1' && zeros != 0) {
                        h *=2;
                        //System.out.println("H="+h);
                        zeros = 0;
                    } else if ( s.charAt(i) == '0') {
                        h-=1;
                        zeros+=1;
                    } else {
                    }
                }
                h-=zeros;
                if (h <= 0) {
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
