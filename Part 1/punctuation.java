import java.util.Scanner;
public class punctuation
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the sentence:");
String a=kb.nextLine();
int l=a.length();
for(int i=0;i<l;i++)
{
if((Character.isLetterOrDigit(a.charAt(i))==false)&(a.charAt(i)!=' '))
{a=a.substring(0,i)+a.substring(i+1,l);l=l-1;i=i-1;}
}
for(int i=l-1;i>=0;i--)
{
System.out.print(a.charAt(i));
}
}
}