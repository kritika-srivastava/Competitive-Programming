/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class worth {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = kb.nextInt();
            while (t-- > 0) {
                int a = kb.nextInt();
                int b = kb.nextInt();
                int x = kb.nextInt();
                int k=0;
                while(a<b)
                {
                    a+=x;
                    k++;
                }
                System.out.println(k);
                
            }
        } catch (Exception e) {
            return;
        }
    }
}
