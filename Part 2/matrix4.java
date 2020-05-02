import java.util.Scanner;
public class matrix4
{
public static void main(String Args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the order of matrix:");
int m=kb.nextInt();
int n=kb.nextInt();
if((m>3)&(m<20)&(n>3)&(n<20))
{int a[][]=new int[m][n];int k=0;
int s[]=new int[m*n];
System.out.println("Enter the matrix elements:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{a[i][j]=kb.nextInt();}}
int ma=a[0][0],mi=a[0][0];
System.out.println("The matrix is:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{System.out.print(a[i][j]+"\t");}
System.out.println();}
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{if(a[i][j]>=ma){ma=a[i][j];}
if(a[i][j]<=mi){mi=a[i][j];}
}}
System.out.println("Maximum elements are as follows:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{
if(a[i][j]==ma)
{System.out.println(a[i][j]+" Row="+(i+1)+" Column="+(j+1));}
else{}
}}
System.out.println("Minimum elements are as follows:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{
if(a[i][j]==mi)
{System.out.println(a[i][j]+" Row="+(i+1)+" Column="+(j+1));}
else{}
}}
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{s[k]=a[i][j];k++;}}
for(int i=0;i<m*n;i++)
{for(int j=1;j<m*n;j++)
{if(s[j]<=s[j-1])
{int tmp=s[j];
s[j]=s[j-1];
s[j-1]=tmp;
}}}k=0;
System.out.println("The rearranged matrix is:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{a[i][j]=s[k];k++;
System.out.print(a[i][j]+"\t");}
System.out.println();
}}
else{System.out.println("Invalid input.");};
}}
