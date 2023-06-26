import java.util.Scanner;
public class Trim
  {
    static String t(String str)
    {
      String op=str.trim();
      return op;
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a string");
      String str=s.nextLine();
      String tr=Trim.t(str);
      System.out.println(tr);
    }
  }