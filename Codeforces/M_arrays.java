import java.util.*;
public class M_arrays {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt();
            int m=kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            Arrays.sort(a);
            int sum=a[0];
            for(int i=1;i<n;i++)
            {
                if(sum+a[i]%m==0)
                {}
                else{
                    
                }
            {

            }
            }
        }
    }
}
