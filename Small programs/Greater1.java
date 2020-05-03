import java.util.Scanner;

public class Greater1 {
  public static void main(String Args[]) {
    int a, b, c;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    a = kb.nextInt();
    b = kb.nextInt();
    c = kb.nextInt();
    if ((a > b) & (a > c))
      System.out.println(a + " is greater number.");
    if ((b > a) & (b > c))
      System.out.println(b + " is greater number.");
    if ((c > b) & (c > a))
      System.out.println(c + " is greater number.");
  }
}