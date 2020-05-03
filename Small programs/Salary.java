import java.util.Scanner;

public class Salary {
  private String name;
  private String address;
  private long phone;
  private String subject;
  private float monthly_salary;
  private float income_tax;

  public void input_data(String n, long p, String a, String s, float sal) {
    name = n;
    phone = p;
    address = a;
    subject = s;
    monthly_salary = sal;
  }

  public void income_tax() {
    float total_sal;
    total_sal = (monthly_salary * 12);
    if (total_sal > 175000) {
      System.out.println("Income tax charged =" + (total_sal * (5 / 100)));
    } else {
      System.out.println("No Income tax is charged. ");
    }
  }

  void display_data() {
    System.out.println("---------------------------------------------------------");
    System.out.println("name=" + name);
    System.out.println("Address=" + address);
    System.out.println("Phone number =" + phone);
    System.out.println("Subject specialization =" + subject);
    System.out.println("Monthly salary =" + monthly_salary);
  }

  public static void main(String Args[]) {
    Salary ob = new Salary();
    ob.income_tax();
    ob.display_data();
  }
}
