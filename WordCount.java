import java.util.Scanner;
public class WordCount
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a string");
      String str=s.nextLine();
      int wordCount=WordCount.countWords(str );
System.out.println("number of words:" +wordCount); 
    }
static int countWords(String str)
  {
  String[] words=str.trim().split(" ");
  return words.length;
  }
  }