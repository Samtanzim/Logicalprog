import java.util.Scanner;
public class Concatt
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string1");
      String str1=s.nextLine();
      System.out.println("enter string2");
      String str2=s.nextLine();
      String concatenate=str1.concat(" ").concat(str2);
      System.out.println("string is:" + concatenate);
    }
  }