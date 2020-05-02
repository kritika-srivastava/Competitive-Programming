/*PROGRAM 28
Caesar Cipher is an encryption technique which is implemented as ROT 13 ('rotate by 13 places'). It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, with the other characters remaining unchanged.
Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher.
Test your program with the sample data and some random data.
 */

import java.util.Scanner;
public class Caesar_Cipher
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);

System.out.println("Enter the sentence:");
String a=kb.nextLine();
int n=a.length();
if((n>3)&(n<100))
{
char s[]=new char[n];
for(int i=0;i<n;i++)
{s[i]=a.charAt(i);}
for(int i=0;i<n;i++)
{int l=0;
int g=(int)s[i];
if((g>=65)&(g<=90))
{
if(g<78)
{l=g+13;s[i]=(char)l;}
if(g>=78)
{l=64+((g+13)-90);s[i]=(char)l;}
}
if((g>=97)&(g<=122))
{
if(g<110)
{l=g+13;s[i]=(char)l;}
if(g>=110)
{l=96+((g+13)-122);s[i]=(char)l;}
}
}
for(int i=0;i<n;i++)
{System.out.print(s[i]);}
}
else
{System.out.println("Invalid Input.");}
}}