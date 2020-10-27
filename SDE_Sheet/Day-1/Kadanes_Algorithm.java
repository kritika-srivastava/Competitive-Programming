
/**
 * C:\Users\kriti\Desktop\SDE Problems\Day 1\Kadanes_Algorithm.java
 * @author Kritika Srivastava
 * @since October 27, 2020
 *
 * Kadane's Algorithm for maximum contiguous array sum
 */
import java.util.Scanner;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int max = a[0], sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if(sum>max)
            {max=sum;}
            else{}
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(max);
        kb.close();
    }

}
