import java.util.Scanner;
public class Posneg1
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size");
      int size=s.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the number");
      for(int i=0;i<size;i++)
        {
        arr[i]=s.nextInt();
        }
      for(int i=0;i<size;i++)
        {
        if(arr[i]>=0)
      {
        System.out.println("number is positive:" +arr[i]);
      }
      else
      {
        System.out.println("number is negative:" +arr[i]);
      }
      }
    } 
  }
    
  