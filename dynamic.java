import java.util.*;
public class dynamic
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size");
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          System.out.println("enter the elements");
          arr[i]=s.nextInt();
        }
      System.out.println("enter the element");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]);
        }
      System.out.println();
    }
  }