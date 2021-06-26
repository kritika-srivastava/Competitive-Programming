/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class html {
    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner kb = new Scanner(System.in)) {
            int t = Integer.parseInt(kb.nextLine());
            while (t-- > 0) {
                String a = kb.nextLine();
                boolean flag = true;
                if (!a.startsWith("</")) {
                    flag = false;
                }
                if (!a.endsWith(">")) {
                    flag = false;
                }

                for (int i = 2; i < a.length() - 1; i++) {
                    if (Character.isLowerCase(a.charAt(i)) || Character.isDigit(a.charAt(i))) {

                    } else {
                        flag = false;
                    }
                }

                if (flag == false || a.length()<=3) {
                    System.out.println("Error");
                } else {
                    System.out.println("Success");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}
