import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        boolean flag = true;
        if (s.length() <= 2) {
            System.out.println("YES");
        } else {

            for (int i = 2; i < s.length(); i++) {
                int a = (int) (s.charAt(i) - 'A' + 1);
                int b = (int) (s.charAt(i - 1) - 'A' + 1);
                int c = (int) (s.charAt(i - 2) - 'A' + 1);
                // System.out.println(a+" "+b+" "+c);
                int z = b + c;
                if (b + c > 26) {
                    z -= 26;
                } else {
                }
                if ((z - 1) != a) {
                    flag = false;
                    break;
                } else {
                }
            }

            if (flag == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}