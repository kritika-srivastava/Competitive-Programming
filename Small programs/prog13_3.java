public class prog13_3 {
  public static void main(String Args[]) {
    int i;
    int count = 0;
    int s[] = { 3400, 5000, 10000, 17800, 11500 };
    for (i = 0; i < 5; i++) {
      int a_sal = s[i] * 12;
      if (a_sal > 100000)
        count++;
    }
    System.out.println(count + "out of 5 employees are earning more than Rs 1 lac.");
  }
}