/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class falsenum {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner kb = new Scanner(System.in)) {
            int t = Integer.parseInt(kb.nextLine());
            while (t-- > 0) {
                String a = kb.nextLine();
                if (a.charAt(0) == '1') {
                    a = "10"+a.substring(1);
                    System.out.println(a);

                } else {
                    
                    System.out.println("1"+a);
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
