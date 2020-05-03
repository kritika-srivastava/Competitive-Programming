import java.util.Scanner;

public class Series {
  public static void main(String Args[]) {
    int i, m, n;
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n = kb.nextInt();
    System.out.println("The series is:");
    for (i = 1; i <= n; i++) {
      m = ((i * i) - 1);
      System.out.print(m + " ");
    }
  }
}