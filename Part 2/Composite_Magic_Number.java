/*PROGRAM 2
 Write a program to enter two numbers m and n(m<n) and print composite magic numbers between them.
 */
import java.util.Scanner;
public class Composite_Magic_Number
{
static boolean Composite(int aa)
{
int a=aa;int mid=a/2,k=0;
for(int i=2;i<mid;i++)
{
if(a%i==0){k++;}
else{}
}
if(k!=0)
{return true;}
else{return false;}
}
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the numbers:");
int m=kb.nextInt();
int n=kb.nextInt();
int sum=0,f=0;
if(m<n)
{System.out.println("Composite magic numbers are as follows:");
for(int i=m;i<=n;i++)
{
if(Composite(i)==true)
{
sum=i;
while(sum>=10)
{
int k=sum;sum=0;
while(k!=0)
{sum+=k%10;
k=k/10;
}}
if(sum==1)
{System.out.println(i);f++;}
else{}
}
else{}
}}
else
{System.out.println("Invalid input.");}
System.out.println("Frequency = "+f);
}
}