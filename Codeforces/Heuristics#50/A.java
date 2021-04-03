import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        Arrays.sort(a);
        int k = kb.nextInt();
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= k) {
                ret = i + 2;
            } else {
                break;
            }
        }
        System.out.println(ret);
    }
}
