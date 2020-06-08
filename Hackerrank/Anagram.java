import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean val=true;a=a.toLowerCase();b=b.toLowerCase();
        StringBuilder bb = new StringBuilder(b);
       int k=0;
       if(a.length()!=b.length())
       {return false;}
       else
       {
        for(int i=0;i<a.length();i++)
        {
            if(b.indexOf(a.charAt(i))!=-1)
            {
                
                bb.setCharAt(b.indexOf(a.charAt(i)), '.'); 
                b=bb.toString();
            }
            else
            {
               k++;
            }

        }
        
        if(k!=0){val=false;}
        else{}
        return val;
    }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
