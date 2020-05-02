import java.util.Scanner;
public class Diagonal
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];
System.out.println("Enter the first matrix elements:");
for(int i=0;i<3;i++)
{for (int j=0;j<3;j++)
{a[i][j]=kb.nextInt();}}
System.out.println("left diagonal elements:");
for(int i=0;i<3;i++)
{for (int j=0;j<3;j++)
{if(i==j)
System.out.print(a[i][j]);
else System.out.print(" ");}System.out.println();}
System.out.println("right diagonal elements:");
for(int i=0;i<3;i++)
{for (int j=0;j<3;j++)
{if(i+j==2)
System.out.print(a[i][j]);
else System.out.print(" ");}System.out.println();}
}
}
