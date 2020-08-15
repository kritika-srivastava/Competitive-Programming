import java.util.Scanner;
import java.util.*;

public class Split {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String b = kb.nextLine();
        String[] aa = a.split(",");
        for (int i = 0; i < aa.length; i++) {
            char[] A = aa[i].toCharArray();
            Arrays.sort(A);
            aa[i] = new String(A);
        }
        String[] bb = b.split(",");
        for (int i = 0; i < bb.length; i++) {
            char[] A = bb[i].toCharArray();
            Arrays.sort(A);
            bb[i] = String.valueOf(A);
        }

        int c[] = new int[bb.length];
        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if (count(aa[j]) < count(bb[i])) {
                    c[i]++;
                } else {
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    static int count(String a) {
        int k = 0;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(0)) {
                k++;
            } else {
            break;
            }
        }
        return k;
    }
}
