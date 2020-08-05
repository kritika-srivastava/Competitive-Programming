import java.util.Scanner;

class Tickets {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int m = kb.nextInt();
    int n = kb.nextInt();
    int a[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = kb.nextInt();
      }
    }
    int k = kb.nextInt();
    int l = 0, x = 0;
    for (int i = 0; i < m; i++) {
      l = 0;
      for (int j = 0; j < n; j++) {
        if (a[i][j] == 0) {
          l++;
          if (l == k) {
            x = i + 1;
            break;
          } else {}
        } else if (a[i][j] == 1) {
          l = 0;
        } else {}
      }
      if (x != 0) {
        break;
      } else {}
    }
    System.out.println(x);
  }
}
