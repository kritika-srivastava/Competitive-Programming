import java.util.Scanner;
public class String_Palindrome
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the string:");
String a=kb.nextLine();
int l=a.length();
double num1=(l/2),num2=0,num=(l%2),num3=0;
num3=num1+num;
int lb=0,ub=l-1;
while(lb<=ub)
{
if(a.charAt(lb)==a.charAt(ub))
{num2++;}
lb++;   ub--;
}
if(num3==num2)
{System.out.println("Palindrome string.");}
else
{System.out.println("Not a Palindrome string.");}
}}