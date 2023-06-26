import java.util.Scanner;
public class Sufix
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string1");
      String str=s.nextLine();
      System.out.println("enter the letter to check the ends with");
      System.out.println("the string ends with:" +str.endsWith(s.next()));
     }
  }