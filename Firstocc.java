import java.util.Scanner;
public class Firstocc
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size");
      int size=s.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=s.nextInt();
        }
      System.out.println("enter the target address");
      int target=s.nextInt();
      int firstOccurenceIndex=-1;
      for(int i=0;i<size;i++)
        {
          if(arr[i]==target)
          {
            firstOccurenceIndex=i;
            break;
          }
        }
      if(firstOccurenceIndex!=-1)
      {
        System.out.println("first occurence:" +firstOccurenceIndex);
      }
      else
      {
        System.out.println("first occurence is not found");
      }
    }
  }