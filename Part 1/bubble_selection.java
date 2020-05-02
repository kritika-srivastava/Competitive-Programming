import java.util.Scanner;
public class bubble_selection
{
int i,t,min,j;
int m[]=new int [5];
void insert()
{Scanner kb=new Scanner(System.in);
System.out.println("Enter five numbers:");
for(i=0;i<5;i++)
{m[i]=kb.nextInt();}
}
void bubble()
{
for (i=0;i<5;i++)
{for(j=1;j<=5-i-1;j++)
{if (m[j-1]>m[j])
{t=m[j-1];
m[j-1]=m[j];
m[j]=t;
}}}
System.out.println("The numbers arranged in ascending order (bubble sort)are:");
for(i=0;i<5;i++)
{System.out.println(m[i]);}
}
void selection()
{
for (i=0;i<5;i++)
{min=i;
for(j=i+1;j<5;j++)
{if (m[j]<m[min])
min=j;
}
t=m[i];
m[i]=m[min];
m[min]=t;
}
System.out.println("The numbers arranged in ascending order(selection sort) are:");
for(i=0;i<5;i++)
{System.out.println(m[i]);}
}}
