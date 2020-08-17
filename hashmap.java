import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class hashmap {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                b[i] = kb.nextInt();
                map.put(b[i], 0);
            }
            ArrayList<Integer> left = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(a[i])) {
                    map.replace(a[i], map.get(a[i]), map.get(a[i]) + 1);
                } else {
                    left.add(a[i]);
                }
            }
            Collections.sort(left);
            for (int i = 0; i < m; i++) {
                while (map.get(b[i]) > 0) {
                    System.out.println(b[i]);
                    map.replace(b[i], map.get(b[i]), map.get(b[i]) - 1);
                }
            }
            for (int i = 0; i < left.size(); i++) {
                System.out.println(left.get(i));
            }

        }
        kb.close();

    }
}