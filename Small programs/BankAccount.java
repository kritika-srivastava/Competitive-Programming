class BankAccount {
  private String DepositorName;
  private long AccountNumber;
  private String AccountType;
  private double BalanceAmount;

  public BankAccount() {
    DepositorName = "";
    AccountNumber = 0;
    AccountType = "";
    BalanceAmount = -1;
  }

  public BankAccount(String dname, long accno, String accType, double BalAmount) {
    DepositorName = dname;
    AccountNumber = accno;
    AccountType = accType;
    BalanceAmount = BalAmount;
  }

  public void initialize(String dname, long accno, String accType, double BalAmount) {
    DepositorName = dname;
    AccountNumber = accno;
    AccountType = accType;
    BalanceAmount = BalAmount;
  }

  public void display() {
    System.out.println("Depositor Name = " + DepositorName);
    System.out.println("Account Number = " + AccountNumber);
    System.out.println("Account Type = " + AccountType);
    System.out.println("Balance Amount = " + BalanceAmount);
  }

  public void deposit(double amount) {
    BalanceAmount += amount;
  }

  public void withdraw(double amount) {
    if (amount <= BalanceAmount)
      BalanceAmount -= amount;
  }

  public static void main(String Args[]) {
    BankAccount acc1 = new BankAccount();
    acc1.initialize("Chetan", 31290, "Saving", 8000);
    BankAccount acc2 = new BankAccount("Ronald", 41777, "Current", 70000);
    acc1.deposit(17000);
    acc1.display();
    acc2.deposit(20000);
    acc2.display();
  }
}