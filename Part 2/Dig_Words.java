/*PROGRAM 24
 Write a program to enter a paragraph and print the number of tokens and sentences in paragraph.
 */

import java.util.*; 
public class Dig_Words
{ 
    static String m[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven"}; 
    static String p[]={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty","Hundred"}; 
    public static String OneDg(String a) 
    {   int k=0;   String st=""; 
        for(int i=0;i<10;i++) 
        {   if(i==Integer.parseInt(a)) 
                st=m[k]; 
            k++; 
        } 
        return st; 
    } 
    public static String TwoDg(String a) 
    {   int k=2;   String st=""; 
        char x=a.charAt(0),y=a.charAt(1); 
        while(a.charAt(0)=='0') 
            a=a.substring(1,a.length()); 
        if(a.length()==1) 
            st=OneDg(a); 
        else if(a.equals("11")) 
            st=m[11]; 
        else if(a.equals("10")) 
            st=m[10]; 
        else if(a.equals("12")) 
            st=p[0].substring(0,3)+""+"lve"; 
        else if(y=='0') 
            for(int i=50;i<=57;i++) 
            {   if(x==(char)i) 
                    return p[k-2]; 
                k++; 
            } 
        else if(x>='2' && x<='9') 
            st=p[Integer.parseInt(x+"")-2]+" "+m[Integer.parseInt(y+"")]; 
        else if(x>='1' && (y>='3'&& y<='9')) 
        {   for(int i=50;i<=57;i++) 
            {   if(y==(char)i) 
                    st=p[k-2].substring(0,p[k-2].length()-2)+"teen"; 
                k++; 
            }} 
        return st; 
    } 
    public static String ThreeDg(String a) 
    {   char b=a.charAt(1),c=a.charAt(2); 
        String st="";     int k=1; 
        if(b=='0' && c=='0') 
            st=st+OneDg(a.charAt(0)+"")+" "+p[8]; 
        else 
            st=st+OneDg(a.charAt(0)+"")+" "+p[8]+" and "+TwoDg(a.substring(1,3)); 
        return st; 
    } 
    public static void main(String args[]) 
    {   String n,q="";       int k=0; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a number less than 1000"); 
        n=sc.nextLine(); 
        if(n.equals("0")) 
            q=OneDg(n); 
        else 
            while(n.charAt(0)=='0') 
                n=n.substring(1,n.length()); 
        int l=n.length(); 
        if(l==1) 
            q=OneDg(n); 
        else if(l==2) 
            q=TwoDg(n); 
        else if(l==3) 
            q=ThreeDg(n); 
        else if(l>3) 
            System.out.println("Out of Range."); 
        System.out.println(q); 
    } 
} 
