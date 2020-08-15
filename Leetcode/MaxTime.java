import java.util.Scanner;

public class MaxTime {
    public static void main(String Args[]) {
        Scanner kb = new Scanner(System.in);
        String t = kb.nextLine();
        String h[] = t.split(":");

        if (h[0].charAt(0) == '?' && h[0].charAt(1) == '?') {
            h[0] = "23";
        } else {
            if (h[0].charAt(0) == '?') {
                if (h[0].charAt(1) < 4) {
                    h[0] = h[0].replace('?', '2');
                } else {
                    h[0] = h[0].replace('?', '1');
                }
            }
            if (h[0].charAt(1) == '?') {
                if (h[0].charAt(0) == '2') {
                    h[0] = h[0].replace('?', '3');
                } else {
                    h[0] = h[0].replace('?', '9');
                }
            }
        }

        if (h[1].charAt(0) == '?' && h[1].charAt(1) == '?') {
            h[1] = "59";
        } else {
            if (h[1].charAt(0) == '?') {
                h[1] = h[1].replace('?', '5');
            }
            if (h[1].charAt(1) == '?') {
                h[1] = h[1].replace('?', '9');
            } else {
            }
        }
        String out = h[0] + ":" + h[1];
        System.out.println(out);
        kb.close();
    }
}
