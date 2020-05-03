public class prog13_4 {
  public static void main(String Args[]) {
    float marks[][] = { { 40, 40, 40 }, { 50, 50, 50 }, { 70, 70, 70 }, { 80, 80, 80 }, { 45, 67, 56 }, { 78, 95, 87 },
        { 87, 43, 65 }, { 32, 76, 65 }, { 43, 74, 75 }, { 55, 77, 79 } };
    float total[] = new float[10];
    char grade[] = new char[10];
    float avg;
    int i, j;
    System.out.println("Marks of 10 students are as follows:");
    for (i = 0; i < 10; i++) {
      total[i] = 0;
      for (j = 0; j < 3; j++)
        total[i] += marks[i][j];
      avg = total[i] / 3;
      if (avg < 45.0)
        grade[i] = 'D';
      else if (avg < 60.0)
        grade[i] = 'C';
      else if (avg < 75.00)
        grade[i] = 'B';
      else
        grade[i] = 'A';
    }
    for (i = 0; i < 10; i++) {
      System.out.println("Student " + (i + 1));
      System.out.print("Total Marks = " + total[i]);
      System.out.println("Grade = " + grade[i]);
    }
  }
}
