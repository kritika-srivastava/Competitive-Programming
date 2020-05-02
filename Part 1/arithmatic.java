public class arithmatic
{
int n;
int a=1;
int d=2;
int b=1;
int c=1;
public void input(int nn)
{n=nn;}
void progression()
{System.out.println("The numbers in arithmetic progression are:");
for(int i=1;i<=n;i++)
{
c=(a+(i-1)*d);
System.out.println(c);
}
}
public void factorial()
{
System.out.println("The factorial of "+n+" is ");
for(int i=1;i<=n;i++)
{b=b*i;}
System.out.println(b);
}
public static void main(String Args[])
{arithmatic a1=new arithmatic();
a1.progression();
a1.factorial();
}}