import java.util.Scanner;

public class Pattern8 {
  public static void main(String Args[]) {
    Scanner kb = new Scanner(System.in);
    System.out.println("enter");
    int x = kb.nextInt();
    int i, j;
    for (i = x; i >= 1; i--) {
      System.out.println();
      for (j = 1; j <= i; j++) {
        System.out.print(x + " ");

      }
      x = x - 1;
    }
  }
}
