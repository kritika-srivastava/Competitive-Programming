import java.util.Scanner;

public class Equalize {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String s = kb.nextLine();
        String s2 = kb.nextLine();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s2.charAt(i)) {
            } else if (s.charAt(i) != s2.charAt(i) ) {
                if((i+1<n) && s.charAt(i+1) != s2.charAt(i+1) && s.charAt(i)!=s.charAt(i+1))
                {k++;
                i++;}
                else{
                    k++;
                }
                
            } else if (s.charAt(i) != s2.charAt(i)) {
                k++;
            }

        }
        
        System.out.println(k);
    }
}