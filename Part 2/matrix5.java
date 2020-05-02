import java.util.Scanner;
public class matrix5
{
public int m=0,n=0;
public int a[][], r[],c[];
void input()
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the order of matrix:");
int m=kb.nextInt();
int n=kb.nextInt();
int a[][]=new int[m][n];
int k=0;
System.out.println("Enter the matrix elements:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{a[i][j]=kb.nextInt();}}
System.out.println("The matrix is:");
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{System.out.print(a[i][j]+"\t");}
System.out.println();}
}
 void sum()
{
int r[]=new int[m];
int c[]=new int[n];
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{r[i]+=a[i][j];
c[i]+=a[j][i];
}}
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{System.out.println("Sum of "+(i+1)+" row elements is "+r[i]);
}}
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{System.out.println("Sum of "+(j+1)+" column elements is "+c[i]);
}}
}
 void mirror_image()
{
System.out.println("The mirror image is:");
for(int i=0;i<m;i++)
{for(int j=m-1;j>=0;j--)
{System.out.print(a[i][j]+"\t");}
System.out.println();}
}
 void rotation()
{
System.out.println("The matrix rotated 90 degree clockwise is:");
for(int i=0;i<m;i++)
{for(int j=(m-1);j>=0;j--)
{System.out.print(a[j][i]+"\t");}
System.out.println();}
}
public static void main(String Args[])
{
matrix5 ob=new matrix5();
ob.input();
ob.sum();
ob.mirror_image();
ob.rotation();
}
}
