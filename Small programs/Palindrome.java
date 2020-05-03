import java.util.Scanner;

public class Palindrome {
  public static void main(String Args[]) {
    Scanner kb = new Scanner(System.in);
    int num;
    System.out.println("Enter the 3-digit number:");
    num = kb.nextInt();
    int first, mid, last;
    last = num % 100;
    first = num / 100;
    mid = (num / 10 - (first * 10));
    if ((first == last)) {
      System.out.println(num + " is a palindrome number.");
    } else {
      System.out.println(num + " is not a palindrome number.");
    }
  }
}