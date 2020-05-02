import java.util.Scanner;
public class Deletion_Insertion
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the number of array elements:");
int n=kb.nextInt();
int a[]=new int[n+1];int k=n;
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++)
{a[i]=kb.nextInt();}
System.out.println("Enter the position of the element to be deleted:");
int p=kb.nextInt();
if(p>n)
{System.out.println("Invalid Input");}
else
{a[p-1]=0;
for(int i=p-1;i<n;i++)
{a[i]=a[i+1];}
}
n-=1;
System.out.println("Enter the position of the element to be entered:");
 p=kb.nextInt();
if(p>n)
{System.out.println("Invalid Input");}
else
{for(int i=n-1;i>=p-1;i--)
{a[i+1]=a[i];}
System.out.println("Enter the number:");
int num=kb.nextInt();
a[p-1]=num;
System.out.println("The new array is:");
for(int i=0;i<n+1;i++)
{System.out.println(a[i]);
}}}}
