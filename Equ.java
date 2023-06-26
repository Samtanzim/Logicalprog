import java.util.Scanner;
public class Equ
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string1");
      String str1=s.nextLine();
      System.out.println("enter the String2");
      String str2=s.nextLine();
      if(str1.equalsIgnoreCase(str2))
      {
        System.out.println("String is equal");
      }
      else
      {
        System.out.println("String is not equal");
      }
    }
  }