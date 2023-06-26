public class Strong
  {
    public static void main(String args[])
    {
      int n=40585;
      int on=n;
      int sumOfFactorial=0;
      while(n>0)
        {
          int dig=n%10;
          int fact=1;
          for(int i=2;i<=dig;i++)
            {
              fact*=i;
            }
          sumOfFactorial+=fact;
          n/=10;
        }
      if(sumOfFactorial==on)
      {
        System.out.println("the number is strong:" +on);
      }
      else
      {
        System.out.println("the number is not strong:" +on);
      }
    }
  }

