import java.util.Scanner;

public class Armstrong

{
  public static void main(String Args[]) {
    Scanner kb = new Scanner(System.in);
    int num;
    System.out.println("Enter the 3-digit number:");
    num = kb.nextInt();
    int f, m, l;
    l = num % 10;
    f = num / 100;
    m = ((num / 10) - (f * 10));
    if ((f * f * f) + (m * m * m) + (l * l * l) == Math.pow(f * m * l, 3)) {
      System.out.println("The given number is an armstrong.");
    } else {
      System.out.println("The given number is not an armstrong.");
    }
  }
}
