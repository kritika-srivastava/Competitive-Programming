import java.io.*;

public class l_search {
  public static void main(String Args[]) throws IOException {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int i, k, sh;
    k = 0;
    i = 0;
    int m[] = new int[5];
    System.out.println("Enter 5 elements:");
    for (i = 0; i < 5; i++) {
      m[i] = Integer.parseInt(in.readLine());
    }
    System.out.println("Enter the number to be searched:");
    sh = Integer.parseInt(in.readLine());
    {
      for (i = 0; i < 5; i++)
        if (m[i] == sh)
          k = 1;
    }
    if (k == 1) {
      System.out.println("The number " + sh + " is present in the array.");
    } else {
      System.out.println("The number " + sh + " is not present in the array.");
    }
  }
}
