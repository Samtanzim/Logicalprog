import java.util.*;
public class Fabo
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
      System.out.println("Fabonicc series is:"+num);
      int t1=0;//0
      int t2=1;//1
       int count=0;
      while(count<num)
        {
          System.out.println(t1 + " ");
          int nextTerm=t1+t2;//1
          t1=t2;//0=1
          t2=nextTerm;//1=1
          count++;//2
        }
    }
    }
  