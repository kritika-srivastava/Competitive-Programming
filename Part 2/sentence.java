/*PROGRAM 9
 Write a program to arrange words of sentence in ascending order of their length.
 */
import java.util.Scanner;
public class sentence
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the sentence: ");
String s=kb.nextLine();
int n=s.length();
String a[]=new String[10000];
int b[]=new int[10000];int m=0,f=0;;
for(int i=0;i<n;i++)
{
if(s.charAt(i)==' ')
{a[f]=s.substring(m,i);b[f]=a[f].length();m=i;m++;f++;}
else{}
}
if(s.charAt(n-1)!=' ')
{a[f]=s.substring(m,n);b[f]=a[f].length();}
for(int i=0;i<=f;i++)
{
for(int j=1;j<=f-i-1;j++)
{int tmp=0;String t=" ";
if(b[j]<b[j-1])
{
tmp=b[j];
b[j]=b[j-1];
b[j-1]=tmp;
t=a[j];
a[j]=a[j-1];
a[j-1]=t;
}}}
for(int i=0;i<=f;i++)
{System.out.print(a[i]+" ");}
System.out.println();
}}