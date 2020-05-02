import java.util.Scanner;
 class Product
{
 public static void main(String args[])
{
int sum = 0, c, d, k;
Scanner in = new Scanner(System.in);
int first[][] = new int[3][3];
int second[][] = new int[3][3];
int multiply[][] = new int[3][3];
System.out.println("Enter the elements of first matrix");
for ( c = 0 ; c < 3; c++ )
{for ( d = 0 ; d < 3 ; d++ )
{first[c][d] = in.nextInt();}}
System.out.println("Enter the elements of second matrix");
 for ( c = 0 ; c < 3 ; c++ )
 for ( d = 0 ; d < 3 ; d++ )
 {second[c][d] = in.nextInt();}
  for ( c = 0 ; c < 3 ; c++ )
 { for ( d = 0 ; d < 3 ; d++ )
 { for ( k = 0 ; k < 3 ; k++ )
 { sum = sum + first[c][k]*second[k][d];}
 multiply[c][d] = sum;
 sum = 0;}}
 System.out.println("Product of entered matrices:-");
 for ( c = 0 ; c < 3 ; c++ )
 {  for ( d = 0 ; d < 3 ; d++ )
  System.out.print(multiply[c][d]+"\t");
  System.out.print("\n");}
 }}

