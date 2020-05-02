import java.util.Scanner;
public class Search
{
 int i=0,sh=0,k=0,lb=0,ub=9,p=0;
 int m[]=new int[5];
 void enter()
 {
     Scanner kb=new Scanner (System.in);
     System.out.println("Enter five  elements in ascending order:  ");
   for(i=0;i<5;i++)
   m[i]=kb.nextInt();
 }
 void binary_search()
 {
 Scanner kb=new Scanner (System.in);
 System.out.println("Enter the searching element(Binary search):");  
 sh=kb.nextInt();
  while(lb<=ub)
  {
   p=(lb+ub)/2;
   if(m[p]>sh)
   lb=p+1;
   if(m[p]<sh)
   ub=p-1;
   else
   {k=1;break;}
 }
 if(k==1)
 {System.out.println("element "+ sh+" found.");}
 else{System.out.println("element "+ sh+" not found.");}
 }
 void linear_search()
 { 
   Scanner kb=new Scanner (System.in);
   System.out.println("Enter the number to be searched(Linear Search):");
   sh=kb.nextInt();
  for(i=0;i<5;i++)
  {if(m[i]==sh)
          k=1;
  }
   if(k==1)
  {System.out.println("element "+ sh+" found.");}
  else{System.out.println("element "+ sh+" not found.");}
 }
}
      