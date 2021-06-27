import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        int a[] = new int[t];
        for (int i = 0; i < t; i++) {
            int k = kb.nextInt();
            int max = 0;
            while (k > 0) {
                int x = k % 10;
                if (x > max) {
                    max = x;
                }
                k /= 10;
            }
            a[i] = max;
        }
        Arrays.sort(a);
        int sum = 0;
        int d = kb.nextInt();
        for (int i = 0; i < d; i++) {
            sum += a[a.length - 1 - i];
        }
        System.out.println(sum);

    }
}