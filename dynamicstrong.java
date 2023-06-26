import java.util.Scanner;
public class dynamicstrong
  {
    public static void main(String args[])
    {
      //int n=100000;//range na specify madthidhivi
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int n=s.nextInt();
      System.out.println("strong number between 1 to n:");
      for(int num=1;num<=n;num++)//num=1,1<=100000
        {
          int on=num;
          int sum=0;
          int tempnum=num;
          while(tempnum>0)//100000>0
            {
              int dig=tempnum%10;//100000%10=10000
              int fact=1;
              for(int i=2;i<=dig;i++)//2<=10000
                {
                  fact*=i;//1*2=2
                }
              sum+=fact;
              tempnum/=10;
            }
          if(sum==on)
          {
            System.out.println(on);
          }
        }
    }
  }