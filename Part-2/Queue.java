/*PROGRAM 21
 Write a program to implement queue using switch-case.
 */

import java.util.*;

public class Queue {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter capacity of queue.");
    int cap = sc.nextInt();
    int top = 0, end = 0, i = 1;
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
          if (end == cap)
            System.out.println("Queue overflow.");
          else {
            System.out.println("Enter element.");
            a[end++] = sc.nextInt();
          }
          System.out.println();
          break;
        case 2:
          if (top == end)
            System.out.println("Queue underflow.");
          else {
            System.out.println("Popped element is " + a[top++]);
          }
          System.out.println();
          break;
        case 3:
          System.out.println("The elements of queue are ");
          for (int j = 0; j < end; j++)
            System.out.print(a[j] + "");
          System.out.println("");
      }
    }
  }
}