import java.util.Scanner;

public class Arithmetic {
   public static void main(String Args[]) {
      int num1, num2;
      int result = 0;
      char operator;
      Scanner SC = new Scanner(System.in);
      System.out.println("Enter the two numbers:");
      num1 = SC.nextInt();
      num2 = SC.nextInt();
      SC.nextLine();
      System.out.println("Enter  operator + or - or*or/:");
      String tmp = SC.nextLine();
      operator = tmp.charAt(0);
      switch (operator) {
         case '+':
            result = num1 + num2;
            System.out.println("Sum  of  numbers is:" + result);
            break;
         case '-':
            result = num1 - num2;
            System.out.println("Difference of numbers is:" + result);
            break;
         case '*':
            result = num1 * num2;
            System.out.println("Product  of  the numbers is:" + result);
            break;
         case '/':
            result = num1 / num2;
            System.out.println("Remainder of numbers is:" + result);
            break;
         default:
            System.out.println("Invalid input");
            break;
      }
   }
}
