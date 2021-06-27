import java.util.LinkedList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        while (t-- > 0) {
            int n = (26 * 27) / 2;
            String s = kb.nextLine();
            LinkedList<Character> l = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if (!l.contains(s.charAt(i))) {
                    l.add(s.charAt(i));
                    n = n - s.charAt(i) + 'a' - 1;
                    // System.out.println(s.charAt(i) 'a' + 1);
                } else {

                }
            }
            boolean flag = false;
            // System.out.println(n);
            if (n % 3 == 0) {
                flag = true;
            } else {
                while (n > 0) {
                    int x = n % 10;
                    if (x == 3) {
                        flag = true;
                        break;
                    }
                    n /= 10;
                }
            }

            if (flag == true) {
                System.out.println("yummy");
            } else {
                System.out.println("not yummy");
            }

        }
    }
}