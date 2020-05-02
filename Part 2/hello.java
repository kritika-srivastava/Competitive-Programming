/*PROGRAM 20
Write a program to implement multiple inheritance.
 */
import java.util.Scanner;
interface X
{
 double ht=6.8;
 void display();
}
interface Y
{
 double ht=5.2;
 void display();
}
class xyz implements X,Y
{
public void display()
{
double ht=(X.ht+Y.ht)/2;
System.out.println(ht);
}}
public class hello
{
public static void main(String Args[])
{
xyz ob=new xyz();
ob.display();
}
}  
