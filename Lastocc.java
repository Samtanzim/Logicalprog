import java.util.Scanner;
public class Lastocc
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
      int lastOccurenceIndex=-1;
      for(int i=size-1;i>=0;i--)
        {
          if(arr[i]==target)
        {
          lastOccurenceIndex=i;
          break;
        }
    }
    if(lastOccurenceIndex!=-1)
    {
     System.out.println("last occurance of index is:" +lastOccurenceIndex);
    }
        else
        {
          System.out.println("last occurance not found:");
        }
}
}
  