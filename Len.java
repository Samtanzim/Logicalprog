import java.util.Scanner;
public class Len
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string");
      String str=s.nextLine();
      System.out.println("length of string is");
      int a=str.length();
      System.out.println(a);
    }
    
  }