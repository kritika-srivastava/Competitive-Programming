public class prog13_1 {
    public static void main(String Args[]) {
        int total = 0;
        double average = 0;
        int i;
        int marks[] = { 12, 56, 89, 45, 57 };
        System.out.println("Marks in 5 Subjects are:");
        for (i = 0; i < 5; i++) {
            System.out.print(marks[i] + "  ");
            total += marks[i];
        }
        average = total / 5;
        System.out.println();
        System.out.println("Total marks are:" + total);
        System.out.println("Average marks are:" + average);
    }
}