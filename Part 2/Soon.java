import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Soon {



    public static void main(String Args[])
    {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        if((n>=1)&&(n<=5))
        {
            int a[][]=new int[n][n];int k=0,sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {a[i][j]=kb.nextInt();
                if((a[i][j]>=-9)&&(a[i][j]<=9)){k++;}
                }
            }
            if(k==(n*n))
            {
            if(n<=2){System.out.println("0");}
            
            else {
                for(int i=0;i<n-2;i++)
            {
                for(int j=0;j<n-2;j++)
                {
                    int s=a[i][j+1]+a[i][j]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    if(s>sum){sum=s;}
                }

             }
             System.out.println(sum);
          }

    }
}
}
}
