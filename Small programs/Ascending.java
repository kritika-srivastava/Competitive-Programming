import java.util.Scanner;

public class Ascending

{
  public static void main(String Args[]) {
    Scanner kb = new Scanner(System.in);
    int num;
    System.out.println("Enter the three digit number:");
    num = kb.nextInt();
    int f, m, l;
    l = num % 10;
    f = num / 100;
    m = ((num / 10) - (f * 10));
    if ((f >= m) & (m >= l)) {
      System.out.println("The numbers in ascending order are: " + l + m + f);
    }
    if ((f >= l) & (m <= l)) {
      System.out.println("The numbers in ascending order are: " + m + l + f);
    }
    if ((f <= m) & (f >= l)) {
      System.out.println("The numbers in ascending order are: " + l + f + m);
    }
    if ((m >= l) & (f <= l)) {
      System.out.println("The numbers in ascending order are: " + f + l + m);
    }
    if ((l >= m) & (m >= f)) {
      System.out.println("The numbers in ascending order are: " + f + m + l);
    }
    if ((l >= f) & (m <= f)) {
      System.out.println("The numbers in ascending order are: " + m + f + l);
    }

  }
}
