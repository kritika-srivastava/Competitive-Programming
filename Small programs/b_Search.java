import java.util.Scanner;

public class b_Search {
  public static void main(String Args[]) {
    Scanner kb = new Scanner(System.in);
    int i, lb, ub, p, k, sh;
    i = 0;
    sh = 0;
    k = 0;
    lb = 0;
    ub = 9;
    p = 0;
    int m[] = new int[10];
    System.out.println("Enter ten  elements in ascending order:  ");
    for (i = 0; i <= 10; i++)
      i = kb.nextInt();
    System.out.println("Enter the searching element:");
    sh = kb.nextInt();
    while (lb <= ub) {
      p = (lb + ub) / 2;
      if (m[p] > sh)
        lb = p + 1;
      if (m[p] < sh)
        ub = p - 1;
      else {
        k = 1;
        break;
      }
    }
    if (k == 1) {
      System.out.println("element " + sh + " found.");
    } else {
      System.out.println("element " + sh + " not found.");
    }
  }
}
