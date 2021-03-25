/**
 * /mnt/e/#Fod Do/Codeforces/Phoenix_and_Beauty.java
 * @author Kritika Srivastava
 * @since March 25, 2021
 *
 * Link - https://codeforces.com/problemset/problem/1348/B
 */
import java.util.*;

public class Phoenix_and_Beauty {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int t=kb.nextInt();
        while(t-->0)
        {
            int n=kb.nextInt();
            int k=kb.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++)
            {
                a[i]=kb.nextInt();
            }
            List<Integer> l = Arrays.asList(a);
            Set<Integer> set = new HashSet<>(l);
            if (set.size()>k){
                System.out.println(-1);
            }
            else{
                System.out.println(n*k);
                for (int i=0;i<n;i++){
                    for (int temp:set)
                        System.out.print(temp+" ");
                    for (int j=0;j<k-(int)set.size();j++)
                        System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
}
