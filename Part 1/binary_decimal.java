import java.util.Scanner;
public class binary_decimal
{
public void binary()
{
int a,n,dig=0,m=1;
Scanner kb=new Scanner(System.in);
System.out.println("Enter the decimal number:");
a=kb.nextInt();
do
{n=a%2;
dig+=n*m;
m=m*10;
a=a/2;}
while(a!=0);
System.out.println("The number in binary is:");
System.out.println(dig);}
public void decimal()
{int a,n=0,dig=0,m=0,x=0;
Scanner kb=new Scanner(System.in);
System.out.println("Enter the binary number:");
a=kb.nextInt();
while(a!=0)
{x=a%2;n+=(x*Math.pow(2,m));
m+=1;a/=10;}
System.out.println("The number in decimal is:");
System.out.println(n);}
public static void main(String Args[])
{
binary_decimal o=new binary_decimal();
o.binary();
o.decimal();
}}