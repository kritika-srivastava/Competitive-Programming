class Recursive {
  int fact(int n) {
    if (n == 0)
      return (1);
    else
      return (n * fact(n - 1));
  }

  public static void main(String Args[]) {
    int K = 8, F;
    Recursive OB = new Recursive();
    F = OB.fact(K);
    System.out.println("Fact. of " + K + " is " + F);
  }
}
