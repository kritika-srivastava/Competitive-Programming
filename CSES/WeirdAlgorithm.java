import java.util.Scanner;
/**
 * C:\Users\kriti\Desktop\Competitive-Programming\CSES\WeirdAlgorithm.java
 * @author Kritika Srivastava
 * @since December 14, 2024
 *
 * URL: https://cses.fi/problemset/task/1068
 */
public class WeirdAlgorithm {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        long n=kb.nextLong();
        System.out.println(n);
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else{
                n=n*3+1;
            }
            System.out.println(n);
        }
        
        kb.close();
        
    }

}