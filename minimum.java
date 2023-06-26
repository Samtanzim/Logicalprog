import java.util.Scanner;
public class minimum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("enter the elements");
      for(int i=0;i<5;i++)
        {
         arr[i]=s.nextInt();
        }
      int min=arr[0];
      for(int i=0;i<5;i++)
        {
          if(min>arr[i])
          {
            min=arr[i];
          }
        }
          System.out.println("the minimum number is:" +min);
      int sum=min*arr.length;
      System.out.println("the sum of minimum numbers are:" +sum);
      
    } 
  }