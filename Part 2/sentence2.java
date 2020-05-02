/*PROGRAM 10
 Write a program to remove all the punctuation marks and print the sentence with reversed words.
 */
import java.util.Scanner;
public class sentence2
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the sentence: ");
String s=kb.nextLine();
int n=s.length();
String a[]=new String[10000];
int m=0,f=0;
for(int i=0;i<n;i++)
{
if((Character.isLetterOrDigit(s.charAt(i))==false)&(s.charAt(i)!=' '))
{s=s.substring(0,i)+s.substring(i+1);n--;i--;}
else{}
}
for(int i=0;i<n;i++)
{
if(s.charAt(i)==' ')
{a[f]=s.substring(m,i);m=i;m++;f++;}
else{}
}
if(s.charAt(n-1)!=' ')
{a[f]=s.substring(m,n);}
else{}
for(int i=0;i<=f;i++)
{if(a[i]!=null){
StringBuffer ab=new StringBuffer(a[i]);
ab.reverse();
System.out.print(ab+" ");}
else{}
}}}