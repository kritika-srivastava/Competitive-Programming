
/*PROGRAM 19
 Write a program to implement stack using switch-case.
 */
import java.util.*;

public class Stack {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter capacity of stack.");
    int cap = sc.nextInt();
    int top = 0, i = 1;
    int a[] = new int[cap];
    while (i != 0) {
      System.out.println("Enter 1 to insert element.");
      System.out.println("Enter 2 to pop element.");
      System.out.println("Enter 3 to display element(s).");
      System.out.println("Press 0 to exit.");
      System.out.println("Enter your choice.");
      i = sc.nextInt();
      switch (i) {
        case 1:
          if (top == cap)
            System.out.println("Stack overflow.");
          else {
            System.out.println("Enter element.");
            a[top++] = sc.nextInt();
          }
          System.out.println();
          break;
        case 2:
          if (top == 0)
            System.out.println("Stack underflow.");
          else {
            System.out.println("Popped element is " + a[--top]);
          }
          System.out.println();
          break;
        case 3:
          System.out.println("The elements of stack are ");
          for (int j = 0; j < top; j++)
            System.out.print(a[j] + "");
          System.out.println("");
      }
    }
  }
}
