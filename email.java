import java.util.Scanner;
public class email
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a email address");
      String str=s.nextLine();
     if(str.endsWith("@gmail.com"))
    {
      System.out.println("Your Email Id "+str+" is valid");
    }
    else
    {
      System.out.println(" your Email Id  is Invalid!!!");
    }
    }
  }