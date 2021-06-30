import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i];                
            }
            if(sum%n!=0)
            {
                System.out.println("-1");
            }
            else{
                int k=0;
                for (int i = 0; i < n; i++) {
                    if(a[i]>sum/n)
                    {
                        k++;
                    }
                }
                System.out.println(k);
            }
            
        }
    }
}