import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int a[] = new int[n];
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, posmi = -1, posma = -1;
            
            String s="";
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
                s+=Integer.toString(a[i]);
                if (a[i] < min) {
                    min = a[i];
                    posmi = i;
                }

                if (a[i] > max) {
                    max = a[i];
                    posma = i;
                }
            }
            int out=Math.min(Math.min(Math.max(posma+1,posmi+1),Math.max(n-posma,n-posmi)),Math.min((posma+n-posmi+1),(posmi+n-posma+1)));
            System.out.println(out);
        }
    }
}