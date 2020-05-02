import java.util.Scanner;
public class Alphabet
{
public static void main(String Args[])
{
Scanner kb = new Scanner(System.in);
System.out.println("Enter the sentence");
String a=kb.nextLine();
int n = a.length();
char m[]=new char[n];
char tmp=' ';
for(int i=0;i<n;i++)
{
m[i]=a.charAt(i);
}
for(int i=0;i<n;i++)
{
for(int j=1;j<n;j++)
{
if(m[j-1]>m[j])
{
tmp=m[j-1];
m[j-1]=m[j];
m[j]=tmp;
}}}
System.out.println("Alphabets arranged in ascending order are:");
a=a.replace(a.charAt(3),m[1]);
System.out.print(a);
}}