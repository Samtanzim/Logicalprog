import java.util.Scanner;
public class Perfectnum
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter a number");
      int n=s.nextInt();
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            sum=sum+i;
          }
       }
          if(sum==n)
          {
            System.out.println("the number is perfect:" +n);
          }
          else
          {
            System.out.println("the number is not perfect:" +n);
          }
          }
        }
    
  