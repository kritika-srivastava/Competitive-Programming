import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        int b = kb.nextInt() - 1;
        int c = kb.nextInt() - 1;
        int n = kb.nextInt();
        int m[] = new int[n];
        int ret = 0;
        for (int i = 0; i < n; i++) {
            m[i] = kb.nextInt();
            if (i > b && i < c) {
                ret += m[i];
            }
        }
        System.out.println(ret);
    }
}
