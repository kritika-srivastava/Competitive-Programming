/*PROGRAM 1
 Write a program to enter a number and check if it is circular prime or not.
 */
import java.util.Scanner;
public class Circular_Prime
{
static boolean Prime(int aa)
{
int a=aa;int mid=a/2,k=0;
for(int i=2;i<mid;i++)
{
if(a%i==0){k++;}
else{}
}
if(k==0)
{return true;}
else{return false;}
}
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the number:");
int x=0,y=0,a=1;
int n=kb.nextInt();
if(Prime(n)==true)
{
int nn=n;
while(nn!=0)
{
nn/=10;x++;}
for(int i=1;i<x;i++)
{a*=10;}
for(int i=0;i<x;i++)
{
n=(((n%a)*10)+(n/a));
if(Prime(n)==true){y++;}
else{}
}
if(x==y)
{System.out.println("Circular Prime number.");}
else
{System.out.println("Not a Circular Prime number.");}
}
else
{System.out.println("Entered number is not prime.");}
}
}