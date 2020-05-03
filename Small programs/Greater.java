public class Greater {
  void myMethod() {
    int a = 23, b = 56, c = 45;
    if ((a > b) & (a > c))
      System.out.println(a + " is greater number.");
    if ((b > a) & (b > c))
      System.out.println(b + " is greater number.");
    if ((c > b) & (c > a))
      System.out.println(c + " is greater number.");
  }
}