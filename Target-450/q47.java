/**
 * C:\Users\kriti\Desktop\DS\Target 450\q47.java
 * @author Kritika Srivastava
 * @since January 17, 2021
 *
 * Reverse a String (In-place)
 * Link - https://leetcode.com/problems/reverse-string/
 */
import java.util.Scanner;

public class q47 {
    
        static void reverseString(char[] s) {
            int i=0,j=0;
            for( i=s.length-1,j=0;j<=i;i--,j++)
            {
                char tmp=s[j];
                s[j]=s[i];
                s[i]=tmp;
            }   
        }
        public static void main(String[] args) {
            Scanner kb=new Scanner(System.in);
            String s=kb.next();
            char m[]=s.toCharArray();
            reverseString(m);
            String rev=new String(m);
            System.out.println(rev);

        }
}
