package Heu50;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int m=kb.nextInt();
            int n=kb.nextInt();
            long k = 0;
            if(n%2==0)
            {
                k=(n/2-1)*(n/2);
            }
            else
            {
                k=((n-1)*(n-1))/4;
            }
            System.out.println(k);
        }

    }
}
