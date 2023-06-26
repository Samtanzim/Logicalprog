import java.util.Scanner;
public class Low
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a string");
      String str=s.nextLine();
      System.out.println(str.toLowerCase());
    }
  }