class FunctionOverloading {
  double area(double r) {
    return (3.14 * r * r);
  }

  int area(int S) {
    return (S * S);
  }

  double area(double a, double b) {
    return (a * b);
  }

  public static void main(String Args[]) {
    FunctionOverloading OB = new FunctionOverloading();
    double p;
    int q;
    double r;
    p = OB.area(4.5);
    q = OB.area(4);
    r = OB.area(56, 45);
    System.out.println("Area of circle = " + p);
    System.out.println("Area of square = " + q);
    System.out.println("Area of rectangle = " + r);
  }
}