import java.util.Scanner;
public class Happy
{
  public static void main(String Args[])
  {
      Scanner kb=new Scanner(System.in);
      System.out.println("Enter the number:");
      int a=kb.nextInt();
      if(a<=9&&a!=1)
      System.out.println("Not a happy number");
      if(a==1)
      System.out.println("Happy Number");
      else
      {
          int sum=a; int n,digit;
          while(sum>9)
          {
              n=sum;sum=0;
              while(n!=0)
              {
                  digit=n%10;
                  sum+=(digit*digit);
                  n=n/10;
                }
            }
       if(sum==1)
       System.out.println("Happy Number");
       else
       System.out.println("Not a happy number");
    }
  }
}
      