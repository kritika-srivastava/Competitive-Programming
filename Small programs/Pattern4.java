public class Pattern4 {
  public static void main(String Args[]) {
    int i, j;
    int num = 5;
    for (i = 1; i <= 5; i++) {
      System.out.println();
      for (j = 1; j <= i; j++)
        System.out.print(num);
      num = num - 1;
    }
  }
}
