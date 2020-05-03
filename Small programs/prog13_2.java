public class prog13_2 {
  public static void main(String Args[]) {
    int total = 0;
    float avg = 0;
    int i;
    int sales[] = { 120, 644, 445, 47, 87, 43, 323 };
    System.out.println("Sales of a week are:");
    for (i = 0; i < 7; i++) {
      System.out.print(sales[i] + " ");
      total += sales[i];
    }
    avg = total / 5;
    System.out.println();
    System.out.println("Total sales :" + total);
    System.out.println("Average sales:" + avg);
  }
}