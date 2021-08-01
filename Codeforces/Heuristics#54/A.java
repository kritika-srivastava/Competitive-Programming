import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int mid = kb.nextInt();
            int pra = kb.nextInt();
            int end = kb.nextInt();

            boolean a[] = new boolean[3];
            if (mid > 40) {
                a[0] = true;
            }
            if (pra >= 35) {
                a[1] = true;
            }
            if (end > 60) {
                a[2] = true;
            }

            // System.out.println(a[0]+" "+a[1]+" "+a[2]);
            if (a[0] && a[1] && a[2]) {
                System.out.println("A");
            } else if (a[0] && a[2]) {
                System.out.println("B");
            } else if (a[1] && a[2]) {
                System.out.println("C");
            } else if (a[0] && a[1]) {
                System.out.println("D");
            } else if (a[0] || a[1] || a[2]) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
        }
    }
}
