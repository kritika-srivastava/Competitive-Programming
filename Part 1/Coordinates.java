import java.util.Scanner;
public class Coordinates
{
int x1,x2,x3,y1,y2,y3,m1,m2;
void input()
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the coordinates of pt.1:");
x1=kb.nextInt();
y1=kb.nextInt();
System.out.println("Enter the coordinates of pt.2:");
x2=kb.nextInt();
y2=kb.nextInt();
System.out.println("Enter the ratio m1,m2:");
m1=kb.nextInt();
m2=kb.nextInt();
}
void display()
{
x3=((m1*x2+m2*x1)/(m1+m2));
y3=((m1*y2+m2*y1)/(m1+m2));
System.out.println("The coordinates are ("+x3+","+y3+").");
}
public static void main(String Args[])
{
Coordinates b=new Coordinates();
b.input();
b.display();
}
}

