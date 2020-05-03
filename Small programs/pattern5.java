public class pattern5 {
  public static void main(String Args[]) {
    int i, j;

    char m[] = { 'B', 'L', 'U', 'E', 'J' };
    for (i = 4; i >= 0; i--) {
      System.out.println();
      for (j = 0; j <= i; j++) {
        System.out.print(m[j]);
      }
    }
  }
}