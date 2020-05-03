
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ddsffj");
        int n = in.nextInt();
        String nam[] = new String[n];
        int phon[] = new int[n];
        for (int i = 0; i < n; i++) {
            in.nextLine();
            String name = in.next();
            nam[i] = name;
            int phone = in.nextInt();
            phon[i] = phone;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nam[i] + " = " + phon[i]);
        }
        int k = 0, l = 0;
        while (in.hasNext()) {
            k++;
            if ((k >= 1) && (k <= 100000)) {
                in.nextLine();
                String s = in.next();
                System.out.println(s);
                l = -1;
                for (int i = 0; i < n; i++) {
                    if (s.compareTo(nam[i]) == 0) {
                        l = i;
                        System.out.println("$$");
                        break;
                    } else {
                    }
                }
                if (l != -1) {
                    System.out.println(nam[l] + "=" + phon[l]);
                } else {
                    System.out.println("Not found");
                }
            }
        }
        in.close();
    }
}
