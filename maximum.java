import java.util.Scanner;
public class maximum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int arr[]=new int[2];
      System.out.println("enter the elements");
      for(int i=0;i<2;i++)
        {
         arr[i]=s.nextInt();
        }
      int max=arr[0];
      for(int i=0;i<2;i++)
        {
          if(max<arr[i])
          {
            max=arr[i];
          }
        }
          System.out.println("the maximum number is:" +max);
      int sum=max*arr.length;
      System.out.println("the sum of minimum numbers are:" +sum);
     }
  }