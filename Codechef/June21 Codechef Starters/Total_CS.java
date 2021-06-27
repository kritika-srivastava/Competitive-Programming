/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Total_CS {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int t = Integer.parseInt(kb.nextLine());
            while (t-- > 0) {
                int n = Integer.parseInt(kb.nextLine());
                HashMap<String, Integer> map = new HashMap<>();
                for (int i = 0; i < 3 * n; i++) {
                    String s = kb.nextLine();
                    String st[] = s.split(" ");
                    s = st[0];
                    int val = Integer.parseInt(st[1]);

                    if (!map.containsKey(s)) {
                        map.put(s, val);
                    } else {
                        map.put(s, map.get(s) + val);
                    }
                }
                int a[] = new int[map.size()];
                int x = 0;
                for (Map.Entry<String, Integer> en : map.entrySet()) {
                    a[x] = en.getValue();
                    x++;
                }
                Arrays.sort(a);
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();

            }
        } catch (Exception e) {
            return;
        }
    }
}
