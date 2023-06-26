import java.util.*;
public class url
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the url");
      String str=s.nextLine();
      if(str.startsWith("http://") || (str.startsWith("https://")))
    {
      if(str.contains(".com"))
      {
        System.out.println("Entered URL "+str+" is valid");
      }
      else
      {
        System.out.println(" URL is Invalid");
      }
    }
      else
      {
        System.out.println(" URL is Invalid");
      }

    }
  }